package l;

import bin.mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳܿۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAGX */
/* JADX INFO: loaded from: classes5.dex */
public class C18196 extends AbstractC23941 {

    /* JADX INFO: renamed from: ۗ۬ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f58141 = {7660, -9133, -13381, -8623, 19448, 19448, 19448, 5264, 30478, 30489, 30479, 30483, 30473, 30478, 30495, 30489, 30479, 30546, 30493, 30478, 30479, 30495, 30490, 30485, 30480, 30489, 30487, 30489, 30489, 30476, 30525, 30476, 30487, 30511, 30485, 30491, 30526, 30480, 30483, 30495, 30487, 30476, 30493, 30472, 30484, 30479, -5131, 7000, 9734, -4317, 8236, 2091, 30547, 30546, 30472, 30481, 30476, 30499, 30481, 30485, 30482, 30485, 30490, 30469, 8201, 31405, 31394, 31399, 31406, 9021, 4764, -3420, 8557, -5537, 13485};

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f58142;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f58143;

    /* JADX WARN: Code duplicated, block: B:51:0x01a5 A[PHI: r3 r10
      0x01a5: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:50:0x01a3, B:31:0x00ed, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:50:0x01a3, B:31:0x00ed, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01fa A[PHI: r4 r6 r7 r8 r9 r12 r13 r14 r15
      0x01fa: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:58:0x01f8, B:54:0x01d7, B:39:0x012d, B:35:0x010c, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:58:0x01f8, B:54:0x01d7, B:39:0x012d, B:35:0x010c, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:58:0x01f8, B:54:0x01d7, B:39:0x012d, B:35:0x010c, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:58:0x01f8, B:54:0x01d7, B:39:0x012d, B:35:0x010c, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:58:0x01f8, B:54:0x01d7, B:39:0x012d, B:35:0x010c, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:58:0x01f8, B:54:0x01d7, B:39:0x012d, B:35:0x010c, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:58:0x01f8, B:54:0x01d7, B:39:0x012d, B:35:0x010c, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:58:0x01f8, B:54:0x01d7, B:39:0x012d, B:35:0x010c, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:58:0x01f8, B:54:0x01d7, B:39:0x012d, B:35:0x010c, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0227 A[PHI: r21
      0x0227: PHI (r21v4 char) = (r21v3 char), (r21v6 char) binds: [B:9:0x005d, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x025b A[PHI: r16
      0x025b: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x0259, B:17:0x006d, B:15:0x0069, B:12:0x0063, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        int iM11306;
        int i;
        int i2;
        int i3 = C0629.f2722;
        int i4 = C0050.f912;
        int iM11307 = (i3 - ThreadFactoryC3888.m11306("ܶ᩺")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i5 = ((iM11307 ^ i4) * (-11345)) ^ (-807061270);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11307 ^ (-331499032);
        int i7 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1926459633;
        char c = 0;
        String strM10571 = null;
        int iM11308 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * (-28409)) >> 31));
            switch (i14) {
                case -2127387480:
                case 1585616943:
                    sArr = f58141;
                    if (C10634.m26820()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۚ") + i3) * 93;
                        i = ((iM11306 ^ i4) * (-18975)) ^ 317285137;
                        i2 = -2026669991;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩸") ^ i3;
                        i = ((iM11306 ^ i4) * 24213) ^ (-447297159);
                        i2 = -1468767094;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2079650517:
                case -1998720786:
                    C19806.m45024();
                    C0671.m3008();
                    break;
                case -1994248375:
                case 1357138343:
                    i10 = 132871729;
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("ۙ֨") ^ i3;
                        i = ((iM11306 ^ i4) * (-24871)) ^ 818754899;
                        i2 = 1248671198;
                    } else {
                        iM11306 = C19806.m45029("ᩳۖ") ^ i3;
                        i = ((iM11306 ^ i4) * 12821) ^ (-1977555203);
                        i2 = -33953840;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1839466102:
                case 145506764:
                    C3660.m10791();
                    C19806.m45024();
                    iM11306 = (ThreadFactoryC3888.m11306("ۛۚ") + i3) * 93;
                    i = ((iM11306 ^ i4) * (-18975)) ^ 317285137;
                    i2 = -2026669991;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1254783606:
                case -375113151:
                    sArr2 = f58141;
                    i12 = 1;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֫ᩳ")) * 85;
                        i = ((iM11306 ^ i3) * 2587) ^ (-2141774073);
                        i2 = 1095612635;
                    } else {
                        iM11306 = (C19806.m45029("֫ᩴ") ^ i4) * (-31);
                        i = ((iM11306 ^ i3) * (-11145)) ^ (-620666841);
                        i2 = -142662651;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1157626294:
                case 198034407:
                    if (C1668.f6641 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۚ") + i3) * 93;
                        i = ((iM11306 ^ i4) * (-18975)) ^ 317285137;
                        i2 = -2026669991;
                    } else {
                        iM11306 = C19806.m45029("֨ᩴ") ^ i4;
                        i = ((iM11306 ^ i3) * 7663) ^ 1510232859;
                        i2 = 260549409;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1068523445:
                case -889360978:
                    i8 = s * s2;
                    i9 = s * s;
                    if (C2704.f10408) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۖ") ^ i3;
                        i = ((iM11306 ^ i4) * 25215) ^ (-494974904);
                        i2 = 1133027870;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֫ᩳ")) * 85;
                        i = ((iM11306 ^ i3) * 2587) ^ (-2141774073);
                        i2 = 1095612635;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -991689710:
                case -431321100:
                    i11 = 19414;
                    iM11306 = ThreadFactoryC3888.m11306("۟᩷") ^ i3;
                    i = ((iM11306 ^ i4) * (-32339)) ^ (-2011565320);
                    i2 = -87357955;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -925609360:
                case 1135475470:
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("ۙ֨") ^ i3;
                        i = ((iM11306 ^ i4) * (-24871)) ^ 818754899;
                        i2 = 1248671198;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۚ") + i3) * 93;
                        i = ((iM11306 ^ i4) * (-18975)) ^ 317285137;
                        i2 = -2026669991;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -879938524:
                case 1142678057:
                    C1377.m4841(this, iM11308);
                    sArr3 = f58141;
                    i7 = 4;
                    if (C3722.m10894() <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֫ᩳ")) * 85;
                        i = ((iM11306 ^ i3) * 2587) ^ (-2141774073);
                        i2 = 1095612635;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۢۚ")) * 17;
                        i = ((iM11306 ^ i3) * 3927) ^ 205311643;
                        i2 = 137462643;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -700032539:
                case 781934642:
                    s = sArr[c];
                    s2 = 23054;
                    if (C0797.m3359()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۛ") ^ i4;
                        i = ((iM11306 ^ i3) * (-1405)) ^ 284033418;
                        i2 = -1939471830;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֫ᩳ")) * 85;
                        i = ((iM11306 ^ i3) * 2587) ^ (-2141774073);
                        i2 = 1095612635;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -677156414:
                case 325049968:
                    iM11308 = 2103110103 ^ ThreadFactoryC3888.m11306(strM10571);
                    if (C2477.f9839 <= 0) {
                        iM11306 = (C19806.m45029("ܶ֡") + i3) * (-21);
                        i = ((iM11306 ^ i4) * (-22539)) ^ (-1785775725);
                        i2 = -591325905;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۢۖ")) * 3;
                        i = ((iM11306 ^ i4) * 17963) ^ 1447755260;
                        i2 = -238949996;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -473807078:
                case 347140694:
                    i11 = 43647;
                    iM11306 = ThreadFactoryC3888.m11306("۟᩷") ^ i3;
                    i = ((iM11306 ^ i4) * (-32339)) ^ (-2011565320);
                    i2 = -87357955;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -292221481:
                case -136322402:
                    if (i8 - (i9 + i10) <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܶ") ^ i4) * 31;
                        i = ((iM11306 ^ i3) * 8081) ^ 199584104;
                        i2 = -548286050;
                    } else {
                        iM11306 = C19806.m45029("᩺᩻") ^ i4;
                        i = ((iM11306 ^ i3) * 31061) ^ 1278533778;
                        i2 = 1486431476;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -105972502:
                case 832634511:
                    i13 = 3;
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֫ᩳ")) * 85;
                        i = ((iM11306 ^ i3) * 2587) ^ (-2141774073);
                        i2 = 1095612635;
                    } else {
                        iM11306 = (C19806.m45029("֨ۚ") + i3) * 69;
                        i = ((iM11306 ^ i4) * 29819) ^ 1018469474;
                        i2 = 383448948;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 97987258:
                case 116661032:
                    C0278.m1784(this, C2249.m6918(sArr3, i7, 3, i11));
                    break;
                case 102650183:
                case 730765114:
                    strM10571 = C3577.m10571(sArr2, i12, i13, i11);
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("ۙ֨") ^ i3;
                        i = ((iM11306 ^ i4) * (-24871)) ^ 818754899;
                        i2 = 1248671198;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬۠") ^ i4) * (-91);
                        i = ((iM11306 ^ i3) * 21031) ^ (-772874061);
                        i2 = -5881821;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1229201454:
                case 1493318901:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۚ") + i3) * 93;
                        i = ((iM11306 ^ i4) * (-18975)) ^ 317285137;
                        i2 = -2026669991;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֫ᩳ")) * 85;
                        i = ((iM11306 ^ i3) * 2587) ^ (-2141774073);
                        i2 = 1095612635;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    c = 0;
                    if (RunnableC3388.m10064()) {
                        iM11306 = (C19806.m45029("᩺ܿ") ^ i4) * (-51);
                        i = ((iM11306 ^ i3) * (-1561)) ^ (-109822991);
                        i2 = -47672548;
                    } else {
                        iM11306 = C19806.m45029("֨ᩴ") ^ i4;
                        i = ((iM11306 ^ i3) * 7663) ^ 1510232859;
                        i2 = 260549409;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C18196() {
        ArrayList arrayList = null;
        int i = -713605146;
        int i2 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i3 = C1460.f5948;
        int iM11306 = ThreadFactoryC3888.m11306("۠֨") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-24431)) ^ 1849090860;
        int i5 = 432061703;
        while (true) {
            i = ((((i ^ i3) * 19313) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2022987389:
                case -1870825441:
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ۖۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10065)) ^ (-2010553165);
                        i5 = 202740451;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ᩳᩳ")) * (-7);
                        i4 = ((iM11306 ^ i2) * (-5679)) ^ (-1697033759);
                        i5 = 243016362;
                    }
                    break;
                case -1809001378:
                case 725767831:
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("ۖۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10065)) ^ (-2010553165);
                        i5 = 202740451;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۘ") ^ i2) * (-37);
                        i4 = ((iM11306 ^ i3) * (-31703)) ^ (-1824942415);
                        i5 = -693432444;
                    }
                    break;
                case -1433835382:
                case -25015902:
                    C7105.m18985();
                    throw new RuntimeException();
                case -1263824060:
                case -153999909:
                    C7105.m18985();
                    C1066.m4023();
                    iM11306 = ThreadFactoryC3888.m11306("ۘ᩸") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-16249)) ^ 1877848331;
                    i5 = -1211864431;
                    break;
                case -1102551842:
                case 1591280035:
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16249)) ^ 1877848331;
                        i5 = -1211864431;
                    } else {
                        iM11306 = C19806.m45029("᩵ᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1801) ^ 1524160123;
                        i5 = 1351429932;
                    }
                    break;
                case -855286260:
                case 1926227624:
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16249)) ^ 1877848331;
                        i5 = -1211864431;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۘ") ^ i2) * (-63);
                        i4 = ((iM11306 ^ i3) * (-28549)) ^ 2072985535;
                        i5 = 2135218838;
                    }
                    break;
                case -851832499:
                case 1351002716:
                    arrayList = new ArrayList();
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24369)) ^ (-213888885);
                        i5 = 240558648;
                    } else {
                        iM11306 = C19806.m45029("ۡ᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13635)) ^ 1314804965;
                        i5 = 1882898001;
                    }
                    break;
                case -756777385:
                case 1674514847:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (C19806.m45029("ۤ᩺") + i3) * 37;
                        i4 = ((iM11306 ^ i2) * (-5181)) ^ (-1145107822);
                        i5 = 28713895;
                    } else {
                        iM11306 = (i2 - C19806.m45029("۬ܽ")) * (-55);
                        i4 = ((iM11306 ^ i3) * (-14261)) ^ 164289360;
                        i5 = -963455791;
                    }
                    break;
                case 432581664:
                case 503982289:
                    if (C1668.m5583()) {
                        iM11306 = C19806.m45029("ᩳ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * 30779) ^ (-1096272479);
                        i5 = 921813615;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16249)) ^ 1877848331;
                        i5 = -1211864431;
                    }
                    break;
                case 656247402:
                case 1560879744:
                    if (!C1668.m5583()) {
                        iM11306 = (C19806.m45029("ۤ᩺") + i3) * 37;
                        i4 = ((iM11306 ^ i2) * (-5181)) ^ (-1145107822);
                        i5 = 28713895;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16249)) ^ 1877848331;
                        i5 = -1211864431;
                    }
                    break;
                case 777660638:
                case 1163101617:
                    if (C3577.f13150 < 0) {
                        iM11306 = (C19806.m45029("ۤ᩺") + i3) * 37;
                        i4 = ((iM11306 ^ i2) * (-5181)) ^ (-1145107822);
                        i5 = 28713895;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۜۢ")) * (-57);
                        i4 = ((iM11306 ^ i2) * (-4143)) ^ 1993591513;
                        i5 = 271618362;
                    }
                    break;
                case 947911416:
                case 1896977078:
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16249)) ^ 1877848331;
                        i5 = -1211864431;
                    } else {
                        iM11306 = C19806.m45029("᩹۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11173)) ^ 1659121960;
                        i5 = 773275148;
                    }
                    break;
                case 1097881384:
                case 1733478413:
                    if (C10634.m26820()) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24369)) ^ (-213888885);
                        i5 = 240558648;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܿۘ")) * (-55);
                        i4 = ((iM11306 ^ i2) * (-6455)) ^ (-640879330);
                        i5 = -1791640616;
                    }
                    break;
                case 1160387461:
                case 1785641789:
                    this.f58143 = arrayList;
                    return;
                case 1192286532:
                case 1889717401:
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("ۖۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10065)) ^ (-2010553165);
                        i5 = 202740451;
                    } else {
                        iM11306 = (C19806.m45029("ۤ᩺") + i3) * 37;
                        i4 = ((iM11306 ^ i2) * (-5181)) ^ (-1145107822);
                        i5 = 28713895;
                    }
                    break;
                default:
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("ۖۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10065)) ^ (-2010553165);
                        i5 = 202740451;
                    } else {
                        iM11306 = C19806.m45029("ۖ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * 22919) ^ 570420794;
                        i5 = -597056121;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5722;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        int i = 1651628504;
        int i2 = AbstractC0464.f2088;
        int i3 = C2642.f10294;
        int iM11306 = (ThreadFactoryC3888.m11306("۠ܽ") + i3) * (-17);
        int i4 = ((iM11306 ^ i2) * 10439) ^ 716240955;
        int i5 = 571354269;
        while (true) {
            i = ((((i ^ i2) * 27359) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2070752037:
                case 1264660434:
                    C7105.m18985();
                    break;
                case -2055342170:
                case 1924558611:
                    C10634.m26820();
                    if (C1460.f5948 >= 0) {
                        iM11306 = (C19806.m45029("۬֨") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i3) * 27621) ^ (-1165206763);
                        i5 = -1703457628;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15943) ^ 1988072181;
                        i5 = 1766451066;
                    }
                    break;
                case -1847758020:
                case -1593160943:
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15943) ^ 1988072181;
                        i5 = 1766451066;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 16053) ^ 1977945880;
                        i5 = 1110016448;
                    }
                    break;
                case -1649723896:
                case -509886000:
                    if (C3286.m9798() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15943) ^ 1988072181;
                        i5 = 1766451066;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-5737)) ^ (-96655298);
                        i5 = -291169004;
                    }
                    break;
                case -1525086196:
                case -633966709:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (C19806.m45029("۬֨") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i3) * 27621) ^ (-1165206763);
                        i5 = -1703457628;
                    } else {
                        iM11306 = (C19806.m45029("֨ۛ") ^ i3) * (-95);
                        i4 = ((iM11306 ^ i2) * 6359) ^ 1284026777;
                        i5 = 772283532;
                    }
                    break;
                case -1228452780:
                case 1575668380:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15943) ^ 1988072181;
                        i5 = 1766451066;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21657)) ^ 1601347276;
                        i5 = -2108396084;
                    }
                    break;
                case -1043299306:
                case -603794073:
                    C10634.m26818(c11545, C2642.m8160(this.f58142));
                    c11545.m28830();
                    iM11306 = C19806.m45029("ۤۤ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-29035)) ^ 1943518650;
                    i5 = 86817804;
                    break;
                case -1014229322:
                case 440929677:
                    if (C2332.f8260) {
                        iM11306 = C19806.m45029("᩵֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7803)) ^ 1896703733;
                        i5 = 70446485;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫֨") ^ i3) * 81;
                        i4 = ((iM11306 ^ i2) * 5867) ^ (-378313371);
                        i5 = -2059246095;
                    }
                    break;
                case -997190812:
                case 93454285:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩶") + i3) * 99;
                        i4 = ((iM11306 ^ i2) * (-19385)) ^ (-272794607);
                        i5 = -1107515436;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6951) ^ (-1008657564);
                        i5 = 1528770909;
                    }
                    break;
                case -874965506:
                case 1797739557:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩻") + i2) * (-123);
                        i4 = ((iM11306 ^ i3) * (-2551)) ^ 2025734055;
                        i5 = 1348165902;
                    } else {
                        iM11306 = (C19806.m45029("ۜۤ") ^ i3) * 65;
                        i4 = ((iM11306 ^ i2) * (-4011)) ^ 668802004;
                        i5 = -1483848413;
                    }
                    break;
                case -729400208:
                case 1565448107:
                    break;
                case -694139246:
                case 245676003:
                    C3722.m10894();
                    RunnableC1895.m6170();
                    iM11306 = (ThreadFactoryC3888.m11306("֫᩶") + i3) * 99;
                    i4 = ((iM11306 ^ i2) * (-19385)) ^ (-272794607);
                    i5 = -1107515436;
                    break;
                case -516526630:
                case 1955562980:
                    if (m41579(c11545)) {
                        iM11306 = (C19806.m45029("᩵᩸") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i3) * (-7107)) ^ 644881;
                        i5 = -1646622019;
                    } else {
                        iM11306 = C19806.m45029("ۤۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-29035)) ^ 1943518650;
                        i5 = 86817804;
                    }
                    break;
                case -78085899:
                case 58546730:
                    if (C0216.m1591() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩶") + i3) * 99;
                        i4 = ((iM11306 ^ i2) * (-19385)) ^ (-272794607);
                        i5 = -1107515436;
                    } else {
                        iM11306 = C19806.m45029("ܿۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 23135) ^ 1582964023;
                        i5 = 164475786;
                    }
                    break;
                case -31829257:
                case -716645:
                    if (!C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩶") + i3) * 99;
                        i4 = ((iM11306 ^ i2) * (-19385)) ^ (-272794607);
                        i5 = -1107515436;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15943) ^ 1988072181;
                        i5 = 1766451066;
                    }
                    break;
                case -22383296:
                case 996275481:
                    if (C1461.m5079(c5202)) {
                        iM11306 = C19806.m45029("ܳ᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27311)) ^ 157922231;
                        i5 = 1796474490;
                    } else {
                        iM11306 = C19806.m45029("ۤۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-29035)) ^ 1943518650;
                        i5 = 86817804;
                    }
                    break;
                case 107145186:
                case 374746681:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("۬֨") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i3) * 27621) ^ (-1165206763);
                        i5 = -1703457628;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۟ܿ")) * (-45);
                        i4 = ((iM11306 ^ i2) * 32619) ^ 2120358907;
                        i5 = -1874199842;
                    }
                    break;
                case 1217815518:
                case 1993490804:
                    C0962.m3746();
                    if (C2704.m8255() > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩻") + i2) * (-123);
                        i4 = ((iM11306 ^ i3) * (-2551)) ^ 2025734055;
                        i5 = 1348165902;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩶") + i3) * 99;
                        i4 = ((iM11306 ^ i2) * (-19385)) ^ (-272794607);
                        i5 = -1107515436;
                    }
                    break;
                default:
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("᩻᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * 10619) ^ 1911783010;
                        i5 = -516800474;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫֨") ^ i3) * 81;
                        i4 = ((iM11306 ^ i2) * 5867) ^ (-378313371);
                        i5 = -2059246095;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 78721. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final l.C5202 mo3077() {
        /*
            Method dump skipped, instruction units count: 7872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18196.mo3077():l.ۚ۟ۜ");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        Iterator itM9863 = null;
        AbstractC20745 abstractC20745 = null;
        int i = -353206628;
        int i2 = AbstractC0464.f2088;
        int i3 = C1419.f5860;
        int iM45029 = (i2 - C19806.m45029("֫᩷")) * (-37);
        int i4 = ((iM45029 ^ i3) * (-15273)) ^ 1891157631;
        int i5 = -1057429490;
        while (true) {
            i = ((((i ^ i3) * 8459) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2089095834:
                case -1617425097:
                    if (C10634.f36300 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28513) ^ 330322263;
                        i5 = -546795566;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31697)) ^ 451946451;
                        i5 = 1670888716;
                    }
                    break;
                case -2029330081:
                case -1794650721:
                    C2477.m7593();
                    if (C0629.f2722 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5703) ^ 592222004;
                        i5 = -1668828112;
                    } else {
                        iM45029 = C19806.m45029("ܰᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2841)) ^ (-1141398495);
                        i5 = 1730199941;
                    }
                    break;
                case -1922499107:
                case -1213848822:
                    if (C1461.m5079(c5202)) {
                        iM45029 = (i3 - C19806.m45029("ܿۢ")) * (-59);
                        i4 = ((iM45029 ^ i2) * (-20271)) ^ 383801287;
                        i5 = -308952609;
                    } else {
                        iM45029 = C19806.m45029("۫ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17513)) ^ (-1068959642);
                        i5 = 1957176372;
                    }
                    break;
                case -1790927015:
                case -6614757:
                    if (C7105.m18985()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ᩴ") + i3) * 51;
                        i4 = ((iM45029 ^ i2) * 19043) ^ 2016541512;
                        i5 = -2098114668;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۚ") + i3) * (-77);
                        i4 = ((iM45029 ^ i2) * (-18757)) ^ (-1700386581);
                        i5 = -71895397;
                    }
                    break;
                case -1683424883:
                case -115320905:
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9983)) ^ (-1700585448);
                        i5 = -853347719;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ᩴ") + i3) * 51;
                        i4 = ((iM45029 ^ i2) * 19043) ^ 2016541512;
                        i5 = -2098114668;
                    }
                    break;
                case -1529493130:
                case -1051371320:
                    if (C0817.f3443) {
                        iM45029 = (C19806.m45029("ܳ֨") + i2) * (-61);
                        i4 = ((iM45029 ^ i3) * 5553) ^ (-10865281);
                        i5 = 1876679107;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ᩴ") + i3) * 51;
                        i4 = ((iM45029 ^ i2) * 19043) ^ 2016541512;
                        i5 = -2098114668;
                    }
                    break;
                case -1525420059:
                case 1015449884:
                    C2332.m7079();
                    if (C7105.f23796 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ᩴ") + i3) * 51;
                        i4 = ((iM45029 ^ i2) * 19043) ^ 2016541512;
                        i5 = -2098114668;
                    } else {
                        iM45029 = C19806.m45029("ܰᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2841)) ^ (-1141398495);
                        i5 = 1730199941;
                    }
                    break;
                case -1291123065:
                case -703098270:
                    C2788.m8475();
                    break;
                case -1237889011:
                case 1338200868:
                    if (C1460.m5050() != 0) {
                        iM45029 = C19806.m45029("ܰᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2841)) ^ (-1141398495);
                        i5 = 1730199941;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙۛ") + i2) * (-55);
                        i4 = ((iM45029 ^ i3) * (-15467)) ^ 277731509;
                        i5 = 1670139128;
                    }
                    break;
                case -1220365467:
                case -520983650:
                    RunnableC3388.m10052(abstractC20745);
                    iM45029 = (i3 - C19806.m45029("ܿۢ")) * (-59);
                    i4 = ((iM45029 ^ i2) * (-20271)) ^ 383801287;
                    i5 = -308952609;
                    break;
                case -953900628:
                case 69522934:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("ܰᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2841)) ^ (-1141398495);
                        i5 = 1730199941;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰᩴ") + i2) * 73;
                        i4 = ((iM45029 ^ i3) * (-18193)) ^ 867745041;
                        i5 = 1619971913;
                    }
                    break;
                case -913956341:
                case 2044053192:
                    if (C10634.f36300 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28513) ^ 330322263;
                        i5 = -546795566;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11261)) ^ (-2130296217);
                        i5 = 310660660;
                    }
                    break;
                case -730374770:
                case 751455811:
                    abstractC20745 = this.f58142;
                    if (abstractC20745 != null) {
                        iM45029 = C19806.m45029("۟ۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25179) ^ (-1732493711);
                        i5 = -1198520486;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܿۢ")) * (-59);
                        i4 = ((iM45029 ^ i2) * (-20271)) ^ 383801287;
                        i5 = -308952609;
                    }
                    break;
                case -514823189:
                case 226224699:
                    C2249.m6915();
                    if (!C0629.m2907()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5703) ^ 592222004;
                        i5 = -1668828112;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28513) ^ 330322263;
                        i5 = -546795566;
                    }
                    break;
                case 85240903:
                case 1769253320:
                    if (RunnableC1564.m5348(itM9863)) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ܿ") ^ i2) * (-41);
                        i4 = ((iM45029 ^ i3) * 10663) ^ 299356568;
                        i5 = -727953354;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨۠") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i2) * 18513) ^ (-107232912);
                        i5 = 787286336;
                    }
                    break;
                case 265415135:
                case 1159790760:
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28513) ^ 330322263;
                        i5 = -546795566;
                    } else {
                        iM45029 = (C19806.m45029("۬ᩴ") + i2) * (-71);
                        i4 = ((iM45029 ^ i3) * (-16761)) ^ 651579800;
                        i5 = 92904511;
                    }
                    break;
                case 700902860:
                case 1020907391:
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(this.f58143);
                    iM45029 = (ThreadFactoryC3888.m11306("ۙܽ") + i3) * (-119);
                    i4 = ((iM45029 ^ i2) * (-12729)) ^ (-1730802128);
                    i5 = -616487898;
                    break;
                case 1061326817:
                case 1246621650:
                    C3286.m9798();
                    C2704.m8255();
                    break;
                case 1227316004:
                case 1846613045:
                    C2332.m7079();
                    iM45029 = C19806.m45029("ܰᩳ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-2841)) ^ (-1141398495);
                    i5 = 1730199941;
                    break;
                case 1424196042:
                case 1966282156:
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ᩸") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 9991) ^ (-444331979);
                        i5 = -1923556430;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5703) ^ 592222004;
                        i5 = -1668828112;
                    }
                    break;
                case 1612846875:
                case 1628954281:
                    if (C3743.f13569) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28669)) ^ (-1489233975);
                        i5 = 1489512944;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۚ") ^ i2) * (-33);
                        i4 = ((iM45029 ^ i3) * 10669) ^ (-2007497261);
                        i5 = -1477809804;
                    }
                    break;
                default:
                    C0526.m2436((AbstractC20745) C0278.m1776(itM9863));
                    iM45029 = (ThreadFactoryC3888.m11306("ۙܽ") + i3) * (-119);
                    i4 = ((iM45029 ^ i2) * (-12729)) ^ (-1730802128);
                    i5 = -616487898;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010f A[PHI: r4
      0x010f: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:33:0x010d, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01fc A[PHI: r1 r8 r10 r12 r13
      0x01fc: PHI (r1v5 java.lang.String) = 
      (r1v2 java.lang.String)
      (r1v4 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
     binds: [B:52:0x01fa, B:41:0x0182, B:16:0x007b, B:9:0x0064, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01fc: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:52:0x01fa, B:41:0x0182, B:16:0x007b, B:9:0x0064, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01fc: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:52:0x01fa, B:41:0x0182, B:16:0x007b, B:9:0x0064, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01fc: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:52:0x01fa, B:41:0x0182, B:16:0x007b, B:9:0x0064, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01fc: PHI (r13v4 short) = (r13v3 short), (r13v2 short), (r13v2 short), (r13v2 short), (r13v2 short) binds: [B:52:0x01fa, B:41:0x0182, B:16:0x007b, B:9:0x0064, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x024f A[PHI: r3 r7 r9
      0x024f: PHI (r3v5 java.lang.String[]) = 
      (r3v2 java.lang.String[])
      (r3v3 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v2 java.lang.String[])
     binds: [B:60:0x024d, B:25:0x00c3, B:18:0x007f, B:16:0x007b, B:88:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r7v5 short[]) = (r7v2 short[]), (r7v3 short[]), (r7v2 short[]), (r7v2 short[]), (r7v2 short[]) binds: [B:60:0x024d, B:25:0x00c3, B:18:0x007f, B:16:0x007b, B:88:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r9v5 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:60:0x024d, B:25:0x00c3, B:18:0x007f, B:16:0x007b, B:88:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0287 A[PHI: r5 r6 r16 r17 r18 r23
      0x0287: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:64:0x0285, B:56:0x0231, B:29:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:64:0x0285, B:56:0x0231, B:29:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x0285, B:56:0x0231, B:29:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:64:0x0285, B:56:0x0231, B:29:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:64:0x0285, B:56:0x0231, B:29:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r23v5 int) = (r23v3 int), (r23v4 int), (r23v3 int) binds: [B:64:0x0285, B:56:0x0231, B:29:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        int iM45029;
        int i;
        int i2;
        int i3 = C2477.f9839;
        int i4 = C0629.f2722;
        int iM11306 = (ThreadFactoryC3888.m11306("ۧ᩷") ^ i3) * 13;
        int i5 = ((iM11306 ^ i4) * 505) ^ 212081812;
        String strM6918 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ 125707694;
        int iM450210 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        char c = 0;
        int i11 = 0;
        int i12 = -1613198451;
        int i13 = 0;
        String[] strArr = null;
        short[] sArr3 = null;
        int i14 = 0;
        String strM41569 = null;
        String strM4969 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-17245)) >> 31));
            switch (i12) {
                case -2047441486:
                case -707455571:
                    return C0216.m1574(ThreadFactoryC3888.m11306(MenuItemOnMenuItemClickListenerC3244.m9715(sArr2, i8, i9, i14)) ^ 2122043477, strArr);
                case -2044561138:
                case -825895703:
                    int i15 = i11 + i13;
                    i10 = i15 + i15;
                    s2 = 10918;
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i4 - C19806.m45029("᩶ܽ")) * (-81);
                        i = ((iM45029 ^ i3) * (-789)) ^ (-846007401);
                        i2 = 291747237;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩶") ^ i3;
                        i = ((iM45029 ^ i4) * 4801) ^ (-1173622305);
                        i2 = 260517432;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2031153511:
                case -1077616556:
                    strM6918 = C2249.m6918(sArr3, 69, 3, i14);
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۚ") ^ i3;
                        i = ((iM45029 ^ i4) * 30425) ^ 1078044443;
                        i2 = 156237163;
                    } else {
                        iM45029 = C19806.m45029("ۙܳ") ^ i3;
                        i = ((iM45029 ^ i4) * (-14307)) ^ (-1604012000);
                        i2 = 460064467;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1917789317:
                case -939980822:
                    strM4969 = C1419.m4969(f58141, 65, 4, i14);
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩺") ^ i3;
                        i = ((iM45029 ^ i4) * 21487) ^ 601643542;
                        i2 = -612235379;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩶ܽ")) * (-81);
                        i = ((iM45029 ^ i3) * (-789)) ^ (-846007401);
                        i2 = 291747237;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1800522767:
                case -1414508796:
                    strM41569 = m41569(strM4969);
                    sArr3 = f58141;
                    if (!C0526.f2219) {
                        iM45029 = C19806.m45029("ۢܳ") ^ i4;
                        i = ((iM45029 ^ i3) * 13187) ^ (-1402384260);
                        i2 = -1786772788;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM11307 = (ThreadFactoryC3888.m11306("ܽ֡") ^ i3) * 53;
                        i5 = ((iM11307 ^ i4) * 4867) ^ (-303572547);
                        i6 = iM11307 ^ 475487763;
                    }
                    break;
                case -1750090170:
                case 315405648:
                    i14 = 57395;
                    iM45029 = (i4 - ThreadFactoryC3888.m11306("᩻֨")) * 43;
                    i = ((iM45029 ^ i3) * 12073) ^ 637960026;
                    i2 = -2067514153;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1719917741:
                case 1459410348:
                    i14 = 31435;
                    iM45029 = (i4 - ThreadFactoryC3888.m11306("᩻֨")) * 43;
                    i = ((iM45029 ^ i3) * 12073) ^ 637960026;
                    i2 = -2067514153;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1437227076:
                case 2038310812:
                    if (C3535.m10431() > 0) {
                        int iM11308 = (ThreadFactoryC3888.m11306("ܽ֡") ^ i3) * 53;
                        i5 = ((iM11308 ^ i4) * 4867) ^ (-303572547);
                        i6 = iM11308 ^ 475487763;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿܶ")) * 83;
                        i = ((iM45029 ^ i4) * (-11689)) ^ 294630001;
                        i2 = -1635532318;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1242061912:
                case -432890994:
                    sArr = f58141;
                    c = '@';
                    if (C1148.m4232() <= 0) {
                        iM45029 = (i4 - C19806.m45029("ܺۗ")) * (-31);
                        i = ((iM45029 ^ i3) * (-10499)) ^ (-1294563737);
                        i2 = -480172353;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܳܽ")) * 47;
                        i = ((iM45029 ^ i4) * 10191) ^ 595765261;
                        i2 = -1989836247;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1055271529:
                case 783838657:
                    C1460.m5050();
                    C2249.m6915();
                    return null;
                case -876121578:
                case 1176931806:
                    C0278.m1789();
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿܶ")) * 83;
                    i = ((iM45029 ^ i4) * (-11689)) ^ 294630001;
                    i2 = -1635532318;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -378777837:
                case 284948199:
                    strArr = new String[]{strM41569, C0671.m3017(iM450210 ^ i7)};
                    sArr2 = f58141;
                    if (C1977.f7413 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿܶ")) * 83;
                        i = ((iM45029 ^ i4) * (-11689)) ^ 294630001;
                        i2 = -1635532318;
                    } else {
                        iM45029 = (C19806.m45029("ܶ᩷") ^ i3) * 11;
                        i = ((iM45029 ^ i4) * 31837) ^ (-521306429);
                        i2 = -512345176;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 296778261:
                case 1710635664:
                    s = sArr[c];
                    if (C2642.f10294 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿܶ")) * 83;
                        i = ((iM45029 ^ i4) * (-11689)) ^ 294630001;
                        i2 = -1635532318;
                    } else {
                        iM45029 = (C19806.m45029("֫ܶ") ^ i4) * (-125);
                        i = ((iM45029 ^ i3) * 11139) ^ (-379200254);
                        i2 = -236658375;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 637849185:
                case 1063343102:
                    C1148.m4232();
                    if (C1189.m4368() > 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿܶ")) * 83;
                        i = ((iM45029 ^ i4) * (-11689)) ^ 294630001;
                        i2 = -1635532318;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩶ܽ")) * (-81);
                        i = ((iM45029 ^ i3) * (-789)) ^ (-846007401);
                        i2 = 291747237;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 934520474:
                case 1190169528:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۚ") ^ i3;
                        i = ((iM45029 ^ i4) * 30425) ^ 1078044443;
                        i2 = 156237163;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩶ܽ")) * (-81);
                        i = ((iM45029 ^ i3) * (-789)) ^ (-846007401);
                        i2 = 291747237;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1112948195:
                case 2142692093:
                    int i16 = s + s2;
                    if ((i16 * i16) - i10 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۗ") ^ i3;
                        i = ((iM45029 ^ i4) * (-5837)) ^ (-575426846);
                        i2 = 1660776360;
                    } else {
                        iM45029 = C19806.m45029("۫᩸") ^ i4;
                        i = ((iM45029 ^ i3) * 9441) ^ 1555359256;
                        i2 = -1978465414;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1510492959:
                case 1937766964:
                    i11 = s * s;
                    i13 = 119202724;
                    if (C0629.f2722 <= 0) {
                        iM45029 = (i4 - C19806.m45029("ܺۗ")) * (-31);
                        i = ((iM45029 ^ i3) * (-10499)) ^ (-1294563737);
                        i2 = -480172353;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۨ") ^ i4;
                        i = ((iM45029 ^ i3) * 26067) ^ 1194862699;
                        i2 = -576003389;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1703371127:
                case 1801313095:
                    iM450210 = C19806.m45029(strM6918);
                    i7 = 2118965214;
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ᩴ") ^ i4) * (-53);
                        i = ((iM45029 ^ i3) * 12751) ^ (-1149574226);
                        i2 = 334459259;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܺۗ")) * (-31);
                        i = ((iM45029 ^ i3) * (-10499)) ^ (-1294563737);
                        i2 = -480172353;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    i8 = 72;
                    i9 = 3;
                    if (C1937.f7317 >= 0) {
                        iM45029 = (i4 - C19806.m45029("᩶ܽ")) * (-81);
                        i = ((iM45029 ^ i3) * (-789)) ^ (-846007401);
                        i2 = 291747237;
                    } else {
                        iM45029 = (C19806.m45029("᩸ܿ") + i4) * 109;
                        i = ((iM45029 ^ i3) * 9949) ^ (-163468926);
                        i2 = -1039478115;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
