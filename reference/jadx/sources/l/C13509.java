package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71K9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13509 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static String f44612;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String f44613;

    /* JADX INFO: renamed from: ᩹᩺ᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f44614 = {4102, -223, -12585, -6336, -6545, -14589, -3918, -15276, -15804, -16093, -6809, -5030, 6573, -14809, 5863, -15054, -8023, 3313, -15167, -890, 1753, -5927, -14928, -13789, -548, 1244, -29748, -17426, -21183, -24058, -19023, -25753, -11223, -11223, -11165, -11166, -11137, 8481, -16869, -16876, -16879, -16872, -16880, -16878, -16871, -16872, -16878, -16883, -16887, -16874, -16872, -16872, -16883, -16836, -16883, -16874, -16850, -16876, -16870, -16833, -16879, -16878, -16866, -16874, 7932, -5554, 11939, -6660, -6911, -3602, 1171, -5382, -3093, 5427, 946, 433, 12707, 5103, 11289, -6206, -13270, -17409, -17417, -17418, 10499, 13445, -5726, -15853, -5640, 14377, 10670, -2936, -14519, 14997, -5281, 12547, 13083, -14880, -2999, 9952, 26430, 26428, 26424, 26424, 26424, 26425, 4662, -2376, 14504, -1002, 13975, 15153, -12185, 12687, -5323, -2070, 9259, 15556, -3376};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f44615;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EditText f44616;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f44617;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f44618;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11545 f44619;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f44620;

    /* JADX WARN: Code duplicated, block: B:35:0x0129 A[PHI: r2
      0x0129: PHI (r2v3 int) = (r2v1 int), (r2v2 int), (r2v1 int) binds: [B:34:0x0123, B:27:0x00e8, B:24:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01a5 A[PHI: r1
      0x01a5: PHI (r1v2 short) = (r1v1 short), (r1v1 short), (r1v3 short) binds: [B:51:0x01a3, B:24:0x00de, B:16:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01c8 A[PHI: r3 r4 r8 r9 r10 r11 r16 r17
      0x01c8: PHI (r3v3 int) = (r3v1 int), (r3v1 int), (r3v1 int), (r3v2 int), (r3v1 int), (r3v1 int) binds: [B:56:0x01c6, B:47:0x0189, B:43:0x016c, B:31:0x010a, B:20:0x00c1, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v2 int), (r4v1 int), (r4v1 int) binds: [B:56:0x01c6, B:47:0x0189, B:43:0x016c, B:31:0x010a, B:20:0x00c1, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:56:0x01c6, B:47:0x0189, B:43:0x016c, B:31:0x010a, B:20:0x00c1, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r9v2 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v1 short[]), (r9v1 short[]), (r9v1 short[]), (r9v3 short[]) binds: [B:56:0x01c6, B:47:0x0189, B:43:0x016c, B:31:0x010a, B:20:0x00c1, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v3 int) binds: [B:56:0x01c6, B:47:0x0189, B:43:0x016c, B:31:0x010a, B:20:0x00c1, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r11v3 int) = (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:56:0x01c6, B:47:0x0189, B:43:0x016c, B:31:0x010a, B:20:0x00c1, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r16v3 char) = (r16v1 char), (r16v1 char), (r16v2 char), (r16v1 char), (r16v1 char), (r16v1 char) binds: [B:56:0x01c6, B:47:0x0189, B:43:0x016c, B:31:0x010a, B:20:0x00c1, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r17v5 short[]) = (r17v3 short[]), (r17v3 short[]), (r17v4 short[]), (r17v3 short[]), (r17v3 short[]), (r17v3 short[]) binds: [B:56:0x01c6, B:47:0x0189, B:43:0x016c, B:31:0x010a, B:20:0x00c1, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x0217 A[PHI: r6 r7
      0x0217: PHI (r6v2 short[]) = (r6v1 short[]), (r6v1 short[]), (r6v3 short[]) binds: [B:63:0x0215, B:60:0x01fb, B:39:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r7v2 int) = (r7v1 int), (r7v1 int), (r7v3 int) binds: [B:63:0x0215, B:60:0x01fb, B:39:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM11306;
        int i;
        int i2;
        int i3;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = -321169489;
        int i13 = C1148.f5161;
        int i14 = ThreadFactoryC3888.f14547;
        int iM11307 = ThreadFactoryC3888.m11306("᩹ܰ") ^ i14;
        int i15 = ((iM11307 ^ i13) * (-6377)) ^ (-1900624273);
        int i16 = iM11307 ^ 391103993;
        short[] sArr3 = null;
        char c = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * 23135) >> 31));
            switch (i12) {
                case -2046365739:
                case -72935007:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i14 - C19806.m45029("ܽ᩸")) * 91;
                        i = ((iM11306 ^ i13) * (-14063)) ^ (-1870554610);
                        i2 = -1389501034;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩺") ^ i14;
                        i = ((iM11306 ^ i13) * 19529) ^ (-947357274);
                        i2 = 995479898;
                    }
                    int i17 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i17;
                    break;
                case -1933577391:
                case -1632507168:
                    C7105.m18985();
                    if (RunnableC0195.f1321 < 0) {
                        iM11306 = (C19806.m45029("۟֨") + i14) * 115;
                        i = ((iM11306 ^ i13) * 24669) ^ 1472350960;
                        i2 = -1988291151;
                    } else {
                        iM11306 = (i14 - C19806.m45029("ܽ᩸")) * 91;
                        i = ((iM11306 ^ i13) * (-14063)) ^ (-1870554610);
                        i2 = -1389501034;
                    }
                    int i18 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i18;
                    break;
                case -1787723547:
                case 165252880:
                    i11 = 1;
                    if (C2788.f10625 >= 0) {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("֨ܿ")) * (-23);
                        i = ((iM11306 ^ i14) * 20893) ^ (-536598859);
                        i2 = 172819585;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬֫") + i14) * (-13);
                        i = ((iM11306 ^ i13) * (-10605)) ^ (-1262454153);
                        i2 = 1027612711;
                    }
                    int i19 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i19;
                    break;
                case -1582895426:
                case 1788318099:
                    f44613 = ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr2, i10, i11, i7);
                    return;
                case -1473763905:
                case 405079557:
                    if (C3577.f13150 < 0) {
                        iM11306 = (C19806.m45029("ۖۘ") ^ i13) * (-25);
                        i = ((iM11306 ^ i14) * (-29891)) ^ 1794044059;
                        i2 = -2032929202;
                    } else {
                        iM11306 = (C19806.m45029("۟֨") + i14) * 115;
                        i = ((iM11306 ^ i13) * 24669) ^ 1472350960;
                        i2 = -1988291151;
                    }
                    int i110 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i110;
                    break;
                case -1115672134:
                case 212044592:
                    i9 = 5;
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("֨ܿ")) * (-23);
                        i = ((iM11306 ^ i14) * 20893) ^ (-536598859);
                        i2 = 172819585;
                    } else {
                        iM11306 = C19806.m45029("ۛܽ") ^ i14;
                        i = ((iM11306 ^ i13) * 269) ^ (-1322899874);
                        i2 = 1512510598;
                    }
                    int i111 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i111;
                    break;
                case -1067411735:
                case 1093628970:
                    sArr3 = f44614;
                    c = 'c';
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("֨ܿ")) * (-23);
                        i = ((iM11306 ^ i14) * 20893) ^ (-536598859);
                        i2 = 172819585;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܺ") + i13) * 31;
                        i = ((iM11306 ^ i14) * 29299) ^ 1562453144;
                        i2 = -1922467391;
                    }
                    int i112 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i112;
                    break;
                case -965503554:
                case -127102734:
                    sArr = f44614;
                    i8 = 100;
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i14 - C19806.m45029("ܽ᩸")) * 91;
                        i = ((iM11306 ^ i13) * (-14063)) ^ (-1870554610);
                        i2 = -1389501034;
                    } else {
                        iM11306 = C19806.m45029("᩷᩶") ^ i13;
                        i = ((iM11306 ^ i14) * (-1255)) ^ 1116237910;
                        i2 = 1930663944;
                    }
                    int i113 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i113;
                    break;
                case -444090071:
                case 1070739701:
                    C0962.m3746();
                    throw new RuntimeException();
                case -428328131:
                case 27540269:
                    RunnableC1895.m6170();
                    C0671.m3008();
                    iM11306 = ThreadFactoryC3888.m11306("ܰۛ") ^ i13;
                    i = ((iM11306 ^ i14) * (-14631)) ^ (-1673279788);
                    i2 = -1707867803;
                    int i114 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i114;
                    break;
                case -377967723:
                case 1152591231:
                    i5 = s * s;
                    i6 = 345253561;
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("֨ܿ")) * (-23);
                        i = ((iM11306 ^ i14) * 20893) ^ (-536598859);
                        i2 = 172819585;
                    } else {
                        iM11306 = C19806.m45029("ܿ۠") ^ i13;
                        i = ((iM11306 ^ i14) * 5057) ^ (-1371782143);
                        i2 = 266954424;
                    }
                    int i115 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i115;
                    break;
                case -167619501:
                case 966023362:
                    i4 = s * 37162;
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۛ") ^ i13;
                        i = ((iM11306 ^ i14) * (-14631)) ^ (-1673279788);
                        i2 = -1707867803;
                    } else {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("ܺۛ")) * (-5);
                        i = ((iM11306 ^ i14) * 27835) ^ (-319882008);
                        i2 = -986674787;
                    }
                    int i116 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i116;
                    break;
                case 35788774:
                case 1180969990:
                    if (C1668.f6641 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۛ") ^ i13;
                        i = ((iM11306 ^ i14) * (-14631)) ^ (-1673279788);
                        i2 = -1707867803;
                    } else {
                        iM11306 = (C19806.m45029("ۖۘ") ^ i13) * (-25);
                        i = ((iM11306 ^ i14) * (-29891)) ^ 1794044059;
                        i2 = -2032929202;
                    }
                    int i117 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i117;
                    break;
                case 205800768:
                case 1392434611:
                    f44612 = C1398.m4892(sArr, i8, i9, i7);
                    if (C0216.f1393 != 0) {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("֨ܿ")) * (-23);
                        i = ((iM11306 ^ i14) * 20893) ^ (-536598859);
                        i2 = 172819585;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۤ") ^ i13) * (-107);
                        i = ((iM11306 ^ i14) * (-20055)) ^ 2130122644;
                        i2 = -547995363;
                    }
                    int i118 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i118;
                    break;
                case 343919899:
                case 1832195517:
                    s = sArr3[c];
                    if (C2704.f10408) {
                        iM11306 = C19806.m45029("ۧۚ") ^ i14;
                        i = ((iM11306 ^ i13) * 2673) ^ 1523768481;
                        i2 = 1878461973;
                    } else {
                        iM11306 = (C19806.m45029("ۖۘ") ^ i13) * (-25);
                        i = ((iM11306 ^ i14) * (-29891)) ^ 1794044059;
                        i2 = -2032929202;
                    }
                    int i119 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i119;
                    break;
                case 430172435:
                case 1246339252:
                    i3 = 26376;
                    int iM11308 = (ThreadFactoryC3888.m11306("ۤ۬") + i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM11308 ^ i14) * 19235) ^ 959575363;
                    i2 = -1488337197;
                    i7 = i3;
                    iM11306 = iM11308;
                    int i1110 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i1110;
                    break;
                case 669853501:
                case 1885002974:
                    if (i4 - (i5 + i6) <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨܺ") ^ i14) * 29;
                        i = ((iM11306 ^ i13) * 6393) ^ (-1618618826);
                        i2 = -2096544758;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۨ") ^ i14;
                        i = ((iM11306 ^ i13) * 25831) ^ 764684845;
                        i2 = 192790424;
                    }
                    int i1111 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i1111;
                    break;
                case 1077280069:
                case 1085706380:
                    sArr2 = f44614;
                    i10 = IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("֨ܿ")) * (-23);
                        i = ((iM11306 ^ i14) * 20893) ^ (-536598859);
                        i2 = 172819585;
                    } else {
                        iM11306 = (i14 - ThreadFactoryC3888.m11306("ۚ᩺")) * (-107);
                        i = ((iM11306 ^ i13) * 26259) ^ (-1889557220);
                        i2 = -317675292;
                    }
                    int i1112 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i1112;
                    break;
                default:
                    i3 = 58119;
                    int iM11309 = (ThreadFactoryC3888.m11306("ۤ۬") + i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM11309 ^ i14) * 19235) ^ 959575363;
                    i2 = -1488337197;
                    i7 = i3;
                    iM11306 = iM11309;
                    int i1113 = i;
                    i16 = iM11306 ^ i2;
                    i15 = i1113;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0461 A[PHI: r9 r10 r17
      0x0461: PHI (r9v3 short) = (r9v1 short), (r9v2 short), (r9v1 short) binds: [B:111:0x045f, B:103:0x040b, B:8:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0461: PHI (r10v3 int) = (r10v1 int), (r10v2 int), (r10v1 int) binds: [B:111:0x045f, B:103:0x040b, B:8:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0461: PHI (r17v15 int) = (r17v7 int), (r17v9 int), (r17v16 int) binds: [B:111:0x045f, B:103:0x040b, B:8:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x04e2 A[PHI: r17
      0x04e2: PHI (r17v21 int) = (r17v4 int), (r17v6 int), (r17v22 int) binds: [B:123:0x04e0, B:115:0x0491, B:13:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0175 A[PHI: r17
      0x0175: PHI (r17v39 int) = (r17v36 int), (r17v40 int) binds: [B:49:0x015e, B:42:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0210 A[PHI: r17
      0x0210: PHI (r17v38 int) = (r17v33 int), (r17v35 int), (r17v40 int) binds: [B:62:0x01f7, B:53:0x0193, B:42:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33033(C13509 c13509, final Spinner spinner, DialogInterfaceC19356 dialogInterfaceC19356, C11545 c11545, String str) {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int iM45029;
        int i4;
        int i5;
        final C13509 c135010 = c13509;
        final int iM2432 = 0;
        String strM10790 = null;
        String strM3859 = null;
        String strM7604 = null;
        String strM4969 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1580478754;
        int i9 = ThreadFactoryC3888.f14547;
        int i10 = C3535.f13026;
        int iM450210 = (C19806.m45029("֫ۙ") ^ i10) * 73;
        int i11 = ((iM450210 ^ i9) * 24523) ^ 1645507385;
        int i12 = iM450210 ^ (-1798985916);
        EditText editText = null;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i9) * 30907) >> 31));
            switch (i8) {
                case -2133037855:
                case -1096825541:
                    if (C2249.f8050 >= 0) {
                        i8 = i8;
                        iM45029 = (C19806.m45029("ۘۚ") ^ i10) * (-39);
                        i4 = ((iM45029 ^ i9) * 7765) ^ (-1940523578);
                        i5 = -738914252;
                        i12 = iM45029 ^ i5;
                        i11 = i4;
                        i8 = i8;
                    } else {
                        i8 = i8;
                        iM11307 = C19806.m45029("᩶۫") ^ i10;
                        i11 = ((iM11307 ^ i9) * 13901) ^ 130825989;
                        i3 = 621568008;
                        i12 = iM11307 ^ i3;
                        i8 = i8;
                        c135010 = c13509;
                    }
                    break;
                case -2075036943:
                case 2062509858:
                    RunnableC1606.m5473();
                    if (C3660.m10791() != 0) {
                        i8 = i8;
                        iM45029 = ThreadFactoryC3888.m11306("ܺۙ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-13903)) ^ (-433191526);
                        i5 = 739213416;
                        i12 = iM45029 ^ i5;
                        i11 = i4;
                        i8 = i8;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ۬") + i9) * (-119);
                        i = ((iM11306 ^ i10) * 16337) ^ 1306779733;
                        i2 = -1434106474;
                        int i13 = i;
                        i12 = iM11306 ^ i2;
                        i11 = i13;
                    }
                    break;
                case -2045886705:
                case 602351742:
                    f44612 = C0817.m3407(ViewTreeObserverOnPreDrawListenerC3327.m9864(editText));
                    iM45029 = C19806.m45029("ܺܰ") ^ i10;
                    i8 = i8;
                    i4 = ((iM45029 ^ i9) * 2215) ^ 259712792;
                    i5 = 2053816232;
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    i8 = i8;
                    break;
                case -1911682491:
                case 449163828:
                    i8 = i8;
                    if (spinner.getSelectedItemPosition() == 0) {
                        iM45029 = C19806.m45029("ۘܽ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-1823)) ^ (-453092145);
                        i5 = -798134674;
                    } else {
                        iM45029 = C19806.m45029("ᩳ۫") ^ i10;
                        i4 = ((iM45029 ^ i9) * (-7299)) ^ 401267113;
                        i5 = 1152226210;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    i8 = i8;
                    break;
                case -1857179068:
                case 392407389:
                    i8 = i8;
                    strM10790 = C3660.m10790(f44614, 65, 3, i7);
                    if (C0629.f2722 > 0) {
                        iM45029 = C19806.m45029("۬ۢ") ^ i9;
                        i4 = ((iM45029 ^ i10) * 12749) ^ (-1502461222);
                        i5 = -1894239001;
                        i12 = iM45029 ^ i5;
                        i11 = i4;
                        i8 = i8;
                    } else {
                        iM11307 = C19806.m45029("ۢۢ") ^ i10;
                        i11 = ((iM11307 ^ i9) * 21803) ^ 1985896895;
                        i3 = 1147471874;
                        i12 = iM11307 ^ i3;
                        i8 = i8;
                        c135010 = c13509;
                    }
                    break;
                case -1799703683:
                case 2138928026:
                    i8 = i8;
                    strM7604 = C2477.m7604(f44614, 71, 3, i7);
                    if (C3722.f13525 <= 0) {
                        iM45029 = (C19806.m45029("ۘۚ") ^ i10) * (-39);
                        i4 = ((iM45029 ^ i9) * 7765) ^ (-1940523578);
                        i5 = -738914252;
                    } else {
                        iM45029 = C19806.m45029("ۡ۫") ^ i9;
                        i4 = ((iM45029 ^ i10) * 28049) ^ 990396287;
                        i5 = 1164417279;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    i8 = i8;
                    break;
                case -1755623155:
                case 1104724377:
                    i8 = i8;
                    s = sArr[c];
                    i6 = (s * s) + 124389409;
                    if (C1398.f5802 <= 0) {
                        iM11307 = C19806.m45029("᩶۫") ^ i10;
                        i11 = ((iM11307 ^ i9) * 13901) ^ 130825989;
                        i3 = 621568008;
                    } else {
                        iM11307 = (i10 - C19806.m45029("۬ۡ")) * (-69);
                        i11 = ((iM11307 ^ i9) * 3771) ^ 16878418;
                        i3 = -1816320759;
                    }
                    i12 = iM11307 ^ i3;
                    i8 = i8;
                    c135010 = c13509;
                    break;
                case -1743079269:
                case -1010686947:
                    i8 = i8;
                    if (C1668.f6641 >= 0) {
                        iM11307 = (C19806.m45029("ۨᩴ") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i11 = ((iM11307 ^ i10) * 30717) ^ 436774297;
                        i3 = -1982237856;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۛܰ") ^ i9) * 7;
                        i11 = ((iM11307 ^ i10) * 19103) ^ 1967786222;
                        i3 = -982087307;
                    }
                    i12 = iM11307 ^ i3;
                    i8 = i8;
                    c135010 = c13509;
                    break;
                case -1715359070:
                case -674881676:
                    i8 = i8;
                    if (C1066.f4915 <= 0) {
                        iM11307 = (i9 - C19806.m45029("᩷ᩳ")) * 27;
                        i11 = ((iM11307 ^ i10) * (-30669)) ^ (-1851499745);
                        i3 = -1661316647;
                    } else {
                        iM11307 = C19806.m45029("ܳܰ") ^ i10;
                        i11 = ((iM11307 ^ i9) * 13277) ^ (-472125848);
                        i3 = 1487388248;
                    }
                    i12 = iM11307 ^ i3;
                    i8 = i8;
                    c135010 = c13509;
                    break;
                case -1704647711:
                case -75071575:
                    C1668.m5582(ThreadFactoryC3888.m11306(strM4969) ^ 2123404412);
                    break;
                case -1580707782:
                case -6290647:
                    i8 = i8;
                    sArr = f44614;
                    c = '@';
                    if (C0671.f2816 != 0) {
                        iM11307 = C19806.m45029("ۢۢ") ^ i10;
                        i11 = ((iM11307 ^ i9) * 21803) ^ 1985896895;
                        i3 = 1147471874;
                    } else {
                        iM11307 = C19806.m45029("ܿܺ") ^ i9;
                        i11 = ((iM11307 ^ i10) * (-13377)) ^ 1066315476;
                        i3 = 398175302;
                    }
                    i12 = iM11307 ^ i3;
                    i8 = i8;
                    c135010 = c13509;
                    break;
                case -1481285944:
                case -894274480:
                    i8 = i8;
                    try {
                        iM2432 = C0526.m2432(C2124.m6674(C3577.m10576(editText)));
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i10;
                        i4 = ((iM45029 ^ i9) * (-26355)) ^ (-1927740498);
                        i5 = -1307860329;
                    } catch (NumberFormatException unused) {
                        iM45029 = (C19806.m45029("ܳ᩹") + i9) * (-39);
                        i4 = ((iM45029 ^ i10) * 24007) ^ 1363472132;
                        i5 = -1445821824;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    i8 = i8;
                    break;
                case -1426327705:
                case -1267979360:
                    i7 = 24589;
                    iM11307 = (ThreadFactoryC3888.m11306("ܿۛ") + i10) * (-93);
                    i11 = ((iM11307 ^ i9) * 15413) ^ (-1909670968);
                    i3 = -1773089561;
                    i12 = iM11307 ^ i3;
                    i8 = i8;
                    c135010 = c13509;
                    break;
                case -1219896671:
                case 917324098:
                    if (C1377.m4833() != 0) {
                        i8 = i8;
                        iM11307 = C19806.m45029("᩶۫") ^ i10;
                        i11 = ((iM11307 ^ i9) * 13901) ^ 130825989;
                        i3 = 621568008;
                        i12 = iM11307 ^ i3;
                        i8 = i8;
                        c135010 = c13509;
                    } else {
                        i8 = i8;
                        iM45029 = ThreadFactoryC3888.m11306("ܺۙ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-13903)) ^ (-433191526);
                        i5 = 739213416;
                        i12 = iM45029 ^ i5;
                        i11 = i4;
                        i8 = i8;
                    }
                    break;
                case -1180170125:
                case -804845195:
                    i8 = i8;
                    strM4969 = C1419.m4969(f44614, 74, 3, i7);
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۙ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-13903)) ^ (-433191526);
                        i5 = 739213416;
                    } else {
                        iM45029 = C19806.m45029("۟ۖ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-19283)) ^ 148635284;
                        i5 = -1377489286;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    i8 = i8;
                    break;
                case -1161444858:
                case -646225003:
                    C1668.m5582(ThreadFactoryC3888.m11306(strM10790) ^ 2097354193);
                    break;
                case -1149871833:
                case 2023083739:
                    i8 = i8;
                    if (i6 - (s * 22306) < 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܳܽ") ^ i9) * 11;
                        i11 = ((iM11307 ^ i10) * 25155) ^ (-1573301619);
                        i3 = 22163525;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܰ᩹") + i10) * 69;
                        i11 = ((iM11307 ^ i9) * (-27127)) ^ 332051371;
                        i3 = 2101908079;
                    }
                    i12 = iM11307 ^ i3;
                    i8 = i8;
                    c135010 = c13509;
                    break;
                case -1144605668:
                case 122119194:
                    i8 = i8;
                    if (RunnableC1564.m5345()) {
                        iM11307 = (C19806.m45029("ۨᩴ") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i11 = ((iM11307 ^ i10) * 30717) ^ 436774297;
                        i3 = -1982237856;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۙۖ") + i10) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i11 = ((iM11307 ^ i9) * 25327) ^ (-1840451225);
                        i3 = 919116724;
                    }
                    i12 = iM11307 ^ i3;
                    i8 = i8;
                    c135010 = c13509;
                    break;
                case -1117332394:
                case 833688807:
                    i8 = i8;
                    EditText editText2 = c135010.f44616;
                    if (C1461.m5073()) {
                        int iM450211 = (C19806.m45029("ܺ᩶") + i9) * (-21);
                        i12 = iM450211 ^ 19310294;
                        editText = editText2;
                        i11 = ((iM450211 ^ i10) * 6457) ^ (-318877179);
                        i8 = i8;
                    } else {
                        int iM11308 = (i10 - ThreadFactoryC3888.m11306("᩵֨")) * 27;
                        int i14 = ((iM11308 ^ i9) * 16149) ^ (-1814503655);
                        editText = editText2;
                        i12 = iM11308 ^ (-1929212864);
                        i8 = i8;
                        i11 = i14;
                    }
                    c135010 = c13509;
                    break;
                case -1053666643:
                case 2053958835:
                    C7105.m18985();
                    C3535.m10431();
                    iM11306 = (ThreadFactoryC3888.m11306("ۢ۬") + i9) * (-119);
                    i = ((iM11306 ^ i10) * 16337) ^ 1306779733;
                    i2 = -1434106474;
                    int i15 = i;
                    i12 = iM11306 ^ i2;
                    i11 = i15;
                    break;
                case -989713048:
                case -279830162:
                    i8 = i8;
                    strM3859 = C1025.m3859(f44614, 68, 3, i7);
                    if (C3743.f13569) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܶ") ^ i10;
                        i4 = ((iM45029 ^ i9) * (-27515)) ^ 1471030035;
                        i5 = -1443620889;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ۖ") + i10) * 7;
                        i4 = ((iM45029 ^ i9) * 22943) ^ 217262379;
                        i5 = -1617204332;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    i8 = i8;
                    break;
                case -956160067:
                case -303340301:
                    i8 = i8;
                    if (iM2432 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬֫") + i10) * 97;
                        i4 = ((iM45029 ^ i9) * (-16529)) ^ 1712572019;
                        i5 = 2070141799;
                    } else {
                        iM45029 = C19806.m45029("ܺۛ") ^ i10;
                        i4 = ((iM45029 ^ i9) * 15947) ^ (-21347272);
                        i5 = -1880632437;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    i8 = i8;
                    break;
                case -897635572:
                case 2110862376:
                    C2124.m6673();
                    break;
                case -849491404:
                case -387479722:
                    i8 = i8;
                    if (C2871.m8642()) {
                        iM45029 = (i10 - C19806.m45029("᩶᩻")) * 97;
                        i4 = ((iM45029 ^ i9) * (-17611)) ^ 1512502190;
                        i5 = -1744331958;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۨ") ^ i9;
                        i4 = ((iM45029 ^ i10) * 2553) ^ (-184739699);
                        i5 = -1187950894;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    i8 = i8;
                    break;
                case -739369333:
                case -628879450:
                    i8 = i8;
                    if (iM2432 > 2000) {
                        iM45029 = C19806.m45029("ܺۛ") ^ i10;
                        i4 = ((iM45029 ^ i9) * 15947) ^ (-21347272);
                        i5 = -1880632437;
                    } else {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ۛۤ")) * 3;
                        i4 = ((iM45029 ^ i9) * 11625) ^ 2069044711;
                        i5 = 89886742;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    i8 = i8;
                    break;
                case -179873017:
                case 10692614:
                    if (!C0817.m3399()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ۬") + i9) * (-119);
                        i = ((iM11306 ^ i10) * 16337) ^ 1306779733;
                        i2 = -1434106474;
                        int i16 = i;
                        i12 = iM11306 ^ i2;
                        i11 = i16;
                    } else {
                        i8 = i8;
                        iM11307 = (i9 - C19806.m45029("᩷ᩳ")) * 27;
                        i11 = ((iM11307 ^ i10) * (-30669)) ^ (-1851499745);
                        i3 = -1661316647;
                        i12 = iM11307 ^ i3;
                        i8 = i8;
                        c135010 = c13509;
                    }
                    break;
                case -166398100:
                case 568908852:
                    C1668.m5582(C19806.m45029(strM3859) ^ 2098693426);
                    break;
                case 281133388:
                case 791273721:
                    i8 = i8;
                    if (iM2432 <= 65536) {
                        iM45029 = (C19806.m45029("ۗۤ") ^ i9) * (-87);
                        i4 = ((iM45029 ^ i10) * (-23569)) ^ (-2046797725);
                        i5 = -1014477976;
                    } else {
                        iM45029 = C19806.m45029("ܺۛ") ^ i10;
                        i4 = ((iM45029 ^ i9) * 15947) ^ (-21347272);
                        i5 = -1880632437;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    i8 = i8;
                    break;
                case 319082193:
                case 2141909871:
                    C1189.m4360(C19806.m45029(strM7604) ^ 2098072583);
                    break;
                case 458134885:
                case 527886587:
                    f44613 = C0817.m3407(ViewTreeObserverOnPreDrawListenerC3327.m9864(editText));
                    iM45029 = C19806.m45029("ܺܰ") ^ i10;
                    i8 = i8;
                    i4 = ((iM45029 ^ i9) * 2215) ^ 259712792;
                    i5 = 2053816232;
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    i8 = i8;
                    break;
                case 461760605:
                case 1454939563:
                    C1398.m4895();
                    if (RunnableC0195.f1321 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۢ") ^ i9;
                        i = ((iM11306 ^ i10) * (-22209)) ^ (-43547436);
                        i2 = 2061219179;
                        int i17 = i;
                        i12 = iM11306 ^ i2;
                        i11 = i17;
                    } else {
                        i8 = i8;
                        iM11307 = C19806.m45029("᩶۫") ^ i10;
                        i11 = ((iM11307 ^ i9) * 13901) ^ 130825989;
                        i3 = 621568008;
                        i12 = iM11307 ^ i3;
                        i8 = i8;
                        c135010 = c13509;
                    }
                    break;
                case 473016634:
                case 1554292080:
                    if (!RunnableC0195.m1431()) {
                        i8 = i8;
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ۖ") + i10) * 7;
                        i4 = ((iM45029 ^ i9) * 22943) ^ 217262379;
                        i5 = -1617204332;
                        i12 = iM45029 ^ i5;
                        i11 = i4;
                        i8 = i8;
                    } else {
                        i8 = i8;
                        iM11307 = (i9 - C19806.m45029("᩷ᩳ")) * 27;
                        i11 = ((iM11307 ^ i10) * (-30669)) ^ (-1851499745);
                        i3 = -1661316647;
                        i12 = iM11307 ^ i3;
                        i8 = i8;
                        c135010 = c13509;
                    }
                    break;
                case 629826689:
                case 1707335618:
                    C1668.m5572(dialogInterfaceC19356);
                    C11005.m27761(new InterfaceC17354(c135010) { // from class: l.ܽܳۨ

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C13509 f53498;

                        @Override // l.InterfaceC17354
                        public final /* synthetic */ void onCanceled() {
                        }

                        @Override // l.InterfaceC17354
                        /* JADX INFO: renamed from: ۙ */
                        public final /* synthetic */ boolean mo6537(Exception exc) {
                            return false;
                        }

                        @Override // l.InterfaceC17354
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo6536(C14558 c14558, boolean z) {
                            Spinner spinner2 = null;
                            int i18 = 1317605321;
                            int i19 = C2249.f8050;
                            int i20 = C0278.f1572;
                            int iM450212 = C19806.m45029("۟ܺ") ^ i19;
                            int i21 = ((iM450212 ^ i20) * 13119) ^ 1686459376;
                            int i22 = 384626776;
                            while (true) {
                                i18 = ((((i18 ^ i20) * 2495) >> 31) & i21) ^ (iM450212 ^ i22);
                                switch (i18) {
                                    case -2144326798:
                                    case -1070856770:
                                        if (C2124.f7782 <= 0) {
                                            iM450212 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i20;
                                            i21 = ((iM450212 ^ i19) * 11115) ^ (-1431050134);
                                            i22 = -472190354;
                                        } else {
                                            iM450212 = C19806.m45029("᩻۟") ^ i20;
                                            i21 = ((iM450212 ^ i19) * 13991) ^ 199937759;
                                            i22 = 197785927;
                                        }
                                        break;
                                    case -2041873666:
                                    case 37426409:
                                        if (C0278.m1789() <= 0) {
                                            iM450212 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i20;
                                            i21 = ((iM450212 ^ i19) * 11115) ^ (-1431050134);
                                            i22 = -472190354;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i20;
                                            i21 = ((iM450212 ^ i19) * 8045) ^ 1985130981;
                                            i22 = 851025633;
                                        }
                                        break;
                                    case -1865416794:
                                    case 326930242:
                                        if (C2788.f10625 >= 0) {
                                            iM450212 = (ThreadFactoryC3888.m11306("ۡᩳ") + i20) * (-13);
                                            i21 = ((iM450212 ^ i19) * (-18407)) ^ (-1066976869);
                                            i22 = -891802097;
                                        } else {
                                            iM450212 = C19806.m45029("֨ᩴ") ^ i20;
                                            i21 = ((iM450212 ^ i19) * (-5003)) ^ 1140377946;
                                            i22 = 452533990;
                                        }
                                        break;
                                    case -1590180309:
                                    case 802006878:
                                        spinner2 = spinner;
                                        if (C10634.f36300 >= 0) {
                                            iM450212 = (ThreadFactoryC3888.m11306("ۡᩳ") + i20) * (-13);
                                            i21 = ((iM450212 ^ i19) * (-18407)) ^ (-1066976869);
                                            i22 = -891802097;
                                        } else {
                                            iM450212 = (C19806.m45029("ᩳۖ") + i19) * 73;
                                            i21 = ((iM450212 ^ i20) * 28797) ^ 1694847116;
                                            i22 = 1812006973;
                                        }
                                        break;
                                    case -1321405825:
                                    case 1705145826:
                                        C13509.m33032(this.f53498, spinner2, iM2432, c14558, z);
                                        break;
                                    case -1010480645:
                                    case 1436949415:
                                        RunnableC3388.m10064();
                                        if (C2788.f10625 < 0) {
                                            iM450212 = (ThreadFactoryC3888.m11306("ۤۖ") ^ i19) * (-9);
                                            i21 = ((iM450212 ^ i20) * (-16503)) ^ 1844664885;
                                            i22 = 1801992649;
                                        } else {
                                            iM450212 = C19806.m45029("ۨ᩻") ^ i19;
                                            i21 = ((iM450212 ^ i20) * 25533) ^ (-758904671);
                                            i22 = -262145686;
                                        }
                                        break;
                                    case -695239412:
                                    case 845744497:
                                        if (C0817.f3443) {
                                            iM450212 = C19806.m45029("֡ܽ") ^ i19;
                                            i21 = ((iM450212 ^ i20) * (-23503)) ^ 1374763616;
                                            i22 = 1058537674;
                                        } else {
                                            iM450212 = (ThreadFactoryC3888.m11306("ۤۖ") ^ i19) * (-9);
                                            i21 = ((iM450212 ^ i20) * (-16503)) ^ 1844664885;
                                            i22 = 1801992649;
                                        }
                                        break;
                                    case -568244845:
                                    case 1237690934:
                                        if (C2642.f10294 <= 0) {
                                            iM450212 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i20;
                                            i21 = ((iM450212 ^ i19) * 11115) ^ (-1431050134);
                                            i22 = -472190354;
                                        } else {
                                            iM450212 = C19806.m45029("᩹ܳ") ^ i20;
                                            i21 = ((iM450212 ^ i19) * 29443) ^ (-1614807711);
                                            i22 = 525282388;
                                        }
                                        break;
                                    case -22098678:
                                    case 207352569:
                                        C2124.m6673();
                                        iM450212 = C19806.m45029("ۨ᩻") ^ i19;
                                        i21 = ((iM450212 ^ i20) * 25533) ^ (-758904671);
                                        i22 = -262145686;
                                        break;
                                    case -8657895:
                                    case 1664186125:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM450212 = (ThreadFactoryC3888.m11306("ۤۖ") ^ i19) * (-9);
                                            i21 = ((iM450212 ^ i20) * (-16503)) ^ 1844664885;
                                            i22 = 1801992649;
                                        } else {
                                            iM450212 = (C19806.m45029("۠֨") + i20) * q.h;
                                            i21 = ((iM450212 ^ i19) * 9775) ^ 1981478720;
                                            i22 = 1895560113;
                                        }
                                        break;
                                    case 126800973:
                                    case 709492099:
                                        if (AbstractC0464.m2313() != 0) {
                                            iM450212 = (ThreadFactoryC3888.m11306("ۤۖ") ^ i19) * (-9);
                                            i21 = ((iM450212 ^ i20) * (-16503)) ^ 1844664885;
                                            i22 = 1801992649;
                                        } else {
                                            iM450212 = (i19 - C19806.m45029("ۘۘ")) * (-65);
                                            i21 = ((iM450212 ^ i20) * 30939) ^ 1467621007;
                                            i22 = 367237447;
                                        }
                                        break;
                                    case 381534692:
                                    case 935330607:
                                        if (C19806.m45024()) {
                                            iM450212 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i20;
                                            i21 = ((iM450212 ^ i19) * 11115) ^ (-1431050134);
                                            i22 = -472190354;
                                        } else {
                                            iM450212 = (C19806.m45029("ۘ֡") + i19) * (-9);
                                            i21 = ((iM450212 ^ i20) * 24817) ^ (-1120079910);
                                            i22 = 1975505214;
                                        }
                                        break;
                                    case 857502870:
                                    case 2054156203:
                                        if (C7105.f23796 >= 0) {
                                            iM450212 = (i20 - C19806.m45029("ᩳۗ")) * 95;
                                            i21 = ((iM450212 ^ i19) * 26219) ^ (-2049705766);
                                            i22 = -1202622502;
                                        } else {
                                            iM450212 = ThreadFactoryC3888.m11306("ۤۘ") ^ i19;
                                            i21 = ((iM450212 ^ i20) * (-32649)) ^ 1028396392;
                                            i22 = 1079223913;
                                        }
                                        break;
                                    case 1234729851:
                                    case 1474834482:
                                        C1937.m6279();
                                        if (!C1668.m5583()) {
                                            iM450212 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i20;
                                            i21 = ((iM450212 ^ i19) * 11115) ^ (-1431050134);
                                            i22 = -472190354;
                                        } else {
                                            iM450212 = C19806.m45029("ۨ᩻") ^ i19;
                                            i21 = ((iM450212 ^ i20) * 25533) ^ (-758904671);
                                            i22 = -262145686;
                                        }
                                        break;
                                    case 1244694964:
                                    case 2053687963:
                                        if (C2249.f8050 >= 0) {
                                            iM450212 = (i20 - C19806.m45029("ᩳۗ")) * 95;
                                            i21 = ((iM450212 ^ i19) * 26219) ^ (-2049705766);
                                            i22 = -1202622502;
                                        } else {
                                            iM450212 = C19806.m45029("ۨ᩻") ^ i19;
                                            i21 = ((iM450212 ^ i20) * 25533) ^ (-758904671);
                                            i22 = -262145686;
                                        }
                                        break;
                                    default:
                                        C3286.m9798();
                                        AbstractC0464.m2313();
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i18 = -1143083129;
                            int i19 = C3577.f13150;
                            int i20 = MenuItemOnMenuItemClickListenerC3244.f12064;
                            int iM11309 = (i19 - ThreadFactoryC3888.m11306("᩵ܿ")) * 47;
                            int i21 = ((iM11309 ^ i20) * 505) ^ 499506451;
                            int i22 = 687907991;
                            while (true) {
                                i18 = ((((i18 ^ i20) * 22359) >> 31) & i21) ^ (iM11309 ^ i22);
                                switch (i18) {
                                    case -1868336112:
                                    case 782993918:
                                        if (C1025.f4800 >= 0) {
                                            iM11309 = (ThreadFactoryC3888.m11306("ۛܿ") ^ i19) * 57;
                                            i21 = ((iM11309 ^ i20) * 25125) ^ 216942657;
                                            i22 = 990439298;
                                        } else {
                                            iM11309 = ThreadFactoryC3888.m11306("۬۬") ^ i20;
                                            i21 = ((iM11309 ^ i19) * 23899) ^ (-1695708211);
                                            i22 = -1939602060;
                                        }
                                        break;
                                    case -1855615013:
                                    case 1430134107:
                                        if (CallableC1627.f6528) {
                                            iM11309 = (i19 - C19806.m45029("ۡ᩶")) * 15;
                                            i21 = ((iM11309 ^ i20) * 16573) ^ 1399480404;
                                            i22 = 2052150900;
                                        } else {
                                            iM11309 = (ThreadFactoryC3888.m11306("ܿۤ") + i20) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i21 = ((iM11309 ^ i19) * (-281)) ^ (-733262217);
                                            i22 = -700903503;
                                        }
                                        break;
                                    case -1481960288:
                                    case 1027911158:
                                        C2249.m6915();
                                        if (C1025.f4800 >= 0) {
                                            iM11309 = (ThreadFactoryC3888.m11306("ܿۤ") + i20) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i21 = ((iM11309 ^ i19) * (-281)) ^ (-733262217);
                                            i22 = -700903503;
                                        } else {
                                            iM11309 = (ThreadFactoryC3888.m11306("ۛܿ") ^ i19) * 57;
                                            i21 = ((iM11309 ^ i20) * 25125) ^ 216942657;
                                            i22 = 990439298;
                                        }
                                        break;
                                    case -1197324534:
                                    case -79471876:
                                        return;
                                    case -1017485932:
                                    case 1288688925:
                                        C1148.m4232();
                                        C0962.m3746();
                                        throw new RuntimeException();
                                    case -886660350:
                                    case 561954585:
                                        if (C3660.f13403 >= 0) {
                                            iM11309 = (C19806.m45029("֫᩺") + i20) * (-127);
                                            i21 = ((iM11309 ^ i19) * (-29617)) ^ 1471372429;
                                            i22 = -1204160442;
                                        } else {
                                            iM11309 = (i20 - ThreadFactoryC3888.m11306("֨᩸")) * (-51);
                                            i21 = ((iM11309 ^ i19) * (-23999)) ^ (-1178020262);
                                            i22 = 450124804;
                                        }
                                        break;
                                    case -699361062:
                                    case 151890381:
                                        C2704.m8255();
                                        if (!C1377.f5749) {
                                            iM11309 = (C19806.m45029("֫᩺") + i20) * (-127);
                                            i21 = ((iM11309 ^ i19) * (-29617)) ^ 1471372429;
                                            i22 = -1204160442;
                                        } else {
                                            iM11309 = (ThreadFactoryC3888.m11306("ܿۤ") + i20) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i21 = ((iM11309 ^ i19) * (-281)) ^ (-733262217);
                                            i22 = -700903503;
                                        }
                                        break;
                                    case -529193661:
                                    case 108184245:
                                        C1189.m4368();
                                        C2642.m8171();
                                        iM11309 = (ThreadFactoryC3888.m11306("ۛܿ") ^ i19) * 57;
                                        i21 = ((iM11309 ^ i20) * 25125) ^ 216942657;
                                        i22 = 990439298;
                                        break;
                                    case -480349440:
                                    case 1838606704:
                                        if (C1189.m4368() <= 0) {
                                            iM11309 = (C19806.m45029("֫᩺") + i20) * (-127);
                                            i21 = ((iM11309 ^ i19) * (-29617)) ^ 1471372429;
                                            i22 = -1204160442;
                                        } else {
                                            iM11309 = ThreadFactoryC3888.m11306("֫ܿ") ^ i19;
                                            i21 = ((iM11309 ^ i20) * 9491) ^ (-1850927061);
                                            i22 = 1374377893;
                                        }
                                        break;
                                    case -160842497:
                                    case -109119987:
                                        if (C0216.f1393 != 0) {
                                            iM11309 = C19806.m45029("ۜۜ") ^ i19;
                                            i21 = ((iM11309 ^ i20) * 7325) ^ (-1090963389);
                                            i22 = 1285357833;
                                        } else {
                                            iM11309 = (ThreadFactoryC3888.m11306("ܳ᩺") + i19) * 67;
                                            i21 = ((iM11309 ^ i20) * (-2891)) ^ (-2035564159);
                                            i22 = -1632593986;
                                        }
                                        break;
                                    case -69232461:
                                    case 1108861008:
                                        this.f53498 = c135010;
                                        if (C0216.m1591() <= 0) {
                                            iM11309 = (ThreadFactoryC3888.m11306("ۛܿ") ^ i19) * 57;
                                            i21 = ((iM11309 ^ i20) * 25125) ^ 216942657;
                                            i22 = 990439298;
                                        } else {
                                            iM11309 = C19806.m45029("ܺ֨") ^ i20;
                                            i21 = ((iM11309 ^ i19) * (-15313)) ^ (-1013909018);
                                            i22 = 1113359129;
                                        }
                                        break;
                                    case 348600223:
                                    case 1810545063:
                                        if (RunnableC0195.f1321 < 0) {
                                            iM11309 = C19806.m45029("ۜۜ") ^ i19;
                                            i21 = ((iM11309 ^ i20) * 7325) ^ (-1090963389);
                                            i22 = 1285357833;
                                        } else {
                                            iM11309 = (ThreadFactoryC3888.m11306("ۛܿ") ^ i19) * 57;
                                            i21 = ((iM11309 ^ i20) * 25125) ^ 216942657;
                                            i22 = 990439298;
                                        }
                                        break;
                                    case 491333072:
                                    case 1810719804:
                                        if (C7105.m18985()) {
                                            iM11309 = (ThreadFactoryC3888.m11306("ۛܿ") ^ i19) * 57;
                                            i21 = ((iM11309 ^ i20) * 25125) ^ 216942657;
                                            i22 = 990439298;
                                        } else {
                                            iM11309 = ThreadFactoryC3888.m11306("᩺᩶") ^ i19;
                                            i21 = ((iM11309 ^ i20) * (-11485)) ^ (-226389914);
                                            i22 = 174946687;
                                        }
                                        break;
                                    case 528990978:
                                    case 761711939:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM11309 = (C19806.m45029("֫᩺") + i20) * (-127);
                                            i21 = ((iM11309 ^ i19) * (-29617)) ^ 1471372429;
                                            i22 = -1204160442;
                                        } else {
                                            iM11309 = (C19806.m45029("֨֨") + i20) * (-121);
                                            i21 = ((iM11309 ^ i19) * 27435) ^ 817998534;
                                            i22 = 1959501914;
                                        }
                                        break;
                                    case 1629278083:
                                    case 1806270774:
                                        if (RunnableC1564.f6300) {
                                            iM11309 = C19806.m45029("ۜۜ") ^ i19;
                                            i21 = ((iM11309 ^ i20) * 7325) ^ (-1090963389);
                                            i22 = 1285357833;
                                        } else {
                                            iM11309 = (C19806.m45029("ۚ᩷") + i19) * 53;
                                            i21 = ((iM11309 ^ i20) * 13817) ^ 653698611;
                                            i22 = -366345881;
                                        }
                                        break;
                                    default:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                                            iM11309 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i20;
                                            i21 = ((iM11309 ^ i19) * (-8617)) ^ 1396573124;
                                            i22 = -890529904;
                                        } else {
                                            iM11309 = ThreadFactoryC3888.m11306("ۤ᩶") ^ i20;
                                            i21 = ((iM11309 ^ i19) * 10457) ^ 1721946736;
                                            i22 = 1514258265;
                                        }
                                        break;
                                }
                            }
                        }
                    }, RunnableC1606.m5471(c11545), str);
                    break;
                case 750314915:
                case 2089146014:
                    C3286.m9798();
                    if (C3722.f13525 > 0) {
                        i8 = i8;
                        iM11307 = (C19806.m45029("ۨᩴ") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i11 = ((iM11307 ^ i10) * 30717) ^ 436774297;
                        i3 = -1982237856;
                        i12 = iM11307 ^ i3;
                        i8 = i8;
                        c135010 = c13509;
                    } else {
                        i8 = i8;
                        iM45029 = ThreadFactoryC3888.m11306("ܺۙ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-13903)) ^ (-433191526);
                        i5 = 739213416;
                        i12 = iM45029 ^ i5;
                        i11 = i4;
                        i8 = i8;
                    }
                    break;
                case 1073610120:
                case 1740098489:
                    i8 = i8;
                    if (c135010.f44617 == 1) {
                        iM45029 = C19806.m45029("ۚۨ") ^ i9;
                        i4 = ((iM45029 ^ i10) * 23069) ^ 1094276492;
                        i5 = -1930993940;
                    } else {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ۛۤ")) * 3;
                        i4 = ((iM45029 ^ i9) * 11625) ^ 2069044711;
                        i5 = 89886742;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    i8 = i8;
                    break;
                case 1479986855:
                case 1687411400:
                    i8 = i8;
                    if (C0050.f912 <= 0) {
                        iM11307 = C19806.m45029("᩶۫") ^ i10;
                        i11 = ((iM11307 ^ i9) * 13901) ^ 130825989;
                        i3 = 621568008;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۢۛ") ^ i9;
                        i11 = ((iM11307 ^ i10) * (-15209)) ^ (-1848905443);
                        i3 = -1446816492;
                    }
                    i12 = iM11307 ^ i3;
                    i8 = i8;
                    c135010 = c13509;
                    break;
                default:
                    i7 = 61354;
                    iM11307 = (ThreadFactoryC3888.m11306("ܿۛ") + i10) * (-93);
                    i11 = ((iM11307 ^ i9) * 15413) ^ (-1909670968);
                    i3 = -1773089561;
                    i12 = iM11307 ^ i3;
                    i8 = i8;
                    c135010 = c13509;
                    break;
            }
            return;
        }
    }

    public C13509(AbstractC20745 abstractC20745, final C11545 c11545, final String str) {
        int i;
        short[] sArr;
        EditText editText;
        int i2;
        Spinner spinner;
        int i3;
        int i4;
        int iM45029;
        int i5;
        int i6;
        short[] sArr2;
        int i7;
        EditText editText2;
        Spinner spinner2;
        short[] sArr3;
        View view;
        int i8;
        int i9;
        short[] sArr4;
        EditText editText3;
        short[] sArr5;
        int i10;
        int iM450210;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iM450211;
        int i16;
        int i17;
        EditText editText4;
        int i18;
        int iM11306;
        int i19;
        int i20;
        DialogInterfaceC19356 dialogInterfaceC19356M52499 = null;
        int i21 = -1274209145;
        int i22 = C0629.f2722;
        int i23 = MenuItemOnMenuItemClickListenerC3244.f12064;
        short s = f44614[0];
        int i24 = (s * 2) + 1;
        int i25 = s + 1;
        int i26 = (i25 * i25) - i24 < 0 ? 53610 : 38270;
        int iM450212 = (i23 - C19806.m45029("ۙᩳ")) * 37;
        int i27 = ((iM450212 ^ i22) * 5643) ^ 1519644001;
        int i28 = iM450212 ^ (-1466480294);
        EditText editText5 = null;
        DialogInterface.OnClickListener onClickListener = null;
        String str2 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i29 = 0;
        int iM450213 = 0;
        int iM450214 = 0;
        Main mainM5471 = null;
        int iM450215 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        Spinner spinner3 = null;
        C8067 c8067M3751 = null;
        short[] sArr10 = null;
        int i36 = 0;
        short[] sArr11 = null;
        View viewM10957 = null;
        View view2 = null;
        int i37 = i27;
        int i38 = 0;
        while (true) {
            i21 = i28 ^ (i37 & (((i21 ^ i22) * 21339) >> 31));
            switch (i21) {
                case -1999746616:
                case 1093689153:
                    C11005.m27756(c11545, dialogInterfaceC19356M52499, str);
                    final Spinner spinner4 = spinner3;
                    final DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M52499;
                    C7105.m18993(C3535.m10425(dialogInterfaceC19356M52499), new View.OnClickListener(this) { // from class: l.֡ܳۨ

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C13509 f2148;

                        {
                            int i39 = 288301024;
                            int i40 = C2477.f9839;
                            int i41 = C7105.f23796;
                            int iM450216 = C19806.m45029("ܶܰ") ^ i40;
                            int i42 = ((iM450216 ^ i41) * 18215) ^ 901885982;
                            int i43 = -1711688572;
                            while (true) {
                                i39 = ((((i39 ^ i41) * (-21959)) >> 31) & i42) ^ (iM450216 ^ i43);
                                switch (i39) {
                                    case -2051813651:
                                    case 528859506:
                                        if (C1025.f4800 >= 0) {
                                            iM450216 = (i41 - ThreadFactoryC3888.m11306("ܰۢ")) * 7;
                                            i42 = ((iM450216 ^ i40) * (-16593)) ^ 1757368739;
                                            i43 = -807166424;
                                        } else {
                                            iM450216 = (C19806.m45029("᩸ܰ") + i41) * 127;
                                            i42 = ((iM450216 ^ i40) * (-29867)) ^ (-506326751);
                                            i43 = 773708325;
                                        }
                                        break;
                                    case -2032023491:
                                    case 115285196:
                                        if (C0797.m3359()) {
                                            iM450216 = ThreadFactoryC3888.m11306("ۡۙ") ^ i41;
                                            i42 = ((iM450216 ^ i40) * (-1397)) ^ (-1323300020);
                                            i43 = 1339508698;
                                        } else {
                                            iM450216 = (i41 - ThreadFactoryC3888.m11306("ܰۢ")) * 7;
                                            i42 = ((iM450216 ^ i40) * (-16593)) ^ 1757368739;
                                            i43 = -807166424;
                                        }
                                        break;
                                    case -1901230715:
                                    case -795307562:
                                        if (C0797.m3359()) {
                                            iM450216 = (ThreadFactoryC3888.m11306("ۘ᩸") ^ i40) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i42 = ((iM450216 ^ i41) * (-14141)) ^ (-154122289);
                                            i43 = -1654124644;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("֨᩻") ^ i41;
                                            i42 = ((iM450216 ^ i40) * (-14433)) ^ 350484942;
                                            i43 = 7198711;
                                        }
                                        break;
                                    case -1694579902:
                                    case -1573908962:
                                        if (C1398.m4895() <= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("᩷۫") ^ i40;
                                            i42 = ((iM450216 ^ i41) * (-30097)) ^ (-1061773007);
                                            i43 = -1986554375;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("ۤ۫") ^ i40;
                                            i42 = ((iM450216 ^ i41) * (-20489)) ^ 906412667;
                                            i43 = -154135980;
                                        }
                                        break;
                                    case -1481095348:
                                    case -419906888:
                                        if (C1461.f5957 <= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("֨᩻") ^ i41;
                                            i42 = ((iM450216 ^ i40) * (-14433)) ^ 350484942;
                                            i43 = 7198711;
                                        } else {
                                            iM450216 = C19806.m45029("᩵ۢ") ^ i41;
                                            i42 = ((iM450216 ^ i40) * 23033) ^ 1482211724;
                                            i43 = 72365657;
                                        }
                                        break;
                                    case -1416366722:
                                    case -135105440:
                                        if (AbstractC0464.f2088 <= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("֨᩻") ^ i41;
                                            i42 = ((iM450216 ^ i40) * (-14433)) ^ 350484942;
                                            i43 = 7198711;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("ۜ۬") ^ i40;
                                            i42 = ((iM450216 ^ i41) * (-10085)) ^ 893132031;
                                            i43 = -678847950;
                                        }
                                        break;
                                    case -1369168201:
                                    case -745561544:
                                        C1668.m5583();
                                        iM450216 = (ThreadFactoryC3888.m11306("᩻ᩳ") + i41) * (-15);
                                        i42 = ((iM450216 ^ i40) * 12337) ^ 701571590;
                                        i43 = -498881109;
                                        break;
                                    case -1237071341:
                                    case -1045499460:
                                        C0817.m3399();
                                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                                        throw new RuntimeException();
                                    case -905360629:
                                    case 1966480875:
                                        C2642.m8171();
                                        if (C1419.f5860 < 0) {
                                            iM450216 = (i41 - ThreadFactoryC3888.m11306("ܰۢ")) * 7;
                                            i42 = ((iM450216 ^ i40) * (-16593)) ^ 1757368739;
                                            i43 = -807166424;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("᩷۫") ^ i40;
                                            i42 = ((iM450216 ^ i41) * (-30097)) ^ (-1061773007);
                                            i43 = -1986554375;
                                        }
                                        break;
                                    case -835233669:
                                    case -569031781:
                                        return;
                                    case -833510423:
                                    case -106583997:
                                        AbstractC0464.m2313();
                                        if (C3660.m10791() != 0) {
                                            iM450216 = (ThreadFactoryC3888.m11306("ᩳۙ") ^ i40) * (-45);
                                            i42 = ((iM450216 ^ i41) * (-23695)) ^ (-367073176);
                                            i43 = -1801138496;
                                        } else {
                                            iM450216 = (ThreadFactoryC3888.m11306("᩻ᩳ") + i41) * (-15);
                                            i42 = ((iM450216 ^ i40) * 12337) ^ 701571590;
                                            i43 = -498881109;
                                        }
                                        break;
                                    case -372747056:
                                    case -194369933:
                                        this.f2148 = this;
                                        if (C0526.f2219) {
                                            iM450216 = (ThreadFactoryC3888.m11306("᩻ᩳ") + i41) * (-15);
                                            i42 = ((iM450216 ^ i40) * 12337) ^ 701571590;
                                            i43 = -498881109;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("۬ۙ") ^ i41;
                                            i42 = ((iM450216 ^ i40) * 16239) ^ 118589142;
                                            i43 = 567376365;
                                        }
                                        break;
                                    case -340397649:
                                    case 898713581:
                                        if (C1460.f5948 >= 0) {
                                            iM450216 = (ThreadFactoryC3888.m11306("᩻ᩳ") + i41) * (-15);
                                            i42 = ((iM450216 ^ i40) * 12337) ^ 701571590;
                                            i43 = -498881109;
                                        } else {
                                            iM450216 = (ThreadFactoryC3888.m11306("۟ۤ") ^ i40) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i42 = ((iM450216 ^ i41) * (-18419)) ^ 284972379;
                                            i43 = 2031218537;
                                        }
                                        break;
                                    case -15499598:
                                    case 373050253:
                                        if (C2249.f8050 >= 0) {
                                            iM450216 = (ThreadFactoryC3888.m11306("ᩳۙ") ^ i40) * (-45);
                                            i42 = ((iM450216 ^ i41) * (-23695)) ^ (-367073176);
                                            i43 = -1801138496;
                                        } else {
                                            iM450216 = (i41 - ThreadFactoryC3888.m11306("۟ۚ")) * 93;
                                            i42 = ((iM450216 ^ i40) * 28399) ^ (-568287835);
                                            i43 = 1455129170;
                                        }
                                        break;
                                    case 1199388860:
                                    case 1550405918:
                                        if (C0216.f1393 != 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("᩷۫") ^ i40;
                                            i42 = ((iM450216 ^ i41) * (-30097)) ^ (-1061773007);
                                            i43 = -1986554375;
                                        } else {
                                            iM450216 = (ThreadFactoryC3888.m11306("ۢᩳ") + i40) * (-81);
                                            i42 = ((iM450216 ^ i41) * 767) ^ (-273416100);
                                            i43 = 732109039;
                                        }
                                        break;
                                    default:
                                        if (RunnableC1606.f6488 < 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("᩷۫") ^ i40;
                                            i42 = ((iM450216 ^ i41) * (-30097)) ^ (-1061773007);
                                            i43 = -1986554375;
                                        } else {
                                            iM450216 = (ThreadFactoryC3888.m11306("᩻ᩳ") + i41) * (-15);
                                            i42 = ((iM450216 ^ i40) * 12337) ^ 701571590;
                                            i43 = -498881109;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            C11545 c11546 = null;
                            String str3 = null;
                            C13509 c13509 = null;
                            Spinner spinner5 = null;
                            int i39 = 1593632097;
                            int i40 = RunnableC1606.f6488;
                            int i41 = C0278.f1572;
                            int iM11307 = ThreadFactoryC3888.m11306("ۜܰ") ^ i41;
                            int i42 = ((iM11307 ^ i40) * (-13141)) ^ 1125285393;
                            int i43 = 607311867;
                            while (true) {
                                i39 = ((((i39 ^ i40) * (-12801)) >> 31) & i42) ^ (iM11307 ^ i43);
                                switch (i39) {
                                    case -2145035468:
                                    case -1983876476:
                                        C0797.m3359();
                                        if (!RunnableC1895.f7152) {
                                            iM11307 = (ThreadFactoryC3888.m11306("ۚۛ") ^ i41) * 67;
                                            i42 = ((iM11307 ^ i40) * 25235) ^ (-972865255);
                                            i43 = 90878150;
                                        } else {
                                            iM11307 = (C19806.m45029("ᩳۚ") + i40) * 3;
                                            i42 = ((iM11307 ^ i41) * 2365) ^ 612196164;
                                            i43 = -33328000;
                                        }
                                        break;
                                    case -1923999170:
                                    case -738313438:
                                        C13509.m33033(c13509, spinner5, dialogInterfaceC19356, c11546, str3);
                                        break;
                                    case -1594914066:
                                    case 1740728420:
                                        if (C2788.f10625 >= 0) {
                                            iM11307 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i40;
                                            i42 = ((iM11307 ^ i41) * (-25393)) ^ 1892678787;
                                            i43 = 1311998792;
                                        } else {
                                            iM11307 = (ThreadFactoryC3888.m11306("ᩴ᩵") ^ i41) * (-45);
                                            i42 = ((iM11307 ^ i40) * (-16739)) ^ 1514051265;
                                            i43 = -1173981955;
                                        }
                                        break;
                                    case -1578668327:
                                    case -132205904:
                                        if (C1668.f6641 >= 0) {
                                            iM11307 = ThreadFactoryC3888.m11306("ۡۚ") ^ i41;
                                            i42 = ((iM11307 ^ i40) * 26323) ^ (-1272627614);
                                            i43 = -1655536566;
                                        } else {
                                            iM11307 = (C19806.m45029("ᩳۚ") + i40) * 3;
                                            i42 = ((iM11307 ^ i41) * 2365) ^ 612196164;
                                            i43 = -33328000;
                                        }
                                        break;
                                    case -1545722855:
                                    case 1045635790:
                                        if (RunnableC0195.f1321 >= 0) {
                                            iM11307 = (ThreadFactoryC3888.m11306("ۚۛ") ^ i41) * 67;
                                            i42 = ((iM11307 ^ i40) * 25235) ^ (-972865255);
                                            i43 = 90878150;
                                        } else {
                                            iM11307 = C19806.m45029("ᩴ֡") ^ i41;
                                            i42 = ((iM11307 ^ i40) * (-31001)) ^ (-129405455);
                                            i43 = 597855054;
                                        }
                                        break;
                                    case -1537460340:
                                    case 1809137296:
                                        str3 = str;
                                        if (C2249.m6915() <= 0) {
                                            iM11307 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i40;
                                            i42 = ((iM11307 ^ i41) * (-25393)) ^ 1892678787;
                                            i43 = 1311998792;
                                        } else {
                                            iM11307 = (C19806.m45029("ۖ۟") + i41) * (-79);
                                            i42 = ((iM11307 ^ i40) * (-9811)) ^ 883031903;
                                            i43 = -1304163539;
                                        }
                                        break;
                                    case -1447071749:
                                    case 1673446964:
                                        if (C0671.f2816 != 0) {
                                            iM11307 = C19806.m45029("ۡܶ") ^ i40;
                                            i42 = ((iM11307 ^ i41) * 29215) ^ (-1829253538);
                                            i43 = -1028294233;
                                        } else {
                                            iM11307 = ThreadFactoryC3888.m11306("ܿ᩷") ^ i40;
                                            i42 = ((iM11307 ^ i41) * (-12065)) ^ (-1746423309);
                                            i43 = 1329112878;
                                        }
                                        break;
                                    case -1288232652:
                                    case 747671859:
                                        C0216.m1591();
                                        break;
                                    case -1273597272:
                                    case 150944330:
                                        if (RunnableC1564.m5345()) {
                                            iM11307 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i40;
                                            i42 = ((iM11307 ^ i41) * (-25393)) ^ 1892678787;
                                            i43 = 1311998792;
                                        } else {
                                            iM11307 = (C19806.m45029("ۘ֫") ^ i41) * 127;
                                            i42 = ((iM11307 ^ i40) * 23001) ^ 366451643;
                                            i43 = 935989431;
                                        }
                                        break;
                                    case -1273365044:
                                    case 1753758319:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM11307 = C19806.m45029("ۡܶ") ^ i40;
                                            i42 = ((iM11307 ^ i41) * 29215) ^ (-1829253538);
                                            i43 = -1028294233;
                                        } else {
                                            iM11307 = (C19806.m45029("۬ܰ") + i40) * 73;
                                            i42 = ((iM11307 ^ i41) * 30903) ^ (-21272934);
                                            i43 = 1519952562;
                                        }
                                        break;
                                    case -755248502:
                                    case 1514562589:
                                        c13509 = this.f2148;
                                        spinner5 = spinner4;
                                        if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                                            iM11307 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i40;
                                            i42 = ((iM11307 ^ i41) * (-25393)) ^ 1892678787;
                                            i43 = 1311998792;
                                        } else {
                                            iM11307 = ThreadFactoryC3888.m11306("۬ۛ") ^ i40;
                                            i42 = ((iM11307 ^ i41) * 22329) ^ 906790732;
                                            i43 = 1009332373;
                                        }
                                        break;
                                    case -139684832:
                                    case 960827208:
                                        if (C0216.f1393 != 0) {
                                            iM11307 = ThreadFactoryC3888.m11306("ۡۚ") ^ i41;
                                            i42 = ((iM11307 ^ i40) * 26323) ^ (-1272627614);
                                            i43 = -1655536566;
                                        } else {
                                            iM11307 = C19806.m45029("֫᩻") ^ i41;
                                            i42 = ((iM11307 ^ i40) * (-25515)) ^ 1337415317;
                                            i43 = 1660316287;
                                        }
                                        break;
                                    case 368487499:
                                    case 1054257540:
                                        c11546 = c11545;
                                        if (C2477.f9839 <= 0) {
                                            iM11307 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i40;
                                            i42 = ((iM11307 ^ i41) * (-25393)) ^ 1892678787;
                                            i43 = 1311998792;
                                        } else {
                                            iM11307 = ThreadFactoryC3888.m11306("᩷᩶") ^ i40;
                                            i42 = ((iM11307 ^ i41) * (-32017)) ^ (-808597572);
                                            i43 = 1267249035;
                                        }
                                        break;
                                    case 438869538:
                                    case 761426698:
                                        C10634.m26820();
                                        C3722.m10894();
                                        iM11307 = (ThreadFactoryC3888.m11306("ۚۛ") ^ i41) * 67;
                                        i42 = ((iM11307 ^ i40) * 25235) ^ (-972865255);
                                        i43 = 90878150;
                                        break;
                                    case 831668317:
                                    case 1296027211:
                                        if (!C1377.f5749) {
                                            iM11307 = (ThreadFactoryC3888.m11306("ۚۛ") ^ i41) * 67;
                                            i42 = ((iM11307 ^ i40) * 25235) ^ (-972865255);
                                            i43 = 90878150;
                                        } else {
                                            iM11307 = C19806.m45029("ۡܶ") ^ i40;
                                            i42 = ((iM11307 ^ i41) * 29215) ^ (-1829253538);
                                            i43 = -1028294233;
                                        }
                                        break;
                                    default:
                                        if (C2642.f10294 <= 0) {
                                            iM11307 = ThreadFactoryC3888.m11306("ۡۚ") ^ i41;
                                            i42 = ((iM11307 ^ i40) * 26323) ^ (-1272627614);
                                            i43 = -1655536566;
                                        } else {
                                            iM11307 = (C19806.m45029("ᩳܽ") + i40) * 39;
                                            i42 = ((iM11307 ^ i41) * (-13177)) ^ (-857332611);
                                            i43 = -2103409660;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    return;
                case -1735220829:
                case 1445606372:
                    c8067M3751 = C0962.m3751(C2477.m7591(c11545));
                    C1977.m6349(c8067M3751, view2);
                    sArr9 = f44614;
                    i38 = 16;
                    i36 = 3;
                    iM11306 = ThreadFactoryC3888.m11306("ۖۜ") ^ i23;
                    i19 = ((iM11306 ^ i22) * (-4481)) ^ (-1511157904);
                    i20 = -573411418;
                    i28 = iM11306 ^ i20;
                    i37 = i19;
                    break;
                case -1476437222:
                case -28919166:
                    dialogInterfaceC19356M52499 = C23821.m52499(c8067M3751, iM450214, onClickListener, C19806.m45029(C1461.m5070(sArr10, i29, 3, i26)) ^ 2116636342, onClickListener);
                    iM11306 = (C19806.m45029("ۙܶ") ^ i22) * 59;
                    i19 = ((iM11306 ^ i23) * (-21717)) ^ (-134195243);
                    i20 = -228984213;
                    i28 = iM11306 ^ i20;
                    i37 = i19;
                    break;
                case -1425948642:
                case 387746397:
                    spinner3.setOnItemSelectedListener(this);
                    i = i38;
                    editText4 = editText5;
                    C1461.m5083(editText4, f44612);
                    editText4.setSelection(MenuItemOnMenuItemClickListenerC3244.m9708(editText4));
                    if (AbstractC0464.f2088 > 0) {
                        int iM11307 = ThreadFactoryC3888.m11306("֨᩻") ^ i23;
                        int i39 = i36;
                        int i40 = ((iM11307 ^ i22) * (-27355)) ^ (-71081625);
                        i18 = iM11307 ^ 965770695;
                        i37 = i40;
                        i36 = i39;
                        editText5 = editText4;
                        i38 = i;
                        i28 = i18;
                    } else {
                        i14 = i36;
                        i15 = i33;
                        sArr = sArr11;
                        spinner = spinner3;
                        i8 = i32;
                        sArr4 = sArr8;
                        editText3 = editText4;
                        int iM11308 = (ThreadFactoryC3888.m11306("᩶ᩳ") + i22) * (-57);
                        sArr7 = sArr7;
                        i37 = ((iM11308 ^ i23) * (-3063)) ^ 1154089531;
                        spinner3 = spinner;
                        i33 = i15;
                        i36 = i14;
                        editText5 = editText3;
                        sArr8 = sArr4;
                        i32 = i8;
                        sArr11 = sArr;
                        int i41 = i;
                        i28 = iM11308 ^ (-1008999613);
                        i38 = i41;
                    }
                    break;
                case -1150031515:
                case 761124289:
                    ThreadFactoryC3888.m11300();
                    if (C7105.f23796 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ֫") ^ i23) * 85;
                        i19 = ((iM11306 ^ i22) * (-23773)) ^ 1200393254;
                        i20 = 518706817;
                        i28 = iM11306 ^ i20;
                        i37 = i19;
                    } else {
                        i10 = i26;
                        i = i38;
                        sArr3 = sArr7;
                        sArr = sArr11;
                        view = view2;
                        i8 = i32;
                        sArr4 = sArr8;
                        editText3 = editText5;
                        i2 = i36;
                        int i42 = i33;
                        spinner = spinner3;
                        i3 = i34;
                        i4 = i42;
                        iM450210 = C19806.m45029("᩻ۙ") ^ i23;
                        i11 = ((iM450210 ^ i22) * 17287) ^ (-423764306);
                        i12 = 1186885311;
                        i13 = iM450210 ^ i12;
                        i37 = i11;
                        view2 = view;
                        i36 = i2;
                        i26 = i10;
                        sArr7 = sArr3;
                        editText5 = editText3;
                        sArr8 = sArr4;
                        i32 = i8;
                        sArr11 = sArr;
                        int i43 = i;
                        i28 = i13;
                        i38 = i43;
                        int i44 = i4;
                        i34 = i3;
                        spinner3 = spinner;
                        i33 = i44;
                    }
                    break;
                case -850526323:
                case -236075898:
                    i = i38;
                    int i45 = i32;
                    sArr = sArr11;
                    EditText editText6 = editText5;
                    i14 = i36;
                    short[] sArr12 = sArr8;
                    editText3 = editText6;
                    int i46 = i33;
                    spinner = spinner3;
                    i3 = i34;
                    i4 = i46;
                    sArr4 = sArr12;
                    i8 = i45;
                    sArr7 = sArr7;
                    viewM10957 = C3743.m10957(view2, ThreadFactoryC3888.m11306(C1398.m4892(sArr7, 7, 3, i26)) ^ 2117177512);
                    if (C2477.m7593() < 0) {
                        int iM450216 = (i22 - C19806.m45029("ۚۧ")) * q.h;
                        int i47 = ((iM450216 ^ i23) * 12935) ^ (-1652546919);
                        i13 = iM450216 ^ (-1333297751);
                        i37 = i47;
                        sArr7 = sArr7;
                        i36 = i14;
                        editText5 = editText3;
                        sArr8 = sArr4;
                        i32 = i8;
                        sArr11 = sArr;
                        int i48 = i;
                        i28 = i13;
                        i38 = i48;
                        int i49 = i4;
                        i34 = i3;
                        spinner3 = spinner;
                        i33 = i49;
                    } else {
                        i15 = i4;
                        i34 = i3;
                        int iM11309 = (ThreadFactoryC3888.m11306("᩶ᩳ") + i22) * (-57);
                        sArr7 = sArr7;
                        i37 = ((iM11309 ^ i23) * (-3063)) ^ 1154089531;
                        spinner3 = spinner;
                        i33 = i15;
                        i36 = i14;
                        editText5 = editText3;
                        sArr8 = sArr4;
                        i32 = i8;
                        sArr11 = sArr;
                        int i410 = i;
                        i28 = iM11309 ^ (-1008999613);
                        i38 = i410;
                    }
                    break;
                case -844454222:
                case 599330975:
                    i = i38;
                    sArr = sArr11;
                    editText = editText5;
                    i2 = i36;
                    int i50 = i33;
                    spinner = spinner3;
                    i3 = i34;
                    i4 = i50;
                    this.f44618 = (TextView) viewM10957;
                    sArr8 = f44614;
                    i32 = 10;
                    i31 = 3;
                    if (C1461.f5957 > 0) {
                        iM45029 = C19806.m45029("ܰۢ") ^ i23;
                        i5 = ((iM45029 ^ i22) * 6737) ^ 296559828;
                        i6 = -43758326;
                        int i51 = iM45029 ^ i6;
                        i37 = i5;
                        sArr11 = sArr;
                        int i52 = i2;
                        editText5 = editText;
                        i38 = i;
                        i28 = i51;
                        i36 = i52;
                        int i411 = i4;
                        i34 = i3;
                        spinner3 = spinner;
                        i33 = i411;
                    } else {
                        sArr2 = sArr8;
                        i7 = 10;
                        editText2 = editText;
                        spinner2 = spinner;
                        iM450211 = (ThreadFactoryC3888.m11306("᩵֡") + i22) * 21;
                        i16 = ((iM450211 ^ i23) * (-31441)) ^ 1576038733;
                        i17 = -1255012335;
                        int i53 = iM450211 ^ i17;
                        i37 = i16;
                        i33 = i4;
                        i34 = i3;
                        spinner3 = spinner2;
                        i38 = i;
                        i28 = i53;
                        i36 = i2;
                        editText5 = editText2;
                        sArr8 = sArr2;
                        i32 = i7;
                        sArr11 = sArr;
                    }
                    break;
                case -782969072:
                case 783172797:
                    i = i38;
                    spinner = spinner3;
                    editText4 = editText5;
                    i14 = i36;
                    this.f44616 = editText4;
                    sArr11 = f44614;
                    i15 = 13;
                    i34 = 3;
                    if (!RunnableC1895.f7152) {
                        sArr = sArr11;
                        i8 = i32;
                        sArr4 = sArr8;
                        editText3 = editText4;
                        int iM113010 = (ThreadFactoryC3888.m11306("᩶ᩳ") + i22) * (-57);
                        sArr7 = sArr7;
                        i37 = ((iM113010 ^ i23) * (-3063)) ^ 1154089531;
                        spinner3 = spinner;
                        i33 = i15;
                        i36 = i14;
                        editText5 = editText3;
                        sArr8 = sArr4;
                        i32 = i8;
                        sArr11 = sArr;
                        int i412 = i;
                        i28 = iM113010 ^ (-1008999613);
                        i38 = i412;
                    } else {
                        int iM450217 = C19806.m45029("᩵᩵") ^ i22;
                        int i54 = ((iM450217 ^ i23) * 24875) ^ (-825383584);
                        i18 = iM450217 ^ 923263310;
                        i37 = i54;
                        spinner3 = spinner;
                        i36 = i14;
                        i33 = 13;
                        editText5 = editText4;
                        i38 = i;
                        i28 = i18;
                    }
                    break;
                case -722843221:
                case 388288827:
                    i = i38;
                    sArr3 = sArr7;
                    sArr = sArr11;
                    i8 = i32;
                    sArr4 = sArr8;
                    editText3 = editText5;
                    i2 = i36;
                    int i55 = i33;
                    spinner = spinner3;
                    i3 = i34;
                    i4 = i55;
                    view = view2;
                    sArr5 = sArr6;
                    i9 = i35;
                    iM450215 = C19806.m45029(C0050.m940(sArr5, i9, 3, i26)) ^ 2123881001;
                    if (C3535.f13026 > 0) {
                        int i56 = i26;
                        int iM113011 = ThreadFactoryC3888.m11306("۟ۜ") ^ i23;
                        i37 = ((iM113011 ^ i22) * (-28633)) ^ 1812422506;
                        sArr6 = sArr5;
                        i35 = i9;
                        view2 = view;
                        i36 = i2;
                        i38 = i;
                        i28 = iM113011 ^ 1343203776;
                        sArr7 = sArr3;
                        editText5 = editText3;
                        sArr8 = sArr4;
                        i32 = i8;
                        sArr11 = sArr;
                        i26 = i56;
                        int i57 = i4;
                        i34 = i3;
                        spinner3 = spinner;
                        i33 = i57;
                    } else {
                        int iM450218 = C19806.m45029("֫ۢ") ^ i23;
                        i10 = i26;
                        int i58 = ((iM450218 ^ i22) * (-6297)) ^ (-978287198);
                        i13 = iM450218 ^ 1527358446;
                        i37 = i58;
                        sArr6 = sArr5;
                        i35 = i9;
                        view2 = view;
                        i36 = i2;
                        i26 = i10;
                        sArr7 = sArr3;
                        editText5 = editText3;
                        sArr8 = sArr4;
                        i32 = i8;
                        sArr11 = sArr;
                        int i413 = i;
                        i28 = i13;
                        i38 = i413;
                        int i414 = i4;
                        i34 = i3;
                        spinner3 = spinner;
                        i33 = i414;
                    }
                    break;
                case -406896458:
                case 607820547:
                    C3577.m10565();
                    throw new RuntimeException();
                case -331762622:
                case -250779734:
                    int i59 = i38;
                    short[] sArr13 = sArr11;
                    int i60 = i32;
                    short[] sArr14 = sArr8;
                    EditText editText7 = editText5;
                    int i61 = i36;
                    int i62 = i33;
                    spinner = spinner3;
                    i3 = i34;
                    i4 = i62;
                    View viewM4976 = C1419.m4976(mainM5471, iM450215);
                    int iM450219 = C19806.m45029(C3743.m10964(f44614, 4, 3, i26));
                    int iM450220 = C19806.m45029("֫᩹") ^ i22;
                    i37 = ((iM450220 ^ i23) * (-2689)) ^ (-731235831);
                    sArr7 = sArr7;
                    view2 = viewM4976;
                    i30 = iM450219;
                    i38 = i59;
                    i28 = iM450220 ^ 1789262872;
                    i36 = i61;
                    editText5 = editText7;
                    sArr8 = sArr14;
                    i32 = i60;
                    sArr11 = sArr13;
                    int i510 = i4;
                    i34 = i3;
                    spinner3 = spinner;
                    i33 = i510;
                    break;
                case -306320437:
                case 467742989:
                    i10 = i26;
                    i = i38;
                    sArr3 = sArr7;
                    sArr = sArr11;
                    view = view2;
                    i8 = i32;
                    sArr4 = sArr8;
                    editText3 = editText5;
                    i2 = i36;
                    int i63 = i33;
                    spinner = spinner3;
                    i3 = i34;
                    i4 = i63;
                    this.f44617 = 0;
                    this.f44619 = c11545;
                    this.f44620 = abstractC20745;
                    mainM5471 = RunnableC1606.m5471(c11545);
                    sArr6 = f44614;
                    i35 = 1;
                    if (C2704.m8255() <= 0) {
                        iM450210 = C19806.m45029("᩻ۙ") ^ i23;
                        i11 = ((iM450210 ^ i22) * 17287) ^ (-423764306);
                        i12 = 1186885311;
                    } else {
                        iM450210 = (C19806.m45029("ᩳۘ") + i22) * (-107);
                        i11 = ((iM450210 ^ i23) * (-6511)) ^ 521675066;
                        i12 = 167797782;
                    }
                    i13 = iM450210 ^ i12;
                    i37 = i11;
                    view2 = view;
                    i36 = i2;
                    i26 = i10;
                    sArr7 = sArr3;
                    editText5 = editText3;
                    sArr8 = sArr4;
                    i32 = i8;
                    sArr11 = sArr;
                    int i415 = i;
                    i28 = i13;
                    i38 = i415;
                    int i416 = i4;
                    i34 = i3;
                    spinner3 = spinner;
                    i33 = i416;
                    break;
                case -232004529:
                case 1753620228:
                    RunnableC1895.m6170();
                    if (C0050.f912 <= 0) {
                        i = i38;
                        sArr3 = sArr7;
                        sArr = sArr11;
                        view = view2;
                        i8 = i32;
                        i9 = i35;
                        sArr4 = sArr8;
                        editText3 = editText5;
                        i2 = i36;
                        sArr5 = sArr6;
                        int i64 = i33;
                        spinner = spinner3;
                        i3 = i34;
                        i4 = i64;
                        int iM4502110 = C19806.m45029("֫ۢ") ^ i23;
                        i10 = i26;
                        int i511 = ((iM4502110 ^ i22) * (-6297)) ^ (-978287198);
                        i13 = iM4502110 ^ 1527358446;
                        i37 = i511;
                        sArr6 = sArr5;
                        i35 = i9;
                        view2 = view;
                        i36 = i2;
                        i26 = i10;
                        sArr7 = sArr3;
                        editText5 = editText3;
                        sArr8 = sArr4;
                        i32 = i8;
                        sArr11 = sArr;
                        int i417 = i;
                        i28 = i13;
                        i38 = i417;
                        int i418 = i4;
                        i34 = i3;
                        spinner3 = spinner;
                        i33 = i418;
                    } else {
                        i = i38;
                        spinner2 = spinner3;
                        i3 = i34;
                        sArr = sArr11;
                        i7 = i32;
                        i4 = i33;
                        sArr2 = sArr8;
                        editText2 = editText5;
                        i2 = i36;
                        iM450211 = (ThreadFactoryC3888.m11306("᩵֡") + i22) * 21;
                        i16 = ((iM450211 ^ i23) * (-31441)) ^ 1576038733;
                        i17 = -1255012335;
                        int i512 = iM450211 ^ i17;
                        i37 = i16;
                        i33 = i4;
                        i34 = i3;
                        spinner3 = spinner2;
                        i38 = i;
                        i28 = i512;
                        i36 = i2;
                        editText5 = editText2;
                        sArr8 = sArr2;
                        i32 = i7;
                        sArr11 = sArr;
                    }
                    break;
                case -193146059:
                case 1483711780:
                    iM450214 = C19806.m45029(str2) ^ 2125605766;
                    sArr10 = f44614;
                    i29 = 22;
                    if (!C19806.f63586) {
                        iM11306 = (C19806.m45029("۟ۚ") + i23) * (-37);
                        i19 = ((iM11306 ^ i22) * (-27927)) ^ 1138962026;
                        i20 = 1154854756;
                        i28 = iM11306 ^ i20;
                        i37 = i19;
                    } else {
                        i = i38;
                        spinner2 = spinner3;
                        i3 = i34;
                        sArr = sArr11;
                        i7 = i32;
                        i4 = i33;
                        sArr2 = sArr8;
                        editText2 = editText5;
                        i2 = i36;
                        iM450211 = (ThreadFactoryC3888.m11306("᩵֡") + i22) * 21;
                        i16 = ((iM450211 ^ i23) * (-31441)) ^ 1576038733;
                        i17 = -1255012335;
                        int i513 = iM450211 ^ i17;
                        i37 = i16;
                        i33 = i4;
                        i34 = i3;
                        spinner3 = spinner2;
                        i38 = i;
                        i28 = i513;
                        i36 = i2;
                        editText5 = editText2;
                        sArr8 = sArr2;
                        i32 = i7;
                        sArr11 = sArr;
                    }
                    break;
                case -99942194:
                case 637786576:
                    C0671.m3008();
                    if (RunnableC0195.f1321 >= 0) {
                        i = i38;
                        spinner2 = spinner3;
                        i3 = i34;
                        sArr = sArr11;
                        i7 = i32;
                        i4 = i33;
                        sArr2 = sArr8;
                        editText2 = editText5;
                        i2 = i36;
                        iM450211 = (ThreadFactoryC3888.m11306("᩵֡") + i22) * 21;
                        i16 = ((iM450211 ^ i23) * (-31441)) ^ 1576038733;
                        i17 = -1255012335;
                        int i514 = iM450211 ^ i17;
                        i37 = i16;
                        i33 = i4;
                        i34 = i3;
                        spinner3 = spinner2;
                        i38 = i;
                        i28 = i514;
                        i36 = i2;
                        editText5 = editText2;
                        sArr8 = sArr2;
                        i32 = i7;
                        sArr11 = sArr;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ֫") ^ i23) * 85;
                        i19 = ((iM11306 ^ i22) * (-23773)) ^ 1200393254;
                        i20 = 518706817;
                        i28 = iM11306 ^ i20;
                        i37 = i19;
                    }
                    break;
                case -23035985:
                case 1258793511:
                    C1460.m5055(c8067M3751, iM450213, null);
                    String strM8470 = C2788.m8470(f44614, 19, 3, i26);
                    int iM113012 = ThreadFactoryC3888.m11306("۠۫") ^ i22;
                    i28 = iM113012 ^ 1258334699;
                    str2 = strM8470;
                    i37 = ((iM113012 ^ i23) * 22179) ^ (-300486279);
                    onClickListener = null;
                    break;
                case 248852332:
                case 2094047447:
                    iM450213 = C19806.m45029(ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr9, i38, i36, i26)) ^ 2128560429;
                    if (RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ֫") ^ i23) * 85;
                        i19 = ((iM11306 ^ i22) * (-23773)) ^ 1200393254;
                        i20 = 518706817;
                    } else {
                        iM11306 = (i22 - ThreadFactoryC3888.m11306("ۛ֫")) * 81;
                        i19 = ((iM11306 ^ i23) * (-373)) ^ (-1802010807);
                        i20 = 1830530803;
                    }
                    i28 = iM11306 ^ i20;
                    i37 = i19;
                    break;
                case 529921963:
                case 1795546073:
                    C2249.m6915();
                    i10 = i26;
                    i = i38;
                    sArr3 = sArr7;
                    sArr = sArr11;
                    view = view2;
                    i8 = i32;
                    sArr4 = sArr8;
                    editText3 = editText5;
                    i2 = i36;
                    int i419 = i33;
                    spinner = spinner3;
                    i3 = i34;
                    i4 = i419;
                    iM450210 = C19806.m45029("᩻ۙ") ^ i23;
                    i11 = ((iM450210 ^ i22) * 17287) ^ (-423764306);
                    i12 = 1186885311;
                    i13 = iM450210 ^ i12;
                    i37 = i11;
                    view2 = view;
                    i36 = i2;
                    i26 = i10;
                    sArr7 = sArr3;
                    editText5 = editText3;
                    sArr8 = sArr4;
                    i32 = i8;
                    sArr11 = sArr;
                    int i4110 = i;
                    i28 = i13;
                    i38 = i4110;
                    int i4111 = i4;
                    i34 = i3;
                    spinner3 = spinner;
                    i33 = i4111;
                    break;
                case 611024682:
                case 824882491:
                    i = i38;
                    int i65 = i33;
                    editText = editText5;
                    i2 = i36;
                    spinner = spinner3;
                    i3 = i34;
                    short[] sArr15 = sArr11;
                    sArr = sArr15;
                    this.f44615 = (TextView) C2642.m8167(view2, C19806.m45029(CallableC1627.m5502(sArr15, i65, i3, i26)) ^ 2118329682);
                    if (AbstractC0464.f2088 > 0) {
                        iM45029 = (C19806.m45029("۟᩸") ^ i22) * (-99);
                        i4 = i65;
                        i5 = ((iM45029 ^ i23) * (-15225)) ^ (-82348079);
                        i6 = -788817417;
                        int i515 = iM45029 ^ i6;
                        i37 = i5;
                        sArr11 = sArr;
                        int i516 = i2;
                        editText5 = editText;
                        i38 = i;
                        i28 = i515;
                        i36 = i516;
                        int i4112 = i4;
                        i34 = i3;
                        spinner3 = spinner;
                        i33 = i4112;
                    } else {
                        i10 = i26;
                        i4 = i65;
                        sArr3 = sArr7;
                        i8 = i32;
                        view = view2;
                        sArr4 = sArr8;
                        editText3 = editText;
                        iM450210 = C19806.m45029("᩻ۙ") ^ i23;
                        i11 = ((iM450210 ^ i22) * 17287) ^ (-423764306);
                        i12 = 1186885311;
                        i13 = iM450210 ^ i12;
                        i37 = i11;
                        view2 = view;
                        i36 = i2;
                        i26 = i10;
                        sArr7 = sArr3;
                        editText5 = editText3;
                        sArr8 = sArr4;
                        i32 = i8;
                        sArr11 = sArr;
                        int i4113 = i;
                        i28 = i13;
                        i38 = i4113;
                        int i4114 = i4;
                        i34 = i3;
                        spinner3 = spinner;
                        i33 = i4114;
                    }
                    break;
                case 2043340530:
                case 2043772120:
                    i = i38;
                    i3 = i34;
                    sArr = sArr11;
                    i7 = i32;
                    i4 = i33;
                    sArr2 = sArr8;
                    editText2 = editText5;
                    i2 = i36;
                    spinner2 = (Spinner) C3743.m10957(view2, i30 ^ 2125484179);
                    sArr7 = f44614;
                    if (C3722.f13525 <= 0) {
                        iM450211 = (ThreadFactoryC3888.m11306("᩵֡") + i22) * 21;
                        i16 = ((iM450211 ^ i23) * (-31441)) ^ 1576038733;
                        i17 = -1255012335;
                    } else {
                        iM450211 = C19806.m45029("ᩳᩴ") ^ i23;
                        i16 = ((iM450211 ^ i22) * (-3663)) ^ (-655875463);
                        i17 = 1816962139;
                    }
                    int i517 = iM450211 ^ i17;
                    i37 = i16;
                    i33 = i4;
                    i34 = i3;
                    spinner3 = spinner2;
                    i38 = i;
                    i28 = i517;
                    i36 = i2;
                    editText5 = editText2;
                    sArr8 = sArr2;
                    i32 = i7;
                    sArr11 = sArr;
                    break;
                default:
                    int i66 = i38;
                    int i67 = i36;
                    int i68 = i31;
                    short[] sArr16 = sArr8;
                    int i69 = i32;
                    short[] sArr17 = sArr11;
                    int i70 = i33;
                    spinner = spinner3;
                    i3 = i34;
                    i4 = i70;
                    EditText editText8 = (EditText) C3743.m10957(view2, C19806.m45029(C1461.m5070(sArr16, i69, i68, i26)) ^ 2126382965);
                    int iM450221 = C19806.m45029("᩷᩹") ^ i23;
                    i37 = ((iM450221 ^ i22) * 22671) ^ 1413701202;
                    i38 = i66;
                    sArr11 = sArr17;
                    i28 = iM450221 ^ (-1884348440);
                    i31 = i68;
                    i32 = i69;
                    sArr8 = sArr16;
                    i36 = i67;
                    editText5 = editText8;
                    int i4115 = i4;
                    i34 = i3;
                    spinner3 = spinner;
                    i33 = i4115;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x02e5 A[PHI: r7 r8 r14 r15 r19
      0x02e5: PHI (r7v5 l.ۨۜ᩹) = (r7v2 l.ۨۜ᩹), (r7v2 l.ۨۜ᩹), (r7v2 l.ۨۜ᩹), (r7v6 l.ۨۜ᩹) binds: [B:68:0x02e3, B:64:0x02c6, B:24:0x00b5, B:14:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x02e5: PHI (r8v5 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:68:0x02e3, B:64:0x02c6, B:24:0x00b5, B:14:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x02e5: PHI (r14v7 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v4 short[]), (r14v2 short[]) binds: [B:68:0x02e3, B:64:0x02c6, B:24:0x00b5, B:14:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x02e5: PHI (r15v9 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:68:0x02e3, B:64:0x02c6, B:24:0x00b5, B:14:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x02e5: PHI (r19v36 int) = (r19v10 int), (r19v11 int), (r19v28 int), (r19v37 int) binds: [B:68:0x02e3, B:64:0x02c6, B:24:0x00b5, B:14:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33032(C13509 c13509, Spinner spinner, int i, C14558 c14558, boolean z) {
        int iM45029;
        int i2;
        int i3;
        int iM11306;
        int i4;
        C13509 c135010 = c13509;
        int i5 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i6 = C1875.f7103;
        int iM450210 = C19806.m45029("ۛ֡") ^ i6;
        int i7 = ((iM450210 ^ i5) * 2573) ^ (-1460866957);
        C11545 c11545 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM450210 ^ 603495508;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 46449926;
        int i12 = 0;
        String strM3009 = null;
        short[] sArr3 = null;
        int i13 = 0;
        String strM4832 = null;
        String strM6236 = null;
        C10142 c10142 = null;
        int selectedItemPosition = 0;
        while (true) {
            i11 = i8 ^ (i7 & (((i11 ^ i5) * (-11351)) >> 31));
            switch (i11) {
                case -1991599530:
                case 1727378510:
                    if (C1875.m6086() == 0) {
                        int iM11307 = ThreadFactoryC3888.m11306("ᩴ֫") ^ i6;
                        i7 = ((iM11307 ^ i5) * (-30171)) ^ (-528281238);
                        i8 = iM11307 ^ 319879643;
                        c135010 = c13509;
                    } else {
                        int iM11308 = (ThreadFactoryC3888.m11306("۬֨") ^ i6) * (-73);
                        i8 = iM11308 ^ 354380433;
                        i7 = ((iM11308 ^ i5) * 2117) ^ (-507282922);
                    }
                    break;
                case -1973884748:
                case -1957259970:
                    C1066.m4029(c10142, C1066.m4040(sArr2, i10, 15, i9), z);
                    c10142.m25763();
                    break;
                case -1454474784:
                case 1692522424:
                    c10142.m25764(i, strM3009);
                    c11545 = c135010.f44619;
                    c10142.m25774(c11545);
                    if (C0526.m2437() >= 0) {
                        selectedItemPosition = selectedItemPosition;
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۛ") ^ i5) * (-79);
                        i7 = ((iM11306 ^ i6) * 22483) ^ (-979943329);
                        i4 = 594378095;
                        int i14 = iM11306 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i14;
                        c135010 = c13509;
                    } else {
                        int iM11309 = (ThreadFactoryC3888.m11306("֡᩸") ^ i6) * 101;
                        i7 = ((iM11309 ^ i5) * (-9059)) ^ (-1216573777);
                        i8 = iM11309 ^ 660159989;
                    }
                    break;
                case -1424416096:
                case -926329377:
                    selectedItemPosition = selectedItemPosition;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۛ") ^ i5) * (-79);
                        i7 = ((iM11306 ^ i6) * 22483) ^ (-979943329);
                        i4 = 594378095;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ۫") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-14851)) ^ (-258159699);
                        i4 = -1889133678;
                    }
                    int i15 = iM11306 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i15;
                    c135010 = c13509;
                    break;
                case -1408363561:
                case -815904746:
                    selectedItemPosition = spinner.getSelectedItemPosition();
                    int i16 = C20725.f67443;
                    c10142 = new C10142(C4335.class);
                    if (C7105.f23796 >= 0) {
                        int iM113010 = ThreadFactoryC3888.m11306("ᩴ֫") ^ i6;
                        i7 = ((iM113010 ^ i5) * (-30171)) ^ (-528281238);
                        i8 = iM113010 ^ 319879643;
                    } else {
                        int iM113011 = (ThreadFactoryC3888.m11306("۠ᩴ") ^ i6) * 41;
                        i8 = iM113011 ^ (-1292049675);
                        i7 = ((iM113011 ^ i5) * (-15585)) ^ 1879236516;
                    }
                    c135010 = c13509;
                    break;
                case -1316758146:
                case 287745941:
                    c10142.m25764(selectedItemPosition, strM4832);
                    selectedItemPosition = selectedItemPosition;
                    strM3009 = C0671.m3009(f44614, 46, 3, i9);
                    if (C2871.f10837 < 0) {
                        iM45029 = C19806.m45029("ۙ᩶") ^ i5;
                        i2 = ((iM45029 ^ i6) * (-5843)) ^ (-1399371261);
                        i3 = -974967630;
                        int i17 = selectedItemPosition;
                        i8 = iM45029 ^ i3;
                        i7 = i2;
                        selectedItemPosition = i17;
                    } else {
                        selectedItemPosition = selectedItemPosition;
                        int iM113012 = ThreadFactoryC3888.m11306("ᩴ֫") ^ i6;
                        i7 = ((iM113012 ^ i5) * (-30171)) ^ (-528281238);
                        i8 = iM113012 ^ 319879643;
                        c135010 = c13509;
                    }
                    break;
                case -1079492482:
                case 778360118:
                    selectedItemPosition = selectedItemPosition;
                    s = f44614[37];
                    if (C0797.f3386) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۛ") ^ i5) * (-79);
                        i7 = ((iM11306 ^ i6) * 22483) ^ (-979943329);
                        i4 = 594378095;
                    } else {
                        iM11306 = C19806.m45029("᩷ᩴ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-29821)) ^ 1644527473;
                        i4 = 481049069;
                    }
                    int i18 = iM11306 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i18;
                    c135010 = c13509;
                    break;
                case -974603037:
                case -907757677:
                    C3535.m10431();
                    C0278.m1789();
                    break;
                case -902850192:
                case -69950154:
                    if (C1025.m3861() <= 0) {
                        selectedItemPosition = selectedItemPosition;
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۛ") ^ i5) * (-79);
                        i7 = ((iM11306 ^ i6) * 22483) ^ (-979943329);
                        i4 = 594378095;
                        int i19 = iM11306 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i19;
                        c135010 = c13509;
                    }
                    int iM113013 = ThreadFactoryC3888.m11306("ᩴ֫") ^ i6;
                    i7 = ((iM113013 ^ i5) * (-30171)) ^ (-528281238);
                    i8 = iM113013 ^ 319879643;
                    c135010 = c13509;
                    break;
                case -741730269:
                case 1945258372:
                    i9 = 48765;
                    iM11306 = (C19806.m45029("ۖ᩶") ^ i5) * (-117);
                    i7 = ((iM11306 ^ i6) * 18081) ^ (-144759599);
                    i4 = -978520726;
                    int i110 = iM11306 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i110;
                    c135010 = c13509;
                    break;
                case -686991674:
                case 1361419358:
                    selectedItemPosition = selectedItemPosition;
                    int i20 = s + 15343;
                    if ((i20 * i20) - i12 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܶ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 27351) ^ (-1967537174);
                        i4 = -1606330652;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩹") ^ i5) * 7;
                        i7 = ((iM11306 ^ i6) * (-27273)) ^ (-823176089);
                        i4 = -1260481586;
                    }
                    int i111 = iM11306 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i111;
                    c135010 = c13509;
                    break;
                case -640518756:
                case 1341216451:
                    selectedItemPosition = selectedItemPosition;
                    MenuItemOnMenuItemClickListenerC3244.m9709(c10142, C3660.m10790(sArr, i13, 4, i9), strM6236);
                    sArr3 = f44614;
                    if (C2124.f7782 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ᩶") ^ i5) * 77;
                        i2 = ((iM45029 ^ i6) * 1169) ^ (-1548350598);
                        i3 = -1475480796;
                    } else {
                        iM45029 = (C19806.m45029("᩵ܳ") + i5) * (-9);
                        i2 = ((iM45029 ^ i6) * (-7479)) ^ 1876878738;
                        i3 = 1472084833;
                    }
                    int i112 = selectedItemPosition;
                    i8 = iM45029 ^ i3;
                    i7 = i2;
                    selectedItemPosition = i112;
                    break;
                case -550401170:
                case 23993634:
                    selectedItemPosition = selectedItemPosition;
                    strM4832 = C1377.m4832(sArr3, 42, 4, i9);
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܶ") ^ i5;
                        i2 = ((iM45029 ^ i6) * 15677) ^ (-457336298);
                        i3 = 675834077;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۤ᩷")) * (-77);
                        i2 = ((iM45029 ^ i5) * (-1823)) ^ 530888210;
                        i3 = -217671728;
                    }
                    int i113 = selectedItemPosition;
                    i8 = iM45029 ^ i3;
                    i7 = i2;
                    selectedItemPosition = i113;
                    break;
                case -302860425:
                case 1982666329:
                    c10142.m25766(RunnableC1606.m5471(c11545), c14558);
                    short[] sArr4 = f44614;
                    if (CallableC1627.f6528) {
                        int iM450211 = (C19806.m45029("ۚ᩵") ^ i6) * 67;
                        int i21 = ((iM450211 ^ i5) * (-13237)) ^ 330361197;
                        i8 = iM450211 ^ 72203606;
                        sArr2 = sArr4;
                        i7 = i21;
                        i10 = 49;
                    } else {
                        selectedItemPosition = selectedItemPosition;
                        sArr2 = sArr4;
                        i10 = 49;
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۛ") ^ i5) * (-79);
                        i7 = ((iM11306 ^ i6) * 22483) ^ (-979943329);
                        i4 = 594378095;
                        int i114 = iM11306 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i114;
                        c135010 = c13509;
                    }
                    break;
                case -140614499:
                case 1894338873:
                    selectedItemPosition = selectedItemPosition;
                    int i22 = (s * s) + 235407649;
                    i12 = i22 + i22;
                    if (C1398.f5802 > 0) {
                        iM11306 = C19806.m45029("ۡ᩻") ^ i6;
                        i7 = ((iM11306 ^ i5) * 3263) ^ 1300628728;
                        i4 = -1173069751;
                        int i115 = iM11306 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i115;
                        c135010 = c13509;
                    }
                    selectedItemPosition = selectedItemPosition;
                    int iM113014 = ThreadFactoryC3888.m11306("ᩴ֫") ^ i6;
                    i7 = ((iM113014 ^ i5) * (-30171)) ^ (-528281238);
                    i8 = iM113014 ^ 319879643;
                    c135010 = c13509;
                    break;
                case 137070431:
                case 1265670526:
                    i9 = 63349;
                    iM11306 = (C19806.m45029("ۖ᩶") ^ i5) * (-117);
                    i7 = ((iM11306 ^ i6) * 18081) ^ (-144759599);
                    i4 = -978520726;
                    int i116 = iM11306 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i116;
                    c135010 = c13509;
                    break;
                case 225033306:
                case 436045780:
                    selectedItemPosition = selectedItemPosition;
                    strM6236 = ViewGroupOnHierarchyChangeListenerC1916.m6236(c135010.f44620);
                    sArr = f44614;
                    i13 = 38;
                    if (C2249.f8050 < 0) {
                        iM45029 = (i5 - C19806.m45029("ܺ۫")) * 69;
                        i2 = ((iM45029 ^ i6) * (-27185)) ^ 1358039074;
                        i3 = 715181469;
                        int i117 = selectedItemPosition;
                        i8 = iM45029 ^ i3;
                        i7 = i2;
                        selectedItemPosition = i117;
                    } else {
                        selectedItemPosition = selectedItemPosition;
                        int iM113015 = ThreadFactoryC3888.m11306("ᩴ֫") ^ i6;
                        i7 = ((iM113015 ^ i5) * (-30171)) ^ (-528281238);
                        i8 = iM113015 ^ 319879643;
                        c135010 = c13509;
                    }
                    break;
                case 1938828127:
                case 1943007739:
                    C0671.m3008();
                    if (C3535.f13026 > 0) {
                        int iM113016 = ThreadFactoryC3888.m11306("ᩴ֫") ^ i6;
                        i7 = ((iM113016 ^ i5) * (-30171)) ^ (-528281238);
                        i8 = iM113016 ^ 319879643;
                        c135010 = c13509;
                    } else {
                        selectedItemPosition = selectedItemPosition;
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ᩶") ^ i5) * 77;
                        i2 = ((iM45029 ^ i6) * 1169) ^ (-1548350598);
                        i3 = -1475480796;
                        int i118 = selectedItemPosition;
                        i8 = iM45029 ^ i3;
                        i7 = i2;
                        selectedItemPosition = i118;
                    }
                    break;
                default:
                    C1419.m4973();
                    selectedItemPosition = selectedItemPosition;
                    iM45029 = (ThreadFactoryC3888.m11306("ۢ᩶") ^ i5) * 77;
                    i2 = ((iM45029 ^ i6) * 1169) ^ (-1548350598);
                    i3 = -1475480796;
                    int i119 = selectedItemPosition;
                    i8 = iM45029 ^ i3;
                    i7 = i2;
                    selectedItemPosition = i119;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0201 A[PHI: r6 r8 r9
      0x0201: PHI (r6v8 int) = (r6v4 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:56:0x01ff, B:40:0x014e, B:32:0x00fe, B:110:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r8v8 int) = (r8v2 int), (r8v4 int), (r8v2 int), (r8v2 int) binds: [B:56:0x01ff, B:40:0x014e, B:32:0x00fe, B:110:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r9v8 int) = (r9v2 int), (r9v2 int), (r9v4 int), (r9v2 int) binds: [B:56:0x01ff, B:40:0x014e, B:32:0x00fe, B:110:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if (l.RunnableC0195.f1321 >= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (l.C1419.m4973() == false) goto L13;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemSelected(android.widget.AdapterView r20, android.view.View r21, int r22, long r23) {
        /*
            Method dump skipped, instruction units count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13509.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x01cf  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33035(C2455 c2455, C22918 c22918, int i, C4335 c4335) throws Exception {
        int iM45029;
        int i2;
        int i3;
        int i4;
        int i5;
        Exception exc;
        int i6;
        int i7;
        List list;
        C2455 c2456;
        int iM450210;
        int i8;
        int i9;
        C4335 c4336;
        int iM450211;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM450212;
        int i15;
        int i16;
        int i17;
        int i18;
        int iM450213;
        int i19;
        int i20;
        int i21;
        List list2;
        C2455 c2457 = c2455;
        c22918 = c22918;
        c4335 = c4335;
        int i22 = C2788.f10625;
        int i23 = C0050.f912;
        int iM11306 = ThreadFactoryC3888.m11306("ۛ᩶") ^ i23;
        int i24 = ((iM11306 ^ i22) * 14251) ^ 1754815571;
        C2299[] c2299Arr = null;
        C9648[] c9648Arr = null;
        ArrayList arrayList = null;
        List list3 = null;
        InterfaceC21570[] interfaceC21570ArrM48061 = null;
        Iterator itM9863 = null;
        C12107 c12107 = null;
        Exception exc2 = null;
        int i25 = iM11306 ^ (-341146314);
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int iM18986 = 0;
        char c = 0;
        char c2 = 0;
        int i29 = 0;
        boolean zM10564 = false;
        int i30 = 0;
        boolean zM9789 = false;
        C7474[] c7474Arr = null;
        boolean zM3748 = false;
        int i31 = 0;
        HashSet hashSet = null;
        C5122 c5122 = null;
        int[] iArr = null;
        Iterator itM9864 = null;
        int i32 = 0;
        int i33 = 1027674899;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            i33 = i25 ^ (i24 & (((i33 ^ i22) * 19857) >> 31));
            switch (i33) {
                case -2050221088:
                case -226869603:
                    i12 = 48095;
                    int iM11307 = ThreadFactoryC3888.m11306("ܰ᩻") ^ i22;
                    int i36 = ((iM11307 ^ i23) * 535) ^ (-1739891700);
                    c22918 = c22918;
                    c4335 = c4335;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    i25 = iM11307 ^ 825186594;
                    c2457 = c2457;
                    i33 = i33;
                    i34 = i12;
                    i24 = i36;
                    break;
                case -1909484075:
                case 1564162140:
                    C1377.m4841(c4335, ThreadFactoryC3888.m11306(C1460.m5047(f44614, 96, 3, i34)) ^ 2097349239);
                    C1461.m5085(arrayList);
                    iArr[i32] = i32;
                    i30 = i31;
                    iM45029 = (ThreadFactoryC3888.m11306("᩹۟") + i23) * (-25);
                    i2 = ((iM45029 ^ i22) * 1573) ^ (-805778494);
                    i3 = -16289883;
                    i25 = i3 ^ iM45029;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -1876115377:
                case 1124845613:
                    int i37 = i26;
                    Exception exc3 = exc2;
                    int i38 = i27;
                    List list4 = list3;
                    C4335 c4337 = c4335;
                    c = 0;
                    if (i28 < iM18986) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۧۚ") ^ i23) * (-51);
                        i2 = ((iM450210 ^ i22) * (-1787)) ^ 1441270816;
                        i8 = 1034820862;
                    } else {
                        iM450210 = C19806.m45029("ۢܽ") ^ i22;
                        i2 = ((iM450210 ^ i23) * (-24327)) ^ (-648349461);
                        i8 = -1500699206;
                    }
                    i9 = iM450210 ^ i8;
                    c4335 = c4337;
                    list3 = list4;
                    i26 = i37;
                    exc2 = exc3;
                    i27 = i38;
                    c2457 = c2455;
                    i25 = i9;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -1759347065:
                case 1599932567:
                    MenuItemOnMenuItemClickListenerC3244.m9710(arrayList);
                    C3286.m9779(c9648Arr[c2]);
                    String strM29933 = C12035.m29933(i35 + 1);
                    C0278.m1784(c4335, strM29933);
                    m33034(c22918, c9648Arr[c2].m24543(c4335), strM29933);
                    return;
                case -1484721618:
                case 992216295:
                    int i39 = i34;
                    int i40 = i26;
                    Exception exc4 = exc2;
                    int i41 = i27;
                    C4335 c4338 = c4335;
                    C2455 c2458 = c2457;
                    List list5 = list3;
                    short s = f44614[77];
                    int i42 = s + 13901;
                    int i43 = (s * s) + 193237801;
                    if ((i42 * i42) - (i43 + i43) > 0) {
                        iM450211 = (C19806.m45029("᩵֫") ^ i22) * (-21);
                        i10 = ((iM450211 ^ i23) * 3031) ^ 370047531;
                        i11 = 1851956784;
                    } else {
                        iM450211 = (C19806.m45029("ۧ֨") ^ i23) * (-69);
                        i10 = ((iM450211 ^ i22) * (-14137)) ^ (-1051986595);
                        i11 = -1964631381;
                    }
                    c22918 = c22918;
                    c4335 = c4338;
                    list3 = list5;
                    i26 = i40;
                    exc2 = exc4;
                    i27 = i41;
                    i25 = iM450211 ^ i11;
                    i24 = i10;
                    c2457 = c2458;
                    i33 = i33;
                    i34 = i39;
                    break;
                case -1406234734:
                case -66569563:
                    zM3748 = C0962.m3748(itM9864);
                    iM45029 = (i23 - ThreadFactoryC3888.m11306("ۧ᩶")) * 21;
                    i2 = ((iM45029 ^ i22) * (-19533)) ^ 2065174277;
                    i3 = 1009477229;
                    i25 = i3 ^ iM45029;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -1335973817:
                case 76077584:
                    zM9789 = C3286.m9789(arrayList);
                    iM45029 = (i23 - C19806.m45029("ۢۤ")) * 109;
                    i2 = ((iM45029 ^ i22) * 22603) ^ 1729988046;
                    i3 = -1601367003;
                    i25 = i3 ^ iM45029;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -1328577287:
                case 465368447:
                    i26 = iArr[i32];
                    iM45029 = C19806.m45029("ۗ۟") ^ i22;
                    i2 = ((iM45029 ^ i23) * 409) ^ (-1607840635);
                    i3 = 399531870;
                    i25 = i3 ^ iM45029;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -1323951979:
                case -1102765450:
                    i15 = i34;
                    int i44 = i26;
                    Exception exc5 = exc2;
                    i16 = i27;
                    i17 = i28;
                    i18 = iM18986;
                    List list6 = list3;
                    if (C0962.m3748(itM9863)) {
                        iM450213 = (ThreadFactoryC3888.m11306("ܰ᩹") + i23) * (-23);
                        i19 = ((iM450213 ^ i22) * 30083) ^ 1558150741;
                        i20 = -549786472;
                    } else {
                        iM450213 = (C19806.m45029("ᩴۙ") + i22) * (-127);
                        i19 = ((iM450213 ^ i23) * (-5857)) ^ (-1080723656);
                        i20 = -2088615764;
                    }
                    i25 = i20 ^ iM450213;
                    i24 = i19;
                    list3 = list6;
                    i26 = i44;
                    exc2 = exc5;
                    i27 = i16;
                    i34 = i15;
                    iM18986 = i18;
                    i28 = i17;
                    c2457 = c2455;
                    break;
                case -1153075961:
                case 801812243:
                    if (!zM10564) {
                        iM45029 = (C19806.m45029("۠ܿ") ^ i22) * 23;
                        i2 = ((iM45029 ^ i23) * (-18005)) ^ (-591142302);
                        i3 = -2002165066;
                        i25 = i3 ^ iM45029;
                        i24 = i2;
                        i33 = i33;
                    } else {
                        i4 = i34;
                        i5 = i26;
                        exc = exc2;
                        i6 = i27;
                        i7 = iM18986;
                        list = list3;
                        iM450212 = C19806.m45029("ۨۙ") ^ i22;
                        i14 = ((iM450212 ^ i23) * 18039) ^ 685665498;
                        i13 = -1731384774;
                        i25 = i13 ^ iM450212;
                        c22918 = c22918;
                        c4335 = c4335;
                        i24 = i14;
                        list3 = list;
                        i33 = i33;
                        i26 = i5;
                        exc2 = exc;
                        i27 = i6;
                        i34 = i4;
                        iM18986 = i7;
                        c2457 = c2455;
                    }
                    break;
                case -1036095648:
                case -920174096:
                    if (i26 > 20971520) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨܳ") ^ i22;
                        i2 = ((iM45029 ^ i23) * (-8269)) ^ (-1630423475);
                        i3 = 1706074074;
                    } else {
                        i30 = i29;
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۟") + i23) * (-25);
                        i2 = ((iM45029 ^ i22) * 1573) ^ (-805778494);
                        i3 = -16289883;
                    }
                    i25 = i3 ^ iM45029;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -850875992:
                case 1894577103:
                    if (zM9789) {
                        i30 = i29;
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۟") + i23) * (-25);
                        i2 = ((iM45029 ^ i22) * 1573) ^ (-805778494);
                        i3 = -16289883;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩵") ^ i23;
                        i2 = ((iM45029 ^ i22) * (-9353)) ^ (-1589520467);
                        i3 = 233970923;
                    }
                    i25 = i3 ^ iM45029;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -837810817:
                case 187352553:
                    try {
                        Object[] objArr = new Object[i27];
                        objArr[c] = C3722.m10896(c12107);
                        C0216.m1581(c4335, C0278.m1786(ThreadFactoryC3888.m11306(RunnableC1606.m5481(f44614, 84, 3, i34)) ^ 2099969431, objArr));
                        c4335.mo21455(0);
                        C19806.m45029(C2249.m6918(f44614, 87, 3, i34));
                        try {
                            ThreadFactoryC3888.m11306(C3722.m10901(f44614, 90, 3, i34));
                            i21 = i26;
                            Exception exc6 = exc2;
                            i16 = i27;
                            i15 = i34;
                            i18 = iM18986;
                            i17 = i28;
                            list2 = list3;
                            try {
                                try {
                                    new C17408(c2455, c12107, interfaceC21570ArrM48061, i28, iArr, c9648Arr, c7474Arr, c4335, hashSet, c5122, c2299Arr, i, arrayList).m40576();
                                    zM10564 = C3577.m10564(c4335);
                                    int iM11308 = (i23 - ThreadFactoryC3888.m11306("֡֡")) * (-33);
                                    i25 = iM11308 ^ (-1780738854);
                                    c22918 = c22918;
                                    c4335 = c4335;
                                    i24 = ((iM11308 ^ i22) * (-9585)) ^ 766300977;
                                    list3 = list2;
                                    i33 = i33;
                                    i26 = i21;
                                    exc2 = exc6;
                                    i27 = i16;
                                    i34 = i15;
                                    iM18986 = i18;
                                    i28 = i17;
                                    i32 = 0;
                                } catch (Exception e) {
                                    exc2 = e;
                                    i32 = 0;
                                    int iM450214 = C19806.m45029("ۗ᩻") ^ i23;
                                    i25 = 62292202 ^ iM450214;
                                    i24 = ((iM450214 ^ i22) * 22581) ^ 1205442259;
                                    list3 = list2;
                                    i26 = i21;
                                    i27 = i16;
                                    i34 = i15;
                                    iM18986 = i18;
                                    i28 = i17;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i32 = 0;
                                exc2 = e;
                                int iM450215 = C19806.m45029("ۗ᩻") ^ i23;
                                i25 = 62292202 ^ iM450215;
                                i24 = ((iM450215 ^ i22) * 22581) ^ 1205442259;
                                list3 = list2;
                                i26 = i21;
                                i27 = i16;
                                i34 = i15;
                                iM18986 = i18;
                                i28 = i17;
                                c2457 = c2455;
                                break;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i15 = i34;
                            i21 = i26;
                            i16 = i27;
                            i17 = i28;
                            i18 = iM18986;
                            list2 = list3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        i15 = i34;
                        i21 = i26;
                        i16 = i27;
                        i17 = i28;
                        i18 = iM18986;
                        list2 = list3;
                    }
                    c2457 = c2455;
                    break;
                case -457094465:
                case 624393185:
                    HashSet hashSet2 = new HashSet();
                    C5122 c5123 = new C5122();
                    C2299[] c2299Arr2 = {new C2299()};
                    ArrayList arrayList2 = new ArrayList();
                    c2456 = c2455;
                    List listM7472 = c2456.m7472(false);
                    c7474Arr = new C7474[]{null};
                    arrayList = arrayList2;
                    hashSet = hashSet2;
                    c5122 = c5123;
                    c9648Arr = new C9648[]{null};
                    c2299Arr = c2299Arr2;
                    iArr = new int[]{0};
                    interfaceC21570ArrM48061 = C21444.m48061(c2456, listM7472);
                    iM18986 = C7105.m18986(listM7472);
                    i27 = 1;
                    i28 = 0;
                    i29 = 0;
                    list3 = listM7472;
                    int iM450216 = C19806.m45029("ۨܰ") ^ i23;
                    i2 = ((iM450216 ^ i22) * 2657) ^ 561116991;
                    i9 = iM450216 ^ (-603552540);
                    c22918 = c22918;
                    c4335 = c4335;
                    c2457 = c2456;
                    i26 = i26;
                    exc2 = exc2;
                    i34 = i34;
                    i25 = i9;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -298177650:
                case 2139418000:
                    i4 = i34;
                    i5 = i26;
                    exc = exc2;
                    i6 = i27;
                    i7 = iM18986;
                    list = list3;
                    c12107 = (C12107) C2477.m7592(list, i28);
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9866(c4335)) {
                        iM450212 = C19806.m45029("ۨۙ") ^ i22;
                        i14 = ((iM450212 ^ i23) * 18039) ^ 685665498;
                        i13 = -1731384774;
                    } else {
                        iM450212 = ThreadFactoryC3888.m11306("ۢ᩹") ^ i23;
                        i14 = ((iM450212 ^ i22) * 6301) ^ 2037622284;
                        i13 = 1191228381;
                    }
                    i25 = i13 ^ iM450212;
                    c22918 = c22918;
                    c4335 = c4335;
                    i24 = i14;
                    list3 = list;
                    i33 = i33;
                    i26 = i5;
                    exc2 = exc;
                    i27 = i6;
                    i34 = i4;
                    iM18986 = i7;
                    c2457 = c2455;
                    break;
                case -281188676:
                case 1104702295:
                    C1377.m4841(c4335, C19806.m45029(RunnableC3388.m10056(f44614, 93, 3, i34)) ^ 2130552120);
                    itM9864 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList);
                    i31 = i29;
                    iM45029 = ThreadFactoryC3888.m11306("ۤۘ") ^ i22;
                    i2 = ((iM45029 ^ i23) * (-6161)) ^ 161804696;
                    i3 = 702942215;
                    i25 = i3 ^ iM45029;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -147903596:
                case 1754090831:
                    C9648 c9648 = (C9648) C0278.m1776(itM9863);
                    i35++;
                    String strM29934 = C12035.m29933(i35);
                    C0278.m1784(c4335, strM29934);
                    m33034(c22918, c9648.m24543(c4335), strM29934);
                    c4336 = c4335;
                    int iM11309 = ThreadFactoryC3888.m11306("᩵֨") ^ i22;
                    i2 = ((iM11309 ^ i23) * (-31889)) ^ 1384386905;
                    i9 = iM11309 ^ 1694223248;
                    c4335 = c4336;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    iM18986 = iM18986;
                    c2457 = c2455;
                    i25 = i9;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -93912821:
                case 163699375:
                    try {
                        C9648 c9649 = (C9648) C0278.m1776(itM9864);
                        int i45 = i31 + 1;
                        String strM29935 = C12035.m29933(i45);
                        C0216.m1581(c4335, strM29935);
                        m33034(c22918, c9649.m24543(c4335), strM29935);
                        i31 = i45;
                        iM45029 = ThreadFactoryC3888.m11306("ۤۘ") ^ i22;
                        i2 = ((iM45029 ^ i23) * (-6161)) ^ 161804696;
                        i3 = 702942215;
                        i25 = i3 ^ iM45029;
                        i24 = i2;
                        i33 = i33;
                    } catch (Exception e5) {
                        exc2 = e5;
                        i15 = i34;
                        i21 = i26;
                        i16 = i27;
                        i17 = i28;
                        i18 = iM18986;
                        list2 = list3;
                        int iM450217 = C19806.m45029("ۗ᩻") ^ i23;
                        i25 = 62292202 ^ iM450217;
                        i24 = ((iM450217 ^ i22) * 22581) ^ 1205442259;
                        list3 = list2;
                        i26 = i21;
                        i27 = i16;
                        i34 = i15;
                        iM18986 = i18;
                        i28 = i17;
                        c2457 = c2455;
                    }
                    break;
                case -68926786:
                case 488582960:
                    i12 = 36611;
                    int iM113010 = ThreadFactoryC3888.m11306("ܰ᩻") ^ i22;
                    int i310 = ((iM113010 ^ i23) * 535) ^ (-1739891700);
                    c22918 = c22918;
                    c4335 = c4335;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    i25 = iM113010 ^ 825186594;
                    c2457 = c2457;
                    i33 = i33;
                    i34 = i12;
                    i24 = i310;
                    break;
                case 54624489:
                case 986086586:
                    if (zM3748) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۛ") + i22) * (-27);
                        i2 = ((iM45029 ^ i23) * (-21721)) ^ 1167218584;
                        i3 = -1793917044;
                    } else {
                        iM45029 = C19806.m45029("ۢܰ") ^ i22;
                        i2 = ((iM45029 ^ i23) * 13129) ^ (-619908902);
                        i3 = -1999303164;
                    }
                    i25 = i3 ^ iM45029;
                    i24 = i2;
                    i33 = i33;
                    break;
                case 662715611:
                case 1294146589:
                    return;
                case 986383349:
                case 1887520538:
                    i28++;
                    c2456 = c2457;
                    i29 = i30;
                    i27 = 1;
                    int iM450218 = C19806.m45029("ۨܰ") ^ i23;
                    i2 = ((iM450218 ^ i22) * 2657) ^ 561116991;
                    i9 = iM450218 ^ (-603552540);
                    c22918 = c22918;
                    c4335 = c4335;
                    c2457 = c2456;
                    i26 = i26;
                    exc2 = exc2;
                    i34 = i34;
                    i25 = i9;
                    i24 = i2;
                    i33 = i33;
                    break;
                case 1683245858:
                case 1935873015:
                    c4336 = c4335;
                    C1377.m4841(c4336, C19806.m45029(ViewTreeObserverOnPreDrawListenerC3327.m9869(f44614, 78, 3, i34)) ^ 2102876576);
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList);
                    i35 = i29;
                    c2 = 0;
                    int iM113011 = ThreadFactoryC3888.m11306("᩵֨") ^ i22;
                    i2 = ((iM113011 ^ i23) * (-31889)) ^ 1384386905;
                    i9 = iM113011 ^ 1694223248;
                    c4335 = c4336;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    iM18986 = iM18986;
                    c2457 = c2455;
                    i25 = i9;
                    i24 = i2;
                    i33 = i33;
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    C1148.m4223(sb, C1398.m4893(exc2));
                    C1148.m4223(sb, C2249.m6918(f44614, 81, 2, i34));
                    C2788.m8480(sb, RunnableC1895.m6169(c12107));
                    C1148.m4223(sb, C1937.m6288(f44614, 83, 1, i34));
                    throw new Exception(C0817.m3407(sb), exc2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33031(C2455 c2455, C22918 c22918, int i, C4335 c4335) throws Throwable {
        int i2;
        int i3;
        int i4;
        List list;
        int iM45029;
        int i5;
        int i6;
        List list2;
        boolean z;
        List listM7472;
        int iM450210;
        int i7;
        int i8;
        int iM11306;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iM11307;
        int i18;
        int i19;
        int iM450211;
        int i20;
        int i21;
        int i22;
        boolean zM10564 = false;
        Iterator itM5072 = null;
        boolean zM5348 = false;
        C9648[] c9648Arr = null;
        List[] listArr = null;
        boolean zM4964 = false;
        int i23 = 81401047;
        int i24 = C3660.f13403;
        int i25 = C3577.f13150;
        int iM450212 = C19806.m45029("ܶ۠") ^ i25;
        int i26 = ((iM450212 ^ i24) * (-17073)) ^ (-1703579905);
        int i27 = iM450212 ^ 1677778749;
        C5122 c5122 = null;
        C6119 c6119 = null;
        Boolean bool = null;
        List list3 = null;
        Throwable th = null;
        Boolean[] boolArr = null;
        C12107 c12107 = null;
        String strM29933 = null;
        C9648 c9648 = null;
        String strM6674 = null;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        boolean z2 = false;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        boolean zM9866 = false;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        HashSet hashSet = null;
        InterfaceC21570[] interfaceC21570ArrM48061 = null;
        AbstractC20745 abstractC20745M4219 = null;
        int i39 = 0;
        while (true) {
            i23 = i27 ^ (i26 & (((i23 ^ i24) * 16949) >> 31));
            switch (i23) {
                case -2140943960:
                case -1435553062:
                    i29 = i29;
                    strM6674 = strM6674;
                    i31 = c6119.f20903;
                    iM450211 = (C19806.m45029("ᩳۡ") + i24) * 41;
                    i20 = ((iM450211 ^ i25) * (-1631)) ^ (-681346126);
                    i21 = -1947748621;
                    i22 = iM450211 ^ i21;
                    strM6674 = strM6674;
                    int i40 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i40;
                    break;
                case -2058854680:
                case 358353031:
                    RunnableC3388.m10052(abstractC20745M4219);
                    return;
                case -2021265189:
                case 1315457132:
                    C0526.m2436(abstractC20745M4219);
                    return;
                case -1969922597:
                case -315163361:
                    i29 = i29;
                    strM6674 = strM6674;
                    zM5348 = RunnableC1564.m5348(itM5072);
                    iM450211 = C19806.m45029("᩸᩻") ^ i25;
                    i20 = ((iM450211 ^ i24) * 31045) ^ 1599213046;
                    i21 = -964107846;
                    i22 = iM450211 ^ i21;
                    strM6674 = strM6674;
                    int i41 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i41;
                    break;
                case -1875197921:
                case 1517237623:
                    strM6674 = strM6674;
                    i28 = 0;
                    iM11307 = ThreadFactoryC3888.m11306("ܶ۫") ^ i25;
                    i18 = ((iM11307 ^ i24) * 3065) ^ (-1448481909);
                    i19 = -2116008823;
                    i27 = iM11307 ^ i19;
                    i26 = i18;
                    strM6674 = strM6674;
                    break;
                case -1813196804:
                case 1730770374:
                    i4 = i37;
                    list = list3;
                    i39 = 54279;
                    int iM450213 = (i24 - C19806.m45029("ۛۧ")) * 43;
                    i9 = ((iM450213 ^ i25) * (-7967)) ^ 832733859;
                    i11 = iM450213 ^ (-1520118720);
                    i31 = i31;
                    strM29933 = strM29933;
                    strM6674 = strM6674;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC20745M4219 = abstractC20745M4219;
                    i27 = i11;
                    i36 = i36;
                    i26 = i9;
                    i29 = i29;
                    C9648 c9649 = c9648;
                    i37 = i4;
                    c9648 = c9649;
                    int i42 = i33;
                    list3 = list;
                    i33 = i42;
                    break;
                case -1722276746:
                case -425101672:
                    i29 = i29;
                    strM6674 = strM6674;
                    C9648[] c9648Arr2 = c6119.f20906;
                    try {
                        List[] listArr2 = c6119.f20904;
                        int iM450214 = (i24 - C19806.m45029("ۖܺ")) * (-113);
                        i26 = ((iM450214 ^ i25) * (-29869)) ^ (-1444137215);
                        listArr = listArr2;
                        strM6674 = strM6674;
                        c9648Arr = c9648Arr2;
                        i29 = i29;
                        i27 = iM450214 ^ 1892410485;
                    } catch (Throwable th2) {
                        th = th2;
                        c9648Arr = c9648Arr2;
                        i29 = i29;
                        i2 = i39;
                        i3 = i31;
                        int i43 = i37;
                        c9648 = c9648;
                        i4 = i43;
                        List list4 = list3;
                        i33 = i33;
                        list = list4;
                        th = th;
                        i30 = i30;
                        z2 = z2;
                        int iM450215 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                        i14 = ((iM450215 ^ i25) * (-22765)) ^ (-1174288077);
                        i15 = iM450215 ^ 904147881;
                        i39 = i2;
                        i31 = i3;
                        strM29933 = strM29933;
                        strM6674 = strM6674;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC20745M4219 = abstractC20745M4219;
                        i36 = i36;
                        int i44 = i28;
                        i27 = i15;
                        i26 = i14;
                        i28 = i44;
                        C9648 c96410 = c9648;
                        i37 = i4;
                        c9648 = c96410;
                        int i45 = i33;
                        list3 = list;
                        i33 = i45;
                    }
                    break;
                case -1721446855:
                case -1238853156:
                    i29 = i29;
                    strM6674 = strM6674;
                    i32 = c6119.f20905;
                    iM450211 = ThreadFactoryC3888.m11306("ܿ֨") ^ i24;
                    i20 = ((iM450211 ^ i25) * 10369) ^ (-1569224465);
                    i21 = 1959190033;
                    i22 = iM450211 ^ i21;
                    strM6674 = strM6674;
                    int i46 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i46;
                    break;
                case -1511983223:
                case 1213365327:
                    i29 = i29;
                    strM6674 = strM6674;
                    try {
                        c6119.f20905 = z2 ? 1 : 0;
                        Runtime.getRuntime().gc();
                        iM450211 = (C19806.m45029("᩺᩺") + i24) * (-29);
                        i20 = ((iM450211 ^ i25) * (-1347)) ^ (-357910256);
                        i21 = -221539157;
                        i22 = iM450211 ^ i21;
                        strM6674 = strM6674;
                        int i47 = i29;
                        i27 = i22;
                        i26 = i20;
                        i29 = i47;
                    } catch (Throwable th3) {
                        th = th3;
                        i29 = i29;
                        i28 = i28;
                        i2 = i39;
                        i3 = i31;
                        int i48 = i37;
                        c9648 = c9648;
                        i4 = i48;
                        List list5 = list3;
                        i33 = i33;
                        list = list5;
                        th = th;
                        strM29933 = strM29933;
                        z2 = z2;
                        int iM450216 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                        i14 = ((iM450216 ^ i25) * (-22765)) ^ (-1174288077);
                        i15 = iM450216 ^ 904147881;
                        i39 = i2;
                        i31 = i3;
                        strM29933 = strM29933;
                        strM6674 = strM6674;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC20745M4219 = abstractC20745M4219;
                        i36 = i36;
                        int i49 = i28;
                        i27 = i15;
                        i26 = i14;
                        i28 = i49;
                        C9648 c96411 = c9648;
                        i37 = i4;
                        c9648 = c96411;
                        int i410 = i33;
                        list3 = list;
                        i33 = i410;
                    }
                    break;
                case -1508807669:
                case 404784674:
                    i35 = i28 + 1;
                    strM29933 = C12035.m29933(i35);
                    C0216.m1581(c4335, strM29933);
                    c4335.mo21455(z2 ? 1 : 0);
                    C9648[] c9648Arr3 = c6119.f20906;
                    c9648 = c9648Arr3[i28];
                    c9648Arr3[i28] = null;
                    itM5072 = C1461.m5072(c6119.f20904[i28]);
                    iM450211 = ThreadFactoryC3888.m11306("ᩴ۟") ^ i24;
                    i20 = ((iM450211 ^ i25) * (-24919)) ^ (-1786056585);
                    i21 = 2057037495;
                    i22 = iM450211 ^ i21;
                    strM6674 = strM6674;
                    int i411 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i411;
                    break;
                case -1471078519:
                case 1953181523:
                    i29 = i29;
                    strM6674 = strM6674;
                    if (zM10564) {
                        iM450211 = C19806.m45029("ۖ᩸") ^ i25;
                        i20 = ((iM450211 ^ i24) * 4653) ^ (-899303579);
                        i21 = -1886280522;
                    } else {
                        iM450211 = C19806.m45029("ۢܰ") ^ i24;
                        i20 = ((iM450211 ^ i25) * (-28285)) ^ (-1229333441);
                        i21 = 248132596;
                    }
                    i22 = iM450211 ^ i21;
                    strM6674 = strM6674;
                    int i412 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i412;
                    break;
                case -1437055529:
                case -1263855620:
                    i33++;
                    iM450211 = C19806.m45029("᩶ܿ") ^ i25;
                    i20 = ((iM450211 ^ i24) * 31143) ^ 1773594557;
                    i21 = 447590514;
                    i22 = iM450211 ^ i21;
                    strM6674 = strM6674;
                    int i413 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i413;
                    break;
                case -1295339163:
                case -1273192682:
                    i28 = i28;
                    i29 = i29;
                    strM6674 = strM6674;
                    abstractC20745M4219 = abstractC20745M4219;
                    Object[] objArr = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM29933 = strM29933;
                    i2 = i39;
                    i3 = i31;
                    int i50 = i37;
                    c9648 = c9648;
                    i4 = i50;
                    List list6 = list3;
                    i33 = i33;
                    list2 = list6;
                    try {
                        ViewTreeObserverOnPreDrawListenerC3327.m9871(abstractC20745M4219);
                        try {
                            listM7472 = c2455.m7472(z2);
                            try {
                                interfaceC21570ArrM48061 = C21444.m48061(c2455, listM7472);
                                try {
                                    Boolean[] boolArr2 = new Boolean[1];
                                    try {
                                        boolArr2[z2 ? 1 : 0] = bool;
                                        int iM18986 = C7105.m18986(listM7472);
                                        int iM11308 = (ThreadFactoryC3888.m11306("ܽ۠") + i24) * (-57);
                                        boolArr = boolArr2;
                                        i31 = i3;
                                        i33 = i33;
                                        c9648 = c9648;
                                        strM29933 = strM29933;
                                        i29 = i29;
                                        i38 = i38;
                                        abstractC20745M4219 = abstractC20745M4219;
                                        i36 = i36;
                                        i34 = 1;
                                        i37 = iM18986;
                                        list3 = listM7472;
                                        i26 = ((iM11308 ^ i25) * 24701) ^ 1379581169;
                                        strM6674 = strM6674;
                                        i28 = i28;
                                        i27 = iM11308 ^ 1964520516;
                                        i39 = i2;
                                        i32 = i32;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        boolArr = boolArr2;
                                        i34 = 1;
                                        th = th;
                                        list = listM7472;
                                        int iM450217 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                                        i14 = ((iM450217 ^ i25) * (-22765)) ^ (-1174288077);
                                        i15 = iM450217 ^ 904147881;
                                        i39 = i2;
                                        i31 = i3;
                                        strM29933 = strM29933;
                                        strM6674 = strM6674;
                                        i29 = i29;
                                        i38 = i38;
                                        i32 = i32;
                                        abstractC20745M4219 = abstractC20745M4219;
                                        i36 = i36;
                                        int i414 = i28;
                                        i27 = i15;
                                        i26 = i14;
                                        i28 = i414;
                                        C9648 c96412 = c9648;
                                        i37 = i4;
                                        c9648 = c96412;
                                        int i415 = i33;
                                        list3 = list;
                                        i33 = i415;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                listM7472 = listM7472;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            listM7472 = list2;
                            th = th;
                            list = listM7472;
                            int iM450218 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                            i14 = ((iM450218 ^ i25) * (-22765)) ^ (-1174288077);
                            i15 = iM450218 ^ 904147881;
                            i39 = i2;
                            i31 = i3;
                            strM29933 = strM29933;
                            strM6674 = strM6674;
                            i29 = i29;
                            i38 = i38;
                            i32 = i32;
                            abstractC20745M4219 = abstractC20745M4219;
                            i36 = i36;
                            int i416 = i28;
                            i27 = i15;
                            i26 = i14;
                            i28 = i416;
                            C9648 c96413 = c9648;
                            i37 = i4;
                            c9648 = c96413;
                            int i417 = i33;
                            list3 = list;
                            i33 = i417;
                            break;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        z2 = objArr == true ? 1 : 0;
                    }
                    break;
                case -1210360149:
                case -889988401:
                    i28 = i28;
                    i29 = i29;
                    strM6674 = strM6674;
                    abstractC20745M4219 = abstractC20745M4219;
                    z2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM29933 = strM29933;
                    i2 = i39;
                    i3 = i31;
                    int i51 = i37;
                    c9648 = c9648;
                    i4 = i51;
                    List list7 = list3;
                    i33 = i33;
                    list = list7;
                    try {
                        C0050.m934(c4335, ThreadFactoryC3888.m11306(C1377.m4832(f44614, 26, 3, i2)) ^ 2120719254);
                        Arrays.fill(c6119.f20902, (Object) null);
                        Runtime.getRuntime().gc();
                        iM45029 = (C19806.m45029("ܶ֫") ^ i25) * (-55);
                        i5 = ((iM45029 ^ i24) * (-16001)) ^ 8249923;
                        i6 = 770427145;
                        i13 = iM45029 ^ i6;
                        i39 = i2;
                        i31 = i3;
                        strM6674 = strM6674;
                        i28 = i28;
                        i29 = i29;
                        i32 = i32;
                        abstractC20745M4219 = abstractC20745M4219;
                        i36 = i36;
                        z2 = z2;
                        i27 = i13;
                        i26 = i5;
                        strM29933 = strM29933;
                        i38 = i38;
                        C9648 c96414 = c9648;
                        i37 = i4;
                        c9648 = c96414;
                        int i418 = i33;
                        list3 = list;
                        i33 = i418;
                    } catch (Throwable th9) {
                        th = th9;
                        strM29933 = strM29933;
                        th = th;
                        strM29933 = strM29933;
                        z2 = z2;
                        int iM450219 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                        i14 = ((iM450219 ^ i25) * (-22765)) ^ (-1174288077);
                        i15 = iM450219 ^ 904147881;
                        i39 = i2;
                        i31 = i3;
                        strM29933 = strM29933;
                        strM6674 = strM6674;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC20745M4219 = abstractC20745M4219;
                        i36 = i36;
                        int i419 = i28;
                        i27 = i15;
                        i26 = i14;
                        i28 = i419;
                        C9648 c96415 = c9648;
                        i37 = i4;
                        c9648 = c96415;
                        int i4110 = i33;
                        list3 = list;
                        i33 = i4110;
                    }
                    break;
                case -1198271717:
                case 11610231:
                    try {
                        StringBuilder sb = new StringBuilder();
                        try {
                            strM6674 = strM6674;
                            i29 = i29;
                            try {
                                C2788.m8480(sb, C1398.m4892(f44614, 32, 1, i39));
                                C2124.m6683(sb, i33);
                                C2788.m8480(sb, C1398.m4892(f44614, 33, 4, i39));
                                strM6674 = C2124.m6674(sb);
                                int iM11309 = ThreadFactoryC3888.m11306("᩹ܰ") ^ i25;
                                i20 = ((iM11309 ^ i24) * (-15057)) ^ (-140279805);
                                i22 = iM11309 ^ (-628224084);
                                int i4111 = i29;
                                i27 = i22;
                                i26 = i20;
                                i29 = i4111;
                            } catch (Throwable th10) {
                                th = th10;
                                i29 = i29;
                                i2 = i39;
                                i3 = i31;
                                int i420 = i37;
                                c9648 = c9648;
                                i4 = i420;
                                List list8 = list3;
                                i33 = i33;
                                list = list8;
                                th = th;
                                i30 = i30;
                                z2 = z2;
                                int iM4502110 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                                i14 = ((iM4502110 ^ i25) * (-22765)) ^ (-1174288077);
                                i15 = iM4502110 ^ 904147881;
                                i39 = i2;
                                i31 = i3;
                                strM29933 = strM29933;
                                strM6674 = strM6674;
                                i29 = i29;
                                i38 = i38;
                                i32 = i32;
                                abstractC20745M4219 = abstractC20745M4219;
                                i36 = i36;
                                int i4112 = i28;
                                i27 = i15;
                                i26 = i14;
                                i28 = i4112;
                                C9648 c96416 = c9648;
                                i37 = i4;
                                c9648 = c96416;
                                int i4113 = i33;
                                list3 = list;
                                i33 = i4113;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            i29 = i29;
                            strM6674 = strM6674;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        i29 = i29;
                        strM6674 = strM6674;
                        i2 = i39;
                        i3 = i31;
                        int i421 = i37;
                        c9648 = c9648;
                        i4 = i421;
                        List list9 = list3;
                        i33 = i33;
                        list = list9;
                        th = th;
                        i30 = i30;
                        z2 = z2;
                        int iM4502111 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                        i14 = ((iM4502111 ^ i25) * (-22765)) ^ (-1174288077);
                        i15 = iM4502111 ^ 904147881;
                        i39 = i2;
                        i31 = i3;
                        strM29933 = strM29933;
                        strM6674 = strM6674;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC20745M4219 = abstractC20745M4219;
                        i36 = i36;
                        int i4114 = i28;
                        i27 = i15;
                        i26 = i14;
                        i28 = i4114;
                        C9648 c96417 = c9648;
                        i37 = i4;
                        c9648 = c96417;
                        int i4115 = i33;
                        list3 = list;
                        i33 = i4115;
                    }
                    break;
                case -1151799059:
                case -879840201:
                    i28 = i28;
                    i29 = i29;
                    strM6674 = strM6674;
                    abstractC20745M4219 = abstractC20745M4219;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM29933 = strM29933;
                    i8 = i39;
                    i31 = i31;
                    int i52 = i37;
                    c9648 = c9648;
                    i4 = i52;
                    List list10 = list3;
                    i33 = i33;
                    list = list10;
                    if (i36 < i) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۨ") + i25) * (-21);
                        i9 = ((iM11306 ^ i24) * 637) ^ (-1159838302);
                        i10 = 831228627;
                    } else {
                        iM11306 = (i24 - C19806.m45029("ܽ֫")) * 91;
                        i9 = ((iM11306 ^ i25) * 9723) ^ (-1498394356);
                        i10 = -2116171821;
                    }
                    i11 = iM11306 ^ i10;
                    i39 = i8;
                    i31 = i31;
                    strM29933 = strM29933;
                    strM6674 = strM6674;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC20745M4219 = abstractC20745M4219;
                    i27 = i11;
                    i36 = i36;
                    i26 = i9;
                    i29 = i29;
                    C9648 c96418 = c9648;
                    i37 = i4;
                    c9648 = c96418;
                    int i4116 = i33;
                    list3 = list;
                    i33 = i4116;
                    break;
                case -1074755122:
                case -209962250:
                    strM6674 = strM6674;
                    try {
                        int i53 = i38;
                        strM29933 = strM29933;
                        try {
                            Object[] objArr2 = new Object[i53];
                            objArr2[z2 ? 1 : 0] = C3722.m10896(c12107);
                            try {
                                i28 = i28;
                                i29 = i29;
                                try {
                                    try {
                                        C0278.m1784(c4335, C0216.m1574(C19806.m45029(C2477.m7604(f44614, 29, 3, i39)) ^ 2127894915, objArr2));
                                        C12107 c12108 = c12107;
                                        i38 = i53;
                                        InterfaceC21570[] interfaceC21570Arr = interfaceC21570ArrM48061;
                                        i30 = i30;
                                        i32 = i32;
                                        i2 = i39;
                                        int i54 = i37;
                                        c9648 = c9648;
                                        i4 = i54;
                                        C6119 c61110 = c6119;
                                        List list11 = list3;
                                        i33 = i33;
                                        list = list11;
                                        abstractC20745M4219 = abstractC20745M4219;
                                        HashSet hashSet2 = hashSet;
                                        i36 = i36;
                                        i3 = i31;
                                        C5122 c5123 = c5122;
                                        z2 = z2 ? 1 : 0;
                                        try {
                                            C23759.m52312(new C23759(c2455, c12108, interfaceC21570Arr, i30, c61110, c4335, hashSet2, c5123, boolArr));
                                            zM10564 = C3577.m10564(c4335);
                                            iM450210 = (C19806.m45029("ᩴ᩷") ^ i25) * 99;
                                            i5 = ((iM450210 ^ i24) * 14669) ^ (-1383969907);
                                            i7 = -1446651101;
                                            i13 = iM450210 ^ i7;
                                            i39 = i2;
                                            i31 = i3;
                                            strM6674 = strM6674;
                                            i28 = i28;
                                            i29 = i29;
                                            i30 = i30;
                                            i32 = i32;
                                            abstractC20745M4219 = abstractC20745M4219;
                                            i36 = i36;
                                            z2 = z2;
                                            i27 = i13;
                                            i26 = i5;
                                            strM29933 = strM29933;
                                            i38 = i38;
                                            C9648 c96419 = c9648;
                                            i37 = i4;
                                            c9648 = c96419;
                                            int i4117 = i33;
                                            list3 = list;
                                            i33 = i4117;
                                        } catch (Throwable th13) {
                                            th = th13;
                                            th = th;
                                            i30 = i30;
                                            z2 = z2;
                                            int iM4502112 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                                            i14 = ((iM4502112 ^ i25) * (-22765)) ^ (-1174288077);
                                            i15 = iM4502112 ^ 904147881;
                                            i39 = i2;
                                            i31 = i3;
                                            strM29933 = strM29933;
                                            strM6674 = strM6674;
                                            i29 = i29;
                                            i38 = i38;
                                            i32 = i32;
                                            abstractC20745M4219 = abstractC20745M4219;
                                            i36 = i36;
                                            int i4118 = i28;
                                            i27 = i15;
                                            i26 = i14;
                                            i28 = i4118;
                                            C9648 c964110 = c9648;
                                            i37 = i4;
                                            c9648 = c964110;
                                            int i4119 = i33;
                                            list3 = list;
                                            i33 = i4119;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        i38 = i53;
                                        i2 = i39;
                                        i3 = i31;
                                        int i55 = i37;
                                        c9648 = c9648;
                                        i4 = i55;
                                        List list12 = list3;
                                        i33 = i33;
                                        list2 = list12;
                                        listM7472 = list2;
                                        th = th;
                                        list = listM7472;
                                        int iM4502113 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                                        i14 = ((iM4502113 ^ i25) * (-22765)) ^ (-1174288077);
                                        i15 = iM4502113 ^ 904147881;
                                        i39 = i2;
                                        i31 = i3;
                                        strM29933 = strM29933;
                                        strM6674 = strM6674;
                                        i29 = i29;
                                        i38 = i38;
                                        i32 = i32;
                                        abstractC20745M4219 = abstractC20745M4219;
                                        i36 = i36;
                                        int i41110 = i28;
                                        i27 = i15;
                                        i26 = i14;
                                        i28 = i41110;
                                        C9648 c964111 = c9648;
                                        i37 = i4;
                                        c9648 = c964111;
                                        int i41111 = i33;
                                        list3 = list;
                                        i33 = i41111;
                                    }
                                } catch (Throwable th15) {
                                    th = th15;
                                    i38 = i53;
                                    int i56 = i30;
                                    abstractC20745M4219 = abstractC20745M4219;
                                    z = z2 ? 1 : 0;
                                    i32 = i32;
                                    i36 = i36;
                                    i2 = i39;
                                    i3 = i31;
                                    int i57 = i37;
                                    c9648 = c9648;
                                    i4 = i57;
                                    List list13 = list3;
                                    i33 = i33;
                                    listM7472 = list13;
                                    i30 = i56;
                                    z2 = z;
                                    th = th;
                                    list = listM7472;
                                    int iM4502114 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                                    i14 = ((iM4502114 ^ i25) * (-22765)) ^ (-1174288077);
                                    i15 = iM4502114 ^ 904147881;
                                    i39 = i2;
                                    i31 = i3;
                                    strM29933 = strM29933;
                                    strM6674 = strM6674;
                                    i29 = i29;
                                    i38 = i38;
                                    i32 = i32;
                                    abstractC20745M4219 = abstractC20745M4219;
                                    i36 = i36;
                                    int i41112 = i28;
                                    i27 = i15;
                                    i26 = i14;
                                    i28 = i41112;
                                    C9648 c964112 = c9648;
                                    i37 = i4;
                                    c9648 = c964112;
                                    int i41113 = i33;
                                    list3 = list;
                                    i33 = i41113;
                                }
                            } catch (Throwable th16) {
                                th = th16;
                                i28 = i28;
                                i29 = i29;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            i28 = i28;
                            i29 = i29;
                        }
                    } catch (Throwable th18) {
                        th = th18;
                        i28 = i28;
                        i29 = i29;
                        i38 = i38;
                        strM29933 = strM29933;
                    }
                    break;
                case -1065351094:
                case 947772114:
                    i29 = i29;
                    strM6674 = strM6674;
                    if (i33 < i31) {
                        iM450211 = C19806.m45029("᩻᩸") ^ i25;
                        i20 = ((iM450211 ^ i24) * (-17359)) ^ (-363253312);
                        i21 = 2070494954;
                    } else {
                        iM450211 = (i25 - C19806.m45029("ᩳܰ")) * 99;
                        i20 = ((iM450211 ^ i24) * 14229) ^ 1133868915;
                        i21 = 2042642027;
                    }
                    i22 = iM450211 ^ i21;
                    strM6674 = strM6674;
                    int i41114 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i41114;
                    break;
                case -1026378396:
                case 1799998468:
                    i28 = i28;
                    int i58 = i37;
                    c9648 = c9648;
                    i4 = i58;
                    List list14 = list3;
                    i33 = i33;
                    list = list14;
                    abstractC20745M4219 = C1148.m4219(C11904.f39941);
                    int iM113010 = ThreadFactoryC3888.m11306("᩹᩻") ^ i25;
                    i14 = ((iM113010 ^ i24) * (-12423)) ^ (-282492975);
                    i15 = iM113010 ^ 785551975;
                    i39 = i39;
                    i31 = i31;
                    strM29933 = strM29933;
                    strM6674 = strM6674;
                    i38 = i38;
                    i32 = i32;
                    i36 = i36;
                    i29 = i29;
                    int i41115 = i28;
                    i27 = i15;
                    i26 = i14;
                    i28 = i41115;
                    C9648 c964113 = c9648;
                    i37 = i4;
                    c9648 = c964113;
                    int i41116 = i33;
                    list3 = list;
                    i33 = i41116;
                    break;
                case -622436319:
                case 1278031364:
                    i29 = i29;
                    strM6674 = strM6674;
                    if (zM4964) {
                        iM450211 = C19806.m45029("۠ۙ") ^ i25;
                        i20 = ((iM450211 ^ i24) * (-32451)) ^ (-1493947730);
                        i21 = 815127677;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i24;
                        i20 = ((iM450211 ^ i25) * (-23309)) ^ 1415287629;
                        i21 = -1759512129;
                    }
                    i22 = iM450211 ^ i21;
                    strM6674 = strM6674;
                    int i41117 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i41117;
                    break;
                case -609346970:
                case 1567849512:
                    i4 = i37;
                    list = list3;
                    i39 = 38301;
                    int iM4502115 = (i24 - C19806.m45029("ۛۧ")) * 43;
                    i9 = ((iM4502115 ^ i25) * (-7967)) ^ 832733859;
                    i11 = iM4502115 ^ (-1520118720);
                    i31 = i31;
                    strM29933 = strM29933;
                    strM6674 = strM6674;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC20745M4219 = abstractC20745M4219;
                    i27 = i11;
                    i36 = i36;
                    i26 = i9;
                    i29 = i29;
                    C9648 c964114 = c9648;
                    i37 = i4;
                    c9648 = c964114;
                    int i41118 = i33;
                    list3 = list;
                    i33 = i41118;
                    break;
                case -579080467:
                case -309594481:
                    i28 = i28;
                    i29 = i29;
                    i30 = i30;
                    strM6674 = strM6674;
                    abstractC20745M4219 = abstractC20745M4219;
                    z2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM29933 = strM29933;
                    i2 = i39;
                    i3 = i31;
                    int i59 = i37;
                    c9648 = c9648;
                    i4 = i59;
                    List list15 = list3;
                    i33 = i33;
                    list = list15;
                    if (zM9866) {
                        iM450210 = ThreadFactoryC3888.m11306("᩺۫") ^ i24;
                        i5 = ((iM450210 ^ i25) * 13709) ^ (-1719165670);
                        i7 = 271116841;
                    } else {
                        iM450210 = (i25 - ThreadFactoryC3888.m11306("ۡ᩻")) * (-15);
                        i5 = ((iM450210 ^ i24) * (-23343)) ^ (-662069422);
                        i7 = 494605311;
                    }
                    i13 = iM450210 ^ i7;
                    i39 = i2;
                    i31 = i3;
                    strM6674 = strM6674;
                    i28 = i28;
                    i29 = i29;
                    i30 = i30;
                    i32 = i32;
                    abstractC20745M4219 = abstractC20745M4219;
                    i36 = i36;
                    z2 = z2;
                    i27 = i13;
                    i26 = i5;
                    strM29933 = strM29933;
                    i38 = i38;
                    C9648 c964115 = c9648;
                    i37 = i4;
                    c9648 = c964115;
                    int i41119 = i33;
                    list3 = list;
                    i33 = i41119;
                    break;
                case -545362083:
                case 1886695536:
                    i4 = i37;
                    list = list3;
                    HashSet hashSet3 = new HashSet();
                    C5122 c5124 = new C5122();
                    C6119 c61111 = new C6119();
                    c61111.f20907 = null;
                    c61111.f20905 = 0;
                    c61111.f20903 = i;
                    c61111.f20906 = new C9648[i];
                    c61111.f20904 = new List[i];
                    c61111.f20902 = new C2299[i];
                    hashSet = hashSet3;
                    c5122 = c5124;
                    c6119 = c61111;
                    bool = null;
                    i12 = 0;
                    z2 = false;
                    int iM113011 = ThreadFactoryC3888.m11306("ܰᩴ") ^ i25;
                    i9 = ((iM113011 ^ i24) * 14611) ^ 1528261862;
                    i39 = i39;
                    i31 = i31;
                    strM29933 = strM29933;
                    strM6674 = strM6674;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC20745M4219 = abstractC20745M4219;
                    i36 = i12;
                    i27 = iM113011 ^ 563432442;
                    i26 = i9;
                    i29 = i29;
                    C9648 c964116 = c9648;
                    i37 = i4;
                    c9648 = c964116;
                    int i411110 = i33;
                    list3 = list;
                    i33 = i411110;
                    break;
                case -509135900:
                case 140117145:
                    i29 = i29;
                    strM6674 = strM6674;
                    zM4964 = C1419.m4964(c9648Arr[i33].f32446);
                    iM450211 = C19806.m45029("ܽ֨") ^ i24;
                    i20 = ((iM450211 ^ i25) * 25587) ^ (-1489264764);
                    i21 = 1296607081;
                    i22 = iM450211 ^ i21;
                    strM6674 = strM6674;
                    int i411111 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i411111;
                    break;
                case -507021636:
                case 349861732:
                    c9648.f32446.addAll(MenuItemOnMenuItemClickListenerC3244.m9711(C0797.m3358(C1460.m5051((AbstractC20745) C0216.m1584(itM5072)))));
                    iM450211 = ThreadFactoryC3888.m11306("ᩴ۟") ^ i24;
                    i20 = ((iM450211 ^ i25) * (-24919)) ^ (-1786056585);
                    i21 = 2057037495;
                    i22 = iM450211 ^ i21;
                    strM6674 = strM6674;
                    int i411112 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i411112;
                    break;
                case -479717093:
                case 182683693:
                    i29 = i29;
                    strM6674 = strM6674;
                    if (i32 > 5242880) {
                        iM450211 = C19806.m45029("ۡ۠") ^ i25;
                        i20 = ((iM450211 ^ i24) * 13173) ^ (-2108220363);
                        i21 = 60144186;
                    } else {
                        iM450211 = (C19806.m45029("᩺᩺") + i24) * (-29);
                        i20 = ((iM450211 ^ i25) * (-1347)) ^ (-357910256);
                        i21 = -221539157;
                    }
                    i22 = iM450211 ^ i21;
                    strM6674 = strM6674;
                    int i411113 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i411113;
                    break;
                case -323043453:
                case 2085611556:
                    i33 = 0;
                    iM450211 = C19806.m45029("᩶ܿ") ^ i25;
                    i20 = ((iM450211 ^ i24) * 31143) ^ 1773594557;
                    i21 = 447590514;
                    i22 = iM450211 ^ i21;
                    strM6674 = strM6674;
                    int i411114 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i411114;
                    break;
                case -136734302:
                case 1077966376:
                    try {
                        AbstractC20745 abstractC20745M46688 = abstractC20745M4219.m46688(strM6674);
                        c9648Arr[i33].m24542().m37937(abstractC20745M46688);
                        ViewGroupOnHierarchyChangeListenerC1916.m6231(listArr[i33], abstractC20745M46688);
                        c9648Arr[i33] = new C9648(c6119.f20907);
                        i29 = i29;
                        strM6674 = strM6674;
                        iM450211 = C19806.m45029("۠ۙ") ^ i25;
                        i20 = ((iM450211 ^ i24) * (-32451)) ^ (-1493947730);
                        i21 = 815127677;
                        i22 = iM450211 ^ i21;
                        strM6674 = strM6674;
                        int i411115 = i29;
                        i27 = i22;
                        i26 = i20;
                        i29 = i411115;
                    } catch (Throwable th19) {
                        th = th19;
                        strM6674 = strM6674;
                        i2 = i39;
                        i3 = i31;
                        int i422 = i37;
                        c9648 = c9648;
                        i4 = i422;
                        List list16 = list3;
                        i33 = i33;
                        list = list16;
                        th = th;
                        strM29933 = strM29933;
                        z2 = z2;
                        int iM4502116 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                        i14 = ((iM4502116 ^ i25) * (-22765)) ^ (-1174288077);
                        i15 = iM4502116 ^ 904147881;
                        i39 = i2;
                        i31 = i3;
                        strM29933 = strM29933;
                        strM6674 = strM6674;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC20745M4219 = abstractC20745M4219;
                        i36 = i36;
                        int i411116 = i28;
                        i27 = i15;
                        i26 = i14;
                        i28 = i411116;
                        C9648 c964117 = c9648;
                        i37 = i4;
                        c9648 = c964117;
                        int i411117 = i33;
                        list3 = list;
                        i33 = i411117;
                    }
                    break;
                case -105929186:
                case 2090602439:
                    int i60 = i36;
                    i4 = i37;
                    list = list3;
                    c6119.f20902[i60] = new C2299();
                    c6119.f20904[i60] = new ArrayList();
                    i12 = i60 + 1;
                    int iM113012 = ThreadFactoryC3888.m11306("ܰᩴ") ^ i25;
                    i9 = ((iM113012 ^ i24) * 14611) ^ 1528261862;
                    i39 = i39;
                    i31 = i31;
                    strM29933 = strM29933;
                    strM6674 = strM6674;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC20745M4219 = abstractC20745M4219;
                    i36 = i12;
                    i27 = iM113012 ^ 563432442;
                    i26 = i9;
                    i29 = i29;
                    C9648 c964118 = c9648;
                    i37 = i4;
                    c9648 = c964118;
                    int i411118 = i33;
                    list3 = list;
                    i33 = i411118;
                    break;
                case -32760551:
                case 455991471:
                    strM6674 = strM6674;
                    try {
                        i29 = c6119.f20903;
                        iM11307 = (ThreadFactoryC3888.m11306("ۗ֡") + i24) * (-89);
                        i18 = ((iM11307 ^ i25) * (-4953)) ^ 56304986;
                        i19 = 1229958309;
                        i27 = iM11307 ^ i19;
                        i26 = i18;
                        strM6674 = strM6674;
                    } catch (Throwable th20) {
                        th = th20;
                        i2 = i39;
                        i3 = i31;
                        int i423 = i37;
                        c9648 = c9648;
                        i4 = i423;
                        List list17 = list3;
                        i33 = i33;
                        list = list17;
                        th = th;
                        strM29933 = strM29933;
                        z2 = z2;
                        int iM4502117 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                        i14 = ((iM4502117 ^ i25) * (-22765)) ^ (-1174288077);
                        i15 = iM4502117 ^ 904147881;
                        i39 = i2;
                        i31 = i3;
                        strM29933 = strM29933;
                        strM6674 = strM6674;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC20745M4219 = abstractC20745M4219;
                        i36 = i36;
                        int i411119 = i28;
                        i27 = i15;
                        i26 = i14;
                        i28 = i411119;
                        C9648 c964119 = c9648;
                        i37 = i4;
                        c9648 = c964119;
                        int i4111110 = i33;
                        list3 = list;
                        i33 = i4111110;
                    }
                    break;
                case -20088060:
                case 1904170845:
                    i28 = i28;
                    i29 = i29;
                    strM6674 = strM6674;
                    abstractC20745M4219 = abstractC20745M4219;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM29933 = strM29933;
                    i8 = i39;
                    i31 = i31;
                    int i61 = i37;
                    c9648 = c9648;
                    i4 = i61;
                    List list18 = list3;
                    i33 = i33;
                    list = list18;
                    short s = f44614[25];
                    if ((s * 30820) - ((s * s) + 237468100) <= 0) {
                        iM11306 = (i24 - C19806.m45029("ۧۖ")) * 77;
                        i9 = ((iM11306 ^ i25) * (-13569)) ^ 1256256115;
                        i10 = -130751710;
                    } else {
                        iM11306 = (i25 - ThreadFactoryC3888.m11306("ۘ᩷")) * 123;
                        i9 = ((iM11306 ^ i24) * 21377) ^ 1662960881;
                        i10 = 1029655380;
                    }
                    i11 = iM11306 ^ i10;
                    i39 = i8;
                    i31 = i31;
                    strM29933 = strM29933;
                    strM6674 = strM6674;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC20745M4219 = abstractC20745M4219;
                    i27 = i11;
                    i36 = i36;
                    i26 = i9;
                    i29 = i29;
                    C9648 c9641110 = c9648;
                    i37 = i4;
                    c9648 = c9641110;
                    int i4111111 = i33;
                    list3 = list;
                    i33 = i4111111;
                    break;
                case 215235843:
                case 1548152042:
                    i29 = i29;
                    strM6674 = strM6674;
                    if (zM5348) {
                        iM450211 = ThreadFactoryC3888.m11306("ۚ۟") ^ i24;
                        i20 = ((iM450211 ^ i25) * 24133) ^ (-862788303);
                        i21 = 1986628794;
                    } else {
                        iM450211 = (ThreadFactoryC3888.m11306("ۤۢ") ^ i25) * (-9);
                        i20 = ((iM450211 ^ i24) * (-12527)) ^ 1237178054;
                        i21 = -661067519;
                    }
                    i22 = iM450211 ^ i21;
                    strM6674 = strM6674;
                    int i4111112 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i4111112;
                    break;
                case 224751422:
                case 1557938972:
                    strM6674 = strM6674;
                    if (i28 < i29) {
                        iM11307 = (C19806.m45029("ۧ᩻") + i24) * (-127);
                        i18 = ((iM11307 ^ i25) * 26835) ^ 694707269;
                        i19 = 1714903612;
                    } else {
                        iM11307 = C19806.m45029("ۛۖ") ^ i25;
                        i18 = ((iM11307 ^ i24) * (-2367)) ^ 1154169386;
                        i19 = -800467762;
                    }
                    i27 = iM11307 ^ i19;
                    i26 = i18;
                    strM6674 = strM6674;
                    break;
                case 423377185:
                case 643732814:
                    C0526.m2436(abstractC20745M4219);
                    throw th;
                case 471875511:
                case 947543158:
                    i28 = i28;
                    i29 = i29;
                    strM6674 = strM6674;
                    abstractC20745M4219 = abstractC20745M4219;
                    z = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM29933 = strM29933;
                    i2 = i39;
                    i3 = i31;
                    int i62 = i37;
                    c9648 = c9648;
                    i4 = i62;
                    List list19 = list3;
                    i33 = i33;
                    list = list19;
                    try {
                        C12107 c12109 = (C12107) RunnableC1606.m5478(list, i30);
                        try {
                            zM9866 = ViewTreeObserverOnPreDrawListenerC3327.m9866(c4335);
                            int iM113013 = (ThreadFactoryC3888.m11306("ۢܽ") + i24) * 93;
                            i14 = ((iM113013 ^ i25) * 25633) ^ (-397756681);
                            i15 = iM113013 ^ (-149303511);
                            c12107 = c12109;
                            i39 = i2;
                            i31 = i3;
                            strM29933 = strM29933;
                            strM6674 = strM6674;
                            i29 = i29;
                            i38 = i38;
                            i32 = i32;
                            abstractC20745M4219 = abstractC20745M4219;
                            i36 = i36;
                            z2 = z ? 1 : 0;
                        } catch (Throwable th21) {
                            th = th21;
                            c12107 = c12109;
                            listM7472 = list;
                            z2 = z ? 1 : 0;
                            th = th;
                            list = listM7472;
                            int iM4502118 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                            i14 = ((iM4502118 ^ i25) * (-22765)) ^ (-1174288077);
                            i15 = iM4502118 ^ 904147881;
                            i39 = i2;
                            i31 = i3;
                            strM29933 = strM29933;
                            strM6674 = strM6674;
                            i29 = i29;
                            i38 = i38;
                            i32 = i32;
                            abstractC20745M4219 = abstractC20745M4219;
                            i36 = i36;
                        }
                    } catch (Throwable th22) {
                        th = th22;
                        listM7472 = list;
                        z2 = z;
                        th = th;
                        list = listM7472;
                        int iM4502119 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                        i14 = ((iM4502119 ^ i25) * (-22765)) ^ (-1174288077);
                        i15 = iM4502119 ^ 904147881;
                        i39 = i2;
                        i31 = i3;
                        strM29933 = strM29933;
                        strM6674 = strM6674;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC20745M4219 = abstractC20745M4219;
                        i36 = i36;
                        int i4111113 = i28;
                        i27 = i15;
                        i26 = i14;
                        i28 = i4111113;
                        C9648 c9641111 = c9648;
                        i37 = i4;
                        c9648 = c9641111;
                        int i4111114 = i33;
                        list3 = list;
                        i33 = i4111114;
                        break;
                    }
                    int i4111115 = i28;
                    i27 = i15;
                    i26 = i14;
                    i28 = i4111115;
                    C9648 c9641112 = c9648;
                    i37 = i4;
                    c9648 = c9641112;
                    int i4111116 = i33;
                    list3 = list;
                    i33 = i4111116;
                    break;
                case 573429122:
                case 1999362432:
                    i30++;
                    i17 = 1;
                    i16 = i29;
                    i4 = i37;
                    list = list3;
                    int iM450220 = (C19806.m45029("֫֨") ^ i25) * 99;
                    i39 = i39;
                    i31 = i31;
                    strM6674 = strM6674;
                    i29 = i16;
                    i32 = i32;
                    abstractC20745M4219 = abstractC20745M4219;
                    i36 = i36;
                    z2 = z2 ? 1 : 0;
                    i38 = i17;
                    i26 = ((iM450220 ^ i24) * (-25783)) ^ 2128838343;
                    i28 = i28;
                    i27 = iM450220 ^ 1759902765;
                    strM29933 = strM29933;
                    C9648 c9641113 = c9648;
                    i37 = i4;
                    c9648 = c9641113;
                    int i4111117 = i33;
                    list3 = list;
                    i33 = i4111117;
                    break;
                case 980939780:
                case 1448974698:
                    i29 = i29;
                    strM6674 = strM6674;
                    try {
                        m33034(c22918, c9648.m24543(c4335), strM29933);
                        Runtime.getRuntime().gc();
                        i28 = i35;
                        i29 = i29;
                        iM11307 = ThreadFactoryC3888.m11306("ܶ۫") ^ i25;
                        i18 = ((iM11307 ^ i24) * 3065) ^ (-1448481909);
                        i19 = -2116008823;
                        i27 = iM11307 ^ i19;
                        i26 = i18;
                        strM6674 = strM6674;
                    } catch (Throwable th23) {
                        th = th23;
                        i29 = i29;
                        i28 = i28;
                        i2 = i39;
                        i3 = i31;
                        int i424 = i37;
                        c9648 = c9648;
                        i4 = i424;
                        List list110 = list3;
                        i33 = i33;
                        list = list110;
                        th = th;
                        strM29933 = strM29933;
                        z2 = z2;
                        int iM45021110 = (C19806.m45029("ܳ᩹") ^ i24) * (-37);
                        i14 = ((iM45021110 ^ i25) * (-22765)) ^ (-1174288077);
                        i15 = iM45021110 ^ 904147881;
                        i39 = i2;
                        i31 = i3;
                        strM29933 = strM29933;
                        strM6674 = strM6674;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC20745M4219 = abstractC20745M4219;
                        i36 = i36;
                        int i4111118 = i28;
                        i27 = i15;
                        i26 = i14;
                        i28 = i4111118;
                        C9648 c9641114 = c9648;
                        i37 = i4;
                        c9648 = c9641114;
                        int i4111119 = i33;
                        list3 = list;
                        i33 = i4111119;
                    }
                    break;
                case 1018459495:
                case 1250184646:
                    RunnableC3388.m10052(abstractC20745M4219);
                    return;
                case 1327443566:
                case 2128544138:
                    i16 = i29;
                    i4 = i37;
                    list = list3;
                    i17 = i34;
                    i30 = 0;
                    int iM450221 = (C19806.m45029("֫֨") ^ i25) * 99;
                    i39 = i39;
                    i31 = i31;
                    strM6674 = strM6674;
                    i29 = i16;
                    i32 = i32;
                    abstractC20745M4219 = abstractC20745M4219;
                    i36 = i36;
                    z2 = z2 ? 1 : 0;
                    i38 = i17;
                    i26 = ((iM450221 ^ i24) * (-25783)) ^ 2128838343;
                    i28 = i28;
                    i27 = iM450221 ^ 1759902765;
                    strM29933 = strM29933;
                    C9648 c9641115 = c9648;
                    i37 = i4;
                    c9648 = c9641115;
                    int i41111110 = i33;
                    list3 = list;
                    i33 = i41111110;
                    break;
                default:
                    i28 = i28;
                    i29 = i29;
                    strM6674 = strM6674;
                    abstractC20745M4219 = abstractC20745M4219;
                    z2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM29933 = strM29933;
                    i2 = i39;
                    i3 = i31;
                    int i63 = i37;
                    c9648 = c9648;
                    i4 = i63;
                    List list20 = list3;
                    i33 = i33;
                    list = list20;
                    if (i30 < i4) {
                        iM45029 = (i24 - ThreadFactoryC3888.m11306("֡ܽ")) * 19;
                        i5 = ((iM45029 ^ i25) * 8313) ^ 656882279;
                        i6 = 2040833907;
                    } else {
                        iM45029 = C19806.m45029("ۚᩳ") ^ i25;
                        i5 = ((iM45029 ^ i24) * (-13993)) ^ 1417118763;
                        i6 = 756478497;
                    }
                    i13 = iM45029 ^ i6;
                    i39 = i2;
                    i31 = i3;
                    strM6674 = strM6674;
                    i28 = i28;
                    i29 = i29;
                    i32 = i32;
                    abstractC20745M4219 = abstractC20745M4219;
                    i36 = i36;
                    z2 = z2;
                    i27 = i13;
                    i26 = i5;
                    strM29933 = strM29933;
                    i38 = i38;
                    C9648 c9641116 = c9648;
                    i37 = i4;
                    c9648 = c9641116;
                    int i41111111 = i33;
                    list3 = list;
                    i33 = i41111111;
                    break;
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        adapterView.setSelection(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33034(C22918 c22918, C8485 c8485, String str) throws Throwable {
        AbstractC20745 abstractC20745M8478 = null;
        Throwable th = null;
        int i = 1557063738;
        int i2 = C3660.f13403;
        int i3 = C2124.f7782;
        int iM11306 = ThreadFactoryC3888.m11306("᩸᩻") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-22865)) ^ (-1537076099);
        int i5 = 1042819739;
        while (true) {
            i = ((((i ^ i3) * (-25921)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2021771588:
                case 129272589:
                    if (C1189.m4368() <= 0) {
                        iM11306 = (C19806.m45029("֫ۢ") + i2) * (-101);
                        i4 = ((iM11306 ^ i3) * 12695) ^ 596478373;
                        i5 = -2034997751;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۘܺ")) * 15;
                        i4 = ((iM11306 ^ i2) * 30991) ^ 529164962;
                        i5 = 1582261065;
                    }
                    break;
                case -1845197044:
                case 338563678:
                    C3722.m10894();
                    C3722.m10894();
                    iM11306 = C19806.m45029("ۢܳ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 16767) ^ 1661327964;
                    i5 = 787868542;
                    break;
                case -1724291747:
                case 386521187:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿܺ") ^ i3) * 37;
                        i4 = ((iM11306 ^ i2) * 9143) ^ (-1943291937);
                        i5 = 865802877;
                    } else {
                        iM11306 = C19806.m45029("᩶ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-793)) ^ 1423322864;
                        i5 = -1722634965;
                    }
                    break;
                case -1542440954:
                case 705964879:
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 3389) ^ (-1487213662);
                        i5 = -442503169;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܶ᩶")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i3) * 5649) ^ (-245557915);
                        i5 = 1435925138;
                    }
                    break;
                case -1522258702:
                case 315405406:
                    if (C3660.m10791() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿܺ") ^ i3) * 37;
                        i4 = ((iM11306 ^ i2) * 9143) ^ (-1943291937);
                        i5 = 865802877;
                    } else {
                        iM11306 = C19806.m45029("ۨ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31465)) ^ (-1236777996);
                        i5 = 1523862942;
                    }
                    break;
                case -1450883877:
                case -96911901:
                    if (C3743.m10966() <= 0) {
                        iM11306 = (C19806.m45029("֫ۢ") + i2) * (-101);
                        i4 = ((iM11306 ^ i3) * 12695) ^ 596478373;
                        i5 = -2034997751;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25847)) ^ 1181853822;
                        i5 = -291356834;
                    }
                    break;
                case -1364152073:
                case 1749720273:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C0278.f1572 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿܺ") ^ i3) * 37;
                        i4 = ((iM11306 ^ i2) * 9143) ^ (-1943291937);
                        i5 = 865802877;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 3389) ^ (-1487213662);
                        i5 = -442503169;
                    }
                    break;
                case -920285977:
                case 2062432621:
                    C1025.m3861();
                    if (C1025.f4800 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19671)) ^ (-1867585043);
                        i5 = 1787528810;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 3389) ^ (-1487213662);
                        i5 = -442503169;
                    }
                    break;
                case -847597526:
                case 158051063:
                    if (RunnableC1564.f6300) {
                        iM11306 = (C19806.m45029("֫ۢ") + i2) * (-101);
                        i4 = ((iM11306 ^ i3) * 12695) ^ 596478373;
                        i5 = -2034997751;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-32413)) ^ (-1569957051);
                        i5 = -745839935;
                    }
                    break;
                case -552772747:
                case 1265661286:
                    abstractC20745M8478 = C2788.m8478(C11904.f39941);
                    iM11306 = ThreadFactoryC3888.m11306("֨۫") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-22859)) ^ 144526374;
                    i5 = 1418008141;
                    break;
                case -542391818:
                case 89074267:
                    RunnableC3388.m10052(abstractC20745M8478);
                    throw th;
                case -191765985:
                case 1500426724:
                    C1668.m5583();
                    return;
                case -167492380:
                case 589178373:
                    try {
                        c8485.m37937(abstractC20745M8478);
                        C3660.m10779(c22918, str);
                        abstractC20745M8478.m46696(c22918.m50720(), (InterfaceC10389) null);
                        iM11306 = (i2 - C19806.m45029("᩻ᩴ")) * (-123);
                        i4 = ((iM11306 ^ i3) * 893) ^ 2040695561;
                        i5 = 1281732087;
                    } catch (Throwable th2) {
                        th = th2;
                        iM11306 = (ThreadFactoryC3888.m11306("ۡܿ") + i2) * (-47);
                        i4 = ((iM11306 ^ i3) * (-24355)) ^ (-1806828449);
                        i5 = 596657098;
                    }
                    break;
                case -47801032:
                case 383982228:
                    if (!C0526.f2219) {
                        iM11306 = C19806.m45029("ۢܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16767) ^ 1661327964;
                        i5 = 787868542;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 3389) ^ (-1487213662);
                        i5 = -442503169;
                    }
                    break;
                case 234827225:
                case 1820887397:
                    C0526.m2436(abstractC20745M8478);
                    return;
                case 251639642:
                case 754766780:
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("᩷ۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19661) ^ (-1957921821);
                        i5 = 178799927;
                    } else {
                        iM11306 = (C19806.m45029("֫ۢ") + i2) * (-101);
                        i4 = ((iM11306 ^ i3) * 12695) ^ 596478373;
                        i5 = -2034997751;
                    }
                    break;
                case 879828139:
                case 2100361341:
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = (C19806.m45029("֫ۢ") + i2) * (-101);
                        i4 = ((iM11306 ^ i3) * 12695) ^ 596478373;
                        i5 = -2034997751;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("֡ۢ")) * (-85);
                        i4 = ((iM11306 ^ i3) * 16449) ^ (-1953336431);
                        i5 = -1314416216;
                    }
                    break;
                case 1281269310:
                case 1813506171:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (C19806.m45029("֫ۢ") + i2) * (-101);
                        i4 = ((iM11306 ^ i3) * 12695) ^ 596478373;
                        i5 = -2034997751;
                    } else {
                        iM11306 = C19806.m45029("᩷ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-18307)) ^ (-1967501583);
                        i5 = 1218462068;
                    }
                    break;
                default:
                    if (C7105.f23796 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19671)) ^ (-1867585043);
                        i5 = 1787528810;
                    } else {
                        iM11306 = C19806.m45029("ܿ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19353) ^ (-2118564537);
                        i5 = 1002824495;
                    }
                    break;
            }
        }
    }
}
