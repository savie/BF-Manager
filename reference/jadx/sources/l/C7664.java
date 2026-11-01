package l;

import com.alipay.sdk.app.PayTask;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۟ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T5M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7664 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۫᩻ۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f25333 = {522, 1124, 5291, -2473, -5983, 25466, 25470, 25470, 25470, 25467, 25470, 25470, 25470, 25464, 25470, 25470, 25471, 25464, 25470, 25470, 25468, 25464, 25470, 25470, 25466, 25462, 25470, 25470, 25470, 25463, 25470, 25470, 25470, 1633, 11670, 14975, -4501, -3453, 14915, -5959, 3852, 1633, 11670, -5147, 12440, 3782, 7199, 7570, -4976, 235, 12980, -2473, 1633, 11670, 7581, 1234, 1124, 5291, 1633, 11670, 350, 12753, 9750, -7413, -7398, -7422, -7374, -7403, -7395, -7404, -7415, -7394, -7416, -7410, -7401, -7409, -7384, -7409, -7398, -7409, -7410, -7416};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f25334;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25335;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25336;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25337;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f25338;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f25339;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public RunnableC10487 f25340;

    public C7664(AbstractActivityC12483 abstractActivityC12483, String str, long j, int i, String str2) {
        int i2 = -1494150216;
        int i3 = ThreadFactoryC3888.f14547;
        int i4 = C1937.f7317;
        this.f25339 = abstractActivityC12483;
        this.f25335 = str;
        this.f25334 = j;
        this.f25337 = i;
        this.f25336 = str2;
        int iM45029 = (C19806.m45029("᩺᩻") + i4) * (-37);
        int i5 = ((iM45029 ^ i3) * 5329) ^ 1309909924;
        int i6 = 146616350;
        while (true) {
            i2 = (iM45029 ^ i6) ^ (i5 & (((i2 ^ i3) * (-20793)) >> 31));
            switch (i2) {
                case -2017024930:
                case -436886844:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩵") + i4) * (-33);
                        i5 = ((iM45029 ^ i3) * 30211) ^ 776855465;
                        i6 = 1579334714;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛܶ") + i4) * (-127);
                        i5 = ((iM45029 ^ i3) * 21201) ^ 10008677;
                        i6 = 1126004062;
                    }
                    break;
                case -1960694066:
                case -433846230:
                    if (C0278.f1572 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۛ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM45029 ^ i4) * 8019) ^ (-1305326497);
                        i6 = -415492717;
                    } else {
                        iM45029 = (C19806.m45029("᩺ܶ") ^ i4) * (-21);
                        i5 = ((iM45029 ^ i3) * 21829) ^ 707738886;
                        i6 = -768468260;
                    }
                    break;
                case -1835969793:
                case 1309263990:
                    return;
                case -1833180209:
                case -1566058381:
                    C1025.m3861();
                    C1977.m6356();
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ܽۡ")) * 53;
                    i5 = ((iM45029 ^ i4) * (-6187)) ^ 6930320;
                    i6 = 440675139;
                    break;
                case -1424786755:
                case -1028099661:
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-24427)) ^ (-1176929751);
                        i6 = -1337501666;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۛ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM45029 ^ i4) * 8019) ^ (-1305326497);
                        i6 = -415492717;
                    }
                    break;
                case -434660382:
                case -131097981:
                    C1460.m5050();
                    ThreadFactoryC3888.m11300();
                    throw new RuntimeException();
                default:
                    RunnableC0195.m1431();
                    if (C3660.f13403 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۛ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM45029 ^ i4) * 8019) ^ (-1305326497);
                        i6 = -415492717;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܽۡ")) * 53;
                        i5 = ((iM45029 ^ i4) * (-6187)) ^ 6930320;
                        i6 = 440675139;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C0671.m3016(this, this.f25339);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0226 A[PHI: r3 r4
      0x0226: PHI (r3v66 l.ۤᩴ᩺) = (r3v65 l.ۤᩴ᩺), (r3v2 l.ۤᩴ᩺), (r3v2 l.ۤᩴ᩺) binds: [B:54:0x020f, B:47:0x01b8, B:44:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r4v85 l.ۤᩴ᩺) = (r4v2 l.ۤᩴ᩺), (r4v84 l.ۤᩴ᩺), (r4v2 l.ۤᩴ᩺) binds: [B:54:0x020f, B:47:0x01b8, B:44:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0246 A[PHI: r7 r8 r9
      0x0246: PHI (r7v4 short[]) = (r7v3 short[]), (r7v2 short[]), (r7v2 short[]) binds: [B:58:0x0244, B:219:0x0246, B:17:0x0108] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:58:0x0244, B:219:0x0246, B:17:0x0108] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:58:0x0244, B:219:0x0246, B:17:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:115:0x0598. Please report as an issue. */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        int i;
        int i2;
        int i3;
        String str;
        short[] sArr;
        int iM11306;
        int i4;
        int i5;
        int iM11307;
        int i6;
        short[] sArr2;
        int i7;
        int i8;
        int iM45029;
        int i9;
        int i10;
        int iM11308;
        int i11;
        int i12;
        C7664 c7664 = this;
        int i13 = C0629.f2722;
        int i14 = C3660.f13403;
        int iM450210 = C19806.m45029("ۢۗ") ^ i13;
        int i15 = ((iM450210 ^ i14) * (-29577)) ^ 811875754;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        int i16 = iM450210 ^ (-1445775794);
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 2138536380;
        int i35 = 0;
        RunnableC10487 runnableC10487 = null;
        RunnableC10487 runnableC10488 = null;
        String str2 = null;
        while (true) {
            i34 = i16 ^ (i15 & (((i34 ^ i14) * 1201) >> 31));
            switch (i34) {
                case -2093669751:
                case -619502753:
                    runnableC10488 = runnableC10488;
                    i2 = i31;
                    i32 = i32;
                    i35 = i35;
                    i17 = i17;
                    sArr6 = sArr6;
                    i33 = i33;
                    sArr7 = sArr7;
                    runnableC10487 = runnableC10487;
                    sArr2 = f25333;
                    i7 = 5;
                    i30 = 4;
                    if (C1875.f7103 >= 0) {
                        i27 = i27;
                        int iM11309 = ThreadFactoryC3888.m11306("۬ܿ") ^ i13;
                        i27 = i27;
                        i35 = i35;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr2;
                        i15 = ((iM11309 ^ i14) * (-1393)) ^ 1987297745;
                        i17 = i17;
                        i31 = i2;
                        i29 = i7;
                        runnableC10488 = runnableC10488;
                        i16 = iM11309 ^ (-645724939);
                        c7664 = this;
                    } else {
                        int iM450211 = (C19806.m45029("᩻ۛ") + i14) * 69;
                        int i36 = ((iM450211 ^ i13) * 6091) ^ (-563030397);
                        i35 = i35;
                        runnableC10488 = runnableC10488;
                        i16 = iM450211 ^ (-2054367658);
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr2;
                        i15 = i36;
                        i17 = i17;
                        i31 = i2;
                        i29 = 5;
                    }
                    break;
                case -2059315861:
                case -912135184:
                    CallableC1627.m5503(RunnableC1564.m5344(sArr10, i21, i23, i22));
                    runnableC10487 = c7664.f25340;
                    if (runnableC10487 != null) {
                        iM11308 = ThreadFactoryC3888.m11306("۬ܳ") ^ i14;
                        i11 = ((iM11308 ^ i13) * 31271) ^ (-619643120);
                        i12 = -1199468071;
                    } else {
                        iM11308 = C19806.m45029("ܺ֫") ^ i13;
                        i11 = ((iM11308 ^ i14) * (-32743)) ^ (-1016331346);
                        i12 = -735289376;
                    }
                    i16 = iM11308 ^ i12;
                    i15 = i11;
                    break;
                case -2023592032:
                case -1814760432:
                    runnableC10488 = runnableC10488;
                    short[] sArr11 = sArr6;
                    int i37 = i32;
                    i33 = i33;
                    i = i35;
                    sArr7 = sArr7;
                    runnableC10487 = runnableC10487;
                    int i38 = i31;
                    i17 = i17;
                    if (AbstractC0464.m2315(str2, RunnableC1606.m5481(sArr11, i38, i37, i22))) {
                        int iM113010 = (ThreadFactoryC3888.m11306("ᩴۙ") + i14) * 5;
                        i15 = ((iM113010 ^ i13) * (-19443)) ^ 1888809282;
                        i35 = i;
                        i32 = i37;
                        runnableC10488 = runnableC10488;
                        i16 = iM113010 ^ 1163662121;
                        i17 = i17;
                        i31 = i38;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr11;
                    } else {
                        sArr6 = sArr11;
                        str = str2;
                        i3 = i28;
                        i29 = i29;
                        i2 = i38;
                        i27 = i27;
                        short[] sArr12 = sArr5;
                        i32 = i37;
                        i30 = i30;
                        sArr5 = sArr12;
                        int iM450212 = C19806.m45029("ۨ᩸") ^ i13;
                        String str3 = str;
                        i15 = ((iM450212 ^ i14) * 1355) ^ 982602192;
                        i8 = iM450212 ^ (-1447269748);
                        i28 = i3;
                        i35 = i;
                        str2 = str3;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i39 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i39;
                    }
                    break;
                case -1835143111:
                case 1003062255:
                    sArr9 = f25333;
                    i19 = 52;
                    i20 = 6;
                    if (C3722.m10894() <= 0) {
                        iM11308 = (i13 - C19806.m45029("᩻᩵")) * 37;
                        i11 = ((iM11308 ^ i14) * (-5257)) ^ (-1464519349);
                        i12 = 1457355288;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("᩺֫") ^ i13;
                        i11 = ((iM11308 ^ i14) * 27271) ^ 1860822548;
                        i12 = -649985285;
                    }
                    i16 = iM11308 ^ i12;
                    i15 = i11;
                    break;
                case -1765334187:
                case 964191796:
                    sArr10 = f25333;
                    i21 = 58;
                    i23 = 4;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11308 = C19806.m45029("ܺۛ") ^ i14;
                        i11 = ((iM11308 ^ i13) * 10597) ^ 1190947461;
                        i12 = 1690723550;
                    } else {
                        iM11308 = (i14 - ThreadFactoryC3888.m11306("ۛۗ")) * (-91);
                        i11 = ((iM11308 ^ i13) * 23227) ^ 2025470694;
                        i12 = -1876331640;
                    }
                    i16 = iM11308 ^ i12;
                    i15 = i11;
                    break;
                case -1737241014:
                case 1674321638:
                    C2249.m6915();
                    if (C1460.m5050() == 0) {
                        iM11308 = C19806.m45029("ܺۛ") ^ i14;
                        i11 = ((iM11308 ^ i13) * 10597) ^ 1190947461;
                        i12 = 1690723550;
                        i16 = iM11308 ^ i12;
                        i15 = i11;
                    } else {
                        runnableC10488 = runnableC10488;
                        i33 = i33;
                        sArr7 = sArr7;
                        runnableC10487 = runnableC10487;
                        int i40 = i31;
                        i17 = i17;
                        i29 = i29;
                        i2 = i40;
                        int iM113011 = (ThreadFactoryC3888.m11306("ܰܽ") ^ i14) * (-49);
                        i15 = ((iM113011 ^ i13) * 30025) ^ 1341696833;
                        i8 = iM113011 ^ 555058335;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i310 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i310;
                    }
                    break;
                case -1699872349:
                case 1732429721:
                    runnableC10488 = runnableC10488;
                    short[] sArr13 = sArr5;
                    i30 = i30;
                    i32 = i32;
                    i = i35;
                    sArr6 = sArr6;
                    i33 = i33;
                    sArr7 = sArr7;
                    runnableC10487 = runnableC10487;
                    int i41 = i31;
                    i17 = i17;
                    i29 = i29;
                    i2 = i41;
                    if (!C1460.m5058(str2, C3286.m9788(sArr13, i29, i30, i22))) {
                        sArr5 = sArr13;
                        str = str2;
                        i27 = i27;
                        i3 = i28;
                        int iM450213 = C19806.m45029("ۨ᩸") ^ i13;
                        String str4 = str;
                        i15 = ((iM450213 ^ i14) * 1355) ^ 982602192;
                        i8 = iM450213 ^ (-1447269748);
                        i28 = i3;
                        i35 = i;
                        str2 = str4;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i311 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i311;
                    } else {
                        int iM113012 = ThreadFactoryC3888.m11306("᩺۟") ^ i13;
                        i15 = ((iM113012 ^ i14) * 9583) ^ 1041457723;
                        i35 = i;
                        sArr = sArr13;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = iM113012 ^ (-987220921);
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr;
                        int i42 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i42;
                    }
                    break;
                case -1562899468:
                case 1963049978:
                    C0797.m3359();
                    if (!CallableC1627.f6528) {
                        runnableC10488 = runnableC10488;
                        iM45029 = C19806.m45029("ۧܿ") ^ i13;
                        i9 = ((iM45029 ^ i14) * (-24663)) ^ (-1958694881);
                        i10 = 774001880;
                        RunnableC10487 runnableC10489 = runnableC10488;
                        i16 = iM45029 ^ i10;
                        i15 = i9;
                        runnableC10488 = runnableC10489;
                    } else {
                        iM11308 = (i14 - C19806.m45029("ܳᩴ")) * 49;
                        i11 = ((iM11308 ^ i13) * (-28107)) ^ 261305641;
                        i12 = 2101723928;
                        i16 = iM11308 ^ i12;
                        i15 = i11;
                    }
                    break;
                case -1543485264:
                case 150479362:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C3577.f13150 >= 0) {
                        iM11308 = (i13 - C19806.m45029("᩻᩵")) * 37;
                        i11 = ((iM11308 ^ i14) * (-5257)) ^ (-1464519349);
                        i12 = 1457355288;
                        i16 = iM11308 ^ i12;
                        i15 = i11;
                    } else {
                        runnableC10488 = runnableC10488;
                        i33 = i33;
                        sArr7 = sArr7;
                        runnableC10487 = runnableC10487;
                        int i43 = i31;
                        i17 = i17;
                        i29 = i29;
                        i2 = i43;
                        int iM113013 = (ThreadFactoryC3888.m11306("ܰܽ") ^ i14) * (-49);
                        i15 = ((iM113013 ^ i13) * 30025) ^ 1341696833;
                        i8 = iM113013 ^ 555058335;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i312 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i312;
                    }
                    break;
                case -1479568725:
                case -1162069313:
                    runnableC10488 = runnableC10488;
                    i30 = i30;
                    i35 = i35;
                    sArr5 = sArr5;
                    i32 = i32;
                    sArr6 = sArr6;
                    i33 = i33;
                    sArr7 = sArr7;
                    runnableC10487 = runnableC10487;
                    i27 = i27;
                    int i44 = i31;
                    i17 = i17;
                    i29 = i29;
                    i2 = i44;
                    sArr3 = f25333;
                    c = 0;
                    if (C2332.m7079() > 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ܺ۟") ^ i13;
                        i15 = ((iM11307 ^ i14) * (-30213)) ^ 1640362438;
                        i6 = -1531656851;
                        i8 = iM11307 ^ i6;
                        i27 = i27;
                        i35 = i35;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i313 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i313;
                    } else {
                        sArr2 = sArr5;
                        i30 = i30;
                        i7 = i29;
                        int iM113014 = ThreadFactoryC3888.m11306("۬ܿ") ^ i13;
                        i27 = i27;
                        i35 = i35;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr2;
                        i15 = ((iM113014 ^ i14) * (-1393)) ^ 1987297745;
                        i17 = i17;
                        i31 = i2;
                        i29 = i7;
                        runnableC10488 = runnableC10488;
                        i16 = iM113014 ^ (-645724939);
                        c7664 = this;
                    }
                    break;
                case -1444485419:
                case 405979157:
                    runnableC10488 = runnableC10488;
                    if (!AbstractC0464.m2315(str2, C0797.m3361(sArr8, i17, i18, i22))) {
                        str = str2;
                        i3 = i28;
                        i30 = i30;
                        i = i35;
                        sArr5 = sArr5;
                        i32 = i32;
                        sArr6 = sArr6;
                        i33 = i33;
                        sArr7 = sArr7;
                        runnableC10487 = runnableC10487;
                        i27 = i27;
                        int i45 = i31;
                        i17 = i17;
                        i29 = i29;
                        i2 = i45;
                        int iM450214 = C19806.m45029("ۨ᩸") ^ i13;
                        String str5 = str;
                        i15 = ((iM450214 ^ i14) * 1355) ^ 982602192;
                        i8 = iM450214 ^ (-1447269748);
                        i28 = i3;
                        i35 = i;
                        str2 = str5;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i314 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i314;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩹") ^ i14) * (-23);
                        i9 = ((iM45029 ^ i13) * 16467) ^ 1741523808;
                        i10 = -424886299;
                        RunnableC10487 runnableC104810 = runnableC10488;
                        i16 = iM45029 ^ i10;
                        i15 = i9;
                        runnableC10488 = runnableC104810;
                    }
                    break;
                case -1426091126:
                case 316630999:
                    runnableC10488 = runnableC10488;
                    if (!AbstractC0464.m2315(str2, C0962.m3747(f25333, 25, 4, i22))) {
                        str = str2;
                        i3 = i28;
                        i30 = i30;
                        i = i35;
                        sArr5 = sArr5;
                        i32 = i32;
                        sArr6 = sArr6;
                        i33 = i33;
                        sArr7 = sArr7;
                        runnableC10487 = runnableC10487;
                        i27 = i27;
                        int i46 = i31;
                        i17 = i17;
                        i29 = i29;
                        i2 = i46;
                        int iM450215 = C19806.m45029("ۨ᩸") ^ i13;
                        String str6 = str;
                        i15 = ((iM450215 ^ i14) * 1355) ^ 982602192;
                        i8 = iM450215 ^ (-1447269748);
                        i28 = i3;
                        i35 = i;
                        str2 = str6;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i315 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i315;
                    } else {
                        iM45029 = (C19806.m45029("ۛۛ") ^ i14) * 53;
                        i9 = ((iM45029 ^ i13) * (-22431)) ^ (-756685875);
                        i10 = -173786874;
                        RunnableC10487 runnableC104811 = runnableC10488;
                        i16 = iM45029 ^ i10;
                        i15 = i9;
                        runnableC10488 = runnableC104811;
                    }
                    break;
                case -1348735750:
                case 1898951007:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C3722.f13525 <= 0) {
                        runnableC10488 = runnableC10488;
                        i30 = i30;
                        i = i35;
                        sArr5 = sArr5;
                        i32 = i32;
                        sArr6 = sArr6;
                        i33 = i33;
                        sArr7 = sArr7;
                        runnableC10487 = runnableC10487;
                        int i47 = i31;
                        i17 = i17;
                        i29 = i29;
                        i2 = i47;
                        iM11306 = (C19806.m45029("֡֡") + i13) * 101;
                        i4 = ((iM11306 ^ i14) * 20525) ^ 810640421;
                        i5 = 163341824;
                        int i48 = iM11306 ^ i5;
                        i35 = i;
                        RunnableC10487 runnableC104812 = runnableC10488;
                        i16 = i48;
                        i15 = i4;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC104812;
                        int i49 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i49;
                    } else {
                        iM11308 = (i14 - C19806.m45029("ܳᩴ")) * 49;
                        i11 = ((iM11308 ^ i13) * (-28107)) ^ 261305641;
                        i12 = 2101723928;
                        i16 = iM11308 ^ i12;
                        i15 = i11;
                    }
                    break;
                case -1318232676:
                case -1210322100:
                    runnableC10488 = runnableC10488;
                    i30 = i30;
                    i35 = i35;
                    sArr5 = sArr5;
                    i32 = i32;
                    sArr6 = sArr6;
                    i33 = i33;
                    sArr7 = sArr7;
                    runnableC10487 = runnableC10487;
                    i27 = i27;
                    int i50 = i31;
                    i17 = i17;
                    i29 = i29;
                    i2 = i50;
                    s = sArr3[c];
                    s2 = 26056;
                    if (C3535.f13026 <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("᩷֫") ^ i13) * (-43);
                        i15 = ((iM11307 ^ i14) * 1733) ^ 355093114;
                        i6 = 321872874;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܳᩳ") ^ i14) * (-29);
                        i15 = ((iM11307 ^ i13) * (-10365)) ^ (-778945726);
                        i6 = 819725677;
                    }
                    i8 = iM11307 ^ i6;
                    i27 = i27;
                    i35 = i35;
                    runnableC10487 = runnableC10487;
                    sArr7 = sArr7;
                    i33 = i33;
                    sArr6 = sArr6;
                    i32 = i32;
                    sArr5 = sArr5;
                    i30 = i30;
                    runnableC10488 = runnableC10488;
                    i16 = i8;
                    c7664 = this;
                    int i316 = i2;
                    i29 = i29;
                    i17 = i17;
                    i31 = i316;
                    break;
                case -1289035807:
                case -296947137:
                    CallableC1627.m5503(C2704.m8240(f25333, 37, 4, i22));
                    break;
                case -1288851741:
                case -1158264639:
                    runnableC10488.run();
                    C7321 c7321 = C7321.f24318;
                    iM11308 = C19806.m45029("ܺ֫") ^ i13;
                    i11 = ((iM11308 ^ i14) * (-32743)) ^ (-1016331346);
                    i12 = -735289376;
                    i16 = iM11308 ^ i12;
                    i15 = i11;
                    break;
                case -1245897071:
                case 1825158894:
                    runnableC10488 = runnableC10488;
                    sArr8 = f25333;
                    i17 = 17;
                    i18 = 4;
                    if (C2332.m7079() <= 0) {
                        iM45029 = C19806.m45029("ۧܿ") ^ i13;
                        i9 = ((iM45029 ^ i14) * (-24663)) ^ (-1958694881);
                        i10 = 774001880;
                    } else {
                        iM45029 = C19806.m45029("ۤ֡") ^ i14;
                        i9 = ((iM45029 ^ i13) * 29981) ^ (-474153006);
                        i10 = -1885586837;
                    }
                    RunnableC10487 runnableC104813 = runnableC10488;
                    i16 = iM45029 ^ i10;
                    i15 = i9;
                    runnableC10488 = runnableC104813;
                    break;
                case -1176132345:
                case -1120590795:
                    CallableC1627.m5503(RunnableC3388.m10056(f25333, 46, 6, i22));
                    break;
                case -1128550515:
                case 791637341:
                    runnableC10487.run();
                    C7321 c7322 = C7321.f24318;
                    break;
                case -1024607231:
                case -438442660:
                    runnableC10488 = runnableC10488;
                    short[] sArr14 = sArr7;
                    int i51 = i33;
                    i = i35;
                    runnableC10487 = runnableC10487;
                    if (AbstractC0464.m2315(str2, C1668.m5577(sArr14, i51, i, i22))) {
                        int iM113015 = (ThreadFactoryC3888.m11306("ۧܽ") ^ i13) * (-33);
                        i15 = ((iM113015 ^ i14) * 26381) ^ (-1630370777);
                        i35 = i;
                        i33 = i51;
                        runnableC10488 = runnableC10488;
                        i16 = iM113015 ^ (-1637704017);
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr14;
                    } else {
                        sArr7 = sArr14;
                        str = str2;
                        i27 = i27;
                        i3 = i28;
                        short[] sArr15 = sArr6;
                        i33 = i51;
                        i30 = i30;
                        sArr5 = sArr5;
                        i32 = i32;
                        sArr6 = sArr15;
                        int i52 = i31;
                        i17 = i17;
                        i29 = i29;
                        i2 = i52;
                        int iM450216 = C19806.m45029("ۨ᩸") ^ i13;
                        String str7 = str;
                        i15 = ((iM450216 ^ i14) * 1355) ^ 982602192;
                        i8 = iM450216 ^ (-1447269748);
                        i28 = i3;
                        i35 = i;
                        str2 = str7;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i317 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i317;
                    }
                    break;
                case -1004930165:
                case 724059337:
                    runnableC10488 = runnableC10488;
                    i17 = i17;
                    i33 = i33;
                    i = i35;
                    sArr7 = sArr7;
                    runnableC10487 = runnableC10487;
                    short[] sArr16 = f25333;
                    i32 = 4;
                    if (C1460.f5948 >= 0) {
                        sArr6 = sArr16;
                        i29 = i29;
                        i30 = i30;
                        i2 = 9;
                        sArr5 = sArr5;
                        i32 = 4;
                        iM11306 = (C19806.m45029("֡֡") + i13) * 101;
                        i4 = ((iM11306 ^ i14) * 20525) ^ 810640421;
                        i5 = 163341824;
                        int i410 = iM11306 ^ i5;
                        i35 = i;
                        RunnableC10487 runnableC104814 = runnableC10488;
                        i16 = i410;
                        i15 = i4;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC104814;
                        int i411 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i411;
                    } else {
                        int iM450217 = (C19806.m45029("ۢ᩷") ^ i14) * (-63);
                        int i53 = ((iM450217 ^ i13) * 26457) ^ 150520754;
                        i35 = i;
                        runnableC10488 = runnableC10488;
                        i16 = iM450217 ^ 942660870;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr16;
                        i15 = i53;
                        i17 = i17;
                        i31 = 9;
                    }
                    break;
                case -986879668:
                case 714952508:
                    i2 = i31;
                    i22 = 25422;
                    iM11307 = C19806.m45029("۠ۨ") ^ i13;
                    i15 = ((iM11307 ^ i14) * (-10209)) ^ 164259143;
                    i6 = -388201270;
                    i8 = iM11307 ^ i6;
                    i27 = i27;
                    i35 = i35;
                    runnableC10487 = runnableC10487;
                    sArr7 = sArr7;
                    i33 = i33;
                    sArr6 = sArr6;
                    i32 = i32;
                    sArr5 = sArr5;
                    i30 = i30;
                    runnableC10488 = runnableC10488;
                    i16 = i8;
                    c7664 = this;
                    int i318 = i2;
                    i29 = i29;
                    i17 = i17;
                    i31 = i318;
                    break;
                case -951883115:
                case 1754304637:
                    break;
                case -945831380:
                case 1028479268:
                    C0050.m946();
                    C3286.m9798();
                    break;
                case -902895538:
                case 267019488:
                    CallableC1627.m5503(C19806.m45020(sArr9, i19, i20, i22));
                    runnableC10488 = c7664.f25340;
                    if (runnableC10488 != null) {
                        iM11308 = ThreadFactoryC3888.m11306("᩺ᩴ") ^ i14;
                        i11 = ((iM11308 ^ i13) * (-14395)) ^ (-994093997);
                        i12 = 760948408;
                    } else {
                        iM11308 = C19806.m45029("ܺ֫") ^ i13;
                        i11 = ((iM11308 ^ i14) * (-32743)) ^ (-1016331346);
                        i12 = -735289376;
                    }
                    i16 = iM11308 ^ i12;
                    i15 = i11;
                    break;
                case -890500638:
                case 474088159:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("ܰۘ") ^ i13;
                        i11 = ((iM11308 ^ i14) * 4671) ^ 349120446;
                        i12 = -355324697;
                        i16 = iM11308 ^ i12;
                        i15 = i11;
                    } else {
                        runnableC10488 = runnableC10488;
                        i33 = i33;
                        sArr7 = sArr7;
                        runnableC10487 = runnableC10487;
                        int i412 = i31;
                        i17 = i17;
                        i29 = i29;
                        i2 = i412;
                        int iM113016 = (ThreadFactoryC3888.m11306("ܰܽ") ^ i14) * (-49);
                        i15 = ((iM113016 ^ i13) * 30025) ^ 1341696833;
                        i8 = iM113016 ^ 555058335;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i319 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i319;
                    }
                    break;
                case -744653916:
                case -105047669:
                    RunnableC3388.m10064();
                    if (!C2704.f10408) {
                        runnableC10488 = runnableC10488;
                        iM45029 = C19806.m45029("ۧܿ") ^ i13;
                        i9 = ((iM45029 ^ i14) * (-24663)) ^ (-1958694881);
                        i10 = 774001880;
                        RunnableC10487 runnableC104815 = runnableC10488;
                        i16 = iM45029 ^ i10;
                        i15 = i9;
                        runnableC10488 = runnableC104815;
                    } else {
                        runnableC10488 = runnableC10488;
                        i33 = i33;
                        sArr7 = sArr7;
                        runnableC10487 = runnableC10487;
                        int i413 = i31;
                        i17 = i17;
                        i29 = i29;
                        i2 = i413;
                        int iM113017 = (ThreadFactoryC3888.m11306("ܰܽ") ^ i14) * (-49);
                        i15 = ((iM113017 ^ i13) * 30025) ^ 1341696833;
                        i8 = iM113017 ^ 555058335;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i3110 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i3110;
                    }
                    break;
                case -708871450:
                case -2676230:
                    i2 = i31;
                    i22 = 33499;
                    iM11307 = C19806.m45029("۠ۨ") ^ i13;
                    i15 = ((iM11307 ^ i14) * (-10209)) ^ 164259143;
                    i6 = -388201270;
                    i8 = iM11307 ^ i6;
                    i27 = i27;
                    i35 = i35;
                    runnableC10487 = runnableC10487;
                    sArr7 = sArr7;
                    i33 = i33;
                    sArr6 = sArr6;
                    i32 = i32;
                    sArr5 = sArr5;
                    i30 = i30;
                    runnableC10488 = runnableC10488;
                    i16 = i8;
                    c7664 = this;
                    int i3111 = i2;
                    i29 = i29;
                    i17 = i17;
                    i31 = i3111;
                    break;
                case -700129498:
                case 1610298275:
                    CallableC1627.m5503(C0962.m3747(f25333, 33, 4, i22));
                    break;
                case -694264179:
                case -459534134:
                    C2332.m7079();
                    runnableC10488 = runnableC10488;
                    iM45029 = C19806.m45029("ۧܿ") ^ i13;
                    i9 = ((iM45029 ^ i14) * (-24663)) ^ (-1958694881);
                    i10 = 774001880;
                    RunnableC10487 runnableC104816 = runnableC10488;
                    i16 = iM45029 ^ i10;
                    i15 = i9;
                    runnableC10488 = runnableC104816;
                    break;
                case -523391647:
                case 1033602415:
                    CallableC1627.m5503(C3722.m10901(f25333, 41, 5, i22));
                    break;
                case -504534236:
                case 2039070017:
                    runnableC10488 = runnableC10488;
                    i30 = i30;
                    i35 = i35;
                    sArr5 = sArr5;
                    i32 = i32;
                    sArr6 = sArr6;
                    i33 = i33;
                    sArr7 = sArr7;
                    runnableC10487 = runnableC10487;
                    i27 = i27;
                    int i54 = i31;
                    i17 = i17;
                    i29 = i29;
                    i2 = i54;
                    i24 = s * s2;
                    i25 = s * s;
                    i26 = 169728784;
                    if (RunnableC3388.f12514 < 0) {
                        iM11307 = C19806.m45029("᩸۟") ^ i13;
                        i15 = ((iM11307 ^ i14) * 21231) ^ 562251735;
                        i6 = 1294309380;
                        i8 = iM11307 ^ i6;
                        i27 = i27;
                        i35 = i35;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i3112 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i3112;
                    } else {
                        i35 = i35;
                        int iM113018 = (ThreadFactoryC3888.m11306("ܰܽ") ^ i14) * (-49);
                        i15 = ((iM113018 ^ i13) * 30025) ^ 1341696833;
                        i8 = iM113018 ^ 555058335;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i3113 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i3113;
                    }
                    break;
                case -211246212:
                case -109487929:
                    C2477.m7593();
                    if (C2642.f10294 > 0) {
                        runnableC10488 = runnableC10488;
                        sArr2 = sArr5;
                        i7 = i29;
                        i2 = i31;
                        i32 = i32;
                        i35 = i35;
                        i17 = i17;
                        sArr6 = sArr6;
                        i33 = i33;
                        sArr7 = sArr7;
                        runnableC10487 = runnableC10487;
                        i27 = i27;
                        int iM113019 = ThreadFactoryC3888.m11306("۬ܿ") ^ i13;
                        i27 = i27;
                        i35 = i35;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr2;
                        i15 = ((iM113019 ^ i14) * (-1393)) ^ 1987297745;
                        i17 = i17;
                        i31 = i2;
                        i29 = i7;
                        runnableC10488 = runnableC10488;
                        i16 = iM113019 ^ (-645724939);
                        c7664 = this;
                    } else {
                        runnableC10488 = runnableC10488;
                        iM45029 = C19806.m45029("ۧܿ") ^ i13;
                        i9 = ((iM45029 ^ i14) * (-24663)) ^ (-1958694881);
                        i10 = 774001880;
                        RunnableC10487 runnableC104817 = runnableC10488;
                        i16 = iM45029 ^ i10;
                        i15 = i9;
                        runnableC10488 = runnableC104817;
                    }
                    break;
                case -72120314:
                case 373276944:
                    runnableC10488 = runnableC10488;
                    i3 = i28;
                    i30 = i30;
                    i = i35;
                    sArr5 = sArr5;
                    i32 = i32;
                    sArr6 = sArr6;
                    i33 = i33;
                    sArr7 = sArr7;
                    runnableC10487 = runnableC10487;
                    i27 = i27;
                    int i55 = i31;
                    i17 = i17;
                    i29 = i29;
                    i2 = i55;
                    str = c7664.f25338;
                    if (str == null) {
                        int iM450218 = C19806.m45029("ۨ᩸") ^ i13;
                        String str8 = str;
                        i15 = ((iM450218 ^ i14) * 1355) ^ 982602192;
                        i8 = iM450218 ^ (-1447269748);
                        i28 = i3;
                        i35 = i;
                        str2 = str8;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i3114 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i3114;
                    } else {
                        int iM450219 = C19806.m45029("᩺۬") ^ i14;
                        i28 = i3;
                        i35 = i;
                        str2 = str;
                        i15 = ((iM450219 ^ i13) * 523) ^ 365464352;
                        c7664 = this;
                        sArr = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = iM450219 ^ (-1236568190);
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr;
                        int i414 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i414;
                    }
                    break;
                case 122201554:
                case 2138546150:
                    runnableC10488 = runnableC10488;
                    if (!C1460.m5058(str2, C3743.m10964(f25333, 21, 4, i22))) {
                        str = str2;
                        i3 = i28;
                        i30 = i30;
                        i = i35;
                        sArr5 = sArr5;
                        i32 = i32;
                        sArr6 = sArr6;
                        i33 = i33;
                        sArr7 = sArr7;
                        runnableC10487 = runnableC10487;
                        i27 = i27;
                        int i415 = i31;
                        i17 = i17;
                        i29 = i29;
                        i2 = i415;
                        int iM4502110 = C19806.m45029("ۨ᩸") ^ i13;
                        String str9 = str;
                        i15 = ((iM4502110 ^ i14) * 1355) ^ 982602192;
                        i8 = iM4502110 ^ (-1447269748);
                        i28 = i3;
                        i35 = i;
                        str2 = str9;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i3115 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i3115;
                    } else {
                        iM45029 = (C19806.m45029("ۛۛ") ^ i14) * 53;
                        i9 = ((iM45029 ^ i13) * (-22431)) ^ (-756685875);
                        i10 = -173786874;
                        RunnableC10487 runnableC104818 = runnableC10488;
                        i16 = iM45029 ^ i10;
                        i15 = i9;
                        runnableC10488 = runnableC104818;
                    }
                    break;
                case 232651796:
                case 568749427:
                    runnableC10488 = runnableC10488;
                    i30 = i30;
                    i = i35;
                    sArr5 = sArr5;
                    i32 = i32;
                    sArr6 = sArr6;
                    i33 = i33;
                    sArr7 = sArr7;
                    runnableC10487 = runnableC10487;
                    int i56 = i31;
                    i17 = i17;
                    i29 = i29;
                    i2 = i56;
                    switch (C19806.m45029(str2)) {
                        case 1596796:
                            iM11306 = (i13 - ThreadFactoryC3888.m11306("ܶۚ")) * (-27);
                            i4 = ((iM11306 ^ i14) * 15809) ^ 1724069429;
                            i5 = 677274815;
                            int i416 = iM11306 ^ i5;
                            i35 = i;
                            RunnableC10487 runnableC104819 = runnableC10488;
                            i16 = i416;
                            i15 = i4;
                            runnableC10487 = runnableC10487;
                            sArr7 = sArr7;
                            i33 = i33;
                            sArr6 = sArr6;
                            i32 = i32;
                            sArr5 = sArr5;
                            i30 = i30;
                            runnableC10488 = runnableC104819;
                            int i417 = i2;
                            i29 = i29;
                            i17 = i17;
                            i31 = i417;
                            break;
                        case 1626587:
                            iM11306 = C19806.m45029("ۚۨ") ^ i13;
                            i4 = ((iM11306 ^ i14) * (-13509)) ^ 1972928529;
                            i5 = 944197443;
                            int i418 = iM11306 ^ i5;
                            i35 = i;
                            RunnableC10487 runnableC1048110 = runnableC10488;
                            i16 = i418;
                            i15 = i4;
                            runnableC10487 = runnableC10487;
                            sArr7 = sArr7;
                            i33 = i33;
                            sArr6 = sArr6;
                            i32 = i32;
                            sArr5 = sArr5;
                            i30 = i30;
                            runnableC10488 = runnableC1048110;
                            int i419 = i2;
                            i29 = i29;
                            i17 = i17;
                            i31 = i419;
                            break;
                        case 1656379:
                            iM11306 = (i13 - ThreadFactoryC3888.m11306("۫ۜ")) * (-103);
                            i4 = ((iM11306 ^ i14) * (-29725)) ^ 560724599;
                            i5 = 470081989;
                            int i4110 = iM11306 ^ i5;
                            i35 = i;
                            RunnableC10487 runnableC1048111 = runnableC10488;
                            i16 = i4110;
                            i15 = i4;
                            runnableC10487 = runnableC10487;
                            sArr7 = sArr7;
                            i33 = i33;
                            sArr6 = sArr6;
                            i32 = i32;
                            sArr5 = sArr5;
                            i30 = i30;
                            runnableC10488 = runnableC1048111;
                            int i4111 = i2;
                            i29 = i29;
                            i17 = i17;
                            i31 = i4111;
                            break;
                        case 1656380:
                            iM11306 = (C19806.m45029("֫ۗ") ^ i13) * (-21);
                            i4 = ((iM11306 ^ i14) * (-32087)) ^ (-1678205076);
                            i5 = 185936630;
                            int i4112 = iM11306 ^ i5;
                            i35 = i;
                            RunnableC10487 runnableC1048112 = runnableC10488;
                            i16 = i4112;
                            i15 = i4;
                            runnableC10487 = runnableC10487;
                            sArr7 = sArr7;
                            i33 = i33;
                            sArr6 = sArr6;
                            i32 = i32;
                            sArr5 = sArr5;
                            i30 = i30;
                            runnableC10488 = runnableC1048112;
                            int i4113 = i2;
                            i29 = i29;
                            i17 = i17;
                            i31 = i4113;
                            break;
                        case 1656382:
                            iM11306 = (C19806.m45029("۬۠") + i13) * (-9);
                            i4 = ((iM11306 ^ i14) * (-8905)) ^ (-962429911);
                            i5 = 780042222;
                            int i4114 = iM11306 ^ i5;
                            i35 = i;
                            RunnableC10487 runnableC1048113 = runnableC10488;
                            i16 = i4114;
                            i15 = i4;
                            runnableC10487 = runnableC10487;
                            sArr7 = sArr7;
                            i33 = i33;
                            sArr6 = sArr6;
                            i32 = i32;
                            sArr5 = sArr5;
                            i30 = i30;
                            runnableC10488 = runnableC1048113;
                            int i4115 = i2;
                            i29 = i29;
                            i17 = i17;
                            i31 = i4115;
                            break;
                        case 1715960:
                            iM11306 = C19806.m45029("᩺ܿ") ^ i14;
                            i4 = ((iM11306 ^ i13) * (-12917)) ^ (-17540149);
                            i5 = 1028820684;
                            int i4116 = iM11306 ^ i5;
                            i35 = i;
                            RunnableC10487 runnableC1048114 = runnableC10488;
                            i16 = i4116;
                            i15 = i4;
                            runnableC10487 = runnableC10487;
                            sArr7 = sArr7;
                            i33 = i33;
                            sArr6 = sArr6;
                            i32 = i32;
                            sArr5 = sArr5;
                            i30 = i30;
                            runnableC10488 = runnableC1048114;
                            int i4117 = i2;
                            i29 = i29;
                            i17 = i17;
                            i31 = i4117;
                            break;
                        case 1745751:
                            iM11306 = C19806.m45029("ܿۡ") ^ i13;
                            i4 = ((iM11306 ^ i14) * (-17513)) ^ 1856114999;
                            i5 = 1707047547;
                            int i4118 = iM11306 ^ i5;
                            i35 = i;
                            RunnableC10487 runnableC1048115 = runnableC10488;
                            i16 = i4118;
                            i15 = i4;
                            runnableC10487 = runnableC10487;
                            sArr7 = sArr7;
                            i33 = i33;
                            sArr6 = sArr6;
                            i32 = i32;
                            sArr5 = sArr5;
                            i30 = i30;
                            runnableC10488 = runnableC1048115;
                            int i4119 = i2;
                            i29 = i29;
                            i17 = i17;
                            i31 = i4119;
                            break;
                        default:
                            str = str2;
                            i27 = i27;
                            i3 = i28;
                            int iM4502111 = C19806.m45029("ۨ᩸") ^ i13;
                            String str10 = str;
                            i15 = ((iM4502111 ^ i14) * 1355) ^ 982602192;
                            i8 = iM4502111 ^ (-1447269748);
                            i28 = i3;
                            i35 = i;
                            str2 = str10;
                            i27 = i27;
                            runnableC10487 = runnableC10487;
                            sArr7 = sArr7;
                            i33 = i33;
                            sArr6 = sArr6;
                            i32 = i32;
                            sArr5 = sArr5;
                            i30 = i30;
                            runnableC10488 = runnableC10488;
                            i16 = i8;
                            c7664 = this;
                            int i3116 = i2;
                            i29 = i29;
                            i17 = i17;
                            i31 = i3116;
                            break;
                    }
                    break;
                case 317319899:
                case 1008215975:
                    CallableC1627.m5503(C3660.m10790(sArr4, i27, i28, i22));
                    break;
                case 563052001:
                case 844688766:
                    runnableC10488 = runnableC10488;
                    runnableC10487 = runnableC10487;
                    short[] sArr17 = f25333;
                    i33 = 13;
                    i35 = 4;
                    if (RunnableC1895.f7152) {
                        int iM450220 = (i14 - C19806.m45029("ۗ۬")) * 59;
                        sArr7 = sArr17;
                        i15 = ((iM450220 ^ i13) * (-603)) ^ (-1806113365);
                        runnableC10487 = runnableC10487;
                        i16 = iM450220 ^ 288544422;
                        runnableC10488 = runnableC10488;
                    } else {
                        sArr7 = sArr17;
                        i33 = 13;
                        int i4120 = i31;
                        i17 = i17;
                        i29 = i29;
                        i2 = i4120;
                        int iM1130110 = (ThreadFactoryC3888.m11306("ܰܽ") ^ i14) * (-49);
                        i15 = ((iM1130110 ^ i13) * 30025) ^ 1341696833;
                        i8 = iM1130110 ^ 555058335;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i3117 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i3117;
                    }
                    break;
                case 689771344:
                case 1581872039:
                    runnableC10488 = runnableC10488;
                    i30 = i30;
                    i35 = i35;
                    sArr5 = sArr5;
                    i32 = i32;
                    sArr6 = sArr6;
                    i33 = i33;
                    sArr7 = sArr7;
                    runnableC10487 = runnableC10487;
                    i27 = i27;
                    int i57 = i31;
                    i17 = i17;
                    i29 = i29;
                    i2 = i57;
                    if ((i25 + i26) - i24 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("֡ۧ") ^ i14;
                        i15 = ((iM11307 ^ i13) * 28601) ^ 1396208617;
                        i6 = 1384381801;
                    } else {
                        iM11307 = C19806.m45029("ۚᩴ") ^ i14;
                        i15 = ((iM11307 ^ i13) * (-27595)) ^ 682103133;
                        i6 = 1752819299;
                    }
                    i8 = iM11307 ^ i6;
                    i27 = i27;
                    i35 = i35;
                    runnableC10487 = runnableC10487;
                    sArr7 = sArr7;
                    i33 = i33;
                    sArr6 = sArr6;
                    i32 = i32;
                    sArr5 = sArr5;
                    i30 = i30;
                    runnableC10488 = runnableC10488;
                    i16 = i8;
                    c7664 = this;
                    int i3118 = i2;
                    i29 = i29;
                    i17 = i17;
                    i31 = i3118;
                    break;
                case 887026381:
                case 1969313050:
                    C3535.m10431();
                    if (C2124.f7782 <= 0) {
                        iM11308 = (i13 - C19806.m45029("᩻᩵")) * 37;
                        i11 = ((iM11308 ^ i14) * (-5257)) ^ (-1464519349);
                        i12 = 1457355288;
                    } else {
                        iM11308 = C19806.m45029("۠᩹") ^ i14;
                        i11 = ((iM11308 ^ i13) * (-4859)) ^ (-294570460);
                        i12 = -1621693224;
                    }
                    i16 = iM11308 ^ i12;
                    i15 = i11;
                    break;
                case 1518796793:
                case 1993362749:
                    runnableC10488 = runnableC10488;
                    if (!AbstractC0464.m2315(str2, C1377.m4832(f25333, 29, 4, i22))) {
                        str = str2;
                        i3 = i28;
                        i30 = i30;
                        i = i35;
                        sArr5 = sArr5;
                        i32 = i32;
                        sArr6 = sArr6;
                        i33 = i33;
                        sArr7 = sArr7;
                        runnableC10487 = runnableC10487;
                        i27 = i27;
                        int i4121 = i31;
                        i17 = i17;
                        i29 = i29;
                        i2 = i4121;
                        int iM4502112 = C19806.m45029("ۨ᩸") ^ i13;
                        String str11 = str;
                        i15 = ((iM4502112 ^ i14) * 1355) ^ 982602192;
                        i8 = iM4502112 ^ (-1447269748);
                        i28 = i3;
                        i35 = i;
                        str2 = str11;
                        i27 = i27;
                        runnableC10487 = runnableC10487;
                        sArr7 = sArr7;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i30 = i30;
                        runnableC10488 = runnableC10488;
                        i16 = i8;
                        c7664 = this;
                        int i3119 = i2;
                        i29 = i29;
                        i17 = i17;
                        i31 = i3119;
                    } else {
                        iM45029 = (i13 - C19806.m45029("ۤܳ")) * 81;
                        i9 = ((iM45029 ^ i14) * 7313) ^ (-633340857);
                        i10 = -1327754288;
                        RunnableC10487 runnableC1048116 = runnableC10488;
                        i16 = iM45029 ^ i10;
                        i15 = i9;
                        runnableC10488 = runnableC1048116;
                    }
                    break;
                default:
                    runnableC10488 = runnableC10488;
                    i30 = i30;
                    i = i35;
                    sArr5 = sArr5;
                    i32 = i32;
                    sArr6 = sArr6;
                    i33 = i33;
                    sArr7 = sArr7;
                    runnableC10487 = runnableC10487;
                    int i58 = i31;
                    i17 = i17;
                    i29 = i29;
                    i2 = i58;
                    sArr4 = f25333;
                    i27 = 1;
                    i28 = 4;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (C19806.m45029("֡֡") + i13) * 101;
                        i4 = ((iM11306 ^ i14) * 20525) ^ 810640421;
                        i5 = 163341824;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۗ") ^ i14) * 27;
                        i4 = ((iM11306 ^ i13) * 31745) ^ 485086799;
                        i5 = -1016295344;
                    }
                    int i41110 = iM11306 ^ i5;
                    i35 = i;
                    RunnableC10487 runnableC1048117 = runnableC10488;
                    i16 = i41110;
                    i15 = i4;
                    runnableC10487 = runnableC10487;
                    sArr7 = sArr7;
                    i33 = i33;
                    sArr6 = sArr6;
                    i32 = i32;
                    sArr5 = sArr5;
                    i30 = i30;
                    runnableC10488 = runnableC1048117;
                    int i41111 = i2;
                    i29 = i29;
                    i17 = i17;
                    i31 = i41111;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C1025.m3860(this);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ee A[PHI: r8 r9
      0x00ee: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v3 java.lang.String), (r8v2 java.lang.String) binds: [B:27:0x00bb, B:34:0x00ec, B:95:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r9v5 java.util.Map) = (r9v4 java.util.Map), (r9v2 java.util.Map), (r9v2 java.util.Map) binds: [B:27:0x00bb, B:34:0x00ec, B:95:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0192 A[PHI: r10 r15
      0x0192: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:49:0x0190, B:24:0x00ad, B:20:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0192: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:49:0x0190, B:24:0x00ad, B:20:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x024b A[PHI: r2 r3 r6
      0x024b: PHI (r2v20 java.lang.String) = 
      (r2v19 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v21 java.lang.String)
     binds: [B:62:0x0234, B:46:0x0172, B:42:0x0147, B:18:0x0075, B:58:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r3v2 long) = (r3v1 long), (r3v1 long), (r3v1 long), (r3v1 long), (r3v9 long) binds: [B:62:0x0234, B:46:0x0172, B:42:0x0147, B:18:0x0075, B:58:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r6v4 org.json.JSONObject) = 
      (r6v2 org.json.JSONObject)
      (r6v3 org.json.JSONObject)
      (r6v2 org.json.JSONObject)
      (r6v2 org.json.JSONObject)
      (r6v2 org.json.JSONObject)
     binds: [B:62:0x0234, B:46:0x0172, B:42:0x0147, B:18:0x0075, B:58:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        int iM11306;
        int i;
        int i2;
        int iM45029;
        int i3;
        int i4;
        int i5 = RunnableC1606.f6488;
        int i6 = ThreadFactoryC3888.f14547;
        int iM450210 = C19806.m45029("ܿ᩷") ^ i5;
        int i7 = ((iM450210 ^ i6) * 25373) ^ (-1124205280);
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM450210 ^ (-637548484);
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1542964087;
        char c = 0;
        Map mapPayV2 = null;
        String strM5479 = null;
        String strM8640 = null;
        JSONObject jSONObjectM6501 = null;
        C2724 c2724M8469 = null;
        long j = 0;
        String str = null;
        while (true) {
            i12 = i8 ^ (i7 & (((i12 ^ i6) * 27559) >> 31));
            switch (i12) {
                case -2056114684:
                case -1613584055:
                    str = str;
                    if ((213656689 + i10) - (s * 29234) >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܰ") ^ i5;
                        i = ((iM11306 ^ i6) * (-14249)) ^ (-424175264);
                        i2 = 1240181128;
                    } else {
                        iM11306 = C19806.m45029("᩻ۡ") ^ i6;
                        i = ((iM11306 ^ i5) * 21849) ^ 1666238031;
                        i2 = -1252034702;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    str = str;
                    break;
                case -2040263128:
                case 1243374675:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (!RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("ۛ۟") ^ i6;
                        i3 = ((iM45029 ^ i5) * 30435) ^ 931036129;
                        i4 = -1551322725;
                        i8 = iM45029 ^ i4;
                        i7 = i3;
                    } else {
                        str = str;
                        iM11306 = C19806.m45029("᩶ۡ") ^ i5;
                        i = ((iM11306 ^ i6) * 27801) ^ (-1039534347);
                        i2 = -1529327687;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        str = str;
                    }
                    break;
                case -1530195492:
                case -442565711:
                    long j2 = C20364.f65937;
                    str = str;
                    long j3 = this.f25334;
                    if (j3 == j2) {
                        int iM450211 = (i5 - C19806.m45029("ۛ᩸")) * 59;
                        i8 = iM450211 ^ (-1638255363);
                        i7 = ((iM450211 ^ i6) * 15883) ^ (-1445305266);
                        j = j3;
                        str = str;
                    } else {
                        j = j3;
                        str = str;
                        iM45029 = (C19806.m45029("ܿ᩶") + i6) * 5;
                        i3 = ((iM45029 ^ i5) * (-26615)) ^ 1607864212;
                        i4 = 1705791208;
                        i8 = iM45029 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -1505978099:
                case -753653318:
                    i11 = 58235;
                    iM11306 = C19806.m45029("۬᩺") ^ i5;
                    i = ((iM11306 ^ i6) * 9889) ^ 1796814665;
                    i2 = 1431330171;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    str = str;
                    break;
                case -1165526355:
                case 1307586806:
                    String strM3006 = C0671.m3006();
                    str = this.f25335;
                    if (C13465.m32965((Object) str, (Object) strM3006)) {
                        iM45029 = C19806.m45029("ۚۢ") ^ i6;
                        i3 = ((iM45029 ^ i5) * 26771) ^ (-1192750191);
                        i4 = -1275221251;
                    } else {
                        iM45029 = (C19806.m45029("ܿ᩶") + i6) * 5;
                        i3 = ((iM45029 ^ i5) * (-26615)) ^ 1607864212;
                        i4 = 1705791208;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -1137033900:
                case 214643103:
                    if (!C7105.m18985()) {
                        iM45029 = ThreadFactoryC3888.m11306("۠᩵") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-29703)) ^ (-961908870);
                        i4 = 478085570;
                        i8 = iM45029 ^ i4;
                        i7 = i3;
                    } else {
                        str = str;
                        iM11306 = ThreadFactoryC3888.m11306("ܺۨ") ^ i5;
                        i = ((iM11306 ^ i6) * (-21055)) ^ (-1888978616);
                        i2 = -290475921;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        str = str;
                    }
                    break;
                case -1102768641:
                case 280457086:
                    c2724M8469.m8315(0);
                    if (C3743.f13569) {
                        iM45029 = (C19806.m45029("ܽۢ") ^ i6) * 93;
                        i3 = ((iM45029 ^ i5) * (-17993)) ^ 2047704146;
                        i4 = 328927361;
                    } else {
                        iM45029 = (C19806.m45029("᩸᩻") + i6) * (-59);
                        i3 = ((iM45029 ^ i5) * (-1149)) ^ 519549818;
                        i4 = -1435384265;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -968813494:
                case 999467939:
                    strM5479 = RunnableC1606.m5479(jSONObjectM6501, strM8640);
                    if (RunnableC1895.m6170() == 0) {
                        RunnableC10487 runnableC10487 = new RunnableC10487(jSONObjectM6501, str, j);
                        this.f25340 = runnableC10487;
                        C20364.f65940 = runnableC10487;
                        if (C1977.f7413 <= 0) {
                            iM45029 = C19806.m45029("ۛ۟") ^ i6;
                            i3 = ((iM45029 ^ i5) * 30435) ^ 931036129;
                            i4 = -1551322725;
                        } else {
                            iM45029 = C19806.m45029("᩸ۛ") ^ i5;
                            i3 = ((iM45029 ^ i6) * (-8915)) ^ 2080486255;
                            i4 = 218880645;
                        }
                        i8 = iM45029 ^ i4;
                        i7 = i3;
                    } else {
                        str = str;
                        iM11306 = C19806.m45029("᩶ۡ") ^ i5;
                        i = ((iM11306 ^ i6) * 27801) ^ (-1039534347);
                        i2 = -1529327687;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        str = str;
                    }
                    break;
                case -900016273:
                case 761391788:
                    break;
                case -679738848:
                case 1259119178:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    break;
                case -656581756:
                case 1483546005:
                    c2724M8469 = C2788.m8469(4370);
                    c2724M8469.m8323(this.f25337);
                    if (C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("۠᩵") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-29703)) ^ (-961908870);
                        i4 = 478085570;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܽ") ^ i5;
                        i3 = ((iM45029 ^ i6) * (-30125)) ^ 1234059586;
                        i4 = -10461269;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -533685013:
                case 251460081:
                    str = str;
                    s = sArr[c];
                    i10 = s * s;
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("᩶ۡ") ^ i5;
                        i = ((iM11306 ^ i6) * 27801) ^ (-1039534347);
                        i2 = -1529327687;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i6;
                        i = ((iM11306 ^ i5) * (-32731)) ^ (-1704561775);
                        i2 = -911092931;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    str = str;
                    break;
                case -488687810:
                case 214997954:
                    AbstractActivityC12483 abstractActivityC12483 = this.f25339;
                    if (C0797.f3386) {
                        iM45029 = (C19806.m45029("᩸᩻") + i6) * (-59);
                        i3 = ((iM45029 ^ i5) * (-1149)) ^ 519549818;
                        i4 = -1435384265;
                    } else {
                        mapPayV2 = new PayTask(abstractActivityC12483).payV2(strM5479, true);
                        if (ThreadFactoryC3888.f14547 <= 0) {
                            iM45029 = C19806.m45029("ۛ۟") ^ i6;
                            i3 = ((iM45029 ^ i5) * 30435) ^ 931036129;
                            i4 = -1551322725;
                        } else {
                            iM45029 = (i6 - C19806.m45029("ۘۢ")) * (-33);
                            i3 = ((iM45029 ^ i5) * 12797) ^ (-1145209305);
                            i4 = -840725450;
                        }
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -482359632:
                case -175015179:
                    i11 = 6688;
                    iM11306 = C19806.m45029("۬᩺") ^ i5;
                    i = ((iM11306 ^ i6) * 9889) ^ 1796814665;
                    i2 = 1431330171;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    str = str;
                    break;
                case -420294493:
                case 24674393:
                    if (!C0797.m3359()) {
                        str = str;
                        iM11306 = C19806.m45029("᩶ۡ") ^ i5;
                        i = ((iM11306 ^ i6) * 27801) ^ (-1039534347);
                        i2 = -1529327687;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        str = str;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠᩵") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-29703)) ^ (-961908870);
                        i4 = 478085570;
                        i8 = iM45029 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -358951705:
                case 1344276138:
                    if (j != C20364.f65937) {
                        iM45029 = (C19806.m45029("ܿ᩶") + i6) * 5;
                        i3 = ((iM45029 ^ i5) * (-26615)) ^ 1607864212;
                        i4 = 1705791208;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۚ") ^ i5;
                        i3 = ((iM45029 ^ i6) * (-32621)) ^ 400622839;
                        i4 = -27530896;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case -148324512:
                case -122861659:
                    this.f25338 = (String) mapPayV2.get(C10634.m26821(sArr2, i9, 12, i11));
                    iM45029 = (C19806.m45029("ܿ᩶") + i6) * 5;
                    i3 = ((iM45029 ^ i5) * (-26615)) ^ 1607864212;
                    i4 = 1705791208;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case 65561969:
                case 279248368:
                    sArr2 = f25333;
                    i9 = 70;
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (C19806.m45029("᩸᩻") + i6) * (-59);
                        i3 = ((iM45029 ^ i5) * (-1149)) ^ 519549818;
                        i4 = -1435384265;
                    } else {
                        iM45029 = (C19806.m45029("ܿᩳ") ^ i5) * (-77);
                        i3 = ((iM45029 ^ i6) * (-29579)) ^ (-1897635611);
                        i4 = 728729284;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                case 294445968:
                case 1683613067:
                    strM8640 = C2871.m8640(f25333, 63, 7, i11);
                    if (C1937.f7317 < 0) {
                        iM45029 = (C19806.m45029("ܿܽ") + i6) * 73;
                        i3 = ((iM45029 ^ i5) * (-11189)) ^ 861962535;
                        i4 = 1692757304;
                        i8 = iM45029 ^ i4;
                        i7 = i3;
                    } else {
                        str = str;
                        iM11306 = C19806.m45029("᩶ۡ") ^ i5;
                        i = ((iM11306 ^ i6) * 27801) ^ (-1039534347);
                        i2 = -1529327687;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        str = str;
                    }
                    break;
                case 908649980:
                case 1820513768:
                    str = str;
                    sArr = f25333;
                    c = '>';
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۨ") ^ i5;
                        i = ((iM11306 ^ i6) * (-21055)) ^ (-1888978616);
                        i2 = -290475921;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ᩶") ^ i5;
                        i = ((iM11306 ^ i6) * 29657) ^ 1201843892;
                        i2 = -517447253;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    str = str;
                    break;
                case 1904588828:
                case 1947352093:
                    C0962.m3749(c2724M8469, this.f25336);
                    jSONObjectM6501 = C2018.m6501(c2724M8469);
                    if (C13465.m32965((Object) str, (Object) C1875.m6109())) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۨ") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-12113)) ^ (-1548439690);
                        i4 = 105076551;
                    } else {
                        iM45029 = (C19806.m45029("ܿ᩶") + i6) * 5;
                        i3 = ((iM45029 ^ i5) * (-26615)) ^ 1607864212;
                        i4 = 1705791208;
                    }
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    break;
                default:
                    RunnableC1606.m5473();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    str = str;
                    iM11306 = C19806.m45029("᩶ۡ") ^ i5;
                    i = ((iM11306 ^ i6) * 27801) ^ (-1039534347);
                    i2 = -1529327687;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    str = str;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        AbstractActivityC12483 abstractActivityC12483 = null;
        int i = 1741780722;
        int i2 = RunnableC0195.f1321;
        int i3 = C3535.f13026;
        int iM45029 = C19806.m45029("۟ۢ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 32329) ^ (-923078462);
        int i5 = 512462515;
        while (true) {
            i = ((((i ^ i3) * 5809) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2080035893:
                case -953322587:
                    abstractActivityC12483 = this.f25339;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6017)) ^ (-1406478447);
                        i5 = 259449555;
                    } else {
                        iM45029 = C19806.m45029("ܳ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19541) ^ 1073917178;
                        i5 = 1896143425;
                    }
                    break;
                case -1800813032:
                case 950096763:
                    C1025.m3861();
                    if (C0216.m1591() <= 0) {
                        iM45029 = (i2 - C19806.m45029("ۛۖ")) * (-15);
                        i4 = ((iM45029 ^ i3) * 12531) ^ 596534530;
                        i5 = 193981396;
                    } else {
                        iM45029 = (C19806.m45029("᩹᩸") ^ i3) * 89;
                        i4 = ((iM45029 ^ i2) * 837) ^ (-642837733);
                        i5 = 653570943;
                    }
                    break;
                case -1636781240:
                case -534106710:
                    ThreadFactoryC3888.m11300();
                    if (C0050.m946() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23597)) ^ 999027389;
                        i5 = -884407391;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۛۖ")) * (-15);
                        i4 = ((iM45029 ^ i3) * 12531) ^ 596534530;
                        i5 = 193981396;
                    }
                    break;
                case -1628268290:
                case -1191920893:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (C19806.m45029("᩹᩸") ^ i3) * 89;
                        i4 = ((iM45029 ^ i2) * 837) ^ (-642837733);
                        i5 = 653570943;
                    } else {
                        iM45029 = C19806.m45029("۫ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 2341) ^ 908494594;
                        i5 = 3663403;
                    }
                    break;
                case -1398544254:
                case 566730657:
                    C0671.m3019(abstractActivityC12483, exc, null);
                    break;
                case -1290484652:
                case -1155630563:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i2 - C19806.m45029("ۛۖ")) * (-15);
                        i4 = ((iM45029 ^ i3) * 12531) ^ 596534530;
                        i5 = 193981396;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֫ۢ")) * (-7);
                        i4 = ((iM45029 ^ i2) * (-3271)) ^ (-1746444802);
                        i5 = -669523381;
                    }
                    break;
                case -1288524331:
                case 1800367635:
                    if (C2249.f8050 >= 0) {
                        iM45029 = C19806.m45029("ܳ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19541) ^ 1073917178;
                        i5 = 1896143425;
                    } else {
                        iM45029 = C19806.m45029("ܶ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6081) ^ (-418171774);
                        i5 = 1155358583;
                    }
                    break;
                case -1265160080:
                case -1114944532:
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("ܳ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19541) ^ 1073917178;
                        i5 = 1896143425;
                    } else {
                        iM45029 = C19806.m45029("֫᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23357)) ^ (-966456270);
                        i5 = 1542496670;
                    }
                    break;
                case -1117879549:
                case 1815822118:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = (C19806.m45029("᩹᩸") ^ i3) * 89;
                        i4 = ((iM45029 ^ i2) * 837) ^ (-642837733);
                        i5 = 653570943;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20007)) ^ 1975454918;
                        i5 = -995945349;
                    }
                    break;
                case -848075094:
                case 1735784873:
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23597)) ^ 999027389;
                        i5 = -884407391;
                    } else {
                        iM45029 = C19806.m45029("۠ۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12297)) ^ 804858161;
                        i5 = -453076474;
                    }
                    break;
                case -818453653:
                case 1829413036:
                    C3535.m10431();
                    iM45029 = (C19806.m45029("᩹᩸") ^ i3) * 89;
                    i4 = ((iM45029 ^ i2) * 837) ^ (-642837733);
                    i5 = 653570943;
                    break;
                case -131744288:
                case 982809649:
                    if (C2704.f10408) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩸ۧ")) * (-11);
                        i4 = ((iM45029 ^ i2) * (-5403)) ^ 1192434465;
                        i5 = 1703269307;
                    } else {
                        iM45029 = (C19806.m45029("᩹᩸") ^ i3) * 89;
                        i4 = ((iM45029 ^ i2) * 837) ^ (-642837733);
                        i5 = 653570943;
                    }
                    break;
                case 329316484:
                case 786694215:
                    if (C1025.m3861() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23597)) ^ 999027389;
                        i5 = -884407391;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹᩹") + i2) * 29;
                        i4 = ((iM45029 ^ i3) * (-27887)) ^ 746485114;
                        i5 = 1874006957;
                    }
                    break;
                case 341238054:
                case 457021802:
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23597)) ^ 999027389;
                        i5 = -884407391;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4789) ^ 614020396;
                        i5 = -344705069;
                    }
                    break;
                case 1031695163:
                case 1894140031:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    break;
                default:
                    if (C3535.m10431() <= 0) {
                        iM45029 = (i2 - C19806.m45029("ۛۖ")) * (-15);
                        i4 = ((iM45029 ^ i3) * 12531) ^ 596534530;
                        i5 = 193981396;
                    } else {
                        iM45029 = C19806.m45029("ۚۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29401)) ^ 1600833505;
                        i5 = -929406195;
                    }
                    break;
            }
            return;
        }
    }
}
