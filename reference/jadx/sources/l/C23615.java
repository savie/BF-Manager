package l;

import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩻ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0940 */
/* JADX INFO: loaded from: classes.dex */
public final class C23615 extends AbstractC3492 {

    /* JADX INFO: renamed from: ܿ۟ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f76515 = {6936, -1455, -1452, -1471, -1452, 8555, -1477, -13228, -4359};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f76516;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC18488 f76517;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC14443 f76518;

    /* JADX WARN: Code duplicated, block: B:28:0x00ab A[PHI: r3
      0x00ab: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:27:0x00a9, B:17:0x006c, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x017f A[PHI: r12
      0x017f: PHI (r12v4 short) = (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:46:0x017d, B:12:0x0060, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01d8 A[PHI: r2 r9 r10 r14
      0x01d8: PHI (r2v3 l.ܳۢۨ) = (r2v2 l.ܳۢۨ), (r2v4 l.ܳۢۨ) binds: [B:54:0x01d6, B:35:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:54:0x01d6, B:35:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:54:0x01d6, B:35:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r14v3 short[]) = (r14v2 short[]), (r14v4 short[]) binds: [B:54:0x01d6, B:35:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x022b A[PHI: r7 r8 r15
      0x022b: PHI (r7v4 char) = (r7v3 char), (r7v2 char), (r7v2 char), (r7v2 char), (r7v2 char) binds: [B:62:0x0229, B:58:0x020c, B:31:0x00e0, B:15:0x0069, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:62:0x0229, B:58:0x020c, B:31:0x00e0, B:15:0x0069, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:62:0x0229, B:58:0x020c, B:31:0x00e0, B:15:0x0069, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0255 A[PHI: r4 r5 r11 r20
      0x0255: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:50:0x01b3, B:23:0x0086, B:9:0x005a, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:50:0x01b3, B:23:0x0086, B:9:0x005a, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:50:0x01b3, B:23:0x0086, B:9:0x005a, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r20v4 short[]) = (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v6 short[]) binds: [B:50:0x01b3, B:23:0x0086, B:9:0x005a, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        int iM11306;
        int i;
        int i2;
        int i3 = C2871.f10837;
        int i4 = C3535.f13026;
        int iM45029 = (C19806.m45029("ᩳ᩹") + i4) * 53;
        int i5 = ((iM45029 ^ i3) * 14651) ^ (-825375654);
        String strM3859 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ (-1735023060);
        ActivityC14443 activityC14443 = null;
        int iM11307 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 57469188;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 6881) >> 31));
            switch (i13) {
                case -2084772706:
                case -474632958:
                    activityC14443 = this.f76518;
                    sArr2 = f76515;
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = (C19806.m45029("᩶ۨ") + i3) * (-91);
                        i = ((iM11306 ^ i4) * 21275) ^ 1887051858;
                        i2 = 519845417;
                    } else {
                        iM11306 = (C19806.m45029("ۧۧ") ^ i3) * 87;
                        i = ((iM11306 ^ i4) * 29333) ^ (-1807086424);
                        i2 = 342140341;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2082003832:
                case 1634119057:
                    int i14 = i8 + i9;
                    i10 = i14 + i14;
                    if (C19806.f63586) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ᩳܿ")) * (-25);
                        i = ((iM11306 ^ i3) * (-21037)) ^ (-767961691);
                        i2 = 1539678653;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ۠") ^ i3) * (-103);
                        i = ((iM11306 ^ i4) * (-29529)) ^ (-1570635086);
                        i2 = 166406379;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2081004413:
                case -765122331:
                    iM11307 = ThreadFactoryC3888.m11306(strM3859);
                    i7 = 2116786820;
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ᩳܿ")) * (-25);
                        i = ((iM11306 ^ i3) * (-21037)) ^ (-767961691);
                        i2 = 1539678653;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۗ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i3) * (-14593)) ^ 1712489898;
                        i2 = 108409039;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2005881303:
                case 47630381:
                    i8 = s * s;
                    i9 = 337420161;
                    if (C1066.f4915 <= 0) {
                        iM11306 = (C19806.m45029("᩶ۨ") + i3) * (-91);
                        i = ((iM11306 ^ i4) * 21275) ^ 1887051858;
                        i2 = 519845417;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۢۨ")) * q.h;
                        i = ((iM11306 ^ i4) * (-26555)) ^ 1583241260;
                        i2 = 1068182975;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1855772863:
                case 1327072264:
                    C3743.m10966();
                    RunnableC1895.m6170();
                    break;
                case -1794214210:
                case 1888986391:
                    m10246(activityC14443, iM11307 ^ i7);
                    break;
                case -1714246150:
                case 275470707:
                    i11 = 46522;
                    iM11306 = (C19806.m45029("۠ᩴ") + i4) * (-93);
                    i = ((iM11306 ^ i3) * 8149) ^ (-303950651);
                    i2 = -1466959001;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1709893090:
                case 2105502559:
                    if (C3535.m10431() > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠᩷") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i3) * (-24217)) ^ (-1963043064);
                        i2 = -1841492657;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ᩳܿ")) * (-25);
                        i = ((iM11306 ^ i3) * (-21037)) ^ (-767961691);
                        i2 = 1539678653;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1432329372:
                case -435956176:
                    strM3859 = C1025.m3859(sArr2, i12, 3, i11);
                    if (C3722.f13525 <= 0) {
                        iM11306 = (C19806.m45029("ܽܳ") ^ i3) * (-21);
                        i = ((iM11306 ^ i4) * (-1907)) ^ 489355524;
                        i2 = -1017592929;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۛ᩹")) * (-93);
                        i = ((iM11306 ^ i3) * 1559) ^ 1953307071;
                        i2 = -1474912384;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1383862216:
                case -164114040:
                    s = sArr[c];
                    if (C0817.f3443) {
                        iM11306 = C19806.m45029("ۗۢ") ^ i4;
                        i = ((iM11306 ^ i3) * (-2017)) ^ (-1479558004);
                        i2 = -678410019;
                    } else {
                        iM11306 = C19806.m45029("ۡۚ") ^ i3;
                        i = ((iM11306 ^ i4) * 19053) ^ 1573784501;
                        i2 = -297081400;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1163492290:
                case -1063470429:
                    int i15 = s + s2;
                    if (i10 - (i15 * i15) < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۤ") ^ i4;
                        i = ((iM11306 ^ i3) * 23619) ^ 841786885;
                        i2 = 45801457;
                    } else {
                        iM11306 = C19806.m45029("ܰ۟") ^ i3;
                        i = ((iM11306 ^ i4) * (-24367)) ^ (-1211719819);
                        i2 = -1566855600;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -959520662:
                case 150459174:
                    s2 = 18369;
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠᩷") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i3) * (-24217)) ^ (-1963043064);
                        i2 = -1841492657;
                    } else {
                        iM11306 = C19806.m45029("ܿܰ") ^ i4;
                        i = ((iM11306 ^ i3) * (-20373)) ^ (-1390067701);
                        i2 = -1619238547;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -806836237:
                case 709824706:
                    c = 5;
                    if (C1025.m3861() <= 0) {
                        iM11306 = C19806.m45029("ۡۚ") ^ i3;
                        i = ((iM11306 ^ i4) * 19053) ^ 1573784501;
                        i2 = -297081400;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩸") ^ i3;
                        i = ((iM11306 ^ i4) * 27961) ^ (-1407976478);
                        i2 = 1153905525;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -685307862:
                case 1555704669:
                    C1189.m4368();
                    iM11306 = (C19806.m45029("ܽܳ") ^ i3) * (-21);
                    i = ((iM11306 ^ i4) * (-1907)) ^ 489355524;
                    i2 = -1017592929;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -609058047:
                case 1218782254:
                    i12 = 6;
                    if (C3577.m10565()) {
                        iM11306 = (i3 - C19806.m45029("ۡ۬")) * 9;
                        i = ((iM11306 ^ i4) * 13985) ^ 615945826;
                        i2 = -523728371;
                    } else {
                        iM11306 = C19806.m45029("ۡۚ") ^ i3;
                        i = ((iM11306 ^ i4) * 19053) ^ 1573784501;
                        i2 = -297081400;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -122729992:
                case 1778062582:
                    if (C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠᩷") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i3) * (-24217)) ^ (-1963043064);
                        i2 = -1841492657;
                    } else {
                        iM11306 = C19806.m45029("ۡۚ") ^ i3;
                        i = ((iM11306 ^ i4) * 19053) ^ 1573784501;
                        i2 = -297081400;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 27630453:
                case 748033863:
                    RunnableC1895.m6170();
                    if (C1937.f7317 < 0) {
                        iM11306 = (C19806.m45029("ܽܳ") ^ i3) * (-21);
                        i = ((iM11306 ^ i4) * (-1907)) ^ 489355524;
                        i2 = -1017592929;
                    } else {
                        iM11306 = C19806.m45029("ۡۚ") ^ i3;
                        i = ((iM11306 ^ i4) * 19053) ^ 1573784501;
                        i2 = -297081400;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1566180954:
                case 2064748394:
                    i11 = 18532;
                    iM11306 = (C19806.m45029("۠ᩴ") + i4) * (-93);
                    i = ((iM11306 ^ i3) * 8149) ^ (-303950651);
                    i2 = -1466959001;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f76515;
                    if (C2642.f10294 <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ᩳܿ")) * (-25);
                        i = ((iM11306 ^ i3) * (-21037)) ^ (-767961691);
                        i2 = 1539678653;
                    } else {
                        iM11306 = (C19806.m45029("֫ܰ") ^ i4) * 15;
                        i = ((iM11306 ^ i3) * 14097) ^ (-2007422469);
                        i2 = 1371571029;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C23615(ActivityC14443 activityC14443, ArrayList arrayList, RunnableC18488 runnableC18488) {
        int i = -20811916;
        int i2 = C0050.f912;
        int i3 = C1937.f7317;
        this.f76518 = activityC14443;
        this.f76516 = arrayList;
        this.f76517 = runnableC18488;
        int iM45029 = (C19806.m45029("᩶ۤ") + i2) * 3;
        int i4 = ((iM45029 ^ i3) * (-11833)) ^ (-1774148351);
        int i5 = -1801320707;
        while (true) {
            i = (iM45029 ^ i5) ^ (i4 & (((i ^ i3) * (-27913)) >> 31));
            switch (i) {
                case -2043559198:
                case 1939853900:
                    return;
                case -815327395:
                case -191654775:
                    C3286.m9798();
                    if (C1461.f5957 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶۟") ^ i3) * (-77);
                        i4 = ((iM45029 ^ i2) * (-17707)) ^ (-98853498);
                        i5 = 412952450;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۠֨")) * 7;
                        i4 = ((iM45029 ^ i2) * (-32669)) ^ 1497360765;
                        i5 = 2034520844;
                    }
                    break;
                case -592595167:
                case 311824942:
                    C2124.m6673();
                    C0962.m3746();
                    throw new RuntimeException();
                case -214429219:
                case 1881897422:
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩸") ^ i2) * (-29);
                        i4 = ((iM45029 ^ i3) * (-28763)) ^ (-1449682260);
                        i5 = 749561211;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28117) ^ 125514223;
                        i5 = -2091993601;
                    }
                    break;
                case -135037736:
                case 1227792006:
                    C2332.m7079();
                    iM45029 = C19806.m45029("۫ۛ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-807)) ^ 2075355169;
                    i5 = 923868956;
                    break;
                case 191195535:
                case 2123017938:
                    C3722.m10894();
                    if (!C0526.f2219) {
                        iM45029 = C19806.m45029("۫ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-807)) ^ 2075355169;
                        i5 = 923868956;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶۟") ^ i3) * (-77);
                        i4 = ((iM45029 ^ i2) * (-17707)) ^ (-98853498);
                        i5 = 412952450;
                    }
                    break;
                default:
                    C0962.m3746();
                    if (C3722.f13525 > 0) {
                        iM45029 = C19806.m45029("۫ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-807)) ^ 2075355169;
                        i5 = 923868956;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۫ۙ")) * (-51);
                        i4 = ((iM45029 ^ i3) * (-12655)) ^ (-1185065310);
                        i5 = 610013833;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0232 A[PHI: r5 r10 r12 r15
      0x0232: PHI (r5v2 l.ܺۗ᩺) = (r5v1 l.ܺۗ᩺), (r5v1 l.ܺۗ᩺), (r5v1 l.ܺۗ᩺), (r5v3 l.ܺۗ᩺) binds: [B:58:0x0230, B:13:0x0078, B:10:0x006f, B:95:0x0232] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r10v3 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v4 short[]) binds: [B:58:0x0230, B:13:0x0078, B:10:0x006f, B:95:0x0232] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:58:0x0230, B:13:0x0078, B:10:0x006f, B:95:0x0232] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r15v3 int) = (r15v2 int), (r15v1 int), (r15v1 int), (r15v1 int) binds: [B:58:0x0230, B:13:0x0078, B:10:0x006f, B:95:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0264 A[PHI: r3 r4 r13 r25
      0x0264: PHI (r3v2 int) = (r3v1 int), (r3v1 int), (r3v3 int) binds: [B:62:0x0262, B:7:0x0066, B:96:0x0264] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r4v2 l.ۢۗ᩺[]) = (r4v1 l.ۢۗ᩺[]), (r4v1 l.ۢۗ᩺[]), (r4v3 l.ۢۗ᩺[]) binds: [B:62:0x0262, B:7:0x0066, B:96:0x0264] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r13v3 int) = (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:62:0x0262, B:7:0x0066, B:96:0x0264] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r25v5 short) = (r25v4 short), (r25v3 short), (r25v3 short) binds: [B:62:0x0262, B:7:0x0066, B:96:0x0264] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0298 A[PHI: r18 r19
      0x0298: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short) binds: [B:66:0x0296, B:15:0x007c, B:13:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0298: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short) binds: [B:66:0x0296, B:15:0x007c, B:13:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02e5 A[PHI: r2 r11 r16 r17 r24
      0x02e5: PHI (r2v8 java.lang.String) = 
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v3 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
     binds: [B:74:0x02e3, B:70:0x02c6, B:48:0x01bc, B:10:0x006f, B:7:0x0066, B:94:0x02e5] A[DONT_GENERATE, DONT_INLINE]
      0x02e5: PHI (r11v7 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v8 int) binds: [B:74:0x02e3, B:70:0x02c6, B:48:0x01bc, B:10:0x006f, B:7:0x0066, B:94:0x02e5] A[DONT_GENERATE, DONT_INLINE]
      0x02e5: PHI (r16v7 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:74:0x02e3, B:70:0x02c6, B:48:0x01bc, B:10:0x006f, B:7:0x0066, B:94:0x02e5] A[DONT_GENERATE, DONT_INLINE]
      0x02e5: PHI (r17v7 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:74:0x02e3, B:70:0x02c6, B:48:0x01bc, B:10:0x006f, B:7:0x0066, B:94:0x02e5] A[DONT_GENERATE, DONT_INLINE]
      0x02e5: PHI (r24v7 l.ܳۢۨ) = (r24v1 l.ܳۢۨ), (r24v1 l.ܳۢۨ), (r24v3 l.ܳۢۨ), (r24v1 l.ܳۢۨ), (r24v1 l.ܳۢۨ), (r24v1 l.ܳۢۨ) binds: [B:74:0x02e3, B:70:0x02c6, B:48:0x01bc, B:10:0x006f, B:7:0x0066, B:94:0x02e5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        C23615 c23615 = this;
        String strM46730 = null;
        int i4 = 0;
        EnumC9326[] enumC9326Arr = null;
        C15676 c15676M22397 = null;
        C10031 c10031 = null;
        Iterator itM5072 = null;
        C22722 c22722 = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = -875456116;
        int i8 = AbstractC0464.f2088;
        int i9 = RunnableC0195.f1321;
        int iM450211 = (C19806.m45029("᩵ᩳ") + i9) * (-115);
        int i10 = ((iM450211 ^ i8) * (-13529)) ^ 956812598;
        int i11 = iM450211 ^ (-1217488360);
        short[] sArr = null;
        short[] sArr2 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        ActivityC14443 activityC14443 = null;
        short s3 = 0;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i8) * (-11015)) >> 31));
            switch (i7) {
                case -2045072627:
                case 1439859491:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    break;
                case -2043182203:
                case 695662674:
                    C7105.m18985();
                    if (C10634.f36300 < 0) {
                        iM450210 = C19806.m45029("᩻ۜ") ^ i8;
                        i10 = ((iM450210 ^ i9) * (-24573)) ^ (-932619191);
                        i3 = -1084854521;
                    } else {
                        iM450210 = C19806.m45029("ܳ᩻") ^ i9;
                        i10 = ((iM450210 ^ i8) * (-3855)) ^ 2143474950;
                        i3 = 931047671;
                    }
                    i11 = iM450210 ^ i3;
                    c23615 = this;
                    break;
                case -2028053530:
                case 1103324560:
                    activityC14443.f47363.m46735(c15676M22397.mo19151());
                    break;
                case -1800698100:
                case -1793034986:
                    C1419.m4973();
                    if (C1875.f7103 >= 0) {
                        iM450210 = (C19806.m45029("ۢ۫") + i9) * (-77);
                        i10 = ((iM450210 ^ i8) * (-9031)) ^ 46940405;
                        i3 = -306265033;
                    } else {
                        iM450210 = C19806.m45029("᩻ۜ") ^ i8;
                        i10 = ((iM450210 ^ i9) * (-24573)) ^ (-932619191);
                        i3 = -1084854521;
                    }
                    i11 = iM450210 ^ i3;
                    c23615 = this;
                    break;
                case -1189069346:
                case 125136475:
                    i6 = s2 + s3;
                    if (C3743.f13569) {
                        iM450210 = ThreadFactoryC3888.m11306("ܶۨ") ^ i9;
                        i10 = ((iM450210 ^ i8) * 21953) ^ (-1543215866);
                        i3 = -515360032;
                    } else {
                        iM450210 = C19806.m45029("᩻ۜ") ^ i8;
                        i10 = ((iM450210 ^ i9) * (-24573)) ^ (-932619191);
                        i3 = -1084854521;
                    }
                    i11 = iM450210 ^ i3;
                    c23615 = this;
                    break;
                case -1096087647:
                case 697281482:
                    C10031 c10031M37346 = c15676M22397.m37346(C2477.m7604(sArr2, i14, i13, i12));
                    itM5072 = C1461.m5072(c23615.f76516);
                    c10031 = c10031M37346;
                    iM45029 = (ThreadFactoryC3888.m11306("ܽ᩵") + i9) * 83;
                    i = ((iM45029 ^ i8) * 26977) ^ (-1639961190);
                    i2 = -3516151;
                    i11 = iM45029 ^ i2;
                    i10 = i;
                    break;
                case -1078636649:
                case 1707607536:
                    C2249.m6915();
                    if (C1025.f4800 >= 0) {
                        iM450210 = C19806.m45029("ܳ᩻") ^ i9;
                        i10 = ((iM450210 ^ i8) * (-3855)) ^ 2143474950;
                        i3 = 931047671;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ܰۨ") ^ i8;
                        i10 = ((iM450210 ^ i9) * (-7179)) ^ (-1277722389);
                        i3 = -564801254;
                    }
                    i11 = iM450210 ^ i3;
                    c23615 = this;
                    break;
                case -970767702:
                case -118885986:
                    c = 0;
                    if (C0797.f3386) {
                        iM450210 = C19806.m45029("ܳ᩻") ^ i9;
                        i10 = ((iM450210 ^ i8) * (-3855)) ^ 2143474950;
                        i3 = 931047671;
                    } else {
                        iM450210 = (C19806.m45029("ᩴᩳ") + i8) * (-103);
                        i10 = ((iM450210 ^ i9) * (-13371)) ^ (-1367815407);
                        i3 = 892764697;
                    }
                    i11 = iM450210 ^ i3;
                    c23615 = this;
                    break;
                case -769983067:
                case 2119488997:
                    sArr = f76515;
                    if (C1025.f4800 >= 0) {
                        iM450210 = C19806.m45029("ܳ᩻") ^ i9;
                        i10 = ((iM450210 ^ i8) * (-3855)) ^ 2143474950;
                        i3 = 931047671;
                    } else {
                        iM450210 = C19806.m45029("ܰܶ") ^ i9;
                        i10 = ((iM450210 ^ i8) * 15857) ^ (-1916395674);
                        i3 = 1710650111;
                    }
                    i11 = iM450210 ^ i3;
                    c23615 = this;
                    break;
                case -735604544:
                case 1386573846:
                    i12 = 64053;
                    iM450210 = C19806.m45029("ۛܿ") ^ i9;
                    i10 = ((iM450210 ^ i8) * (-30849)) ^ 1326904606;
                    i3 = -1051195741;
                    i11 = iM450210 ^ i3;
                    c23615 = this;
                    break;
                case -512783880:
                case -469058956:
                    if (C0962.m3748(itM5072)) {
                        iM45029 = (C19806.m45029("ܿᩴ") + i8) * 73;
                        i = ((iM45029 ^ i9) * 4093) ^ (-903583424);
                        i2 = 29952265;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۤ") ^ i9) * (-63);
                        i = ((iM45029 ^ i8) * 30143) ^ (-1839897477);
                        i2 = -280262268;
                    }
                    i11 = iM45029 ^ i2;
                    i10 = i;
                    break;
                case -475470509:
                case 828068866:
                    c15676M22397 = AbstractC8620.m22397(strM46730, enumC9326Arr);
                    sArr2 = f76515;
                    i14 = 1;
                    if (C0671.m3008() < 0) {
                        iM45029 = C19806.m45029("ᩴۨ") ^ i8;
                        i = ((iM45029 ^ i9) * (-25601)) ^ 328588162;
                        i2 = -1339624468;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    } else {
                        iM450210 = C19806.m45029("᩻ۜ") ^ i8;
                        i10 = ((iM450210 ^ i9) * (-24573)) ^ (-932619191);
                        i3 = -1084854521;
                        i11 = iM450210 ^ i3;
                        c23615 = this;
                    }
                    break;
                case -415767583:
                case 2118619063:
                    C0671.m3008();
                    iM450210 = (C19806.m45029("ۢ۫") + i9) * (-77);
                    i10 = ((iM450210 ^ i8) * (-9031)) ^ 46940405;
                    i3 = -306265033;
                    i11 = iM450210 ^ i3;
                    c23615 = this;
                    break;
                case -397967809:
                case 1801388349:
                    i13 = 4;
                    if (C1977.f7413 > 0) {
                        iM45029 = C19806.m45029("᩵۬") ^ i8;
                        i = ((iM45029 ^ i9) * (-14237)) ^ 1977475106;
                        i2 = -422933615;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    } else {
                        iM450210 = C19806.m45029("ܳ᩻") ^ i9;
                        i10 = ((iM450210 ^ i8) * (-3855)) ^ 2143474950;
                        i3 = 931047671;
                        i11 = iM450210 ^ i3;
                        c23615 = this;
                    }
                    break;
                case -67045827:
                case 329831741:
                    enumC9326Arr[0] = EnumC9326.OrderedField;
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("֨ۧ") ^ i9) * 127;
                        i = ((iM45029 ^ i8) * 4389) ^ 1967746232;
                        i2 = -110126589;
                    } else {
                        iM45029 = (C19806.m45029("ۚۧ") ^ i9) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM45029 ^ i8) * 24763) ^ 1037740374;
                        i2 = 943449088;
                    }
                    i11 = iM45029 ^ i2;
                    i10 = i;
                    break;
                case 456749153:
                case 1786171425:
                    i5 = s2 * s;
                    s3 = 4496;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ܰۨ") ^ i8;
                        i10 = ((iM450210 ^ i9) * (-7179)) ^ (-1277722389);
                        i3 = -564801254;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("۫ۨ") ^ i9) * (-109);
                        i10 = ((iM450210 ^ i8) * 3633) ^ 1979181336;
                        i3 = 960439633;
                    }
                    i11 = iM450210 ^ i3;
                    c23615 = this;
                    break;
                case 530412423:
                case 1539651631:
                    s2 = sArr[c];
                    s = 17984;
                    if (C1148.f5161 <= 0) {
                        iM450210 = (C19806.m45029("ۢ۫") + i9) * (-77);
                        i10 = ((iM450210 ^ i8) * (-9031)) ^ 46940405;
                        i3 = -306265033;
                    } else {
                        iM450210 = C19806.m45029("ۛۧ") ^ i8;
                        i10 = ((iM450210 ^ i9) * (-9665)) ^ (-573006936);
                        i3 = 1130044458;
                    }
                    i11 = iM450210 ^ i3;
                    c23615 = this;
                    break;
                case 628331386:
                case 1653410612:
                    ActivityC14443 activityC14444 = c23615.f76518;
                    strM46730 = activityC14444.f47363.m46730();
                    if (C0797.f3386) {
                        activityC14443 = activityC14444;
                        iM450210 = C19806.m45029("ܳ᩻") ^ i9;
                        i10 = ((iM450210 ^ i8) * (-3855)) ^ 2143474950;
                        i3 = 931047671;
                        i11 = iM450210 ^ i3;
                    } else {
                        int iM11306 = ThreadFactoryC3888.m11306("ۨܳ") ^ i8;
                        i11 = iM11306 ^ 1613515013;
                        activityC14443 = activityC14444;
                        i10 = ((iM11306 ^ i9) * 8883) ^ 2024240057;
                    }
                    c23615 = this;
                    break;
                case 680636125:
                case 944644969:
                    i4 = 1;
                    enumC9326Arr = new EnumC9326[1];
                    if (C3577.f13150 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸۟") + i9) * (-127);
                        i = ((iM45029 ^ i8) * 30045) ^ 338211337;
                        i2 = -1527193209;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ܰۨ") ^ i8;
                        i10 = ((iM450210 ^ i9) * (-7179)) ^ (-1277722389);
                        i3 = -564801254;
                        i11 = iM450210 ^ i3;
                        c23615 = this;
                    }
                    break;
                case 740054619:
                case 1482293536:
                    i12 = 51614;
                    iM450210 = C19806.m45029("ۛܿ") ^ i9;
                    i10 = ((iM450210 ^ i8) * (-30849)) ^ 1326904606;
                    i3 = -1051195741;
                    i11 = iM450210 ^ i3;
                    c23615 = this;
                    break;
                case 899996181:
                case 1185698630:
                    c22722 = (C22722) C0278.m1776(itM5072);
                    if (c22722.f74020 != null) {
                        iM45029 = (C19806.m45029("ۢܽ") + i8) * 83;
                        i = ((iM45029 ^ i9) * (-22789)) ^ 1243663046;
                        i2 = 1763153116;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩵") + i9) * 83;
                        i = ((iM45029 ^ i8) * 26977) ^ (-1639961190);
                        i2 = -3516151;
                    }
                    i11 = iM45029 ^ i2;
                    i10 = i;
                    break;
                case 1117588161:
                case 1403561537:
                    if ((i6 * i6) - i5 < 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۤ۬") ^ i8;
                        i10 = ((iM450210 ^ i9) * 9697) ^ (-1095421689);
                        i3 = 1954430452;
                    } else {
                        iM450210 = C19806.m45029("ۛ֡") ^ i8;
                        i10 = ((iM450210 ^ i9) * 3273) ^ (-963966028);
                        i3 = -1941570111;
                    }
                    i11 = iM450210 ^ i3;
                    c23615 = this;
                    break;
                default:
                    c10031.m25311(c22722.f74019).set(i4, c22722.f74020);
                    iM45029 = (ThreadFactoryC3888.m11306("ܽ᩵") + i9) * 83;
                    i = ((iM45029 ^ i8) * 26977) ^ (-1639961190);
                    i2 = -3516151;
                    i11 = iM45029 ^ i2;
                    i10 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f76517.run();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C1025.m3860(this);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        ActivityC14443 activityC14443 = null;
        int i = 1499874227;
        int i2 = C2788.f10625;
        int i3 = C10634.f36300;
        int iM45029 = C19806.m45029("ܶ֨") ^ i2;
        int i4 = ((iM45029 ^ i3) * 22741) ^ (-964304082);
        int i5 = -1305465410;
        while (true) {
            i = ((((i ^ i3) * (-22065)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2067791633:
                case -1059316557:
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("᩶ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3527) ^ 349932507;
                        i5 = 1932975993;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8273) ^ 1302831459;
                        i5 = -1463403631;
                    }
                    break;
                case -1865019768:
                case -17089688:
                    activityC14443 = this.f76518;
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11059) ^ 1822168835;
                        i5 = 64534017;
                    } else {
                        iM45029 = (C19806.m45029("ܰۙ") ^ i2) * (-21);
                        i4 = ((iM45029 ^ i3) * 6339) ^ (-515733439);
                        i5 = -1706630342;
                    }
                    break;
                case -1788087303:
                case 2118023032:
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("᩶ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3527) ^ 349932507;
                        i5 = 1932975993;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3363)) ^ 464489904;
                        i5 = 1107238190;
                    }
                    break;
                case -1595656213:
                case 1089591963:
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۤ") ^ i2) * 69;
                        i4 = ((iM45029 ^ i3) * (-5155)) ^ 1994546645;
                        i5 = -882074639;
                    } else {
                        iM45029 = (C19806.m45029("ۛ᩸") ^ i2) * (-43);
                        i4 = ((iM45029 ^ i3) * (-31659)) ^ 333091946;
                        i5 = -1190113746;
                    }
                    break;
                case -1546968788:
                case 2044994710:
                    C3743.m10966();
                    C1419.m4973();
                    break;
                case -1519727132:
                case 398559483:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (C19806.m45029("᩵ۛ") + i2) * 45;
                        i4 = ((iM45029 ^ i3) * 21053) ^ (-426731055);
                        i5 = 945522304;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27313) ^ (-1813287404);
                        i5 = 1082532023;
                    }
                    break;
                case -1475018007:
                case 1328795551:
                    if (C1460.m5050() == 0) {
                        iM45029 = C19806.m45029("ۤۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1407) ^ 1634285139;
                        i5 = -1062395262;
                    } else {
                        iM45029 = (C19806.m45029("᩵ۛ") + i2) * 45;
                        i4 = ((iM45029 ^ i3) * 21053) ^ (-426731055);
                        i5 = 945522304;
                    }
                    break;
                case -1126394178:
                case 1820685398:
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("᩶ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3527) ^ 349932507;
                        i5 = 1932975993;
                    } else {
                        iM45029 = (C19806.m45029("᩵ۛ") + i2) * 45;
                        i4 = ((iM45029 ^ i3) * 21053) ^ (-426731055);
                        i5 = 945522304;
                    }
                    break;
                case -1095719559:
                case 2141782687:
                    C1668.m5583();
                    iM45029 = (C19806.m45029("᩵ۛ") + i2) * 45;
                    i4 = ((iM45029 ^ i3) * 21053) ^ (-426731055);
                    i5 = 945522304;
                    break;
                case -869197792:
                case 712523474:
                    C3286.m9798();
                    if (!C1377.f5749) {
                        iM45029 = (C19806.m45029("᩵ۛ") + i2) * 45;
                        i4 = ((iM45029 ^ i3) * 21053) ^ (-426731055);
                        i5 = 945522304;
                    } else {
                        iM45029 = (C19806.m45029("ۛ᩸") ^ i2) * (-43);
                        i4 = ((iM45029 ^ i3) * (-31659)) ^ 333091946;
                        i5 = -1190113746;
                    }
                    break;
                case -381789777:
                case 1630352020:
                    C0671.m3019(activityC14443, exc, null);
                    break;
                case -58828346:
                case 458961864:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (C19806.m45029("ۛ᩸") ^ i2) * (-43);
                        i4 = ((iM45029 ^ i3) * (-31659)) ^ 333091946;
                        i5 = -1190113746;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1105) ^ 2006528863;
                        i5 = -260698396;
                    }
                    break;
                case 409865359:
                case 1742611034:
                    if (C2249.f8050 >= 0) {
                        iM45029 = C19806.m45029("ۤۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1407) ^ 1634285139;
                        i5 = -1062395262;
                    } else {
                        iM45029 = C19806.m45029("ܶۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6325)) ^ (-2039841158);
                        i5 = -826982529;
                    }
                    break;
                case 460666558:
                case 646520559:
                    if (C0671.m3008() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11059) ^ 1822168835;
                        i5 = 64534017;
                    } else {
                        iM45029 = C19806.m45029("ۙۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-31629)) ^ 268156106;
                        i5 = 355609930;
                    }
                    break;
                case 1002695235:
                case 1649935011:
                    if (C1419.f5860 >= 0) {
                        iM45029 = (C19806.m45029("ۛ᩸") ^ i2) * (-43);
                        i4 = ((iM45029 ^ i3) * (-31659)) ^ 333091946;
                        i5 = -1190113746;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-27945)) ^ (-439850862);
                        i5 = -1718805556;
                    }
                    break;
                default:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (C19806.m45029("ۛ᩸") ^ i2) * (-43);
                        i4 = ((iM45029 ^ i3) * (-31659)) ^ 333091946;
                        i5 = -1190113746;
                    } else {
                        iM45029 = (C19806.m45029("ܰۖ") + i3) * 95;
                        i4 = ((iM45029 ^ i2) * (-2155)) ^ (-45026435);
                        i5 = 1137365924;
                    }
                    break;
            }
            return;
        }
    }
}
