package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۗۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J3Z2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC2937 implements View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۜᩴۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f11029 = {5205, -22936, 19744, 17989, 19509, 19266, 21309, 24437, -24005, 28172, 8423, 12297, 12289, 12288, -21456, 20059, 20851, 17526, -18561, 23659, 25614, 18274, 22606, 19832, -23492, 18353, 8730, 16240, 16251, 16252, 16188, 16255, 16230, 16188, 16226, 16254, 16231, 16245, 16251, 16252, 16188, 16225, 16235, 16225, 16230, 16247, 16255, -17697, -17042, 19049};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static WeakReference f11030;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f11031;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C11986 f11032;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11545 f11033;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f11034;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f11035;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f11036;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22071 f11037;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f11038;

    public ViewOnClickListenerC2937(C11545 c11545) {
        this(RunnableC1606.m5471(c11545), c11545);
    }

    public ViewOnClickListenerC2937(AbstractActivityC12483 abstractActivityC12483) {
        this(abstractActivityC12483, null);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x013e A[PHI: r3 r9 r11 r14
      0x013e: PHI (r3v13 short[]) = (r3v9 short[]), (r3v9 short[]), (r3v9 short[]), (r3v11 short[]), (r3v9 short[]), (r3v9 short[]) binds: [B:83:0x013e, B:82:0x013e, B:39:0x013c, B:31:0x00f4, B:27:0x00ce, B:96:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:83:0x013e, B:82:0x013e, B:39:0x013c, B:31:0x00f4, B:27:0x00ce, B:96:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r11v5 java.lang.String) = 
      (r11v2 java.lang.String)
      (r11v2 java.lang.String)
      (r11v3 java.lang.String)
      (r11v2 java.lang.String)
      (r11v2 java.lang.String)
      (r11v2 java.lang.String)
     binds: [B:83:0x013e, B:82:0x013e, B:39:0x013c, B:31:0x00f4, B:27:0x00ce, B:96:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r14v5 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:83:0x013e, B:82:0x013e, B:39:0x013c, B:31:0x00f4, B:27:0x00ce, B:96:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0190 A[PHI: r1 r7 r8
      0x0190: PHI (r1v31 short[]) = (r1v2 short[]), (r1v32 short[]) binds: [B:47:0x018e, B:43:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:47:0x018e, B:43:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r8v3 java.lang.Object) = (r8v2 java.lang.Object), (r8v4 java.lang.Object) binds: [B:47:0x018e, B:43:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC2937(AbstractActivityC12483 abstractActivityC12483, C11545 c11545) {
        short[] sArr;
        int i;
        short[] sArr2;
        C22071 c22071;
        int i2;
        int iM11306;
        int i3;
        short[] sArr3;
        C22071 c22072;
        short[] sArr4;
        int iM45029;
        int i4;
        int i5;
        int iM450210;
        int i6;
        ViewOnClickListenerC2937 viewOnClickListenerC2937 = this;
        int i7 = C3535.f13026;
        int i8 = C1025.f4800;
        short s = f11029[0];
        int i9 = s + 8270;
        int i10 = (i9 * i9) - (s * 33080) < 0 ? 16099 : 8508;
        int iM11307 = (ThreadFactoryC3888.m11306("ۚܳ") + i7) * (-47);
        int i11 = ((iM11307 ^ i8) * 6493) ^ (-452802899);
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i12 = 0;
        int iM11308 = 0;
        int iM450211 = 0;
        int iM450212 = 0;
        int i13 = 0;
        C22071 c22073 = null;
        int i14 = -1173703692;
        int i15 = 0;
        int i16 = iM11307 ^ (-1761368509);
        String strM26821 = null;
        short[] sArr7 = null;
        int i17 = 0;
        Object obj = null;
        C8067 c8067M5356 = null;
        while (true) {
            i14 = i16 ^ (i11 & (((i14 ^ i8) * 6029) >> 31));
            switch (i14) {
                case -2064433720:
                case 1086714847:
                    C2871.m8646();
                    sArr = sArr5;
                    i = i15;
                    sArr2 = sArr6;
                    c22071 = c22073;
                    iM11306 = (i8 - ThreadFactoryC3888.m11306("ܳ۫")) * 37;
                    c22073 = c22071;
                    i2 = ((iM11306 ^ i7) * (-31569)) ^ 1394427010;
                    i3 = -410710939;
                    i16 = iM11306 ^ i3;
                    i15 = i;
                    short[] sArr8 = sArr;
                    i11 = i2;
                    sArr6 = sArr2;
                    sArr5 = sArr8;
                    break;
                case -1537824134:
                case 756591466:
                    sArr3 = sArr6;
                    c22072 = c22073;
                    C1977.m6349(c8067M5356, c22072.f71506);
                    sArr4 = f11029;
                    i15 = 1;
                    if (C3286.m9798() <= 0) {
                        iM45029 = C19806.m45029("ܿ۬") ^ i8;
                        i4 = ((iM45029 ^ i7) * (-3479)) ^ 2093359071;
                        i5 = -1699163600;
                    } else {
                        iM45029 = (C19806.m45029("ۧ᩹") + i8) * 101;
                        i4 = ((iM45029 ^ i7) * (-14113)) ^ 1783223739;
                        i5 = 471767514;
                    }
                    int i18 = iM45029 ^ i5;
                    c22073 = c22072;
                    sArr6 = sArr3;
                    sArr5 = sArr4;
                    i16 = i18;
                    i11 = i4;
                    break;
                case -1534324578:
                case -1457127829:
                    if (C1148.m4232() <= 0) {
                        sArr = sArr5;
                        i = i15;
                        sArr2 = sArr6;
                        int iM450213 = (C19806.m45029("ܶܳ") + i7) * (-71);
                        i2 = ((iM450213 ^ i8) * 14357) ^ (-1755811939);
                        i16 = iM450213 ^ (-1781194950);
                        i15 = i;
                        viewOnClickListenerC2937 = this;
                        short[] sArr9 = sArr;
                        i11 = i2;
                        sArr6 = sArr2;
                        sArr5 = sArr9;
                    } else {
                        iM450210 = C19806.m45029("۟ۧ") ^ i7;
                        i11 = ((iM450210 ^ i8) * (-17919)) ^ (-1606873809);
                        i6 = 522523688;
                        i16 = iM450210 ^ i6;
                    }
                    break;
                case -1236217321:
                case 1379490818:
                    iM11308 = ThreadFactoryC3888.m11306(C10634.m26821(sArr7, i17, 3, i10)) ^ 2130197090;
                    if (C2249.m6915() <= 0) {
                        iM450210 = C19806.m45029("۟ۧ") ^ i7;
                        i11 = ((iM450210 ^ i8) * (-17919)) ^ (-1606873809);
                        i6 = 522523688;
                    } else {
                        iM450210 = (C19806.m45029("᩹᩺") ^ i8) * 7;
                        i11 = ((iM450210 ^ i7) * 3735) ^ (-1767570770);
                        i6 = -1304296416;
                    }
                    i16 = iM450210 ^ i6;
                    break;
                case -1171494796:
                case -44414010:
                    if (C0050.m946() <= 0) {
                        sArr4 = sArr5;
                        sArr3 = sArr6;
                        c22072 = c22073;
                        iM45029 = C19806.m45029("ܿ۬") ^ i8;
                        i4 = ((iM45029 ^ i7) * (-3479)) ^ 2093359071;
                        i5 = -1699163600;
                        int i19 = iM45029 ^ i5;
                        c22073 = c22072;
                        sArr6 = sArr3;
                        sArr5 = sArr4;
                        i16 = i19;
                        i11 = i4;
                    } else {
                        iM450210 = C19806.m45029("۟ۧ") ^ i7;
                        i11 = ((iM450210 ^ i8) * (-17919)) ^ (-1606873809);
                        i6 = 522523688;
                        i16 = iM450210 ^ i6;
                    }
                    break;
                case -1089855379:
                case -223411333:
                    sArr = sArr5;
                    i = i15;
                    viewOnClickListenerC2937.f11035 = abstractActivityC12483;
                    sArr2 = sArr6;
                    viewOnClickListenerC2937.f11033 = c11545;
                    C22071 c22074 = new C22071(abstractActivityC12483);
                    if (C1977.f7413 <= 0) {
                        c22073 = c22074;
                        int iM450214 = (C19806.m45029("ܶܳ") + i7) * (-71);
                        i2 = ((iM450214 ^ i8) * 14357) ^ (-1755811939);
                        i16 = iM450214 ^ (-1781194950);
                        i15 = i;
                        viewOnClickListenerC2937 = this;
                        short[] sArr10 = sArr;
                        i11 = i2;
                        sArr6 = sArr2;
                        sArr5 = sArr10;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("۫ۨ") ^ i7;
                        c22073 = c22074;
                        int i20 = ((iM11309 ^ i8) * 30115) ^ (-1979517695);
                        i16 = iM11309 ^ (-1122342020);
                        i15 = i;
                        sArr6 = sArr2;
                        sArr5 = sArr;
                        i11 = i20;
                        viewOnClickListenerC2937 = this;
                    }
                    break;
                case -927180575:
                case 1298797834:
                    C1066.m4025(c8067M5356, iM450212 ^ i13, obj);
                    sArr7 = f11029;
                    i17 = 7;
                    if (RunnableC3388.m10064()) {
                        iM450210 = (ThreadFactoryC3888.m11306("ܰܿ") + i7) * (-51);
                        i11 = ((iM450210 ^ i8) * (-22717)) ^ 1658990494;
                        i6 = -1273008940;
                    } else {
                        iM450210 = C19806.m45029("۟ۧ") ^ i7;
                        i11 = ((iM450210 ^ i8) * (-17919)) ^ (-1606873809);
                        i6 = 522523688;
                    }
                    i16 = iM450210 ^ i6;
                    break;
                case -905768196:
                case 1718143602:
                    i12 = iM450211 ^ 2098955651;
                    if (C0050.f912 <= 0) {
                        iM450210 = C19806.m45029("֡ܰ") ^ i7;
                        i11 = ((iM450210 ^ i8) * 16059) ^ 1631748912;
                        i6 = -154830885;
                    } else {
                        iM450210 = C19806.m45029("᩷ܺ") ^ i8;
                        i11 = ((iM450210 ^ i7) * (-23599)) ^ (-1723201770);
                        i6 = -932841201;
                    }
                    i16 = iM450210 ^ i6;
                    break;
                case -486897090:
                case 662853368:
                    sArr = sArr5;
                    i = i15;
                    sArr2 = sArr6;
                    c22071 = c22073;
                    viewOnClickListenerC2937.f11037 = c22071;
                    c8067M5356 = RunnableC1564.m5356(abstractActivityC12483);
                    if (C19806.f63586) {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("ܳ۫")) * 37;
                        c22073 = c22071;
                        i2 = ((iM11306 ^ i7) * (-31569)) ^ 1394427010;
                        i3 = -410710939;
                        i16 = iM11306 ^ i3;
                        i15 = i;
                        short[] sArr11 = sArr;
                        i11 = i2;
                        sArr6 = sArr2;
                        sArr5 = sArr11;
                    } else {
                        c22073 = c22071;
                        int iM113010 = ThreadFactoryC3888.m11306("ۡ֫") ^ i8;
                        int i21 = ((iM113010 ^ i7) * 1423) ^ 719999350;
                        i15 = i;
                        i16 = iM113010 ^ (-39221937);
                        sArr6 = sArr2;
                        sArr5 = sArr;
                        i11 = i21;
                    }
                    break;
                case -338371902:
                case 1250618239:
                    sArr = sArr5;
                    i = i15;
                    iM450211 = C19806.m45029(C1148.m4230(sArr, i, 3, i10));
                    if (C2249.f8050 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩹") ^ i7;
                        sArr2 = sArr6;
                        i2 = ((iM11306 ^ i8) * 6039) ^ 2015246331;
                        i3 = 965217390;
                        i16 = iM11306 ^ i3;
                        i15 = i;
                        short[] sArr12 = sArr;
                        i11 = i2;
                        sArr6 = sArr2;
                        sArr5 = sArr12;
                    } else {
                        sArr2 = sArr6;
                        int iM450215 = (C19806.m45029("ܶܳ") + i7) * (-71);
                        i2 = ((iM450215 ^ i8) * 14357) ^ (-1755811939);
                        i16 = iM450215 ^ (-1781194950);
                        i15 = i;
                        viewOnClickListenerC2937 = this;
                        short[] sArr13 = sArr;
                        i11 = i2;
                        sArr6 = sArr2;
                        sArr5 = sArr13;
                    }
                    break;
                case 111224738:
                case 1519787671:
                    C1066.m4034(c8067M5356, iM11308, obj);
                    c8067M5356.m21257(viewOnClickListenerC2937);
                    viewOnClickListenerC2937.f11031 = c8067M5356.m21252();
                    return;
                case 416757347:
                case 1641728150:
                    obj = null;
                    C1460.m5055(c8067M5356, i12, null);
                    sArr6 = f11029;
                    if (C0629.f2722 <= 0) {
                        iM450210 = C19806.m45029("֡ܰ") ^ i7;
                        i11 = ((iM450210 ^ i8) * 16059) ^ 1631748912;
                        i6 = -154830885;
                    } else {
                        iM450210 = C19806.m45029("ۛ᩵") ^ i7;
                        i11 = ((iM450210 ^ i8) * 5187) ^ (-20301914);
                        i6 = 774909376;
                    }
                    i16 = iM450210 ^ i6;
                    break;
                case 1242153330:
                case 1635420552:
                    RunnableC1606.m5473();
                    if (C2477.f9839 > 0) {
                        iM450210 = C19806.m45029("۟ۧ") ^ i7;
                        i11 = ((iM450210 ^ i8) * (-17919)) ^ (-1606873809);
                        i6 = 522523688;
                        i16 = iM450210 ^ i6;
                    } else {
                        sArr = sArr5;
                        i = i15;
                        sArr2 = sArr6;
                        c22071 = c22073;
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("ܳ۫")) * 37;
                        c22073 = c22071;
                        i2 = ((iM11306 ^ i7) * (-31569)) ^ 1394427010;
                        i3 = -410710939;
                        i16 = iM11306 ^ i3;
                        i15 = i;
                        short[] sArr14 = sArr;
                        i11 = i2;
                        sArr6 = sArr2;
                        sArr5 = sArr14;
                    }
                    break;
                case 1445104765:
                case 1909522213:
                    strM26821 = C10634.m26821(sArr6, 4, 3, i10);
                    if (C1377.f5749) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۤᩴ") + i7) * (-95);
                        i11 = ((iM450210 ^ i8) * (-7653)) ^ 411031309;
                        i6 = 229087454;
                    } else {
                        iM450210 = C19806.m45029("۟ۧ") ^ i7;
                        i11 = ((iM450210 ^ i8) * (-17919)) ^ (-1606873809);
                        i6 = 522523688;
                    }
                    i16 = iM450210 ^ i6;
                    break;
                case 1557394844:
                case 1725366865:
                    iM450212 = C19806.m45029(strM26821);
                    i13 = 2125770066;
                    if (C2124.m6673() > 0) {
                        iM450210 = (C19806.m45029("ᩴܿ") ^ i8) * 101;
                        i11 = ((iM450210 ^ i7) * 10501) ^ (-206667812);
                        i6 = 467782174;
                        i16 = iM450210 ^ i6;
                    } else {
                        sArr4 = sArr5;
                        sArr3 = sArr6;
                        c22072 = c22073;
                        iM45029 = C19806.m45029("ܿ۬") ^ i8;
                        i4 = ((iM45029 ^ i7) * (-3479)) ^ 2093359071;
                        i5 = -1699163600;
                        int i110 = iM45029 ^ i5;
                        c22073 = c22072;
                        sArr6 = sArr3;
                        sArr5 = sArr4;
                        i16 = i110;
                        i11 = i4;
                    }
                    break;
                default:
                    C0962.m3746();
                    C2332.m7079();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0100 A[PHI: r16
      0x0100: PHI (r16v3 java.lang.String) = (r16v1 java.lang.String), (r16v2 java.lang.String), (r16v1 java.lang.String) binds: [B:148:0x0100, B:34:0x00fe, B:7:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x013c A[PHI: r8 r9 r14
      0x013c: PHI (r8v3 short[]) = (r8v2 short[]), (r8v1 short[]) binds: [B:38:0x013a, B:15:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:38:0x013a, B:15:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r14v3 android.widget.Button) = (r14v2 android.widget.Button), (r14v1 android.widget.Button) binds: [B:38:0x013a, B:15:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0216 A[PHI: r11
      0x0216: PHI (r11v6 java.lang.ref.WeakReference) = (r11v2 java.lang.ref.WeakReference), (r11v1 java.lang.ref.WeakReference) binds: [B:56:0x0214, B:7:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8765(AbstractC20745 abstractC20745, boolean z) {
        int i;
        C11986 c11986;
        DialogInterfaceC19356 dialogInterfaceC19356;
        short[] sArr;
        int i2;
        int i3;
        short s;
        int iM11306;
        int i4;
        int i5;
        int i6;
        int i7;
        C11986 c11987;
        C11986 c11988;
        DialogInterfaceC19356 dialogInterfaceC19357;
        short[] sArr2;
        long j;
        WeakReference weakReference;
        short[] sArr3;
        int i8;
        int iM45029;
        int i9;
        int i10;
        int iM450210;
        int i11;
        ViewOnClickListenerC2937 viewOnClickListenerC2937 = this;
        DialogInterfaceC19356 dialogInterfaceC19358 = null;
        Exception exc = null;
        WeakReference weakReference2 = null;
        WeakReference weakReference3 = null;
        Button buttonM4897 = null;
        DialogInterfaceC19356 dialogInterfaceC19359 = null;
        Button buttonM44374 = null;
        boolean z2 = false;
        String strM4230 = null;
        short[] sArr4 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1411842758;
        int i15 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i16 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM450211 = (i16 - C19806.m45029("ᩳܿ")) * 51;
        int i17 = ((iM450211 ^ i15) * 31163) ^ 2098188880;
        int i18 = iM450211 ^ 323653059;
        C11986 c11989 = null;
        C11986 c11986M40033 = null;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        boolean z3 = false;
        C11545 c11545 = null;
        short s2 = 0;
        short[] sArr5 = null;
        long j2 = 0;
        short[] sArr6 = null;
        int i22 = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i15) * (-13435)) >> 31));
            switch (i14) {
                case -2130991940:
                case 670208662:
                    j2 = j2;
                    sArr5 = sArr5;
                    i3 = i19;
                    c11989 = c11989;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    C11545 c11546 = viewOnClickListenerC2937.f11033;
                    viewOnClickListenerC2937.f11034 = abstractC20745;
                    viewOnClickListenerC2937.f11038 = z;
                    z3 = true;
                    if (C1148.f5161 <= 0) {
                        c11545 = c11546;
                        iM11306 = C19806.m45029("ܶۚ") ^ i16;
                        i4 = ((iM11306 ^ i15) * 9765) ^ (-1222073095);
                        i5 = -1456828429;
                        i18 = iM11306 ^ i5;
                        i17 = i4;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        c11989 = c11989;
                        i19 = i3;
                    } else {
                        int iM11307 = (ThreadFactoryC3888.m11306("۬ۛ") ^ i15) * 37;
                        i17 = ((iM11307 ^ i16) * (-13083)) ^ 732425352;
                        i18 = iM11307 ^ (-743804869);
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        c11989 = c11989;
                        i19 = i3;
                        c11545 = c11546;
                    }
                    sArr5 = sArr5;
                    j2 = j2;
                    break;
                case -2111566165:
                case 1754856323:
                    if (!RunnableC0195.m1443(dialogInterfaceC19359)) {
                        short[] sArr7 = sArr5;
                        i7 = i19;
                        c11987 = c11989;
                        dialogInterfaceC19357 = dialogInterfaceC19358;
                        j = j2;
                        sArr2 = sArr7;
                        C11986 c119810 = c11986M40033;
                        weakReference = weakReference2;
                        c11988 = c119810;
                        int iM450212 = (C19806.m45029("۬᩵") + i15) * 53;
                        i18 = iM450212 ^ (-1273050154);
                        i17 = ((iM450212 ^ i16) * (-3683)) ^ (-1371185143);
                        dialogInterfaceC19358 = dialogInterfaceC19357;
                        c11989 = c11987;
                        i19 = i7;
                        sArr5 = sArr2;
                        j2 = j;
                        WeakReference weakReference4 = weakReference;
                        c11986M40033 = c11988;
                        weakReference2 = weakReference4;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("֨۬") + i15) * 29;
                        i2 = ((iM450210 ^ i16) * (-2373)) ^ 1379293446;
                        i11 = 1840161367;
                        i18 = iM450210 ^ i11;
                        i17 = i2;
                    }
                    break;
                case -2099893865:
                case -239950048:
                    if (!C3286.f12186) {
                        iM450210 = (i16 - C19806.m45029("۫ܶ")) * (-13);
                        i2 = ((iM450210 ^ i15) * (-321)) ^ (-943837962);
                        i11 = -166098417;
                        i18 = iM450210 ^ i11;
                        i17 = i2;
                    } else {
                        sArr = sArr5;
                        i = i19;
                        c11986 = c11989;
                        dialogInterfaceC19356 = dialogInterfaceC19358;
                        int iM450213 = (i15 - C19806.m45029("֡ۡ")) * 109;
                        i18 = iM450213 ^ (-481804636);
                        int i23 = i;
                        sArr5 = sArr;
                        i17 = ((iM450213 ^ i16) * (-1725)) ^ 1521645919;
                        dialogInterfaceC19358 = dialogInterfaceC19356;
                        c11989 = c11986;
                        i19 = i23;
                    }
                    break;
                case -1744421446:
                case -667086084:
                    short[] sArr8 = sArr5;
                    i = i19;
                    c11986 = c11989;
                    dialogInterfaceC19356 = dialogInterfaceC19358;
                    viewOnClickListenerC2937.f11032 = c11986;
                    long jMo33964 = abstractC20745.mo33964();
                    c11986M40033 = C17132.m40033(C0962.m3741(c11986));
                    if (C1398.f5802 <= 0) {
                        sArr = sArr8;
                        j2 = jMo33964;
                        int iM450214 = (i15 - C19806.m45029("֡ۡ")) * 109;
                        i18 = iM450214 ^ (-481804636);
                        int i24 = i;
                        sArr5 = sArr;
                        i17 = ((iM450214 ^ i16) * (-1725)) ^ 1521645919;
                        dialogInterfaceC19358 = dialogInterfaceC19356;
                        c11989 = c11986;
                        i19 = i24;
                    } else {
                        int iM11308 = (i15 - ThreadFactoryC3888.m11306("ۢ᩷")) * (-43);
                        i18 = iM11308 ^ (-1862657062);
                        i17 = ((iM11308 ^ i16) * 865) ^ (-1360839896);
                        i19 = i;
                        sArr5 = sArr8;
                        dialogInterfaceC19358 = dialogInterfaceC19356;
                        c11989 = c11986;
                        j2 = jMo33964;
                    }
                    break;
                case -1736751506:
                case 1712689040:
                    buttonM44374 = dialogInterfaceC19358.m44374();
                    sArr6 = f11029;
                    i21 = 47;
                    if (C2642.m8171() != 0) {
                        iM450210 = (C19806.m45029("ۛܰ") ^ i15) * 91;
                        i2 = ((iM450210 ^ i16) * 10743) ^ (-544860012);
                        i11 = -1992296939;
                    } else {
                        iM450210 = C19806.m45029("ܿܺ") ^ i16;
                        i2 = ((iM450210 ^ i15) * 17269) ^ (-614955121);
                        i11 = 342217259;
                    }
                    i18 = iM450210 ^ i11;
                    i17 = i2;
                    break;
                case -1734999820:
                case 26150002:
                    j2 = j2;
                    sArr5 = sArr5;
                    i3 = i19;
                    c11989 = c11989;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    s = s2;
                    sArr4 = f11029;
                    if (C1377.m4833() != 0) {
                        s2 = s;
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۡ") ^ i15) * (-49);
                        i4 = ((iM11306 ^ i16) * 3631) ^ (-1858450244);
                        i5 = 1500499939;
                        i18 = iM11306 ^ i5;
                        i17 = i4;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        c11989 = c11989;
                        i19 = i3;
                    } else {
                        int iM450215 = (C19806.m45029("۫֡") ^ i15) * (-45);
                        i18 = iM450215 ^ (-1520611463);
                        i17 = ((iM450215 ^ i16) * (-12661)) ^ 1372749953;
                        s2 = s;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        c11989 = c11989;
                        i19 = i3;
                        viewOnClickListenerC2937 = this;
                    }
                    sArr5 = sArr5;
                    j2 = j2;
                    break;
                case -1619122377:
                case 2067920378:
                    i6 = 16146;
                    int iM450216 = C19806.m45029("ۗܿ") ^ i16;
                    i3 = i6;
                    i17 = ((iM450216 ^ i15) * 32515) ^ (-780687250);
                    i18 = iM450216 ^ 569993795;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    c11989 = c11989;
                    i19 = i3;
                    sArr5 = sArr5;
                    j2 = j2;
                    break;
                case -1614496358:
                case 1230521980:
                    dialogInterfaceC19358.m44362();
                    weakReference3 = new WeakReference(dialogInterfaceC19358);
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM450210 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i15;
                        i2 = ((iM450210 ^ i16) * 8145) ^ (-1482894368);
                        i11 = 259955984;
                    } else {
                        iM450210 = (C19806.m45029("ᩴܽ") + i16) * 37;
                        i2 = ((iM450210 ^ i15) * (-19683)) ^ (-568566610);
                        i11 = -137605649;
                    }
                    i18 = iM450210 ^ i11;
                    i17 = i2;
                    break;
                case -1594272930:
                case 1392552756:
                    C0629.m2907();
                    if (C2124.f7782 <= 0) {
                        iM450210 = C19806.m45029("ۧۤ") ^ i16;
                        i2 = ((iM450210 ^ i15) * 23201) ^ (-213883857);
                        i11 = 1542190712;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i15;
                        i2 = ((iM450210 ^ i16) * 8145) ^ (-1482894368);
                        i11 = 259955984;
                    }
                    i18 = iM450210 ^ i11;
                    i17 = i2;
                    break;
                case -1553265697:
                case -1141660442:
                    j2 = j2;
                    sArr5 = sArr5;
                    i3 = i19;
                    c11989 = c11989;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    s2 = sArr4[26];
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۡ") ^ i15) * (-49);
                        i4 = ((iM11306 ^ i16) * 3631) ^ (-1858450244);
                        i5 = 1500499939;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙܿ") ^ i16) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i15) * 29887) ^ (-1163752954);
                        i5 = -1219957110;
                    }
                    i18 = iM11306 ^ i5;
                    i17 = i4;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    c11989 = c11989;
                    i19 = i3;
                    sArr5 = sArr5;
                    j2 = j2;
                    break;
                case -1442551136:
                case -1248575300:
                    viewOnClickListenerC2937.f11035.m31003(exc, z2);
                    break;
                case -1409005801:
                case 1178279654:
                    if (C0216.f1393 == 0) {
                        j2 = j2;
                        sArr5 = sArr5;
                        i3 = i19;
                        c11989 = c11989;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        iM11306 = C19806.m45029("ܶۚ") ^ i16;
                        i4 = ((iM11306 ^ i15) * 9765) ^ (-1222073095);
                        i5 = -1456828429;
                        i18 = iM11306 ^ i5;
                        i17 = i4;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        c11989 = c11989;
                        i19 = i3;
                        sArr5 = sArr5;
                        j2 = j2;
                    } else {
                        sArr = sArr5;
                        i = i19;
                        c11986 = c11989;
                        dialogInterfaceC19356 = dialogInterfaceC19358;
                        int iM450217 = (i15 - C19806.m45029("֡ۡ")) * 109;
                        i18 = iM450217 ^ (-481804636);
                        int i25 = i;
                        sArr5 = sArr;
                        i17 = ((iM450217 ^ i16) * (-1725)) ^ 1521645919;
                        dialogInterfaceC19358 = dialogInterfaceC19356;
                        c11989 = c11986;
                        i19 = i25;
                    }
                    break;
                case -1308034833:
                case 1083692518:
                    f11030 = weakReference3;
                    buttonM4897 = C1398.m4897(dialogInterfaceC19358);
                    if (C3722.f13525 > 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ܿܿ") ^ i15;
                        i2 = ((iM450210 ^ i16) * (-21355)) ^ (-670400406);
                        i11 = 344488158;
                        i18 = iM450210 ^ i11;
                        i17 = i2;
                    } else {
                        j2 = j2;
                        sArr5 = sArr5;
                        i3 = i19;
                        c11989 = c11989;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        iM11306 = C19806.m45029("ܶۚ") ^ i16;
                        i4 = ((iM11306 ^ i15) * 9765) ^ (-1222073095);
                        i5 = -1456828429;
                        i18 = iM11306 ^ i5;
                        i17 = i4;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        c11989 = c11989;
                        i19 = i3;
                        sArr5 = sArr5;
                        j2 = j2;
                    }
                    break;
                case -1251532729:
                case 1842305859:
                    strM4230 = C1148.m4230(sArr6, i21, 3, i19);
                    if (C7105.f23796 >= 0) {
                        iM450210 = C19806.m45029("ۧۤ") ^ i16;
                        i2 = ((iM450210 ^ i15) * 23201) ^ (-213883857);
                        i11 = 1542190712;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("᩹ۜ") + i15) * 41;
                        i2 = ((iM450210 ^ i16) * 21091) ^ (-437535322);
                        i11 = 1783781727;
                    }
                    i18 = iM450210 ^ i11;
                    i17 = i2;
                    break;
                case -1236901108:
                case 1125734632:
                    break;
                case -1032886667:
                case 887736072:
                    i6 = 39772;
                    int iM450218 = C19806.m45029("ۗܿ") ^ i16;
                    i3 = i6;
                    i17 = ((iM450218 ^ i15) * 32515) ^ (-780687250);
                    i18 = iM450218 ^ 569993795;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    c11989 = c11989;
                    i19 = i3;
                    sArr5 = sArr5;
                    j2 = j2;
                    break;
                case -779062509:
                case 849281612:
                    CallableC1627.m5507();
                    C1189.m4368();
                    break;
                case -751378719:
                case 167015802:
                    dialogInterfaceC19359 = (DialogInterfaceC19356) weakReference2.get();
                    if (dialogInterfaceC19359 == null) {
                        short[] sArr9 = sArr5;
                        i7 = i19;
                        c11987 = c11989;
                        dialogInterfaceC19357 = dialogInterfaceC19358;
                        j = j2;
                        sArr2 = sArr9;
                        C11986 c119811 = c11986M40033;
                        weakReference = weakReference2;
                        c11988 = c119811;
                        int iM450219 = (C19806.m45029("۬᩵") + i15) * 53;
                        i18 = iM450219 ^ (-1273050154);
                        i17 = ((iM450219 ^ i16) * (-3683)) ^ (-1371185143);
                        dialogInterfaceC19358 = dialogInterfaceC19357;
                        c11989 = c11987;
                        i19 = i7;
                        sArr5 = sArr2;
                        j2 = j;
                        WeakReference weakReference5 = weakReference;
                        c11986M40033 = c11988;
                        weakReference2 = weakReference5;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("۫֨") ^ i16;
                        i2 = ((iM450210 ^ i15) * 7915) ^ (-1001227397);
                        i11 = 589743873;
                        i18 = iM450210 ^ i11;
                        i17 = i2;
                    }
                    break;
                case -695652903:
                case 525391756:
                    ThreadFactoryC3888.m11303(buttonM44374, ThreadFactoryC3888.m11306(strM4230) ^ 2098497618);
                    iM450210 = (ThreadFactoryC3888.m11306("ۧᩴ") ^ i16) * 29;
                    i2 = ((iM450210 ^ i15) * (-31183)) ^ (-1287590987);
                    i11 = 2118996314;
                    i18 = iM450210 ^ i11;
                    i17 = i2;
                    break;
                case -642231209:
                case 1082174778:
                    i = i19;
                    sArr = f11029;
                    i20 = 27;
                    i22 = 20;
                    if (!C19806.f63586) {
                        int iM11309 = ThreadFactoryC3888.m11306("ۡۢ") ^ i16;
                        i2 = ((iM11309 ^ i15) * 17619) ^ (-362314230);
                        i18 = iM11309 ^ (-1937877702);
                        i19 = i;
                        sArr5 = sArr;
                        i17 = i2;
                    } else {
                        c11986 = c11989;
                        dialogInterfaceC19356 = dialogInterfaceC19358;
                        int iM4502110 = (i15 - C19806.m45029("֡ۡ")) * 109;
                        i18 = iM4502110 ^ (-481804636);
                        int i26 = i;
                        sArr5 = sArr;
                        i17 = ((iM4502110 ^ i16) * (-1725)) ^ 1521645919;
                        dialogInterfaceC19358 = dialogInterfaceC19356;
                        c11989 = c11986;
                        i19 = i26;
                    }
                    break;
                case -276323756:
                case 1345765939:
                    sArr3 = sArr5;
                    z2 = false;
                    i8 = i19;
                    iM45029 = ThreadFactoryC3888.m11306("ᩴۧ") ^ i16;
                    i9 = ((iM45029 ^ i15) * (-29099)) ^ 55228799;
                    i10 = 345337848;
                    i18 = iM45029 ^ i10;
                    i17 = i9;
                    i19 = i8;
                    sArr5 = sArr3;
                    break;
                case -77283087:
                case 1002660079:
                    j2 = j2;
                    sArr5 = sArr5;
                    i3 = i19;
                    c11989 = c11989;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    s = s2;
                    int i27 = s * 16750;
                    i13 = s * s;
                    if (RunnableC3388.f12514 >= 0) {
                        i12 = i27;
                        s2 = s;
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۡ") ^ i15) * (-49);
                        i4 = ((iM11306 ^ i16) * 3631) ^ (-1858450244);
                        i5 = 1500499939;
                        i18 = iM11306 ^ i5;
                        i17 = i4;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        c11989 = c11989;
                        i19 = i3;
                    } else {
                        int iM113010 = (i15 - ThreadFactoryC3888.m11306("֨ᩴ")) * 3;
                        i17 = ((iM113010 ^ i16) * (-24867)) ^ 1989629967;
                        i18 = iM113010 ^ (-1835896699);
                        s2 = s;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        c11989 = c11989;
                        i19 = i3;
                        i12 = i27;
                    }
                    sArr5 = sArr5;
                    j2 = j2;
                    break;
                case 136870944:
                case 203073433:
                    if (C0526.f2219) {
                        iM450210 = (i16 - C19806.m45029("۫ܶ")) * (-13);
                        i2 = ((iM450210 ^ i15) * (-321)) ^ (-943837962);
                        i11 = -166098417;
                    } else {
                        iM450210 = (C19806.m45029("ۛܰ") ^ i15) * 91;
                        i2 = ((iM450210 ^ i16) * 10743) ^ (-544860012);
                        i11 = -1992296939;
                    }
                    i18 = iM450210 ^ i11;
                    i17 = i2;
                    break;
                case 304219758:
                case 548883724:
                    C1668.m5572(dialogInterfaceC19359);
                    short[] sArr10 = sArr5;
                    i7 = i19;
                    c11987 = c11989;
                    dialogInterfaceC19357 = dialogInterfaceC19358;
                    j = j2;
                    sArr2 = sArr10;
                    C11986 c119812 = c11986M40033;
                    weakReference = weakReference2;
                    c11988 = c119812;
                    int iM4502111 = (C19806.m45029("۬᩵") + i15) * 53;
                    i18 = iM4502111 ^ (-1273050154);
                    i17 = ((iM4502111 ^ i16) * (-3683)) ^ (-1371185143);
                    dialogInterfaceC19358 = dialogInterfaceC19357;
                    c11989 = c11987;
                    i19 = i7;
                    sArr5 = sArr2;
                    j2 = j;
                    WeakReference weakReference6 = weakReference;
                    c11986M40033 = c11988;
                    weakReference2 = weakReference6;
                    break;
                case 533521464:
                case 1149895767:
                    j2 = j2;
                    sArr5 = sArr5;
                    c11989 = c11989;
                    dialogInterfaceC19358 = viewOnClickListenerC2937.f11031;
                    dialogInterfaceC19358.m44372(z ^ z3);
                    C8875.m23019(dialogInterfaceC19358);
                    int iM450220 = (C19806.m45029("ۜܺ") ^ i16) * 37;
                    i3 = i19;
                    i18 = iM450220 ^ 863370751;
                    i17 = ((iM450220 ^ i15) * (-23269)) ^ (-2012584016);
                    c11989 = c11989;
                    i19 = i3;
                    sArr5 = sArr5;
                    j2 = j2;
                    break;
                case 565828300:
                case 1630901733:
                    short[] sArr11 = sArr5;
                    i7 = i19;
                    c11987 = c11989;
                    c11988 = c11986M40033;
                    dialogInterfaceC19357 = dialogInterfaceC19358;
                    long j3 = j2;
                    sArr2 = sArr11;
                    j = j3;
                    viewOnClickListenerC2937.f11037.m49020(c11987, j, c11988);
                    WeakReference weakReference7 = f11030;
                    if (weakReference7 != null) {
                        int iM450221 = C19806.m45029("᩷᩷") ^ i16;
                        i17 = ((iM450221 ^ i15) * (-12893)) ^ 2018072919;
                        i18 = iM450221 ^ (-1460326867);
                        c11989 = c11987;
                        i19 = i7;
                        sArr5 = sArr2;
                        j2 = j;
                        dialogInterfaceC19358 = dialogInterfaceC19357;
                        c11986M40033 = c11988;
                        weakReference2 = weakReference7;
                    } else {
                        weakReference = weakReference7;
                        int iM4502112 = (C19806.m45029("۬᩵") + i15) * 53;
                        i18 = iM4502112 ^ (-1273050154);
                        i17 = ((iM4502112 ^ i16) * (-3683)) ^ (-1371185143);
                        dialogInterfaceC19358 = dialogInterfaceC19357;
                        c11989 = c11987;
                        i19 = i7;
                        sArr5 = sArr2;
                        j2 = j;
                        WeakReference weakReference8 = weakReference;
                        c11986M40033 = c11988;
                        weakReference2 = weakReference8;
                    }
                    break;
                case 619294059:
                case 1559552468:
                    if (!C0797.f3386) {
                        iM450210 = C19806.m45029("ۧۤ") ^ i16;
                        i2 = ((iM450210 ^ i15) * 23201) ^ (-213883857);
                        i11 = 1542190712;
                        i18 = iM450210 ^ i11;
                        i17 = i2;
                    } else {
                        sArr = sArr5;
                        i = i19;
                        c11986 = c11989;
                        dialogInterfaceC19356 = dialogInterfaceC19358;
                        int iM4502113 = (i15 - C19806.m45029("֡ۡ")) * 109;
                        i18 = iM4502113 ^ (-481804636);
                        int i28 = i;
                        sArr5 = sArr;
                        i17 = ((iM4502113 ^ i16) * (-1725)) ^ 1521645919;
                        dialogInterfaceC19358 = dialogInterfaceC19356;
                        c11989 = c11986;
                        i19 = i28;
                    }
                    break;
                case 763141292:
                case 1178320569:
                    sArr3 = sArr5;
                    i8 = i19;
                    C21157.m47601(C1461.m5070(sArr3, i20, i22, i19), null, exc);
                    if (c11545 == null) {
                        z2 = z3;
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۧ") ^ i16;
                        i9 = ((iM45029 ^ i15) * (-29099)) ^ 55228799;
                        i10 = 345337848;
                    } else {
                        iM45029 = (i15 - C19806.m45029("᩶ۘ")) * (-15);
                        i9 = ((iM45029 ^ i16) * (-5191)) ^ 2014149313;
                        i10 = -449009326;
                    }
                    i18 = iM45029 ^ i10;
                    i17 = i9;
                    i19 = i8;
                    sArr5 = sArr3;
                    break;
                case 1228962768:
                case 1712260805:
                    j2 = j2;
                    sArr5 = sArr5;
                    i3 = i19;
                    c11989 = c11989;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    if (i12 - (i13 + 70140625) <= 0) {
                        iM11306 = (i16 - C19806.m45029("᩹ۙ")) * (-23);
                        i4 = ((iM11306 ^ i15) * (-14385)) ^ 224282857;
                        i5 = 375669304;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ֨") ^ i15;
                        i4 = ((iM11306 ^ i16) * (-31233)) ^ 1491971648;
                        i5 = 2108674172;
                    }
                    i18 = iM11306 ^ i5;
                    i17 = i4;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    c11989 = c11989;
                    i19 = i3;
                    sArr5 = sArr5;
                    j2 = j2;
                    break;
                case 1325932499:
                case 1573802669:
                    C1937.m6291(buttonM4897, viewOnClickListenerC2937);
                    C7105.m18993(dialogInterfaceC19358.m44374(), viewOnClickListenerC2937);
                    C7105.m18993(C1460.m5052(dialogInterfaceC19358), viewOnClickListenerC2937);
                    if (c11545 == null) {
                        iM450210 = (ThreadFactoryC3888.m11306("ᩳۙ") ^ i15) * (-63);
                        i2 = ((iM450210 ^ i16) * (-28795)) ^ 720284884;
                        i11 = 1874027643;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ۧᩴ") ^ i16) * 29;
                        i2 = ((iM450210 ^ i15) * (-31183)) ^ (-1287590987);
                        i11 = 2118996314;
                    }
                    i18 = iM450210 ^ i11;
                    i17 = i2;
                    break;
                case 1980901586:
                case 2108317032:
                    j2 = j2;
                    sArr5 = sArr5;
                    i3 = i19;
                    c11989 = c11989;
                    dialogInterfaceC19358 = dialogInterfaceC19358;
                    try {
                        C11986 c11986M40022 = C17132.m40022(abstractC20745);
                        int iM450222 = C19806.m45029("ܰ֡") ^ i16;
                        int i29 = ((iM450222 ^ i15) * 6443) ^ (-312393727);
                        i18 = iM450222 ^ 2034230074;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        i19 = i3;
                        c11989 = c11986M40022;
                        i17 = i29;
                    } catch (Exception e) {
                        int iM113011 = (ThreadFactoryC3888.m11306("ۘܳ") ^ i15) * (-31);
                        i18 = iM113011 ^ 1610846450;
                        exc = e;
                        i17 = ((iM113011 ^ i16) * (-9159)) ^ 891867434;
                        dialogInterfaceC19358 = dialogInterfaceC19358;
                        c11989 = c11989;
                        i19 = i3;
                    }
                    sArr5 = sArr5;
                    j2 = j2;
                    break;
                default:
                    C3286.m9798();
                    sArr = sArr5;
                    i = i19;
                    c11986 = c11989;
                    dialogInterfaceC19356 = dialogInterfaceC19358;
                    int iM4502114 = (i15 - C19806.m45029("֡ۡ")) * 109;
                    i18 = iM4502114 ^ (-481804636);
                    int i210 = i;
                    sArr5 = sArr;
                    i17 = ((iM4502114 ^ i16) * (-1725)) ^ 1521645919;
                    dialogInterfaceC19358 = dialogInterfaceC19356;
                    c11989 = c11986;
                    i19 = i210;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8761(ViewOnClickListenerC2937 viewOnClickListenerC2937) {
        boolean z = false;
        DialogInterfaceC19356 dialogInterfaceC19356 = null;
        int i = 85058989;
        int i2 = C0629.f2722;
        int i3 = C1189.f5284;
        int iM45029 = (C19806.m45029("ۖۧ") + i3) * 83;
        int i4 = ((iM45029 ^ i2) * (-32567)) ^ (-605478780);
        int i5 = -345881929;
        while (true) {
            i = ((((i ^ i2) * (-6955)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2036942857:
                case -156928304:
                    if (C1875.f7103 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۧ") ^ i2) * 79;
                        i4 = ((iM45029 ^ i3) * (-30493)) ^ 2112079203;
                        i5 = 890285329;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬᩻") ^ i3) * 11;
                        i4 = ((iM45029 ^ i2) * 3149) ^ (-306298346);
                        i5 = -722952357;
                    }
                    break;
                case -2035858651:
                case -1706185310:
                    if (C1066.f4915 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۗ") + i3) * 45;
                        i4 = ((iM45029 ^ i2) * 7111) ^ 1229398617;
                        i5 = 1244672646;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14039) ^ (-1523792645);
                        i5 = -830096401;
                    }
                    break;
                case -1940452079:
                case 1556614759:
                    z = true;
                    if (RunnableC1564.m5345()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۧ") ^ i2) * 79;
                        i4 = ((iM45029 ^ i3) * (-30493)) ^ 2112079203;
                        i5 = 890285329;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۬ۤ")) * (-27);
                        i4 = ((iM45029 ^ i3) * (-4811)) ^ 503434630;
                        i5 = -832448740;
                    }
                    break;
                case -1828241929:
                case -1717967881:
                    C1668.m5572(dialogInterfaceC19356);
                    if (C2477.m7593() < 0) {
                        RunnableC0195.m1442(new C9289(viewOnClickListenerC2937));
                    }
                    iM45029 = (ThreadFactoryC3888.m11306("ۚۗ") + i3) * 45;
                    i4 = ((iM45029 ^ i2) * 7111) ^ 1229398617;
                    i5 = 1244672646;
                    break;
                case -1632488376:
                case 856916585:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬᩻") ^ i3) * 11;
                        i4 = ((iM45029 ^ i2) * 3149) ^ (-306298346);
                        i5 = -722952357;
                    } else {
                        iM45029 = (C19806.m45029("֫ܶ") + i2) * (-109);
                        i4 = ((iM45029 ^ i3) * (-26949)) ^ (-1538993917);
                        i5 = 1068595544;
                    }
                    break;
                case -1277211693:
                case -879957016:
                    C1025.m3861();
                    iM45029 = (ThreadFactoryC3888.m11306("۬᩻") ^ i3) * 11;
                    i4 = ((iM45029 ^ i2) * 3149) ^ (-306298346);
                    i5 = -722952357;
                    break;
                case -1094693119:
                case 938062012:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۧ") ^ i2) * 79;
                        i4 = ((iM45029 ^ i3) * (-30493)) ^ 2112079203;
                        i5 = 890285329;
                    } else {
                        iM45029 = C19806.m45029("۟۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31645) ^ (-682633470);
                        i5 = -256128488;
                    }
                    break;
                case -710702342:
                case 387678381:
                    viewOnClickListenerC2937.f11036 = z;
                    if (C3535.f13026 <= 0) {
                        iM45029 = (C19806.m45029("᩻ܰ") ^ i3) * (-107);
                        i4 = ((iM45029 ^ i2) * (-16661)) ^ (-592030629);
                        i5 = -317563125;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2977)) ^ 324840107;
                        i5 = -84218535;
                    }
                    break;
                case -472596164:
                case -331503905:
                    if (C0216.m1591() <= 0) {
                        iM45029 = (C19806.m45029("᩻ܰ") ^ i3) * (-107);
                        i4 = ((iM45029 ^ i2) * (-16661)) ^ (-592030629);
                        i5 = -317563125;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۘ") ^ i3) * 127;
                        i4 = ((iM45029 ^ i2) * 14571) ^ (-1074141924);
                        i5 = -301214009;
                    }
                    break;
                case -376043799:
                case 707305117:
                    dialogInterfaceC19356 = viewOnClickListenerC2937.f11031;
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31229) ^ (-63747745);
                        i5 = -1246381956;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۜ") ^ i2) * (-57);
                        i4 = ((iM45029 ^ i3) * (-4581)) ^ 572822033;
                        i5 = 903870597;
                    }
                    break;
                case -1920513:
                case 1282495412:
                    C1398.m4895();
                    if (!C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬᩻") ^ i3) * 11;
                        i4 = ((iM45029 ^ i2) * 3149) ^ (-306298346);
                        i5 = -722952357;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۗ") + i3) * 45;
                        i4 = ((iM45029 ^ i2) * 7111) ^ 1229398617;
                        i5 = 1244672646;
                    }
                    break;
                case 133014769:
                case 157425393:
                    C1066.m4023();
                    break;
                case 923045365:
                case 1558614500:
                    if (C3660.m10791() != 0) {
                        iM45029 = (C19806.m45029("᩻ܰ") ^ i3) * (-107);
                        i4 = ((iM45029 ^ i2) * (-16661)) ^ (-592030629);
                        i5 = -317563125;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-17475)) ^ (-1060259381);
                        i5 = 1734204837;
                    }
                    break;
                case 1026392544:
                case 1921221399:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۗ") + i3) * 45;
                        i4 = ((iM45029 ^ i2) * 7111) ^ 1229398617;
                        i5 = 1244672646;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۤۘ")) * (-77);
                        i4 = ((iM45029 ^ i2) * 30703) ^ (-1039307572);
                        i5 = -1538360721;
                    }
                    break;
                default:
                    C3286.m9798();
                    if (!C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۧ") ^ i2) * 79;
                        i4 = ((iM45029 ^ i3) * (-30493)) ^ 2112079203;
                        i5 = 890285329;
                    } else {
                        iM45029 = (C19806.m45029("᩻ܰ") ^ i3) * (-107);
                        i4 = ((iM45029 ^ i2) * (-16661)) ^ (-592030629);
                        i5 = -317563125;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01a6, code lost:
    
        if (l.CallableC1627.f6528 != false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r47) {
        /*
            Method dump skipped, instruction units count: 2668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2937.onClick(android.view.View):void");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C11986 c11986 = null;
        int i = -462702978;
        int i2 = C1461.f5957;
        int i3 = C1937.f7317;
        int iM45029 = C19806.m45029("ۢ᩸") ^ i3;
        int i4 = ((iM45029 ^ i2) * 14995) ^ 293535608;
        int i5 = -1743405249;
        while (true) {
            i = ((((i ^ i2) * (-12183)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2107578008:
                case -1774485803:
                    C1419.m4973();
                    RunnableC1895.m6170();
                    break;
                case -1925889387:
                case -274144987:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (C19806.m45029("ᩴ᩺") + i2) * (-121);
                        i4 = ((iM45029 ^ i3) * (-17491)) ^ 595471671;
                        i5 = -1259001353;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15017)) ^ 133812488;
                        i5 = 930875605;
                    }
                    break;
                case -1795779219:
                case -1320302797:
                    C0278.m1783(this.f11035);
                    iM45029 = (i2 - ThreadFactoryC3888.m11306("᩺᩻")) * (-89);
                    i4 = ((iM45029 ^ i3) * (-26587)) ^ 162608880;
                    i5 = 814098202;
                    break;
                case -1759839678:
                case 1214926865:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۫᩶")) * (-73);
                        i4 = ((iM45029 ^ i2) * 13505) ^ 2020852552;
                        i5 = -70653301;
                    } else {
                        iM45029 = (C19806.m45029("ۨܶ") + i3) * 71;
                        i4 = ((iM45029 ^ i2) * (-2557)) ^ 704353348;
                        i5 = 1337396103;
                    }
                    break;
                case -1704078536:
                case 401148889:
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("۟۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29983)) ^ 430961539;
                        i5 = 998441819;
                    } else {
                        iM45029 = (C19806.m45029("ܳᩳ") + i3) * 21;
                        i4 = ((iM45029 ^ i2) * (-3731)) ^ 1315280584;
                        i5 = 516500920;
                    }
                    break;
                case -1438509459:
                case 1871425380:
                    C2704.m8255();
                    C2871.m8646();
                    iM45029 = (C19806.m45029("ᩴ᩺") + i2) * (-121);
                    i4 = ((iM45029 ^ i3) * (-17491)) ^ 595471671;
                    i5 = -1259001353;
                    break;
                case -1374733050:
                case 1863978899:
                    if (C0216.m1591() <= 0) {
                        iM45029 = (C19806.m45029("ܳܽ") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * 19301) ^ 496318371;
                        i5 = -1632825237;
                    } else {
                        iM45029 = (C19806.m45029("֨ۨ") ^ i3) * (-121);
                        i4 = ((iM45029 ^ i2) * (-18467)) ^ (-105533863);
                        i5 = -2077313950;
                    }
                    break;
                case -1345262189:
                case -1038419476:
                    c11986.m29813();
                    if (this.f11036) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩺᩻")) * (-89);
                        i4 = ((iM45029 ^ i3) * (-26587)) ^ 162608880;
                        i5 = 814098202;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۠ۜ")) * (-99);
                        i4 = ((iM45029 ^ i2) * (-8397)) ^ 899011822;
                        i5 = -187852499;
                    }
                    break;
                case -1175379221:
                case 1970419956:
                    break;
                case -1166272668:
                case 775354970:
                    if (C0629.m2907()) {
                        iM45029 = (i3 - C19806.m45029("ܺۛ")) * 25;
                        i4 = ((iM45029 ^ i2) * 8305) ^ 1720534905;
                        i5 = 1890096990;
                    } else {
                        iM45029 = (C19806.m45029("ܳܽ") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * 19301) ^ 496318371;
                        i5 = -1632825237;
                    }
                    break;
                case -856660204:
                case 1979219186:
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("᩹ܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23773)) ^ 1767199026;
                        i5 = 2052096411;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * 4901) ^ (-601136324);
                        i5 = -1414924077;
                    }
                    break;
                case -801133093:
                case 33059227:
                    C3286.m9798();
                    if (!C0817.f3443) {
                        iM45029 = (C19806.m45029("ᩴ᩺") + i2) * (-121);
                        i4 = ((iM45029 ^ i3) * (-17491)) ^ 595471671;
                        i5 = -1259001353;
                    } else {
                        iM45029 = (C19806.m45029("ܳܽ") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * 19301) ^ 496318371;
                        i5 = -1632825237;
                    }
                    break;
                case -204727953:
                case 194608998:
                    if (C1977.m6356()) {
                        iM45029 = (C19806.m45029("ܳܽ") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * 19301) ^ 496318371;
                        i5 = -1632825237;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۧۧ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 4621) ^ 2007324614;
                        i5 = 1543720086;
                    }
                    break;
                case -150882252:
                case 1940465028:
                    if (C0526.f2219) {
                        iM45029 = (C19806.m45029("ܳܽ") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * 19301) ^ 496318371;
                        i5 = -1632825237;
                    } else {
                        iM45029 = C19806.m45029("۟ܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20395)) ^ 1740701009;
                        i5 = 269463942;
                    }
                    break;
                case 573999074:
                case 1886167404:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = C19806.m45029("۟۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29983)) ^ 430961539;
                        i5 = 998441819;
                    } else {
                        iM45029 = (C19806.m45029("ܳܽ") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * 19301) ^ 496318371;
                        i5 = -1632825237;
                    }
                    break;
                case 582889568:
                case 1919359460:
                    if (this.f11033 == null) {
                        iM45029 = C19806.m45029("ۚ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-26595)) ^ (-569046286);
                        i5 = 2135571282;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩺᩻")) * (-89);
                        i4 = ((iM45029 ^ i3) * (-26587)) ^ 162608880;
                        i5 = 814098202;
                    }
                    break;
                case 931870240:
                case 1011801189:
                    C7105.m18985();
                    if (C10634.f36300 < 0) {
                        iM45029 = C19806.m45029("᩹ܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23773)) ^ 1767199026;
                        i5 = 2052096411;
                    } else {
                        iM45029 = (C19806.m45029("ܳܽ") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * 19301) ^ 496318371;
                        i5 = -1632825237;
                    }
                    break;
                case 1093525099:
                case 1372396203:
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("᩹ܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23773)) ^ 1767199026;
                        i5 = 2052096411;
                    } else {
                        iM45029 = (C19806.m45029("֨۠") ^ i2) * (-23);
                        i4 = ((iM45029 ^ i3) * 10301) ^ 1684172214;
                        i5 = -2083178618;
                    }
                    break;
                default:
                    c11986 = this.f11032;
                    if (C0817.f3443) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩳ۟")) * 65;
                        i4 = ((iM45029 ^ i3) * (-8909)) ^ (-1871458639);
                        i5 = -1292353157;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۫᩶")) * (-73);
                        i4 = ((iM45029 ^ i2) * 13505) ^ 2020852552;
                        i5 = -70653301;
                    }
                    break;
            }
            return;
        }
    }
}
