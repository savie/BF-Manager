package l;

import android.R;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.InputStream;
import moe.shizuku.server.IShizukuApplication;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܿۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06A0 */
/* JADX INFO: loaded from: classes5.dex */
public class C18240 extends AbstractC16610 {

    /* JADX INFO: renamed from: ۗۤ֡, reason: not valid java name and contains not printable characters */
    private static final short[] f59539 = {8389, -5826, -5838, -5827, -5830, -5835, -5834, -5856, -5849, -5838, -5853, -5853, -5825, -5830, -5840, -5838, -5849, -5830, -5828, -5827, -5885, -5838, -5840, -5832, -5838, -5836, -5834, -5773, -5827, -5838, -5826, -5834, -5773, -5830, -5856, -5773, -5827, -5850, -5825, -5825, -5763, -5853, -5838, -5840, -5832, -5838, -5836, -5834, -5830, -5833, -5862, -5827, -5833, -5834, -5845, -5773, -5778, -5778, -5773, -5762, -5790, -5838, -5827, -5833, -5855, -5828, -5830, -5833, -5763, -5838, -5853, -5853, -5763, -5870, -5853, -5853, -5825, -5830, -5840, -5838, -5849, -5830, -5828, -5827, -5763, -5857, -5784, -5829, -5849, -5849, -5853, -5783, -5764, -5764, -5856, -5840, -5829, -5834, -5826, -5838, -5856, -5763, -5838, -5827, -5833, -5855, -5828, -5830, -5833, -5763, -5840, -5828, -5826, -5764, -5838, -5853, -5832, -5764, -5855, -5834, -5856, -5764, -5838, -5827, -5833, -5855, -5828, -5830, -5833, 7880, 13047, -9440, 8360, -11596, 2827, 15817, 1584, 1528, 1527, 1522, 1531, 1521, 1516, 1527, 1529, 1527, 1520, 1500, 1511, 1518, 1535, 1517, 1517, 1533, 1522, 1535, 1517, 1517, 1488, 1535, 1523, 1531, 1522, 1527, 1532, 1516, 1535, 1516, 1511, 1488, 1535, 1523, 1531, 1521, 1516, 1527, 1529, 1527, 1520, 1486, 1535, 1514, 1526, 1531, 1510, 1514, 1516, 1535, 1533, 1514, 1486, 1535, 1514, 1526, 1525, 1531, 1531, 1518, 1503, 1518, 1525, 1485, 1527, 1529, 1500, 1522, 1521, 1533, 1525, 1456, 1514, 1523, 1518, 1503, 1520, 1530, 1516, 1521, 1527, 1530, 1491, 1535, 1520, 1527, 1528, 1531, 1517, 1514, 1456, 1510, 1523, 1522, 1503, 1486, 1493, 1470, 1520, 1521, 1514, 1470, 1517, 1527, 1529, 1520, 1531, 1530, 1490, 1445, 21026, -29734, 28450, 1473, 1525, 1527, 1522, 1522, 1490, 1535, 1520, 1530, 1516, 1521, 1527, 1530, 1457, 1535, 1518, 1518, 1457, 1503, 1518, 1518, 1522, 1527, 1533, 1535, 1514, 1527, 1521, 1520, 1445, 1457, 1535, 1517, 1517, 1531, 1514, 1517, 1457, 1525, 1527, 1522, 1522, 1531, 1516, 1473, 1530, 1531, 1510, 1498, 1515, 1518, 1522, 1527, 1533, 1535, 1514, 1531, 1470, 1533, 1522, 1535, 1517, 1517, 1531, 1517, 1444, 1470, 31888, -31066, 29358, 1522, 1527, 1532, 1485, 1527, 1529, 1520, 1535, 1514, 1515, 1516, 1531, 1493, 1527, 1522, 1522, 1531, 1516, 1456, 1517, 1521, -32338, 25582, -24842, 1457, 1535, 1517, 1517, 1531, 1514, 1517, 1457, 1525, 1527, 1522, 1522, 1531, 1516, 1473, 1535, 1516, 1523, 1456, 1517, 1521, 1522, 1527, 1532, 1457, 1535, 1516, 1523, 1531, 1535, 1532, 1527, 1457, 1522, 1527, 1532, 1457, 1535, 1516, 1523, 1531, 1535, 1532, 1527, 1457, 1522, 1527, 1532, 1522, 1527, 1532, 1457, 1535, 1516, 1523, 1531, 1535, 1532, 1527, 1459, 1512, 1449, 1535, 1457, 1522, 1527, 1532, 1457, 1535, 1516, 1523, 1531, 1535, 1532, 1527, 1459, 1512, 1449, 1535, 1457, 1522, 1527, 1532, 1522, 1527, 1532, 1457, 1535, 1516, 1523, 1448, 1450, 1459, 1512, 1446, 1535, 1457, 1522, 1527, 1532, 22548, -27721, -30000, 1522, 1527, 1532, 1457, 1510, 1446, 1448, 1457, 1522, 1527, 1532, 1522, 1527, 1532, 1457, 1535, 1516, 1523, 1448, 1450, 1459, 1512, 1446, 1535, 1457, 1522, 1527, 1532, 1457, 1510, 1446, 1448, 1473, 1448, 1450, 1457, 1522, 1527, 1532, 1522, 1527, 1532, 1457, 1510, 1446, 1448, 1457, 1457, 1535, 1517, 1517, 1531, 1514, 1517, 1457, 1525, 1527, 1522, 1522, 1531, 1516, 1473, 1535, 1448, 1450, 1522, 1527, 1532, 1457, 1510, 1446, 1448, 1473, 1448, 1450, 1457, 1457, 1535, 1517, 1517, 1531, 1514, 1517, 1457, 1525, 1527, 1522, 1522, 1531, 1516, 1473, 1510, 1446, 1448, 1457, 1535, 1517, 1517, 1531, 1514, 1517, 1457, 1525, 1527, 1522, 1522, 1531, 1516, 1473, 1510, 1448, 1450, 5104, -28188, -28181, -28178, -28185, 4828, -7063, 4466, 6788, -2880, -7351};

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f59540;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f59541;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public String f59542;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public String f59543;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public String f59544;

