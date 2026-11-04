package l;

import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֨ۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81RP */
/* JADX INFO: loaded from: classes3.dex */
public class C1087 extends AbstractC16610 {

    /* JADX INFO: renamed from: ۖ᩷ܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f3882 = {2054, 25529, 29250, 32128, -25108, 27718, 23782, 2508, 26356, 26302, 26303, 26274, 26297, 26294, 26299, 26281, 26281, 26303, 26281, 26300, 26291, 26294, 26303, 26289, 26303, 26303, 26282, 26267, 26282, 26289, 26249, 26291, 26301, 26264, 26294, 26293, 26297, 26289, 26281, 26303, 26294, 26303, 26297, 26286, 26260, 26299, 26295, 26303, 26281, 26254, 26290, 26303, 26362, 26295, 26299, 26291, 26292, 26362, 26299, 26282, 26289, 26362, 26292, 26293, 26286, 26362, 26300, 26293, 26287, 26292, 26302, 26356, 26267, 26292, 26302, 26280, 26293, 26291, 26302, 26263, 26299, 26292, 26291, 26300, 26303, 26281, 26286, 26356, 26274, 26295, 26294, 26271, 26292, 26286, 26280, 26275, 26362, 26292, 26293, 26286, 26362, 26300, 26293, 26287, 26292, 26302, 26336, 26362, 26267, 26292, 26302, 26280, 26293, 26291, 26302, 26263, 26299, 26292, 26291, 26300, 26303, 26281, 26286, 26356, 26274, 26295, 26294, 26356, 26286, 26295, 26282, 26296, 26299, 26281, 26303, 26280, 26303, 26281, 26293, 26287, 26280, 26297, 26303, 26281, 26356, 26299, 26280, 26281, 26297, 26271, 26292, 26286, 26280, 26275, 26362, 26292, 26293, 26286, 26362, 26300, 26293, 26287, 26292, 26302, 26336, 26362, 26280, 26303, 26281, 26293, 26287, 26280, 26297, 26303, 26281, 26356, 26299, 26280, 26281, 26297, 26358, 26295, 26299, 26292, 26291, 26300, 26303, 26281, 26286, 26297, 26294, 26299, 26281, 26281, 26303, 26281, 26241, 26346, 26359, 26339, 26247, 26352, 26246, 26356, 26302, 26303, 26274, 26281, 26282, 26294, 26291, 26286, 26291, 26281, 26268, 26303, 26299, 26286, 26287, 26280, 26303, 26249, 26282, 26294, 26291, 26286, 26245, 26299, 26282, 26289, 26281, 26356, 26299, 26282, 26289, 26295, 26303, 26286, 26299, 26359, 26302, 26299, 26286, 26299, 26287, 26281, 26303, 26281, 26359, 26297, 26293, 26292, 26300, 26291, 26301, 26287, 26280, 26299, 26286, 26291, 26293, 26292, 26282, 26303, 26280, 26295, 26291, 26281, 26281, 26291, 26293, 26292, 26287, 26281, 26303, 26281, 26359, 26282, 26303, 26280, 26295, 26291, 26281, 26281, 26291, 26293, 26292, 26283, 26287, 26303, 26280, 26291, 26303, 26281, 26287, 26281, 26303, 26281, 26359, 26282, 26303, 26280, 26295, 26291, 26281, 26281, 26291, 26293, 26292, 26359, 26281, 26302, 26289, 26359, 26344, 26345, 26299, 26282, 26282, 26294, 26291, 26297, 26299, 26286, 26291, 26293, 26292, 26287, 26281, 26303, 26281, 26359, 26300, 26303, 26299, 26286, 26287, 26280, 26303, 26295, 26293, 26302, 26287, 26294, 26303, 6679, 16415, 16400, 16405, 16412, -9264, 14458, 14400, 12024, 13909, 15741};

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f3883;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f3884;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f3885;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f3886;

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a9 A[PHI: r2
      0x00a9: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v1 java.lang.String) binds: [B:23:0x00a7, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0220 A[PHI: r5 r11 r12 r13 r21 r22
      0x0220: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short), (r5v1 short), (r5v1 short) binds: [B:61:0x021e, B:57:0x0200, B:39:0x014c, B:35:0x0128, B:31:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r11v3 short[]) = (r11v1 short[]), (r11v1 short[]), (r11v2 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:61:0x021e, B:57:0x0200, B:39:0x014c, B:35:0x0128, B:31:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:61:0x021e, B:57:0x0200, B:39:0x014c, B:35:0x0128, B:31:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:61:0x021e, B:57:0x0200, B:39:0x014c, B:35:0x0128, B:31:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r21v3 int) = (r21v1 int), (r21v1 int), (r21v1 int), (r21v2 int), (r21v1 int) binds: [B:61:0x021e, B:57:0x0200, B:39:0x014c, B:35:0x0128, B:31:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r22v5 char) = (r22v4 char), (r22v3 char), (r22v3 char), (r22v3 char), (r22v3 char) binds: [B:61:0x021e, B:57:0x0200, B:39:0x014c, B:35:0x0128, B:31:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0256 A[PHI: r3 r6 r7 r8 r9 r14 r15 r16
      0x0256: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:65:0x0254, B:53:0x01e0, B:49:0x01c0, B:27:0x00de, B:17:0x0089, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:65:0x0254, B:53:0x01e0, B:49:0x01c0, B:27:0x00de, B:17:0x0089, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:65:0x0254, B:53:0x01e0, B:49:0x01c0, B:27:0x00de, B:17:0x0089, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:65:0x0254, B:53:0x01e0, B:49:0x01c0, B:27:0x00de, B:17:0x0089, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:65:0x0254, B:53:0x01e0, B:49:0x01c0, B:27:0x00de, B:17:0x0089, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r14v3 short[]) = (r14v1 short[]), (r14v1 short[]), (r14v1 short[]), (r14v2 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:65:0x0254, B:53:0x01e0, B:49:0x01c0, B:27:0x00de, B:17:0x0089, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r15v3 int) = (r15v1 int), (r15v1 int), (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int) binds: [B:65:0x0254, B:53:0x01e0, B:49:0x01c0, B:27:0x00de, B:17:0x0089, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:65:0x0254, B:53:0x01e0, B:49:0x01c0, B:27:0x00de, B:17:0x0089, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        int iM3169;
        int i;
        int i2;
        String strM8881 = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 0;
        int i11 = 1605523469;
        int i12 = C2419.f7754;
        int i13 = C0773.f2792;
        int iM2761 = C0619.m2761("ۤۡ") ^ i13;
        int i14 = ((iM2761 ^ i12) * 9615) ^ (-34324974);
        int i15 = iM2761 ^ 837163111;
        short[] sArr3 = null;
        int i16 = 0;
        int iM31610 = 0;
        char c = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i12) * 12647) >> 31));
            switch (i11) {
                case -2117221814:
                case -335481170:
                    if (C2288.f7433 > 0) {
                        iM3169 = C0773.m3169("ۨۢ") ^ i13;
                        i = ((iM3169 ^ i12) * (-30415)) ^ 1012633377;
                        i2 = 1464645980;
                    } else {
                        iM3169 = (C0619.m2761("֨۫") ^ i12) * 51;
                        i = ((iM3169 ^ i13) * 12287) ^ (-10412);
                        i2 = 1475452535;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -1862044887:
                case -1605122496:
                    m43859(C0619.m2761(strM8881) ^ 2101981796);
                    break;
                case -1847784025:
                case 634526991:
                    C4282.m13644();
                    if (C1080.f3865 >= 0) {
                        iM3169 = (i13 - C0773.m3169("᩻ᩳ")) * 49;
                        i = ((iM3169 ^ i12) * (-10135)) ^ (-2045433410);
                        i2 = 1261708348;
                    } else {
                        iM3169 = (C0773.m3169("ۛܿ") + i12) * 29;
                        i = ((iM3169 ^ i13) * 21981) ^ 19037223;
                        i2 = 73708535;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -1773257309:
                case -532024692:
                    iM31610 = C0773.m3169(C4282.m13650(sArr, i8, i9, i7));
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("ۙۘ") ^ i13) * 5;
                        i = ((iM3169 ^ i12) * 253) ^ 594222608;
                        i2 = -1126895420;
                    } else {
                        iM3169 = (C0619.m2761("ܶۚ") + i12) * (-33);
                        i = ((iM3169 ^ i13) * 15683) ^ 1325667230;
                        i2 = -1072216718;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -1534669635:
                case -471336832:
                    RunnableC3055.m9933();
                    C20932.m47848();
                    break;
                case -1502007690:
                case 2017280892:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("ۛܿ") + i12) * 29;
                        i = ((iM3169 ^ i13) * 21981) ^ 19037223;
                        i2 = 73708535;
                    } else {
                        iM3169 = C0773.m3169("ۨۢ") ^ i13;
                        i = ((iM3169 ^ i12) * (-30415)) ^ 1012633377;
                        i2 = 1464645980;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -1498896859:
                case 1299380006:
                    int i17 = i5 + i6;
                    if (i4 - (i17 + i17) <= 0) {
                        iM3169 = C0773.m3169("ۖܿ") ^ i12;
                        i = ((iM3169 ^ i13) * 29507) ^ 1372749218;
                        i2 = 448072948;
                    } else {
                        iM3169 = C0619.m2761("ۙ᩺") ^ i12;
                        i = ((iM3169 ^ i13) * (-27889)) ^ 1622754971;
                        i2 = 1574412925;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -1469767904:
                case -1220281841:
                    C3033.m9854(this, iM31610 ^ 2123471143);
                    if (C3077.m10041()) {
                        iM3169 = (C0619.m2761("ۙۘ") ^ i13) * 5;
                        i = ((iM3169 ^ i12) * 253) ^ 594222608;
                        i2 = -1126895420;
                    } else {
                        iM3169 = C0773.m3169("ܶ֫") ^ i12;
                        i = ((iM3169 ^ i13) * (-19337)) ^ (-369307078);
                        i2 = -155954985;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -960797787:
                case 1909285409:
                    RunnableC3055.m9933();
                    iM3169 = (i13 - C0773.m3169("᩻ᩳ")) * 49;
                    i = ((iM3169 ^ i12) * (-10135)) ^ (-2045433410);
                    i2 = 1261708348;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -870522776:
                case 2126738536:
                    sArr2 = f3882;
                    i10 = 4;
                    i16 = 3;
                    if (C3099.m10095()) {
                        iM3169 = (i13 - C0773.m3169("᩻ᩳ")) * 49;
                        i = ((iM3169 ^ i12) * (-10135)) ^ (-2045433410);
                        i2 = 1261708348;
                    } else {
                        iM3169 = C0619.m2761("᩷ۙ") ^ i13;
                        i = ((iM3169 ^ i12) * (-10867)) ^ 682331301;
                        i2 = 1878024874;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -710898378:
                case -329701485:
                    i7 = 37271;
                    iM3169 = C0773.m3169("ۨۜ") ^ i13;
                    i = ((iM3169 ^ i12) * 20003) ^ 2111059312;
                    i2 = 390355483;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -650731235:
                case -529314966:
                    i3 = s + 19780;
                    if (C3448.f11240 >= 0) {
                        iM3169 = (i13 - C0773.m3169("᩻ᩳ")) * 49;
                        i = ((iM3169 ^ i12) * (-10135)) ^ (-2045433410);
                        i2 = 1261708348;
                    } else {
                        iM3169 = (C0773.m3169("ۘ۟") ^ i13) * (-97);
                        i = ((iM3169 ^ i12) * 721) ^ 594673614;
                        i2 = -555401939;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -145183636:
                case 430982459:
                    c = 0;
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("ۙۘ") ^ i13) * 5;
                        i = ((iM3169 ^ i12) * 253) ^ 594222608;
                        i2 = -1126895420;
                    } else {
                        iM3169 = (C0619.m2761("ܰۜ") ^ i13) * 39;
                        i = ((iM3169 ^ i12) * (-189)) ^ 1758378334;
                        i2 = 1805881748;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -91936375:
                case 493691201:
                    strM8881 = C2702.m8881(sArr2, i10, i16, i7);
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("֨۫") ^ i12) * 51;
                        i = ((iM3169 ^ i13) * 12287) ^ (-10412);
                        i2 = 1475452535;
                    } else {
                        iM3169 = (i12 - C0773.m3169("᩻᩹")) * (-89);
                        i = ((iM3169 ^ i13) * 32711) ^ (-244791582);
                        i2 = 802654452;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case 495614551:
                case 1094585106:
                    s = sArr3[c];
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0619.m2761("ۙۘ") ^ i13) * 5;
                        i = ((iM3169 ^ i12) * 253) ^ 594222608;
                        i2 = -1126895420;
                    } else {
                        iM3169 = (i12 - C0619.m2761("֫ܰ")) * 47;
                        i = ((iM3169 ^ i13) * 26867) ^ (-1643618063);
                        i2 = -307642591;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case 1131986099:
                case 1519040291:
                    sArr3 = f3882;
                    if (C3998.m12920()) {
                        iM3169 = (C0773.m3169("ۡܿ") + i12) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i13) * (-29437)) ^ (-343211020);
                        i2 = -523725709;
                    } else {
                        iM3169 = (i13 - C0773.m3169("᩻ᩳ")) * 49;
                        i = ((iM3169 ^ i12) * (-10135)) ^ (-2045433410);
                        i2 = 1261708348;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case 1325844031:
                case 1712209897:
                    i4 = i3 * i3;
                    i5 = s * s;
                    i6 = 391248400;
                    if (C1564.f5401 <= 0) {
                        iM3169 = (i13 - C0773.m3169("᩻ᩳ")) * 49;
                        i = ((iM3169 ^ i12) * (-10135)) ^ (-2045433410);
                        i2 = 1261708348;
                    } else {
                        iM3169 = (C0619.m2761("ܽᩴ") + i13) * (-55);
                        i = ((iM3169 ^ i12) * 23831) ^ 1430541797;
                        i2 = 315414694;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case 1708850758:
                case 1929291091:
                    sArr = f3882;
                    i8 = 1;
                    i9 = 3;
                    if (C3448.m11248() != 0) {
                        iM3169 = (C0619.m2761("ۙۘ") ^ i13) * 5;
                        i = ((iM3169 ^ i12) * 253) ^ 594222608;
                        i2 = -1126895420;
                    } else {
                        iM3169 = (C0773.m3169("۠ᩴ") ^ i13) * 33;
                        i = ((iM3169 ^ i12) * (-4529)) ^ (-324590858);
                        i2 = 641240145;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                default:
                    i7 = 212;
                    iM3169 = C0773.m3169("ۨۜ") ^ i13;
                    i = ((iM3169 ^ i12) * 20003) ^ 2111059312;
                    i2 = 390355483;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
            }
            return;
        }
    }

    public C1087() {
        AbstractC22044 abstractC22044M47850 = null;
        int i = 711762822;
        int i2 = C3690.f12684;
        int i3 = C3734.f12817;
        int iM3169 = (C0773.m3169("ۗۨ") + i2) * (-71);
        int i4 = ((iM3169 ^ i3) * (-25959)) ^ 1184414369;
        int i5 = -131357706;
        while (true) {
            i = ((((i ^ i3) * 21115) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2108618514:
                case -864142103:
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0773.m3169("ۧ᩷") + i3) * 17;
                        i4 = ((iM3169 ^ i2) * 10217) ^ 71553036;
                        i5 = 1519025363;
                    } else {
                        iM3169 = (C0619.m2761("۫ۨ") ^ i2) * (-19);
                        i4 = ((iM3169 ^ i3) * 28361) ^ 1609074942;
                        i5 = -800923218;
                    }
                    break;
                case -2100704791:
                case -2086041897:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0773.m3169("ۧ᩷") + i3) * 17;
                        i4 = ((iM3169 ^ i2) * 10217) ^ 71553036;
                        i5 = 1519025363;
                    } else {
                        iM3169 = C0619.m2761("᩷ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-30815)) ^ 1581378500;
                        i5 = 1045673677;
                    }
                    break;
                case -1943252114:
                case 1919387263:
                    abstractC22044M47850 = C20932.m47850(C6382.f21563);
                    if (C2288.f7433 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۡ᩻")) * 33;
                        i4 = ((iM3169 ^ i3) * 4809) ^ 464126787;
                        i5 = 128164714;
                    } else {
                        iM3169 = C0773.m3169("ᩳ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5649) ^ (-1977775396);
                        i5 = -1484207826;
                    }
                    break;
                case -1720143402:
                case -1427076261:
                    if (C4238.m13540() <= 0) {
                        iM3169 = C0773.m3169("۟᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32101)) ^ (-350223862);
                        i5 = -379424720;
                    } else {
                        iM3169 = C0773.m3169("۫ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-26699)) ^ (-939960753);
                        i5 = -760447702;
                    }
                    break;
                case -1477827214:
                case 1580691514:
                    if (!C3492.m11488()) {
                        iM3169 = (C0773.m3169("ۧ᩷") + i3) * 17;
                        i4 = ((iM3169 ^ i2) * 10217) ^ 71553036;
                        i5 = 1519025363;
                    } else {
                        iM3169 = (C0773.m3169("ۖۗ") + i3) * 59;
                        i4 = ((iM3169 ^ i2) * 30667) ^ (-1322316114);
                        i5 = 439942750;
                    }
                    break;
                case -1421851669:
                case 371057193:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("ۧ᩷") + i3) * 17;
                        i4 = ((iM3169 ^ i2) * 10217) ^ 71553036;
                        i5 = 1519025363;
                    } else {
                        iM3169 = (C0619.m2761("֡᩶") + i2) * 9;
                        i4 = ((iM3169 ^ i3) * 6021) ^ 256625628;
                        i5 = -89128884;
                    }
                    break;
                case -1143190800:
                case 1368382556:
                    this.f3886 = new ArrayList();
                    return;
                case -1129853590:
                case -511813145:
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0773.m3169("ۖۗ") + i3) * 59;
                        i4 = ((iM3169 ^ i2) * 30667) ^ (-1322316114);
                        i5 = 439942750;
                    } else {
                        iM3169 = C0773.m3169("۟᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32101)) ^ (-350223862);
                        i5 = -379424720;
                    }
                    break;
                case -894543159:
                case 1203531297:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (i2 - C0619.m2761("ۡ᩻")) * 33;
                        i4 = ((iM3169 ^ i3) * 4809) ^ 464126787;
                        i5 = 128164714;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֡ۗ")) * (-83);
                        i4 = ((iM3169 ^ i2) * (-11771)) ^ 1841034509;
                        i5 = -153760797;
                    }
                    break;
                case -870032207:
                case 510365241:
                    if (RunnableC1848.f6235) {
                        iM3169 = (i2 - C0619.m2761("ۡ᩻")) * 33;
                        i4 = ((iM3169 ^ i3) * 4809) ^ 464126787;
                        i5 = 128164714;
                    } else {
                        iM3169 = C0773.m3169("ۧۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31025)) ^ (-1894021169);
                        i5 = -481460259;
                    }
                    break;
                case -678306260:
                case 363565505:
                    C0950.m3785();
                    throw new RuntimeException();
                case 114410328:
                case 446637324:
                    if (C1826.f6190 > 0) {
                        iM3169 = C0619.m2761("ۡۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24311)) ^ 1463140755;
                        i5 = 1623518528;
                    } else {
                        iM3169 = (C0773.m3169("ۧ᩷") + i3) * 17;
                        i4 = ((iM3169 ^ i2) * 10217) ^ 71553036;
                        i5 = 1519025363;
                    }
                    break;
                case 191321432:
                case 368961311:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0619.m2761("ۡۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24311)) ^ 1463140755;
                        i5 = 1623518528;
                    } else {
                        iM3169 = C0773.m3169("ᩳ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 32119) ^ (-364975247);
                        i5 = 390236212;
                    }
                    break;
                case 1093333312:
                case 1965043716:
                    C1321.m4852();
                    iM3169 = C0773.m3169("۟᩻") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-32101)) ^ (-350223862);
                    i5 = -379424720;
                    break;
                case 1577566446:
                case 1985834431:
                    this.f3883 = abstractC22044M47850;
                    if (C0269.f1558 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۡ᩻")) * 33;
                        i4 = ((iM3169 ^ i3) * 4809) ^ 464126787;
                        i5 = 128164714;
                    } else {
                        iM3169 = C0619.m2761("᩵۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-30377)) ^ 520269813;
                        i5 = -2060701562;
                    }
                    break;
                default:
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0619.m2761("ۡۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24311)) ^ 1463140755;
                        i5 = 1623518528;
                    } else {
                        iM3169 = (C0773.m3169("ۜۙ") ^ i2) * 115;
                        i4 = ((iM3169 ^ i3) * (-5265)) ^ (-998685403);
                        i5 = 1275686495;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46057;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x04c0 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:121:0x029b A[Catch: all -> 0x0715, TRY_ENTER, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x02ab A[Catch: all -> 0x0715, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x02ba A[Catch: all -> 0x0715, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x02c0 A[Catch: all -> 0x0715, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x02c4 A[Catch: all -> 0x0715, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x02d8 A[Catch: all -> 0x0715, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x02fd A[Catch: all -> 0x0598, TRY_LEAVE, TryCatch #14 {, blocks: (B:134:0x02e3, B:137:0x02ec, B:139:0x02fd, B:286:0x056c, B:288:0x0572, B:284:0x0566, B:298:0x05a4), top: B:381:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0315  */
    /* JADX WARN: Code duplicated, block: B:147:0x031a  */
    /* JADX WARN: Code duplicated, block: B:150:0x031e A[LOOP:8: B:372:0x030c->B:150:0x031e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:190:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:192:0x03c7 A[Catch: all -> 0x04c0, TryCatch #0 {, blocks: (B:186:0x03b4, B:188:0x03bd, B:192:0x03c7, B:194:0x03cc, B:199:0x03db, B:240:0x0492, B:270:0x04f3, B:275:0x0517, B:277:0x0533, B:278:0x053a, B:238:0x047e, B:260:0x04bf, B:259:0x04bc, B:255:0x04b6), top: B:357:0x03b4, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:199:0x03db A[Catch: all -> 0x04c0, TRY_LEAVE, TryCatch #0 {, blocks: (B:186:0x03b4, B:188:0x03bd, B:192:0x03c7, B:194:0x03cc, B:199:0x03db, B:240:0x0492, B:270:0x04f3, B:275:0x0517, B:277:0x0533, B:278:0x053a, B:238:0x047e, B:260:0x04bf, B:259:0x04bc, B:255:0x04b6), top: B:357:0x03b4, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:206:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:207:0x0400  */
    /* JADX WARN: Code duplicated, block: B:210:0x0411  */
    /* JADX WARN: Code duplicated, block: B:211:0x0413  */
    /* JADX WARN: Code duplicated, block: B:214:0x0424  */
    /* JADX WARN: Code duplicated, block: B:215:0x0426  */
    /* JADX WARN: Code duplicated, block: B:218:0x0436  */
    /* JADX WARN: Code duplicated, block: B:219:0x0438  */
    /* JADX WARN: Code duplicated, block: B:222:0x0449  */
    /* JADX WARN: Code duplicated, block: B:223:0x044b  */
    /* JADX WARN: Code duplicated, block: B:226:0x045c  */
    /* JADX WARN: Code duplicated, block: B:227:0x045e  */
    /* JADX WARN: Code duplicated, block: B:230:0x046f  */
    /* JADX WARN: Code duplicated, block: B:231:0x0471  */
    /* JADX WARN: Code duplicated, block: B:245:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:263:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:267:0x04e2 A[Catch: all -> 0x0594, TRY_LEAVE, TryCatch #11 {all -> 0x0594, blocks: (B:264:0x04d4, B:265:0x04dc, B:267:0x04e2, B:272:0x0505, B:281:0x055d), top: B:376:0x04d4 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:272:0x0505 A[Catch: all -> 0x0594, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x0594, blocks: (B:264:0x04d4, B:265:0x04dc, B:267:0x04e2, B:272:0x0505, B:281:0x055d), top: B:376:0x04d4 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x0515  */
    /* JADX WARN: Code duplicated, block: B:277:0x0533 A[Catch: all -> 0x04c0, LOOP:13: B:275:0x0517->B:277:0x0533, LOOP_END, TryCatch #0 {, blocks: (B:186:0x03b4, B:188:0x03bd, B:192:0x03c7, B:194:0x03cc, B:199:0x03db, B:240:0x0492, B:270:0x04f3, B:275:0x0517, B:277:0x0533, B:278:0x053a, B:238:0x047e, B:260:0x04bf, B:259:0x04bc, B:255:0x04b6), top: B:357:0x03b4, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x0559  */
    /* JADX WARN: Code duplicated, block: B:291:0x057a A[LOOP:12: B:265:0x04dc->B:291:0x057a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:302:0x05d4 A[Catch: all -> 0x0715, TRY_LEAVE, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:309:0x05ef A[Catch: all -> 0x0715, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:312:0x0603 A[Catch: all -> 0x0715, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:315:0x0623 A[Catch: all -> 0x0715, LOOP:16: B:313:0x061d->B:315:0x0623, LOOP_END, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x0643 A[Catch: all -> 0x0715, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:322:0x0663 A[Catch: all -> 0x0715, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:325:0x067f A[Catch: all -> 0x0715, LOOP:19: B:323:0x0679->B:325:0x067f, LOOP_END, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:329:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:331:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:333:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:334:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:337:0x0705 A[Catch: all -> 0x0715, TRY_ENTER, TryCatch #12 {all -> 0x0715, blocks: (B:114:0x0266, B:116:0x026c, B:117:0x026f, B:118:0x0285, B:121:0x029b, B:123:0x02ab, B:124:0x02ba, B:126:0x02c0, B:127:0x02c4, B:129:0x02d2, B:131:0x02d8, B:132:0x02dd, B:300:0x05ab, B:302:0x05d4, B:306:0x05dd, B:307:0x05e9, B:309:0x05ef, B:310:0x05fd, B:312:0x0603, B:313:0x061d, B:315:0x0623, B:316:0x0635, B:317:0x063d, B:319:0x0643, B:320:0x065d, B:322:0x0663, B:323:0x0679, B:325:0x067f, B:326:0x06a1, B:337:0x0705, B:338:0x0714), top: B:378:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:381:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x02d2 A[EDGE_INSN: B:408:0x02d2->B:129:0x02d2 BREAK  A[LOOP:6: B:118:0x0285->B:128:0x02cb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x04af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x0492 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0476 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x0498 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x049b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x053a A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:232:0x0472. Please report as an issue. */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l.C12187 mo2531() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1087.mo2531():l.ۨۜۧ");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        int i = 1147330187;
        int i2 = AbstractC0641.f2496;
        int i3 = C0773.f2792;
        int iM2761 = C0619.m2761("᩶ۨ") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-19683)) ^ 762171251;
        int i5 = -731576075;
        while (true) {
            i = ((((i ^ i3) * (-15375)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2022659528:
                case 1046354786:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0773.m3169("۟ۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4893)) ^ (-744966424);
                        i5 = -618170705;
                    } else {
                        iM2761 = C0773.m3169("ܺۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 24525) ^ (-1898228189);
                        i5 = -507923476;
                    }
                    break;
                case -1920555621:
                case -9918295:
                    break;
                case -1766472101:
                case 135753009:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("۟ۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4893)) ^ (-744966424);
                        i5 = -618170705;
                    } else {
                        iM2761 = C0773.m3169("ۚ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15925)) ^ (-1943544144);
                        i5 = 560341119;
                    }
                    break;
                case -1627809022:
                case -1585616256:
                    if (C1826.m6301() >= 0) {
                        iM2761 = C0773.m3169("֡᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12935)) ^ 131503289;
                        i5 = 1277472205;
                    } else {
                        iM2761 = C0773.m3169("۠᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3643) ^ 1281569352;
                        i5 = -1334543908;
                    }
                    break;
                case -1574770707:
                case -957222714:
                    RunnableC3646.m11813();
                    break;
                case -1554879544:
                case -1285848014:
                    C3033.m9845();
                    if (C4238.m13540() > 0) {
                        iM2761 = C0619.m2761("۫ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16119)) ^ 1698649256;
                        i5 = -927947389;
                    } else {
                        iM2761 = C0773.m3169("֡᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12935)) ^ 131503289;
                        i5 = 1277472205;
                    }
                    break;
                case -1413198166:
                case 1071159579:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0773.m3169("۟ۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4893)) ^ (-744966424);
                        i5 = -618170705;
                    } else {
                        iM2761 = (C0773.m3169("֨ܰ") ^ i2) * 49;
                        i4 = ((iM2761 ^ i3) * 21649) ^ 673748221;
                        i5 = -194938095;
                    }
                    break;
                case -1304336433:
                case 1408808456:
                    if (C1542.m5458(c12187)) {
                        iM2761 = C0773.m3169("ۛ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30053) ^ 1514986855;
                        i5 = 1648259996;
                    } else {
                        iM2761 = C0773.m3169("ᩴܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-19295)) ^ (-188274218);
                        i5 = 1975387748;
                    }
                    break;
                case -1033847916:
                case -162376288:
                    if (!C0862.m3503()) {
                        iM2761 = C0773.m3169("֡᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12935)) ^ 131503289;
                        i5 = 1277472205;
                    } else {
                        iM2761 = (C0773.m3169("֫ۚ") + i3) * 99;
                        i4 = ((iM2761 ^ i2) * (-14687)) ^ 224322656;
                        i5 = -522926438;
                    }
                    break;
                case 196785681:
                case 1898599663:
                    C0773.m3163(c8614, C1826.m6311(this.f3884));
                    c8614.m23216();
                    iM2761 = C0773.m3169("ᩴܳ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-19295)) ^ (-188274218);
                    i5 = 1975387748;
                    break;
                case 278974744:
                case 485082097:
                    if (m43863(c8614)) {
                        iM2761 = (i3 - C0619.m2761("᩵᩸")) * (-127);
                        i4 = ((iM2761 ^ i2) * 8339) ^ 377397474;
                        i5 = 1412199401;
                    } else {
                        iM2761 = C0773.m3169("ᩴܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-19295)) ^ (-188274218);
                        i5 = 1975387748;
                    }
                    break;
                case 516036066:
                case 1113976286:
                    AbstractC0116.m1243();
                    iM2761 = C0773.m3169("֡᩺") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-12935)) ^ 131503289;
                    i5 = 1277472205;
                    break;
                case 632422791:
                case 983630772:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("֡᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12935)) ^ 131503289;
                        i5 = 1277472205;
                    } else {
                        iM2761 = (C0619.m2761("᩶֡") ^ i2) * 45;
                        i4 = ((iM2761 ^ i3) * (-8749)) ^ 600983374;
                        i5 = 1873489236;
                    }
                    break;
                case 645582975:
                case 1668585935:
                    if (C3998.m12920()) {
                        iM2761 = C0619.m2761("ۡܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17611)) ^ 795474755;
                        i5 = 854620429;
                    } else {
                        iM2761 = (C0773.m3169("֫ۚ") + i3) * 99;
                        i4 = ((iM2761 ^ i2) * (-14687)) ^ 224322656;
                        i5 = -522926438;
                    }
                    break;
                case 1081007574:
                case 1280706280:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0619.m2761("۫ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16119)) ^ 1698649256;
                        i5 = -927947389;
                    } else {
                        iM2761 = (C0619.m2761("ᩳ֡") + i3) * (-53);
                        i4 = ((iM2761 ^ i2) * 7443) ^ (-117978689);
                        i5 = -629177953;
                    }
                    break;
                case 1142742435:
                case 1588831797:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("۫ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16119)) ^ 1698649256;
                        i5 = -927947389;
                    } else {
                        iM2761 = (C0773.m3169("۠֨") ^ i3) * 21;
                        i4 = ((iM2761 ^ i2) * (-435)) ^ 1698584897;
                        i5 = 1499286167;
                    }
                    break;
                case 1223270998:
                case 1802289345:
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0773.m3169("ܳ᩸") + i2) * (-75);
                        i4 = ((iM2761 ^ i3) * 18537) ^ 488795982;
                        i5 = -1857858217;
                    } else {
                        iM2761 = C0619.m2761("֫֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-23109)) ^ 45133224;
                        i5 = 1296454866;
                    }
                    break;
                case 1639985685:
                case 1722462539:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("۟ۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4893)) ^ (-744966424);
                        i5 = -618170705;
                    } else {
                        iM2761 = C0619.m2761("᩷۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31409)) ^ (-626057758);
                        i5 = -1397981480;
                    }
                    break;
                default:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0773.m3169("ܳ᩸") + i2) * (-75);
                        i4 = ((iM2761 ^ i3) * 18537) ^ 488795982;
                        i5 = -1857858217;
                    } else {
                        iM2761 = C0619.m2761("۫ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16119)) ^ 1698649256;
                        i5 = -927947389;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        Iterator itM4942 = null;
        AbstractC22044 abstractC22044 = null;
        AbstractC22044 abstractC22045 = null;
        int i = -1610101284;
        int i2 = RunnableC0334.f1808;
        int i3 = RunnableC3055.f9898;
        int iM2761 = (C0619.m2761("᩻᩵") ^ i3) * (-77);
        int i4 = ((iM2761 ^ i2) * 12699) ^ (-1595547174);
        int i5 = -1891041624;
        while (true) {
            i = ((((i ^ i2) * 17373) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2042679725:
                case 1614602662:
                    C3734.m12147(abstractC22044);
                    iM2761 = (i2 - C0619.m2761("ܿ۟")) * (-59);
                    i4 = ((iM2761 ^ i3) * (-7907)) ^ 1215591149;
                    i5 = -217014867;
                    break;
                case -2040595991:
                case 1644922227:
                    if (C1826.m6317(itM4942)) {
                        iM2761 = (C0619.m2761("֡ۤ") + i3) * 79;
                        i4 = ((iM2761 ^ i2) * (-22981)) ^ (-661476125);
                        i5 = -1544509169;
                    } else {
                        iM2761 = C0619.m2761("ۖۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-19477)) ^ (-112175648);
                        i5 = 446674931;
                    }
                    break;
                case -2030646722:
                case -392441152:
                    abstractC22044 = this.f3884;
                    if (abstractC22044 != null) {
                        iM2761 = C0619.m2761("ۚ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11763)) ^ 28717924;
                        i5 = 1814247177;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܿ۟")) * (-59);
                        i4 = ((iM2761 ^ i3) * (-7907)) ^ 1215591149;
                        i5 = -217014867;
                    }
                    break;
                case -1891764827:
                case 771925312:
                    C3779.m12264();
                    if (C1321.f4751 < 0) {
                        iM2761 = C0773.m3169("ۘ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16909)) ^ (-1345141250);
                        i5 = -135356893;
                    } else {
                        iM2761 = (C0773.m3169("۠ۘ") ^ i3) * 93;
                        i4 = ((iM2761 ^ i2) * (-25911)) ^ (-1800828184);
                        i5 = 781217824;
                    }
                    break;
                case -1730985273:
                case 313561757:
                    if (C17202.f56030) {
                        iM2761 = (C0773.m3169("֫᩷") ^ i2) * (-99);
                        i4 = ((iM2761 ^ i3) * 9965) ^ (-877199251);
                        i5 = 2093248421;
                    } else {
                        iM2761 = (C0773.m3169("۠᩶") + i3) * (-55);
                        i4 = ((iM2761 ^ i2) * 21081) ^ 681091669;
                        i5 = -1803164524;
                    }
                    break;
                case -1663503802:
                case 1686656839:
                    C3492.m11480((C22941) C0950.m3796(itM4942));
                    iM2761 = (C0619.m2761("ۘۙ") ^ i2) * (-25);
                    i4 = ((iM2761 ^ i3) * (-11341)) ^ 2141243592;
                    i5 = 1175172875;
                    break;
                case -1630687845:
                case 115338763:
                    if (C1146.m4231()) {
                        iM2761 = (C0619.m2761("ᩳ᩶") ^ i2) * 49;
                        i4 = ((iM2761 ^ i3) * (-24515)) ^ 770499647;
                        i5 = 1913032926;
                    } else {
                        iM2761 = C0773.m3169("ۘ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16909)) ^ (-1345141250);
                        i5 = -135356893;
                    }
                    break;
                case -1492753048:
                case 1764938624:
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0773.m3169("ۘ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16909)) ^ (-1345141250);
                        i5 = -135356893;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܺ᩷")) * (-123);
                        i4 = ((iM2761 ^ i2) * 17309) ^ 217769315;
                        i5 = 1565848731;
                    }
                    break;
                case -1173400839:
                case 1935697454:
                    if (C3734.m12152() < 0) {
                        iM2761 = (C0773.m3169("۠᩶") + i3) * (-55);
                        i4 = ((iM2761 ^ i2) * 21081) ^ 681091669;
                        i5 = -1803164524;
                    } else {
                        iM2761 = (C0773.m3169("ܺۢ") + i2) * q.h;
                        i4 = ((iM2761 ^ i3) * (-15815)) ^ 947795010;
                        i5 = 288526107;
                    }
                    break;
                case -1034831579:
                case 91199933:
                    C3998.m12920();
                    iM2761 = (C0773.m3169("۠ۘ") ^ i3) * 93;
                    i4 = ((iM2761 ^ i2) * (-25911)) ^ (-1800828184);
                    i5 = 781217824;
                    break;
                case -888250092:
                case -172162682:
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0773.m3169("۠ۘ") ^ i3) * 93;
                        i4 = ((iM2761 ^ i2) * (-25911)) ^ (-1800828184);
                        i5 = 781217824;
                    } else {
                        iM2761 = C0619.m2761("֡֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * 3327) ^ (-387386875);
                        i5 = -322720337;
                    }
                    break;
                case -760104125:
                case 790664185:
                    abstractC22045 = this.f3885;
                    if (abstractC22045 != null) {
                        iM2761 = C0773.m3169("ܽۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21685) ^ (-9642623);
                        i5 = -603244780;
                    } else {
                        iM2761 = C0773.m3169("᩶᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 369) ^ 349148378;
                        i5 = 666573115;
                    }
                    break;
                case -640050888:
                case 1035653479:
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("ۘ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16909)) ^ (-1345141250);
                        i5 = -135356893;
                    } else {
                        iM2761 = (C0619.m2761("۠ۢ") ^ i2) * 55;
                        i4 = ((iM2761 ^ i3) * (-12649)) ^ 36264215;
                        i5 = 1675506774;
                    }
                    break;
                case -402328248:
                case 1271587730:
                    if (C1080.m4050()) {
                        iM2761 = C0773.m3169("ۚܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-18137)) ^ 1393851663;
                        i5 = 391339969;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۢ") ^ i3) * 79;
                        i4 = ((iM2761 ^ i2) * 25677) ^ 92047118;
                        i5 = 1286626140;
                    }
                    break;
                case -271692195:
                case 1344701971:
                    if (C3448.m11248() != 0) {
                        iM2761 = (C0773.m3169("ܺۢ") + i2) * q.h;
                        i4 = ((iM2761 ^ i3) * (-15815)) ^ 947795010;
                        i5 = 288526107;
                    } else {
                        iM2761 = (C0619.m2761("ۛܽ") + i3) * 53;
                        i4 = ((iM2761 ^ i2) * 19713) ^ (-1503862749);
                        i5 = -1919828744;
                    }
                    break;
                case -247771830:
                case 559430945:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0773.m3169("᩸ۢ") ^ i3) * 79;
                        i4 = ((iM2761 ^ i2) * 25677) ^ 92047118;
                        i5 = 1286626140;
                    } else {
                        iM2761 = C0773.m3169("ۘܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 967) ^ 1236076677;
                        i5 = 655341360;
                    }
                    break;
                case -55099914:
                case 655801854:
                    if (AbstractC0641.m2813() > 0) {
                        iM2761 = (C0773.m3169("ܺۢ") + i2) * q.h;
                        i4 = ((iM2761 ^ i3) * (-15815)) ^ 947795010;
                        i5 = 288526107;
                    } else {
                        iM2761 = C0773.m3169("ۘ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16909)) ^ (-1345141250);
                        i5 = -135356893;
                    }
                    break;
                case 106833951:
                case 457022354:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0773.m3169("᩸ۢ") ^ i3) * 79;
                        i4 = ((iM2761 ^ i2) * 25677) ^ 92047118;
                        i5 = 1286626140;
                    } else {
                        iM2761 = C0773.m3169("ۙۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6117)) ^ (-189198769);
                        i5 = 1552807521;
                    }
                    break;
                case 290266488:
                case 1877294438:
                    itM4942 = C1343.m4942(this.f3886);
                    iM2761 = (C0619.m2761("ۘۙ") ^ i2) * (-25);
                    i4 = ((iM2761 ^ i3) * (-11341)) ^ 2141243592;
                    i5 = 1175172875;
                    break;
                case 302491959:
                case 1355753189:
                    C3734.m12147(this.f3883);
                    C1519.m5412();
                    break;
                case 378103263:
                case 581720364:
                    C3099.m10095();
                    break;
                case 543098034:
                case 907487145:
                    C3734.m12147(abstractC22045);
                    iM2761 = C0773.m3169("᩶᩹") ^ i2;
                    i4 = ((iM2761 ^ i3) * 369) ^ 349148378;
                    i5 = 666573115;
                    break;
                case 991641650:
                case 2122893253:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0773.m3169("۠ۘ") ^ i3) * 93;
                        i4 = ((iM2761 ^ i2) * (-25911)) ^ (-1800828184);
                        i5 = 781217824;
                    } else {
                        iM2761 = (C0773.m3169("ۢۜ") ^ i3) * 11;
                        i4 = ((iM2761 ^ i2) * 607) ^ 501411728;
                        i5 = 778951691;
                    }
                    break;
                default:
                    if (C1542.m5458(c12187)) {
                        iM2761 = (i2 - C0619.m2761("ܿ۟")) * (-59);
                        i4 = ((iM2761 ^ i3) * (-7907)) ^ 1215591149;
                        i5 = -217014867;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۬ܺ")) * 7;
                        i4 = ((iM2761 ^ i2) * (-18431)) ^ (-878084661);
                        i5 = -533562940;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x026c A[PHI: r1 r18 r19
      0x026c: PHI (r1v23 java.lang.String) = (r1v12 java.lang.String), (r1v19 java.lang.String), (r1v2 java.lang.String) binds: [B:65:0x026a, B:43:0x018b, B:12:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r18v12 short) = (r18v5 short), (r18v2 short), (r18v2 short) binds: [B:65:0x026a, B:43:0x018b, B:12:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r19v8 short) = (r19v3 short), (r19v2 short), (r19v2 short) binds: [B:65:0x026a, B:43:0x018b, B:12:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        short s;
        String str;
        int i;
        int i2;
        int iM3169;
        int i3;
        int iM31610;
        int i4;
        int iM2761;
        int i5;
        int i6;
        int i7 = C2354.f7599;
        int i8 = C2702.f8586;
        int iM31611 = (C0773.m3169("֨ۘ") ^ i7) * (-39);
        int i9 = ((iM31611 ^ i8) * 30527) ^ 504168479;
        String strM7761 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM31611 ^ 1475960540;
        int iM31612 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        int i16 = 0;
        int i17 = -153446423;
        int i18 = 0;
        String[] strArr = null;
        short[] sArr4 = null;
        int i19 = 0;
        String strM43840 = null;
        String strM9670 = null;
        while (true) {
            i17 = i10 ^ (i9 & (((i17 ^ i8) * (-29159)) >> 31));
            switch (i17) {
                case -1930730430:
                case 1978479253:
                    return C3734.m12148(C0773.m3169(C23916.m53420(sArr3, i12, i13, i14)) ^ 2126484847, strArr);
                case -1917866067:
                case 318961862:
                    strM7761 = C2288.m7761(sArr2, 350, 3, i14);
                    if (!C3077.f9998) {
                        s = s2;
                        iM3169 = (i7 - C0619.m2761("ܰ֡")) * (-33);
                        s2 = s;
                        i9 = ((iM3169 ^ i8) * (-18051)) ^ (-1292738920);
                        i3 = 472182118;
                        i10 = iM3169 ^ i3;
                    } else {
                        iM2761 = C0619.m2761("֨ۚ") ^ i7;
                        i5 = ((iM2761 ^ i8) * 10723) ^ 1714413804;
                        i6 = -304629642;
                        i10 = iM2761 ^ i6;
                        i9 = i5;
                    }
                    break;
                case -1890552416:
                case -1687246924:
                    if (i16 - (i18 * i18) > 0) {
                        iM2761 = C0773.m3169("᩻ۗ") ^ i8;
                        i5 = ((iM2761 ^ i7) * 31321) ^ 1378103925;
                        i6 = 1686500795;
                    } else {
                        iM2761 = (i8 - C0619.m2761("۠֫")) * (-93);
                        i5 = ((iM2761 ^ i7) * (-12939)) ^ (-1662573670);
                        i6 = -311619189;
                    }
                    i10 = iM2761 ^ i6;
                    i9 = i5;
                    break;
                case -1758122108:
                case 2090759761:
                    C2419.m8174();
                    if (C1343.f4799 == 0) {
                        iM2761 = (C0619.m2761("ۖۧ") + i8) * 67;
                        i5 = ((iM2761 ^ i7) * (-12141)) ^ 1382206098;
                        i6 = -1968438636;
                        i10 = iM2761 ^ i6;
                        i9 = i5;
                    } else {
                        str = strM9670;
                        iM31610 = (i8 - C0773.m3169("ۚܳ")) * (-57);
                        i = ((iM31610 ^ i7) * (-12447)) ^ 1947241368;
                        i4 = -1148188268;
                        i2 = iM31610 ^ i4;
                        String str2 = str;
                        i10 = i2;
                        i9 = i;
                        strM9670 = str2;
                    }
                    break;
                case -1716197220:
                case -1195736403:
                    C2702.m8876();
                    if (C2288.f7433 <= 0) {
                        s = s2;
                        iM3169 = (i7 - C0619.m2761("ܰ֡")) * (-33);
                        s2 = s;
                        i9 = ((iM3169 ^ i8) * (-18051)) ^ (-1292738920);
                        i3 = 472182118;
                        i10 = iM3169 ^ i3;
                    } else {
                        str = strM9670;
                        iM31610 = (i8 - C0773.m3169("ۚܳ")) * (-57);
                        i = ((iM31610 ^ i7) * (-12447)) ^ 1947241368;
                        i4 = -1148188268;
                        i2 = iM31610 ^ i4;
                        String str3 = str;
                        i10 = i2;
                        i9 = i;
                        strM9670 = str3;
                    }
                    break;
                case -1600219692:
                case -794761838:
                    i12 = 353;
                    i13 = 3;
                    if (RunnableC3055.f9898 < 0) {
                        iM2761 = (C0773.m3169("ۘ᩵") ^ i7) * (-79);
                        i5 = ((iM2761 ^ i8) * 17761) ^ (-220822410);
                        i6 = -17574209;
                        i10 = iM2761 ^ i6;
                        i9 = i5;
                    } else {
                        s = s2;
                        iM3169 = (i7 - C0619.m2761("ܰ֡")) * (-33);
                        s2 = s;
                        i9 = ((iM3169 ^ i8) * (-18051)) ^ (-1292738920);
                        i3 = 472182118;
                        i10 = iM3169 ^ i3;
                    }
                    break;
                case -1272605115:
                case -162178111:
                    strM43840 = m43840(strM9670);
                    sArr2 = f3882;
                    if (C4282.f15546 > 0) {
                        iM3169 = C0773.m3169("᩵ۘ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-7259)) ^ 828982048;
                        i3 = 1534010489;
                        i10 = iM3169 ^ i3;
                    } else {
                        str = strM9670;
                        iM31610 = (i8 - C0773.m3169("ۚܳ")) * (-57);
                        i = ((iM31610 ^ i7) * (-12447)) ^ 1947241368;
                        i4 = -1148188268;
                        i2 = iM31610 ^ i4;
                        String str4 = str;
                        i10 = i2;
                        i9 = i;
                        strM9670 = str4;
                    }
                    break;
                case -1068715641:
                case 1455132796:
                    str = strM9670;
                    sArr4 = f3882;
                    c = 345;
                    if (C4282.f15546 <= 0) {
                        iM31610 = (i8 - C0773.m3169("ۚܳ")) * (-57);
                        i = ((iM31610 ^ i7) * (-12447)) ^ 1947241368;
                        i4 = -1148188268;
                    } else {
                        iM31610 = (C0773.m3169("ᩴۜ") ^ i8) * (-5);
                        i = ((iM31610 ^ i7) * 22465) ^ 295777097;
                        i4 = 1373706161;
                    }
                    i2 = iM31610 ^ i4;
                    String str5 = str;
                    i10 = i2;
                    i9 = i;
                    strM9670 = str5;
                    break;
                case -1067755506:
                case -314331464:
                    strArr = new String[]{strM43840, AbstractC0116.m1244(iM31612 ^ i19)};
                    sArr3 = f3882;
                    if (!C1343.m4943()) {
                        s = s2;
                        iM3169 = (i7 - C0619.m2761("ܰ֡")) * (-33);
                        s2 = s;
                        i9 = ((iM3169 ^ i8) * (-18051)) ^ (-1292738920);
                        i3 = 472182118;
                        i10 = iM3169 ^ i3;
                    } else {
                        iM2761 = (C0773.m3169("ۧܺ") ^ i8) * 99;
                        i5 = ((iM2761 ^ i7) * 3649) ^ (-1134458277);
                        i6 = -1572982631;
                        i10 = iM2761 ^ i6;
                        i9 = i5;
                    }
                    break;
                case -1002718483:
                case 1781340264:
                    str = strM9670;
                    s2 = sArr4[c];
                    s3 = 22096;
                    if (!C2023.f6737) {
                        iM31610 = C0773.m3169("᩸ᩳ") ^ i7;
                        i = ((iM31610 ^ i8) * 16045) ^ (-828115774);
                        i4 = -24020607;
                        i2 = iM31610 ^ i4;
                        String str6 = str;
                        i10 = i2;
                        i9 = i;
                        strM9670 = str6;
                    } else {
                        strM9670 = str;
                        iM2761 = C0619.m2761("֫۟") ^ i7;
                        i5 = ((iM2761 ^ i8) * (-1983)) ^ (-2089443475);
                        i6 = 123048064;
                        i10 = iM2761 ^ i6;
                        i9 = i5;
                    }
                    break;
                case -900086562:
                case 753412539:
                    i14 = 44901;
                    iM2761 = (C0619.m2761("۟ۗ") ^ i7) * (-49);
                    i5 = ((iM2761 ^ i8) * (-25859)) ^ (-2074232895);
                    i6 = 789797667;
                    i10 = iM2761 ^ i6;
                    i9 = i5;
                    break;
                case -294123165:
                case 1861369578:
                    i16 = s2 * s3;
                    s = s2;
                    int i20 = s + 5524;
                    if (AbstractC0641.f2496 < 0) {
                        s2 = s;
                        int iM31613 = C0773.m3169("ۜ᩵") ^ i7;
                        str = strM9670;
                        i = ((iM31613 ^ i8) * 8647) ^ (-718006489);
                        i2 = iM31613 ^ 523277097;
                        i18 = i20;
                        String str7 = str;
                        i10 = i2;
                        i9 = i;
                        strM9670 = str7;
                    } else {
                        i18 = i20;
                        iM3169 = (i7 - C0619.m2761("ܰ֡")) * (-33);
                        s2 = s;
                        i9 = ((iM3169 ^ i8) * (-18051)) ^ (-1292738920);
                        i3 = 472182118;
                        i10 = iM3169 ^ i3;
                    }
                    break;
                case -78899294:
                case 2109147092:
                    iM31612 = C0773.m3169(strM7761);
                    i19 = 2101695859;
                    if (C3077.f9998) {
                        iM2761 = (C0773.m3169("᩵᩶") + i7) * 109;
                        i5 = ((iM2761 ^ i8) * 26371) ^ 1115930517;
                        i6 = -1760615835;
                    } else {
                        iM2761 = (C0619.m2761("᩸᩶") ^ i8) * 81;
                        i5 = ((iM2761 ^ i7) * 18493) ^ 1483207963;
                        i6 = 1376259919;
                    }
                    i10 = iM2761 ^ i6;
                    i9 = i5;
                    break;
                case 379088820:
                case 2140399731:
                    C1321.m4852();
                    C3033.m9845();
                    str = strM9670;
                    iM31610 = (i8 - C0773.m3169("ۚܳ")) * (-57);
                    i = ((iM31610 ^ i7) * (-12447)) ^ 1947241368;
                    i4 = -1148188268;
                    i2 = iM31610 ^ i4;
                    String str8 = str;
                    i10 = i2;
                    i9 = i;
                    strM9670 = str8;
                    break;
                case 572807598:
                case 1919195931:
                    sArr = f3882;
                    i15 = 346;
                    i11 = 4;
                    if (AbstractC0116.f1064 > 0) {
                        iM2761 = C0773.m3169("ۙ᩻") ^ i8;
                        i5 = ((iM2761 ^ i7) * 1699) ^ (-42525101);
                        i6 = 327816647;
                        i10 = iM2761 ^ i6;
                        i9 = i5;
                    } else {
                        s = s2;
                        iM3169 = (i7 - C0619.m2761("ܰ֡")) * (-33);
                        s2 = s;
                        i9 = ((iM3169 ^ i8) * (-18051)) ^ (-1292738920);
                        i3 = 472182118;
                        i10 = iM3169 ^ i3;
                    }
                    break;
                case 593561014:
                case 2140723815:
                    if (C2702.m8876()) {
                        iM2761 = (C0619.m2761("ۖۧ") + i8) * 67;
                        i5 = ((iM2761 ^ i7) * (-12141)) ^ 1382206098;
                        i6 = -1968438636;
                    } else {
                        iM2761 = C0619.m2761("֫۟") ^ i7;
                        i5 = ((iM2761 ^ i8) * (-1983)) ^ (-2089443475);
                        i6 = 123048064;
                    }
                    i10 = iM2761 ^ i6;
                    i9 = i5;
                    break;
                case 1113794912:
                case 1541676217:
                    strM9670 = C2966.m9670(sArr, i15, i11, i14);
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("֫۟") ^ i7;
                        i5 = ((iM2761 ^ i8) * (-1983)) ^ (-2089443475);
                        i6 = 123048064;
                    } else {
                        iM2761 = C0773.m3169("۟ۡ") ^ i7;
                        i5 = ((iM2761 ^ i8) * 22831) ^ (-652168362);
                        i6 = 608519223;
                    }
                    i10 = iM2761 ^ i6;
                    i9 = i5;
                    break;
                case 1567120888:
                case 1624492509:
                    i14 = 16505;
                    iM2761 = (C0619.m2761("۟ۗ") ^ i7) * (-49);
                    i5 = ((iM2761 ^ i8) * (-25859)) ^ (-2074232895);
                    i6 = 789797667;
                    i10 = iM2761 ^ i6;
                    i9 = i5;
                    break;
                default:
                    C1564.m5509();
                    return null;
            }
        }
    }
}
