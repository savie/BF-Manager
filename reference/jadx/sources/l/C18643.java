package l;

import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/* JADX INFO: renamed from: l.ᩴ۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RP */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18643 implements InterfaceC4871 {

    /* JADX INFO: renamed from: ᩷ۘ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f60439 = {4865, -9879, -9877, -9884, -9877, -9864, -9869, -9859, -9870, -9873, -9921, -9921, -9925, -9928, -9927, -9933, -9928, -9879, -9924, -9874, -9934, -9926, -9928, -9921, -9933, -9859, -9870, -9873, -9880, -9879, -9927, -9876, -9880, -9880, -9923, -9923, -9922, -9925, -9879, -9925, -9924, -9879, -9873};

    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    /* JADX WARN: Code duplicated, block: B:59:0x021d A[PHI: r7 r8 r12
      0x021d: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:58:0x021b, B:39:0x0160, B:10:0x0061, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:58:0x021b, B:39:0x0160, B:10:0x0061, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:58:0x021b, B:39:0x0160, B:10:0x0061, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0254 A[PHI: r1 r3 r4 r5 r9 r11 r22
      0x0254: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v4 java.lang.String), (r1v2 java.lang.String) binds: [B:62:0x0252, B:54:0x01fa, B:43:0x0186, B:21:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r3v3 short[]) = (r3v2 short[]), (r3v2 short[]), (r3v2 short[]), (r3v4 short[]) binds: [B:62:0x0252, B:54:0x01fa, B:43:0x0186, B:21:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:62:0x0252, B:54:0x01fa, B:43:0x0186, B:21:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:62:0x0252, B:54:0x01fa, B:43:0x0186, B:21:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:62:0x0252, B:54:0x01fa, B:43:0x0186, B:21:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:62:0x0252, B:54:0x01fa, B:43:0x0186, B:21:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r22v5 short) = (r22v4 short), (r22v3 short), (r22v3 short), (r22v3 short) binds: [B:62:0x0252, B:54:0x01fa, B:43:0x0186, B:21:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0285 A[PHI: r14 r15 r17
      0x0285: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:66:0x0283, B:27:0x00e9, B:13:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:66:0x0283, B:27:0x00e9, B:13:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:66:0x0283, B:27:0x00e9, B:13:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02b7 A[PHI: r13 r16
      0x02b7: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:70:0x02b5, B:35:0x0141, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x02b7: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:70:0x02b5, B:35:0x0141, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC4871
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3788() {
        int iM45029;
        int i;
        int i2;
        String strM3747;
        int i3 = C2788.f10625;
        int i4 = C0629.f2722;
        int iM450210 = (C19806.m45029("ۧۨ") ^ i4) * (-59);
        int i5 = ((iM450210 ^ i3) * 4675) ^ 929955955;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i6 = iM450210 ^ (-146719171);
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 81258741;
        short s3 = 0;
        String str = null;
        String strM39293 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-4053)) >> 31));
            switch (i14) {
                case -2146598606:
                case 1913164007:
                    C0216.m1591();
                    C1025.m3861();
                    return null;
                case -1952071064:
                case -236255454:
                    i8 = s * s3;
                    s2 = 16117;
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩶") ^ i3;
                        i = ((iM45029 ^ i4) * (-17953)) ^ 1352261619;
                        i2 = 643602523;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛܰ") ^ i3) * 71;
                        i = ((iM45029 ^ i4) * (-12151)) ^ 371045584;
                        i2 = 1951685042;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1929073008:
                case -872138487:
                    strM3747 = C3535.m10423(sArr4, i7, 18, i10);
                    str = strM3747;
                    iM45029 = (ThreadFactoryC3888.m11306("ܿۛ") ^ i3) * 41;
                    i = ((iM45029 ^ i4) * (-6049)) ^ (-321884819);
                    i2 = 1688432279;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1817929498:
                case -837624549:
                    i10 = 55562;
                    iM45029 = C19806.m45029("ܶ᩶") ^ i3;
                    i = ((iM45029 ^ i4) * (-9629)) ^ 859106592;
                    i2 = 236021185;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1792241388:
                case -726550139:
                    if ((i9 * i9) - i8 >= 0) {
                        iM45029 = C19806.m45029("۠ۛ") ^ i4;
                        i = ((iM45029 ^ i3) * (-27693)) ^ 308984822;
                        i2 = -2134141991;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("۟᩵")) * (-117);
                        i = ((iM45029 ^ i3) * 3503) ^ 1189434754;
                        i2 = -508966802;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1679843966:
                case 662920877:
                    IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(C1377.m4826(), str, true);
                    iwxapiCreateWXAPI.registerApp(str);
                    return iwxapiCreateWXAPI;
                case -1604976722:
                case 559672263:
                    i9 = s + s2;
                    if (C3286.m9798() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 17629) ^ (-544851971);
                        i2 = -768572267;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ֡") + i3) * 101;
                        i = ((iM45029 ^ i4) * (-5493)) ^ 2129785001;
                        i2 = -1289154839;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1446059239:
                case -360225830:
                    i11 = 1;
                    if (C1398.f5802 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩶") ^ i3;
                        i = ((iM45029 ^ i4) * (-17953)) ^ 1352261619;
                        i2 = 643602523;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩴۗ")) * (-23);
                        i = ((iM45029 ^ i3) * 15003) ^ 1302424414;
                        i2 = -1471903072;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1162260269:
                case 1474137906:
                    c = 0;
                    if (C2788.f10625 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۛ") + i4) * (-15);
                        i = ((iM45029 ^ i3) * 15047) ^ (-2006196425);
                        i2 = 1328452060;
                    } else {
                        iM45029 = C19806.m45029("ܺۜ") ^ i4;
                        i = ((iM45029 ^ i3) * (-9423)) ^ 1179124735;
                        i2 = 1306163420;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1053554500:
                case 1417971625:
                    sArr3 = f60439;
                    i13 = 7;
                    if (C2332.m7079() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۛ") + i4) * (-15);
                        i = ((iM45029 ^ i3) * 15047) ^ (-2006196425);
                        i2 = 1328452060;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶᩻") ^ i4;
                        i = ((iM45029 ^ i3) * (-7925)) ^ 994473186;
                        i2 = -399320590;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -874624006:
                case 1915292996:
                    sArr = f60439;
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۛ") ^ i4;
                        i = ((iM45029 ^ i3) * (-12977)) ^ 2062411403;
                        i2 = 288432077;
                    } else {
                        iM45029 = C19806.m45029("ۚܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-7593)) ^ (-791372592);
                        i2 = -2110538175;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -795560555:
                case 2104814680:
                    if (C12529.m31136((CharSequence) strM39293, (CharSequence) C0817.m3406(sArr2, i11, i12, i10), false)) {
                        iM45029 = (i3 - C19806.m45029("᩺᩷")) * 73;
                        i = ((iM45029 ^ i4) * (-31895)) ^ 303280504;
                        i2 = 184582218;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩸᩶")) * (-53);
                        i = ((iM45029 ^ i4) * 13869) ^ 351474569;
                        i2 = -490980383;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -604015337:
                case 1767965377:
                    strM39293 = C16737.m39293();
                    sArr2 = f60439;
                    if (C1875.m6086() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 17629) ^ (-544851971);
                        i2 = -768572267;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫۠") ^ i3;
                        i = ((iM45029 ^ i4) * 10839) ^ (-195205342);
                        i2 = 1063862169;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -377879959:
                case -188938254:
                    i12 = 6;
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۛ") ^ i4;
                        i = ((iM45029 ^ i3) * (-12977)) ^ 2062411403;
                        i2 = 288432077;
                    } else {
                        iM45029 = (C19806.m45029("ۡۚ") ^ i4) * (-47);
                        i = ((iM45029 ^ i3) * (-22001)) ^ 990717496;
                        i2 = -1106766088;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -206398152:
                case 1274841522:
                    C3743.m10966();
                    if (C2871.m8646()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i3) * (-9);
                        i = ((iM45029 ^ i4) * 10265) ^ 1636828447;
                        i2 = -89387604;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۛ") + i4) * (-15);
                        i = ((iM45029 ^ i3) * 15047) ^ (-2006196425);
                        i2 = 1328452060;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -77707277:
                case 2070728492:
                    strM3747 = C0962.m3747(sArr3, i13, 18, i10);
                    str = strM3747;
                    iM45029 = (ThreadFactoryC3888.m11306("ܿۛ") ^ i3) * 41;
                    i = ((iM45029 ^ i4) * (-6049)) ^ (-321884819);
                    i2 = 1688432279;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -340172:
                case 1392174082:
                    i10 = 16589;
                    iM45029 = C19806.m45029("ܶ᩶") ^ i3;
                    i = ((iM45029 ^ i4) * (-9629)) ^ 859106592;
                    i2 = 236021185;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 39719946:
                case 445506494:
                    if (C1461.f5957 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i3) * (-9);
                        i = ((iM45029 ^ i4) * 10265) ^ 1636828447;
                        i2 = -89387604;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩶") ^ i3;
                        i = ((iM45029 ^ i4) * (-17953)) ^ 1352261619;
                        i2 = 643602523;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 132045007:
                case 526955348:
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۛ") ^ i4;
                        i = ((iM45029 ^ i3) * (-12977)) ^ 2062411403;
                        i2 = 288432077;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩶") ^ i3;
                        i = ((iM45029 ^ i4) * (-17953)) ^ 1352261619;
                        i2 = 643602523;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 187686635:
                case 1188002302:
                    sArr4 = f60439;
                    i7 = 25;
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 17629) ^ (-544851971);
                        i2 = -768572267;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܶۜ")) * (-87);
                        i = ((iM45029 ^ i3) * 32427) ^ 1398859729;
                        i2 = -397740898;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 554816757:
                case 1588940538:
                    s = sArr[c];
                    s3 = 64468;
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 17629) ^ (-544851971);
                        i2 = -768572267;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺֡") ^ i4;
                        i = ((iM45029 ^ i3) * (-17851)) ^ (-1901796157);
                        i2 = -494408319;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    C3660.m10791();
                    iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i3) * (-9);
                    i = ((iM45029 ^ i4) * 10265) ^ 1636828447;
                    i2 = -89387604;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