    /* JADX WARN: Code duplicated, block: B:53:0x01b2 A[PHI: r6 r7 r8
      0x01b2: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:52:0x01b0, B:48:0x018f, B:12:0x0058, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:52:0x01b0, B:48:0x018f, B:12:0x0058, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r8v3 short) = (r8v1 short), (r8v2 short), (r8v1 short), (r8v1 short) binds: [B:52:0x01b0, B:48:0x018f, B:12:0x0058, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e8 A[PHI: r5 r20
      0x01e8: PHI (r5v3 short) = (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:56:0x01e6, B:32:0x00da, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r20v2 int) = (r20v1 int), (r20v1 int), (r20v4 int) binds: [B:56:0x01e6, B:32:0x00da, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021b A[PHI: r4
      0x021b: PHI (r4v3 char) = (r4v2 char), (r4v1 char), (r4v1 char), (r4v1 char) binds: [B:60:0x0219, B:18:0x0078, B:15:0x005e, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x024b A[PHI: r2 r10 r11 r12 r13 r14 r15 r21
      0x024b: PHI (r2v4 java.lang.String) = 
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v3 java.lang.String)
      (r2v1 java.lang.String)
     binds: [B:64:0x0249, B:37:0x0117, B:28:0x00b4, B:24:0x0093, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:64:0x0249, B:37:0x0117, B:28:0x00b4, B:24:0x0093, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:64:0x0249, B:37:0x0117, B:28:0x00b4, B:24:0x0093, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:64:0x0249, B:37:0x0117, B:28:0x00b4, B:24:0x0093, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r13v3 short[]) = (r13v1 short[]), (r13v1 short[]), (r13v2 short[]), (r13v1 short[]), (r13v1 short[]) binds: [B:64:0x0249, B:37:0x0117, B:28:0x00b4, B:24:0x0093, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r14v3 int) = (r14v1 int), (r14v1 int), (r14v2 int), (r14v1 int), (r14v1 int) binds: [B:64:0x0249, B:37:0x0117, B:28:0x00b4, B:24:0x0093, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r15v3 int) = (r15v1 int), (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int) binds: [B:64:0x0249, B:37:0x0117, B:28:0x00b4, B:24:0x0093, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r21v5 short[]) = (r21v4 short[]), (r21v3 short[]), (r21v3 short[]), (r21v3 short[]), (r21v3 short[]) binds: [B:64:0x0249, B:37:0x0117, B:28:0x00b4, B:24:0x0093, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        int iM2761;
        int i;
        int i2;
        String strM4222 = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -752620593;
        int i11 = AbstractC3624.f12429;
        int i12 = C23916.f77426;
        int iM3169 = C0773.m3169("᩺ܿ") ^ i11;
        int i13 = ((iM3169 ^ i12) * 13181) ^ 1105246364;
        int i14 = iM3169 ^ 1010664052;
        short[] sArr3 = null;
        int iM31610 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 3391) >> 31));
            switch (i10) {
                case -2067906077:
                case 296089025:
                    c = 129;
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("᩶ۜ") ^ i11;
                        i = ((iM2761 ^ i12) * (-25683)) ^ 131098447;
                        i2 = -89855544;
                    } else {
                        iM2761 = C0619.m2761("ۖܰ") ^ i11;
                        i = ((iM2761 ^ i12) * 24285) ^ (-759638357);
                        i2 = 488130205;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1816831201:
                case 392336063:
                    strM4222 = C1146.m4222(sArr2, i8, i9, i5);
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("ۤ᩺") + i12) * (-115);
                        i = ((iM2761 ^ i11) * 26741) ^ (-228985943);
                        i2 = 2021817120;
                    } else {
                        iM2761 = C0619.m2761("ۚ᩸") ^ i12;
                        i = ((iM2761 ^ i11) * (-4151)) ^ (-249915506);
                        i2 = 1327876517;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1681603378:
                case -1323819090:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("᩶ۜ") ^ i11;
                        i = ((iM2761 ^ i12) * (-25683)) ^ 131098447;
                        i2 = -89855544;
                    } else {
                        iM2761 = C0773.m3169("᩷ܽ") ^ i12;
                        i = ((iM2761 ^ i11) * 24793) ^ 604696188;
                        i2 = 1014313648;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1664227047:
                case -1320486620:
                    C2878.m9491();
                    break;
                case -827289618:
                case 1740307688:
                    int i15 = s + s2;
                    if (i4 - (i15 * i15) <= 0) {
                        iM2761 = (C0619.m2761("ᩴۧ") ^ i12) * 101;
                        i = ((iM2761 ^ i11) * (-24483)) ^ (-1028583666);
                        i2 = 2141719195;
                    } else {
                        iM2761 = (i12 - C0619.m2761("֨ᩴ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2761 ^ i11) * (-13239)) ^ 1494993380;
                        i2 = 1773522543;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -622375399:
                case -417299583:
                    i3 = s * 2;
                    if (C2485.m8357() <= 0) {
                        iM2761 = (C0619.m2761("֡ܶ") + i11) * 63;
                        i = ((iM2761 ^ i12) * 15609) ^ (-791207553);
                        i2 = 512909807;
                    } else {
                        iM2761 = C0619.m2761("۠ۨ") ^ i12;
                        i = ((iM2761 ^ i11) * 18637) ^ (-2037544282);
                        i2 = 2074809685;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -510889735:
                case 298868257:
                    i5 = 19515;
                    iM2761 = (C0619.m2761("֨᩻") ^ i11) * 27;
                    i = ((iM2761 ^ i12) * (-25849)) ^ (-869298736);
                    i2 = 1517112139;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -299157678:
                case 2010355131:
                    sArr3 = f59539;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0773.m3169("ۤ᩺") + i12) * (-115);
                        i = ((iM2761 ^ i11) * 26741) ^ (-228985943);
                        i2 = 2021817120;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۗ") ^ i12) * 53;
                        i = ((iM2761 ^ i11) * 20627) ^ 1036024791;
                        i2 = 567297116;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -295511893:
                case 1159831106:
                    i5 = 21203;
                    iM2761 = (C0619.m2761("֨᩻") ^ i11) * 27;
                    i = ((iM2761 ^ i12) * (-25849)) ^ (-869298736);
                    i2 = 1517112139;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -293898017:
                case 1983360655:
                    if (C3690.f12684 > 0) {
                        iM2761 = (C0619.m2761("֡ܶ") + i11) * 63;
                        i = ((iM2761 ^ i12) * 15609) ^ (-791207553);
                        i2 = 512909807;
                    } else {
                        iM2761 = (C0773.m3169("ۤ᩺") + i12) * (-115);
                        i = ((iM2761 ^ i11) * 26741) ^ (-228985943);
                        i2 = 2021817120;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -282858986:
                case 110451328:
                    RunnableC3646.m11813();
                    iM2761 = C0619.m2761("᩶ۜ") ^ i11;
                    i = ((iM2761 ^ i12) * (-25683)) ^ 131098447;
                    i2 = -89855544;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -201858404:
                case 266825435:
                    C1080.m4050();
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0619.m2761("᩶ۜ") ^ i11;
                        i = ((iM2761 ^ i12) * (-25683)) ^ 131098447;
                        i2 = -89855544;
                    } else {
                        iM2761 = (C0619.m2761("֡ܶ") + i11) * 63;
                        i = ((iM2761 ^ i12) * 15609) ^ (-791207553);
                        i2 = 512909807;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 284765533:
                case 1324114684:
                    sArr2 = f59539;
                    i8 = 133;
                    i9 = 3;
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0773.m3169("ۤ᩺") + i12) * (-115);
                        i = ((iM2761 ^ i11) * 26741) ^ (-228985943);
                        i2 = 2021817120;
                    } else {
                        iM2761 = (C0773.m3169("֨֨") + i11) * 79;
                        i = ((iM2761 ^ i12) * 22949) ^ 1370510688;
                        i2 = 2030750953;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 983497547:
                case 1484493800:
                    sArr = f59539;
                    i6 = 130;
                    i7 = 3;
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = (C0773.m3169("ۤ᩺") + i12) * (-115);
                        i = ((iM2761 ^ i11) * 26741) ^ (-228985943);
                        i2 = 2021817120;
                    } else {
                        iM2761 = C0773.m3169("۫᩹") ^ i12;
                        i = ((iM2761 ^ i11) * (-1309)) ^ (-540193654);
                        i2 = -660138351;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 1095277259:
                case 1630807849:
                    i4 = i3 + 1;
                    s2 = 1;
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("֡ܶ") + i11) * 63;
                        i = ((iM2761 ^ i12) * 15609) ^ (-791207553);
                        i2 = 512909807;
                    } else {
                        iM2761 = (C0773.m3169("᩶ۚ") + i11) * (-63);
                        i = ((iM2761 ^ i12) * (-22433)) ^ 1484281614;
                        i2 = 678188934;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 1219062129:
                case 1975940333:
                    m43859(C0619.m2761(strM4222) ^ 2130663314);
                    break;
                case 1350818590:
                case 1920666325:
                    C3033.m9854(this, iM31610 ^ 2120747821);
                    if (C20932.f66974 <= 0) {
                        iM2761 = (i11 - C0619.m2761("֡ܿ")) * (-121);
                        i = ((iM2761 ^ i12) * (-27773)) ^ (-798447594);
                        i2 = -213431157;
                    } else {
                        iM2761 = (C0619.m2761("᩷֨") ^ i12) * q.h;
                        i = ((iM2761 ^ i11) * 28539) ^ 1006318202;
                        i2 = -1351963722;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 1458943565:
                case 2111555464:
                    s = sArr3[c];
                    if (C1343.m4943()) {
                        iM2761 = C0773.m3169("᩵֨") ^ i11;
                        i = ((iM2761 ^ i12) * (-10919)) ^ 777979951;
                        i2 = -1395748456;
                    } else {
                        iM2761 = (i11 - C0619.m2761("֡ܿ")) * (-121);
                        i = ((iM2761 ^ i12) * (-27773)) ^ (-798447594);
                        i2 = -213431157;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                default:
                    iM31610 = C0773.m3169(C1146.m4222(sArr, i6, i7, i5));
                    if (C0619.f2439) {
                        iM2761 = (i11 - C0619.m2761("֡ܿ")) * (-121);
                        i = ((iM2761 ^ i12) * (-27773)) ^ (-798447594);
                        i2 = -213431157;
                    } else {
                        iM2761 = (i11 - C0773.m3169("ܰ᩺")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2761 ^ i12) * (-32161)) ^ 349578209;
                        i2 = -25994411;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46057;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0185 A[PHI: r1
      0x0185: PHI (r1v7 java.lang.String) = (r1v4 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:41:0x0183, B:14:0x0075, B:88:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0231 A[PHI: r7 r8 r11 r12 r22
      0x0231: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:56:0x022f, B:52:0x0210, B:21:0x0096, B:7:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:56:0x022f, B:52:0x0210, B:21:0x0096, B:7:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:56:0x022f, B:52:0x0210, B:21:0x0096, B:7:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r12v4 short) = (r12v2 short), (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:56:0x022f, B:52:0x0210, B:21:0x0096, B:7:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r22v5 int) = (r22v4 int), (r22v3 int), (r22v3 int), (r22v3 int) binds: [B:56:0x022f, B:52:0x0210, B:21:0x0096, B:7:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0281 A[PHI: r3 r4 r9 r15 r16 r17
      0x0281: PHI (r3v4 java.lang.String[]) = 
      (r3v2 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v3 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v2 java.lang.String[])
     binds: [B:64:0x027f, B:60:0x0261, B:33:0x011e, B:25:0x00c0, B:14:0x0075, B:7:0x0062, B:5:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r4v5 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v4 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:64:0x027f, B:60:0x0261, B:33:0x011e, B:25:0x00c0, B:14:0x0075, B:7:0x0062, B:5:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:64:0x027f, B:60:0x0261, B:33:0x011e, B:25:0x00c0, B:14:0x0075, B:7:0x0062, B:5:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:64:0x027f, B:60:0x0261, B:33:0x011e, B:25:0x00c0, B:14:0x0075, B:7:0x0062, B:5:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x027f, B:60:0x0261, B:33:0x011e, B:25:0x00c0, B:14:0x0075, B:7:0x0062, B:5:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:64:0x027f, B:60:0x0261, B:33:0x011e, B:25:0x00c0, B:14:0x0075, B:7:0x0062, B:5:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        int iM3169;
        int i;
        int i2;
        int i3 = C3492.f12043;
        int i4 = C4238.f15451;
        int iM2761 = (C0619.m2761("᩹ۡ") ^ i3) * 59;
        int i5 = ((iM2761 ^ i4) * (-8743)) ^ (-1365077015);
        String strM3780 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ (-1863412581);
        int iM31610 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        char c = 0;
        int i11 = -1231752636;
        int i12 = 0;
        String[] strArr = null;
        short[] sArr3 = null;
        int i13 = 0;
        String strM43840 = null;
        String strM9670 = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * (-28587)) >> 31));
            switch (i11) {
                case -2081960309:
                case 158539616:
                    sArr = f59539;
                    c = 560;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0619.m2761("ۙ۬") + i3) * (-51);
                        i = ((iM3169 ^ i4) * 1197) ^ (-1994928727);
                        i2 = -1186688277;
                    } else {
                        iM3169 = (C0773.m3169("ܿۧ") + i4) * (-77);
                        i = ((iM3169 ^ i3) * 14055) ^ (-534107806);
                        i2 = -418497140;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2019168249:
                case -422593026:
                    strArr = new String[]{strM43840, AbstractC0116.m1244(iM31610 ^ i7)};
                    sArr2 = f59539;
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("ۙ۬") + i3) * (-51);
                        i = ((iM3169 ^ i4) * 1197) ^ (-1994928727);
                        i2 = -1186688277;
                    } else {
                        iM3169 = C0773.m3169("ᩳ᩹") ^ i3;
                        i = ((iM3169 ^ i4) * 27157) ^ (-1242343811);
                        i2 = 861054361;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1950622570:
                case -308975087:
                    iM31610 = C0773.m3169(strM3780);
                    i7 = 2129258850;
                    if (C2834.m9344() >= 0) {
                        iM3169 = (C0773.m3169("ܶ۟") + i4) * (-77);
                        i = ((iM3169 ^ i3) * (-32371)) ^ (-1415411080);
                        i2 = 146045895;
                    } else {
                        iM3169 = C0619.m2761("ܿܶ") ^ i4;
                        i = ((iM3169 ^ i3) * (-5399)) ^ (-1391827978);
                        i2 = 1350067968;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1675711583:
                case 190724142:
                    i12 = s * 2;
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0619.m2761("᩺֨") ^ i3;
                        i = ((iM3169 ^ i4) * 12489) ^ 1854984030;
                        i2 = -1189285551;
                    } else {
                        iM3169 = (C0773.m3169("᩶᩸") + i3) * (-89);
                        i = ((iM3169 ^ i4) * 847) ^ (-1545466743);
                        i2 = 1930580356;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1623757088:
                case -809284618:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("ۙ۬") + i3) * (-51);
                        i = ((iM3169 ^ i4) * 1197) ^ (-1994928727);
                        i2 = -1186688277;
                    } else {
                        iM3169 = C0773.m3169("ۨۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-859)) ^ (-378889940);
                        i2 = 98811560;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1427548170:
                case -99657002:
                    C20932.m47848();
                    if (C0950.f3488 < 0) {
                        int iM31611 = (C0773.m3169("ܶ֨") + i3) * (-11);
                        i5 = ((iM31611 ^ i4) * 8449) ^ (-1731129336);
                        i6 = iM31611 ^ (-1150679849);
                    } else {
                        iM3169 = C0773.m3169("ۨۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-859)) ^ (-378889940);
                        i2 = 98811560;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1231674053:
                case -288480964:
                    strM43840 = m43840(strM9670);
                    sArr3 = f59539;
                    if (C2702.f8586 > 0) {
                        iM3169 = (i4 - C0773.m3169("ܰ᩶")) * 123;
                        i = ((iM3169 ^ i3) * 15135) ^ 353243364;
                        i2 = -2111500167;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM31612 = (C0773.m3169("ܶ֨") + i3) * (-11);
                        i5 = ((iM31612 ^ i4) * 8449) ^ (-1731129336);
                        i6 = iM31612 ^ (-1150679849);
                    }
                    break;
                case -1124627929:
                case 1065707599:
                    C3492.m11488();
                    return null;
                case -788594507:
                case 547845942:
                    i8 = 568;
                    i9 = 3;
                    if (C2310.m7813() <= 0) {
                        iM3169 = C0619.m2761("᩺֨") ^ i3;
                        i = ((iM3169 ^ i4) * 12489) ^ 1854984030;
                        i2 = -1189285551;
                    } else {
                        iM3169 = (C0773.m3169("ۤۨ") ^ i4) * (-127);
                        i = ((iM3169 ^ i3) * 25299) ^ 1668108403;
                        i2 = 1627251600;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -726712125:
                case 1250440209:
                    i13 = 37250;
                    iM3169 = C0619.m2761("֫ۜ") ^ i3;
                    i = ((iM3169 ^ i4) * (-16871)) ^ 2132060892;
                    i2 = 311189338;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -309146801:
                case 1826302251:
                    s = sArr[c];
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0619.m2761("ۙ۬") + i3) * (-51);
                        i = ((iM3169 ^ i4) * 1197) ^ (-1994928727);
                        i2 = -1186688277;
                    } else {
                        iM3169 = C0619.m2761("᩻۟") ^ i3;
                        i = ((iM3169 ^ i4) * 11985) ^ 1951587563;
                        i2 = -1880421204;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -96139984:
                case 638006591:
                    i13 = 47721;
                    iM3169 = C0619.m2761("֫ۜ") ^ i3;
                    i = ((iM3169 ^ i4) * (-16871)) ^ 2132060892;
                    i2 = 311189338;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 24802562:
                case 624883671:
                    strM9670 = C2966.m9670(f59539, 561, 4, i13);
                    if (C2878.m9491() <= 0) {
                        iM3169 = C0773.m3169("ۨۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-859)) ^ (-378889940);
                        i2 = 98811560;
                    } else {
                        iM3169 = C0619.m2761("֡ܶ") ^ i4;
                        i = ((iM3169 ^ i3) * 16773) ^ 950083886;
                        i2 = 2207143;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 36255441:
                case 718228090:
                    C1826.m6301();
                    if (C1542.f5343 > 0) {
                        iM3169 = (C0619.m2761("ۙ۬") + i3) * (-51);
                        i = ((iM3169 ^ i4) * 1197) ^ (-1994928727);
                        i2 = -1186688277;
                    } else {
                        iM3169 = C0619.m2761("᩺֨") ^ i3;
                        i = ((iM3169 ^ i4) * 12489) ^ 1854984030;
                        i2 = -1189285551;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 156418082:
                case 976939197:
                    return C17202.m40366(C0773.m3169(C0950.m3780(sArr2, i8, i9, i13)) ^ 2097454265, strArr);
                case 545111716:
                case 1270320744:
                    strM3780 = C0950.m3780(sArr3, 565, 3, i13);
                    if (C0619.f2439) {
                        iM3169 = (C0619.m2761("ۙ۬") + i3) * (-51);
                        i = ((iM3169 ^ i4) * 1197) ^ (-1994928727);
                        i2 = -1186688277;
                    } else {
                        iM3169 = C0619.m2761("ۡ᩹") ^ i3;
                        i = ((iM3169 ^ i4) * (-29103)) ^ 1390948191;
                        i2 = -27059872;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 604611100:
                case 2098154793:
                    i10 = i12 + 1;
                    s2 = 1;
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("᩺֨") ^ i3;
                        i = ((iM3169 ^ i4) * 12489) ^ 1854984030;
                        i2 = -1189285551;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܽ۬")) * 19;
                        i = ((iM3169 ^ i3) * (-16693)) ^ 1465877273;
                        i2 = -956598785;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1232284369:
                case 1949262821:
                    int i14 = s + s2;
                    if ((i14 * i14) - i10 < 0) {
                        iM3169 = (i4 - C0773.m3169("ᩳܶ")) * (-103);
                        i = ((iM3169 ^ i3) * 13983) ^ (-649969138);
                        i2 = -2016007514;
                    } else {
                        iM3169 = (C0773.m3169("ܽᩴ") ^ i3) * (-67);
                        i = ((iM3169 ^ i4) * 9769) ^ 1552718773;
                        i2 = -1945406921;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    C3998.m12920();
                    AbstractC0116.m1243();
                    iM3169 = (C0619.m2761("ۙ۬") + i3) * (-51);
                    i = ((iM3169 ^ i4) * 1197) ^ (-1994928727);
                    i2 = -1186688277;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 137221. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final l.C12187 mo2531() {
        /*
            Method dump skipped, instruction units count: 13722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18240.mo2531():l.ۨۜۧ");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        AbstractC22044 abstractC22044 = null;
        AbstractC22044 abstractC22045 = null;
        int i = 833384920;
        int i2 = C3448.f11240;
        int i3 = C0487.f2131;
        int iM2761 = (C0619.m2761("ᩴۤ") + i2) * 43;
        int i4 = ((iM2761 ^ i3) * IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation) ^ (-2033730003);
        int i5 = -1998418096;
        while (true) {
            i = ((((i ^ i3) * (-14287)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1945167518:
                case 999288453:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("֡֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-809)) ^ 2098424944;
                        i5 = 20624791;
                    } else {
                        iM2761 = C0619.m2761("᩹ۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10635) ^ 1815147812;
                        i5 = -1179541154;
                    }
                    break;
                case -1896650933:
                case 2136144878:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (i2 - C0619.m2761("᩵ۗ")) * 97;
                        i4 = ((iM2761 ^ i3) * 4827) ^ (-33604272);
                        i5 = -885652530;
                    } else {
                        iM2761 = C0619.m2761("ۜۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28731)) ^ (-787693681);
                        i5 = 51644507;
                    }
                    break;
                case -1696456010:
                case 923935176:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("ۗۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-829)) ^ (-1955776001);
                        i5 = 358071982;
                    } else {
                        iM2761 = C0773.m3169("᩵ۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28077)) ^ 953560072;
                        i5 = 505088155;
                    }
                    break;
                case -1602229647:
                case -1213197239:
                    RunnableC0334.m2057();
                    break;
                case -1511300388:
                case -346198137:
                    if (C3998.m12920()) {
                        iM2761 = (i3 - C0619.m2761("֨֨")) * (-95);
                        i4 = ((iM2761 ^ i2) * (-8051)) ^ 182771590;
                        i5 = -1898422817;
                    } else {
                        iM2761 = C0773.m3169("۫ܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16403)) ^ 1194431402;
                        i5 = -1310257495;
                    }
                    break;
                case -1500081149:
                case -453694795:
                    RunnableC1848.m6360();
                    C0773.m3161();
                    break;
                case -1499491602:
                case -914285334:
                    C13473.m33144();
                    C2419.m8174();
                    iM2761 = C0773.m3169("۫ܽ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-16403)) ^ 1194431402;
                    i5 = -1310257495;
                    break;
                case -1339562213:
                case -657750688:
                    if (C2485.f7950 != 0) {
                        iM2761 = C0773.m3169("֡֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-809)) ^ 2098424944;
                        i5 = 20624791;
                    } else {
                        iM2761 = C0619.m2761("ۙۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27417) ^ (-1732661950);
                        i5 = -1538159987;
                    }
                    break;
                case -1252578771:
                case -210991255:
                    if (C2288.f7433 > 0) {
                        iM2761 = C0619.m2761("ۗۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-829)) ^ (-1955776001);
                        i5 = 358071982;
                    } else {
                        iM2761 = C0773.m3169("۫ܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16403)) ^ 1194431402;
                        i5 = -1310257495;
                    }
                    break;
                case -1229255681:
                case 1276701954:
                    if (C3690.m11994(c12187)) {
                        iM2761 = C0619.m2761("ᩴܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26373)) ^ 1106207038;
                        i5 = -729825257;
                    } else {
                        iM2761 = C0773.m3169("ᩴ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15951) ^ (-1662567883);
                        i5 = 200932314;
                    }
                    break;
                case -1022510029:
                case 2072130171:
                    abstractC22044 = this.f59540;
                    if (abstractC22044 != null) {
                        iM2761 = (C0773.m3169("ܺۢ") ^ i3) * (-41);
                        i4 = ((iM2761 ^ i2) * (-20769)) ^ (-922532243);
                        i5 = -986515348;
                    } else {
                        iM2761 = C0619.m2761("ܿܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21933)) ^ (-227930573);
                        i5 = 1610174264;
                    }
                    break;
                case -1008626489:
                case -650358041:
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0773.m3169("֡֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-809)) ^ 2098424944;
                        i5 = 20624791;
                    } else {
                        iM2761 = (C0619.m2761("֨۟") ^ i2) * 65;
                        i4 = ((iM2761 ^ i3) * 1083) ^ 1770718765;
                        i5 = 1617529959;
                    }
                    break;
                case -474775855:
                case 1126512953:
                    abstractC22045 = this.f59541;
                    if (abstractC22045 != null) {
                        iM2761 = C0773.m3169("۟ᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22875) ^ (-104858015);
                        i5 = -857359544;
                    } else {
                        iM2761 = C0619.m2761("ᩴܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26373)) ^ 1106207038;
                        i5 = -729825257;
                    }
                    break;
                case -449125933:
                case 615311515:
                    C17202.m40378(abstractC22045);
                    iM2761 = C0619.m2761("ᩴܰ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-26373)) ^ 1106207038;
                    i5 = -729825257;
                    break;
                case -67114756:
                case 1821645211:
                    C17202.m40378(abstractC22044);
                    iM2761 = C0619.m2761("ܿܶ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-21933)) ^ (-227930573);
                    i5 = 1610174264;
                    break;
                case 36053865:
                case 242283125:
                    C17202.m40372();
                    if (C1826.f6190 <= 0) {
                        iM2761 = (i2 - C0619.m2761("᩵ۗ")) * 97;
                        i4 = ((iM2761 ^ i3) * 4827) ^ (-33604272);
                        i5 = -885652530;
                    } else {
                        iM2761 = C0773.m3169("۫ܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16403)) ^ 1194431402;
                        i5 = -1310257495;
                    }
                    break;
                case 157906062:
                case 573425807:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i2 - C0619.m2761("᩵ۗ")) * 97;
                        i4 = ((iM2761 ^ i3) * 4827) ^ (-33604272);
                        i5 = -885652530;
                    } else {
                        iM2761 = (C0619.m2761("᩵ܳ") ^ i3) * (-13);
                        i4 = ((iM2761 ^ i2) * 22077) ^ (-1018419969);
                        i5 = 2131253097;
                    }
                    break;
                case 374032047:
                case 475287405:
                    if (C1080.f3865 < 0) {
                        iM2761 = (i2 - C0619.m2761("᩵ۗ")) * 97;
                        i4 = ((iM2761 ^ i3) * 4827) ^ (-33604272);
                        i5 = -885652530;
                    } else {
                        iM2761 = (i2 - C0619.m2761("۬ۨ")) * 13;
                        i4 = ((iM2761 ^ i3) * (-20753)) ^ (-1453073054);
                        i5 = 2128903951;
                    }
                    break;
                case 452124872:
                case 1375413879:
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("۫ܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16403)) ^ 1194431402;
                        i5 = -1310257495;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۫ۤ")) * 97;
                        i4 = ((iM2761 ^ i2) * (-15191)) ^ 1039987924;
                        i5 = -1131968025;
                    }
                    break;
                case 910561549:
                case 1562351800:
                    if (C3077.m10041()) {
                        iM2761 = C0773.m3169("֡֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-809)) ^ 2098424944;
                        i5 = 20624791;
                    } else {
                        iM2761 = (C0773.m3169("۠ܿ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i2) * 27433) ^ 416421402;
                        i5 = 424529362;
                    }
                    break;
                default:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("ۗۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-829)) ^ (-1955776001);
                        i5 = 358071982;
                    } else {
                        iM2761 = C0773.m3169("ۙܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31183)) ^ (-339746596);
                        i5 = 1723465882;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m42399(InputStream inputStream, String str) throws IOException {
        C14955 c14955;
        int iM2761;
        int i;
        int i2;
        int i3;
        String str2;
        char c;
        int i4;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        StringBuilder sb;
        int i9;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        int iM3169;
        int i13;
        int i14;
        int i15;
        int iM31610;
        int i16;
        int i17;
        XmlResourceParserC9734 xmlResourceParserC9734;
        int iM2762;
        int i18;
        int i19;
        int i20;
        int i21;
        C12558 c12558;
        int i22;
        int iM2763;
        int i23;
        int i24;
        int iM31611;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int iM2764;
        int i30;
        int i31;
        C14955 c14956;
        XmlResourceParserC9734 xmlResourceParserC9735;
        int attributeCount;
        int i32;
        int iM2765;
        int i33;
        int i34;
        int i35;
        int iM2766;
        int i36;
        int i37;
        String str4;
        int i38;
        char c2;
        int i39;
        int i40;
        String str5;
        int i41;
        String str6;
        int i42;
        int i43;
        int i44;
        StringBuilder sb2;
        StringBuilder sb3;
        String str7;
        char c3;
        XmlResourceParserC9734 xmlResourceParserC9736;
        int i45;
        int i46;
        C14955 c14957;
        C12558 c12559;
        String strM7803;
        int iM31612;
        int i47;
        int i48;
        String str8;
        String str9;
        char c4;
        int i49;
        String str10;
        C14955 c14958;
        int i50;
        String str11;
        int i51;
        int i52;
        int i53;
        StringBuilder sb4;
        StringBuilder sb5;
        String str12;
        XmlResourceParserC9734 xmlResourceParserC9737;
        C12558 c125510;
        int i54;
        int i55;
        int iM2767;
        int i56;
        int i57;
        String str13;
        int i58;
        int i59;
        C14955 c14959;
        int i60;
        int i61;
        int i62;
        StringBuilder sb6;
        char c5;
        int i63;
        String str14;
        String str15;
        C14955 c149510;
        int i64;
        int i65;
        int i66;
        int i67;
        StringBuilder sb7;
        String str16;
        C12558 c125511;
        int i68;
        String str17;
        int i69;
        char c6;
        String strM8350;
        int i70;
        int i71;
        StringBuilder sb8;
        C14955 c149511;
        int i72;
        int i73;
        StringBuilder sb9;
        int i74;
        int i75;
        String str18;
        String str19;
        int i76;
        C12558 c125512;
        int iM2768;
        int i77;
        int i78;
        C12558 c125513;
        int i79;
        int i80;
        int i81;
        int iM31613;
        int i82;
        int i83;
        int i84;
        int iM2769;
        int i85;
        int i86;
        boolean z = false;
        int i87 = 0;
        int i88 = 0;
        int i89 = 0;
        int i90 = -1988161305;
        int i91 = RunnableC3055.f9898;
        int i92 = C2287.f7432;
        int iM27610 = C0619.m2761("ۨ۫") ^ i92;
        int i93 = ((iM27610 ^ i91) * 3739) ^ (-378814873);
        int i94 = iM27610 ^ (-1840754962);
        C12558 c125514 = null;
        XmlResourceParserC9734 xmlResourceParserC9738 = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String str20 = null;
        StringBuilder sb10 = null;
        String strM33137 = null;
        String strM23910 = null;
        String strM13534 = null;
        String str21 = null;
        String strM31438 = null;
        StringBuilder sb11 = null;
        char c7 = 0;
        int i95 = 0;
        int i96 = 0;
        int i97 = 0;
        char c8 = 0;
        boolean z2 = false;
        int i98 = 0;
        int attributeCount2 = 0;
        int i99 = 0;
        int i100 = 0;
        int i101 = 0;
        int i102 = 0;
        int i103 = 0;
        int i104 = 0;
        int i105 = 0;
        int i106 = 0;
        byte[] bArr4 = null;
        int i107 = 0;
        int size = 0;
        short s = 0;
        int i108 = 0;
        C14955 c149512 = null;
        String str22 = null;
        int i109 = 0;
        int iM35997 = 0;
        while (true) {
            i90 = i94 ^ (i93 & (((i90 ^ i91) * (-32285)) >> 31));
            switch (i90) {
                case -2132614132:
                case 1921376201:
                    str20 = str20;
                    str21 = str21;
                    i97 = i97;
                    c8 = c8;
                    i102 = i102;
                    i103 = i103;
                    str22 = str22;
                    i105 = i105;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    i14 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    c7 = c7;
                    i99 = i99;
                    bArr2 = bArr2;
                    i101 = i101;
                    c149512 = c149512;
                    i106 = i106;
                    sb11 = sb11;
                    i95 = i95;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    if (C2419.m8175(xmlResourceParserC9738.getName(), C1826.m6310(f59539, 9, 11, i14))) {
                        iM31611 = C0619.m2761("᩶ᩴ") ^ i92;
                        i25 = ((iM31611 ^ i91) * 29771) ^ 224134154;
                        i26 = -433831597;
                        int i110 = iM31611 ^ i26;
                        i108 = i14;
                        c7 = c7;
                        sb10 = sb10;
                        i95 = i95;
                        i107 = i107;
                        size = size;
                        str21 = str21;
                        i102 = i102;
                        i103 = i103;
                        i106 = i106;
                        i97 = i97;
                        c8 = c8;
                        i94 = i110;
                        i93 = i25;
                        i99 = i99;
                        i109 = i109;
                        strM31438 = strM31438;
                        c125514 = c125514;
                        i105 = i105;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        str22 = str22;
                        sb11 = sb11;
                        str20 = str20;
                        c149512 = c149512;
                        i101 = i101;
                        bArr2 = bArr2;
                        strM13534 = strM13534;
                    }
                    i15 = i98;
                    c12558 = c125514;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    int iM27611 = (i91 - C0619.m2761("᩷ᩴ")) * 71;
                    i93 = ((iM27611 ^ i92) * 2487) ^ 1992318524;
                    i98 = i15;
                    i108 = i14;
                    sb10 = sb10;
                    i109 = i109;
                    i95 = i95;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    c125514 = c12558;
                    i103 = i103;
                    i106 = i106;
                    c7 = c7;
                    c8 = c8;
                    i99 = i99;
                    i102 = i102;
                    strM31438 = strM31438;
                    i97 = i97;
                    i94 = iM27611 ^ (-741997115);
                    i105 = i105;
                    sb11 = sb11;
                    str22 = str22;
                    c149512 = c149512;
                    str20 = str20;
                    i101 = i101;
                    bArr2 = bArr2;
                    strM13534 = strM13534;
                    break;
                case -2093668303:
                case -1215228622:
                    str20 = str20;
                    str21 = str21;
                    i97 = i97;
                    c8 = c8;
                    i29 = attributeCount2;
                    i102 = i102;
                    i103 = i103;
                    str22 = str22;
                    i105 = i105;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    i14 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    c7 = c7;
                    i99 = i99;
                    bArr2 = bArr2;
                    i101 = i101;
                    c149512 = c149512;
                    i106 = i106;
                    sb11 = sb11;
                    i95 = i95;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    if (i99 >= i29) {
                        attributeCount2 = i29;
                        i15 = i98;
                        c12558 = c125514;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        int iM27612 = (i91 - C0619.m2761("᩷ᩴ")) * 71;
                        i93 = ((iM27612 ^ i92) * 2487) ^ 1992318524;
                        i98 = i15;
                        i108 = i14;
                        sb10 = sb10;
                        i109 = i109;
                        i95 = i95;
                        i107 = i107;
                        size = size;
                        str21 = str21;
                        c125514 = c12558;
                        i103 = i103;
                        i106 = i106;
                        c7 = c7;
                        c8 = c8;
                        i99 = i99;
                        i102 = i102;
                        strM31438 = strM31438;
                        i97 = i97;
                        i94 = iM27612 ^ (-741997115);
                        i105 = i105;
                        sb11 = sb11;
                        str22 = str22;
                        c149512 = c149512;
                        str20 = str20;
                        i101 = i101;
                        bArr2 = bArr2;
                        strM13534 = strM13534;
                    } else {
                        iM2764 = C0773.m3169("۟᩵") ^ i92;
                        i30 = ((iM2764 ^ i91) * (-25659)) ^ (-1871117641);
                        i31 = 1710475366;
                        int i111 = iM2764 ^ i31;
                        attributeCount2 = i29;
                        i93 = i30;
                        i108 = i14;
                        c7 = c7;
                        sb10 = sb10;
                        i95 = i95;
                        i107 = i107;
                        size = size;
                        str21 = str21;
                        i102 = i102;
                        i103 = i103;
                        i106 = i106;
                        i97 = i97;
                        c8 = c8;
                        i94 = i111;
                        i99 = i99;
                        i109 = i109;
                        strM31438 = strM31438;
                        c125514 = c125514;
                        i105 = i105;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        str22 = str22;
                        sb11 = sb11;
                        str20 = str20;
                        c149512 = c149512;
                        i101 = i101;
                        bArr2 = bArr2;
                        strM13534 = strM13534;
                    }
                    break;
                case -2072383419:
                case -747032213:
                    str20 = str20;
                    str21 = str21;
                    i97 = i97;
                    c8 = c8;
                    i101 = i101;
                    i102 = i102;
                    i103 = i103;
                    str22 = str22;
                    c14955 = c149512;
                    i105 = i105;
                    i106 = i106;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    i108 = i108;
                    sb10 = sb10;
                    z = false;
                    sb11 = sb11;
                    strM31438 = strM31438;
                    c7 = c7;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i3 = i89;
                    int iM31614 = C0773.m3169("ܰᩴ") ^ i91;
                    i109 = i3;
                    int i112 = ((iM31614 ^ i92) * 11969) ^ 1570837236;
                    i84 = iM31614 ^ 1929746887;
                    i106 = i106;
                    i93 = i112;
                    i108 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    i103 = i103;
                    i105 = i105;
                    c8 = c8;
                    str22 = str22;
                    str20 = str20;
                    C12558 c125515 = c125514;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    sb11 = sb11;
                    c149512 = c14955;
                    i101 = i101;
                    i109 = i109;
                    c125514 = c125515;
                    i71 = i97;
                    i94 = i84;
                    c7 = c7;
                    i102 = i102;
                    i97 = i71;
                    break;
                case -2045219219:
                case 1780640425:
                    C3734.m12152();
                    if (C1542.f5343 <= 0) {
                        str20 = str20;
                        str2 = str21;
                        i97 = i97;
                        c = c8;
                        i102 = i102;
                        i4 = i103;
                        str22 = str22;
                        i105 = i105;
                        i5 = i106;
                        str3 = strM13534;
                        i6 = i107;
                        i7 = size;
                        i8 = i108;
                        sb = sb10;
                        strM31438 = strM31438;
                        c7 = c7;
                        i9 = i95;
                        C14955 c149513 = c149512;
                        sb11 = sb11;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        c125514 = c125514;
                        i109 = i109;
                        i101 = i101;
                        c14955 = c149513;
                        iM3169 = (C0619.m2761("ۨۤ") + i92) * 109;
                        i11 = ((iM3169 ^ i91) * (-9189)) ^ (-1007670601);
                        i13 = -1397850748;
                        i12 = iM3169 ^ i13;
                        i108 = i8;
                        sb10 = sb;
                        i95 = i9;
                        strM13534 = str3;
                        i107 = i6;
                        size = i7;
                        str21 = str2;
                        i106 = i5;
                        i93 = i11;
                        i103 = i4;
                        c7 = c7;
                        c8 = c;
                        i102 = i102;
                        i97 = i97;
                        i94 = i12;
                        strM31438 = strM31438;
                        i105 = i105;
                        str22 = str22;
                        str20 = str20;
                        C12558 c125516 = c125514;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        sb11 = sb11;
                        c149512 = c14955;
                        i101 = i101;
                        i109 = i109;
                        c125514 = c125516;
                    } else {
                        str20 = str20;
                        str21 = str21;
                        i97 = i97;
                        c8 = c8;
                        i102 = i102;
                        i103 = i103;
                        str22 = str22;
                        i105 = i105;
                        strM13534 = strM13534;
                        i107 = i107;
                        size = size;
                        i14 = i108;
                        sb10 = sb10;
                        strM31438 = strM31438;
                        c7 = c7;
                        i99 = i99;
                        bArr2 = bArr2;
                        i101 = i101;
                        c149512 = c149512;
                        i106 = i106;
                        sb11 = sb11;
                        i95 = i95;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        c125514 = c125514;
                        i109 = i109;
                        i15 = i98;
                        iM31610 = C0773.m3169("۟᩸") ^ i92;
                        i16 = ((iM31610 ^ i91) * (-1843)) ^ (-155090704);
                        i17 = 1898662436;
                        i21 = iM31610 ^ i17;
                        i98 = i15;
                        i108 = i14;
                        sb10 = sb10;
                        i109 = i109;
                        i95 = i95;
                        i107 = i107;
                        size = size;
                        str21 = str21;
                        i103 = i103;
                        i106 = i106;
                        c125514 = c125514;
                        c8 = c8;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        i99 = i99;
                        sb11 = sb11;
                        strM31438 = strM31438;
                        c149512 = c149512;
                        i105 = i105;
                        str22 = str22;
                        i101 = i101;
                        str20 = str20;
                        bArr2 = bArr2;
                        strM13534 = strM13534;
                        i22 = i97;
                        i94 = i21;
                        i93 = i16;
                        c7 = c7;
                        i102 = i102;
                        i97 = i22;
                    }
                    break;
                case -2008949079:
                case -445739176:
                    str14 = str20;
                    str15 = str22;
                    c149510 = c149512;
                    i64 = i105;
                    i65 = i107;
                    i66 = size;
                    i67 = i108;
                    sb7 = sb11;
                    str16 = strM31438;
                    c125511 = c125514;
                    StringBuilder sb12 = sb10;
                    i68 = i109;
                    String str23 = strM13534;
                    C3779.m12258(sb12, str23);
                    str17 = str23;
                    i69 = i97;
                    c6 = c8;
                    strM8350 = C2485.m8350(f59539, 86, 1, i67);
                    C1783.m6234(sb12, strM8350);
                    this.f59542 = C2023.m6952(sb12);
                    i70 = i103;
                    if (C11235.m28315(strM23910, c7) != i70) {
                        sb8 = sb12;
                        int iM31615 = C0773.m3169("ܺۡ") ^ i92;
                        int i113 = ((iM31615 ^ i91) * (-26475)) ^ (-554977854);
                        i108 = i67;
                        sb10 = sb8;
                        strM13534 = str17;
                        i107 = i65;
                        size = i66;
                        str21 = strM8350;
                        i103 = i70;
                        i109 = i68;
                        c8 = c6;
                        c125514 = c125511;
                        strM31438 = str16;
                        i105 = i64;
                        str22 = str15;
                        str20 = str14;
                        i22 = i69;
                        i94 = iM31615 ^ 605548868;
                        sb11 = sb7;
                        c149512 = c149510;
                        i93 = i113;
                        i97 = i22;
                    } else {
                        int iM27613 = C0619.m2761("۬᩶") ^ i91;
                        i108 = i67;
                        sb10 = sb12;
                        strM13534 = str17;
                        i107 = i65;
                        size = i66;
                        str21 = strM8350;
                        i103 = i70;
                        i109 = i68;
                        c8 = c6;
                        c125514 = c125511;
                        strM31438 = str16;
                        i105 = i64;
                        str22 = str15;
                        str20 = str14;
                        i93 = ((iM27613 ^ i92) * (-23155)) ^ 437923796;
                        sb11 = sb7;
                        c149512 = c149510;
                        i71 = i69;
                        i94 = iM27613 ^ 647937092;
                        i97 = i71;
                    }
                    break;
                case -1999248280:
                case -1430232232:
                    str8 = str20;
                    str13 = str21;
                    i58 = i97;
                    i59 = i103;
                    str10 = str22;
                    c14959 = c149512;
                    i50 = i105;
                    i60 = i107;
                    i61 = size;
                    i62 = i108;
                    sb6 = sb11;
                    str12 = strM31438;
                    c125510 = c125514;
                    i54 = i109;
                    strM33137 = C13473.m33137(f59539, 85, 1, i62);
                    if (C0773.f2792 > 0) {
                        StringBuilder sb13 = new StringBuilder(strM33137);
                        c7 = '.';
                        c5 = '/';
                        strM13534 = C4238.m13534(strM23910, '.', '/');
                        if (AbstractC3624.f12429 <= 0) {
                            sb10 = sb13;
                            sb11 = sb6;
                            int iM27614 = C0619.m2761("ۡܳ") ^ i92;
                            StringBuilder sb14 = sb11;
                            int i114 = ((iM27614 ^ i91) * 19355) ^ (-639365779);
                            i63 = iM27614 ^ (-1646816444);
                            c149512 = c14959;
                            i108 = i62;
                            i107 = i60;
                            size = i61;
                            str21 = str13;
                            i93 = i114;
                            sb11 = sb14;
                            i103 = i59;
                            c8 = c5;
                        } else {
                            int iM31616 = C0773.m3169("᩶ܰ") ^ i91;
                            int i115 = ((iM31616 ^ i92) * 18441) ^ 2089759582;
                            i63 = iM31616 ^ 1650332247;
                            sb10 = sb13;
                            i108 = i62;
                            i103 = i59;
                            sb11 = sb6;
                            i107 = i60;
                            size = i61;
                            str21 = str13;
                            c8 = '/';
                            c149512 = c14959;
                            i93 = i115;
                        }
                        i109 = i54;
                        c125514 = c125510;
                        strM31438 = str12;
                        i105 = i50;
                        str22 = str10;
                        str20 = str8;
                        i22 = i58;
                        i94 = i63;
                        i97 = i22;
                    } else {
                        int iM27615 = C0619.m2761("ۚۖ") ^ i91;
                        int i116 = ((iM27615 ^ i92) * (-22699)) ^ (-832865765);
                        i108 = i62;
                        i103 = i59;
                        sb10 = null;
                        strM13534 = strM13534;
                        i107 = i60;
                        size = i61;
                        str21 = str13;
                        i97 = i58;
                        c8 = c8;
                        i94 = iM27615 ^ (-1694471544);
                        sb11 = sb6;
                        c149512 = c14959;
                        i93 = i116;
                        i109 = i54;
                        c125514 = c125510;
                        strM31438 = str12;
                        i105 = i50;
                        str22 = str10;
                        str20 = str8;
                    }
                    break;
                case -1996567872:
                case -247710892:
                    C2419.m8174();
                    iM2769 = (i91 - C0773.m3169("֡֨")) * 29;
                    i85 = ((iM2769 ^ i92) * 17087) ^ 1577363694;
                    i86 = -1538357989;
                    i94 = iM2769 ^ i86;
                    i93 = i85;
                    break;
                case -1963902684:
                case 1122493951:
                    sb11 = sb11;
                    i109 = i109;
                    str20 = str20;
                    str21 = str21;
                    i97 = i97;
                    c8 = c8;
                    i15 = i98;
                    i101 = i101;
                    i102 = i102;
                    i103 = i103;
                    str22 = str22;
                    i105 = i105;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    i14 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    c7 = c7;
                    i99 = i99;
                    i106 = i106;
                    i95 = i95;
                    this.f59542 = null;
                    this.f59543 = null;
                    C14955 c14955M11754 = AbstractC3624.m11754(inputStream);
                    c12558 = c14955M11754.f48832;
                    XmlResourceParserC9734 xmlResourceParserC9734M35991 = c14955M11754.m35991();
                    byte[] bArrM35996 = c14955M11754.m35996();
                    iM35997 = c14955M11754.m35997();
                    bArr4 = null;
                    c149512 = c14955M11754;
                    xmlResourceParserC9738 = xmlResourceParserC9734M35991;
                    bArr2 = bArrM35996;
                    int iM27616 = (i91 - C0619.m2761("᩷ᩴ")) * 71;
                    i93 = ((iM27616 ^ i92) * 2487) ^ 1992318524;
                    i98 = i15;
                    i108 = i14;
                    sb10 = sb10;
                    i109 = i109;
                    i95 = i95;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    c125514 = c12558;
                    i103 = i103;
                    i106 = i106;
                    c7 = c7;
                    c8 = c8;
                    i99 = i99;
                    i102 = i102;
                    strM31438 = strM31438;
                    i97 = i97;
                    i94 = iM27616 ^ (-741997115);
                    i105 = i105;
                    sb11 = sb11;
                    str22 = str22;
                    c149512 = c149512;
                    str20 = str20;
                    i101 = i101;
                    bArr2 = bArr2;
                    strM13534 = strM13534;
                    break;
                case -1948951823:
                case 1789231917:
                    C0950.m3785();
                    if (C0773.m3161() == 0) {
                        str20 = str20;
                        str2 = str21;
                        i97 = i97;
                        c = c8;
                        i102 = i102;
                        i4 = i103;
                        str22 = str22;
                        i105 = i105;
                        i5 = i106;
                        str3 = strM13534;
                        i6 = i107;
                        i7 = size;
                        i8 = i108;
                        sb = sb10;
                        strM31438 = strM31438;
                        c7 = c7;
                        i9 = i95;
                        i10 = i100;
                        bArr = bArr2;
                        C14955 c149514 = c149512;
                        sb11 = sb11;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        c125514 = c125514;
                        i109 = i109;
                        i101 = i101;
                        c14955 = c149514;
                        int iM31617 = C0773.m3169("᩵ۗ") ^ i91;
                        i100 = i10;
                        int i117 = ((iM31617 ^ i92) * (-8239)) ^ 395975377;
                        i84 = iM31617 ^ (-18596620);
                        bArr2 = bArr;
                        i108 = i8;
                        sb10 = sb;
                        i95 = i9;
                        strM13534 = str3;
                        i107 = i6;
                        size = i7;
                        str21 = str2;
                        i106 = i5;
                        i93 = i117;
                        i103 = i4;
                        strM31438 = strM31438;
                        c8 = c;
                        i105 = i105;
                        str22 = str22;
                        str20 = str20;
                        C12558 c125517 = c125514;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        sb11 = sb11;
                        c149512 = c14955;
                        i101 = i101;
                        i109 = i109;
                        c125514 = c125517;
                        i71 = i97;
                        i94 = i84;
                        c7 = c7;
                        i102 = i102;
                        i97 = i71;
                    } else {
                        iM2769 = (i91 - C0773.m3169("֡֨")) * 29;
                        i85 = ((iM2769 ^ i92) * 17087) ^ 1577363694;
                        i86 = -1538357989;
                        i94 = iM2769 ^ i86;
                        i93 = i85;
                    }
                    break;
                case -1943786397:
                case 1843736222:
                    str8 = str20;
                    str9 = str21;
                    i97 = i97;
                    c4 = c8;
                    i49 = i103;
                    str10 = str22;
                    c14958 = c149512;
                    i50 = i105;
                    str11 = strM13534;
                    i51 = i107;
                    i52 = size;
                    i53 = i108;
                    sb4 = sb10;
                    sb5 = sb11;
                    str12 = strM31438;
                    xmlResourceParserC9737 = xmlResourceParserC9738;
                    c125510 = c125514;
                    i54 = i109;
                    i102 = i102;
                    if (xmlResourceParserC9737.getAttributeNameResource(i95) > i102) {
                        iM2767 = C0773.m3169("۫᩸") ^ i91;
                        c7 = c7;
                        i56 = ((iM2767 ^ i92) * 19179) ^ (-747271460);
                        i57 = -1447968761;
                    } else {
                        c7 = c7;
                        iM2767 = C0619.m2761("ۗۘ") ^ i92;
                        i56 = ((iM2767 ^ i91) * 25393) ^ 329702501;
                        i57 = 778844444;
                    }
                    int i118 = iM2767 ^ i57;
                    xmlResourceParserC9738 = xmlResourceParserC9737;
                    i108 = i53;
                    sb10 = sb4;
                    sb11 = sb5;
                    strM13534 = str11;
                    i107 = i51;
                    size = i52;
                    str21 = str9;
                    c149512 = c14958;
                    i93 = i56;
                    i103 = i49;
                    c7 = c7;
                    c8 = c4;
                    i102 = i102;
                    i97 = i97;
                    i94 = i118;
                    i109 = i54;
                    c125514 = c125510;
                    strM31438 = str12;
                    i105 = i50;
                    str22 = str10;
                    str20 = str8;
                    break;
                case -1921931689:
                case -351938828:
                    str20 = str20;
                    str21 = str21;
                    i97 = i97;
                    c8 = c8;
                    i102 = i102;
                    i103 = i103;
                    str22 = str22;
                    i105 = i105;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    i14 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    c7 = c7;
                    i99 = i99;
                    bArr2 = bArr2;
                    i101 = i101;
                    c149512 = c149512;
                    i106 = i106;
                    sb11 = sb11;
                    i95 = i95;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    i15 = i98;
                    if (i15 == 2) {
                        iM31610 = (i92 - C0773.m3169("֨ܿ")) * 75;
                        i16 = ((iM31610 ^ i91) * (-27721)) ^ (-945186998);
                        i17 = -617437458;
                        i21 = iM31610 ^ i17;
                        i98 = i15;
                        i108 = i14;
                        sb10 = sb10;
                        i109 = i109;
                        i95 = i95;
                        i107 = i107;
                        size = size;
                        str21 = str21;
                        i103 = i103;
                        i106 = i106;
                        c125514 = c125514;
                        c8 = c8;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        i99 = i99;
                        sb11 = sb11;
                        strM31438 = strM31438;
                        c149512 = c149512;
                        i105 = i105;
                        str22 = str22;
                        i101 = i101;
                        str20 = str20;
                        bArr2 = bArr2;
                        strM13534 = strM13534;
                        i22 = i97;
                        i94 = i21;
                        i93 = i16;
                        c7 = c7;
                        i102 = i102;
                        i97 = i22;
                    } else {
                        c12558 = c125514;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        int iM27617 = (i91 - C0619.m2761("᩷ᩴ")) * 71;
                        i93 = ((iM27617 ^ i92) * 2487) ^ 1992318524;
                        i98 = i15;
                        i108 = i14;
                        sb10 = sb10;
                        i109 = i109;
                        i95 = i95;
                        i107 = i107;
                        size = size;
                        str21 = str21;
                        c125514 = c12558;
                        i103 = i103;
                        i106 = i106;
                        c7 = c7;
                        c8 = c8;
                        i99 = i99;
                        i102 = i102;
                        strM31438 = strM31438;
                        i97 = i97;
                        i94 = iM27617 ^ (-741997115);
                        i105 = i105;
                        sb11 = sb11;
                        str22 = str22;
                        c149512 = c149512;
                        str20 = str20;
                        i101 = i101;
                        bArr2 = bArr2;
                        strM13534 = strM13534;
                    }
                    break;
                case -1779127045:
                case -538380999:
                    throw new NullPointerException(C3077.m10047(f59539, 20, 21, i108));
                case -1750376950:
                case -108098437:
                    String str24 = str20;
                    str4 = str21;
                    C14955 c149515 = c149512;
                    i42 = i107;
                    i43 = size;
                    i44 = i108;
                    sb3 = sb11;
                    int i119 = i105;
                    str7 = strM31438;
                    C12558 c125518 = c125514;
                    i45 = i109;
                    str5 = str22;
                    i41 = i119;
                    strM23910 = C8947.m23910(new StringBuilder(), this.f59544, str5);
                    i38 = i97;
                    c2 = c8;
                    i46 = i101;
                    i39 = i102;
                    xmlResourceParserC9736 = xmlResourceParserC9738;
                    i40 = i103;
                    str6 = strM13534;
                    sb2 = sb10;
                    c14957 = c149515;
                    c12559 = c125518;
                    c3 = c7;
                    strM7803 = str24;
                    iM31612 = C0773.m3169("ۜ֨") ^ i92;
                    i47 = ((iM31612 ^ i91) * 12039) ^ 776461943;
                    i48 = 146972717;
                    i108 = i44;
                    sb10 = sb2;
                    strM13534 = str6;
                    i107 = i42;
                    size = i43;
                    str21 = str4;
                    i103 = i40;
                    c8 = c2;
                    C12558 c125519 = c12559;
                    xmlResourceParserC9738 = xmlResourceParserC9736;
                    sb11 = sb3;
                    c149512 = c14957;
                    i101 = i46;
                    i109 = i45;
                    c125514 = c125519;
                    String str25 = str5;
                    str20 = strM7803;
                    i93 = i47;
                    c7 = c3;
                    i102 = i39;
                    i97 = i38;
                    i94 = iM31612 ^ i48;
                    strM31438 = str7;
                    i105 = i41;
                    str22 = str25;
                    break;
                case -1747376919:
                case 192640565:
                    c125514.getItem(xmlResourceParserC9738.m25345(i101)).m47468(str);
                    return c149512.m35988();
                case -1726376185:
                case -1039875974:
                    str8 = str20;
                    str9 = str21;
                    i97 = i97;
                    c4 = c8;
                    i102 = i102;
                    i49 = i103;
                    str10 = str22;
                    c14958 = c149512;
                    i50 = i105;
                    str11 = strM13534;
                    i51 = i107;
                    i52 = size;
                    i53 = i108;
                    sb4 = sb10;
                    sb5 = sb11;
                    str12 = strM31438;
                    c7 = c7;
                    xmlResourceParserC9737 = xmlResourceParserC9738;
                    c125510 = c125514;
                    i54 = i109;
                    if (!z) {
                        i55 = i54;
                        int iM27618 = C0619.m2761("᩹۠") ^ i91;
                        int i120 = i55;
                        int i121 = ((iM27618 ^ i92) * (-12553)) ^ 351530993;
                        i84 = iM27618 ^ (-2124902435);
                        str22 = str10;
                        i108 = i53;
                        sb10 = sb4;
                        strM13534 = str11;
                        i107 = i51;
                        size = i52;
                        str20 = str8;
                        str21 = str9;
                        i103 = i49;
                        c8 = c4;
                        xmlResourceParserC9738 = xmlResourceParserC9737;
                        sb11 = sb5;
                        c149512 = c14958;
                        i93 = i121;
                        i109 = i54;
                        c125514 = c125510;
                        strM31438 = str12;
                        i105 = i120;
                        i71 = i97;
                        i94 = i84;
                        c7 = c7;
                        i102 = i102;
                        i97 = i71;
                    } else {
                        iM2767 = C0619.m2761("ܶܺ") ^ i92;
                        i56 = ((iM2767 ^ i91) * (-16895)) ^ 419063401;
                        i57 = -1725995208;
                        int i1110 = iM2767 ^ i57;
                        xmlResourceParserC9738 = xmlResourceParserC9737;
                        i108 = i53;
                        sb10 = sb4;
                        sb11 = sb5;
                        strM13534 = str11;
                        i107 = i51;
                        size = i52;
                        str21 = str9;
                        c149512 = c14958;
                        i93 = i56;
                        i103 = i49;
                        c7 = c7;
                        c8 = c4;
                        i102 = i102;
                        i97 = i97;
                        i94 = i1110;
                        i109 = i54;
                        c125514 = c125510;
                        strM31438 = str12;
                        i105 = i50;
                        str22 = str10;
                        str20 = str8;
                    }
                    break;
                case -1688400096:
                case 604473469:
                    attributeCount = i106;
                    xmlResourceParserC9735 = xmlResourceParserC9738;
                    int i122 = i101;
                    c14956 = c149512;
                    i32 = i122 + 1;
                    int iM27619 = C0619.m2761("ۧۨ") ^ i91;
                    i33 = ((iM27619 ^ i92) * 19803) ^ 1000831081;
                    i35 = iM27619 ^ (-1284282281);
                    i99 = i99;
                    i108 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    bArr2 = bArr2;
                    i103 = i103;
                    i105 = i105;
                    strM13534 = strM13534;
                    c8 = c8;
                    str22 = str22;
                    str20 = str20;
                    C12558 c125520 = c125514;
                    xmlResourceParserC9738 = xmlResourceParserC9735;
                    sb11 = sb11;
                    c149512 = c14956;
                    i101 = i32;
                    i109 = i109;
                    c125514 = c125520;
                    int i123 = i95;
                    i106 = attributeCount;
                    i93 = i33;
                    i95 = i123;
                    int i124 = i97;
                    i94 = i35;
                    c7 = c7;
                    i102 = i102;
                    i97 = i124;
                    break;
                case -1685719058:
                case 1897678384:
                    C0773.m3161();
                    if (C2702.f8586 <= 0) {
                        iM2769 = C0773.m3169("ܿ֡") ^ i92;
                        i85 = ((iM2769 ^ i91) * (-6515)) ^ (-625740065);
                        i86 = -357368986;
                        i94 = iM2769 ^ i86;
                        i93 = i85;
                    } else {
                        str20 = str20;
                        str2 = str21;
                        i97 = i97;
                        c = c8;
                        i102 = i102;
                        i4 = i103;
                        str22 = str22;
                        i105 = i105;
                        i5 = i106;
                        str3 = strM13534;
                        i6 = i107;
                        i7 = size;
                        i8 = i108;
                        sb = sb10;
                        strM31438 = strM31438;
                        c7 = c7;
                        i9 = i95;
                        i10 = i100;
                        bArr = bArr2;
                        C14955 c149516 = c149512;
                        sb11 = sb11;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        c125514 = c125514;
                        i109 = i109;
                        i101 = i101;
                        c14955 = c149516;
                        int iM31618 = C0773.m3169("᩵ۗ") ^ i91;
                        i100 = i10;
                        int i1111 = ((iM31618 ^ i92) * (-8239)) ^ 395975377;
                        i84 = iM31618 ^ (-18596620);
                        bArr2 = bArr;
                        i108 = i8;
                        sb10 = sb;
                        i95 = i9;
                        strM13534 = str3;
                        i107 = i6;
                        size = i7;
                        str21 = str2;
                        i106 = i5;
                        i93 = i1111;
                        i103 = i4;
                        strM31438 = strM31438;
                        c8 = c;
                        i105 = i105;
                        str22 = str22;
                        str20 = str20;
                        C12558 c1255110 = c125514;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        sb11 = sb11;
                        c149512 = c14955;
                        i101 = i101;
                        i109 = i109;
                        c125514 = c1255110;
                        i71 = i97;
                        i94 = i84;
                        c7 = c7;
                        i102 = i102;
                        i97 = i71;
                    }
                    break;
                case -1615622075:
                case -863847734:
                    strM31438 = C12669.m31438(new StringBuilder(), this.f59544, str20, strM23910);
                    sb11 = new StringBuilder(strM33137);
                    if (!C1146.m4231()) {
                        str8 = str20;
                        str13 = str21;
                        i58 = i97;
                        str10 = str22;
                        c14959 = c149512;
                        i50 = i105;
                        i60 = i107;
                        i61 = size;
                        i62 = i108;
                        str12 = strM31438;
                        c125510 = c125514;
                        i54 = i109;
                        c5 = c8;
                        i59 = i103;
                        int iM276110 = C0619.m2761("ۡܳ") ^ i92;
                        StringBuilder sb15 = sb11;
                        int i1112 = ((iM276110 ^ i91) * 19355) ^ (-639365779);
                        i63 = iM276110 ^ (-1646816444);
                        c149512 = c14959;
                        i108 = i62;
                        i107 = i60;
                        size = i61;
                        str21 = str13;
                        i93 = i1112;
                        sb11 = sb15;
                        i103 = i59;
                        c8 = c5;
                        i109 = i54;
                        c125514 = c125510;
                        strM31438 = str12;
                        i105 = i50;
                        str22 = str10;
                        str20 = str8;
                        i22 = i58;
                        i94 = i63;
                        i97 = i22;
                    } else {
                        iM2769 = (C0773.m3169("ܳᩴ") + i91) * (-67);
                        i85 = ((iM2769 ^ i92) * 7707) ^ (-136853991);
                        i86 = 1408796694;
                        i94 = iM2769 ^ i86;
                        i93 = i85;
                    }
                    break;
                case -1543468630:
                case 2090620122:
                    return bArr4;
                case -1497174963:
                case 1656709255:
                    i27 = i106;
                    bArr2 = bArr2;
                    i101 = i101;
                    c149512 = c149512;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    attributeCount2 = xmlResourceParserC9738.getAttributeCount();
                    i28 = i100;
                    int iM27620 = C0619.m2761("ܽ֡") ^ i91;
                    i108 = i108;
                    c7 = c7;
                    sb10 = sb10;
                    i95 = i95;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    i102 = i102;
                    i103 = i103;
                    i106 = i27;
                    i97 = i97;
                    c8 = c8;
                    i99 = i28;
                    i94 = iM27620 ^ 1764309425;
                    i93 = ((iM27620 ^ i92) * (-3725)) ^ (-1049866616);
                    i109 = i109;
                    strM31438 = strM31438;
                    c125514 = c125514;
                    i105 = i105;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    str22 = str22;
                    sb11 = sb11;
                    str20 = str20;
                    c149512 = c149512;
                    i101 = i101;
                    bArr2 = bArr2;
                    strM13534 = strM13534;
                    break;
                case -1468618262:
                case 771396561:
                    c14959 = c149512;
                    c125513 = c125514;
                    sb6 = sb11;
                    i79 = i109;
                    i80 = i105;
                    str12 = strM31438;
                    i81 = i104;
                    C0619.m2755(i80 + i87, i81, bArr3);
                    i107 = i80 + 8;
                    size = c125513.size();
                    if (C0619.f2439) {
                        iM31613 = C0619.m2761("ۨ᩻") ^ i91;
                        i104 = i81;
                        i82 = ((iM31613 ^ i92) * 18881) ^ (-642728080);
                        i83 = -1680172291;
                    } else {
                        i104 = i81;
                        iM31613 = C0773.m3169("ܰܺ") ^ i92;
                        i82 = ((iM31613 ^ i91) * 2797) ^ (-568074969);
                        i83 = 855959573;
                    }
                    i94 = iM31613 ^ i83;
                    i109 = i79;
                    c125514 = c125513;
                    String str26 = str12;
                    i105 = i80;
                    sb11 = sb6;
                    c149512 = c14959;
                    i93 = i82;
                    strM31438 = str26;
                    break;
                case -1454767585:
                case 1714459108:
                    str20 = str20;
                    str21 = str21;
                    i97 = i97;
                    c8 = c8;
                    i29 = attributeCount2;
                    i102 = i102;
                    i103 = i103;
                    str22 = str22;
                    i105 = i105;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    i14 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    c7 = c7;
                    i99 = i99;
                    bArr2 = bArr2;
                    i101 = i101;
                    c149512 = c149512;
                    i106 = i106;
                    sb11 = sb11;
                    i95 = i95;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    if (this.f59544 != null) {
                        iM2764 = C0773.m3169("ۗ۫") ^ i92;
                        i30 = ((iM2764 ^ i91) * (-14653)) ^ (-82945301);
                        i31 = 2118433430;
                    } else {
                        iM2764 = (C0619.m2761("֫ۜ") ^ i91) * 71;
                        i30 = ((iM2764 ^ i92) * 10527) ^ 15330212;
                        i31 = 842988010;
                    }
                    int i1113 = iM2764 ^ i31;
                    attributeCount2 = i29;
                    i93 = i30;
                    i108 = i14;
                    c7 = c7;
                    sb10 = sb10;
                    i95 = i95;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    i102 = i102;
                    i103 = i103;
                    i106 = i106;
                    i97 = i97;
                    c8 = c8;
                    i94 = i1113;
                    i99 = i99;
                    i109 = i109;
                    strM31438 = strM31438;
                    c125514 = c125514;
                    i105 = i105;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    str22 = str22;
                    sb11 = sb11;
                    str20 = str20;
                    c149512 = c149512;
                    i101 = i101;
                    bArr2 = bArr2;
                    strM13534 = strM13534;
                    break;
                case -1367638540:
                case 1870510653:
                    i95++;
                    c14955 = c149512;
                    iM2761 = (i91 - C0773.m3169("ۤۨ")) * 13;
                    i = ((iM2761 ^ i92) * 10491) ^ (-256061433);
                    i2 = -1982680118;
                    i12 = iM2761 ^ i2;
                    i106 = i106;
                    i93 = i;
                    i108 = i108;
                    c7 = c7;
                    sb10 = sb10;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    i102 = i102;
                    i103 = i103;
                    i97 = i97;
                    c8 = c8;
                    i94 = i12;
                    strM31438 = strM31438;
                    i105 = i105;
                    str22 = str22;
                    str20 = str20;
                    C12558 c1255111 = c125514;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    sb11 = sb11;
                    c149512 = c14955;
                    i101 = i101;
                    i109 = i109;
                    c125514 = c1255111;
                    break;
                case -1326144284:
                case -1179205919:
                    str20 = str20;
                    str21 = str21;
                    i97 = i97;
                    c8 = c8;
                    i102 = i102;
                    i103 = i103;
                    str22 = str22;
                    i105 = i105;
                    int i125 = i106;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    i14 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    c7 = c7;
                    i95 = i95;
                    i99 = i99;
                    byte[] bArr5 = bArr2;
                    C14955 c149517 = c149512;
                    sb11 = sb11;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    int i126 = i101;
                    c149512 = c149517;
                    this.f59544 = xmlResourceParserC9738.getAttributeValue(i99);
                    i106 = i125;
                    i101 = i126;
                    bArr2 = bArr5;
                    iM31611 = (C0773.m3169("֡ۢ") ^ i91) * (-69);
                    i25 = ((iM31611 ^ i92) * (-32501)) ^ (-1924019119);
                    i26 = -1271910506;
                    int i1114 = iM31611 ^ i26;
                    i108 = i14;
                    c7 = c7;
                    sb10 = sb10;
                    i95 = i95;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    i102 = i102;
                    i103 = i103;
                    i106 = i106;
                    i97 = i97;
                    c8 = c8;
                    i94 = i1114;
                    i93 = i25;
                    i99 = i99;
                    i109 = i109;
                    strM31438 = strM31438;
                    c125514 = c125514;
                    i105 = i105;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    str22 = str22;
                    sb11 = sb11;
                    str20 = str20;
                    c149512 = c149512;
                    i101 = i101;
                    bArr2 = bArr2;
                    strM13534 = strM13534;
                    break;
                case -1290563562:
                case -847288118:
                    c14959 = c149512;
                    C12558 c125521 = c125514;
                    sb6 = sb11;
                    i54 = i109;
                    i80 = i105;
                    int i127 = i107;
                    str12 = strM31438;
                    int i128 = size;
                    C0619.m2755(i127, i128, bArr3);
                    i60 = i127;
                    i61 = i128;
                    C0773.m3164(i80 + 12, 50331656, bArr3);
                    i88 = 16;
                    if (RunnableC0334.f1808 > 0) {
                        int iM27621 = C0619.m2761("ܶۖ") ^ i91;
                        i82 = ((iM27621 ^ i92) * 32457) ^ 503282657;
                        i94 = iM27621 ^ 1067547405;
                        i109 = i54;
                        c125514 = c125521;
                        i107 = i60;
                        size = i61;
                        String str27 = str12;
                        i105 = i80;
                        sb11 = sb6;
                        c149512 = c14959;
                        i93 = i82;
                        strM31438 = str27;
                    } else {
                        str8 = str20;
                        str13 = str21;
                        i58 = i97;
                        c5 = c8;
                        i59 = i103;
                        str10 = str22;
                        c125510 = c125521;
                        i62 = i108;
                        i50 = i80;
                        sb11 = sb6;
                        int iM276111 = C0619.m2761("ۡܳ") ^ i92;
                        StringBuilder sb16 = sb11;
                        int i1115 = ((iM276111 ^ i91) * 19355) ^ (-639365779);
                        i63 = iM276111 ^ (-1646816444);
                        c149512 = c14959;
                        i108 = i62;
                        i107 = i60;
                        size = i61;
                        str21 = str13;
                        i93 = i1115;
                        sb11 = sb16;
                        i103 = i59;
                        c8 = c5;
                        i109 = i54;
                        c125514 = c125510;
                        strM31438 = str12;
                        i105 = i50;
                        str22 = str10;
                        str20 = str8;
                        i22 = i58;
                        i94 = i63;
                        i97 = i22;
                    }
                    break;
                case -1287554384:
                case -929452840:
                    throw new IOException();
                case -1283286667:
                case 650255525:
                    if (C0862.f3233 != 0) {
                        str8 = str20;
                        str19 = str21;
                        c149511 = c149512;
                        i72 = i107;
                        i73 = size;
                        i76 = i108;
                        sb9 = sb11;
                        i75 = i105;
                        str18 = strM31438;
                        c125512 = c125514;
                        i74 = i109;
                        iM2768 = (C0773.m3169("ۛۢ") + i91) * 57;
                        i77 = ((iM2768 ^ i92) * (-29561)) ^ 56829809;
                        i78 = 339198611;
                        i94 = iM2768 ^ i78;
                        i108 = i76;
                        i109 = i74;
                        i107 = i72;
                        size = i73;
                        str21 = str19;
                        c125514 = c125512;
                        strM31438 = str18;
                        i105 = i75;
                        sb11 = sb9;
                        c149512 = c149511;
                        i93 = i77;
                        str20 = str8;
                    } else {
                        str20 = str20;
                        str21 = str21;
                        i97 = i97;
                        c8 = c8;
                        i102 = i102;
                        i103 = i103;
                        str22 = str22;
                        i105 = i105;
                        strM13534 = strM13534;
                        i107 = i107;
                        size = size;
                        i14 = i108;
                        sb10 = sb10;
                        strM31438 = strM31438;
                        c7 = c7;
                        i99 = i99;
                        bArr2 = bArr2;
                        i101 = i101;
                        c149512 = c149512;
                        i106 = i106;
                        sb11 = sb11;
                        i95 = i95;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        c125514 = c125514;
                        i109 = i109;
                        i15 = i98;
                        iM31610 = C0773.m3169("۟᩸") ^ i92;
                        i16 = ((iM31610 ^ i91) * (-1843)) ^ (-155090704);
                        i17 = 1898662436;
                        i21 = iM31610 ^ i17;
                        i98 = i15;
                        i108 = i14;
                        sb10 = sb10;
                        i109 = i109;
                        i95 = i95;
                        i107 = i107;
                        size = size;
                        str21 = str21;
                        i103 = i103;
                        i106 = i106;
                        c125514 = c125514;
                        c8 = c8;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        i99 = i99;
                        sb11 = sb11;
                        strM31438 = strM31438;
                        c149512 = c149512;
                        i105 = i105;
                        str22 = str22;
                        i101 = i101;
                        str20 = str20;
                        bArr2 = bArr2;
                        strM13534 = strM13534;
                        i22 = i97;
                        i94 = i21;
                        i93 = i16;
                        c7 = c7;
                        i102 = i102;
                        i97 = i22;
                    }
                    break;
                case -1209016577:
                case -688515211:
                    String str28 = str20;
                    String str29 = str21;
                    int i129 = i97;
                    char c9 = c8;
                    int i130 = i102;
                    int i131 = i103;
                    int i132 = i105;
                    int i133 = i106;
                    String str30 = strM13534;
                    int i134 = i107;
                    int i135 = size;
                    int i136 = i108;
                    StringBuilder sb17 = sb10;
                    String str31 = strM31438;
                    char c10 = c7;
                    C14955 c149518 = c149512;
                    StringBuilder sb18 = sb11;
                    XmlResourceParserC9734 xmlResourceParserC9739 = xmlResourceParserC9738;
                    C12558 c125522 = c125514;
                    int i137 = i109;
                    int i138 = i101;
                    String attributeValue = xmlResourceParserC9739.getAttributeValue(i138);
                    int i139 = i95;
                    if (C2419.m8175(attributeValue, C1343.m4939(f59539, 61, 23, i136))) {
                        iM2766 = C0619.m2761("֫ۡ") ^ i91;
                        i36 = ((iM2766 ^ i92) * (-5039)) ^ 1022437719;
                        i37 = 2110088699;
                    } else {
                        iM2766 = C0619.m2761("ۚܿ") ^ i92;
                        i36 = ((iM2766 ^ i91) * 30453) ^ 1105021529;
                        i37 = -144382491;
                    }
                    int i140 = iM2766 ^ i37;
                    i108 = i136;
                    sb10 = sb17;
                    strM13534 = str30;
                    i107 = i134;
                    size = i135;
                    str20 = str28;
                    str21 = str29;
                    i103 = i131;
                    c8 = c9;
                    xmlResourceParserC9738 = xmlResourceParserC9739;
                    sb11 = sb18;
                    c149512 = c149518;
                    i101 = i138;
                    i109 = i137;
                    c125514 = c125522;
                    i106 = i133;
                    i93 = i36;
                    i95 = i139;
                    str22 = attributeValue;
                    strM31438 = str31;
                    i105 = i132;
                    i94 = i140;
                    c7 = c10;
                    i102 = i130;
                    i97 = i129;
                    break;
                case -1163665759:
                case 622245717:
                    c14955 = c149512;
                    i95 = 0;
                    iM2761 = (i91 - C0773.m3169("ۤۨ")) * 13;
                    i = ((iM2761 ^ i92) * 10491) ^ (-256061433);
                    i2 = -1982680118;
                    i12 = iM2761 ^ i2;
                    i106 = i106;
                    i93 = i;
                    i108 = i108;
                    c7 = c7;
                    sb10 = sb10;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    i102 = i102;
                    i103 = i103;
                    i97 = i97;
                    c8 = c8;
                    i94 = i12;
                    strM31438 = strM31438;
                    i105 = i105;
                    str22 = str22;
                    str20 = str20;
                    C12558 c1255112 = c125514;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    sb11 = sb11;
                    c149512 = c14955;
                    i101 = i101;
                    i109 = i109;
                    c125514 = c1255112;
                    break;
                case -1030468098:
                case -952604517:
                    str20 = str20;
                    String str32 = str21;
                    i97 = i97;
                    c8 = c8;
                    i102 = i102;
                    int i141 = i103;
                    str22 = str22;
                    int i142 = i105;
                    attributeCount = i106;
                    String str33 = strM13534;
                    int i143 = i107;
                    int i144 = size;
                    int i145 = i108;
                    StringBuilder sb19 = sb10;
                    String str34 = strM31438;
                    c7 = c7;
                    i95 = i95;
                    C14955 c149519 = c149512;
                    sb11 = sb11;
                    xmlResourceParserC9735 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    i32 = i101;
                    c14956 = c149519;
                    C0773.m3164(i96 - 8, attributeCount + 1, bArr3);
                    int iM25335 = xmlResourceParserC9735.m25335();
                    if (iM25335 != i141) {
                        iM2765 = C0773.m3169("ۨۧ") ^ i91;
                        i33 = ((iM2765 ^ i92) * 26017) ^ (-800686266);
                        i34 = 1354757594;
                    } else {
                        iM2765 = C0619.m2761("ۢܿ") ^ i91;
                        i33 = ((iM2765 ^ i92) * (-29811)) ^ (-242036920);
                        i34 = -264219413;
                    }
                    i35 = iM2765 ^ i34;
                    i104 = iM25335;
                    i108 = i145;
                    sb10 = sb19;
                    strM31438 = str34;
                    strM13534 = str33;
                    i107 = i143;
                    size = i144;
                    str21 = str32;
                    i103 = i141;
                    i105 = i142;
                    c8 = c8;
                    str22 = str22;
                    str20 = str20;
                    C12558 c125523 = c125514;
                    xmlResourceParserC9738 = xmlResourceParserC9735;
                    sb11 = sb11;
                    c149512 = c14956;
                    i101 = i32;
                    i109 = i109;
                    c125514 = c125523;
                    int i1210 = i95;
                    i106 = attributeCount;
                    i93 = i33;
                    i95 = i1210;
                    int i1211 = i97;
                    i94 = i35;
                    c7 = c7;
                    i102 = i102;
                    i97 = i1211;
                    break;
                case -936563513:
                case 882128064:
                    if (!C2878.f9462) {
                        c14959 = c149512;
                        c125513 = c125514;
                        sb6 = sb11;
                        i79 = i109;
                        i80 = i105;
                        str12 = strM31438;
                        i81 = i104;
                        iM31613 = C0619.m2761("ۨ᩻") ^ i91;
                        i104 = i81;
                        i82 = ((iM31613 ^ i92) * 18881) ^ (-642728080);
                        i83 = -1680172291;
                        i94 = iM31613 ^ i83;
                        i109 = i79;
                        c125514 = c125513;
                        String str210 = str12;
                        i105 = i80;
                        sb11 = sb6;
                        c149512 = c14959;
                        i93 = i82;
                        strM31438 = str210;
                    } else {
                        str8 = str20;
                        str13 = str21;
                        i58 = i97;
                        str10 = str22;
                        c14959 = c149512;
                        i50 = i105;
                        i60 = i107;
                        i61 = size;
                        i62 = i108;
                        str12 = strM31438;
                        c125510 = c125514;
                        i54 = i109;
                        c5 = c8;
                        i59 = i103;
                        int iM276112 = C0619.m2761("ۡܳ") ^ i92;
                        StringBuilder sb110 = sb11;
                        int i1116 = ((iM276112 ^ i91) * 19355) ^ (-639365779);
                        i63 = iM276112 ^ (-1646816444);
                        c149512 = c14959;
                        i108 = i62;
                        i107 = i60;
                        size = i61;
                        str21 = str13;
                        i93 = i1116;
                        sb11 = sb110;
                        i103 = i59;
                        c8 = c5;
                        i109 = i54;
                        c125514 = c125510;
                        strM31438 = str12;
                        i105 = i50;
                        str22 = str10;
                        str20 = str8;
                        i22 = i58;
                        i94 = i63;
                        i97 = i22;
                    }
                    break;
                case -860271706:
                case 1552420559:
                    str20 = str20;
                    str2 = str21;
                    i97 = i97;
                    c = c8;
                    i102 = i102;
                    i4 = i103;
                    str22 = str22;
                    i105 = i105;
                    i5 = i106;
                    str3 = strM13534;
                    i6 = i107;
                    i7 = size;
                    i8 = i108;
                    sb = sb10;
                    strM31438 = strM31438;
                    c7 = c7;
                    i9 = i95;
                    C14955 c149520 = c149512;
                    sb11 = sb11;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    i101 = i101;
                    c14955 = c149520;
                    if (xmlResourceParserC9738.getAttributeNameResource(i101) == i102) {
                        iM3169 = (i92 - C0773.m3169("ᩳۧ")) * 47;
                        i11 = ((iM3169 ^ i91) * 12913) ^ 193745733;
                        i13 = 1430790606;
                    } else {
                        iM3169 = (C0773.m3169("ۨ᩹") ^ i92) * q.h;
                        i11 = ((iM3169 ^ i91) * 18907) ^ 200085129;
                        i13 = -1351186363;
                    }
                    i12 = iM3169 ^ i13;
                    i108 = i8;
                    sb10 = sb;
                    i95 = i9;
                    strM13534 = str3;
                    i107 = i6;
                    size = i7;
                    str21 = str2;
                    i106 = i5;
                    i93 = i11;
                    i103 = i4;
                    c7 = c7;
                    c8 = c;
                    i102 = i102;
                    i97 = i97;
                    i94 = i12;
                    strM31438 = strM31438;
                    i105 = i105;
                    str22 = str22;
                    str20 = str20;
                    C12558 c1255113 = c125514;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    sb11 = sb11;
                    c149512 = c14955;
                    i101 = i101;
                    i109 = i109;
                    c125514 = c1255113;
                    break;
                case -825453666:
                case 855988427:
                    int i146 = i95 * 20;
                    C2288.m7765(bArr3, i97, bArr3, i96, i146);
                    i89 = i146 + i96;
                    iM2769 = (i92 - C0619.m2761("۟ۙ")) * 65;
                    i85 = ((iM2769 ^ i91) * 19567) ^ (-325232309);
                    i86 = 29277610;
                    i94 = iM2769 ^ i86;
                    i93 = i85;
                    break;
                case -776626295:
                case 1799832542:
                    c149511 = c149512;
                    C12558 c125524 = c125514;
                    i72 = i107;
                    i73 = size;
                    sb9 = sb11;
                    i74 = i109;
                    i75 = i105;
                    str18 = strM31438;
                    str8 = str20;
                    str19 = str21;
                    i76 = i108;
                    c125512 = c125524;
                    C0773.m3164(i75, c125512.m15436(C2023.m6966(f59539, 87, 42, i76)), bArr3);
                    i87 = 4;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2768 = (C0773.m3169("ۛۢ") + i91) * 57;
                        i77 = ((iM2768 ^ i92) * (-29561)) ^ 56829809;
                        i78 = 339198611;
                    } else {
                        iM2768 = C0619.m2761("ۧ۬") ^ i91;
                        i77 = ((iM2768 ^ i92) * (-13539)) ^ 323567347;
                        i78 = 1114276491;
                    }
                    i94 = iM2768 ^ i78;
                    i108 = i76;
                    i109 = i74;
                    i107 = i72;
                    size = i73;
                    str21 = str19;
                    c125514 = c125512;
                    strM31438 = str18;
                    i105 = i75;
                    sb11 = sb9;
                    c149512 = c149511;
                    i93 = i77;
                    str20 = str8;
                    break;
                case -709006615:
                case 1000912413:
                    C0773.m3164(i105 + i88, c125514.size(), bArr3);
                    C14955 c149521 = c149512;
                    c149521.m35987(bArr3);
                    c125514.m31255(str);
                    return c149521.m35988();
                case -673113512:
                case 2004066377:
                    str4 = str21;
                    i38 = i97;
                    c2 = c8;
                    i39 = i102;
                    i40 = i103;
                    str5 = str22;
                    C14955 c149522 = c149512;
                    i41 = i105;
                    str6 = strM13534;
                    i42 = i107;
                    i43 = size;
                    i44 = i108;
                    sb2 = sb10;
                    sb3 = sb11;
                    str7 = strM31438;
                    c3 = c7;
                    xmlResourceParserC9736 = xmlResourceParserC9738;
                    C12558 c125525 = c125514;
                    i45 = i109;
                    i46 = i101;
                    c14957 = c149522;
                    c12559 = c125525;
                    strM7803 = C2310.m7803(f59539, 84, 1, i44);
                    if (C0487.m2359(str5, strM7803)) {
                        iM31612 = C0773.m3169("ܿ᩶") ^ i92;
                        i47 = ((iM31612 ^ i91) * (-20775)) ^ 1090265851;
                        i48 = 2040129893;
                    } else {
                        strM23910 = str5;
                        iM31612 = C0773.m3169("ۜ֨") ^ i92;
                        i47 = ((iM31612 ^ i91) * 12039) ^ 776461943;
                        i48 = 146972717;
                    }
                    i108 = i44;
                    sb10 = sb2;
                    strM13534 = str6;
                    i107 = i42;
                    size = i43;
                    str21 = str4;
                    i103 = i40;
                    c8 = c2;
                    C12558 c1255114 = c12559;
                    xmlResourceParserC9738 = xmlResourceParserC9736;
                    sb11 = sb3;
                    c149512 = c14957;
                    i101 = i46;
                    i109 = i45;
                    c125514 = c1255114;
                    String str211 = str5;
                    str20 = strM7803;
                    i93 = i47;
                    c7 = c3;
                    i102 = i39;
                    i97 = i38;
                    i94 = iM31612 ^ i48;
                    strM31438 = str7;
                    i105 = i41;
                    str22 = str211;
                    break;
                case -455203930:
                case 1130807391:
                    String str35 = str21;
                    int i147 = i107;
                    int i148 = size;
                    int i149 = i108;
                    StringBuilder sb20 = sb10;
                    int i150 = i95;
                    xmlResourceParserC9734 = xmlResourceParserC9738;
                    int i151 = i109;
                    int i152 = i98;
                    short s2 = s;
                    int i153 = s2 + 8154;
                    if ((s2 * 32616) - (i153 * i153) > 0) {
                        iM2762 = (i91 - C0619.m2761("֨ۢ")) * 69;
                        i18 = ((iM2762 ^ i92) * (-15413)) ^ (-1463082177);
                        i19 = 1120026851;
                    } else {
                        iM2762 = (C0619.m2761("֫ۚ") + i92) * (-13);
                        i18 = ((iM2762 ^ i91) * 7703) ^ 376203444;
                        i19 = -1891063236;
                    }
                    i20 = iM2762 ^ i19;
                    s = s2;
                    i98 = i152;
                    i93 = i18;
                    i108 = i149;
                    sb10 = sb20;
                    i109 = i151;
                    i95 = i150;
                    i107 = i147;
                    size = i148;
                    str21 = str35;
                    i103 = i103;
                    i106 = i106;
                    c125514 = c125514;
                    c8 = c8;
                    xmlResourceParserC9738 = xmlResourceParserC9734;
                    i99 = i99;
                    sb11 = sb11;
                    strM31438 = strM31438;
                    c149512 = c149512;
                    i105 = i105;
                    str22 = str22;
                    i101 = i101;
                    str20 = str20;
                    bArr2 = bArr2;
                    strM13534 = strM13534;
                    i22 = i97;
                    i94 = i20;
                    c7 = c7;
                    i102 = i102;
                    i97 = i22;
                    break;
                case -444802710:
                case 442269682:
                    throw new IOException(C2702.m8881(f59539, 48, 13, i108));
                case -437995239:
                case 2063623049:
                    str20 = str20;
                    str21 = str21;
                    i97 = i97;
                    c8 = c8;
                    i102 = i102;
                    i103 = i103;
                    str22 = str22;
                    i105 = i105;
                    int i154 = i106;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    i14 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    c7 = c7;
                    i95 = i95;
                    i99 = i99;
                    byte[] bArr6 = bArr2;
                    C14955 c149523 = c149512;
                    sb11 = sb11;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    int i155 = i101;
                    c149512 = c149523;
                    i106 = i154;
                    i101 = i155;
                    bArr2 = bArr6;
                    if (C3492.m11490(xmlResourceParserC9738.getAttributeName(i99), RunnableC1848.m6366(f59539, 41, 7, i14))) {
                        iM31611 = C0619.m2761("ܳۘ") ^ i92;
                        i25 = ((iM31611 ^ i91) * (-19145)) ^ 1814881341;
                        i26 = 820239592;
                    } else {
                        iM31611 = (C0773.m3169("֡ۢ") ^ i91) * (-69);
                        i25 = ((iM31611 ^ i92) * (-32501)) ^ (-1924019119);
                        i26 = -1271910506;
                    }
                    int i1117 = iM31611 ^ i26;
                    i108 = i14;
                    c7 = c7;
                    sb10 = sb10;
                    i95 = i95;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    i102 = i102;
                    i103 = i103;
                    i106 = i106;
                    i97 = i97;
                    c8 = c8;
                    i94 = i1117;
                    i93 = i25;
                    i99 = i99;
                    i109 = i109;
                    strM31438 = strM31438;
                    c125514 = c125514;
                    i105 = i105;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    str22 = str22;
                    sb11 = sb11;
                    str20 = str20;
                    c149512 = c149512;
                    i101 = i101;
                    bArr2 = bArr2;
                    strM13534 = strM13534;
                    break;
                case -384704764:
                case 1908841962:
                    C0773.m3161();
                    if (C3033.f9831 >= 0) {
                        str8 = str20;
                        str13 = str21;
                        i58 = i97;
                        i59 = i103;
                        str10 = str22;
                        c14959 = c149512;
                        i50 = i105;
                        i60 = i107;
                        i61 = size;
                        i62 = i108;
                        sb6 = sb11;
                        str12 = strM31438;
                        c125510 = c125514;
                        i54 = i109;
                        int iM276113 = C0619.m2761("ۚۖ") ^ i91;
                        int i1118 = ((iM276113 ^ i92) * (-22699)) ^ (-832865765);
                        i108 = i62;
                        i103 = i59;
                        sb10 = null;
                        strM13534 = strM13534;
                        i107 = i60;
                        size = i61;
                        str21 = str13;
                        i97 = i58;
                        c8 = c8;
                        i94 = iM276113 ^ (-1694471544);
                        sb11 = sb6;
                        c149512 = c14959;
                        i93 = i1118;
                        i109 = i54;
                        c125514 = c125510;
                        strM31438 = str12;
                        i105 = i50;
                        str22 = str10;
                        str20 = str8;
                    } else {
                        str20 = str20;
                        str2 = str21;
                        i97 = i97;
                        c = c8;
                        i102 = i102;
                        i4 = i103;
                        str22 = str22;
                        i105 = i105;
                        i5 = i106;
                        str3 = strM13534;
                        i6 = i107;
                        i7 = size;
                        i8 = i108;
                        sb = sb10;
                        strM31438 = strM31438;
                        c7 = c7;
                        i9 = i95;
                        i10 = i100;
                        bArr = bArr2;
                        C14955 c1495110 = c149512;
                        sb11 = sb11;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        c125514 = c125514;
                        i109 = i109;
                        i101 = i101;
                        c14955 = c1495110;
                        int iM31619 = C0773.m3169("᩵ۗ") ^ i91;
                        i100 = i10;
                        int i1119 = ((iM31619 ^ i92) * (-8239)) ^ 395975377;
                        i84 = iM31619 ^ (-18596620);
                        bArr2 = bArr;
                        i108 = i8;
                        sb10 = sb;
                        i95 = i9;
                        strM13534 = str3;
                        i107 = i6;
                        size = i7;
                        str21 = str2;
                        i106 = i5;
                        i93 = i1119;
                        i103 = i4;
                        strM31438 = strM31438;
                        c8 = c;
                        i105 = i105;
                        str22 = str22;
                        str20 = str20;
                        C12558 c1255115 = c125514;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        sb11 = sb11;
                        c149512 = c14955;
                        i101 = i101;
                        i109 = i109;
                        c125514 = c1255115;
                        i71 = i97;
                        i94 = i84;
                        c7 = c7;
                        i102 = i102;
                        i97 = i71;
                    }
                    break;
                case -372151481:
                case 1765877014:
                    C3779.m12258(sb11, C4238.m13534(strM31438, c7, c8));
                    C3779.m12258(sb11, str21);
                    this.f59543 = C2023.m6952(sb11);
                    str14 = str20;
                    i69 = i97;
                    c6 = c8;
                    i70 = i103;
                    str15 = str22;
                    c149510 = c149512;
                    i64 = i105;
                    str17 = strM13534;
                    i65 = i107;
                    i66 = size;
                    sb8 = sb10;
                    sb7 = sb11;
                    str16 = strM31438;
                    c125511 = c125514;
                    i68 = i109;
                    strM8350 = str21;
                    i67 = i108;
                    int iM316110 = C0773.m3169("ܺۡ") ^ i92;
                    int i1120 = ((iM316110 ^ i91) * (-26475)) ^ (-554977854);
                    i108 = i67;
                    sb10 = sb8;
                    strM13534 = str17;
                    i107 = i65;
                    size = i66;
                    str21 = strM8350;
                    i103 = i70;
                    i109 = i68;
                    c8 = c6;
                    c125514 = c125511;
                    strM31438 = str16;
                    i105 = i64;
                    str22 = str15;
                    str20 = str14;
                    i22 = i69;
                    i94 = iM316110 ^ 605548868;
                    sb11 = sb7;
                    c149512 = c149510;
                    i93 = i1120;
                    i97 = i22;
                    break;
                case -242540940:
                case 1843890580:
                    i108 = 59731;
                    int iM27622 = C0619.m2761("ۧ۠") ^ i92;
                    i16 = ((iM27622 ^ i91) * 24391) ^ 161458839;
                    i21 = iM27622 ^ (-1024415953);
                    i98 = i98;
                    sb10 = sb10;
                    i109 = i109;
                    i95 = i95;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    i103 = i103;
                    i106 = i106;
                    c125514 = c125514;
                    c8 = c8;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    i99 = i99;
                    sb11 = sb11;
                    strM31438 = strM31438;
                    c149512 = c149512;
                    i105 = i105;
                    str22 = str22;
                    i101 = i101;
                    str20 = str20;
                    bArr2 = bArr2;
                    strM13534 = strM13534;
                    i22 = i97;
                    i94 = i21;
                    i93 = i16;
                    c7 = c7;
                    i102 = i102;
                    i97 = i22;
                    break;
                case -28049813:
                case 622718891:
                    c14956 = c149512;
                    xmlResourceParserC9735 = xmlResourceParserC9738;
                    attributeCount = xmlResourceParserC9735.getAttributeCount();
                    i32 = 0;
                    int iM276114 = C0619.m2761("ۧۨ") ^ i91;
                    i33 = ((iM276114 ^ i92) * 19803) ^ 1000831081;
                    i35 = iM276114 ^ (-1284282281);
                    i99 = i99;
                    i108 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    bArr2 = bArr2;
                    i103 = i103;
                    i105 = i105;
                    strM13534 = strM13534;
                    c8 = c8;
                    str22 = str22;
                    str20 = str20;
                    C12558 c125526 = c125514;
                    xmlResourceParserC9738 = xmlResourceParserC9735;
                    sb11 = sb11;
                    c149512 = c14956;
                    i101 = i32;
                    i109 = i109;
                    c125514 = c125526;
                    int i1212 = i95;
                    i106 = attributeCount;
                    i93 = i33;
                    i95 = i1212;
                    int i1213 = i97;
                    i94 = i35;
                    c7 = c7;
                    i102 = i102;
                    i97 = i1213;
                    break;
                case 91175606:
                case 771187410:
                    str20 = str20;
                    String str36 = str21;
                    char c11 = c8;
                    int i156 = i102;
                    int i157 = i103;
                    str22 = str22;
                    i105 = i105;
                    int i158 = i106;
                    String str37 = strM13534;
                    int i159 = i107;
                    int i160 = size;
                    int i161 = i108;
                    StringBuilder sb21 = sb10;
                    strM31438 = strM31438;
                    char c12 = c7;
                    int i162 = i95;
                    C14955 c149524 = c149512;
                    sb11 = sb11;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    i101 = i101;
                    c14955 = c149524;
                    int i163 = i96 + 20;
                    byte[] bArr7 = bArr2;
                    C2288.m7765(bArr7, i96, bArr3, i163, bArr7.length - i96);
                    if (C3492.f12043 <= 0) {
                        int iM31620 = (i92 - C0773.m3169("᩺᩶")) * 59;
                        int i164 = ((iM31620 ^ i91) * 12535) ^ (-1267862871);
                        i94 = iM31620 ^ 45500242;
                        i108 = i161;
                        c7 = c12;
                        sb10 = sb21;
                        strM13534 = str37;
                        i107 = i159;
                        size = i160;
                        str21 = str36;
                        i102 = i156;
                        i103 = i157;
                        i97 = i163;
                        c8 = c11;
                        bArr2 = bArr7;
                        i95 = i162;
                        i106 = i158;
                        i93 = i164;
                        strM31438 = strM31438;
                        i105 = i105;
                        str22 = str22;
                        str20 = str20;
                        C12558 c1255116 = c125514;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        sb11 = sb11;
                        c149512 = c14955;
                        i101 = i101;
                        i109 = i109;
                        c125514 = c1255116;
                    } else {
                        int iM31621 = C0773.m3169("۠ۗ") ^ i91;
                        int i165 = ((iM31621 ^ i92) * 12849) ^ (-435822241);
                        i94 = iM31621 ^ (-1368500259);
                        i108 = i161;
                        sb10 = sb21;
                        strM31438 = strM31438;
                        strM13534 = str37;
                        i107 = i159;
                        size = i160;
                        str21 = str36;
                        i103 = i157;
                        i105 = i105;
                        c8 = c11;
                        str22 = str22;
                        str20 = str20;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        sb11 = sb11;
                        c149512 = c14955;
                        i101 = i101;
                        i109 = i109;
                        c125514 = c125514;
                        i106 = i158;
                        i93 = i165;
                        c7 = c12;
                        i102 = i156;
                        i97 = i163;
                        bArr2 = bArr7;
                        i95 = i162;
                    }
                    break;
                case 92133708:
                case 1569155208:
                    str20 = str20;
                    str21 = str21;
                    i97 = i97;
                    c8 = c8;
                    i102 = i102;
                    i103 = i103;
                    str22 = str22;
                    i105 = i105;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    i14 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    c7 = c7;
                    i99 = i99;
                    bArr2 = bArr2;
                    i101 = i101;
                    c149512 = c149512;
                    i106 = i106;
                    sb11 = sb11;
                    i95 = i95;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    i100 = 0;
                    if (C2419.m8175(xmlResourceParserC9738.getName(), RunnableC3646.m11809(f59539, 1, 8, i14))) {
                        iM31611 = (i92 - C0773.m3169("ܰ᩷")) * (-37);
                        i25 = ((iM31611 ^ i91) * 2035) ^ 1412898556;
                        i26 = -629619781;
                    } else {
                        iM31611 = C0773.m3169("᩶֫") ^ i91;
                        i25 = ((iM31611 ^ i92) * (-6955)) ^ (-1569003491);
                        i26 = 1794976381;
                    }
                    int i11110 = iM31611 ^ i26;
                    i108 = i14;
                    c7 = c7;
                    sb10 = sb10;
                    i95 = i95;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    i102 = i102;
                    i103 = i103;
                    i106 = i106;
                    i97 = i97;
                    c8 = c8;
                    i94 = i11110;
                    i93 = i25;
                    i99 = i99;
                    i109 = i109;
                    strM31438 = strM31438;
                    c125514 = c125514;
                    i105 = i105;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    str22 = str22;
                    sb11 = sb11;
                    str20 = str20;
                    c149512 = c149512;
                    i101 = i101;
                    bArr2 = bArr2;
                    strM13534 = strM13534;
                    break;
                case 127640384:
                case 1054589844:
                    String str38 = str21;
                    int i166 = i107;
                    int i167 = size;
                    int i168 = i108;
                    StringBuilder sb22 = sb10;
                    int i169 = i95;
                    xmlResourceParserC9734 = xmlResourceParserC9738;
                    int i170 = i109;
                    int next = xmlResourceParserC9734.next();
                    if (next != 1) {
                        iM2763 = (C0773.m3169("ۗ᩵") + i91) * 17;
                        i23 = ((iM2763 ^ i92) * (-10205)) ^ (-1593596606);
                        i24 = 109961333;
                    } else {
                        iM2763 = (i92 - C0619.m2761("ۖۨ")) * (-41);
                        i23 = ((iM2763 ^ i91) * (-25619)) ^ 418216953;
                        i24 = -1262284567;
                    }
                    i20 = iM2763 ^ i24;
                    i98 = next;
                    i93 = i23;
                    i108 = i168;
                    sb10 = sb22;
                    i109 = i170;
                    i95 = i169;
                    i107 = i166;
                    size = i167;
                    str21 = str38;
                    z2 = true;
                    i103 = i103;
                    i106 = i106;
                    c125514 = c125514;
                    c8 = c8;
                    xmlResourceParserC9738 = xmlResourceParserC9734;
                    i99 = i99;
                    sb11 = sb11;
                    strM31438 = strM31438;
                    c149512 = c149512;
                    i105 = i105;
                    str22 = str22;
                    i101 = i101;
                    str20 = str20;
                    bArr2 = bArr2;
                    strM13534 = strM13534;
                    i22 = i97;
                    i94 = i20;
                    c7 = c7;
                    i102 = i102;
                    i97 = i22;
                    break;
                case 308219364:
                case 599959161:
                    str20 = str20;
                    str21 = str21;
                    i97 = i97;
                    c8 = c8;
                    i102 = i102;
                    i103 = i103;
                    str22 = str22;
                    i105 = i105;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    i14 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    c7 = c7;
                    i99 = i99;
                    bArr2 = bArr2;
                    i101 = i101;
                    c149512 = c149512;
                    i106 = i106;
                    sb11 = sb11;
                    i95 = i95;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    i15 = i98;
                    s = f59539[0];
                    if (RunnableC0334.f1808 <= 0) {
                        iM31610 = C0773.m3169("۟᩸") ^ i92;
                        i16 = ((iM31610 ^ i91) * (-1843)) ^ (-155090704);
                        i17 = 1898662436;
                    } else {
                        iM31610 = C0773.m3169("֡ᩳ") ^ i91;
                        i16 = ((iM31610 ^ i92) * 15377) ^ 1663540886;
                        i17 = 247602384;
                    }
                    i21 = iM31610 ^ i17;
                    i98 = i15;
                    i108 = i14;
                    sb10 = sb10;
                    i109 = i109;
                    i95 = i95;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    i103 = i103;
                    i106 = i106;
                    c125514 = c125514;
                    c8 = c8;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    i99 = i99;
                    sb11 = sb11;
                    strM31438 = strM31438;
                    c149512 = c149512;
                    i105 = i105;
                    str22 = str22;
                    i101 = i101;
                    str20 = str20;
                    bArr2 = bArr2;
                    strM13534 = strM13534;
                    i22 = i97;
                    i94 = i21;
                    i93 = i16;
                    c7 = c7;
                    i102 = i102;
                    i97 = i22;
                    break;
                case 352055410:
                case 2101812508:
                    if (C1826.f6190 <= 0) {
                        str20 = str20;
                        str21 = str21;
                        i97 = i97;
                        c8 = c8;
                        i102 = i102;
                        i103 = i103;
                        str22 = str22;
                        i105 = i105;
                        strM13534 = strM13534;
                        i107 = i107;
                        size = size;
                        i14 = i108;
                        sb10 = sb10;
                        strM31438 = strM31438;
                        c7 = c7;
                        i99 = i99;
                        bArr2 = bArr2;
                        i101 = i101;
                        c149512 = c149512;
                        i106 = i106;
                        sb11 = sb11;
                        i95 = i95;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        c125514 = c125514;
                        i109 = i109;
                        i15 = i98;
                        iM31610 = C0773.m3169("۟᩸") ^ i92;
                        i16 = ((iM31610 ^ i91) * (-1843)) ^ (-155090704);
                        i17 = 1898662436;
                        i21 = iM31610 ^ i17;
                        i98 = i15;
                        i108 = i14;
                        sb10 = sb10;
                        i109 = i109;
                        i95 = i95;
                        i107 = i107;
                        size = size;
                        str21 = str21;
                        i103 = i103;
                        i106 = i106;
                        c125514 = c125514;
                        c8 = c8;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        i99 = i99;
                        sb11 = sb11;
                        strM31438 = strM31438;
                        c149512 = c149512;
                        i105 = i105;
                        str22 = str22;
                        i101 = i101;
                        str20 = str20;
                        bArr2 = bArr2;
                        strM13534 = strM13534;
                        i22 = i97;
                        i94 = i21;
                        i93 = i16;
                        c7 = c7;
                        i102 = i102;
                        i97 = i22;
                    } else {
                        iM2769 = (i91 - C0773.m3169("֡֨")) * 29;
                        i85 = ((iM2769 ^ i92) * 17087) ^ 1577363694;
                        i86 = -1538357989;
                        i94 = iM2769 ^ i86;
                        i93 = i85;
                    }
                    break;
                case 419962869:
                case 1860748501:
                    int i171 = i106 * 20;
                    C2702.m8882(bArr3, i109 + 20, bArr3, i109, i171);
                    str12 = strM31438;
                    str8 = str20;
                    str9 = str21;
                    i97 = i97;
                    c4 = c8;
                    i102 = i102;
                    i49 = i103;
                    str10 = str22;
                    c14958 = c149512;
                    c125510 = c125514;
                    str11 = strM13534;
                    i51 = i107;
                    i52 = size;
                    i53 = i108;
                    sb4 = sb10;
                    sb5 = sb11;
                    i54 = i109;
                    c7 = c7;
                    i55 = i171 + i109;
                    xmlResourceParserC9737 = xmlResourceParserC9738;
                    int iM276115 = C0619.m2761("᩹۠") ^ i91;
                    int i1214 = i55;
                    int i1215 = ((iM276115 ^ i92) * (-12553)) ^ 351530993;
                    i84 = iM276115 ^ (-2124902435);
                    str22 = str10;
                    i108 = i53;
                    sb10 = sb4;
                    strM13534 = str11;
                    i107 = i51;
                    size = i52;
                    str20 = str8;
                    str21 = str9;
                    i103 = i49;
                    c8 = c4;
                    xmlResourceParserC9738 = xmlResourceParserC9737;
                    sb11 = sb5;
                    c149512 = c14958;
                    i93 = i1215;
                    i109 = i54;
                    c125514 = c125510;
                    strM31438 = str12;
                    i105 = i1214;
                    i71 = i97;
                    i94 = i84;
                    c7 = c7;
                    i102 = i102;
                    i97 = i71;
                    break;
                case 499175743:
                case 1733048887:
                    if (C0487.f2131 <= 0) {
                        c14959 = c149512;
                        c125513 = c125514;
                        sb6 = sb11;
                        i79 = i109;
                        i80 = i105;
                        str12 = strM31438;
                        i81 = i104;
                        iM31613 = C0619.m2761("ۨ᩻") ^ i91;
                        i104 = i81;
                        i82 = ((iM31613 ^ i92) * 18881) ^ (-642728080);
                        i83 = -1680172291;
                        i94 = iM31613 ^ i83;
                        i109 = i79;
                        c125514 = c125513;
                        String str212 = str12;
                        i105 = i80;
                        sb11 = sb6;
                        c149512 = c14959;
                        i93 = i82;
                        strM31438 = str212;
                    } else {
                        iM2769 = (i91 - C0773.m3169("֡֨")) * 29;
                        i85 = ((iM2769 ^ i92) * 17087) ^ 1577363694;
                        i86 = -1538357989;
                        i94 = iM2769 ^ i86;
                        i93 = i85;
                    }
                    break;
                case 561849490:
                case 1360260348:
                    C1146.m4231();
                    return null;
                case 572769938:
                case 1135462254:
                    if (i95 != 0) {
                        iM2769 = C0619.m2761("ۛᩴ") ^ i92;
                        i85 = ((iM2769 ^ i91) * (-10755)) ^ 544058097;
                        i86 = -1290655685;
                    } else {
                        i89 = i96;
                        iM2769 = (i92 - C0619.m2761("۟ۙ")) * 65;
                        i85 = ((iM2769 ^ i91) * 19567) ^ (-325232309);
                        i86 = 29277610;
                    }
                    i94 = iM2769 ^ i86;
                    i93 = i85;
                    break;
                case 763860766:
                case 1790962890:
                    str20 = str20;
                    str21 = str21;
                    i97 = i97;
                    c8 = c8;
                    i102 = i102;
                    i103 = i103;
                    str22 = str22;
                    i105 = i105;
                    i106 = i106;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    i108 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    c7 = c7;
                    C14955 c149525 = c149512;
                    sb11 = sb11;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    i101 = i101;
                    c14955 = c149525;
                    if (i95 >= i106) {
                        i3 = i96;
                        z = z2;
                        int iM316111 = C0773.m3169("ܰᩴ") ^ i91;
                        i109 = i3;
                        int i1121 = ((iM316111 ^ i92) * 11969) ^ 1570837236;
                        i84 = iM316111 ^ 1929746887;
                        i106 = i106;
                        i93 = i1121;
                        i108 = i108;
                        sb10 = sb10;
                        strM31438 = strM31438;
                        strM13534 = strM13534;
                        i107 = i107;
                        size = size;
                        str21 = str21;
                        i103 = i103;
                        i105 = i105;
                        c8 = c8;
                        str22 = str22;
                        str20 = str20;
                        C12558 c1255117 = c125514;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        sb11 = sb11;
                        c149512 = c14955;
                        i101 = i101;
                        i109 = i109;
                        c125514 = c1255117;
                        i71 = i97;
                        i94 = i84;
                        c7 = c7;
                        i102 = i102;
                        i97 = i71;
                    } else {
                        iM2761 = (C0619.m2761("ܺۢ") ^ i92) * (-73);
                        i = ((iM2761 ^ i91) * (-3025)) ^ (-820004416);
                        i2 = -177558604;
                        i12 = iM2761 ^ i2;
                        i106 = i106;
                        i93 = i;
                        i108 = i108;
                        c7 = c7;
                        sb10 = sb10;
                        strM13534 = strM13534;
                        i107 = i107;
                        size = size;
                        str21 = str21;
                        i102 = i102;
                        i103 = i103;
                        i97 = i97;
                        c8 = c8;
                        i94 = i12;
                        strM31438 = strM31438;
                        i105 = i105;
                        str22 = str22;
                        str20 = str20;
                        C12558 c1255118 = c125514;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        sb11 = sb11;
                        c149512 = c14955;
                        i101 = i101;
                        i109 = i109;
                        c125514 = c1255118;
                    }
                    break;
                case 794640679:
                case 1533007889:
                    i108 = 47067;
                    int iM27623 = C0619.m2761("ۧ۠") ^ i92;
                    i16 = ((iM27623 ^ i91) * 24391) ^ 161458839;
                    i21 = iM27623 ^ (-1024415953);
                    i98 = i98;
                    sb10 = sb10;
                    i109 = i109;
                    i95 = i95;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    i103 = i103;
                    i106 = i106;
                    c125514 = c125514;
                    c8 = c8;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    i99 = i99;
                    sb11 = sb11;
                    strM31438 = strM31438;
                    c149512 = c149512;
                    i105 = i105;
                    str22 = str22;
                    i101 = i101;
                    str20 = str20;
                    bArr2 = bArr2;
                    strM13534 = strM13534;
                    i22 = i97;
                    i94 = i21;
                    i93 = i16;
                    c7 = c7;
                    i102 = i102;
                    i97 = i22;
                    break;
                case 930047915:
                case 1148353454:
                    str20 = str20;
                    str2 = str21;
                    i97 = i97;
                    c = c8;
                    i102 = i102;
                    i4 = i103;
                    str22 = str22;
                    i105 = i105;
                    i5 = i106;
                    str3 = strM13534;
                    i6 = i107;
                    i7 = size;
                    i8 = i108;
                    sb = sb10;
                    strM31438 = strM31438;
                    c7 = c7;
                    i9 = i95;
                    C14955 c149526 = c149512;
                    sb11 = sb11;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    i101 = i101;
                    c14955 = c149526;
                    int i172 = i96 - 32;
                    C0619.m2755(i172, RunnableC3646.m11802(i172, bArr3) + 20, bArr3);
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("۬᩹") ^ i92;
                        i11 = ((iM3169 ^ i91) * 10773) ^ (-1672173595);
                        i13 = 1194264479;
                    } else {
                        iM3169 = (C0619.m2761("ۨۤ") + i92) * 109;
                        i11 = ((iM3169 ^ i91) * (-9189)) ^ (-1007670601);
                        i13 = -1397850748;
                    }
                    i12 = iM3169 ^ i13;
                    i108 = i8;
                    sb10 = sb;
                    i95 = i9;
                    strM13534 = str3;
                    i107 = i6;
                    size = i7;
                    str21 = str2;
                    i106 = i5;
                    i93 = i11;
                    i103 = i4;
                    c7 = c7;
                    c8 = c;
                    i102 = i102;
                    i97 = i97;
                    i94 = i12;
                    strM31438 = strM31438;
                    i105 = i105;
                    str22 = str22;
                    str20 = str20;
                    C12558 c1255119 = c125514;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    sb11 = sb11;
                    c149512 = c14955;
                    i101 = i101;
                    i109 = i109;
                    c125514 = c1255119;
                    break;
                case 1381095377:
                case 1968548058:
                    byte[] bArr8 = bArr2;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    int i173 = i101;
                    c149512 = c149512;
                    int i174 = i99 + 1;
                    i101 = i173;
                    bArr2 = bArr8;
                    i27 = i106;
                    i28 = i174;
                    int iM27624 = C0619.m2761("ܽ֡") ^ i91;
                    i108 = i108;
                    c7 = c7;
                    sb10 = sb10;
                    i95 = i95;
                    i107 = i107;
                    size = size;
                    str21 = str21;
                    i102 = i102;
                    i103 = i103;
                    i106 = i27;
                    i97 = i97;
                    c8 = c8;
                    i99 = i28;
                    i94 = iM27624 ^ 1764309425;
                    i93 = ((iM27624 ^ i92) * (-3725)) ^ (-1049866616);
                    i109 = i109;
                    strM31438 = strM31438;
                    c125514 = c125514;
                    i105 = i105;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    str22 = str22;
                    sb11 = sb11;
                    str20 = str20;
                    c149512 = c149512;
                    i101 = i101;
                    bArr2 = bArr2;
                    strM13534 = strM13534;
                    break;
                case 1433584191:
                case 1500463922:
                    char c13 = c7;
                    str20 = str20;
                    str21 = str21;
                    i97 = i97;
                    char c14 = c8;
                    str22 = str22;
                    int i175 = i105;
                    i106 = i106;
                    strM13534 = strM13534;
                    i107 = i107;
                    size = size;
                    i108 = i108;
                    sb10 = sb10;
                    strM31438 = strM31438;
                    i95 = i95;
                    i99 = i99;
                    bArr2 = bArr2;
                    C14955 c149527 = c149512;
                    sb11 = sb11;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    i101 = i101;
                    c14955 = c149527;
                    if (i101 < i106) {
                        int iM31622 = (C0773.m3169("᩻᩷") + i92) * 31;
                        i103 = -1;
                        i93 = ((iM31622 ^ i91) * (-18961)) ^ 797225016;
                        i94 = iM31622 ^ (-540364300);
                    } else {
                        int iM31623 = (i92 - C0773.m3169("ۤᩴ")) * (-35);
                        i103 = -1;
                        i94 = iM31623 ^ 1041920833;
                        i93 = ((iM31623 ^ i91) * 21343) ^ 1743354471;
                    }
                    c7 = c13;
                    i105 = i175;
                    c8 = c14;
                    i102 = R.attr.name;
                    str22 = str22;
                    str20 = str20;
                    C12558 c12551110 = c125514;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    sb11 = sb11;
                    c149512 = c14955;
                    i101 = i101;
                    i109 = i109;
                    c125514 = c12551110;
                    break;
                default:
                    str20 = str20;
                    str2 = str21;
                    i97 = i97;
                    c = c8;
                    i102 = i102;
                    i4 = i103;
                    str22 = str22;
                    i105 = i105;
                    i5 = i106;
                    str3 = strM13534;
                    i6 = i107;
                    i7 = size;
                    i8 = i108;
                    sb = sb10;
                    strM31438 = strM31438;
                    c7 = c7;
                    i9 = i95;
                    bArr = bArr2;
                    C14955 c149528 = c149512;
                    sb11 = sb11;
                    xmlResourceParserC9738 = xmlResourceParserC9738;
                    c125514 = c125514;
                    i109 = i109;
                    i101 = i101;
                    c14955 = c149528;
                    i96 = iM35997 + xmlResourceParserC9738.f31399;
                    bArr3 = new byte[bArr.length + 20];
                    i10 = i100;
                    C2702.m8882(bArr, i10, bArr3, i10, i96);
                    if (AbstractC0116.m1243() == 0) {
                        i100 = i10;
                        int iM27625 = (C0619.m2761("᩷ܳ") + i91) * (-85);
                        i11 = ((iM27625 ^ i92) * 11765) ^ (-1374942951);
                        i12 = iM27625 ^ 1176517846;
                        bArr2 = bArr;
                        i108 = i8;
                        sb10 = sb;
                        i95 = i9;
                        strM13534 = str3;
                        i107 = i6;
                        size = i7;
                        str21 = str2;
                        i106 = i5;
                        i93 = i11;
                        i103 = i4;
                        c7 = c7;
                        c8 = c;
                        i102 = i102;
                        i97 = i97;
                        i94 = i12;
                        strM31438 = strM31438;
                        i105 = i105;
                        str22 = str22;
                        str20 = str20;
                        C12558 c12551111 = c125514;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        sb11 = sb11;
                        c149512 = c14955;
                        i101 = i101;
                        i109 = i109;
                        c125514 = c12551111;
                    } else {
                        int iM316112 = C0773.m3169("᩵ۗ") ^ i91;
                        i100 = i10;
                        int i11111 = ((iM316112 ^ i92) * (-8239)) ^ 395975377;
                        i84 = iM316112 ^ (-18596620);
                        bArr2 = bArr;
                        i108 = i8;
                        sb10 = sb;
                        i95 = i9;
                        strM13534 = str3;
                        i107 = i6;
                        size = i7;
                        str21 = str2;
                        i106 = i5;
                        i93 = i11111;
                        i103 = i4;
                        strM31438 = strM31438;
                        c8 = c;
                        i105 = i105;
                        str22 = str22;
                        str20 = str20;
                        C12558 c12551112 = c125514;
                        xmlResourceParserC9738 = xmlResourceParserC9738;
                        sb11 = sb11;
                        c149512 = c14955;
                        i101 = i101;
                        i109 = i109;
                        c125514 = c12551112;
                        i71 = i97;
                        i94 = i84;
                        c7 = c7;
                        i102 = i102;
                        i97 = i71;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        int i = 1182750498;
        int i2 = C1542.f5343;
        int i3 = C0269.f1558;
        int iM2761 = C0619.m2761("۟ܽ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 11139) ^ (-1496390933);
        int i5 = 388542278;
        while (true) {
            i = ((((i ^ i2) * 28193) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1927703036:
                case -316654709:
                    if (C3690.m11994(c12187)) {
                        iM2761 = (C0619.m2761("۠ᩳ") ^ i2) * 119;
                        i4 = ((iM2761 ^ i3) * (-28259)) ^ (-1670345707);
                        i5 = -1044175979;
                    } else {
                        iM2761 = C0619.m2761("᩻۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3169)) ^ 187777005;
                        i5 = 378825701;
                    }
                    break;
                case -1879709296:
                case 975816624:
                    C0619.m2762(c8614, C3998.m12926(this.f59541));
                    c8614.m23216();
                    iM2761 = C0619.m2761("᩻۟") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-3169)) ^ 187777005;
                    i5 = 378825701;
                    break;
                case -1769748407:
                case 445861870:
                    if (C2023.f6737) {
                        iM2761 = (i3 - C0619.m2761("᩻۠")) * (-3);
                        i4 = ((iM2761 ^ i2) * (-8719)) ^ 63697549;
                        i5 = -1003107300;
                    } else {
                        iM2761 = C0773.m3169("֨ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1257)) ^ (-1112851211);
                        i5 = 1696471266;
                    }
                    break;
                case -1677868937:
                case -571600292:
                    if (m43863(c8614)) {
                        iM2761 = (C0619.m2761("ᩴ۟") ^ i2) * (-119);
                        i4 = ((iM2761 ^ i3) * 7739) ^ (-993074432);
                        i5 = 1829274863;
                    } else {
                        iM2761 = C0619.m2761("᩻۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3169)) ^ 187777005;
                        i5 = 378825701;
                    }
                    break;
                case -1618166014:
                case 1979288143:
                    if (C2966.f9654 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ᩳۗ")) * (-89);
                        i4 = ((iM2761 ^ i2) * (-13279)) ^ 1055648555;
                        i5 = -659143723;
                    } else {
                        iM2761 = (C0619.m2761("ۙۚ") + i3) * (-47);
                        i4 = ((iM2761 ^ i2) * 2315) ^ 626699566;
                        i5 = -1852231684;
                    }
                    break;
                case -1520010054:
                case 970049598:
                    break;
                case -1241504018:
                case -307506019:
                    C23916.m53419();
                    C3998.m12920();
                    break;
                case -1065813828:
                case 1802606646:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0619.m2761("ܳܽ") ^ i2) * (-39);
                        i4 = ((iM2761 ^ i3) * (-9465)) ^ (-1255512433);
                        i5 = -485929443;
                    } else {
                        iM2761 = C0619.m2761("۟ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7201)) ^ (-1751766664);
                        i5 = -1820963113;
                    }
                    break;
                case -951131099:
                case 2120134676:
                    if (!C0619.f2439) {
                        iM2761 = (C0619.m2761("ܳܽ") ^ i2) * (-39);
                        i4 = ((iM2761 ^ i3) * (-9465)) ^ (-1255512433);
                        i5 = -485929443;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩻۠")) * (-3);
                        i4 = ((iM2761 ^ i2) * (-8719)) ^ 63697549;
                        i5 = -1003107300;
                    }
                    break;
                case -805795316:
                case -636005082:
                    if (C3077.m10041()) {
                        iM2761 = (C0619.m2761("۠ۙ") ^ i3) * 19;
                        i4 = ((iM2761 ^ i2) * 8865) ^ (-782157617);
                        i5 = 1165618743;
                    } else {
                        iM2761 = C0619.m2761("᩸֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * 8371) ^ 793328512;
                        i5 = -789900556;
                    }
                    break;
                case -349463606:
                case 293791790:
                    if (C0773.m3161() != 0) {
                        iM2761 = (C0619.m2761("۠ۙ") ^ i3) * 19;
                        i4 = ((iM2761 ^ i2) * 8865) ^ (-782157617);
                        i5 = 1165618743;
                    } else {
                        iM2761 = (C0773.m3169("ۧ᩷") + i3) * (-59);
                        i4 = ((iM2761 ^ i2) * (-4655)) ^ (-800220072);
                        i5 = -140264320;
                    }
                    break;
                case -197584418:
                case 746548828:
                    if (C1321.f4751 >= 0) {
                        iM2761 = (i3 - C0619.m2761("᩻۠")) * (-3);
                        i4 = ((iM2761 ^ i2) * (-8719)) ^ 63697549;
                        i5 = -1003107300;
                    } else {
                        iM2761 = C0619.m2761("֨ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4265) ^ 328707932;
                        i5 = -1572171219;
                    }
                    break;
                case -5328702:
                case 659837804:
                    if (C2354.m7983()) {
                        iM2761 = C0773.m3169("ᩳ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13445) ^ 1771351321;
                        i5 = 668395952;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ᩳۗ")) * (-89);
                        i4 = ((iM2761 ^ i2) * (-13279)) ^ 1055648555;
                        i5 = -659143723;
                    }
                    break;
                case 568830625:
                case 2016617082:
                    if (C11235.f35427 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ᩳۗ")) * (-89);
                        i4 = ((iM2761 ^ i2) * (-13279)) ^ 1055648555;
                        i5 = -659143723;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩻۠")) * (-3);
                        i4 = ((iM2761 ^ i2) * (-8719)) ^ 63697549;
                        i5 = -1003107300;
                    }
                    break;
                case 825910603:
                case 1868454459:
                    C0619.m2763();
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = C0773.m3169("ۧۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16435) ^ 1657582050;
                        i5 = 1753658973;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ᩳۗ")) * (-89);
                        i4 = ((iM2761 ^ i2) * (-13279)) ^ 1055648555;
                        i5 = -659143723;
                    }
                    break;
                case 946793319:
                case 2009516075:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (i3 - C0619.m2761("᩻۠")) * (-3);
                        i4 = ((iM2761 ^ i2) * (-8719)) ^ 63697549;
                        i5 = -1003107300;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܽۨ")) * (-93);
                        i4 = ((iM2761 ^ i2) * 17869) ^ 1417886937;
                        i5 = 1217772345;
                    }
                    break;
                case 1227016328:
                case 1401087538:
                    C2485.m8357();
                    iM2761 = (i3 - C0619.m2761("᩻۠")) * (-3);
                    i4 = ((iM2761 ^ i2) * (-8719)) ^ 63697549;
                    i5 = -1003107300;
                    break;
                case 1651033842:
                case 1857316862:
                    if (C11235.f35427 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ᩳۗ")) * (-89);
                        i4 = ((iM2761 ^ i2) * (-13279)) ^ 1055648555;
                        i5 = -659143723;
                    } else {
                        iM2761 = (C0619.m2761("ܶ᩻") + i3) * (-59);
                        i4 = ((iM2761 ^ i2) * 19321) ^ (-472064129);
                        i5 = 1187418;
                    }
                    break;
                default:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0773.m3169("ۧۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16435) ^ 1657582050;
                        i5 = 1753658973;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩶ۖ")) * (-9);
                        i4 = ((iM2761 ^ i3) * (-5085)) ^ (-367206324);
                        i5 = -199103082;
                    }
                    break;
            }
            return;
        }
    }
}
