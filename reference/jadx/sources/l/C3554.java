package l;

import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۗ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3554 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۬ۢ۫, reason: not valid java name and contains not printable characters */
    private static final short[] f13095 = {1533, -292, -7746, 1153, 6111, 16543, 24462, -21530};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f13096;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f13097;

    /* JADX WARN: Code duplicated, block: B:18:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x012e A[PHI: r2 r3 r4 r13 r14 r15
      0x012e: PHI (r2v4 bin.mt.plus.Main) = 
      (r2v3 bin.mt.plus.Main)
      (r2v2 bin.mt.plus.Main)
      (r2v2 bin.mt.plus.Main)
      (r2v2 bin.mt.plus.Main)
      (r2v2 bin.mt.plus.Main)
     binds: [B:37:0x012c, B:33:0x010b, B:29:0x00ec, B:25:0x00cd, B:13:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:37:0x012c, B:33:0x010b, B:29:0x00ec, B:25:0x00cd, B:13:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:37:0x012c, B:33:0x010b, B:29:0x00ec, B:25:0x00cd, B:13:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:37:0x012c, B:33:0x010b, B:29:0x00ec, B:25:0x00cd, B:13:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:37:0x012c, B:33:0x010b, B:29:0x00ec, B:25:0x00cd, B:13:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:37:0x012c, B:33:0x010b, B:29:0x00ec, B:25:0x00cd, B:13:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x021a A[PHI: r6 r7 r11
      0x021a: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:61:0x0218, B:57:0x01fd, B:45:0x019c, B:19:0x00b1, B:16:0x0097, B:13:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:61:0x0218, B:57:0x01fd, B:45:0x019c, B:19:0x00b1, B:16:0x0097, B:13:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:61:0x0218, B:57:0x01fd, B:45:0x019c, B:19:0x00b1, B:16:0x0097, B:13:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0250 A[PHI: r8 r9 r10 r20
      0x0250: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:65:0x024e, B:53:0x01de, B:49:0x01be] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:65:0x024e, B:53:0x01de, B:49:0x01be] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:65:0x024e, B:53:0x01de, B:49:0x01be] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:65:0x024e, B:53:0x01de, B:49:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        int iM11306;
        int i;
        int i2;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i4 = C1398.f5802;
        int iM45029 = (i3 - C19806.m45029("۬᩺")) * 89;
        int i5 = ((iM45029 ^ i4) * 16065) ^ 1418965718;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ 1339323468;
        Main mainM7591 = null;
        int iM450210 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1772138014;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i4) * 19597) >> 31));
            switch (i15) {
                case -1963552355:
                case 2004177108:
                    c = 4;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("֨ᩳ") ^ i3) * (-11);
                        i = ((iM11306 ^ i4) * 10211) ^ (-51489507);
                        i2 = -1318637676;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ۧ") ^ i3) * 19;
                        i = ((iM11306 ^ i4) * 15819) ^ 113272455;
                        i2 = 2124209371;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1920292866:
                case -1625146319:
                    s = sArr[c];
                    if (C1189.f5284 <= 0) {
                        iM11306 = (C19806.m45029("֨ᩳ") ^ i3) * (-11);
                        i = ((iM11306 ^ i4) * 10211) ^ (-51489507);
                        i2 = -1318637676;
                    } else {
                        iM11306 = C19806.m45029("ۡᩳ") ^ i3;
                        i = ((iM11306 ^ i4) * 32479) ^ 1606626000;
                        i2 = -1705272535;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1517835976:
                case 2085006326:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    break;
                case -1229862259:
                case 179566695:
                    sArr = f13095;
                    if (C1668.m5583()) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ۠") ^ i4;
                        i = ((iM11306 ^ i3) * (-23511)) ^ 505896415;
                        i2 = -1579114868;
                    } else {
                        iM11306 = C19806.m45029("ᩳ᩷") ^ i3;
                        i = ((iM11306 ^ i4) * (-4677)) ^ 1155673143;
                        i2 = -1518372350;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1203936685:
                case -1106294121:
                    C1398.m4895();
                    iM11306 = (C19806.m45029("֨ᩳ") ^ i3) * (-11);
                    i = ((iM11306 ^ i4) * 10211) ^ (-51489507);
                    i2 = -1318637676;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1198993948:
                case 724299631:
                    i12 = 14396;
                    iM11306 = (ThreadFactoryC3888.m11306("ۖܰ") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM11306 ^ i3) * 9523) ^ 1670639329;
                    i2 = 324620439;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1170038680:
                case -842721693:
                    i11 = 31685641;
                    if (C0962.f3784) {
                        iM11306 = (C19806.m45029("֨ᩳ") ^ i3) * (-11);
                        i = ((iM11306 ^ i4) * 10211) ^ (-51489507);
                        i2 = -1318637676;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܰۛ")) * 9;
                        i = ((iM11306 ^ i3) * 17381) ^ 635482965;
                        i2 = 1107721165;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1106165810:
                case -742781327:
                    i13 = 5;
                    i14 = 3;
                    if (C2477.f9839 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۛ֫")) * 69;
                        i = ((iM11306 ^ i4) * (-28357)) ^ 1218565095;
                        i2 = 567773880;
                    } else {
                        iM11306 = (C19806.m45029("֡֫") + i3) * (-37);
                        i = ((iM11306 ^ i4) * 14795) ^ (-1385752306);
                        i2 = 1620247028;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1103646421:
                case 1415927184:
                    sArr2 = f13095;
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۛ֫")) * 69;
                        i = ((iM11306 ^ i4) * (-28357)) ^ 1218565095;
                        i2 = 567773880;
                    } else {
                        iM11306 = C19806.m45029("᩺᩺") ^ i4;
                        i = ((iM11306 ^ i3) * 28311) ^ 1416166233;
                        i2 = -1794685581;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1017097247:
                case 400874416:
                    mainM7591 = C2477.m7591(this.f13096);
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗᩳ") + i3) * (-81);
                        i = ((iM11306 ^ i4) * 15691) ^ (-1040771109);
                        i2 = -1338238218;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۛ֫")) * 69;
                        i = ((iM11306 ^ i4) * (-28357)) ^ 1218565095;
                        i2 = 567773880;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -636759153:
                case 1937745859:
                    iM450210 = C19806.m45029(C2332.m7082(sArr2, i13, i14, i12));
                    i7 = 2126772982;
                    if (C3660.f13403 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۛ֫")) * 69;
                        i = ((iM11306 ^ i4) * (-28357)) ^ 1218565095;
                        i2 = 567773880;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܰ֫")) * 7;
                        i = ((iM11306 ^ i3) * (-17273)) ^ (-312504276);
                        i2 = 1040939978;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -71823827:
                case 588256378:
                    i12 = 41355;
                    iM11306 = (ThreadFactoryC3888.m11306("ۖܰ") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM11306 ^ i3) * 9523) ^ 1670639329;
                    i2 = 324620439;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 75375057:
                case 404954236:
                    C1025.m3861();
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۛ") ^ i4;
                        i = ((iM11306 ^ i3) * 17) ^ 765822529;
                        i2 = -1793416171;
                    } else {
                        iM11306 = (i4 - C19806.m45029("֡᩸")) * 23;
                        i = ((iM11306 ^ i3) * (-3715)) ^ (-2011819);
                        i2 = -1428366072;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 144164370:
                case 1644160478:
                    i9 = i8 * i8;
                    i10 = s * s;
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("ᩳ᩷") ^ i3;
                        i = ((iM11306 ^ i4) * (-4677)) ^ 1155673143;
                        i2 = -1518372350;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧܶ") ^ i3) * 21;
                        i = ((iM11306 ^ i4) * 10345) ^ (-1273425530);
                        i2 = -1887906800;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 327500100:
                case 532353639:
                    m10246(mainM7591, iM450210 ^ i7);
                    break;
                case 562347606:
                case 1149403611:
                    if (C2124.m6673() <= 0) {
                        iM11306 = (C19806.m45029("֨ᩳ") ^ i3) * (-11);
                        i = ((iM11306 ^ i4) * 10211) ^ (-51489507);
                        i2 = -1318637676;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۛ") ^ i4;
                        i = ((iM11306 ^ i3) * 17) ^ 765822529;
                        i2 = -1793416171;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 995713324:
                case 1736471284:
                    i8 = s + 5629;
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("ᩳ᩷") ^ i3;
                        i = ((iM11306 ^ i4) * (-4677)) ^ 1155673143;
                        i2 = -1518372350;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷᩵") + i4) * (-21);
                        i = ((iM11306 ^ i3) * (-2705)) ^ (-662533458);
                        i2 = 386072535;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1300867870:
                case 1946752642:
                    if (C10634.f36300 < 0) {
                        iM11306 = (C19806.m45029("֨ᩳ") ^ i3) * (-11);
                        i = ((iM11306 ^ i4) * 10211) ^ (-51489507);
                        i2 = -1318637676;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۛ֫")) * 69;
                        i = ((iM11306 ^ i4) * (-28357)) ^ 1218565095;
                        i2 = 567773880;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i16 = i10 + i11;
                    if (i9 - (i16 + i16) <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ֡") ^ i4) * (-29);
                        i = ((iM11306 ^ i3) * (-9605)) ^ (-2035327565);
                        i2 = -1509127045;
                    } else {
                        iM11306 = C19806.m45029("֨۬") ^ i3;
                        i = ((iM11306 ^ i4) * (-225)) ^ 2045577189;
                        i2 = -2112702583;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e A[PHI: r1 r2
      0x007e: PHI (r1v52 int) = (r1v1 int), (r1v1 int), (r1v1 int), (r1v1 int), (r1v57 int) binds: [B:19:0x005f, B:17:0x005c, B:13:0x0053, B:9:0x0045, B:26:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r2v3 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v5 int) binds: [B:19:0x005f, B:17:0x005c, B:13:0x0053, B:9:0x0045, B:26:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1 A[PHI: r18
      0x00c1: PHI (r18v3 java.lang.String) = (r18v2 java.lang.String), (r18v1 java.lang.String) binds: [B:30:0x00bf, B:17:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0223 A[PHI: r4 r5 r6 r7 r8 r9 r17
      0x0223: PHI (r4v3 char) = (r4v2 char), (r4v1 char), (r4v1 char), (r4v1 char), (r4v1 char) binds: [B:62:0x0221, B:58:0x0204, B:54:0x01e6, B:50:0x01c5, B:46:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short), (r5v1 short), (r5v1 short) binds: [B:62:0x0221, B:58:0x0204, B:54:0x01e6, B:50:0x01c5, B:46:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r6v3 int) = (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:62:0x0221, B:58:0x0204, B:54:0x01e6, B:50:0x01c5, B:46:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:62:0x0221, B:58:0x0204, B:54:0x01e6, B:50:0x01c5, B:46:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:62:0x0221, B:58:0x0204, B:54:0x01e6, B:50:0x01c5, B:46:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v3 int) binds: [B:62:0x0221, B:58:0x0204, B:54:0x01e6, B:50:0x01c5, B:46:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r17v11 int) = (r17v7 int), (r17v8 int), (r17v9 int), (r17v10 int), (r17v12 int) binds: [B:62:0x0221, B:58:0x0204, B:54:0x01e6, B:50:0x01c5, B:46:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x025a A[PHI: r3 r13 r17
      0x025a: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:66:0x0258, B:11:0x0048, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r13v2 int) = (r13v1 int), (r13v1 int), (r13v3 int) binds: [B:66:0x0258, B:11:0x0048, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r17v23 int) = (r17v6 int), (r17v22 int), (r17v24 int) binds: [B:66:0x0258, B:11:0x0048, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        int iM11306;
        int i;
        int i2;
        int iM11307 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = -113773793;
        int i12 = C3660.f13403;
        int i13 = RunnableC0195.f1321;
        int iM45029 = (C19806.m45029("ۢۚ") + i12) * (-113);
        int i14 = ((iM45029 ^ i13) * 23413) ^ 524434465;
        int i15 = iM45029 ^ (-12253635);
        String strM7604 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * (-12177)) >> 31));
            switch (i11) {
                case -1767948834:
                case 517895143:
                    C2477.m7593();
                    RunnableC1564.m5345();
                    break;
                case -1405461577:
                case -192472440:
                    iM11307 = iM11307;
                    sArr = f13095;
                    if (C1377.m4833() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۚ") ^ i13) * (-43);
                        i = ((iM11306 ^ i12) * 23059) ^ (-1223115491);
                        i2 = 975065165;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ֫") + i12) * (-91);
                        i = ((iM11306 ^ i13) * (-29321)) ^ (-1316243737);
                        i2 = 395517819;
                    }
                    int i16 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i16;
                    break;
                case -1337667841:
                case 2073993860:
                    iM11307 = ThreadFactoryC3888.m11306(strM7604);
                    if (C0671.f2816 != 0) {
                        i3 = 2097681218;
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܶ") + i13) * (-87);
                        iM11307 = iM11307;
                        i = ((iM11306 ^ i12) * (-8083)) ^ (-1286832045);
                        i2 = -996772529;
                        int i17 = iM11307;
                        i15 = iM11306 ^ i2;
                        i14 = i;
                        iM11307 = i17;
                    } else {
                        int iM450210 = (C19806.m45029("ۛۧ") ^ i12) * 71;
                        i15 = iM450210 ^ 2068972784;
                        i14 = ((iM450210 ^ i13) * 20897) ^ (-2109664858);
                        i3 = 2097681218;
                    }
                    break;
                case -1175326267:
                case 1792370681:
                    C1189.m4360(iM11307 ^ i3);
                    break;
                case -1018762845:
                case 1520653923:
                    iM11307 = iM11307;
                    int i18 = i6 + i7;
                    if ((i18 + i18) - i5 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۫") ^ i13) * 71;
                        i = ((iM11306 ^ i12) * (-18791)) ^ (-1310590611);
                        i2 = 1599838616;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙܰ") ^ i12) * 95;
                        i = ((iM11306 ^ i13) * 9327) ^ (-218476313);
                        i2 = -1154060395;
                    }
                    int i19 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i19;
                    break;
                case -947021231:
                case -424132830:
                    iM11307 = iM11307;
                    i7 = 819025;
                    if (C0216.f1393 != 0) {
                        iM11306 = (C19806.m45029("ۜܳ") ^ i12) * 39;
                        i = ((iM11306 ^ i13) * (-12905)) ^ 370686846;
                        i2 = 2109477575;
                    } else {
                        iM11306 = (C19806.m45029("ܶ۠") + i12) * 17;
                        i = ((iM11306 ^ i13) * 26739) ^ 1332952938;
                        i2 = 1211946014;
                    }
                    int i110 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i110;
                    break;
                case -916944452:
                case 1712602699:
                    if (C0962.f3784) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܶ") + i13) * (-87);
                        iM11307 = iM11307;
                        i = ((iM11306 ^ i12) * (-8083)) ^ (-1286832045);
                        i2 = -996772529;
                    } else {
                        iM11307 = iM11307;
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۚ") ^ i13) * (-43);
                        i = ((iM11306 ^ i12) * 23059) ^ (-1223115491);
                        i2 = 975065165;
                    }
                    int i111 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i111;
                    break;
                case -650670298:
                case 796293885:
                    i8 = 16970;
                    iM11306 = C19806.m45029("ۜۜ") ^ i12;
                    i = ((iM11306 ^ i13) * (-5709)) ^ (-53116564);
                    i2 = -508714664;
                    int i112 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i112;
                    break;
                case -577172401:
                case -220678439:
                    i8 = 29879;
                    iM11306 = C19806.m45029("ۜۜ") ^ i12;
                    i = ((iM11306 ^ i13) * (-5709)) ^ (-53116564);
                    i2 = -508714664;
                    int i113 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i113;
                    break;
                case -446795931:
                case 963978795:
                    iM11307 = iM11307;
                    s = sArr[c];
                    if (C3722.f13525 <= 0) {
                        iM11306 = (C19806.m45029("ۜܳ") ^ i12) * 39;
                        i = ((iM11306 ^ i13) * (-12905)) ^ 370686846;
                        i2 = 2109477575;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩻") ^ i13;
                        i = ((iM11306 ^ i12) * 27029) ^ 1825658494;
                        i2 = -898816454;
                    }
                    int i114 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i114;
                    break;
                case -160823149:
                case 1090014542:
                    C1977.m6356();
                    if (C0050.m946() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܶ") + i13) * (-87);
                        iM11307 = iM11307;
                        i = ((iM11306 ^ i12) * (-8083)) ^ (-1286832045);
                        i2 = -996772529;
                    } else {
                        iM11307 = iM11307;
                        iM11306 = (ThreadFactoryC3888.m11306("ܺᩳ") + i12) * (-109);
                        i = ((iM11306 ^ i13) * (-28409)) ^ 1760451415;
                        i2 = 1286658626;
                    }
                    int i115 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i115;
                    break;
                case -100413237:
                case 696918640:
                    C3743.m10966();
                    C2642.m8171();
                    iM11306 = (ThreadFactoryC3888.m11306("۠ܶ") + i13) * (-87);
                    iM11307 = iM11307;
                    i = ((iM11306 ^ i12) * (-8083)) ^ (-1286832045);
                    i2 = -996772529;
                    int i116 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i116;
                    break;
                case 12121257:
                case 56598613:
                    iM11307 = iM11307;
                    c = 0;
                    if (C2642.f10294 <= 0) {
                        iM11306 = (C19806.m45029("ۜܳ") ^ i12) * 39;
                        i = ((iM11306 ^ i13) * (-12905)) ^ 370686846;
                        i2 = 2109477575;
                    } else {
                        iM11306 = (i13 - C19806.m45029("ᩴܽ")) * 87;
                        i = ((iM11306 ^ i12) * (-13949)) ^ (-1864098911);
                        i2 = 1238163203;
                    }
                    int i117 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i117;
                    break;
                case 54078989:
                case 588602633:
                    iM11307 = iM11307;
                    i5 = i4 * i4;
                    i6 = s * s;
                    if (C2788.m8472() != 0) {
                        iM11306 = (C19806.m45029("ۜܳ") ^ i12) * 39;
                        i = ((iM11306 ^ i13) * (-12905)) ^ 370686846;
                        i2 = 2109477575;
                    } else {
                        iM11306 = C19806.m45029("᩻ܺ") ^ i13;
                        i = ((iM11306 ^ i12) * (-26239)) ^ (-165745412);
                        i2 = 1164891502;
                    }
                    int i118 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i118;
                    break;
                case 146172275:
                case 1773911848:
                    iM11307 = iM11307;
                    i4 = s + 905;
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (C19806.m45029("ۜܳ") ^ i12) * 39;
                        i = ((iM11306 ^ i13) * (-12905)) ^ 370686846;
                        i2 = 2109477575;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۜ") ^ i12;
                        i = ((iM11306 ^ i13) * 4997) ^ 1209677324;
                        i2 = -1262772174;
                    }
                    int i119 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i119;
                    break;
                case 650242742:
                case 1297110128:
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("۫ۙ") + i13) * (-49);
                        iM11307 = iM11307;
                        i = ((iM11306 ^ i12) * 1037) ^ 490052295;
                        i2 = 1508134628;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܶ") + i13) * (-87);
                        iM11307 = iM11307;
                        i = ((iM11306 ^ i12) * (-8083)) ^ (-1286832045);
                        i2 = -996772529;
                    }
                    int i1110 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i1110;
                    break;
                case 711004086:
                case 1767320064:
                    strM7604 = C2477.m7604(sArr2, i9, i10, i8);
                    if (C3577.m10565()) {
                        iM11307 = iM11307;
                        iM11306 = C19806.m45029("ۗۚ") ^ i13;
                        i = ((iM11306 ^ i12) * (-9975)) ^ (-544279312);
                        i2 = 328319567;
                    } else {
                        iM11306 = (C19806.m45029("۫ۙ") + i13) * (-49);
                        iM11307 = iM11307;
                        i = ((iM11306 ^ i12) * 1037) ^ 490052295;
                        i2 = 1508134628;
                    }
                    int i1111 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i1111;
                    break;
                case 734650951:
                case 1979931547:
                    iM11307 = iM11307;
                    sArr2 = f13095;
                    i9 = 1;
                    if (C2788.f10625 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺᩳ") + i12) * (-109);
                        i = ((iM11306 ^ i13) * (-28409)) ^ 1760451415;
                        i2 = 1286658626;
                    } else {
                        iM11306 = (C19806.m45029("֫֨") + i13) * 43;
                        i = ((iM11306 ^ i12) * 17933) ^ (-1355162188);
                        i2 = -402665198;
                    }
                    int i1112 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i1112;
                    break;
                default:
                    iM11307 = iM11307;
                    i10 = 3;
                    if (C1419.f5860 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۚ") ^ i13) * (-43);
                        i = ((iM11306 ^ i12) * 23059) ^ (-1223115491);
                        i2 = 975065165;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴܶ") ^ i12;
                        i = ((iM11306 ^ i13) * (-7887)) ^ 693569540;
                        i2 = -17158143;
                    }
                    int i1113 = iM11307;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    iM11307 = i1113;
                    break;
            }
            return;
        }
    }

    public C3554(C11545 c11545, AbstractC20745 abstractC20745) {
        int i = -1253373013;
        int i2 = C2871.f10837;
        int i3 = C0629.f2722;
        this.f13096 = c11545;
        this.f13097 = abstractC20745;
        int iM11306 = (ThreadFactoryC3888.m11306("ۖ᩵") ^ i2) * 11;
        int i4 = ((iM11306 ^ i3) * (-3817)) ^ 1562312248;
        int i5 = 1833700558;
        while (true) {
            i = (iM11306 ^ i5) ^ (i4 & (((i ^ i3) * 12187) >> 31));
            switch (i) {
                case -2019771357:
                case 937177763:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (C19806.m45029("֨ܿ") + i2) * (-71);
                        i4 = ((iM11306 ^ i3) * (-21645)) ^ 1698250825;
                        i5 = -74713494;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֨") ^ i3) * 11;
                        i4 = ((iM11306 ^ i2) * (-24215)) ^ 466188514;
                        i5 = 195560605;
                    }
                    break;
                case -1531723487:
                case -636482731:
                    if (C1419.f5860 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֨") ^ i3) * 11;
                        i4 = ((iM11306 ^ i2) * (-24215)) ^ 466188514;
                        i5 = 195560605;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩵") ^ i3) * 95;
                        i4 = ((iM11306 ^ i2) * (-6963)) ^ 2128489875;
                        i5 = 1408286407;
                    }
                    break;
                case -851730864:
                case 1723752797:
                    C0962.m3746();
                    throw new RuntimeException();
                case -585707041:
                case 234679492:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30777) ^ (-431859159);
                        i5 = -450486987;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ۟") ^ i2) * (-75);
                        i4 = ((iM11306 ^ i3) * 16627) ^ 1820971378;
                        i5 = 2011755896;
                    }
                    break;
                case -459569315:
                case 1274318268:
                    return;
                case 682741304:
                case 1473700317:
                    C1937.m6279();
                    if (RunnableC1564.f6300) {
                        iM11306 = (C19806.m45029("֨ܿ") + i2) * (-71);
                        i4 = ((iM11306 ^ i3) * (-21645)) ^ 1698250825;
                        i5 = -74713494;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤۤ") + i3) * (-109);
                        i4 = ((iM11306 ^ i2) * (-4879)) ^ (-1210929664);
                        i5 = 1050314287;
                    }
                    break;
                default:
                    ThreadFactoryC3888.m11300();
                    iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩵") ^ i3) * 95;
                    i4 = ((iM11306 ^ i2) * (-6963)) ^ 2128489875;
                    i5 = 1408286407;
                    break;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C6508.m17713(this.f13097);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C11545 c11545 = null;
        int i = 707043180;
        int i2 = C3577.f13150;
        int i3 = C1937.f7317;
        int iM45029 = C19806.m45029("ۨ᩵") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-8393)) ^ (-1281110935);
        int i5 = -1043756927;
        while (true) {
            i = ((((i ^ i3) * (-26243)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2135045714:
                case 1403974123:
                    C0671.m3019(RunnableC1606.m5471(c11545), exc, null);
                    break;
                case -1767122549:
                case 1218622878:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20283)) ^ 786253275;
                        i5 = -1640774329;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ᩺") ^ i3) * (-25);
                        i4 = ((iM45029 ^ i2) * 15621) ^ 1485066515;
                        i5 = -1185989697;
                    }
                    break;
                case -1657227997:
                case 1566195808:
                    if (C3722.f13525 <= 0) {
                        iM45029 = (i2 - C19806.m45029("᩸᩺")) * 85;
                        i4 = ((iM45029 ^ i3) * 24533) ^ 709737958;
                        i5 = 586167113;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷᩵") ^ i2) * 81;
                        i4 = ((iM45029 ^ i3) * 25401) ^ (-1285487003);
                        i5 = 1838817558;
                    }
                    break;
                case -1624853746:
                case -7743518:
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20283)) ^ 786253275;
                        i5 = -1640774329;
                    } else {
                        iM45029 = C19806.m45029("ۛۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18689)) ^ 1696505445;
                        i5 = -471926020;
                    }
                    break;
                case -1381137671:
                case 83740724:
                    C0797.m3359();
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = (C19806.m45029("۟᩻") ^ i2) * (-11);
                        i4 = ((iM45029 ^ i3) * 29957) ^ (-621912735);
                        i5 = -1560580228;
                    } else {
                        iM45029 = C19806.m45029("ۚᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13495) ^ (-736176277);
                        i5 = 1069633394;
                    }
                    break;
                case -1016589726:
                case 1207827116:
                    C3743.m10966();
                    C0671.m3008();
                    break;
                case -729951034:
                case 952546188:
                    C1066.m4023();
                    RunnableC1606.m5473();
                    iM45029 = (i2 - C19806.m45029("᩸᩺")) * 85;
                    i4 = ((iM45029 ^ i3) * 24533) ^ 709737958;
                    i5 = 586167113;
                    break;
                case -684473794:
                case 729299070:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (C19806.m45029("۟᩻") ^ i2) * (-11);
                        i4 = ((iM45029 ^ i3) * 29957) ^ (-621912735);
                        i5 = -1560580228;
                    } else {
                        iM45029 = C19806.m45029("ۤܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25367)) ^ 275365979;
                        i5 = 1643952285;
                    }
                    break;
                case -341498127:
                case 918032259:
                    C2332.m7079();
                    if (C1398.f5802 <= 0) {
                        iM45029 = C19806.m45029("ۚᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13495) ^ (-736176277);
                        i5 = 1069633394;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩸᩺")) * 85;
                        i4 = ((iM45029 ^ i3) * 24533) ^ 709737958;
                        i5 = 586167113;
                    }
                    break;
                case -80665065:
                case 735158131:
                    if (C0671.f2816 != 0) {
                        iM45029 = (C19806.m45029("۟᩻") ^ i2) * (-11);
                        i4 = ((iM45029 ^ i3) * 29957) ^ (-621912735);
                        i5 = -1560580228;
                    } else {
                        iM45029 = (C19806.m45029("ܿۡ") + i2) * (-37);
                        i4 = ((iM45029 ^ i3) * (-5083)) ^ (-185178462);
                        i5 = -864480179;
                    }
                    break;
                case -70065785:
                case 701877000:
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("ܰ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20767)) ^ (-494516841);
                        i5 = 1685031;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩸᩺")) * 85;
                        i4 = ((iM45029 ^ i3) * 24533) ^ 709737958;
                        i5 = 586167113;
                    }
                    break;
                case 237287690:
                case 2031313862:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (i2 - C19806.m45029("᩸᩺")) * 85;
                        i4 = ((iM45029 ^ i3) * 24533) ^ 709737958;
                        i5 = 586167113;
                    } else {
                        iM45029 = C19806.m45029("᩸ۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24163)) ^ (-2143772672);
                        i5 = 1988623151;
                    }
                    break;
                case 587963827:
                case 1138488577:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20283)) ^ 786253275;
                        i5 = -1640774329;
                    } else {
                        iM45029 = C19806.m45029("ܽܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 12267) ^ (-192095884);
                        i5 = 1016025329;
                    }
                    break;
                case 666534169:
                case 1655100395:
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("ܰ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20767)) ^ (-494516841);
                        i5 = 1685031;
                    } else {
                        iM45029 = (C19806.m45029("ۗܰ") ^ i3) * (-93);
                        i4 = ((iM45029 ^ i2) * (-7005)) ^ 1383149569;
                        i5 = -1018029966;
                    }
                    break;
                case 1527003743:
                case 1544823363:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (i2 - C19806.m45029("᩸᩺")) * 85;
                        i4 = ((iM45029 ^ i3) * 24533) ^ 709737958;
                        i5 = 586167113;
                    } else {
                        iM45029 = (C19806.m45029("ۘۖ") ^ i2) * 91;
                        i4 = ((iM45029 ^ i3) * 21215) ^ 500887900;
                        i5 = 1706268308;
                    }
                    break;
                default:
                    c11545 = this.f13096;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20283)) ^ 786253275;
                        i5 = -1640774329;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12801)) ^ (-1686916961);
                        i5 = -1206798178;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C0797.m3353(this);
    }
}
