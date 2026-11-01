package l;

import android.view.View;
import android.view.ViewGroup;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;
import java.util.function.IntConsumer;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۧۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H1R6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10904 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨ۤ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f37088 = {5281, -32166, -30058, -28143, -27394, 28143, -22362, -29008, 27648, -24872, 28981, -24709, 25290, 9619, 16709, -22888, 16431, 32675, -17127, 29023, 9279, -18837, -26913, 20830};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f37089;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC23604 f37090;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f37091;

    public C10904(ViewOnClickListenerC23604 viewOnClickListenerC23604) {
        C23238 c23238 = null;
        int i = -135841558;
        int i2 = C1025.f4800;
        int i3 = C2249.f8050;
        this.f37090 = viewOnClickListenerC23604;
        int iM11306 = ThreadFactoryC3888.m11306("ᩳۤ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 22289) ^ (-1865329249);
        int i5 = -1506062392;
        while (true) {
            i = ((((i ^ i2) * (-16389)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1775569576:
                case -855500194:
                    C0050.m946();
                    C0962.m3746();
                    throw new RuntimeException();
                case -1727732280:
                case 1699476611:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("ۚۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-6907)) ^ 1938918314;
                        i5 = 844739075;
                    } else {
                        iM11306 = (C19806.m45029("ۛܺ") + i3) * 7;
                        i4 = ((iM11306 ^ i2) * 12775) ^ 1623399229;
                        i5 = -728250086;
                    }
                    break;
                case -1687381060:
                case -32721301:
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("ܿ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12697) ^ (-618798437);
                        i5 = 275763862;
                    } else {
                        iM11306 = C19806.m45029("᩻ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9867) ^ (-620570227);
                        i5 = 794550819;
                    }
                    break;
                case -1665269528:
                case 1003810132:
                    if (RunnableC1564.m5345()) {
                        iM11306 = (C19806.m45029("ۛܺ") + i3) * 7;
                        i4 = ((iM11306 ^ i2) * 12775) ^ 1623399229;
                        i5 = -728250086;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19517) ^ 986906346;
                        i5 = 1047482789;
                    }
                    break;
                case -1585564188:
                case 1344875457:
                    if (C7105.m18985()) {
                        iM11306 = C19806.m45029("ۚۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-6907)) ^ 1938918314;
                        i5 = 844739075;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֨᩷")) * (-41);
                        i4 = ((iM11306 ^ i2) * (-24493)) ^ 47530291;
                        i5 = 1520554420;
                    }
                    break;
                case -1383035800:
                case 1717249142:
                    c23238 = C23238.f75405;
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("ۗۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5525) ^ (-222578721);
                        i5 = 1499950659;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4421) ^ 1573135449;
                        i5 = -1779887872;
                    }
                    break;
                case -1312617566:
                case -488071797:
                    if (!C0797.f3386) {
                        iM11306 = (C19806.m45029("ۛܺ") + i3) * 7;
                        i4 = ((iM11306 ^ i2) * 12775) ^ 1623399229;
                        i5 = -728250086;
                    } else {
                        iM11306 = C19806.m45029("ۙܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-199)) ^ (-306324826);
                        i5 = -875275776;
                    }
                    break;
                case -1152707614:
                case 895648880:
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ۚۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-6907)) ^ 1938918314;
                        i5 = 844739075;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩶") + i2) * (-125);
                        i4 = ((iM11306 ^ i3) * 23721) ^ 1413423792;
                        i5 = 1732899174;
                    }
                    break;
                case -1106348508:
                case -573787391:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = C19806.m45029("ܿ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12697) ^ (-618798437);
                        i5 = 275763862;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30747)) ^ 585251091;
                        i5 = -2137288624;
                    }
                    break;
                case -1495775:
                case 465487747:
                    this.f37091 = c23238;
                    return;
                case 188539129:
                case 2146370209:
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("ۚۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-6907)) ^ 1938918314;
                        i5 = 844739075;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2601) ^ 1293087104;
                        i5 = 1558023675;
                    }
                    break;
                case 445079449:
                case 459633993:
                    C2871.m8646();
                    iM11306 = (C19806.m45029("ۛܺ") + i3) * 7;
                    i4 = ((iM11306 ^ i2) * 12775) ^ 1623399229;
                    i5 = -728250086;
                    break;
                case 905613107:
                case 1812817295:
                    if (C1875.m6086() != 0) {
                        iM11306 = C19806.m45029("ܿ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12697) ^ (-618798437);
                        i5 = 275763862;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-15981)) ^ 1717748267;
                        i5 = 1811548558;
                    }
                    break;
                case 1091532378:
                case 1788450516:
                    if (C0817.f3443) {
                        iM11306 = C19806.m45029("ۨۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 6355) ^ (-1053932502);
                        i5 = -174521682;
                    } else {
                        iM11306 = C19806.m45029("ۗۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5525) ^ (-222578721);
                        i5 = 1499950659;
                    }
                    break;
                case 1435151921:
                case 2012533534:
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("ܿ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12697) ^ (-618798437);
                        i5 = 275763862;
                    } else {
                        iM11306 = C19806.m45029("᩺۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22263)) ^ 962855612;
                        i5 = 226393215;
                    }
                    break;
                default:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("ۗۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5525) ^ (-222578721);
                        i5 = 1499950659;
                    } else {
                        iM11306 = C19806.m45029("ۙܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-199)) ^ (-306324826);
                        i5 = -875275776;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0427 A[PHI: r2 r9 r12 r13 r20 r21 r22 r23 r27 r29
      0x0427: PHI (r2v4 l.᩻ۡ᩺) = (r2v3 l.᩻ۡ᩺), (r2v2 l.᩻ۡ᩺), (r2v2 l.᩻ۡ᩺), (r2v2 l.᩻ۡ᩺) binds: [B:83:0x040d, B:78:0x03d6, B:76:0x03ba, B:28:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0427: PHI (r9v37 java.lang.Object) = (r9v14 java.lang.Object), (r9v15 java.lang.Object), (r9v16 java.lang.Object), (r9v40 java.lang.Object) binds: [B:83:0x040d, B:78:0x03d6, B:76:0x03ba, B:28:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0427: PHI (r12v50 int) = (r12v17 int), (r12v18 int), (r12v19 int), (r12v51 int) binds: [B:83:0x040d, B:78:0x03d6, B:76:0x03ba, B:28:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0427: PHI (r13v36 int) = (r13v15 int), (r13v16 int), (r13v17 int), (r13v37 int) binds: [B:83:0x040d, B:78:0x03d6, B:76:0x03ba, B:28:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0427: PHI (r20v18 l.۠ۡۜ) = (r20v8 l.۠ۡۜ), (r20v9 l.۠ۡۜ), (r20v10 l.۠ۡۜ), (r20v19 l.۠ۡۜ) binds: [B:83:0x040d, B:78:0x03d6, B:76:0x03ba, B:28:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0427: PHI (r21v18 int) = (r21v8 int), (r21v9 int), (r21v10 int), (r21v19 int) binds: [B:83:0x040d, B:78:0x03d6, B:76:0x03ba, B:28:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0427: PHI (r22v16 short[]) = (r22v8 short[]), (r22v9 short[]), (r22v10 short[]), (r22v17 short[]) binds: [B:83:0x040d, B:78:0x03d6, B:76:0x03ba, B:28:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0427: PHI (r23v20 short[]) = (r23v8 short[]), (r23v9 short[]), (r23v10 short[]), (r23v21 short[]) binds: [B:83:0x040d, B:78:0x03d6, B:76:0x03ba, B:28:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0427: PHI (r27v27 android.view.ViewGroup) = 
      (r27v12 android.view.ViewGroup)
      (r27v13 android.view.ViewGroup)
      (r27v14 android.view.ViewGroup)
      (r27v28 android.view.ViewGroup)
     binds: [B:83:0x040d, B:78:0x03d6, B:76:0x03ba, B:28:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0427: PHI (r29v26 int) = (r29v11 int), (r29v12 int), (r29v13 int), (r29v27 int) binds: [B:83:0x040d, B:78:0x03d6, B:76:0x03ba, B:28:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        int i;
        int iM11306;
        int i2;
        int i3;
        int iM45029;
        int i4;
        int i5;
        ViewGroup viewGroup;
        int i6;
        Object obj;
        short[] sArr;
        int i7;
        C8067 c8067;
        short[] sArr2;
        C8067 c8068;
        int iM450210;
        int i8;
        int i9;
        int i10;
        ViewGroup viewGroup2;
        int i11;
        Object obj2;
        C8067 c8069;
        int iM11307;
        int i12;
        int i13;
        int iM11308;
        int i14;
        int i15;
        ViewGroup viewGroup3;
        int i16 = 281538650;
        int i17 = C1419.f5860;
        int i18 = C1398.f5802;
        int iM450211 = C19806.m45029("֡֨") ^ i18;
        int i19 = ((iM450211 ^ i17) * 7495) ^ 1973400397;
        int i20 = iM450211 ^ (-1769923886);
        ViewGroup viewGroup4 = null;
        Object[] objArr = null;
        String strM8640 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        final ViewOnClickListenerC23604 viewOnClickListenerC23604 = null;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int iM450212 = 0;
        int i24 = 0;
        short s = 0;
        short s2 = 0;
        int i25 = 0;
        int i26 = 0;
        int iM11309 = 0;
        C8067 c80610 = null;
        final DialogInterfaceC19356 dialogInterfaceC19356M5514 = null;
        short[] sArr5 = null;
        Object obj3 = null;
        final C5964 c5964 = null;
        final ?? r4 = 0;
        int i27 = 0;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i17) * 6237) >> 31));
            switch (i16) {
                case -2084695877:
                case -1170614546:
                    viewGroup = viewGroup4;
                    obj = obj3;
                    c8067 = c80610;
                    sArr = sArr4;
                    iM11309 = ThreadFactoryC3888.m11306(C1875.m6105(f37088, 4, 3, i21));
                    i23 = 2126163866;
                    if (C1461.f5957 <= 0) {
                        i6 = 2126163866;
                        sArr2 = sArr3;
                        iM450210 = ThreadFactoryC3888.m11306("ۧܰ") ^ i18;
                        c8068 = c8067;
                        i19 = ((iM450210 ^ i17) * 5339) ^ 1220674734;
                        i8 = -1380804146;
                        i10 = iM450210 ^ i8;
                        i25 = i25;
                        c80610 = c8068;
                        sArr3 = sArr2;
                        i26 = i26;
                        i23 = i6;
                    } else {
                        int iM450213 = C19806.m45029("᩶ۧ") ^ i17;
                        int i28 = ((iM450213 ^ i18) * (-9077)) ^ 1797735922;
                        i10 = iM450213 ^ (-1958488593);
                        c80610 = c8067;
                        i19 = i28;
                    }
                    viewGroup3 = viewGroup;
                    i20 = i10;
                    sArr4 = sArr;
                    obj3 = obj;
                    viewGroup4 = viewGroup3;
                    break;
                case -2046347900:
                case 1591797668:
                    viewGroup2 = viewGroup4;
                    i11 = i23;
                    obj2 = obj3;
                    c8069 = c80610;
                    C10634.m26830(c8069, iM11309 ^ i11, obj2);
                    dialogInterfaceC19356M5514 = CallableC1627.m5514(c8069);
                    sArr4 = f37088;
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11307 = C19806.m45029("ܶ᩵") ^ i18;
                        i12 = ((iM11307 ^ i17) * 8355) ^ 1552296746;
                        i13 = 524528801;
                    } else {
                        iM11307 = (i17 - ThreadFactoryC3888.m11306("ۤ᩺")) * (-3);
                        i12 = ((iM11307 ^ i18) * 21347) ^ (-2074401295);
                        i13 = -406419325;
                    }
                    i7 = iM11307 ^ i13;
                    c80610 = c8069;
                    obj3 = obj2;
                    i19 = i12;
                    viewGroup4 = viewGroup2;
                    i23 = i11;
                    r4 = r4;
                    i20 = i7;
                    break;
                case -2042596952:
                case -1919338420:
                    break;
                case -2035846886:
                case -715337106:
                    RunnableC3388.m10064();
                    int iM450214 = C19806.m45029("ۚܶ") ^ i17;
                    i9 = ((iM450214 ^ i18) * (-25697)) ^ (-1275194113);
                    i20 = iM450214 ^ 659136933;
                    r4 = r4;
                    i19 = i9;
                    break;
                case -1958155560:
                case -1253564208:
                    viewGroup = viewGroup4;
                    i6 = i23;
                    i25 = i25;
                    i26 = i26;
                    obj = obj3;
                    c8067 = c80610;
                    sArr = sArr4;
                    short[] sArr6 = sArr3;
                    sArr2 = sArr6;
                    C0050.m933(c8067, ThreadFactoryC3888.m11306(C1066.m4040(sArr6, i25, i26, i21)) ^ 2127068842);
                    if (C1460.f5948 >= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۧܰ") ^ i18;
                        c8068 = c8067;
                        i19 = ((iM450210 ^ i17) * 5339) ^ 1220674734;
                        i8 = -1380804146;
                    } else {
                        c8068 = c8067;
                        iM450210 = (C19806.m45029("᩹ۡ") + i17) * 9;
                        i19 = ((iM450210 ^ i18) * (-30253)) ^ 994491627;
                        i8 = -715292656;
                    }
                    i10 = iM450210 ^ i8;
                    i25 = i25;
                    c80610 = c8068;
                    sArr3 = sArr2;
                    i26 = i26;
                    i23 = i6;
                    viewGroup3 = viewGroup;
                    i20 = i10;
                    sArr4 = sArr;
                    obj3 = obj;
                    viewGroup4 = viewGroup3;
                    break;
                case -1924713859:
                case -1729873065:
                    viewGroup = viewGroup4;
                    i6 = i23;
                    iM450212 = C19806.m45029(C2124.m6685(sArr4, 7, 3, i21));
                    i24 = 2126842673;
                    if (C2477.m7593() < 0) {
                        iM11308 = ThreadFactoryC3888.m11306("֡᩷") ^ i18;
                        i14 = ((iM11308 ^ i17) * (-26629)) ^ (-1180373984);
                        i15 = 1641697471;
                        i23 = i6;
                        viewGroup3 = viewGroup;
                        i20 = iM11308 ^ i15;
                        i19 = i14;
                        viewGroup4 = viewGroup3;
                    }
                    obj = obj3;
                    c8067 = c80610;
                    sArr = sArr4;
                    sArr2 = sArr3;
                    iM450210 = ThreadFactoryC3888.m11306("ۧܰ") ^ i18;
                    c8068 = c8067;
                    i19 = ((iM450210 ^ i17) * 5339) ^ 1220674734;
                    i8 = -1380804146;
                    i10 = iM450210 ^ i8;
                    i25 = i25;
                    c80610 = c8068;
                    sArr3 = sArr2;
                    i26 = i26;
                    i23 = i6;
                    viewGroup3 = viewGroup;
                    i20 = i10;
                    sArr4 = sArr;
                    obj3 = obj;
                    viewGroup4 = viewGroup3;
                    break;
                case -1900285727:
                case 878076067:
                    if (!C19806.f63586) {
                        int iM450215 = C19806.m45029("ۚܶ") ^ i17;
                        i9 = ((iM450215 ^ i18) * (-25697)) ^ (-1275194113);
                        i20 = iM450215 ^ 659136933;
                        r4 = r4;
                        i19 = i9;
                    } else {
                        viewGroup4 = viewGroup4;
                        i23 = i23;
                        i25 = i25;
                        i26 = i26;
                        obj3 = obj3;
                        sArr4 = sArr4;
                        i27 = i27;
                        sArr3 = sArr3;
                        c80610 = c80610;
                        iM45029 = C19806.m45029("ۛۤ") ^ i17;
                        i4 = ((iM45029 ^ i18) * (-15773)) ^ 864801016;
                        i5 = 1006471598;
                        int i29 = iM45029 ^ i5;
                        c80610 = c80610;
                        sArr3 = sArr3;
                        sArr4 = sArr4;
                        obj3 = obj3;
                        i26 = i26;
                        viewGroup4 = viewGroup4;
                        i23 = i23;
                        i20 = i29;
                        i19 = i4;
                        i27 = i27;
                        i25 = i25;
                    }
                    break;
                case -1883237087:
                case -815541038:
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    i25 = i25;
                    i26 = i26;
                    obj3 = obj3;
                    sArr4 = sArr4;
                    i27 = i27;
                    sArr3 = sArr3;
                    c80610 = c80610;
                    viewOnClickListenerC23604 = this.f37090;
                    if (C3577.m10578(viewOnClickListenerC23604)) {
                        iM45029 = (i18 - ThreadFactoryC3888.m11306("᩵᩺")) * (-103);
                        i4 = ((iM45029 ^ i17) * (-17049)) ^ (-1428264182);
                        i5 = 764123696;
                    } else {
                        iM45029 = (i17 - ThreadFactoryC3888.m11306("ۗ᩵")) * (-25);
                        i4 = ((iM45029 ^ i18) * 23715) ^ (-390240040);
                        i5 = -670530892;
                    }
                    int i210 = iM45029 ^ i5;
                    c80610 = c80610;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i26 = i26;
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    i20 = i210;
                    i19 = i4;
                    i27 = i27;
                    i25 = i25;
                    break;
                case -1612591826:
                case 1017874819:
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    C21465.m48088(dialogInterfaceC19356M5514, C1875.m6104(viewOnClickListenerC23604, ThreadFactoryC3888.m11306(strM8640) ^ 2097223834, objArr), new IntConsumer() { // from class: l.᩺۠᩺
                        public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                            return C7100.$default$andThen(this, intConsumer);
                        }

                        {
                            int i30 = 375983549;
                            int i31 = C1419.f5860;
                            int i32 = C2642.f10294;
                            int iM113010 = ThreadFactoryC3888.m11306("۠ۘ") ^ i32;
                            int i33 = ((iM113010 ^ i31) * (-22471)) ^ (-383113025);
                            int i34 = 673559384;
                            while (true) {
                                i30 = ((((i30 ^ i31) * 20581) >> 31) & i33) ^ (iM113010 ^ i34);
                                switch (i30) {
                                    case -1909875735:
                                    case 1272839736:
                                        if (C0050.m946() <= 0) {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۤܺ") ^ i31) * 81;
                                            i33 = ((iM113010 ^ i32) * (-11607)) ^ 1079679864;
                                            i34 = 2071811033;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("᩵ܺ") ^ i31;
                                            i33 = ((iM113010 ^ i32) * 6859) ^ 1417280966;
                                            i34 = -1162729330;
                                        }
                                        break;
                                    case -1857514045:
                                    case 392655055:
                                        C1398.m4895();
                                        if (!C2704.f10408) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۨۡ") ^ i32;
                                            i33 = ((iM113010 ^ i31) * (-31269)) ^ 1002003494;
                                            i34 = 731095369;
                                        } else {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۤܺ") ^ i31) * 81;
                                            i33 = ((iM113010 ^ i32) * (-11607)) ^ 1079679864;
                                            i34 = 2071811033;
                                        }
                                        break;
                                    case -1339957845:
                                    case -876534868:
                                        if (!RunnableC0195.m1431()) {
                                            iM113010 = ThreadFactoryC3888.m11306("᩵֫") ^ i32;
                                            i33 = ((iM113010 ^ i31) * (-27649)) ^ (-260077466);
                                            i34 = -1898916305;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ۨۡ") ^ i32;
                                            i33 = ((iM113010 ^ i31) * (-31269)) ^ 1002003494;
                                            i34 = 731095369;
                                        }
                                        break;
                                    case -1008632788:
                                    case 473777977:
                                        if (RunnableC1564.f6300) {
                                            iM113010 = ThreadFactoryC3888.m11306("᩵֫") ^ i32;
                                            i33 = ((iM113010 ^ i31) * (-27649)) ^ (-260077466);
                                            i34 = -1898916305;
                                        } else {
                                            iM113010 = (i31 - C19806.m45029("ۡ֫")) * 115;
                                            i33 = ((iM113010 ^ i32) * (-15667)) ^ (-1239397494);
                                            i34 = -2126481759;
                                        }
                                        break;
                                    case -862862426:
                                    case 1287402445:
                                        return;
                                    case -792852062:
                                    case 1854491739:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("᩵֫") ^ i32;
                                            i33 = ((iM113010 ^ i31) * (-27649)) ^ (-260077466);
                                            i34 = -1898916305;
                                        } else {
                                            iM113010 = (C19806.m45029("ܿ᩶") + i32) * 3;
                                            i33 = ((iM113010 ^ i31) * 765) ^ 1652534384;
                                            i34 = 1122506954;
                                        }
                                        break;
                                    case -403573679:
                                    case 1965080251:
                                        C1148.m4232();
                                        if (C2249.f8050 < 0) {
                                            iM113010 = C19806.m45029("ܰ֡") ^ i31;
                                            i33 = ((iM113010 ^ i32) * (-16311)) ^ (-1093590274);
                                            i34 = 1702965408;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ۨۡ") ^ i32;
                                            i33 = ((iM113010 ^ i31) * (-31269)) ^ 1002003494;
                                            i34 = 731095369;
                                        }
                                        break;
                                    case -325138251:
                                    case -208986613:
                                        C3535.m10431();
                                        iM113010 = ThreadFactoryC3888.m11306("ۨۡ") ^ i32;
                                        i33 = ((iM113010 ^ i31) * (-31269)) ^ 1002003494;
                                        i34 = 731095369;
                                        break;
                                    case -188823922:
                                    case 1936388909:
                                        if (C2124.f7782 <= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۨۡ") ^ i32;
                                            i33 = ((iM113010 ^ i31) * (-31269)) ^ 1002003494;
                                            i34 = 731095369;
                                        } else {
                                            iM113010 = (ThreadFactoryC3888.m11306("᩺ۧ") + i31) * 23;
                                            i33 = ((iM113010 ^ i32) * 14315) ^ (-1603236568);
                                            i34 = 2056636462;
                                        }
                                        break;
                                    case -89815783:
                                    case 2009177105:
                                        if (C3722.f13525 <= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۨۡ") ^ i32;
                                            i33 = ((iM113010 ^ i31) * (-31269)) ^ 1002003494;
                                            i34 = 731095369;
                                        } else {
                                            iM113010 = C19806.m45029("ܽܿ") ^ i32;
                                            i33 = ((iM113010 ^ i31) * 11573) ^ 1102577781;
                                            i34 = 13056970;
                                        }
                                        break;
                                    case -41519357:
                                    case 674738804:
                                        if (C2704.f10408) {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۗܳ") + i31) * 91;
                                            i33 = ((iM113010 ^ i32) * 4951) ^ (-1428953663);
                                            i34 = 546260240;
                                        } else {
                                            iM113010 = C19806.m45029("ܰ֡") ^ i31;
                                            i33 = ((iM113010 ^ i32) * (-16311)) ^ (-1093590274);
                                            i34 = 1702965408;
                                        }
                                        break;
                                    case 157625069:
                                    case 526165586:
                                        if (C2332.f8260) {
                                            iM113010 = ThreadFactoryC3888.m11306("᩵֨") ^ i31;
                                            i33 = ((iM113010 ^ i32) * (-28239)) ^ (-280893696);
                                            i34 = 555611687;
                                        } else {
                                            iM113010 = C19806.m45029("ܰ֡") ^ i31;
                                            i33 = ((iM113010 ^ i32) * (-16311)) ^ (-1093590274);
                                            i34 = 1702965408;
                                        }
                                        break;
                                    case 714870784:
                                    case 1863391889:
                                        if (C2642.f10294 <= 0) {
                                            iM113010 = C19806.m45029("ܰ֡") ^ i31;
                                            i33 = ((iM113010 ^ i32) * (-16311)) ^ (-1093590274);
                                            i34 = 1702965408;
                                        } else {
                                            iM113010 = (ThreadFactoryC3888.m11306("ܿ֨") + i32) * (-27);
                                            i33 = ((iM113010 ^ i31) * 11897) ^ (-103271334);
                                            i34 = -2101976997;
                                        }
                                        break;
                                    case 765259566:
                                    case 1262419631:
                                        if (C1461.m5080()) {
                                            iM113010 = (C19806.m45029("᩸᩶") + i31) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i33 = ((iM113010 ^ i32) * (-19937)) ^ (-1773741100);
                                            i34 = -354420861;
                                        } else {
                                            iM113010 = (C19806.m45029("۬ۛ") ^ i32) * 91;
                                            i33 = ((iM113010 ^ i31) * 7593) ^ (-1551901250);
                                            i34 = -255477615;
                                        }
                                        break;
                                    case 872941450:
                                    case 1544563695:
                                        C0278.m1789();
                                        C2642.m8171();
                                        throw new RuntimeException();
                                    default:
                                        if (C2642.f10294 <= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۨۡ") ^ i32;
                                            i33 = ((iM113010 ^ i31) * (-31269)) ^ 1002003494;
                                            i34 = 731095369;
                                        } else {
                                            iM113010 = (C19806.m45029("ۖ֫") ^ i32) * 55;
                                            i33 = ((iM113010 ^ i31) * (-6833)) ^ 411453404;
                                            i34 = -2119314271;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // java.util.function.IntConsumer
                        public final void accept(int i30) {
                            List list = null;
                            C3825 c3825 = null;
                            int i31 = -45902838;
                            int i32 = C0050.f912;
                            int i33 = C1148.f5161;
                            int iM113010 = ThreadFactoryC3888.m11306("֫ۤ") ^ i33;
                            int i34 = ((iM113010 ^ i32) * 9289) ^ 41149363;
                            int i35 = -1565696000;
                            while (true) {
                                i31 = ((((i31 ^ i32) * (-22015)) >> 31) & i34) ^ (iM113010 ^ i35);
                                switch (i31) {
                                    case -2072028893:
                                    case 1326441580:
                                        if (C3743.f13569) {
                                            iM113010 = ThreadFactoryC3888.m11306("᩺ܿ") ^ i33;
                                            i34 = ((iM113010 ^ i32) * (-4293)) ^ (-814757446);
                                            i35 = 1892192044;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ۘܳ") ^ i32;
                                            i34 = ((iM113010 ^ i33) * 10993) ^ (-461837573);
                                            i35 = 643728059;
                                        }
                                        break;
                                    case -1864385786:
                                    case 1643441624:
                                        if (!C0962.f3784) {
                                            iM113010 = (i32 - ThreadFactoryC3888.m11306("ۧۘ")) * q.h;
                                            i34 = ((iM113010 ^ i33) * 26897) ^ (-163639213);
                                            i35 = -391471783;
                                        } else {
                                            iM113010 = C19806.m45029("ۧۗ") ^ i33;
                                            i34 = ((iM113010 ^ i32) * (-7789)) ^ (-849954186);
                                            i35 = 2035544655;
                                        }
                                        break;
                                    case -1783453176:
                                    case -585200770:
                                        if (C0050.f912 <= 0) {
                                            iM113010 = (i32 - ThreadFactoryC3888.m11306("ۧۘ")) * q.h;
                                            i34 = ((iM113010 ^ i33) * 26897) ^ (-163639213);
                                            i35 = -391471783;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ᩳ᩵") ^ i32;
                                            i34 = ((iM113010 ^ i33) * (-1889)) ^ (-1276704927);
                                            i35 = 1684427381;
                                        }
                                        break;
                                    case -1654691742:
                                    case 78982060:
                                        if (C2871.f10837 < 0) {
                                            DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M5514;
                                            if (C0817.f3443) {
                                                C5964 c5965 = c5964;
                                                if (C2477.f9839 > 0) {
                                                    C21465.m48087(viewOnClickListenerC23604, c3825, new RunnableC7337(dialogInterfaceC19356, c5965, c3825, 1));
                                                } else {
                                                    iM113010 = ThreadFactoryC3888.m11306("᩹֨") ^ i33;
                                                    i34 = ((iM113010 ^ i32) * (-3855)) ^ 935481715;
                                                    i35 = -876592034;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        iM113010 = (C19806.m45029("᩶᩸") + i33) * (-23);
                                        i34 = ((iM113010 ^ i32) * (-41)) ^ 1989418016;
                                        i35 = 373934039;
                                        break;
                                    case -1560262705:
                                    case 676300276:
                                        if (C2642.f10294 <= 0) {
                                            iM113010 = (i32 - ThreadFactoryC3888.m11306("ۧۘ")) * q.h;
                                            i34 = ((iM113010 ^ i33) * 26897) ^ (-163639213);
                                            i35 = -391471783;
                                        } else {
                                            iM113010 = (C19806.m45029("۫᩸") + i33) * (-35);
                                            i34 = ((iM113010 ^ i32) * 19777) ^ 748899040;
                                            i35 = 1328287054;
                                        }
                                        break;
                                    case -1267719178:
                                    case 1723254302:
                                        C2124.m6673();
                                        if (C2704.m8255() > 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۘܳ") ^ i32;
                                            i34 = ((iM113010 ^ i33) * 10993) ^ (-461837573);
                                            i35 = 643728059;
                                        } else {
                                            iM113010 = C19806.m45029("ۧۗ") ^ i33;
                                            i34 = ((iM113010 ^ i32) * (-7789)) ^ (-849954186);
                                            i35 = 2035544655;
                                        }
                                        break;
                                    case -1251485561:
                                    case 36906115:
                                        break;
                                    case -1021891827:
                                    case -982174646:
                                        if (C0962.f3784) {
                                            iM113010 = (i32 - ThreadFactoryC3888.m11306("ۧۘ")) * q.h;
                                            i34 = ((iM113010 ^ i33) * 26897) ^ (-163639213);
                                            i35 = -391471783;
                                        } else {
                                            iM113010 = (C19806.m45029("ܳ᩹") ^ i33) * (-17);
                                            i34 = ((iM113010 ^ i32) * (-32629)) ^ (-2061864399);
                                            i35 = -257223633;
                                        }
                                        break;
                                    case -790757254:
                                    case 653047231:
                                        c3825 = (C3825) C2477.m7592(list, i30);
                                        if (c3825.f14174) {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۛ֡") + i32) * (-11);
                                            i34 = ((iM113010 ^ i33) * 25875) ^ (-1287333622);
                                            i35 = 256236314;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("۫ۖ") ^ i33;
                                            i34 = ((iM113010 ^ i32) * (-28393)) ^ (-652065065);
                                            i35 = -487790386;
                                        }
                                        break;
                                    case -657732461:
                                    case 1560649533:
                                        C1148.m4232();
                                        C1937.m6279();
                                        iM113010 = C19806.m45029("ۧۗ") ^ i33;
                                        i34 = ((iM113010 ^ i32) * (-7789)) ^ (-849954186);
                                        i35 = 2035544655;
                                        break;
                                    case -581870414:
                                    case 115372920:
                                        ThreadFactoryC3888.m11300();
                                        C0962.m3746();
                                        break;
                                    case 170668789:
                                    case 1975059328:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM113010 = C19806.m45029("ۧۗ") ^ i33;
                                            i34 = ((iM113010 ^ i32) * (-7789)) ^ (-849954186);
                                            i35 = 2035544655;
                                        } else {
                                            iM113010 = C19806.m45029("ܰ۬") ^ i32;
                                            i34 = ((iM113010 ^ i33) * (-27813)) ^ (-1921714109);
                                            i35 = -32740793;
                                        }
                                        break;
                                    case 259583694:
                                    case 1512583247:
                                        list = r4;
                                        if (C10634.f36300 >= 0) {
                                            iM113010 = (C19806.m45029("᩶᩸") + i33) * (-23);
                                            i34 = ((iM113010 ^ i32) * (-41)) ^ 1989418016;
                                            i35 = 373934039;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ۗۚ") ^ i32;
                                            i34 = ((iM113010 ^ i33) * 6005) ^ (-1594665642);
                                            i35 = -1661713542;
                                        }
                                        break;
                                    case 1010840727:
                                    case 1786036227:
                                        C1419.m4973();
                                        if (!C0526.f2219) {
                                            iM113010 = (C19806.m45029("᩶᩸") + i33) * (-23);
                                            i34 = ((iM113010 ^ i32) * (-41)) ^ 1989418016;
                                            i35 = 373934039;
                                        } else {
                                            iM113010 = C19806.m45029("ۧۗ") ^ i33;
                                            i34 = ((iM113010 ^ i32) * (-7789)) ^ (-849954186);
                                            i35 = 2035544655;
                                        }
                                        break;
                                    default:
                                        if (C2871.f10837 >= 0) {
                                            iM113010 = (i32 - ThreadFactoryC3888.m11306("ۧۘ")) * q.h;
                                            i34 = ((iM113010 ^ i33) * 26897) ^ (-163639213);
                                            i35 = -391471783;
                                        } else {
                                            iM113010 = C19806.m45029("ۛ۬") ^ i32;
                                            i34 = ((iM113010 ^ i33) * 31901) ^ 458509198;
                                            i35 = 52799230;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    i25 = i25;
                    i26 = i26;
                    obj3 = obj3;
                    sArr4 = sArr4;
                    i27 = i27;
                    sArr3 = sArr3;
                    c80610 = c80610;
                    iM45029 = (i18 - ThreadFactoryC3888.m11306("᩵᩺")) * (-103);
                    i4 = ((iM45029 ^ i17) * (-17049)) ^ (-1428264182);
                    i5 = 764123696;
                    int i211 = iM45029 ^ i5;
                    c80610 = c80610;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i26 = i26;
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    i20 = i211;
                    i19 = i4;
                    i27 = i27;
                    i25 = i25;
                    break;
                case -1411748421:
                case 232975206:
                    viewGroup = viewGroup4;
                    i6 = i23;
                    objArr = new Object[1];
                    objArr[i22] = C2788.m8476(i27);
                    sArr5 = f37088;
                    if (RunnableC3388.f12514 < 0) {
                        iM11308 = (C19806.m45029("ۗۚ") ^ i18) * (-39);
                        i14 = ((iM11308 ^ i17) * 20439) ^ 937117069;
                        i15 = 1144057795;
                        i23 = i6;
                        viewGroup3 = viewGroup;
                        i20 = iM11308 ^ i15;
                        i19 = i14;
                        viewGroup4 = viewGroup3;
                    }
                    obj = obj3;
                    c8067 = c80610;
                    sArr = sArr4;
                    sArr2 = sArr3;
                    iM450210 = ThreadFactoryC3888.m11306("ۧܰ") ^ i18;
                    c8068 = c8067;
                    i19 = ((iM450210 ^ i17) * 5339) ^ 1220674734;
                    i8 = -1380804146;
                    i10 = iM450210 ^ i8;
                    i25 = i25;
                    c80610 = c8068;
                    sArr3 = sArr2;
                    i26 = i26;
                    i23 = i6;
                    viewGroup3 = viewGroup;
                    i20 = i10;
                    sArr4 = sArr;
                    obj3 = obj;
                    viewGroup4 = viewGroup3;
                    break;
                case -1393731195:
                case 484017626:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        int iM450216 = C19806.m45029("ۚܶ") ^ i17;
                        i9 = ((iM450216 ^ i18) * (-25697)) ^ (-1275194113);
                        i20 = iM450216 ^ 659136933;
                        r4 = r4;
                        i19 = i9;
                    } else {
                        viewGroup2 = viewGroup4;
                        i11 = i23;
                        obj2 = obj3;
                        c8069 = c80610;
                        iM11307 = C19806.m45029("ܶ᩵") ^ i18;
                        i12 = ((iM11307 ^ i17) * 8355) ^ 1552296746;
                        i13 = 524528801;
                        i7 = iM11307 ^ i13;
                        c80610 = c8069;
                        obj3 = obj2;
                        i19 = i12;
                        viewGroup4 = viewGroup2;
                        i23 = i11;
                        r4 = r4;
                        i20 = i7;
                    }
                    break;
                case -1349820112:
                case 1333592012:
                    i21 = 63682;
                    iM45029 = C19806.m45029("ۧۚ") ^ i18;
                    i4 = ((iM45029 ^ i17) * 13913) ^ (-1439730489);
                    i5 = -1529480177;
                    int i212 = iM45029 ^ i5;
                    c80610 = c80610;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i26 = i26;
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    i20 = i212;
                    i19 = i4;
                    i27 = i27;
                    i25 = i25;
                    break;
                case -1342470577:
                case -295871555:
                    CallableC1627.m5507();
                    if (C2871.f10837 >= 0) {
                        viewGroup = viewGroup4;
                        i6 = i23;
                        obj = obj3;
                        c8067 = c80610;
                        sArr = sArr4;
                        sArr2 = sArr3;
                        iM450210 = ThreadFactoryC3888.m11306("ۧܰ") ^ i18;
                        c8068 = c8067;
                        i19 = ((iM450210 ^ i17) * 5339) ^ 1220674734;
                        i8 = -1380804146;
                        i10 = iM450210 ^ i8;
                        i25 = i25;
                        c80610 = c8068;
                        sArr3 = sArr2;
                        i26 = i26;
                        i23 = i6;
                        viewGroup3 = viewGroup;
                        i20 = i10;
                        sArr4 = sArr;
                        obj3 = obj;
                        viewGroup4 = viewGroup3;
                    } else {
                        int iM450217 = C19806.m45029("ۚܶ") ^ i17;
                        i9 = ((iM450217 ^ i18) * (-25697)) ^ (-1275194113);
                        i20 = iM450217 ^ 659136933;
                        r4 = r4;
                        i19 = i9;
                    }
                    break;
                case -1189087569:
                case 1929863892:
                    viewGroup = viewGroup4;
                    i6 = i23;
                    int i30 = i25;
                    int i31 = i26;
                    obj = obj3;
                    sArr = sArr4;
                    short[] sArr7 = sArr3;
                    i27 = this.f37089;
                    r4 = this.f37091;
                    c5964 = new C5964(viewOnClickListenerC23604);
                    int i32 = DialogInterfaceC19356.f62401;
                    if (C1189.m4368() > 0) {
                        C8067 c80611 = new C8067(viewOnClickListenerC23604);
                        sArr3 = f37088;
                        i25 = 1;
                        i26 = 3;
                        if (C1668.f6641 < 0) {
                            int iM113010 = ThreadFactoryC3888.m11306("ۧܽ") ^ i18;
                            int i33 = ((iM113010 ^ i17) * (-30461)) ^ 1312330779;
                            i7 = iM113010 ^ (-1604517357);
                            c80610 = c80611;
                            i19 = i33;
                            sArr4 = sArr;
                            i23 = i6;
                            obj3 = obj;
                            viewGroup4 = viewGroup;
                            r4 = r4;
                            i20 = i7;
                            break;
                        }
                    } else {
                        i25 = i30;
                        sArr3 = sArr7;
                        i26 = i31;
                    }
                    int iM450218 = C19806.m45029("ۧ᩵") ^ i17;
                    i9 = ((iM450218 ^ i18) * 6233) ^ 677300574;
                    sArr4 = sArr;
                    i23 = i6;
                    c80610 = null;
                    obj3 = obj;
                    viewGroup4 = viewGroup;
                    i20 = iM450218 ^ 2035130513;
                    r4 = r4;
                    i19 = i9;
                    break;
                case -1114334456:
                case -52941787:
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    i25 = i25;
                    i26 = i26;
                    obj3 = obj3;
                    sArr4 = sArr4;
                    i27 = i27;
                    sArr3 = sArr3;
                    c80610 = c80610;
                    s = f37088[0];
                    s2 = 14740;
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("ۛۤ") ^ i17;
                        i4 = ((iM45029 ^ i18) * (-15773)) ^ 864801016;
                        i5 = 1006471598;
                    } else {
                        iM45029 = C19806.m45029("֫֫") ^ i17;
                        i4 = ((iM45029 ^ i18) * (-21467)) ^ 829928613;
                        i5 = -1334892201;
                    }
                    int i213 = iM45029 ^ i5;
                    c80610 = c80610;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i26 = i26;
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    i20 = i213;
                    i19 = i4;
                    i27 = i27;
                    i25 = i25;
                    break;
                case -219581629:
                case 802915705:
                    C1937.m6279();
                    C1189.m4368();
                    break;
                case -120823276:
                case 1474358530:
                    sArr = sArr4;
                    viewGroup = viewGroup4;
                    i6 = i23;
                    C8067 c80612 = c80610;
                    obj = null;
                    c80612.m21259(new C6648(r4), (DialogInterfaceOnClickListenerC9948) null);
                    if (C7105.f23796 < 0) {
                        int iM113011 = (ThreadFactoryC3888.m11306("۟ۚ") + i18) * (-33);
                        int i34 = ((iM113011 ^ i17) * (-30713)) ^ (-858231189);
                        i10 = iM113011 ^ (-937531962);
                        c80610 = c80612;
                        i19 = i34;
                        i23 = i6;
                        viewGroup3 = viewGroup;
                        i20 = i10;
                        sArr4 = sArr;
                        obj3 = obj;
                        viewGroup4 = viewGroup3;
                    } else {
                        int iM450219 = C19806.m45029("ۧ᩵") ^ i17;
                        i9 = ((iM450219 ^ i18) * 6233) ^ 677300574;
                        sArr4 = sArr;
                        i23 = i6;
                        c80610 = null;
                        obj3 = obj;
                        viewGroup4 = viewGroup;
                        i20 = iM450219 ^ 2035130513;
                        r4 = r4;
                        i19 = i9;
                    }
                    break;
                case -111783444:
                case 731413933:
                    viewGroup = viewGroup4;
                    i6 = i23;
                    strM8640 = C2871.m8640(sArr5, 10, 3, i21);
                    if (C2124.m6673() > 0) {
                        iM11308 = ThreadFactoryC3888.m11306("֫ۗ") ^ i18;
                        i14 = ((iM11308 ^ i17) * (-29937)) ^ 1472613128;
                        i15 = 398330610;
                        i23 = i6;
                        viewGroup3 = viewGroup;
                        i20 = iM11308 ^ i15;
                        i19 = i14;
                        viewGroup4 = viewGroup3;
                    }
                    obj = obj3;
                    c8067 = c80610;
                    sArr = sArr4;
                    sArr2 = sArr3;
                    iM450210 = ThreadFactoryC3888.m11306("ۧܰ") ^ i18;
                    c8068 = c8067;
                    i19 = ((iM450210 ^ i17) * 5339) ^ 1220674734;
                    i8 = -1380804146;
                    i10 = iM450210 ^ i8;
                    i25 = i25;
                    c80610 = c8068;
                    sArr3 = sArr2;
                    i26 = i26;
                    i23 = i6;
                    viewGroup3 = viewGroup;
                    i20 = i10;
                    sArr4 = sArr;
                    obj3 = obj;
                    viewGroup4 = viewGroup3;
                    break;
                case -75571248:
                case 52503139:
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    i25 = i25;
                    i26 = i26;
                    obj3 = obj3;
                    sArr4 = sArr4;
                    i27 = i27;
                    sArr3 = sArr3;
                    c80610 = c80610;
                    if (viewOnClickListenerC23604.isDestroyed()) {
                        iM45029 = (i18 - ThreadFactoryC3888.m11306("᩵᩺")) * (-103);
                        i4 = ((iM45029 ^ i17) * (-17049)) ^ (-1428264182);
                        i5 = 764123696;
                    } else {
                        iM45029 = (i17 - ThreadFactoryC3888.m11306("ܳۙ")) * 127;
                        i4 = ((iM45029 ^ i18) * (-5057)) ^ (-459074954);
                        i5 = -887980009;
                    }
                    int i214 = iM45029 ^ i5;
                    c80610 = c80610;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i26 = i26;
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    i20 = i214;
                    i19 = i4;
                    i27 = i27;
                    i25 = i25;
                    break;
                case 107537881:
                case 1223402762:
                    i21 = 43841;
                    iM45029 = C19806.m45029("ۧۚ") ^ i18;
                    i4 = ((iM45029 ^ i17) * 13913) ^ (-1439730489);
                    i5 = -1529480177;
                    int i215 = iM45029 ^ i5;
                    c80610 = c80610;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i26 = i26;
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    i20 = i215;
                    i19 = i4;
                    i27 = i27;
                    i25 = i25;
                    break;
                case 411000866:
                case 853546651:
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    i25 = i25;
                    i26 = i26;
                    obj3 = obj3;
                    sArr4 = sArr4;
                    sArr3 = sArr3;
                    c80610 = c80610;
                    if (C1461.m5073()) {
                        iM45029 = C19806.m45029("ۗ۬") ^ i18;
                        i27 = i27;
                        i4 = ((iM45029 ^ i17) * (-4187)) ^ (-587767551);
                        i5 = -1844831833;
                    } else {
                        i27 = i27;
                        iM45029 = (i18 - ThreadFactoryC3888.m11306("᩵᩺")) * (-103);
                        i4 = ((iM45029 ^ i17) * (-17049)) ^ (-1428264182);
                        i5 = 764123696;
                    }
                    int i216 = iM45029 ^ i5;
                    c80610 = c80610;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i26 = i26;
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    i20 = i216;
                    i19 = i4;
                    i27 = i27;
                    i25 = i25;
                    break;
                case 752966914:
                case 1814048565:
                    View viewM10566 = C3577.m10566(viewGroup4, i22);
                    i = i23;
                    viewM10566.setPadding(viewM10566.getPaddingLeft(), i22, viewM10566.getPaddingRight(), viewM10566.getPaddingBottom());
                    viewGroup4 = viewGroup4;
                    iM11306 = (ThreadFactoryC3888.m11306("ۡܽ") + i17) * 75;
                    i2 = ((iM11306 ^ i18) * 6029) ^ (-1129523074);
                    i3 = -1681804172;
                    i20 = iM11306 ^ i3;
                    i19 = i2;
                    i23 = i;
                    break;
                case 1708102989:
                case 1782907787:
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    i25 = i25;
                    i26 = i26;
                    obj3 = obj3;
                    sArr4 = sArr4;
                    i27 = i27;
                    sArr3 = sArr3;
                    c80610 = c80610;
                    if ((s * s2) - ((s * s) + 54316900) <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ᩳ") + i18) * (-61);
                        i4 = ((iM45029 ^ i17) * (-26345)) ^ (-1084539059);
                        i5 = -188825919;
                    } else {
                        iM45029 = (C19806.m45029("ۙᩴ") ^ i17) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i18) * (-29869)) ^ (-903544329);
                        i5 = 82700603;
                    }
                    int i217 = iM45029 ^ i5;
                    c80610 = c80610;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i26 = i26;
                    viewGroup4 = viewGroup4;
                    i23 = i23;
                    i20 = i217;
                    i19 = i4;
                    i27 = i27;
                    i25 = i25;
                    break;
                default:
                    i = i23;
                    viewGroup4 = (ViewGroup) dialogInterfaceC19356M5514.m44364(iM450212 ^ i24);
                    i22 = 0;
                    if (viewGroup4 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩻") ^ i17;
                        i2 = ((iM11306 ^ i18) * (-5697)) ^ (-210273623);
                        i3 = -1182742486;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡܽ") + i17) * 75;
                        i2 = ((iM11306 ^ i18) * 6029) ^ (-1129523074);
                        i3 = -1681804172;
                    }
                    i20 = iM11306 ^ i3;
                    i19 = i2;
                    i23 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01f6 A[PHI: r5 r6 r7 r8 r16 r17
      0x01f6: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:62:0x01f4, B:58:0x01d2, B:40:0x0113, B:43:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:62:0x01f4, B:58:0x01d2, B:40:0x0113, B:43:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:62:0x01f4, B:58:0x01d2, B:40:0x0113, B:43:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r8v3 short) = (r8v1 short), (r8v2 short), (r8v1 short), (r8v1 short) binds: [B:62:0x01f4, B:58:0x01d2, B:40:0x0113, B:43:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r16v6 int) = (r16v1 int), (r16v2 int), (r16v7 int), (r16v7 int) binds: [B:62:0x01f4, B:58:0x01d2, B:40:0x0113, B:43:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r17v6 short[]) = (r17v1 short[]), (r17v2 short[]), (r17v7 short[]), (r17v7 short[]) binds: [B:62:0x01f4, B:58:0x01d2, B:40:0x0113, B:43:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x022d A[PHI: r4 r16 r17
      0x022d: PHI (r4v4 short) = (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:66:0x022b, B:37:0x0108, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r16v19 int) = (r16v0 int), (r16v7 int), (r16v23 int) binds: [B:66:0x022b, B:37:0x0108, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r17v16 short[]) = (r17v0 short[]), (r17v7 short[]), (r17v17 short[]) binds: [B:66:0x022b, B:37:0x0108, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (l.C1419.f5860 >= 0) goto L8;
     */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1159() throws l.C4987 {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10904.mo1159():void");
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        ViewOnClickListenerC23604 viewOnClickListenerC23604 = null;
        int i = 33248355;
        int i2 = C2249.f8050;
        int i3 = C2871.f10837;
        int iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺᩵")) * 91;
        int i4 = ((iM11306 ^ i3) * (-24925)) ^ (-656067865);
        int i5 = 2043583916;
        while (true) {
            i = ((((i ^ i3) * (-21727)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1969300342:
                case -1211530885:
                    C1977.m6356();
                    C3577.m10565();
                    iM11306 = (ThreadFactoryC3888.m11306("۫֡") ^ i2) * 83;
                    i4 = ((iM11306 ^ i3) * 32101) ^ 1905169905;
                    i5 = -1878711302;
                    break;
                case -1878752165:
                case 670532965:
                    if (C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܶ") ^ i3) * (-113);
                        i4 = ((iM11306 ^ i2) * 6653) ^ 1243143212;
                        i5 = 1171608134;
                    } else {
                        iM11306 = (C19806.m45029("ܽܺ") + i3) * (-125);
                        i4 = ((iM11306 ^ i2) * (-24081)) ^ 1890577032;
                        i5 = -1191630831;
                    }
                    break;
                case -1782525945:
                case 1072134494:
                    if (C0962.f3784) {
                        iM11306 = (C19806.m45029("۫ۡ") + i2) * 123;
                        i4 = ((iM11306 ^ i3) * (-3353)) ^ (-1691913821);
                        i5 = 1941100743;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14303) ^ (-1040327415);
                        i5 = 1720274181;
                    }
                    break;
                case -1764986946:
                case -672006728:
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ܰ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24207)) ^ (-89314406);
                        i5 = 946743934;
                    } else {
                        iM11306 = C19806.m45029("᩸۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16115) ^ (-1845123712);
                        i5 = -376527994;
                    }
                    break;
                case -1583406862:
                case 271229365:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫֡") ^ i2) * 83;
                        i4 = ((iM11306 ^ i3) * 32101) ^ 1905169905;
                        i5 = -1878711302;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21437)) ^ (-958856403);
                        i5 = 1454363083;
                    }
                    break;
                case -1494551777:
                case -274678084:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3659)) ^ (-1070460366);
                        i5 = -1162111430;
                    } else {
                        iM11306 = (C19806.m45029("ᩳۡ") ^ i3) * (-5);
                        i4 = ((iM11306 ^ i2) * 15671) ^ (-772420408);
                        i5 = 1290794265;
                    }
                    break;
                case -1416235499:
                case 898295358:
                    if (C2642.f10294 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܶ") ^ i3) * (-113);
                        i4 = ((iM11306 ^ i2) * 6653) ^ 1243143212;
                        i5 = 1171608134;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17197)) ^ (-1494412690);
                        i5 = -1928048196;
                    }
                    break;
                case -1272970131:
                case 1922797923:
                    C0278.m1783(viewOnClickListenerC23604);
                    iM11306 = C19806.m45029("ᩳۧ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 19805) ^ 868329699;
                    i5 = -546208932;
                    break;
                case -1214411445:
                case 688398898:
                    if (viewOnClickListenerC23604.isDestroyed()) {
                        iM11306 = C19806.m45029("ᩳۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19805) ^ 868329699;
                        i5 = -546208932;
                    } else {
                        iM11306 = (C19806.m45029("ۤᩳ") + i3) * (-85);
                        i4 = ((iM11306 ^ i2) * (-1551)) ^ 1540644623;
                        i5 = -544903701;
                    }
                    break;
                case -1038032409:
                case 468604368:
                    if (CallableC1627.f6528) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۤ") ^ i2) * 47;
                        i4 = ((iM11306 ^ i3) * 17287) ^ 798460821;
                        i5 = 1984186196;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܶ") ^ i3) * (-113);
                        i4 = ((iM11306 ^ i2) * 6653) ^ 1243143212;
                        i5 = 1171608134;
                    }
                    break;
                case -844119121:
                case 1912605688:
                    viewOnClickListenerC23604 = this.f37090;
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9870(viewOnClickListenerC23604)) {
                        iM11306 = C19806.m45029("ᩳۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19805) ^ 868329699;
                        i5 = -546208932;
                    } else {
                        iM11306 = (C19806.m45029("ۘ᩺") ^ i3) * 89;
                        i4 = ((iM11306 ^ i2) * (-22439)) ^ 783084304;
                        i5 = 483363276;
                    }
                    break;
                case -759651570:
                case 59809888:
                    RunnableC0195.m1431();
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܶ") ^ i3) * (-113);
                        i4 = ((iM11306 ^ i2) * 6653) ^ 1243143212;
                        i5 = 1171608134;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫֡") ^ i2) * 83;
                        i4 = ((iM11306 ^ i3) * 32101) ^ 1905169905;
                        i5 = -1878711302;
                    }
                    break;
                case -438733053:
                case -263979583:
                    RunnableC1564.m5345();
                    C3577.m10565();
                    break;
                case 138984797:
                case 1082482887:
                    RunnableC1606.m5473();
                    if (C1398.m4895() > 0) {
                        iM11306 = (C19806.m45029("۫ۡ") + i2) * 123;
                        i4 = ((iM11306 ^ i3) * (-3353)) ^ (-1691913821);
                        i5 = 1941100743;
                    } else {
                        iM11306 = C19806.m45029("ܰ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24207)) ^ (-89314406);
                        i5 = 946743934;
                    }
                    break;
                case 521267431:
                case 1042404351:
                    break;
                case 676074662:
                case 1538960159:
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3659)) ^ (-1070460366);
                        i5 = -1162111430;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25837)) ^ (-1494937658);
                        i5 = 1811307622;
                    }
                    break;
                case 1182172157:
                case 1304058453:
                    C0216.m1591();
                    if (!C1419.m4973()) {
                        iM11306 = C19806.m45029("ܰ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24207)) ^ (-89314406);
                        i5 = 946743934;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫֡") ^ i2) * 83;
                        i4 = ((iM11306 ^ i3) * 32101) ^ 1905169905;
                        i5 = -1878711302;
                    }
                    break;
                case 1249857378:
                case 1927397867:
                    C1875.m6102(viewOnClickListenerC23604, exc, null);
                    if (C1461.m5073()) {
                        iM11306 = C19806.m45029("ᩳۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19805) ^ 868329699;
                        i5 = -546208932;
                    } else {
                        iM11306 = C19806.m45029("ۘ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22283)) ^ 739764589;
                        i5 = 1950584342;
                    }
                    break;
                case 1534954082:
                case 1965832723:
                    if (C2477.f9839 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3659)) ^ (-1070460366);
                        i5 = -1162111430;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗܶ") + i2) * 35;
                        i4 = ((iM11306 ^ i3) * 9495) ^ 162745587;
                        i5 = 1711148908;
                    }
                    break;
                default:
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("ܰ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24207)) ^ (-89314406);
                        i5 = 946743934;
                    } else {
                        iM11306 = C19806.m45029("᩷ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25307)) ^ 1745317553;
                        i5 = 325876899;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7 A[PHI: r4 r5 r14
      0x00d7: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:32:0x00d5, B:24:0x0098, B:18:0x007e, B:15:0x0066, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:32:0x00d5, B:24:0x0098, B:18:0x007e, B:15:0x0066, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:32:0x00d5, B:24:0x0098, B:18:0x007e, B:15:0x0066, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01a1 A[PHI: r2 r3 r10 r13
      0x01a1: PHI (r2v4 l.᩻ۡ᩺) = (r2v2 l.᩻ۡ᩺), (r2v3 l.᩻ۡ᩺), (r2v2 l.᩻ۡ᩺), (r2v2 l.᩻ۡ᩺) binds: [B:51:0x019f, B:36:0x010a, B:28:0x00b7, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:51:0x019f, B:36:0x010a, B:28:0x00b7, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:51:0x019f, B:36:0x010a, B:28:0x00b7, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:51:0x019f, B:36:0x010a, B:28:0x00b7, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x020c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0240 A[PHI: r7 r8 r9 r11 r19
      0x0240: PHI (r7v3 char) = (r7v2 char), (r7v2 char), (r7v2 char), (r7v5 char) binds: [B:64:0x023e, B:55:0x01d6, B:47:0x017f, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:64:0x023e, B:55:0x01d6, B:47:0x017f, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:64:0x023e, B:55:0x01d6, B:47:0x017f, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r11v4 short) = (r11v2 short), (r11v2 short), (r11v3 short), (r11v2 short) binds: [B:64:0x023e, B:55:0x01d6, B:47:0x017f, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:64:0x023e, B:55:0x01d6, B:47:0x017f, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        int iM11306;
        int i;
        int i2;
        int i3 = C3577.f13150;
        int i4 = AbstractC0464.f2088;
        int iM11307 = (ThreadFactoryC3888.m11306("ۗ۠") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i5 = ((iM11307 ^ i3) * 21121) ^ 271118978;
        String strM4040 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11307 ^ (-1527828165);
        ViewOnClickListenerC23604 viewOnClickListenerC23604 = null;
        int iM45029 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -828442352;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * (-3055)) >> 31));
            switch (i11) {
                case -1965262789:
                case -760775130:
                    strM4040 = C1066.m4040(sArr2, i10, 3, i9);
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩷") ^ i4;
                        i = ((iM11306 ^ i3) * (-23227)) ^ (-1579603734);
                        i2 = -512863810;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺۫") ^ i4;
                        i = ((iM11306 ^ i3) * 27539) ^ 955189075;
                        i2 = -2022930703;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1876230374:
                case 1702280441:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    RunnableC1564.m5345();
                    break;
                case -1687063406:
                case 967070787:
                    i9 = 54164;
                    iM11306 = (ThreadFactoryC3888.m11306("ۗ᩺") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM11306 ^ i4) * (-31781)) ^ (-1125081759);
                    i2 = -1190488155;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1660774959:
                case -529328385:
                    i9 = 50228;
                    iM11306 = (ThreadFactoryC3888.m11306("ۗ᩺") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM11306 ^ i4) * (-31781)) ^ (-1125081759);
                    i2 = -1190488155;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1608617329:
                case 891340746:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                        iM11306 = C19806.m45029("ᩳ۬") ^ i3;
                        i = ((iM11306 ^ i4) * 22647) ^ 1578341218;
                        i2 = -612929638;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩷") ^ i4;
                        i = ((iM11306 ^ i3) * (-23227)) ^ (-1579603734);
                        i2 = -512863810;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1430608047:
                case -896824396:
                    if (i8 - (s * s3) < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ۫") ^ i3;
                        i = ((iM11306 ^ i4) * (-12765)) ^ (-823375886);
                        i2 = 29151412;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܰܳ")) * (-17);
                        i = ((iM11306 ^ i3) * 411) ^ (-823282309);
                        i2 = -1132230323;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1293844871:
                case -946302877:
                    viewOnClickListenerC23604 = this.f37090;
                    sArr2 = f37088;
                    if (C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩷") ^ i4;
                        i = ((iM11306 ^ i3) * (-23227)) ^ (-1579603734);
                        i2 = -512863810;
                    } else {
                        iM11306 = C19806.m45029("ۜ֡") ^ i4;
                        i = ((iM11306 ^ i3) * 6319) ^ (-1218338307);
                        i2 = -1703615419;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1218121366:
                case 1651169125:
                    sArr = f37088;
                    if (C1875.f7103 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۗܿ")) * (-85);
                        i = ((iM11306 ^ i4) * 15325) ^ (-682260093);
                        i2 = -1358885229;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩵") ^ i3) * 55;
                        i = ((iM11306 ^ i4) * (-30749)) ^ 456712856;
                        i2 = 1481894875;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1190388351:
                case 668682871:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("ۖۢ") ^ i4;
                        i = ((iM11306 ^ i3) * (-8567)) ^ 506878619;
                        i2 = -934767887;
                    } else {
                        iM11306 = (C19806.m45029("ۚ᩺") ^ i4) * 109;
                        i = ((iM11306 ^ i3) * (-15407)) ^ 366862376;
                        i2 = 416076673;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1188238790:
                case -714413446:
                    C2642.m8171();
                    if (C2704.f10408) {
                        iM11306 = C19806.m45029("ᩳ۬") ^ i3;
                        i = ((iM11306 ^ i4) * 22647) ^ 1578341218;
                        i2 = -612929638;
                    } else {
                        iM11306 = C19806.m45029("ۖۢ") ^ i4;
                        i = ((iM11306 ^ i3) * (-8567)) ^ 506878619;
                        i2 = -934767887;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1054112594:
                case 1441193344:
                    m10246(viewOnClickListenerC23604, iM45029 ^ i7);
                    break;
                case -1038710489:
                case -145034587:
                    i10 = 21;
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("ۖۢ") ^ i4;
                        i = ((iM11306 ^ i3) * (-8567)) ^ 506878619;
                        i2 = -934767887;
                    } else {
                        iM11306 = (C19806.m45029("ܶᩳ") ^ i3) * (-25);
                        i = ((iM11306 ^ i4) * 25905) ^ 1482673416;
                        i2 = 860869156;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -552793497:
                case -465232085:
                    iM45029 = C19806.m45029(strM4040);
                    i7 = 2124804950;
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("ۖۢ") ^ i4;
                        i = ((iM11306 ^ i3) * (-8567)) ^ 506878619;
                        i2 = -934767887;
                    } else {
                        iM11306 = C19806.m45029("۠ܳ") ^ i3;
                        i = ((iM11306 ^ i4) * 3355) ^ (-111342797);
                        i2 = 1541806766;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -99449575:
                case 1102649104:
                    C10634.m26820();
                    iM11306 = C19806.m45029("ۖۢ") ^ i4;
                    i = ((iM11306 ^ i3) * (-8567)) ^ 506878619;
                    i2 = -934767887;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 95169431:
                case 1796524342:
                    int i12 = s + s2;
                    i8 = i12 * i12;
                    if (C0817.f3443) {
                        iM11306 = (C19806.m45029("᩺֡") + i3) * (-53);
                        i = ((iM11306 ^ i4) * (-23007)) ^ (-513222669);
                        i2 = -605896367;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩷") ^ i4;
                        i = ((iM11306 ^ i3) * (-23227)) ^ (-1579603734);
                        i2 = -512863810;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 442759907:
                case 1201651206:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("ۚ᩺") ^ i4) * 109;
                        i = ((iM11306 ^ i3) * (-15407)) ^ 366862376;
                        i2 = 416076673;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("۟۠")) * 15;
                        i = ((iM11306 ^ i3) * 26139) ^ 1550668200;
                        i2 = -336841208;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 691334191:
                case 1264099493:
                    s3 = 6868;
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۗܿ")) * (-85);
                        i = ((iM11306 ^ i4) * 15325) ^ (-682260093);
                        i2 = -1358885229;
                    } else {
                        iM11306 = C19806.m45029("ۗۘ") ^ i4;
                        i = ((iM11306 ^ i3) * (-8949)) ^ 171212930;
                        i2 = -220673385;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1216822275:
                case 1396955168:
                    s = sArr[c];
                    s2 = 1717;
                    if (RunnableC1564.m5345()) {
                        iM11306 = (i3 - C19806.m45029("ۗܿ")) * (-85);
                        i = ((iM11306 ^ i4) * 15325) ^ (-682260093);
                        i2 = -1358885229;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ֫") ^ i4) * 41;
                        i = ((iM11306 ^ i3) * 32717) ^ 154925609;
                        i2 = 577719148;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    c = 20;
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۗܿ")) * (-85);
                        i = ((iM11306 ^ i4) * 15325) ^ (-682260093);
                        i2 = -1358885229;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩷ܳ")) * 31;
                        i = ((iM11306 ^ i4) * 21851) ^ (-1799576615);
                        i2 = -151917526;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
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
