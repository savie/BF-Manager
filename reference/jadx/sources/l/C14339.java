package l;

import android.R;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.io.InputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܳۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06A0 */
/* JADX INFO: loaded from: classes4.dex */
public class C14339 extends AbstractC23941 {

    /* JADX INFO: renamed from: ۢۗ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f46965 = {5588, -7366, -7370, -7367, -7362, -7375, -7374, -7388, -7389, -7370, -7385, -7385, -7365, -7362, -7372, -7370, -7389, -7362, -7368, -7367, -7417, -7370, -7372, -7364, -7370, -7376, -7374, -7305, -7367, -7370, -7366, -7374, -7305, -7362, -7388, -7305, -7367, -7390, -7365, -7365, -7303, -7385, -7370, -7372, -7364, -7370, -7376, -7374, -7362, -7373, -7394, -7367, -7373, -7374, -7377, -7305, -7318, -7318, -7305, -7302, -7322, -7370, -7367, -7373, -7387, -7368, -7362, -7373, -7303, -7370, -7385, -7385, -7303, -7402, -7385, -7385, -7365, -7362, -7372, -7370, -7389, -7362, -7368, -7367, -7303, -7397, -7316, -7361, -7389, -7389, -7385, -7315, -7304, -7304, -7388, -7372, -7361, -7374, -7366, -7370, -7388, -7303, -7370, -7367, -7373, -7387, -7368, -7362, -7373, -7303, -7372, -7368, -7366, -7304, -7370, -7385, -7364, -7304, -7387, -7374, -7388, -7304, -7370, -7367, -7373, -7387, -7368, -7362, -7373, 3215, 21100, -21566, -23345, -29768, 21881, 19815, 8308, -6904, -6905, -6910, -6901, -6911, -6884, -6905, -6903, -6905, -6912, -6868, -6889, -6882, -6897, -6883, -6883, -6899, -6910, -6897, -6883, -6883, -6880, -6897, -6909, -6901, -6910, -6905, -6900, -6884, -6897, -6884, -6889, -6880, -6897, -6909, -6901, -6911, -6884, -6905, -6903, -6905, -6912, -6850, -6897, -6886, -6906, -6901, -6890, -6886, -6884, -6897, -6899, -6886, -6850, -6897, -6886, -6906, -6907, -6901, -6901, -6882, -6865, -6882, -6907, -6851, -6905, -6903, -6868, -6910, -6911, -6899, -6907, -6848, -6886, -6909, -6882, -6865, -6912, -6902, -6884, -6911, -6905, -6902, -6877, -6897, -6912, -6905, -6904, -6901, -6883, -6886, -6848, -6890, -6909, -6910, -6865, -6850, -6875, -6834, -6912, -6911, -6886, -6834, -6883, -6905, -6903, -6912, -6901, -6902, -6878, -6827, -32554, -27262, 25821, -6863, -6907, -6905, -6910, -6910, -6878, -6897, -6912, -6902, -6884, -6911, -6905, -6902, -6847, -6897, -6882, -6882, -6847, -6865, -6882, -6882, -6910, -6905, -6899, -6897, -6886, -6905, -6911, -6912, -6827, -6847, -6897, -6883, -6883, -6901, -6886, -6883, -6847, -6907, -6905, -6910, -6910, -6901, -6884, -6863, -6902, -6901, -6890, -6870, -6885, -6882, -6910, -6905, -6899, -6897, -6886, -6901, -6834, -6899, -6910, -6897, -6883, -6883, -6901, -6883, -6828, -6834, -17282, 26468, 30004, -6910, -6905, -6900, -6851, -6905, -6903, -6912, -6897, -6886, -6885, -6884, -6901, -6875, -6905, -6910, -6910, -6901, -6884, -6848, -6883, -6911, 26749, -21650, -16905, -6847, -6897, -6883, -6883, -6901, -6886, -6883, -6847, -6907, -6905, -6910, -6910, -6901, -6884, -6863, -6897, -6884, -6909, -6848, -6883, -6911, -6910, -6905, -6900, -6847, -6897, -6884, -6909, -6901, -6897, -6900, -6905, -6847, -6910, -6905, -6900, -6847, -6897, -6884, -6909, -6901, -6897, -6900, -6905, -6847, -6910, -6905, -6900, -6910, -6905, -6900, -6847, -6897, -6884, -6909, -6901, -6897, -6900, -6905, -6845, -6888, -6823, -6897, -6847, -6910, -6905, -6900, -6847, -6897, -6884, -6909, -6901, -6897, -6900, -6905, -6845, -6888, -6823, -6897, -6847, -6910, -6905, -6900, -6910, -6905, -6900, -6847, -6897, -6884, -6909, -6824, -6822, -6845, -6888, -6826, -6897, -6847, -6910, -6905, -6900, -30579, -27400, -26778, -6910, -6905, -6900, -6847, -6890, -6826, -6824, -6847, -6910, -6905, -6900, -6910, -6905, -6900, -6847, -6897, -6884, -6909, -6824, -6822, -6845, -6888, -6826, -6897, -6847, -6910, -6905, -6900, -6847, -6890, -6826, -6824, -6863, -6824, -6822, -6847, -6910, -6905, -6900, -6910, -6905, -6900, -6847, -6890, -6826, -6824, -6847, -6847, -6897, -6883, -6883, -6901, -6886, -6883, -6847, -6907, -6905, -6910, -6910, -6901, -6884, -6863, -6897, -6824, -6822, -6910, -6905, -6900, -6847, -6890, -6826, -6824, -6863, -6824, -6822, -6847, -6847, -6897, -6883, -6883, -6901, -6886, -6883, -6847, -6907, -6905, -6910, -6910, -6901, -6884, -6863, -6890, -6826, -6824, -6847, -6897, -6883, -6883, -6901, -6886, -6883, -6847, -6907, -6905, -6910, -6910, -6901, -6884, -6863, -6890, -6824, -6822, 7408, 587, 580, 577, 584, -27626, 27899, 30969, 30460, 27465, 25154};

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f46966;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public String f46967;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f46968;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f46969;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f46970;

    /* JADX WARN: Code duplicated, block: B:38:0x0124 A[PHI: r2 r11 r12 r13
      0x0124: PHI (r2v4 java.lang.String) = 
      (r2v1 java.lang.String)
      (r2v3 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
     binds: [B:37:0x0122, B:21:0x0080, B:15:0x0063, B:13:0x005f, B:7:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r11v3 short[]) = (r11v2 short[]), (r11v1 short[]), (r11v1 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:37:0x0122, B:21:0x0080, B:15:0x0063, B:13:0x005f, B:7:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r12v3 int) = (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:37:0x0122, B:21:0x0080, B:15:0x0063, B:13:0x005f, B:7:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r13v3 int) = (r13v2 int), (r13v1 int), (r13v1 int), (r13v1 int), (r13v1 int) binds: [B:37:0x0122, B:21:0x0080, B:15:0x0063, B:13:0x005f, B:7:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01b2 A[PHI: r3 r7 r8 r9 r14 r15
      0x01b2: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:47:0x01b0, B:25:0x00a3, B:13:0x005f, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:47:0x01b0, B:25:0x00a3, B:13:0x005f, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:47:0x01b0, B:25:0x00a3, B:13:0x005f, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:47:0x01b0, B:25:0x00a3, B:13:0x005f, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r14v3 short[]) = (r14v1 short[]), (r14v2 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:47:0x01b0, B:25:0x00a3, B:13:0x005f, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r15v3 int) = (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int) binds: [B:47:0x01b0, B:25:0x00a3, B:13:0x005f, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x021f A[PHI: r5 r21 r22
      0x021f: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:59:0x021d, B:55:0x0201, B:33:0x0101, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r21v3 int) = (r21v1 int), (r21v1 int), (r21v2 int), (r21v1 int) binds: [B:59:0x021d, B:55:0x0201, B:33:0x0101, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r22v5 char) = (r22v4 char), (r22v3 char), (r22v3 char), (r22v3 char) binds: [B:59:0x021d, B:55:0x0201, B:33:0x0101, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0251 A[PHI: r6 r16
      0x0251: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:63:0x024f, B:51:0x01e4, B:7:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x024f, B:51:0x01e4, B:7:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        int iM11306;
        int i;
        int i2;
        String strM3747 = null;
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
        int i11 = -516561388;
        int i12 = RunnableC3388.f12514;
        int i13 = C1066.f4915;
        int iM11307 = ThreadFactoryC3888.m11306("ۙᩴ") ^ i12;
        int i14 = ((iM11307 ^ i13) * 30037) ^ (-1000293513);
        int i15 = iM11307 ^ 784332998;
        short[] sArr3 = null;
        int i16 = 0;
        int iM45029 = 0;
        char c = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * 20669) >> 31));
            switch (i11) {
                case -2132204327:
                case -1750849558:
                    m41562(ThreadFactoryC3888.m11306(strM3747) ^ 2116894271);
                    break;
                case -1701474807:
                case -39287089:
                    C1377.m4841(this, iM45029 ^ 2097196838);
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("ۙ᩷") ^ i12;
                        i = ((iM11306 ^ i13) * 8269) ^ (-1741854922);
                        i2 = -1057658899;
                    } else {
                        iM11306 = (C19806.m45029("᩷ܽ") ^ i12) * 23;
                        i = ((iM11306 ^ i13) * 20661) ^ 32367733;
                        i2 = 292763527;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -1625595021:
                case 155465691:
                    C0050.m946();
                    iM11306 = (C19806.m45029("ܰ۬") + i12) * (-113);
                    i = ((iM11306 ^ i13) * (-17237)) ^ (-196667739);
                    i2 = 1858886760;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -1548050529:
                case 1351451297:
                    iM45029 = C19806.m45029(C0962.m3747(sArr, i8, i9, i7));
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩷") ^ i12;
                        i = ((iM11306 ^ i13) * 24243) ^ 929864226;
                        i2 = 2077836889;
                    } else {
                        iM11306 = C19806.m45029("ۡܳ") ^ i13;
                        i = ((iM11306 ^ i12) * (-20763)) ^ (-1836128503);
                        i2 = -1743490093;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -1488534181:
                case -103036434:
                    i4 = i3 * i3;
                    i5 = s * s;
                    i6 = 73496329;
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܶ") ^ i13;
                        i = ((iM11306 ^ i12) * 1669) ^ (-1541946176);
                        i2 = 1828256044;
                    } else {
                        iM11306 = (C19806.m45029("ۚ᩷") ^ i12) * (-33);
                        i = ((iM11306 ^ i13) * 17895) ^ 1178015676;
                        i2 = 1437525615;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -1329600574:
                case -293347449:
                    sArr3 = f46965;
                    if (C1398.m4895() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶۠") ^ i13) * (-83);
                        i = ((iM11306 ^ i12) * 23441) ^ (-23062514);
                        i2 = 1807041380;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۘ") ^ i13;
                        i = ((iM11306 ^ i12) * 14333) ^ 1991474602;
                        i2 = 596471156;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -1300099313:
                case -438634172:
                    C2642.m8171();
                    if (C0671.f2816 == 0) {
                        iM11306 = (C19806.m45029("ܰ۬") + i12) * (-113);
                        i = ((iM11306 ^ i13) * (-17237)) ^ (-196667739);
                        i2 = 1858886760;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܶ") ^ i13;
                        i = ((iM11306 ^ i12) * 1669) ^ (-1541946176);
                        i2 = 1828256044;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -1233642654:
                case -226048771:
                    i3 = s + 8573;
                    if (C3722.f13525 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶۠") ^ i13) * (-83);
                        i = ((iM11306 ^ i12) * 23441) ^ (-23062514);
                        i2 = 1807041380;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ֫") ^ i12;
                        i = ((iM11306 ^ i13) * 18963) ^ 1506164938;
                        i2 = 960949584;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -1151810168:
                case 589569976:
                    sArr2 = f46965;
                    i10 = 133;
                    i16 = 3;
                    if (C3286.f12186) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܶ") ^ i13;
                        i = ((iM11306 ^ i12) * 1669) ^ (-1541946176);
                        i2 = 1828256044;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۖ") ^ i13;
                        i = ((iM11306 ^ i12) * 17715) ^ 1872704387;
                        i2 = 747621418;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -921402403:
                case -195751375:
                    int i17 = i5 + i6;
                    if (i4 - (i17 + i17) <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶܳ") ^ i13;
                        i = ((iM11306 ^ i12) * 4143) ^ (-1864221009);
                        i2 = 949323167;
                    } else {
                        iM11306 = (i12 - C19806.m45029("۫ۛ")) * 83;
                        i = ((iM11306 ^ i13) * 11005) ^ (-1135895429);
                        i2 = -199019622;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -806805072:
                case -356145833:
                    s = sArr3[c];
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩷") ^ i12;
                        i = ((iM11306 ^ i13) * 24243) ^ 929864226;
                        i2 = 2077836889;
                    } else {
                        iM11306 = C19806.m45029("ܿ۬") ^ i13;
                        i = ((iM11306 ^ i12) * 22837) ^ (-721500781);
                        i2 = -1757804002;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -173137198:
                case 1228095387:
                    strM3747 = C0962.m3747(sArr2, i10, i16, i7);
                    if (C1189.m4368() <= 0) {
                        iM11306 = (C19806.m45029("ܰ۬") + i12) * (-113);
                        i = ((iM11306 ^ i13) * (-17237)) ^ (-196667739);
                        i2 = 1858886760;
                    } else {
                        iM11306 = (C19806.m45029("۠᩻") + i13) * (-69);
                        i = ((iM11306 ^ i12) * 24457) ^ (-1892997185);
                        i2 = 61630329;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case -147433679:
                case 803454685:
                    C3286.m9798();
                    break;
                case -122543943:
                case 1593145580:
                    C1937.m6279();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (C19806.m45029("ܰ۬") + i12) * (-113);
                        i = ((iM11306 ^ i13) * (-17237)) ^ (-196667739);
                        i2 = 1858886760;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶۠") ^ i13) * (-83);
                        i = ((iM11306 ^ i12) * 23441) ^ (-23062514);
                        i2 = 1807041380;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case 502748289:
                case 1177657283:
                    c = 129;
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩷") ^ i12;
                        i = ((iM11306 ^ i13) * 24243) ^ 929864226;
                        i2 = 2077836889;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۨ") ^ i12;
                        i = ((iM11306 ^ i13) * (-18463)) ^ (-2045095080);
                        i2 = 1959104422;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case 598685426:
                case 1330335079:
                    sArr = f46965;
                    i8 = 130;
                    i9 = 3;
                    if (C0050.f912 <= 0) {
                        iM11306 = (C19806.m45029("ܰ۬") + i12) * (-113);
                        i = ((iM11306 ^ i13) * (-17237)) ^ (-196667739);
                        i2 = 1858886760;
                    } else {
                        iM11306 = (C19806.m45029("ۗܿ") + i12) * (-69);
                        i = ((iM11306 ^ i13) * (-29875)) ^ 1399851689;
                        i2 = 957235132;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case 918372663:
                case 1562987084:
                    i7 = 56305;
                    iM11306 = (i13 - C19806.m45029("ᩳܺ")) * (-79);
                    i = ((iM11306 ^ i12) * (-26913)) ^ 154018509;
                    i2 = -1203679515;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                case 1756909712:
                case 1918213605:
                    RunnableC1895.m6170();
                    if (CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܶ") ^ i13;
                        i = ((iM11306 ^ i12) * 1669) ^ (-1541946176);
                        i2 = 1828256044;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩷") ^ i12;
                        i = ((iM11306 ^ i13) * 24243) ^ 929864226;
                        i2 = 2077836889;
                    }
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
                default:
                    i7 = 19182;
                    iM11306 = (i13 - C19806.m45029("ᩳܺ")) * (-79);
                    i = ((iM11306 ^ i12) * (-26913)) ^ 154018509;
                    i2 = -1203679515;
                    i15 = iM11306 ^ i2;
                    i14 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5722;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0215  */
    /* JADX WARN: Code duplicated, block: B:44:0x02b9 A[PHI: r1 r4
      0x02b9: PHI (r1v118 java.lang.StringBuilder) = (r1v2 java.lang.StringBuilder), (r1v110 java.lang.StringBuilder), (r1v2 java.lang.StringBuilder) binds: [B:267:0x02b9, B:43:0x02b7, B:33:0x020f] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r4v155 java.lang.String) = (r4v2 java.lang.String), (r4v145 java.lang.String), (r4v2 java.lang.String) binds: [B:267:0x02b9, B:43:0x02b7, B:33:0x020f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m34589(InputStream inputStream, String str) throws IOException {
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        int iM45029;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C20945 c20945;
        C17140 c17140;
        char c;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        char c2;
        String strM8240;
        int i14;
        StringBuilder sb;
        int i15;
        int i16;
        int i17;
        String str3;
        String str4;
        int iM450210;
        int i18;
        int i19;
        C17140 c17141;
        int iM450211;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int iM450212;
        int i25;
        int i26;
        C20945 c20946;
        XmlResourceParserC11068 xmlResourceParserC11068;
        int attributeCount;
        int i27;
        String str5;
        int i28;
        char c3;
        int i29;
        int i30;
        int i31;
        String str6;
        int i32;
        int i33;
        int i34;
        StringBuilder sb2;
        char c4;
        int i35;
        int iM450213;
        int i36;
        int i37;
        int iM11307;
        int i38;
        int i39;
        int i40;
        int iM11308;
        int i41;
        int i42;
        int iM11309;
        int i43;
        int i44;
        int i45;
        String str7;
        int i46;
        char c5;
        int i47;
        int i48;
        String str8;
        int i49;
        String str9;
        int i50;
        int i51;
        int i52;
        StringBuilder sb3;
        StringBuilder sb4;
        String str10;
        char c6;
        XmlResourceParserC11068 xmlResourceParserC11069;
        int i53;
        int i54;
        C20945 c20947;
        C17140 c17142;
        String strM940;
        int iM113010;
        int i55;
        int i56;
        String str11;
        char c7;
        int i57;
        C20945 c20948;
        int i58;
        String str12;
        int i59;
        int i60;
        int i61;
        StringBuilder sb5;
        StringBuilder sb6;
        String str13;
        XmlResourceParserC11068 xmlResourceParserC110610;
        C17140 c17143;
        int i62;
        int iM450214;
        int i63;
        int i64;
        int i65;
        C20945 c20949;
        int i66;
        int i67;
        StringBuilder sb7;
        int i68;
        int i69;
        String str14;
        String str15;
        int i70;
        C17140 c17144;
        int iM450215;
        int i71;
        int i72;
        C17140 c17145;
        int i73;
        int i74;
        int iM113011;
        int i75;
        int i76;
        int i77;
        int iM450216;
        int i78;
        int i79;
        boolean z = false;
        int i80 = 0;
        int i81 = 0;
        int i82 = 0;
        int i83 = -9968085;
        int i84 = C0629.f2722;
        int i85 = C1668.f6641;
        int iM450217 = (C19806.m45029("᩻᩻") + i85) * 67;
        int i86 = ((iM450217 ^ i84) * 20481) ^ 1133575936;
        int i87 = iM450217 ^ (-913176885);
        C17140 c17146 = null;
        XmlResourceParserC11068 xmlResourceParserC110611 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        String str16 = null;
        StringBuilder sb8 = null;
        String strM2308 = null;
        String strM50267 = null;
        String strM10427 = null;
        String str17 = null;
        String strM5622 = null;
        StringBuilder sb9 = null;
        char c8 = 0;
        int i88 = 0;
        int i89 = 0;
        int i90 = 0;
        char c9 = 0;
        boolean z2 = false;
        int i91 = 0;
        int attributeCount2 = 0;
        int i92 = 0;
        int i93 = 0;
        int i94 = 0;
        int i95 = 0;
        int i96 = 0;
        int i97 = 0;
        int i98 = 0;
        int i99 = 0;
        byte[] bArr3 = null;
        int i100 = 0;
        int size = 0;
        short s = 0;
        int i101 = 0;
        C20945 c209410 = null;
        String str18 = null;
        int i102 = 0;
        int iM47107 = 0;
        while (true) {
            i83 = i87 ^ (i86 & (((i83 ^ i84) * 17989) >> 31));
            switch (i83) {
                case -2114018469:
                case -2084037682:
                    RunnableC3388.m10064();
                    if (!C2332.f8260) {
                        c20949 = c209410;
                        c17145 = c17146;
                        sb7 = sb9;
                        i73 = i102;
                        i69 = i98;
                        str14 = strM5622;
                        i74 = i97;
                        iM113011 = ThreadFactoryC3888.m11306("᩵ۛ") ^ i84;
                        i97 = i74;
                        i75 = ((iM113011 ^ i85) * (-6789)) ^ 339344245;
                        i76 = -1673429655;
                        i87 = iM113011 ^ i76;
                        i102 = i73;
                        c17146 = c17145;
                        String str19 = str14;
                        i98 = i69;
                        sb9 = sb7;
                        c209410 = c20949;
                        i86 = i75;
                        strM5622 = str19;
                    } else {
                        iM450216 = C19806.m45029("ܽ᩶") ^ i85;
                        i78 = ((iM450216 ^ i84) * (-3853)) ^ 1885126452;
                        i79 = 71983902;
                        i87 = iM450216 ^ i79;
                        i86 = i78;
                    }
                    break;
                case -2089454658:
                case -1468053703:
                    c17146.getItem(xmlResourceParserC110611.m27908(i94)).m30301(str);
                    return c209410.m47111();
                case -2089115426:
                case -674290298:
                    c20949 = c209410;
                    C17140 c17147 = c17146;
                    i66 = i100;
                    i67 = size;
                    sb7 = sb9;
                    i68 = i102;
                    i69 = i98;
                    str14 = strM5622;
                    str3 = str16;
                    str15 = str17;
                    i70 = i101;
                    c17144 = c17147;
                    C1377.m4834(i69, c17144.m10934(C1066.m4040(f46965, 87, 42, i70)), bArr2);
                    i80 = 4;
                    if (C3743.f13569) {
                        iM450215 = C19806.m45029("ۛۤ") ^ i84;
                        i71 = ((iM450215 ^ i85) * (-20159)) ^ (-1386486676);
                        i72 = 81830922;
                    } else {
                        iM450215 = (ThreadFactoryC3888.m11306("۬ۛ") + i84) * 73;
                        i71 = ((iM450215 ^ i85) * 31087) ^ (-1047407989);
                        i72 = 1050004683;
                    }
                    i87 = iM450215 ^ i72;
                    i101 = i70;
                    i102 = i68;
                    i100 = i66;
                    size = i67;
                    str17 = str15;
                    c17146 = c17144;
                    strM5622 = str14;
                    i98 = i69;
                    sb9 = sb7;
                    c209410 = c20949;
                    i86 = i71;
                    str16 = str3;
                    break;
                case -2082737715:
                case 1380339425:
                    byte[] bArr4 = bArr;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    int i103 = i94;
                    c209410 = c209410;
                    int i104 = i92 + 1;
                    i94 = i103;
                    bArr = bArr4;
                    i22 = i99;
                    i23 = i104;
                    int iM450218 = (C19806.m45029("ᩴܺ") ^ i84) * q.h;
                    i101 = i101;
                    c8 = c8;
                    sb8 = sb8;
                    i88 = i88;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    i95 = i95;
                    i96 = i96;
                    i99 = i22;
                    i90 = i90;
                    c9 = c9;
                    i92 = i23;
                    i87 = iM450218 ^ (-945516280);
                    i86 = ((iM450218 ^ i85) * (-16975)) ^ 445658102;
                    i102 = i102;
                    strM5622 = strM5622;
                    c17146 = c17146;
                    i98 = i98;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    str18 = str18;
                    sb9 = sb9;
                    str16 = str16;
                    c209410 = c209410;
                    i94 = i94;
                    bArr = bArr;
                    strM10427 = strM10427;
                    break;
                case -2019552084:
                case -1080019349:
                    C7105.m18985();
                    if (C2642.m8171() == 0) {
                        iM450216 = C19806.m45029("ᩳۨ") ^ i85;
                        i78 = ((iM450216 ^ i84) * 13833) ^ 1248632000;
                        i79 = -1363120619;
                        i87 = iM450216 ^ i79;
                        i86 = i78;
                    } else {
                        c20949 = c209410;
                        c17145 = c17146;
                        sb7 = sb9;
                        i73 = i102;
                        i69 = i98;
                        str14 = strM5622;
                        i74 = i97;
                        iM113011 = ThreadFactoryC3888.m11306("᩵ۛ") ^ i84;
                        i97 = i74;
                        i75 = ((iM113011 ^ i85) * (-6789)) ^ 339344245;
                        i76 = -1673429655;
                        i87 = iM113011 ^ i76;
                        i102 = i73;
                        c17146 = c17145;
                        String str110 = str14;
                        i98 = i69;
                        sb9 = sb7;
                        c209410 = c20949;
                        i86 = i75;
                        strM5622 = str110;
                    }
                    break;
                case -2006134237:
                case -705505088:
                    String str20 = str16;
                    String str21 = str17;
                    int i105 = i90;
                    char c10 = c9;
                    i95 = i95;
                    int i106 = i96;
                    String str22 = str18;
                    int i107 = i98;
                    String str23 = strM10427;
                    int i108 = i100;
                    int i109 = size;
                    int i110 = i101;
                    StringBuilder sb10 = sb8;
                    String str24 = strM5622;
                    c8 = c8;
                    int i111 = i92;
                    byte[] bArr5 = bArr;
                    int i112 = i94;
                    C20945 c209411 = c209410;
                    int i113 = i99;
                    StringBuilder sb11 = sb9;
                    int i114 = i88;
                    XmlResourceParserC11068 xmlResourceParserC110612 = xmlResourceParserC110611;
                    C17140 c17148 = c17146;
                    int i115 = i102;
                    int next = xmlResourceParserC110612.next();
                    if (next != 1) {
                        iM45029 = C19806.m45029("ۖۨ") ^ i84;
                        i5 = ((iM45029 ^ i85) * (-25543)) ^ 61494298;
                        i6 = 621748517;
                    } else {
                        iM45029 = (C19806.m45029("᩶᩹") + i84) * 79;
                        i5 = ((iM45029 ^ i85) * 31173) ^ 1469884437;
                        i6 = 2139830145;
                    }
                    int i116 = iM45029 ^ i6;
                    i91 = next;
                    i86 = i5;
                    i101 = i110;
                    sb8 = sb10;
                    i102 = i115;
                    i88 = i114;
                    i100 = i108;
                    size = i109;
                    str17 = str21;
                    z2 = true;
                    i96 = i106;
                    i99 = i113;
                    c17146 = c17148;
                    c9 = c10;
                    xmlResourceParserC110611 = xmlResourceParserC110612;
                    i92 = i111;
                    sb9 = sb11;
                    strM5622 = str24;
                    c209410 = c209411;
                    i98 = i107;
                    str18 = str22;
                    i94 = i112;
                    str16 = str20;
                    bArr = bArr5;
                    strM10427 = str23;
                    i7 = i105;
                    i87 = i116;
                    c8 = c8;
                    i95 = i95;
                    i90 = i7;
                    break;
                case -1960168064:
                case -453814823:
                    int i117 = i88 * 20;
                    RunnableC3388.m10054(bArr2, i90, bArr2, i89, i117);
                    i82 = i117 + i89;
                    iM450216 = C19806.m45029("۟᩶") ^ i85;
                    i78 = ((iM450216 ^ i84) * 18593) ^ (-1231777735);
                    i79 = 141489254;
                    i87 = iM450216 ^ i79;
                    i86 = i78;
                    break;
                case -1892837717:
                case -1193617551:
                    C1148.m4232();
                    if (C1977.f7413 <= 0) {
                        iM450216 = C19806.m45029("ۡܽ") ^ i84;
                        i78 = ((iM450216 ^ i85) * 15783) ^ 1875666411;
                        i79 = -1306396873;
                    } else {
                        iM450216 = C19806.m45029("ܽ᩶") ^ i85;
                        i78 = ((iM450216 ^ i84) * (-3853)) ^ 1885126452;
                        i79 = 71983902;
                    }
                    i87 = iM450216 ^ i79;
                    i86 = i78;
                    break;
                case -1852187029:
                case 617659792:
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i95 = i95;
                    i96 = i96;
                    str18 = str18;
                    i98 = i98;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    c8 = c8;
                    i92 = i92;
                    bArr = bArr;
                    i94 = i94;
                    c209410 = c209410;
                    i99 = i99;
                    sb9 = sb9;
                    i88 = i88;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    if (C1460.m5058(xmlResourceParserC110611.getName(), C0962.m3747(f46965, 9, 11, i))) {
                        iM450211 = ThreadFactoryC3888.m11306("᩷۫") ^ i85;
                        i20 = ((iM450211 ^ i84) * (-17523)) ^ (-2001958890);
                        i21 = -1829633858;
                        int i118 = iM450211 ^ i21;
                        i101 = i;
                        c8 = c8;
                        sb8 = sb8;
                        i88 = i88;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        i95 = i95;
                        i96 = i96;
                        i99 = i99;
                        i90 = i90;
                        c9 = c9;
                        i87 = i118;
                        i86 = i20;
                        i92 = i92;
                        i102 = i102;
                        strM5622 = strM5622;
                        c17146 = c17146;
                        i98 = i98;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        str18 = str18;
                        sb9 = sb9;
                        str16 = str16;
                        c209410 = c209410;
                        i94 = i94;
                        bArr = bArr;
                        strM10427 = strM10427;
                    }
                    i2 = i91;
                    c17141 = c17146;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    int iM450219 = (C19806.m45029("᩻ۗ") ^ i85) * (-69);
                    i86 = ((iM450219 ^ i84) * (-27009)) ^ 1296019400;
                    i91 = i2;
                    i101 = i;
                    sb8 = sb8;
                    i102 = i102;
                    i88 = i88;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    c17146 = c17141;
                    i96 = i96;
                    i99 = i99;
                    c8 = c8;
                    c9 = c9;
                    i92 = i92;
                    i95 = i95;
                    strM5622 = strM5622;
                    i90 = i90;
                    i87 = iM450219 ^ (-103031983);
                    i98 = i98;
                    sb9 = sb9;
                    str18 = str18;
                    c209410 = c209410;
                    str16 = str16;
                    i94 = i94;
                    bArr = bArr;
                    strM10427 = strM10427;
                    break;
                case -1825540776:
                case -416315638:
                    if (C1025.f4800 < 0) {
                        iM450216 = C19806.m45029("ۡܽ") ^ i84;
                        i78 = ((iM450216 ^ i85) * 15783) ^ 1875666411;
                        i79 = -1306396873;
                    } else {
                        iM450216 = ThreadFactoryC3888.m11306("᩻ۙ") ^ i84;
                        i78 = ((iM450216 ^ i85) * (-12845)) ^ 1495181455;
                        i79 = 612648952;
                    }
                    i87 = iM450216 ^ i79;
                    i86 = i78;
                    break;
                case -1737000689:
                case 1872475510:
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i95 = i95;
                    i96 = i96;
                    str18 = str18;
                    i98 = i98;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    c8 = c8;
                    i92 = i92;
                    bArr = bArr;
                    i94 = i94;
                    c209410 = c209410;
                    i99 = i99;
                    sb9 = sb9;
                    i88 = i88;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    i2 = i91;
                    s = f46965[0];
                    if (C3743.f13569) {
                        iM11306 = (i84 - ThreadFactoryC3888.m11306("۠ۚ")) * 123;
                        i3 = ((iM11306 ^ i85) * (-30723)) ^ 195227220;
                        i4 = -295479507;
                        i8 = iM11306 ^ i4;
                        i91 = i2;
                        i101 = i;
                        sb8 = sb8;
                        i102 = i102;
                        i88 = i88;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        i96 = i96;
                        i99 = i99;
                        c17146 = c17146;
                        c9 = c9;
                    } else {
                        int iM450220 = (i85 - C19806.m45029("ܶܰ")) * (-39);
                        i3 = ((iM450220 ^ i84) * 7183) ^ (-1381816798);
                        i8 = iM450220 ^ 1838659910;
                        i91 = i2;
                        i101 = i;
                        i96 = i96;
                        sb8 = null;
                        i102 = i102;
                        i88 = i88;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        c9 = c9;
                        i99 = i99;
                        c17146 = c17146;
                    }
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    i92 = i92;
                    sb9 = sb9;
                    strM5622 = strM5622;
                    c209410 = c209410;
                    i98 = i98;
                    str18 = str18;
                    i94 = i94;
                    str16 = str16;
                    bArr = bArr;
                    strM10427 = strM10427;
                    i7 = i90;
                    i87 = i8;
                    i86 = i3;
                    c8 = c8;
                    i95 = i95;
                    i90 = i7;
                    break;
                case -1639754331:
                case -1571498475:
                    attributeCount = i99;
                    xmlResourceParserC11068 = xmlResourceParserC110611;
                    int i119 = i94;
                    c20946 = c209410;
                    i27 = i119 + 1;
                    int iM113012 = ThreadFactoryC3888.m11306("֫᩺") ^ i85;
                    i38 = ((iM113012 ^ i84) * 23569) ^ 462988607;
                    i40 = iM113012 ^ (-227544260);
                    i92 = i92;
                    i101 = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    bArr = bArr;
                    i96 = i96;
                    i98 = i98;
                    strM10427 = strM10427;
                    c9 = c9;
                    str18 = str18;
                    str16 = str16;
                    C17140 c17149 = c17146;
                    xmlResourceParserC110611 = xmlResourceParserC11068;
                    sb9 = sb9;
                    c209410 = c20946;
                    i94 = i27;
                    i102 = i102;
                    c17146 = c17149;
                    int i120 = i88;
                    i99 = attributeCount;
                    i86 = i38;
                    i88 = i120;
                    int i121 = i90;
                    i87 = i40;
                    c8 = c8;
                    i95 = i95;
                    i90 = i121;
                    break;
                case -1626015858:
                case 480135451:
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i94 = i94;
                    i95 = i95;
                    i96 = i96;
                    str18 = str18;
                    c209410 = c209410;
                    i98 = i98;
                    i99 = i99;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i101 = i101;
                    sb8 = sb8;
                    z = false;
                    sb9 = sb9;
                    strM5622 = strM5622;
                    c8 = c8;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i45 = i82;
                    int iM450221 = (C19806.m45029("ᩴۗ") + i84) * 75;
                    i102 = i45;
                    int i122 = ((iM450221 ^ i85) * (-20191)) ^ (-1813515750);
                    i9 = iM450221 ^ 453308905;
                    i99 = i99;
                    i86 = i122;
                    i101 = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    i96 = i96;
                    i98 = i98;
                    c9 = c9;
                    str18 = str18;
                    str16 = str16;
                    C17140 c171410 = c17146;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    sb9 = sb9;
                    c209410 = c209410;
                    i94 = i94;
                    i102 = i102;
                    c17146 = c171410;
                    i15 = i90;
                    i87 = i9;
                    c8 = c8;
                    i95 = i95;
                    i90 = i15;
                    break;
                case -1588659313:
                case -1372841451:
                    C2477.m7593();
                    RunnableC1606.m5473();
                    return null;
                case -1448044540:
                case 505835436:
                    str3 = str16;
                    str11 = str17;
                    i90 = i90;
                    c7 = c9;
                    i95 = i95;
                    i57 = i96;
                    str4 = str18;
                    c20948 = c209410;
                    i58 = i98;
                    str12 = strM10427;
                    i59 = i100;
                    i60 = size;
                    i61 = i101;
                    sb5 = sb8;
                    sb6 = sb9;
                    str13 = strM5622;
                    c8 = c8;
                    xmlResourceParserC110610 = xmlResourceParserC110611;
                    c17143 = c17146;
                    i62 = i102;
                    if (!z) {
                        i65 = i62;
                        int iM450222 = (i84 - C19806.m45029("֫ۢ")) * 31;
                        int i123 = i65;
                        int i124 = ((iM450222 ^ i85) * (-16473)) ^ 1465187244;
                        i9 = iM450222 ^ (-1917120779);
                        str18 = str4;
                        i101 = i61;
                        sb8 = sb5;
                        strM10427 = str12;
                        i100 = i59;
                        size = i60;
                        str16 = str3;
                        str17 = str11;
                        i96 = i57;
                        c9 = c7;
                        xmlResourceParserC110611 = xmlResourceParserC110610;
                        sb9 = sb6;
                        c209410 = c20948;
                        i86 = i124;
                        i102 = i62;
                        c17146 = c17143;
                        strM5622 = str13;
                        i98 = i123;
                        i15 = i90;
                        i87 = i9;
                        c8 = c8;
                        i95 = i95;
                        i90 = i15;
                    } else {
                        iM450214 = (C19806.m45029("᩸ۛ") ^ i84) * (-125);
                        i63 = ((iM450214 ^ i85) * 19287) ^ (-1766264718);
                        i64 = -316577146;
                        int i125 = iM450214 ^ i64;
                        xmlResourceParserC110611 = xmlResourceParserC110610;
                        i101 = i61;
                        sb8 = sb5;
                        sb9 = sb6;
                        strM10427 = str12;
                        i100 = i59;
                        size = i60;
                        str17 = str11;
                        c209410 = c20948;
                        i86 = i63;
                        i96 = i57;
                        c8 = c8;
                        c9 = c7;
                        i95 = i95;
                        i90 = i90;
                        i87 = i125;
                        i102 = i62;
                        c17146 = c17143;
                        strM5622 = str13;
                        i98 = i58;
                        str18 = str4;
                        str16 = str3;
                    }
                    break;
                case -1447700633:
                case 974627769:
                    str16 = str16;
                    String str25 = str17;
                    char c11 = c9;
                    int i126 = i95;
                    int i127 = i96;
                    str18 = str18;
                    i98 = i98;
                    int i128 = i99;
                    String str26 = strM10427;
                    int i129 = i100;
                    int i130 = size;
                    int i131 = i101;
                    StringBuilder sb12 = sb8;
                    strM5622 = strM5622;
                    char c12 = c8;
                    int i132 = i88;
                    C20945 c209412 = c209410;
                    sb9 = sb9;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    i94 = i94;
                    c209410 = c209412;
                    int i133 = i89 + 20;
                    byte[] bArr6 = bArr;
                    C0526.m2427(bArr6, i89, bArr2, i133, bArr6.length - i89);
                    if (C2788.f10625 >= 0) {
                        int iM113013 = (ThreadFactoryC3888.m11306("᩺᩶") ^ i84) * 39;
                        int i134 = ((iM113013 ^ i85) * (-25551)) ^ (-1582259064);
                        i87 = iM113013 ^ (-144947285);
                        i101 = i131;
                        c8 = c12;
                        sb8 = sb12;
                        strM10427 = str26;
                        i100 = i129;
                        size = i130;
                        str17 = str25;
                        i95 = i126;
                        i96 = i127;
                        i90 = i133;
                        c9 = c11;
                        bArr = bArr6;
                        i88 = i132;
                        i99 = i128;
                        i86 = i134;
                        strM5622 = strM5622;
                        i98 = i98;
                        str18 = str18;
                        str16 = str16;
                        C17140 c171411 = c17146;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        sb9 = sb9;
                        c209410 = c209410;
                        i94 = i94;
                        i102 = i102;
                        c17146 = c171411;
                    } else {
                        int iM450223 = C19806.m45029("ۖ۠") ^ i85;
                        int i135 = ((iM450223 ^ i84) * (-3123)) ^ 1124438853;
                        i87 = iM450223 ^ 1389540229;
                        i101 = i131;
                        sb8 = sb12;
                        strM5622 = strM5622;
                        strM10427 = str26;
                        i100 = i129;
                        size = i130;
                        str17 = str25;
                        i96 = i127;
                        i98 = i98;
                        c9 = c11;
                        str18 = str18;
                        str16 = str16;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        sb9 = sb9;
                        c209410 = c209410;
                        i94 = i94;
                        i102 = i102;
                        c17146 = c17146;
                        i99 = i128;
                        i86 = i135;
                        c8 = c12;
                        i95 = i126;
                        i90 = i133;
                        bArr = bArr6;
                        i88 = i132;
                    }
                    break;
                case -1309347764:
                case 258966645:
                    str16 = str16;
                    String str27 = str17;
                    i90 = i90;
                    c9 = c9;
                    i95 = i95;
                    int i136 = i96;
                    str18 = str18;
                    int i137 = i98;
                    attributeCount = i99;
                    String str28 = strM10427;
                    int i138 = i100;
                    int i139 = size;
                    int i140 = i101;
                    StringBuilder sb13 = sb8;
                    String str29 = strM5622;
                    c8 = c8;
                    i88 = i88;
                    C20945 c209413 = c209410;
                    sb9 = sb9;
                    xmlResourceParserC11068 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    i27 = i94;
                    c20946 = c209413;
                    C0050.m932(i89 - 8, attributeCount + 1, bArr2);
                    int iM27898 = xmlResourceParserC11068.m27898();
                    if (iM27898 != i136) {
                        iM11307 = C19806.m45029("ۤۖ") ^ i85;
                        i38 = ((iM11307 ^ i84) * (-28391)) ^ 244317366;
                        i39 = 1287293852;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩷ܶ") ^ i85;
                        i38 = ((iM11307 ^ i84) * (-6321)) ^ (-2117250980);
                        i39 = -768174947;
                    }
                    i40 = iM11307 ^ i39;
                    i97 = iM27898;
                    i101 = i140;
                    sb8 = sb13;
                    strM5622 = str29;
                    strM10427 = str28;
                    i100 = i138;
                    size = i139;
                    str17 = str27;
                    i96 = i136;
                    i98 = i137;
                    c9 = c9;
                    str18 = str18;
                    str16 = str16;
                    C17140 c171412 = c17146;
                    xmlResourceParserC110611 = xmlResourceParserC11068;
                    sb9 = sb9;
                    c209410 = c20946;
                    i94 = i27;
                    i102 = i102;
                    c17146 = c171412;
                    int i1210 = i88;
                    i99 = attributeCount;
                    i86 = i38;
                    i88 = i1210;
                    int i1211 = i90;
                    i87 = i40;
                    c8 = c8;
                    i95 = i95;
                    i90 = i1211;
                    break;
                case -1299244003:
                case -658246293:
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i95 = i95;
                    i96 = i96;
                    str18 = str18;
                    i98 = i98;
                    int i141 = i99;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    c8 = c8;
                    i88 = i88;
                    i92 = i92;
                    byte[] bArr7 = bArr;
                    C20945 c209414 = c209410;
                    sb9 = sb9;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    int i142 = i94;
                    c209410 = c209414;
                    i99 = i141;
                    i94 = i142;
                    bArr = bArr7;
                    if (C1460.m5058(xmlResourceParserC110611.getAttributeName(i92), C0050.m940(f46965, 41, 7, i))) {
                        iM450211 = ThreadFactoryC3888.m11306("۫ܿ") ^ i85;
                        i20 = ((iM450211 ^ i84) * (-9193)) ^ 1150866658;
                        i21 = 2078944441;
                    } else {
                        iM450211 = C19806.m45029("ᩳ֫") ^ i84;
                        i20 = ((iM450211 ^ i85) * 29817) ^ (-1197954553);
                        i21 = -1867048815;
                    }
                    int i1110 = iM450211 ^ i21;
                    i101 = i;
                    c8 = c8;
                    sb8 = sb8;
                    i88 = i88;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    i95 = i95;
                    i96 = i96;
                    i99 = i99;
                    i90 = i90;
                    c9 = c9;
                    i87 = i1110;
                    i86 = i20;
                    i92 = i92;
                    i102 = i102;
                    strM5622 = strM5622;
                    c17146 = c17146;
                    i98 = i98;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    str18 = str18;
                    sb9 = sb9;
                    str16 = str16;
                    c209410 = c209410;
                    i94 = i94;
                    bArr = bArr;
                    strM10427 = strM10427;
                    break;
                case -1246470080:
                case 419401319:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (!C0817.f3443) {
                        iM450216 = ThreadFactoryC3888.m11306("᩻ۙ") ^ i84;
                        i78 = ((iM450216 ^ i85) * (-12845)) ^ 1495181455;
                        i79 = 612648952;
                        i87 = iM450216 ^ i79;
                        i86 = i78;
                    } else {
                        str16 = str16;
                        str17 = str17;
                        i90 = i90;
                        c9 = c9;
                        i95 = i95;
                        i96 = i96;
                        str18 = str18;
                        i98 = i98;
                        strM10427 = strM10427;
                        i100 = i100;
                        size = size;
                        i = i101;
                        strM5622 = strM5622;
                        c8 = c8;
                        i92 = i92;
                        bArr = bArr;
                        i94 = i94;
                        c209410 = c209410;
                        i99 = i99;
                        sb9 = sb9;
                        i88 = i88;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        c17146 = c17146;
                        i102 = i102;
                        i2 = i91;
                        int iM450224 = (i85 - C19806.m45029("ܶܰ")) * (-39);
                        i3 = ((iM450224 ^ i84) * 7183) ^ (-1381816798);
                        i8 = iM450224 ^ 1838659910;
                        i91 = i2;
                        i101 = i;
                        i96 = i96;
                        sb8 = null;
                        i102 = i102;
                        i88 = i88;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        c9 = c9;
                        i99 = i99;
                        c17146 = c17146;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        i92 = i92;
                        sb9 = sb9;
                        strM5622 = strM5622;
                        c209410 = c209410;
                        i98 = i98;
                        str18 = str18;
                        i94 = i94;
                        str16 = str16;
                        bArr = bArr;
                        strM10427 = strM10427;
                        i7 = i90;
                        i87 = i8;
                        i86 = i3;
                        c8 = c8;
                        i95 = i95;
                        i90 = i7;
                    }
                    break;
                case -1220382821:
                case 1693013570:
                    str16 = str16;
                    str5 = str17;
                    i28 = i90;
                    c3 = c9;
                    i29 = i95;
                    i30 = i96;
                    str18 = str18;
                    i98 = i98;
                    i31 = i99;
                    str6 = strM10427;
                    i32 = i100;
                    i33 = size;
                    i34 = i101;
                    sb2 = sb8;
                    strM5622 = strM5622;
                    c4 = c8;
                    i35 = i88;
                    C20945 c209415 = c209410;
                    sb9 = sb9;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    i94 = i94;
                    c209410 = c209415;
                    if (xmlResourceParserC110611.getAttributeNameResource(i94) == i29) {
                        iM450213 = (C19806.m45029("ܺۜ") ^ i85) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i36 = ((iM450213 ^ i84) * 28143) ^ (-670283518);
                        i37 = -405907984;
                    } else {
                        iM450213 = (i84 - ThreadFactoryC3888.m11306("᩺۠")) * 13;
                        i36 = ((iM450213 ^ i85) * (-12141)) ^ 76102635;
                        i37 = 1591166099;
                    }
                    i77 = iM450213 ^ i37;
                    i101 = i34;
                    sb8 = sb2;
                    i88 = i35;
                    strM10427 = str6;
                    i100 = i32;
                    size = i33;
                    str17 = str5;
                    i99 = i31;
                    i86 = i36;
                    i96 = i30;
                    c8 = c4;
                    c9 = c3;
                    i95 = i29;
                    i90 = i28;
                    i87 = i77;
                    strM5622 = strM5622;
                    i98 = i98;
                    str18 = str18;
                    str16 = str16;
                    C17140 c171413 = c17146;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    sb9 = sb9;
                    c209410 = c209410;
                    i94 = i94;
                    i102 = i102;
                    c17146 = c171413;
                    break;
                case -1205024221:
                case 481138490:
                    str3 = str16;
                    String str30 = str17;
                    int i143 = i90;
                    char c13 = c9;
                    int i144 = i95;
                    int i145 = i96;
                    str4 = str18;
                    int i146 = i98;
                    String str31 = strM10427;
                    int i147 = i100;
                    int i148 = size;
                    int i149 = i101;
                    StringBuilder sb14 = sb8;
                    String str32 = strM5622;
                    char c14 = c8;
                    int i150 = i92;
                    byte[] bArr8 = bArr;
                    int i151 = i94;
                    C20945 c209416 = c209410;
                    int i152 = i99;
                    StringBuilder sb15 = sb9;
                    int i153 = i88;
                    XmlResourceParserC11068 xmlResourceParserC110613 = xmlResourceParserC110611;
                    C17140 c171414 = c17146;
                    int i154 = i102;
                    int i155 = i91;
                    short s2 = s;
                    int i156 = s2 + 17612;
                    if ((i156 * i156) - (s2 * 70448) >= 0) {
                        iM450210 = C19806.m45029("ۗ۬") ^ i85;
                        i18 = ((iM450210 ^ i84) * 22317) ^ (-1709700531);
                        i19 = -953201888;
                    } else {
                        iM450210 = (C19806.m45029("ۨۗ") + i84) * (-45);
                        i18 = ((iM450210 ^ i85) * 22721) ^ 371980519;
                        i19 = 1002711997;
                    }
                    int i157 = iM450210 ^ i19;
                    i91 = i155;
                    s = s2;
                    i101 = i149;
                    c8 = c14;
                    sb8 = sb14;
                    i102 = i154;
                    i100 = i147;
                    size = i148;
                    str17 = str30;
                    i95 = i144;
                    i96 = i145;
                    c17146 = c171414;
                    i90 = i143;
                    c9 = c13;
                    xmlResourceParserC110611 = xmlResourceParserC110613;
                    i87 = i157;
                    i86 = i18;
                    sb9 = sb15;
                    i88 = i153;
                    i99 = i152;
                    c209410 = c209416;
                    i92 = i150;
                    i94 = i151;
                    strM5622 = str32;
                    bArr = bArr8;
                    i98 = i146;
                    strM10427 = str31;
                    str18 = str4;
                    str16 = str3;
                    break;
                case -1171684472:
                case 1874383103:
                    if (i88 != 0) {
                        iM450216 = (C19806.m45029("ܺ᩸") + i85) * 127;
                        i78 = ((iM450216 ^ i84) * (-9635)) ^ (-939930126);
                        i79 = -1031474502;
                    } else {
                        i82 = i89;
                        iM450216 = C19806.m45029("۟᩶") ^ i85;
                        i78 = ((iM450216 ^ i84) * 18593) ^ (-1231777735);
                        i79 = 141489254;
                    }
                    i87 = iM450216 ^ i79;
                    i86 = i78;
                    break;
                case -1158284213:
                case 718064374:
                    throw new NullPointerException(RunnableC1895.m6164(f46965, 20, 21, i101));
                case -1148555406:
                case 355827153:
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i24 = attributeCount2;
                    i95 = i95;
                    i96 = i96;
                    str18 = str18;
                    i98 = i98;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    c8 = c8;
                    i92 = i92;
                    bArr = bArr;
                    i94 = i94;
                    c209410 = c209410;
                    i99 = i99;
                    sb9 = sb9;
                    i88 = i88;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    if (i92 >= i24) {
                        attributeCount2 = i24;
                        i2 = i91;
                        c17141 = c17146;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        int iM4502110 = (C19806.m45029("᩻ۗ") ^ i85) * (-69);
                        i86 = ((iM4502110 ^ i84) * (-27009)) ^ 1296019400;
                        i91 = i2;
                        i101 = i;
                        sb8 = sb8;
                        i102 = i102;
                        i88 = i88;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        c17146 = c17141;
                        i96 = i96;
                        i99 = i99;
                        c8 = c8;
                        c9 = c9;
                        i92 = i92;
                        i95 = i95;
                        strM5622 = strM5622;
                        i90 = i90;
                        i87 = iM4502110 ^ (-103031983);
                        i98 = i98;
                        sb9 = sb9;
                        str18 = str18;
                        c209410 = c209410;
                        str16 = str16;
                        i94 = i94;
                        bArr = bArr;
                        strM10427 = strM10427;
                    } else {
                        iM450212 = C19806.m45029("᩶ۖ") ^ i84;
                        i25 = ((iM450212 ^ i85) * 7971) ^ (-744094809);
                        i26 = -1578895367;
                        int i158 = iM450212 ^ i26;
                        attributeCount2 = i24;
                        i86 = i25;
                        i101 = i;
                        c8 = c8;
                        sb8 = sb8;
                        i88 = i88;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        i95 = i95;
                        i96 = i96;
                        i99 = i99;
                        i90 = i90;
                        c9 = c9;
                        i87 = i158;
                        i92 = i92;
                        i102 = i102;
                        strM5622 = strM5622;
                        c17146 = c17146;
                        i98 = i98;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        str18 = str18;
                        sb9 = sb9;
                        str16 = str16;
                        c209410 = c209410;
                        i94 = i94;
                        bArr = bArr;
                        strM10427 = strM10427;
                    }
                    break;
                case -1128375610:
                case -608126095:
                    c209410 = c209410;
                    i88 = 0;
                    iM11309 = (C19806.m45029("۟ۤ") ^ i84) * 97;
                    i43 = ((iM11309 ^ i85) * (-12651)) ^ (-79573016);
                    i44 = 1188036920;
                    i77 = iM11309 ^ i44;
                    i99 = i99;
                    i86 = i43;
                    i101 = i101;
                    c8 = c8;
                    sb8 = sb8;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    i95 = i95;
                    i96 = i96;
                    i90 = i90;
                    c9 = c9;
                    i87 = i77;
                    strM5622 = strM5622;
                    i98 = i98;
                    str18 = str18;
                    str16 = str16;
                    C17140 c171415 = c17146;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    sb9 = sb9;
                    c209410 = c209410;
                    i94 = i94;
                    i102 = i102;
                    c17146 = c171415;
                    break;
                case -1106399539:
                case -762471761:
                    strM5622 = C1694.m5622(new StringBuilder(), this.f46969, str16, strM50267);
                    sb9 = new StringBuilder(strM2308);
                    if (C7105.f23796 >= 0) {
                        iM450216 = ThreadFactoryC3888.m11306("᩻ۙ") ^ i84;
                        i78 = ((iM450216 ^ i85) * (-12845)) ^ 1495181455;
                        i79 = 612648952;
                    } else {
                        iM450216 = C19806.m45029("᩻֡") ^ i84;
                        i78 = ((iM450216 ^ i85) * (-31327)) ^ 1229962944;
                        i79 = 619566971;
                    }
                    i87 = iM450216 ^ i79;
                    i86 = i78;
                    break;
                case -1096732892:
                case 966912533:
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i95 = i95;
                    i96 = i96;
                    str18 = str18;
                    i98 = i98;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    c8 = c8;
                    i92 = i92;
                    bArr = bArr;
                    i94 = i94;
                    c209410 = c209410;
                    i99 = i99;
                    sb9 = sb9;
                    i88 = i88;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    i93 = 0;
                    if (AbstractC0464.m2315(xmlResourceParserC110611.getName(), C0216.m1588(f46965, 1, 8, i))) {
                        iM450211 = (i84 - C19806.m45029("֡۟")) * (-111);
                        i20 = ((iM450211 ^ i85) * 11975) ^ (-76888963);
                        i21 = -884651268;
                    } else {
                        iM450211 = C19806.m45029("ۘ۬") ^ i85;
                        i20 = ((iM450211 ^ i84) * (-13597)) ^ 904401654;
                        i21 = -1280669157;
                    }
                    int i1111 = iM450211 ^ i21;
                    i101 = i;
                    c8 = c8;
                    sb8 = sb8;
                    i88 = i88;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    i95 = i95;
                    i96 = i96;
                    i99 = i99;
                    i90 = i90;
                    c9 = c9;
                    i87 = i1111;
                    i86 = i20;
                    i92 = i92;
                    i102 = i102;
                    strM5622 = strM5622;
                    c17146 = c17146;
                    i98 = i98;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    str18 = str18;
                    sb9 = sb9;
                    str16 = str16;
                    c209410 = c209410;
                    i94 = i94;
                    bArr = bArr;
                    strM10427 = strM10427;
                    break;
                case -1045106770:
                case -292217627:
                    c20946 = c209410;
                    xmlResourceParserC11068 = xmlResourceParserC110611;
                    attributeCount = xmlResourceParserC11068.getAttributeCount();
                    i27 = 0;
                    int iM113014 = ThreadFactoryC3888.m11306("֫᩺") ^ i85;
                    i38 = ((iM113014 ^ i84) * 23569) ^ 462988607;
                    i40 = iM113014 ^ (-227544260);
                    i92 = i92;
                    i101 = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    bArr = bArr;
                    i96 = i96;
                    i98 = i98;
                    strM10427 = strM10427;
                    c9 = c9;
                    str18 = str18;
                    str16 = str16;
                    C17140 c171416 = c17146;
                    xmlResourceParserC110611 = xmlResourceParserC11068;
                    sb9 = sb9;
                    c209410 = c20946;
                    i94 = i27;
                    i102 = i102;
                    c17146 = c171416;
                    int i1212 = i88;
                    i99 = attributeCount;
                    i86 = i38;
                    i88 = i1212;
                    int i1213 = i90;
                    i87 = i40;
                    c8 = c8;
                    i95 = i95;
                    i90 = i1213;
                    break;
                case -1034791641:
                case 465778361:
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i95 = i95;
                    i96 = i96;
                    str18 = str18;
                    i98 = i98;
                    i99 = i99;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i101 = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    c8 = c8;
                    C20945 c209417 = c209410;
                    sb9 = sb9;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    i94 = i94;
                    c209410 = c209417;
                    if (i88 >= i99) {
                        i45 = i89;
                        z = z2;
                        int iM450225 = (C19806.m45029("ᩴۗ") + i84) * 75;
                        i102 = i45;
                        int i1214 = ((iM450225 ^ i85) * (-20191)) ^ (-1813515750);
                        i9 = iM450225 ^ 453308905;
                        i99 = i99;
                        i86 = i1214;
                        i101 = i101;
                        sb8 = sb8;
                        strM5622 = strM5622;
                        strM10427 = strM10427;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        i96 = i96;
                        i98 = i98;
                        c9 = c9;
                        str18 = str18;
                        str16 = str16;
                        C17140 c171417 = c17146;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        sb9 = sb9;
                        c209410 = c209410;
                        i94 = i94;
                        i102 = i102;
                        c17146 = c171417;
                        i15 = i90;
                        i87 = i9;
                        c8 = c8;
                        i95 = i95;
                        i90 = i15;
                    } else {
                        iM11309 = (i85 - ThreadFactoryC3888.m11306("ۧ᩻")) * (-29);
                        i43 = ((iM11309 ^ i84) * 29911) ^ 1257107958;
                        i44 = -799302520;
                        i77 = iM11309 ^ i44;
                        i99 = i99;
                        i86 = i43;
                        i101 = i101;
                        c8 = c8;
                        sb8 = sb8;
                        strM10427 = strM10427;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        i95 = i95;
                        i96 = i96;
                        i90 = i90;
                        c9 = c9;
                        i87 = i77;
                        strM5622 = strM5622;
                        i98 = i98;
                        str18 = str18;
                        str16 = str16;
                        C17140 c171418 = c17146;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        sb9 = sb9;
                        c209410 = c209410;
                        i94 = i94;
                        i102 = i102;
                        c17146 = c171418;
                    }
                    break;
                case -978811440:
                case 779703176:
                    str16 = str16;
                    str5 = str17;
                    i28 = i90;
                    c3 = c9;
                    i29 = i95;
                    i30 = i96;
                    str18 = str18;
                    i98 = i98;
                    i31 = i99;
                    str6 = strM10427;
                    i32 = i100;
                    i33 = size;
                    i34 = i101;
                    sb2 = sb8;
                    strM5622 = strM5622;
                    c4 = c8;
                    i35 = i88;
                    C20945 c209418 = c209410;
                    sb9 = sb9;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    i94 = i94;
                    c209410 = c209418;
                    int i159 = i89 - 32;
                    C1377.m4834(i159, RunnableC1564.m5351(i159, bArr2) + 20, bArr2);
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM450213 = (ThreadFactoryC3888.m11306("ۧ֨") + i85) * (-103);
                        i36 = ((iM450213 ^ i84) * (-7957)) ^ 272450027;
                        i37 = -1299032021;
                    } else {
                        iM450213 = C19806.m45029("ۖۘ") ^ i84;
                        i36 = ((iM450213 ^ i85) * (-20405)) ^ 1690421994;
                        i37 = -1566836150;
                    }
                    i77 = iM450213 ^ i37;
                    i101 = i34;
                    sb8 = sb2;
                    i88 = i35;
                    strM10427 = str6;
                    i100 = i32;
                    size = i33;
                    str17 = str5;
                    i99 = i31;
                    i86 = i36;
                    i96 = i30;
                    c8 = c4;
                    c9 = c3;
                    i95 = i29;
                    i90 = i28;
                    i87 = i77;
                    strM5622 = strM5622;
                    i98 = i98;
                    str18 = str18;
                    str16 = str16;
                    C17140 c171419 = c17146;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    sb9 = sb9;
                    c209410 = c209410;
                    i94 = i94;
                    i102 = i102;
                    c17146 = c171419;
                    break;
                case -891484796:
                case 1732041817:
                    c20949 = c209410;
                    C17140 c171420 = c17146;
                    sb7 = sb9;
                    i68 = i102;
                    i69 = i98;
                    int i160 = i100;
                    str14 = strM5622;
                    int i161 = size;
                    C1377.m4834(i160, i161, bArr2);
                    i66 = i160;
                    i67 = i161;
                    C1377.m4834(i69 + 12, 50331656, bArr2);
                    i81 = 16;
                    if (C3660.f13403 < 0) {
                        int iM113015 = ThreadFactoryC3888.m11306("ۧ᩹") ^ i85;
                        i75 = ((iM113015 ^ i84) * 32573) ^ (-1012331192);
                        i87 = iM113015 ^ 2041600490;
                        i102 = i68;
                        c17146 = c171420;
                        i100 = i66;
                        size = i67;
                        String str111 = str14;
                        i98 = i69;
                        sb9 = sb7;
                        c209410 = c20949;
                        i86 = i75;
                        strM5622 = str111;
                    } else {
                        str3 = str16;
                        str15 = str17;
                        c17144 = c171420;
                        i70 = i101;
                        iM450215 = (ThreadFactoryC3888.m11306("۬ۛ") + i84) * 73;
                        i71 = ((iM450215 ^ i85) * 31087) ^ (-1047407989);
                        i72 = 1050004683;
                        i87 = iM450215 ^ i72;
                        i101 = i70;
                        i102 = i68;
                        i100 = i66;
                        size = i67;
                        str17 = str15;
                        c17146 = c17144;
                        strM5622 = str14;
                        i98 = i69;
                        sb9 = sb7;
                        c209410 = c20949;
                        i86 = i71;
                        str16 = str3;
                    }
                    break;
                case -743182580:
                case 125170601:
                    str3 = str16;
                    str11 = str17;
                    i90 = i90;
                    c7 = c9;
                    i57 = i96;
                    str4 = str18;
                    c20948 = c209410;
                    i58 = i98;
                    str12 = strM10427;
                    i59 = i100;
                    i60 = size;
                    i61 = i101;
                    sb5 = sb8;
                    sb6 = sb9;
                    str13 = strM5622;
                    xmlResourceParserC110610 = xmlResourceParserC110611;
                    c17143 = c17146;
                    i62 = i102;
                    i95 = i95;
                    if (xmlResourceParserC110610.getAttributeNameResource(i88) > i95) {
                        iM450214 = (ThreadFactoryC3888.m11306("۠᩺") ^ i85) * 31;
                        c8 = c8;
                        i63 = ((iM450214 ^ i84) * 19455) ^ (-991955498);
                        i64 = -303047149;
                    } else {
                        c8 = c8;
                        iM450214 = (i84 - C19806.m45029("ۤܺ")) * (-41);
                        i63 = ((iM450214 ^ i85) * (-13381)) ^ (-1589569429);
                        i64 = -1504971162;
                    }
                    int i1215 = iM450214 ^ i64;
                    xmlResourceParserC110611 = xmlResourceParserC110610;
                    i101 = i61;
                    sb8 = sb5;
                    sb9 = sb6;
                    strM10427 = str12;
                    i100 = i59;
                    size = i60;
                    str17 = str11;
                    c209410 = c20948;
                    i86 = i63;
                    i96 = i57;
                    c8 = c8;
                    c9 = c7;
                    i95 = i95;
                    i90 = i90;
                    i87 = i1215;
                    i102 = i62;
                    c17146 = c17143;
                    strM5622 = str13;
                    i98 = i58;
                    str18 = str4;
                    str16 = str3;
                    break;
                case -732373008:
                case 605189458:
                    str16 = str16;
                    str18 = str18;
                    c20945 = c209410;
                    i98 = i98;
                    i10 = i100;
                    i11 = size;
                    i12 = i101;
                    sb9 = sb9;
                    strM5622 = strM5622;
                    c17140 = c17146;
                    StringBuilder sb16 = sb8;
                    i13 = i102;
                    String str33 = strM10427;
                    C1148.m4223(sb16, str33);
                    str2 = str33;
                    i90 = i90;
                    c2 = c9;
                    strM8240 = C2704.m8240(f46965, 86, 1, i12);
                    C2788.m8480(sb16, strM8240);
                    this.f46967 = C0817.m3407(sb16);
                    i14 = i96;
                    if (C3577.m10572(strM50267, c8) != i14) {
                        sb = sb16;
                        int iM450226 = C19806.m45029("ۧۧ") ^ i85;
                        i16 = ((iM450226 ^ i84) * 6153) ^ (-1050253493);
                        i17 = iM450226 ^ (-1424290046);
                        i101 = i12;
                        sb8 = sb;
                        strM10427 = str2;
                        i100 = i10;
                        size = i11;
                        str17 = strM8240;
                        i96 = i14;
                        i102 = i13;
                        c9 = c2;
                        c17146 = c17140;
                        strM5622 = strM5622;
                        i98 = i98;
                        str18 = str18;
                        str16 = str16;
                        i7 = i90;
                        i87 = i17;
                        sb9 = sb9;
                        c209410 = c20945;
                        i86 = i16;
                        i90 = i7;
                    } else {
                        int iM450227 = C19806.m45029("ۖ۟") ^ i84;
                        i101 = i12;
                        sb8 = sb16;
                        strM10427 = str2;
                        i100 = i10;
                        size = i11;
                        str17 = strM8240;
                        i96 = i14;
                        i102 = i13;
                        c9 = c2;
                        c17146 = c17140;
                        strM5622 = strM5622;
                        i98 = i98;
                        str18 = str18;
                        str16 = str16;
                        i86 = ((iM450227 ^ i85) * (-29019)) ^ 233876600;
                        sb9 = sb9;
                        c209410 = c20945;
                        i15 = i90;
                        i87 = iM450227 ^ (-1386044224);
                        i90 = i15;
                    }
                    break;
                case -729121529:
                case 1695929740:
                    char c15 = c8;
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    char c16 = c9;
                    str18 = str18;
                    int i162 = i98;
                    i99 = i99;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i101 = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    i88 = i88;
                    i92 = i92;
                    bArr = bArr;
                    C20945 c209419 = c209410;
                    sb9 = sb9;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    i94 = i94;
                    c209410 = c209419;
                    if (i94 < i99) {
                        int iM450228 = C19806.m45029("᩸۫") ^ i84;
                        i96 = -1;
                        i86 = ((iM450228 ^ i85) * 27357) ^ (-162429871);
                        i87 = iM450228 ^ 2005253621;
                    } else {
                        int iM450229 = (i84 - C19806.m45029("۠ۘ")) * (-49);
                        i96 = -1;
                        i87 = iM450229 ^ 832316036;
                        i86 = ((iM450229 ^ i85) * 28733) ^ 228209819;
                    }
                    c8 = c15;
                    i98 = i162;
                    c9 = c16;
                    i95 = R.attr.name;
                    str18 = str18;
                    str16 = str16;
                    C17140 c1714110 = c17146;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    sb9 = sb9;
                    c209410 = c209410;
                    i94 = i94;
                    i102 = i102;
                    c17146 = c1714110;
                    break;
                case -415274853:
                case 2025753623:
                    if (!C0817.f3443) {
                        iM450216 = C19806.m45029("ᩳۨ") ^ i85;
                        i78 = ((iM450216 ^ i84) * 13833) ^ 1248632000;
                        i79 = -1363120619;
                        i87 = iM450216 ^ i79;
                        i86 = i78;
                    } else {
                        str16 = str16;
                        str5 = str17;
                        i28 = i90;
                        c3 = c9;
                        i29 = i95;
                        i30 = i96;
                        str18 = str18;
                        i98 = i98;
                        i31 = i99;
                        str6 = strM10427;
                        i32 = i100;
                        i33 = size;
                        i34 = i101;
                        sb2 = sb8;
                        strM5622 = strM5622;
                        c4 = c8;
                        i35 = i88;
                        C20945 c209420 = c209410;
                        sb9 = sb9;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        c17146 = c17146;
                        i102 = i102;
                        i94 = i94;
                        c209410 = c209420;
                        iM450213 = (ThreadFactoryC3888.m11306("ۧ֨") + i85) * (-103);
                        i36 = ((iM450213 ^ i84) * (-7957)) ^ 272450027;
                        i37 = -1299032021;
                        i77 = iM450213 ^ i37;
                        i101 = i34;
                        sb8 = sb2;
                        i88 = i35;
                        strM10427 = str6;
                        i100 = i32;
                        size = i33;
                        str17 = str5;
                        i99 = i31;
                        i86 = i36;
                        i96 = i30;
                        c8 = c4;
                        c9 = c3;
                        i95 = i29;
                        i90 = i28;
                        i87 = i77;
                        strM5622 = strM5622;
                        i98 = i98;
                        str18 = str18;
                        str16 = str16;
                        C17140 c1714111 = c17146;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        sb9 = sb9;
                        c209410 = c209410;
                        i94 = i94;
                        i102 = i102;
                        c17146 = c1714111;
                    }
                    break;
                case -326099566:
                case 1647933705:
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i95 = i95;
                    i96 = i96;
                    str18 = str18;
                    i98 = i98;
                    int i163 = i99;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    c8 = c8;
                    i88 = i88;
                    i92 = i92;
                    byte[] bArr9 = bArr;
                    C20945 c209421 = c209410;
                    sb9 = sb9;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    int i164 = i94;
                    c209410 = c209421;
                    this.f46969 = xmlResourceParserC110611.getAttributeValue(i92);
                    i99 = i163;
                    i94 = i164;
                    bArr = bArr9;
                    iM450211 = C19806.m45029("ᩳ֫") ^ i84;
                    i20 = ((iM450211 ^ i85) * 29817) ^ (-1197954553);
                    i21 = -1867048815;
                    int i1112 = iM450211 ^ i21;
                    i101 = i;
                    c8 = c8;
                    sb8 = sb8;
                    i88 = i88;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    i95 = i95;
                    i96 = i96;
                    i99 = i99;
                    i90 = i90;
                    c9 = c9;
                    i87 = i1112;
                    i86 = i20;
                    i92 = i92;
                    i102 = i102;
                    strM5622 = strM5622;
                    c17146 = c17146;
                    i98 = i98;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    str18 = str18;
                    sb9 = sb9;
                    str16 = str16;
                    c209410 = c209410;
                    i94 = i94;
                    bArr = bArr;
                    strM10427 = strM10427;
                    break;
                case -288733945:
                case 1679471754:
                    C1377.m4834(i98 + i81, c17146.size(), bArr2);
                    C20945 c209422 = c209410;
                    c209422.m47110(bArr2);
                    c17146.m40063(str);
                    return c209422.m47111();
                case -283594840:
                case 912272179:
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i95 = i95;
                    i96 = i96;
                    str18 = str18;
                    i98 = i98;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    c8 = c8;
                    i92 = i92;
                    bArr = bArr;
                    i94 = i94;
                    c209410 = c209410;
                    i99 = i99;
                    sb9 = sb9;
                    i88 = i88;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    i2 = i91;
                    if (i2 == 2) {
                        iM11306 = C19806.m45029("ۨ֫") ^ i85;
                        i3 = ((iM11306 ^ i84) * (-7819)) ^ 838317385;
                        i4 = 702224504;
                        i8 = iM11306 ^ i4;
                        i91 = i2;
                        i101 = i;
                        sb8 = sb8;
                        i102 = i102;
                        i88 = i88;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        i96 = i96;
                        i99 = i99;
                        c17146 = c17146;
                        c9 = c9;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        i92 = i92;
                        sb9 = sb9;
                        strM5622 = strM5622;
                        c209410 = c209410;
                        i98 = i98;
                        str18 = str18;
                        i94 = i94;
                        str16 = str16;
                        bArr = bArr;
                        strM10427 = strM10427;
                        i7 = i90;
                        i87 = i8;
                        i86 = i3;
                        c8 = c8;
                        i95 = i95;
                        i90 = i7;
                    } else {
                        c17141 = c17146;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        int iM4502111 = (C19806.m45029("᩻ۗ") ^ i85) * (-69);
                        i86 = ((iM4502111 ^ i84) * (-27009)) ^ 1296019400;
                        i91 = i2;
                        i101 = i;
                        sb8 = sb8;
                        i102 = i102;
                        i88 = i88;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        c17146 = c17141;
                        i96 = i96;
                        i99 = i99;
                        c8 = c8;
                        c9 = c9;
                        i92 = i92;
                        i95 = i95;
                        strM5622 = strM5622;
                        i90 = i90;
                        i87 = iM4502111 ^ (-103031983);
                        i98 = i98;
                        sb9 = sb9;
                        str18 = str18;
                        c209410 = c209410;
                        str16 = str16;
                        i94 = i94;
                        bArr = bArr;
                        strM10427 = strM10427;
                    }
                    break;
                case -282797717:
                case -188918889:
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i96 = i96;
                    str18 = str18;
                    c20945 = c209410;
                    i98 = i98;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i = i101;
                    sb9 = sb9;
                    strM5622 = strM5622;
                    c17140 = c17146;
                    i102 = i102;
                    strM2308 = AbstractC0464.m2308(f46965, 85, 1, i);
                    if (C1461.f5957 <= 0) {
                        i2 = i91;
                        bArr = bArr;
                        i94 = i94;
                        i95 = i95;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        c209410 = c20945;
                        c17146 = c17140;
                        c8 = c8;
                        i92 = i92;
                        i99 = i99;
                        i88 = i88;
                        int iM4502210 = (i85 - C19806.m45029("ܶܰ")) * (-39);
                        i3 = ((iM4502210 ^ i84) * 7183) ^ (-1381816798);
                        i8 = iM4502210 ^ 1838659910;
                        i91 = i2;
                        i101 = i;
                        i96 = i96;
                        sb8 = null;
                        i102 = i102;
                        i88 = i88;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        c9 = c9;
                        i99 = i99;
                        c17146 = c17146;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        i92 = i92;
                        sb9 = sb9;
                        strM5622 = strM5622;
                        c209410 = c209410;
                        i98 = i98;
                        str18 = str18;
                        i94 = i94;
                        str16 = str16;
                        bArr = bArr;
                        strM10427 = strM10427;
                        i7 = i90;
                        i87 = i8;
                        i86 = i3;
                        c8 = c8;
                        i95 = i95;
                    } else {
                        StringBuilder sb17 = new StringBuilder(strM2308);
                        c8 = '.';
                        c = '/';
                        strM10427 = C3535.m10427(strM50267, '.', '/');
                        if (C0216.f1393 != 0) {
                            sb8 = sb17;
                            int iM450230 = C19806.m45029("ۖ᩸") ^ i84;
                            i16 = ((iM450230 ^ i85) * (-10943)) ^ 1086007797;
                            i17 = iM450230 ^ (-196061635);
                            i101 = i;
                            i96 = i96;
                            i100 = i100;
                            size = size;
                            str17 = str17;
                            c9 = c;
                            i102 = i102;
                            c17146 = c17140;
                            strM5622 = strM5622;
                            i98 = i98;
                            str18 = str18;
                            str16 = str16;
                            i7 = i90;
                            i87 = i17;
                            sb9 = sb9;
                            c209410 = c20945;
                            i86 = i16;
                        } else {
                            int iM113016 = (i85 - ThreadFactoryC3888.m11306("ۤۡ")) * (-75);
                            sb8 = sb17;
                            i101 = i;
                            i96 = i96;
                            sb9 = sb9;
                            i100 = i100;
                            size = size;
                            str17 = str17;
                            c9 = '/';
                            c209410 = c20945;
                            i86 = ((iM113016 ^ i84) * 1413) ^ 1938879908;
                            i102 = i102;
                            c17146 = c17140;
                            strM5622 = strM5622;
                            i98 = i98;
                            str18 = str18;
                            str16 = str16;
                            i7 = i90;
                            i87 = iM113016 ^ (-1154534568);
                        }
                    }
                    i90 = i7;
                    break;
                case 37790212:
                case 931216697:
                    C2788.m8480(sb9, C3535.m10427(strM5622, c8, c9));
                    C2788.m8480(sb9, str17);
                    this.f46970 = C0817.m3407(sb9);
                    str16 = str16;
                    i90 = i90;
                    c2 = c9;
                    i14 = i96;
                    str18 = str18;
                    c20945 = c209410;
                    i98 = i98;
                    str2 = strM10427;
                    i10 = i100;
                    i11 = size;
                    sb = sb8;
                    sb9 = sb9;
                    strM5622 = strM5622;
                    c17140 = c17146;
                    i13 = i102;
                    strM8240 = str17;
                    i12 = i101;
                    int iM4502211 = C19806.m45029("ۧۧ") ^ i85;
                    i16 = ((iM4502211 ^ i84) * 6153) ^ (-1050253493);
                    i17 = iM4502211 ^ (-1424290046);
                    i101 = i12;
                    sb8 = sb;
                    strM10427 = str2;
                    i100 = i10;
                    size = i11;
                    str17 = strM8240;
                    i96 = i14;
                    i102 = i13;
                    c9 = c2;
                    c17146 = c17140;
                    strM5622 = strM5622;
                    i98 = i98;
                    str18 = str18;
                    str16 = str16;
                    i7 = i90;
                    i87 = i17;
                    sb9 = sb9;
                    c209410 = c20945;
                    i86 = i16;
                    i90 = i7;
                    break;
                case 40534707:
                case 619896684:
                    String str34 = str16;
                    str7 = str17;
                    C20945 c209423 = c209410;
                    i50 = i100;
                    i51 = size;
                    i52 = i101;
                    sb4 = sb9;
                    int i165 = i98;
                    str10 = strM5622;
                    C17140 c171421 = c17146;
                    i53 = i102;
                    str8 = str18;
                    i49 = i165;
                    strM50267 = C22697.m50267(new StringBuilder(), this.f46969, str8);
                    i46 = i90;
                    c5 = c9;
                    i54 = i94;
                    i47 = i95;
                    xmlResourceParserC11069 = xmlResourceParserC110611;
                    i48 = i96;
                    str9 = strM10427;
                    sb3 = sb8;
                    c20947 = c209423;
                    c17142 = c171421;
                    c6 = c8;
                    strM940 = str34;
                    iM113010 = C19806.m45029("ۗܽ") ^ i84;
                    i55 = ((iM113010 ^ i85) * 12675) ^ (-739747285);
                    i56 = -62139671;
                    i101 = i52;
                    sb8 = sb3;
                    strM10427 = str9;
                    i100 = i50;
                    size = i51;
                    str17 = str7;
                    i96 = i48;
                    c9 = c5;
                    C17140 c171422 = c17142;
                    xmlResourceParserC110611 = xmlResourceParserC11069;
                    sb9 = sb4;
                    c209410 = c20947;
                    i94 = i54;
                    i102 = i53;
                    c17146 = c171422;
                    String str35 = str8;
                    str16 = strM940;
                    i86 = i55;
                    c8 = c6;
                    i95 = i47;
                    i90 = i46;
                    i87 = iM113010 ^ i56;
                    strM5622 = str10;
                    i98 = i49;
                    str18 = str35;
                    break;
                case 47192419:
                case 820943692:
                    C1977.m6356();
                    if (CallableC1627.f6528) {
                        str16 = str16;
                        str17 = str17;
                        i90 = i90;
                        str18 = str18;
                        c20945 = c209410;
                        i98 = i98;
                        i100 = i100;
                        size = size;
                        i = i101;
                        sb9 = sb9;
                        strM5622 = strM5622;
                        c17140 = c17146;
                        i102 = i102;
                        c = c9;
                        i96 = i96;
                        int iM450231 = C19806.m45029("ۖ᩸") ^ i84;
                        i16 = ((iM450231 ^ i85) * (-10943)) ^ 1086007797;
                        i17 = iM450231 ^ (-196061635);
                        i101 = i;
                        i96 = i96;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        c9 = c;
                        i102 = i102;
                        c17146 = c17140;
                        strM5622 = strM5622;
                        i98 = i98;
                        str18 = str18;
                        str16 = str16;
                        i7 = i90;
                        i87 = i17;
                        sb9 = sb9;
                        c209410 = c20945;
                        i86 = i16;
                        i90 = i7;
                    }
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i95 = i95;
                    i96 = i96;
                    str18 = str18;
                    i98 = i98;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i = i101;
                    strM5622 = strM5622;
                    c8 = c8;
                    i92 = i92;
                    bArr = bArr;
                    i94 = i94;
                    c209410 = c209410;
                    i99 = i99;
                    sb9 = sb9;
                    i88 = i88;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    i2 = i91;
                    int iM4502212 = (i85 - C19806.m45029("ܶܰ")) * (-39);
                    i3 = ((iM4502212 ^ i84) * 7183) ^ (-1381816798);
                    i8 = iM4502212 ^ 1838659910;
                    i91 = i2;
                    i101 = i;
                    i96 = i96;
                    sb8 = null;
                    i102 = i102;
                    i88 = i88;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    c9 = c9;
                    i99 = i99;
                    c17146 = c17146;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    i92 = i92;
                    sb9 = sb9;
                    strM5622 = strM5622;
                    c209410 = c209410;
                    i98 = i98;
                    str18 = str18;
                    i94 = i94;
                    str16 = str16;
                    bArr = bArr;
                    strM10427 = strM10427;
                    i7 = i90;
                    i87 = i8;
                    i86 = i3;
                    c8 = c8;
                    i95 = i95;
                    i90 = i7;
                    break;
                case 93050741:
                case 1562216224:
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i24 = attributeCount2;
                    i95 = i95;
                    i96 = i96;
                    str18 = str18;
                    i98 = i98;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    c8 = c8;
                    i92 = i92;
                    bArr = bArr;
                    i94 = i94;
                    c209410 = c209410;
                    i99 = i99;
                    sb9 = sb9;
                    i88 = i88;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    if (this.f46969 != null) {
                        iM450212 = C19806.m45029("ᩴܽ") ^ i85;
                        i25 = ((iM450212 ^ i84) * (-28345)) ^ 975885493;
                        i26 = 1456289912;
                    } else {
                        iM450212 = (i84 - C19806.m45029("ۙᩳ")) * (-119);
                        i25 = ((iM450212 ^ i85) * 20121) ^ 1020273152;
                        i26 = -575133780;
                    }
                    int i1510 = iM450212 ^ i26;
                    attributeCount2 = i24;
                    i86 = i25;
                    i101 = i;
                    c8 = c8;
                    sb8 = sb8;
                    i88 = i88;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    i95 = i95;
                    i96 = i96;
                    i99 = i99;
                    i90 = i90;
                    c9 = c9;
                    i87 = i1510;
                    i92 = i92;
                    i102 = i102;
                    strM5622 = strM5622;
                    c17146 = c17146;
                    i98 = i98;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    str18 = str18;
                    sb9 = sb9;
                    str16 = str16;
                    c209410 = c209410;
                    i94 = i94;
                    bArr = bArr;
                    strM10427 = strM10427;
                    break;
                case 232079235:
                case 660192567:
                    sb9 = sb9;
                    i102 = i102;
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i2 = i91;
                    i94 = i94;
                    i95 = i95;
                    i96 = i96;
                    str18 = str18;
                    i98 = i98;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i = i101;
                    sb8 = sb8;
                    strM5622 = strM5622;
                    c8 = c8;
                    i92 = i92;
                    i99 = i99;
                    i88 = i88;
                    this.f46967 = null;
                    this.f46970 = null;
                    C20945 c20945M5352 = RunnableC1564.m5352(inputStream);
                    c17141 = c20945M5352.f68265;
                    XmlResourceParserC11068 xmlResourceParserC11068M47106 = c20945M5352.m47106();
                    byte[] bArrM47117 = c20945M5352.m47117();
                    iM47107 = c20945M5352.m47107();
                    bArr3 = null;
                    c209410 = c20945M5352;
                    xmlResourceParserC110611 = xmlResourceParserC11068M47106;
                    bArr = bArrM47117;
                    int iM4502112 = (C19806.m45029("᩻ۗ") ^ i85) * (-69);
                    i86 = ((iM4502112 ^ i84) * (-27009)) ^ 1296019400;
                    i91 = i2;
                    i101 = i;
                    sb8 = sb8;
                    i102 = i102;
                    i88 = i88;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    c17146 = c17141;
                    i96 = i96;
                    i99 = i99;
                    c8 = c8;
                    c9 = c9;
                    i92 = i92;
                    i95 = i95;
                    strM5622 = strM5622;
                    i90 = i90;
                    i87 = iM4502112 ^ (-103031983);
                    i98 = i98;
                    sb9 = sb9;
                    str18 = str18;
                    c209410 = c209410;
                    str16 = str16;
                    i94 = i94;
                    bArr = bArr;
                    strM10427 = strM10427;
                    break;
                case 293402803:
                case 2131594536:
                    throw new IOException();
                case 342091442:
                case 937995394:
                    C0050.m946();
                    iM450216 = C19806.m45029("ۡܽ") ^ i84;
                    i78 = ((iM450216 ^ i85) * 15783) ^ 1875666411;
                    i79 = -1306396873;
                    i87 = iM450216 ^ i79;
                    i86 = i78;
                    break;
                case 366243259:
                case 2093032504:
                    String str36 = str16;
                    String str37 = str17;
                    int i166 = i90;
                    char c17 = c9;
                    int i167 = i95;
                    int i168 = i96;
                    int i169 = i98;
                    int i170 = i99;
                    String str38 = strM10427;
                    int i171 = i100;
                    int i172 = size;
                    int i173 = i101;
                    StringBuilder sb18 = sb8;
                    String str39 = strM5622;
                    char c18 = c8;
                    C20945 c209424 = c209410;
                    StringBuilder sb19 = sb9;
                    XmlResourceParserC11068 xmlResourceParserC110614 = xmlResourceParserC110611;
                    C17140 c171423 = c17146;
                    int i174 = i102;
                    int i175 = i94;
                    String attributeValue = xmlResourceParserC110614.getAttributeValue(i175);
                    int i176 = i88;
                    if (C1460.m5058(attributeValue, C1937.m6288(f46965, 61, 23, i173))) {
                        iM11308 = (ThreadFactoryC3888.m11306("ᩳۜ") ^ i85) * (-29);
                        i41 = ((iM11308 ^ i84) * 16613) ^ 715508569;
                        i42 = 1413991420;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ᩳ᩹") + i84) * (-39);
                        i41 = ((iM11308 ^ i85) * (-14855)) ^ (-1143429426);
                        i42 = 561358828;
                    }
                    int i177 = iM11308 ^ i42;
                    i101 = i173;
                    sb8 = sb18;
                    strM10427 = str38;
                    i100 = i171;
                    size = i172;
                    str16 = str36;
                    str17 = str37;
                    i96 = i168;
                    c9 = c17;
                    xmlResourceParserC110611 = xmlResourceParserC110614;
                    sb9 = sb19;
                    c209410 = c209424;
                    i94 = i175;
                    i102 = i174;
                    c17146 = c171423;
                    i99 = i170;
                    i86 = i41;
                    i88 = i176;
                    str18 = attributeValue;
                    strM5622 = str39;
                    i98 = i169;
                    i87 = i177;
                    c8 = c18;
                    i95 = i167;
                    i90 = i166;
                    break;
                case 395292583:
                case 2112032377:
                    c20949 = c209410;
                    c17145 = c17146;
                    sb7 = sb9;
                    i73 = i102;
                    i69 = i98;
                    str14 = strM5622;
                    i74 = i97;
                    C0050.m932(i69 + i80, i74, bArr2);
                    i100 = i69 + 8;
                    size = c17145.size();
                    if (C0962.f3784) {
                        iM113011 = ThreadFactoryC3888.m11306("᩵ۛ") ^ i84;
                        i97 = i74;
                        i75 = ((iM113011 ^ i85) * (-6789)) ^ 339344245;
                        i76 = -1673429655;
                    } else {
                        i97 = i74;
                        iM113011 = (ThreadFactoryC3888.m11306("֨ۖ") + i85) * (-5);
                        i75 = ((iM113011 ^ i84) * (-28761)) ^ 980032416;
                        i76 = -1068968837;
                    }
                    i87 = iM113011 ^ i76;
                    i102 = i73;
                    c17146 = c17145;
                    String str112 = str14;
                    i98 = i69;
                    sb9 = sb7;
                    c209410 = c20949;
                    i86 = i75;
                    strM5622 = str112;
                    break;
                case 671344502:
                case 1567975525:
                    str7 = str17;
                    i46 = i90;
                    c5 = c9;
                    i47 = i95;
                    i48 = i96;
                    str8 = str18;
                    C20945 c209425 = c209410;
                    i49 = i98;
                    str9 = strM10427;
                    i50 = i100;
                    i51 = size;
                    i52 = i101;
                    sb3 = sb8;
                    sb4 = sb9;
                    str10 = strM5622;
                    c6 = c8;
                    xmlResourceParserC11069 = xmlResourceParserC110611;
                    C17140 c171424 = c17146;
                    i53 = i102;
                    i54 = i94;
                    c20947 = c209425;
                    c17142 = c171424;
                    strM940 = C0050.m940(f46965, 84, 1, i52);
                    if (C1398.m4899(str8, strM940)) {
                        iM113010 = ThreadFactoryC3888.m11306("ۙ᩸") ^ i85;
                        i55 = ((iM113010 ^ i84) * 6749) ^ 364943627;
                        i56 = -1794080621;
                    } else {
                        strM50267 = str8;
                        iM113010 = C19806.m45029("ۗܽ") ^ i84;
                        i55 = ((iM113010 ^ i85) * 12675) ^ (-739747285);
                        i56 = -62139671;
                    }
                    i101 = i52;
                    sb8 = sb3;
                    strM10427 = str9;
                    i100 = i50;
                    size = i51;
                    str17 = str7;
                    i96 = i48;
                    c9 = c5;
                    C17140 c171425 = c17142;
                    xmlResourceParserC110611 = xmlResourceParserC11069;
                    sb9 = sb4;
                    c209410 = c20947;
                    i94 = i54;
                    i102 = i53;
                    c17146 = c171425;
                    String str310 = str8;
                    str16 = strM940;
                    i86 = i55;
                    c8 = c6;
                    i95 = i47;
                    i90 = i46;
                    i87 = iM113010 ^ i56;
                    strM5622 = str10;
                    i98 = i49;
                    str18 = str310;
                    break;
                case 749049607:
                case 1861322227:
                    int i178 = i99 * 20;
                    RunnableC3388.m10054(bArr2, i102 + 20, bArr2, i102, i178);
                    str13 = strM5622;
                    str3 = str16;
                    str11 = str17;
                    i90 = i90;
                    c7 = c9;
                    i95 = i95;
                    i57 = i96;
                    str4 = str18;
                    c20948 = c209410;
                    c17143 = c17146;
                    str12 = strM10427;
                    i59 = i100;
                    i60 = size;
                    i61 = i101;
                    sb5 = sb8;
                    sb6 = sb9;
                    i62 = i102;
                    c8 = c8;
                    i65 = i178 + i102;
                    xmlResourceParserC110610 = xmlResourceParserC110611;
                    int iM4502213 = (i84 - C19806.m45029("֫ۢ")) * 31;
                    int i1216 = i65;
                    int i1217 = ((iM4502213 ^ i85) * (-16473)) ^ 1465187244;
                    i9 = iM4502213 ^ (-1917120779);
                    str18 = str4;
                    i101 = i61;
                    sb8 = sb5;
                    strM10427 = str12;
                    i100 = i59;
                    size = i60;
                    str16 = str3;
                    str17 = str11;
                    i96 = i57;
                    c9 = c7;
                    xmlResourceParserC110611 = xmlResourceParserC110610;
                    sb9 = sb6;
                    c209410 = c20948;
                    i86 = i1217;
                    i102 = i62;
                    c17146 = c17143;
                    strM5622 = str13;
                    i98 = i1216;
                    i15 = i90;
                    i87 = i9;
                    c8 = c8;
                    i95 = i95;
                    i90 = i15;
                    break;
                case 968472671:
                case 972884577:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C0216.m1591() > 0) {
                        str3 = str16;
                        str15 = str17;
                        c20949 = c209410;
                        i66 = i100;
                        i67 = size;
                        i70 = i101;
                        sb7 = sb9;
                        i69 = i98;
                        str14 = strM5622;
                        c17144 = c17146;
                        i68 = i102;
                        iM450215 = (ThreadFactoryC3888.m11306("۬ۛ") + i84) * 73;
                        i71 = ((iM450215 ^ i85) * 31087) ^ (-1047407989);
                        i72 = 1050004683;
                        i87 = iM450215 ^ i72;
                        i101 = i70;
                        i102 = i68;
                        i100 = i66;
                        size = i67;
                        str17 = str15;
                        c17146 = c17144;
                        strM5622 = str14;
                        i98 = i69;
                        sb9 = sb7;
                        c209410 = c20949;
                        i86 = i71;
                        str16 = str3;
                    } else {
                        iM450216 = C19806.m45029("ܽ᩶") ^ i85;
                        i78 = ((iM450216 ^ i84) * (-3853)) ^ 1885126452;
                        i79 = 71983902;
                        i87 = iM450216 ^ i79;
                        i86 = i78;
                    }
                    break;
                case 1013006205:
                case 1288779429:
                    return bArr3;
                case 1162822557:
                case 1485329085:
                    throw new IOException(RunnableC1564.m5344(f46965, 48, 13, i101));
                case 1165039748:
                case 1309536416:
                    i88++;
                    c209410 = c209410;
                    iM11309 = (C19806.m45029("۟ۤ") ^ i84) * 97;
                    i43 = ((iM11309 ^ i85) * (-12651)) ^ (-79573016);
                    i44 = 1188036920;
                    i77 = iM11309 ^ i44;
                    i99 = i99;
                    i86 = i43;
                    i101 = i101;
                    c8 = c8;
                    sb8 = sb8;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    i95 = i95;
                    i96 = i96;
                    i90 = i90;
                    c9 = c9;
                    i87 = i77;
                    strM5622 = strM5622;
                    i98 = i98;
                    str18 = str18;
                    str16 = str16;
                    C17140 c1714112 = c17146;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    sb9 = sb9;
                    c209410 = c209410;
                    i94 = i94;
                    i102 = i102;
                    c17146 = c1714112;
                    break;
                case 1347779914:
                case 1668536721:
                    i101 = 58199;
                    int iM450232 = (i85 - C19806.m45029("۫ᩳ")) * 31;
                    i3 = ((iM450232 ^ i84) * 3157) ^ (-432622843);
                    i8 = iM450232 ^ 1511015594;
                    i91 = i91;
                    sb8 = sb8;
                    i102 = i102;
                    i88 = i88;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    i96 = i96;
                    i99 = i99;
                    c17146 = c17146;
                    c9 = c9;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    i92 = i92;
                    sb9 = sb9;
                    strM5622 = strM5622;
                    c209410 = c209410;
                    i98 = i98;
                    str18 = str18;
                    i94 = i94;
                    str16 = str16;
                    bArr = bArr;
                    strM10427 = strM10427;
                    i7 = i90;
                    i87 = i8;
                    i86 = i3;
                    c8 = c8;
                    i95 = i95;
                    i90 = i7;
                    break;
                case 1381757288:
                case 1503024186:
                    i22 = i99;
                    bArr = bArr;
                    i94 = i94;
                    c209410 = c209410;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    attributeCount2 = xmlResourceParserC110611.getAttributeCount();
                    i23 = i93;
                    int iM4502113 = (C19806.m45029("ᩴܺ") ^ i84) * q.h;
                    i101 = i101;
                    c8 = c8;
                    sb8 = sb8;
                    i88 = i88;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    i95 = i95;
                    i96 = i96;
                    i99 = i22;
                    i90 = i90;
                    c9 = c9;
                    i92 = i23;
                    i87 = iM4502113 ^ (-945516280);
                    i86 = ((iM4502113 ^ i85) * (-16975)) ^ 445658102;
                    i102 = i102;
                    strM5622 = strM5622;
                    c17146 = c17146;
                    i98 = i98;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    str18 = str18;
                    sb9 = sb9;
                    str16 = str16;
                    c209410 = c209410;
                    i94 = i94;
                    bArr = bArr;
                    strM10427 = strM10427;
                    break;
                case 1985939056:
                case 2016846740:
                    str16 = str16;
                    str17 = str17;
                    i90 = i90;
                    c9 = c9;
                    i95 = i95;
                    i96 = i96;
                    str18 = str18;
                    i98 = i98;
                    int i179 = i99;
                    strM10427 = strM10427;
                    i100 = i100;
                    size = size;
                    i = i101;
                    StringBuilder sb20 = sb8;
                    strM5622 = strM5622;
                    c8 = c8;
                    i88 = i88;
                    byte[] bArr10 = bArr;
                    C20945 c209426 = c209410;
                    sb9 = sb9;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    c17146 = c17146;
                    i102 = i102;
                    i94 = i94;
                    c209410 = c209426;
                    i89 = iM47107 + xmlResourceParserC110611.f37566;
                    bArr2 = new byte[bArr10.length + 20];
                    int i180 = i93;
                    C0526.m2427(bArr10, i180, bArr2, i180, i89);
                    if (C3722.f13525 > 0) {
                        int iM450233 = C19806.m45029("ܰ᩷") ^ i85;
                        i93 = i180;
                        int i181 = ((iM450233 ^ i84) * (-29897)) ^ (-30017062);
                        i9 = iM450233 ^ 1053803199;
                        bArr = bArr10;
                        i101 = i;
                        sb8 = sb20;
                        i88 = i88;
                        strM10427 = strM10427;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        i99 = i179;
                        i86 = i181;
                        i96 = i96;
                        strM5622 = strM5622;
                        c9 = c9;
                        i98 = i98;
                        str18 = str18;
                        str16 = str16;
                        C17140 c1714113 = c17146;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        sb9 = sb9;
                        c209410 = c209410;
                        i94 = i94;
                        i102 = i102;
                        c17146 = c1714113;
                        i15 = i90;
                        i87 = i9;
                        c8 = c8;
                        i95 = i95;
                        i90 = i15;
                    } else {
                        i94 = i94;
                        i93 = i180;
                        bArr = bArr10;
                        i2 = i91;
                        i92 = i92;
                        i99 = i179;
                        int iM4502214 = (i85 - C19806.m45029("ܶܰ")) * (-39);
                        i3 = ((iM4502214 ^ i84) * 7183) ^ (-1381816798);
                        i8 = iM4502214 ^ 1838659910;
                        i91 = i2;
                        i101 = i;
                        i96 = i96;
                        sb8 = null;
                        i102 = i102;
                        i88 = i88;
                        i100 = i100;
                        size = size;
                        str17 = str17;
                        c9 = c9;
                        i99 = i99;
                        c17146 = c17146;
                        xmlResourceParserC110611 = xmlResourceParserC110611;
                        i92 = i92;
                        sb9 = sb9;
                        strM5622 = strM5622;
                        c209410 = c209410;
                        i98 = i98;
                        str18 = str18;
                        i94 = i94;
                        str16 = str16;
                        bArr = bArr;
                        strM10427 = strM10427;
                        i7 = i90;
                        i87 = i8;
                        i86 = i3;
                        c8 = c8;
                        i95 = i95;
                        i90 = i7;
                    }
                    break;
                default:
                    i101 = 45130;
                    int iM450234 = (i85 - C19806.m45029("۫ᩳ")) * 31;
                    i3 = ((iM450234 ^ i84) * 3157) ^ (-432622843);
                    i8 = iM450234 ^ 1511015594;
                    i91 = i91;
                    sb8 = sb8;
                    i102 = i102;
                    i88 = i88;
                    i100 = i100;
                    size = size;
                    str17 = str17;
                    i96 = i96;
                    i99 = i99;
                    c17146 = c17146;
                    c9 = c9;
                    xmlResourceParserC110611 = xmlResourceParserC110611;
                    i92 = i92;
                    sb9 = sb9;
                    strM5622 = strM5622;
                    c209410 = c209410;
                    i98 = i98;
                    str18 = str18;
                    i94 = i94;
                    str16 = str16;
                    bArr = bArr;
                    strM10427 = strM10427;
                    i7 = i90;
                    i87 = i8;
                    i86 = i3;
                    c8 = c8;
                    i95 = i95;
                    i90 = i7;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0109 A[PHI: r4
      0x0109: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:32:0x0107, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0200 A[PHI: r1 r5 r6 r12 r13
      0x0200: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v4 java.lang.String), (r1v2 java.lang.String) binds: [B:51:0x01fe, B:40:0x0186, B:28:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:51:0x01fe, B:40:0x0186, B:28:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:51:0x01fe, B:40:0x0186, B:28:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:51:0x01fe, B:40:0x0186, B:28:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r13v4 short) = (r13v3 short), (r13v2 short), (r13v2 short) binds: [B:51:0x01fe, B:40:0x0186, B:28:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0237 A[PHI: r3 r7 r8 r10 r18 r23
      0x0237: PHI (r3v5 java.lang.String[]) = 
      (r3v2 java.lang.String[])
      (r3v3 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v2 java.lang.String[])
     binds: [B:55:0x0235, B:24:0x00c1, B:12:0x0072, B:9:0x0069, B:6:0x0060, B:87:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r7v5 short[]) = (r7v2 short[]), (r7v3 short[]), (r7v2 short[]), (r7v2 short[]), (r7v2 short[]), (r7v2 short[]) binds: [B:55:0x0235, B:24:0x00c1, B:12:0x0072, B:9:0x0069, B:6:0x0060, B:87:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r8v5 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:55:0x0235, B:24:0x00c1, B:12:0x0072, B:9:0x0069, B:6:0x0060, B:87:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r10v5 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:55:0x0235, B:24:0x00c1, B:12:0x0072, B:9:0x0069, B:6:0x0060, B:87:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r18v5 int) = (r18v3 int), (r18v2 int), (r18v2 int), (r18v2 int), (r18v2 int), (r18v2 int) binds: [B:55:0x0235, B:24:0x00c1, B:12:0x0072, B:9:0x0069, B:6:0x0060, B:87:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r23v6 int) = (r23v4 int), (r23v3 int), (r23v3 int), (r23v3 int), (r23v3 int), (r23v3 int) binds: [B:55:0x0235, B:24:0x00c1, B:12:0x0072, B:9:0x0069, B:6:0x0060, B:87:0x0237] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0289 A[PHI: r9 r16 r17
      0x0289: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:63:0x0287, B:59:0x0267, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x0287, B:59:0x0267, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:63:0x0287, B:59:0x0267, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        int iM11306;
        int i;
        int i2;
        int i3 = C1025.f4800;
        int i4 = RunnableC0195.f1321;
        int iM45029 = (i3 - C19806.m45029("ۖۢ")) * (-57);
        int i5 = ((iM45029 ^ i4) * 18339) ^ (-1145120983);
        String strM6241 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ 1675855746;
        int iM450210 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        char c = 0;
        int i11 = 0;
        int i12 = -1170077562;
        int i13 = 0;
        String[] strArr = null;
        short[] sArr3 = null;
        int i14 = 0;
        String strM41569 = null;
        String strM10964 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 2267) >> 31));
            switch (i12) {
                case -1935553831:
                case -1558428078:
                    C1460.m5050();
                    if (C0629.f2722 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-31415)) ^ (-538919802);
                        i2 = -1286754587;
                    } else {
                        iM11306 = (C19806.m45029("۟ܺ") ^ i3) * (-53);
                        i = ((iM11306 ^ i4) * (-29041)) ^ (-734268330);
                        i2 = -700696775;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1734822058:
                case -1587421773:
                    int i15 = i11 + i13;
                    i10 = i15 + i15;
                    s2 = 2858;
                    if (C1977.m6356()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۗ") ^ i4;
                        i = ((iM11306 ^ i3) * 26073) ^ 1719660060;
                        i2 = 240093360;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘܺ") ^ i3;
                        i = ((iM11306 ^ i4) * 6367) ^ 2096370222;
                        i2 = 282629466;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1618467285:
                case 48165245:
                    C2332.m7079();
                    C0216.m1591();
                    return null;
                case -1421693804:
                case 278438643:
                    C0629.m2907();
                    int iM450211 = (C19806.m45029("ۢ۟") ^ i4) * (-51);
                    i5 = ((iM450211 ^ i3) * 30987) ^ 1143108869;
                    i6 = iM450211 ^ (-1022965187);
                    break;
                case -1382369218:
                case 1513969211:
                    C3286.m9798();
                    if (C1377.f5749) {
                        iM11306 = (C19806.m45029("᩹᩻") ^ i3) * (-41);
                        i = ((iM11306 ^ i4) * (-20411)) ^ (-898744269);
                        i2 = 536751570;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-31415)) ^ (-538919802);
                        i2 = -1286754587;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1071881470:
                case 91071076:
                    strArr = new String[]{strM41569, C0671.m3017(iM450210 ^ i7)};
                    sArr2 = f46965;
                    if (C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-31415)) ^ (-538919802);
                        i2 = -1286754587;
                    } else {
                        iM11306 = C19806.m45029("֡᩹") ^ i3;
                        i = ((iM11306 ^ i4) * (-16009)) ^ 1627281026;
                        i2 = 1546091253;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1066812681:
                case 1090010267:
                    int i16 = s + s2;
                    if ((i16 * i16) - i10 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܳ") ^ i4;
                        i = ((iM11306 ^ i3) * 265) ^ 1109422448;
                        i2 = -1057776760;
                    } else {
                        iM11306 = (C19806.m45029("ܿܺ") ^ i3) * (-65);
                        i = ((iM11306 ^ i4) * 21923) ^ (-266353663);
                        i2 = 341663650;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -934808423:
                case 420674073:
                    return C0278.m1786(C19806.m45029(C3577.m10571(sArr2, i8, i9, i14)) ^ 2127667761, strArr);
                case -691070551:
                case 894427845:
                    s = sArr[c];
                    if (C0797.f3386) {
                        iM11306 = (C19806.m45029("۟ܺ") ^ i3) * (-53);
                        i = ((iM11306 ^ i4) * (-29041)) ^ (-734268330);
                        i2 = -700696775;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۟") ^ i3) * (-93);
                        i = ((iM11306 ^ i4) * (-22067)) ^ 1099387579;
                        i2 = -932975637;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -612582988:
                case 755908964:
                    strM6241 = ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr3, 565, 3, i14);
                    if (C1875.f7103 >= 0) {
                        iM11306 = (C19806.m45029("᩹᩻") ^ i3) * (-41);
                        i = ((iM11306 ^ i4) * (-20411)) ^ (-898744269);
                        i2 = 536751570;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩳۖ")) * (-17);
                        i = ((iM11306 ^ i4) * 3) ^ 769533823;
                        i2 = 2078011824;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -445568562:
                case 1606308996:
                    iM450210 = C19806.m45029(strM6241);
                    i7 = 2102648535;
                    if (C1460.f5948 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۗ") ^ i4;
                        i = ((iM11306 ^ i3) * 26073) ^ 1719660060;
                        i2 = 240093360;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫֨") ^ i4;
                        i = ((iM11306 ^ i3) * 14483) ^ (-2038129995);
                        i2 = 1674117132;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -412540182:
                case 1575569147:
                    i11 = s * s;
                    i13 = 8168164;
                    if (RunnableC1564.m5345()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-31415)) ^ (-538919802);
                        i2 = -1286754587;
                    } else {
                        iM11306 = (C19806.m45029("᩶ۜ") ^ i4) * 13;
                        i = ((iM11306 ^ i3) * 23735) ^ (-1084800841);
                        i2 = -259271870;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -371601582:
                case 493793861:
                    if (!C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-31415)) ^ (-538919802);
                        i2 = -1286754587;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM450212 = (C19806.m45029("ۢ۟") ^ i4) * (-51);
                        i5 = ((iM450212 ^ i3) * 30987) ^ 1143108869;
                        i6 = iM450212 ^ (-1022965187);
                    }
                    break;
                case -344804649:
                case -148942036:
                    sArr = f46965;
                    c = 560;
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۜ") ^ i4;
                        i = ((iM11306 ^ i3) * (-15511)) ^ 670843569;
                        i2 = 1964635443;
                    } else {
                        iM11306 = (C19806.m45029("۟ܺ") ^ i3) * (-53);
                        i = ((iM11306 ^ i4) * (-29041)) ^ (-734268330);
                        i2 = -700696775;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 391608398:
                case 781446098:
                    i14 = 557;
                    iM11306 = C19806.m45029("ᩳ۫") ^ i3;
                    i = ((iM11306 ^ i4) * (-17169)) ^ 253007960;
                    i2 = -1605555188;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 623308095:
                case 1895817755:
                    strM10964 = C3743.m10964(f46965, 561, 4, i14);
                    if (C2788.m8472() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۗ") ^ i4;
                        i = ((iM11306 ^ i3) * 26073) ^ 1719660060;
                        i2 = 240093360;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۢ") ^ i4;
                        i = ((iM11306 ^ i3) * (-12347)) ^ (-2088139316);
                        i2 = -255377803;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1383115258:
                case 1393692201:
                    strM41569 = m41569(strM10964);
                    sArr3 = f46965;
                    if (!C3577.m10565()) {
                        int iM450213 = (C19806.m45029("ۢ۟") ^ i4) * (-51);
                        i5 = ((iM450213 ^ i3) * 30987) ^ 1143108869;
                        i6 = iM450213 ^ (-1022965187);
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۜ") + i4) * 13;
                        i = ((iM11306 ^ i3) * 28937) ^ (-487452044);
                        i2 = -1988534273;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    }
                    break;
                case 1384828375:
                case 1663471731:
                    i14 = 12297;
                    iM11306 = C19806.m45029("ᩳ۫") ^ i3;
                    i = ((iM11306 ^ i4) * (-17169)) ^ 253007960;
                    i2 = -1605555188;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    i8 = 568;
                    i9 = 3;
                    if (C0962.m3746() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-31415)) ^ (-538919802);
                        i2 = -1286754587;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۤ") + i3) * 91;
                        i = ((iM11306 ^ i4) * 10613) ^ 815038999;
                        i2 = -131091823;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        int i = -237204149;
        int i2 = C1398.f5802;
        int i3 = C10634.f36300;
        int iM11306 = ThreadFactoryC3888.m11306("۟ۘ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 15791) ^ 1986688562;
        int i5 = -2136940650;
        while (true) {
            i = ((((i ^ i2) * (-19279)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2143148370:
                case 2052413629:
                    if (C1461.m5079(c5202)) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29803) ^ (-204617894);
                        i5 = 113421809;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18223)) ^ 312461819;
                        i5 = 1834596123;
                    }
                    break;
                case -2141636464:
                case -2132147885:
                    if (C0797.f3386) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ۫") + i3) * (-39);
                        i4 = ((iM11306 ^ i2) * (-12735)) ^ 817277402;
                        i5 = -932928893;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܶܿ")) * 91;
                        i4 = ((iM11306 ^ i3) * (-23333)) ^ 1997857400;
                        i5 = 1154440970;
                    }
                    break;
                case -2083395214:
                case -1887552631:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ۫") + i3) * (-39);
                        i4 = ((iM11306 ^ i2) * (-12735)) ^ 817277402;
                        i5 = -932928893;
                    } else {
                        iM11306 = C19806.m45029("ۤۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19157)) ^ 961171502;
                        i5 = 1661910399;
                    }
                    break;
                case -1953292413:
                case 2043144356:
                    if (C0671.f2816 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24687)) ^ (-1716073761);
                        i5 = 1361940650;
                    } else {
                        iM11306 = C19806.m45029("֫֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14365)) ^ (-501902438);
                        i5 = 1931434218;
                    }
                    break;
                case -1832832168:
                case 1207881428:
                    if (C10634.m26820()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ۫") + i3) * (-39);
                        i4 = ((iM11306 ^ i2) * (-12735)) ^ 817277402;
                        i5 = -932928893;
                    } else {
                        iM11306 = (C19806.m45029("ۛۚ") + i3) * (-91);
                        i4 = ((iM11306 ^ i2) * 11001) ^ 2093577364;
                        i5 = -1732938846;
                    }
                    break;
                case -1448037725:
                case 351762550:
                    if (C19806.f63586) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ۫") + i3) * (-39);
                        i4 = ((iM11306 ^ i2) * (-12735)) ^ 817277402;
                        i5 = -932928893;
                    } else {
                        iM11306 = C19806.m45029("᩻᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * 16895) ^ (-1058270675);
                        i5 = 1389466169;
                    }
                    break;
                case -1406916360:
                case 1209750775:
                    if (C2332.m7079() <= 0) {
                        iM11306 = C19806.m45029("ۨۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11069)) ^ (-942928754);
                        i5 = -531851962;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17125)) ^ 136268430;
                        i5 = 1822937509;
                    }
                    break;
                case -1379993985:
                case 2124522177:
                    C10634.m26818(c11545, C2642.m8160(this.f46968));
                    c11545.m28830();
                    iM11306 = ThreadFactoryC3888.m11306("۫᩵") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-18223)) ^ 312461819;
                    i5 = 1834596123;
                    break;
                case -1238418116:
                case -413438339:
                    C3722.m10894();
                    break;
                case -1230128659:
                case 684760553:
                    if (RunnableC3388.m10064()) {
                        iM11306 = (i2 - C19806.m45029("ۢܶ")) * (-103);
                        i4 = ((iM11306 ^ i3) * 21693) ^ (-93607535);
                        i5 = -796565892;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۤ֡")) * (-55);
                        i4 = ((iM11306 ^ i3) * 9951) ^ 1230873388;
                        i5 = -1634244786;
                    }
                    break;
                case -949385544:
                case -299215006:
                    if (C1460.f5948 < 0) {
                        iM11306 = C19806.m45029("ۨۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11069)) ^ (-942928754);
                        i5 = -531851962;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-32463)) ^ (-1605062252);
                        i5 = 153680420;
                    }
                    break;
                case -920159139:
                case -765609062:
                    break;
                case -883327926:
                case -708777551:
                    C1937.m6279();
                    CallableC1627.m5507();
                    iM11306 = ThreadFactoryC3888.m11306("᩸۫") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-32463)) ^ (-1605062252);
                    i5 = 153680420;
                    break;
                case -870641188:
                case 1219950407:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ۫") + i3) * (-39);
                        i4 = ((iM11306 ^ i2) * (-12735)) ^ 817277402;
                        i5 = -932928893;
                    } else {
                        iM11306 = (C19806.m45029("ۡ֨") ^ i3) * (-69);
                        i4 = ((iM11306 ^ i2) * 14841) ^ 1371431413;
                        i5 = -1422851667;
                    }
                    break;
                case 13031703:
                case 1067776036:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ۫") + i3) * (-39);
                        i4 = ((iM11306 ^ i2) * (-12735)) ^ 817277402;
                        i5 = -932928893;
                    } else {
                        iM11306 = C19806.m45029("ۧܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20109) ^ (-853618981);
                        i5 = 813308628;
                    }
                    break;
                case 769097324:
                case 1928346340:
                    if (m41579(c11545)) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 17379) ^ 425878253;
                        i5 = -2035604283;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18223)) ^ 312461819;
                        i5 = 1834596123;
                    }
                    break;
                case 779651405:
                case 1503958116:
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = C19806.m45029("ۨۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11069)) ^ (-942928754);
                        i5 = -531851962;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24687)) ^ (-1716073761);
                        i5 = 1361940650;
                    }
                    break;
                case 1202862348:
                case 1794316788:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24687)) ^ (-1716073761);
                        i5 = 1361940650;
                    } else {
                        iM11306 = C19806.m45029("ۘܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7947)) ^ 1153916424;
                        i5 = 767890513;
                    }
                    break;
                default:
                    if (!C0962.f3784) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ۫") + i3) * (-39);
                        i4 = ((iM11306 ^ i2) * (-12735)) ^ 817277402;
                        i5 = -932928893;
                    } else {
                        iM11306 = C19806.m45029("ۨۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11069)) ^ (-942928754);
                        i5 = -531851962;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 137161. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final l.C5202 mo3077() {
        /*
            Method dump skipped, instruction units count: 13716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14339.mo3077():l.ۚ۟ۜ");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        AbstractC20745 abstractC20745 = null;
        AbstractC20745 abstractC20746 = null;
        int i = -1633763613;
        int i2 = C1066.f4915;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM45029 = (i3 - C19806.m45029("ۚᩴ")) * (-25);
        int i4 = ((iM45029 ^ i2) * (-13839)) ^ (-1474720521);
        int i5 = 1905153501;
        while (true) {
            i = ((((i ^ i2) * (-2783)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2087387034:
                case -1410579864:
                    abstractC20745 = this.f46966;
                    if (abstractC20745 != null) {
                        iM45029 = C19806.m45029("ܰۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18573)) ^ (-33960846);
                        i5 = 664937725;
                    } else {
                        iM45029 = (C19806.m45029("ۙ᩸") ^ i3) * (-105);
                        i4 = ((iM45029 ^ i2) * 15667) ^ (-1238710151);
                        i5 = -290710043;
                    }
                    break;
                case -1829022146:
                case 526754302:
                    if (C0962.m3746() >= 0) {
                        iM45029 = C19806.m45029("ۜۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24029)) ^ (-1139797582);
                        i5 = 945142182;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 25731) ^ 1784561149;
                        i5 = 1123039280;
                    }
                    break;
                case -1778304567:
                case 1520694726:
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("ۜۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24029)) ^ (-1139797582);
                        i5 = 945142182;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 241) ^ 869783769;
                        i5 = 1869210473;
                    }
                    break;
                case -1622894503:
                case -222894886:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20233)) ^ 1170560455;
                        i5 = -1044833014;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩷ۢ")) * (-111);
                        i4 = ((iM45029 ^ i3) * 10921) ^ (-1680950460);
                        i5 = 114606131;
                    }
                    break;
                case -1543114812:
                case -904183876:
                    if (!RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ֡") ^ i3) * (-111);
                        i4 = ((iM45029 ^ i2) * (-11551)) ^ 1182008906;
                        i5 = -303505782;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩷ۢ")) * (-111);
                        i4 = ((iM45029 ^ i3) * 10921) ^ (-1680950460);
                        i5 = 114606131;
                    }
                    break;
                case -1470247958:
                case 1850577161:
                    abstractC20746 = this.f46968;
                    if (abstractC20746 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4389) ^ 1565684711;
                        i5 = 734408308;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ֫") + i3) * (-107);
                        i4 = ((iM45029 ^ i2) * (-14039)) ^ 117796754;
                        i5 = 405381946;
                    }
                    break;
                case -1306831738:
                case 460002397:
                    C1148.m4233();
                    break;
                case -1287057909:
                case -470627478:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20233)) ^ 1170560455;
                        i5 = -1044833014;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9897)) ^ (-764998411);
                        i5 = 371362421;
                    }
                    break;
                case -1251186241:
                case -667971606:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ֡") ^ i3) * (-111);
                        i4 = ((iM45029 ^ i2) * (-11551)) ^ 1182008906;
                        i5 = -303505782;
                    } else {
                        iM45029 = C19806.m45029("ۤ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12347) ^ (-1359862033);
                        i5 = -146299884;
                    }
                    break;
                case -1051372671:
                case -358964745:
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20233)) ^ 1170560455;
                        i5 = -1044833014;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۫") + i3) * (-49);
                        i4 = ((iM45029 ^ i2) * (-19037)) ^ 868889872;
                        i5 = -1694297818;
                    }
                    break;
                case -1037988908:
                case -794555474:
                    C1875.m6086();
                    iM45029 = (i2 - ThreadFactoryC3888.m11306("᩷ۢ")) * (-111);
                    i4 = ((iM45029 ^ i3) * 10921) ^ (-1680950460);
                    i5 = 114606131;
                    break;
                case -963777340:
                case 1050645003:
                    if (C1668.m5583()) {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11403) ^ 1381700873;
                        i5 = 923000181;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩷ۢ")) * (-111);
                        i4 = ((iM45029 ^ i3) * 10921) ^ (-1680950460);
                        i5 = 114606131;
                    }
                    break;
                case -772061024:
                case -503021856:
                    C2788.m8472();
                    break;
                case 181737301:
                case 246455383:
                    if (MenuItemOnMenuItemClickListenerC3244.m9712(c5202)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ֫") + i3) * (-107);
                        i4 = ((iM45029 ^ i2) * (-14039)) ^ 117796754;
                        i5 = 405381946;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸֨") + i2) * 127;
                        i4 = ((iM45029 ^ i3) * (-24135)) ^ 1084933646;
                        i5 = -777019256;
                    }
                    break;
                case 453302728:
                case 2105267085:
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13185) ^ (-536327972);
                        i5 = -1893354518;
                    } else {
                        iM45029 = C19806.m45029("ۜۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24029)) ^ (-1139797582);
                        i5 = 945142182;
                    }
                    break;
                case 754283815:
                case 1575570355:
                    C0817.m3399();
                    if (C1668.f6641 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ۚ᩵")) * 9;
                        i4 = ((iM45029 ^ i2) * (-2359)) ^ (-146540447);
                        i5 = 911132133;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ֡") ^ i3) * (-111);
                        i4 = ((iM45029 ^ i2) * (-11551)) ^ 1182008906;
                        i5 = -303505782;
                    }
                    break;
                case 929915318:
                case 1111151604:
                    if (C1419.m4973()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20233)) ^ 1170560455;
                        i5 = -1044833014;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۘۧ")) * 43;
                        i4 = ((iM45029 ^ i3) * 173) ^ (-1034569223);
                        i5 = 1847079445;
                    }
                    break;
                case 1109321767:
                case 1247589026:
                    RunnableC3388.m10052(abstractC20745);
                    iM45029 = (C19806.m45029("ۙ᩸") ^ i3) * (-105);
                    i4 = ((iM45029 ^ i2) * 15667) ^ (-1238710151);
                    i5 = -290710043;
                    break;
                case 1136073347:
                case 2020482016:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ۚ᩵")) * 9;
                        i4 = ((iM45029 ^ i2) * (-2359)) ^ (-146540447);
                        i5 = 911132133;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩸ܽ")) * (-29);
                        i4 = ((iM45029 ^ i2) * (-21157)) ^ 1475229805;
                        i5 = -668625314;
                    }
                    break;
                case 1752067057:
                case 1939752353:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ۚ᩵")) * 9;
                        i4 = ((iM45029 ^ i2) * (-2359)) ^ (-146540447);
                        i5 = 911132133;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩶᩵")) * 65;
                        i4 = ((iM45029 ^ i2) * (-9121)) ^ 1868115045;
                        i5 = 641558588;
                    }
                    break;
                default:
                    RunnableC3388.m10052(abstractC20746);
                    iM45029 = (ThreadFactoryC3888.m11306("ۘ֫") + i3) * (-107);
                    i4 = ((iM45029 ^ i2) * (-14039)) ^ 117796754;
                    i5 = 405381946;
                    break;
            }
            return;
        }
    }
}
