package l;

import android.util.Base64;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩶ۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V40L */
/* JADX INFO: loaded from: classes4.dex */
public final class C19996 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C9501 f63998;

    /* JADX INFO: renamed from: ۠ۢۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f63999 = {8031, -17525, -17510, -17510, -17530, -17533, -17527, -17525, -17506, -17533, -17531, -17532, -17467, -17531, -17527, -17506, -17521, -17506, -17465, -17511, -17506, -17512, -17521, -17525, -17529, 930, -2128, -2119, -2077, -2129, -2159, -2154, -2080, -2116, -2062, -2150, -2142, -2123, -2071, -2078, -2050, -2064, -2122, -2148, -2146, -2167, -2166, -2141, -2167, -2161, -2129, -2114, -2070, -2135, -2128, -2151, -2146, -2127, -2122, -2122, -2079, -2051, -2117, -2114, -2175, -2169, -26727, 24598, 32582, -2096, -2168, -2113, -2135, -2134, -2123, -2124, -2135, -2113, -2054, -2119, -2123, -2114, -2113, -2080, -2054, -2151, -2123, -2124, -2130, -2113, -2124, -2130, -2057, -2153, -2114, -2065, -2166, -2161, -2162, -2062, -2114, -2123, -2131, -2124, -2122, -2123, -2117, -2114, -2061, -2096, -2062, -2129, -2134, -2122, -2123, -2117, -2114, -2061, -2096};

    /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a6 A[PHI: r2 r4 r5 r6
      0x01a6: PHI (r2v2 short) = (r2v1 short), (r2v1 short), (r2v1 short), (r2v1 short), (r2v3 short) binds: [B:53:0x01a4, B:27:0x00de, B:19:0x00a4, B:17:0x0096, B:14:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r4v3 int) = (r4v2 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int) binds: [B:53:0x01a4, B:27:0x00de, B:19:0x00a4, B:17:0x0096, B:14:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:53:0x01a4, B:27:0x00de, B:19:0x00a4, B:17:0x0096, B:14:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r6v3 int) = (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:53:0x01a4, B:27:0x00de, B:19:0x00a4, B:17:0x0096, B:14:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01fc A[PHI: r1 r3 r10
      0x01fc: PHI (r1v3 short) = (r1v2 short), (r1v1 short), (r1v1 short), (r1v1 short), (r1v1 short) binds: [B:63:0x01fa, B:59:0x01df, B:47:0x0176, B:37:0x0121, B:23:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x01fc: PHI (r3v2 int) = (r3v1 int), (r3v1 int), (r3v1 int), (r3v1 int), (r3v4 int) binds: [B:63:0x01fa, B:59:0x01df, B:47:0x0176, B:37:0x0121, B:23:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x01fc: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int) binds: [B:63:0x01fa, B:59:0x01df, B:47:0x0176, B:37:0x0121, B:23:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0226 A[PHI: r0 r8 r9 r16
      0x0226: PHI (r0v8 char) = (r0v7 char), (r0v3 char), (r0v3 char), (r0v3 char) binds: [B:43:0x0159, B:33:0x0104, B:30:0x00e6, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r8v3 short[]) = (r8v1 short[]), (r8v2 short[]), (r8v1 short[]), (r8v1 short[]) binds: [B:43:0x0159, B:33:0x0104, B:30:0x00e6, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:43:0x0159, B:33:0x0104, B:30:0x00e6, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r16v5 short[]) = (r16v4 short[]), (r16v3 short[]), (r16v3 short[]), (r16v3 short[]) binds: [B:43:0x0159, B:33:0x0104, B:30:0x00e6, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM11306;
        int i;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1478106149;
        int i10 = C1148.f5161;
        int i11 = C2871.f10837;
        int iM45029 = (C19806.m45029("ۗܳ") ^ i10) * 33;
        int i12 = ((iM45029 ^ i11) * 28419) ^ 863719609;
        int i13 = iM45029 ^ (-947069158);
        short[] sArr2 = null;
        while (true) {
            i9 = ((((i9 ^ i11) * 573) >> 31) & i12) ^ i13;
            switch (i9) {
                case -2127245614:
                case -1381173874:
                    s = sArr2[c];
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (C19806.m45029("ۗ᩹") ^ i11) * 61;
                        i12 = ((iM11306 ^ i10) * (-18577)) ^ (-1932997048);
                        i = -838562009;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷֡") ^ i10;
                        i12 = ((iM11306 ^ i11) * (-8847)) ^ (-1346112240);
                        i = 1990950550;
                    }
                    i13 = iM11306 ^ i;
                    break;
                case -2040327146:
                case -525536817:
                    if (C0671.f2816 != 0) {
                        iM11306 = (C19806.m45029("ۗ᩹") ^ i11) * 61;
                        i12 = ((iM11306 ^ i10) * (-18577)) ^ (-1932997048);
                        i = -838562009;
                    } else {
                        iM11306 = C19806.m45029("ܳۚ") ^ i10;
                        i12 = ((iM11306 ^ i11) * (-4529)) ^ (-990950441);
                        i = -595330815;
                    }
                    i13 = iM11306 ^ i;
                    break;
                case -1999800621:
                case 946680:
                    f63998 = C9501.m24336(C0216.m1588(sArr, i7, i8, i6));
                    return;
                case -1989596795:
                case -10561769:
                    i3 = s * s;
                    i4 = 138862656;
                    if (C3660.m10791() != 0) {
                        iM11306 = C19806.m45029("ۘۛ") ^ i11;
                        i12 = ((iM11306 ^ i10) * 7549) ^ (-513797403);
                        i = 1027127303;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܽ") + i11) * 45;
                        i12 = ((iM11306 ^ i10) * 25197) ^ 1688216586;
                        i = 1059829998;
                    }
                    i13 = iM11306 ^ i;
                    break;
                case -1889051227:
                case -1882689144:
                    C1377.m4833();
                    C3535.m10431();
                    throw new RuntimeException();
                case -1557118239:
                case -232212126:
                    if (C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ᩴ") ^ i11;
                        i12 = ((iM11306 ^ i10) * 32287) ^ 258415870;
                        i = 868496171;
                    } else {
                        iM11306 = (C19806.m45029("ۗ᩹") ^ i11) * 61;
                        i12 = ((iM11306 ^ i10) * (-18577)) ^ (-1932997048);
                        i = -838562009;
                    }
                    i13 = iM11306 ^ i;
                    break;
                case -1314341599:
                case -376486211:
                    sArr2 = f63999;
                    c = 0;
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("ܺۨ") ^ i10;
                        i12 = ((iM11306 ^ i11) * (-20939)) ^ (-590813502);
                        i = -1934339234;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۤ") + i11) * (-103);
                        i12 = ((iM11306 ^ i10) * (-3295)) ^ (-219580189);
                        i = -2021915125;
                    }
                    i13 = iM11306 ^ i;
                    break;
                case -1178581679:
                case 1281613957:
                    i6 = 48106;
                    iM11306 = C19806.m45029("᩷᩺") ^ i10;
                    i12 = ((iM11306 ^ i11) * (-10223)) ^ (-1144215591);
                    i = -1803301497;
                    i13 = iM11306 ^ i;
                    break;
                case -664799246:
                case 1356466665:
                    i8 = 24;
                    if (CallableC1627.f6528) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܶ") ^ i10) * (-5);
                        i12 = ((iM11306 ^ i11) * (-24805)) ^ 1066614464;
                        i = -2122084859;
                    } else {
                        iM11306 = (C19806.m45029("ۗ᩹") ^ i11) * 61;
                        i12 = ((iM11306 ^ i10) * (-18577)) ^ (-1932997048);
                        i = -838562009;
                    }
                    i13 = iM11306 ^ i;
                    break;
                case -348922237:
                case -235035822:
                    sArr = f63999;
                    i7 = 1;
                    if (C2788.f10625 >= 0) {
                        iM11306 = C19806.m45029("ܺۨ") ^ i10;
                        i12 = ((iM11306 ^ i11) * (-20939)) ^ (-590813502);
                        i = -1934339234;
                    } else {
                        iM11306 = C19806.m45029("᩻۫") ^ i11;
                        i12 = ((iM11306 ^ i10) * (-11271)) ^ (-945203976);
                        i = -500621131;
                    }
                    i13 = iM11306 ^ i;
                    break;
                case -217992933:
                case 1267142187:
                    if (C0216.m1591() <= 0) {
                        iM11306 = (C19806.m45029("ۖۨ") ^ i11) * (-65);
                        i12 = ((iM11306 ^ i10) * 30437) ^ (-388687412);
                        i = 1869459696;
                    } else {
                        iM11306 = C19806.m45029("ܺۨ") ^ i10;
                        i12 = ((iM11306 ^ i11) * (-20939)) ^ (-590813502);
                        i = -1934339234;
                    }
                    i13 = iM11306 ^ i;
                    break;
                case -217585577:
                case -42307556:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = C19806.m45029("ۘۛ") ^ i11;
                        i12 = ((iM11306 ^ i10) * 7549) ^ (-513797403);
                        i = 1027127303;
                    } else {
                        iM11306 = (C19806.m45029("ۖۨ") ^ i11) * (-65);
                        i12 = ((iM11306 ^ i10) * 30437) ^ (-388687412);
                        i = 1869459696;
                    }
                    i13 = iM11306 ^ i;
                    break;
                case -80613677:
                case 214832771:
                    int i14 = s + s2;
                    i2 = i14 * i14;
                    if (C1460.f5948 >= 0) {
                        iM11306 = (C19806.m45029("ۗ᩹") ^ i11) * 61;
                        i12 = ((iM11306 ^ i10) * (-18577)) ^ (-1932997048);
                        i = -838562009;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ᩴ") ^ i11;
                        i12 = ((iM11306 ^ i10) * (-19939)) ^ (-667155736);
                        i = 999944480;
                    }
                    i13 = iM11306 ^ i;
                    break;
                case -17176885:
                case 1266213411:
                    i5 = i3 + i4;
                    if (C3743.m10966() <= 0) {
                        iM11306 = C19806.m45029("ۘۛ") ^ i11;
                        i12 = ((iM11306 ^ i10) * 7549) ^ (-513797403);
                        i = 1027127303;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ֡") ^ i10;
                        i12 = ((iM11306 ^ i11) * (-1829)) ^ 93565604;
                        i = 964484929;
                    }
                    i13 = iM11306 ^ i;
                    break;
                case -5205806:
                case 212518439:
                    C0526.m2437();
                    C3535.m10431();
                    iM11306 = C19806.m45029("ۘۛ") ^ i11;
                    i12 = ((iM11306 ^ i10) * 7549) ^ (-513797403);
                    i = 1027127303;
                    i13 = iM11306 ^ i;
                    break;
                case 152770939:
                case 1874813114:
                    s2 = 11784;
                    if (C3660.f13403 >= 0) {
                        iM11306 = C19806.m45029("ۘۛ") ^ i11;
                        i12 = ((iM11306 ^ i10) * 7549) ^ (-513797403);
                        i = 1027127303;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ֫") ^ i10;
                        i12 = ((iM11306 ^ i11) * (-4515)) ^ 654904261;
                        i = 1937609366;
                    }
                    i13 = iM11306 ^ i;
                    break;
                case 826729627:
                case 1886967257:
                    i6 = 27630;
                    iM11306 = C19806.m45029("᩷᩺") ^ i10;
                    i12 = ((iM11306 ^ i11) * (-10223)) ^ (-1144215591);
                    i = -1803301497;
                    i13 = iM11306 ^ i;
                    break;
                case 953572173:
                case 1187997399:
                    if ((i5 + i5) - i2 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i10;
                        i12 = ((iM11306 ^ i11) * (-23361)) ^ 586434141;
                        i = 869290942;
                    } else {
                        iM11306 = C19806.m45029("᩺ܺ") ^ i11;
                        i12 = ((iM11306 ^ i10) * (-11511)) ^ (-1547432319);
                        i = -2085238249;
                    }
                    i13 = iM11306 ^ i;
                    break;
                default:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (C19806.m45029("ܿܳ") + i10) * 81;
                        i12 = ((iM11306 ^ i11) * (-25195)) ^ 2096777475;
                        i = -1693736656;
                    } else {
                        iM11306 = C19806.m45029("ܺۨ") ^ i10;
                        i12 = ((iM11306 ^ i11) * (-20939)) ^ (-590813502);
                        i = -1934339234;
                    }
                    i13 = iM11306 ^ i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17684 m45284(AbstractC20745 abstractC20745, boolean z) throws C4987, IOException {
        int iM11306;
        int i;
        int i2;
        String str;
        short[] sArr;
        int i3;
        int i4;
        int iM45029;
        int i5;
        int iM11307;
        int i6;
        byte[] bArr;
        String str2;
        short[] sArr2;
        int iM450210;
        int i7;
        int i8;
        int iM11308;
        int i9;
        int i10;
        int i11;
        MessageDigest messageDigest;
        short[] sArr3;
        C9501 c9501;
        int i12;
        BigInteger bigInteger;
        int iM11309;
        int i13;
        int i14;
        short[] sArr4;
        int i15;
        String strM7601;
        String str3;
        int iM450211;
        int i16;
        int i17 = 0;
        String[] strArr = null;
        int i18 = 0;
        int iM450212 = 0;
        String strM4230 = null;
        C18485 c18485Execute = null;
        C18485 c18485Execute2 = null;
        C17684 c17684M41160 = null;
        C1313 c1313 = null;
        C9314 c9314 = null;
        C17684 c17684M41161 = null;
        IOException iOException = null;
        short s = 0;
        int i19 = 0;
        int i20 = -122034501;
        int i21 = C2249.f8050;
        int i22 = C1189.f5284;
        int iM113010 = ThreadFactoryC3888.m11306("ۙۚ") ^ i21;
        int i23 = ((iM113010 ^ i22) * (-21905)) ^ (-337464023);
        int i24 = iM113010 ^ (-1825670595);
        C1313 c1313M8321 = null;
        String str4 = null;
        InterfaceC10983 interfaceC10983M3436 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i25 = 0;
        int i26 = 0;
        boolean zM5342 = false;
        InterfaceC10008 interfaceC10008M3435 = null;
        int i27 = 0;
        String str5 = null;
        String strM5476 = null;
        int i28 = 0;
        MessageDigest messageDigest2 = null;
        byte[] bArrM5051 = null;
        MessageDigest messageDigestM49416 = null;
        C4424 c4424 = null;
        String strM6918 = null;
        C9501 c9502 = null;
        BigInteger bigInteger2 = null;
        byte[] bArrMo16422 = null;
        C17684 c17684 = null;
        C6490 c6490 = null;
        while (true) {
            i20 = i24 ^ (i23 & (((i20 ^ i22) * 26053) >> 31));
            switch (i20) {
                case -2118868529:
                case 1284848986:
                    c1313 = c1313;
                    C9314 c9314M33229 = C0239.f1428.m33229(strArr[i18]);
                    interfaceC10983M3436 = C0834.m3436(c9314M33229.m23887(i18));
                    int iM113011 = (i21 - ThreadFactoryC3888.m11306("ᩴ᩹")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    c9314 = c9314M33229;
                    i23 = ((iM113011 ^ i22) * 22173) ^ (-483931795);
                    i24 = iM113011 ^ 199174749;
                    c1313 = c1313;
                    break;
                case -1814813495:
                case -502450556:
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܿ") ^ i22;
                        i = ((iM11306 ^ i21) * 3043) ^ 109438265;
                        i2 = 719811239;
                        i24 = iM11306 ^ i2;
                        i23 = i;
                    } else {
                        bArrMo16422 = bArrMo16422;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                        str4 = str4;
                        str = strM5476;
                        sArr = sArr5;
                        c4424 = c4424;
                        int iM450213 = (i22 - C19806.m45029("᩵ܳ")) * (-107);
                        i3 = ((iM450213 ^ i21) * 19485) ^ (-1623337684);
                        i4 = iM450213 ^ (-832658390);
                        str4 = str4;
                        sArr5 = sArr;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        strM5476 = str;
                        bArrMo16422 = bArrMo16422;
                        i24 = i4;
                        i23 = i3;
                        c4424 = c4424;
                        c1313 = c1313;
                    }
                    break;
                case -1803932133:
                case 1520512979:
                    AbstractC0464.m2313();
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۤ") ^ i22;
                        i = ((iM11306 ^ i21) * (-10243)) ^ 598442457;
                        i2 = 1419808802;
                    } else {
                        iM11306 = (i21 - C19806.m45029("᩸۠")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i22) * 21113) ^ 1460660597;
                        i2 = -1290964566;
                    }
                    i24 = iM11306 ^ i2;
                    i23 = i;
                    break;
                case -1757241366:
                case -1334599083:
                    return c17684M41160;
                case -1688423759:
                case 1335713260:
                    if (RunnableC0195.f1321 >= 0) {
                        bArr = bArrMo16422;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                        str4 = str4;
                        str2 = strM5476;
                        bArrM5051 = bArrM5051;
                        c4424 = c4424;
                        sArr2 = sArr6;
                        iM11309 = (C19806.m45029("۬ۧ") + i21) * 55;
                        i13 = ((iM11309 ^ i22) * (-2371)) ^ 1718402565;
                        i14 = 126905617;
                        i15 = iM11309 ^ i14;
                        sArr6 = sArr2;
                        strM5476 = str2;
                        c4424 = c4424;
                        bArrMo16422 = bArr;
                        i24 = i15;
                        i23 = i13;
                        c1313 = c1313;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    } else {
                        bArrMo16422 = bArrMo16422;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                        str4 = str4;
                        str = strM5476;
                        sArr = sArr5;
                        c4424 = c4424;
                        int iM450214 = (i22 - C19806.m45029("᩵ܳ")) * (-107);
                        i3 = ((iM450214 ^ i21) * 19485) ^ (-1623337684);
                        i4 = iM450214 ^ (-832658390);
                        str4 = str4;
                        sArr5 = sArr;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        strM5476 = str;
                        bArrMo16422 = bArrMo16422;
                        i24 = i4;
                        i23 = i3;
                        c4424 = c4424;
                        c1313 = c1313;
                    }
                    break;
                case -1688382984:
                case 1475936568:
                    bArr = bArrMo16422;
                    c1313 = c1313;
                    c4424 = c4424;
                    StringBuilder sb = new StringBuilder();
                    interfaceC10983M3436 = interfaceC10983M3436;
                    Object[] objArr = new Object[i17];
                    objArr[i18] = C2642.m8160(abstractC20745);
                    if (C2249.f8050 >= 0) {
                        str4 = str4;
                        str2 = strM5476;
                        sArr2 = sArr6;
                        bArrM5051 = bArrM5051;
                        iM11309 = (C19806.m45029("۬ۧ") + i21) * 55;
                        i13 = ((iM11309 ^ i22) * (-2371)) ^ 1718402565;
                        i14 = 126905617;
                        i15 = iM11309 ^ i14;
                        sArr6 = sArr2;
                        strM5476 = str2;
                        c4424 = c4424;
                        bArrMo16422 = bArr;
                        i24 = i15;
                        i23 = i13;
                        c1313 = c1313;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    } else {
                        C1148.m4223(sb, C0278.m1786(iM450212, objArr));
                        C2788.m8480(sb, strM4230);
                        C0817.m3408(sb, c18485Execute.m42858());
                        if (RunnableC0195.f1321 < 0) {
                            C1148.m4223(sb, C0629.m2906(f63999, 99, 11, i25));
                            C1148.m4223(sb, c18485Execute.m42860().m44053());
                            throw new C4987(C2124.m6674(sb));
                        }
                        messageDigest = messageDigest2;
                        sArr3 = sArr6;
                        c9501 = c9502;
                        i12 = i17;
                        i11 = i27;
                        int iM450215 = (C19806.m45029("ۘۡ") ^ i22) * (-87);
                        i27 = i11;
                        sArr5 = sArr5;
                        i17 = i12;
                        strM5476 = strM5476;
                        c9502 = c9501;
                        bArrMo16422 = bArr;
                        i24 = iM450215 ^ 1128810313;
                        i23 = ((iM450215 ^ i21) * 25659) ^ (-1961097840);
                        sArr6 = sArr3;
                        c4424 = c4424;
                        messageDigest2 = messageDigest;
                        c1313 = c1313;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    }
                    break;
                case -1677459987:
                case 1444976924:
                    i25 = 45310;
                    iM450210 = C19806.m45029("֨ۖ") ^ i21;
                    i7 = ((iM450210 ^ i22) * 29891) ^ 1724935576;
                    i8 = 1746015117;
                    int i29 = iM450210 ^ i8;
                    messageDigestM49416 = messageDigestM49416;
                    c4424 = c4424;
                    sArr5 = sArr5;
                    strM5476 = strM5476;
                    c1313 = c1313;
                    bArrMo16422 = bArrMo16422;
                    i24 = i29;
                    i23 = i7;
                    c9502 = c9502;
                    sArr6 = sArr6;
                    messageDigest2 = messageDigest2;
                    bArrM5051 = bArrM5051;
                    str4 = str4;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    break;
                case -1646764137:
                case -1244265621:
                    bArrMo16422 = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    c4424 = c4424;
                    c6490.m17681(C2124.m6685(f63999, 96, 3, i25), AbstractC21307.m47777(c9502, bArrM5051));
                    c18485Execute2 = C16737.m39297().m14157(c6490.m17678()).execute();
                    if (c18485Execute2.m42863()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i22;
                        i3 = ((iM45029 ^ i21) * 24979) ^ (-1615426442);
                        i5 = 1694920933;
                    } else {
                        iM45029 = (C19806.m45029("ۗۤ") ^ i21) * (-27);
                        i3 = ((iM45029 ^ i22) * 18691) ^ (-1386523675);
                        i5 = -932783214;
                    }
                    i4 = iM45029 ^ i5;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    bArrMo16422 = bArrMo16422;
                    i24 = i4;
                    i23 = i3;
                    c4424 = c4424;
                    c1313 = c1313;
                    break;
                case -1569767883:
                case -249464755:
                    return c17684M41161;
                case -1548532289:
                case -620241859:
                    bArr = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    str4 = str4;
                    str2 = strM5476;
                    bArrM5051 = bArrM5051;
                    c4424 = c4424;
                    sArr2 = sArr6;
                    str5 = strArr[i18];
                    c17684 = null;
                    iM11309 = C19806.m45029("ۙ֫") ^ i22;
                    i13 = ((iM11309 ^ i21) * (-15831)) ^ 1661712473;
                    i14 = -686378940;
                    i15 = iM11309 ^ i14;
                    sArr6 = sArr2;
                    strM5476 = str2;
                    c4424 = c4424;
                    bArrMo16422 = bArr;
                    i24 = i15;
                    i23 = i13;
                    c1313 = c1313;
                    bArrM5051 = bArrM5051;
                    str4 = str4;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    break;
                case -1506955446:
                case -1123658525:
                    C10634.m26820();
                    if (C10634.f36300 >= 0) {
                        bArrMo16422 = bArrMo16422;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                        str4 = str4;
                        str = strM5476;
                        sArr = sArr5;
                        c4424 = c4424;
                        int iM450216 = (i22 - C19806.m45029("᩵ܳ")) * (-107);
                        i3 = ((iM450216 ^ i21) * 19485) ^ (-1623337684);
                        i4 = iM450216 ^ (-832658390);
                        str4 = str4;
                        sArr5 = sArr;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        strM5476 = str;
                        bArrMo16422 = bArrMo16422;
                        i24 = i4;
                        i23 = i3;
                        c4424 = c4424;
                        c1313 = c1313;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۤ") ^ i22;
                        i = ((iM11306 ^ i21) * (-10243)) ^ 598442457;
                        i2 = 1419808802;
                        i24 = iM11306 ^ i2;
                        i23 = i;
                    }
                    break;
                case -1487875193:
                case -134996398:
                    bArr = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    str4 = str4;
                    str2 = strM5476;
                    bArrM5051 = bArrM5051;
                    c4424 = c4424;
                    sArr2 = sArr6;
                    try {
                        str3 = str5;
                        try {
                            C4424 c4424M33234 = C0239.f1428.m33234(str3);
                            int iM450217 = (i21 - C19806.m45029("ܽۙ")) * (-23);
                            i23 = ((iM450217 ^ i22) * (-11127)) ^ (-330619898);
                            sArr6 = sArr2;
                            strM5476 = str2;
                            c4424 = c4424M33234;
                            bArrMo16422 = bArr;
                            str5 = str3;
                            i24 = iM450217 ^ 1575654183;
                            bArrM5051 = bArrM5051;
                            str4 = str4;
                            c1313 = c1313;
                        } catch (IOException unused) {
                            c17684M41161 = c17684;
                            iM11309 = C19806.m45029("᩷ۡ") ^ i21;
                            str5 = str3;
                            i13 = ((iM11309 ^ i22) * 25139) ^ 1807222356;
                            i14 = -1946375720;
                            i15 = iM11309 ^ i14;
                            sArr6 = sArr2;
                            strM5476 = str2;
                            c4424 = c4424;
                            bArrMo16422 = bArr;
                            i24 = i15;
                            i23 = i13;
                            c1313 = c1313;
                            bArrM5051 = bArrM5051;
                            str4 = str4;
                        }
                    } catch (IOException unused2) {
                        str3 = str5;
                    }
                    interfaceC10983M3436 = interfaceC10983M3436;
                    break;
                case -1474249376:
                case -356325812:
                    c1313 = c1313;
                    if (c4424 != null) {
                        iM11307 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i22;
                        c4424 = c4424;
                        i3 = ((iM11307 ^ i21) * 30375) ^ (-569670904);
                        i6 = -1075012048;
                        i24 = iM11307 ^ i6;
                        i23 = i3;
                        c4424 = c4424;
                        c1313 = c1313;
                    } else {
                        c4424 = c4424;
                        bArr = bArrMo16422;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        str4 = str4;
                        str2 = strM5476;
                        sArr2 = sArr6;
                        bArrM5051 = bArrM5051;
                        str3 = str5;
                        c17684M41161 = c17684;
                        iM11309 = C19806.m45029("᩷ۡ") ^ i21;
                        str5 = str3;
                        i13 = ((iM11309 ^ i22) * 25139) ^ 1807222356;
                        i14 = -1946375720;
                        i15 = iM11309 ^ i14;
                        sArr6 = sArr2;
                        strM5476 = str2;
                        c4424 = c4424;
                        bArrMo16422 = bArr;
                        i24 = i15;
                        i23 = i13;
                        c1313 = c1313;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    }
                    break;
                case -1468926772:
                case -731024124:
                    bArrMo16422 = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    str4 = str4;
                    str = strM5476;
                    short[] sArr7 = sArr6;
                    sArr = sArr5;
                    bArrM5051 = bArrM5051;
                    c4424 = c4424;
                    C9501 c9503 = c9502;
                    interfaceC10008M3435 = C0834.m3435(C0216.m1582(abstractC20745));
                    MessageDigest messageDigestM49421 = C22253.m49421();
                    messageDigestM49416 = C22253.m49416();
                    strM6918 = C2249.m6918(f63999, 26, 20, i25);
                    if (C1937.f7317 < 0) {
                        int iM113012 = ThreadFactoryC3888.m11306("ۚܿ") ^ i22;
                        sArr5 = sArr;
                        c9502 = c9503;
                        strM5476 = str;
                        sArr6 = sArr7;
                        bArrMo16422 = bArrMo16422;
                        messageDigest2 = messageDigestM49421;
                        i24 = iM113012 ^ 1476282973;
                        i23 = ((iM113012 ^ i21) * 31679) ^ 763037848;
                        c4424 = c4424;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        c1313 = c1313;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    } else {
                        bArrM5051 = bArrM5051;
                        c9502 = c9503;
                        sArr6 = sArr7;
                        messageDigest2 = messageDigestM49421;
                        int iM450218 = (i22 - C19806.m45029("᩵ܳ")) * (-107);
                        i3 = ((iM450218 ^ i21) * 19485) ^ (-1623337684);
                        i4 = iM450218 ^ (-832658390);
                        str4 = str4;
                        sArr5 = sArr;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        strM5476 = str;
                        bArrMo16422 = bArrMo16422;
                        i24 = i4;
                        i23 = i3;
                        c4424 = c4424;
                        c1313 = c1313;
                    }
                    break;
                case -1341115562:
                case 265433967:
                    bArrMo16422 = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    c4424 = c4424;
                    c6490 = new C6490();
                    str = strM5476;
                    c6490.m17686(str);
                    sArr6 = f63999;
                    i26 = 85;
                    i28 = 11;
                    if (C1875.f7103 < 0) {
                        int iM113013 = (i22 - ThreadFactoryC3888.m11306("ܳۨ")) * (-7);
                        i3 = ((iM113013 ^ i21) * 2157) ^ (-994948930);
                        i4 = iM113013 ^ 1447232357;
                        strM5476 = str;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        bArrMo16422 = bArrMo16422;
                        i24 = i4;
                        i23 = i3;
                        c4424 = c4424;
                        c1313 = c1313;
                    } else {
                        sArr = sArr5;
                        int iM450219 = (i22 - C19806.m45029("᩵ܳ")) * (-107);
                        i3 = ((iM450219 ^ i21) * 19485) ^ (-1623337684);
                        i4 = iM450219 ^ (-832658390);
                        str4 = str4;
                        sArr5 = sArr;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        strM5476 = str;
                        bArrMo16422 = bArrMo16422;
                        i24 = i4;
                        i23 = i3;
                        c4424 = c4424;
                        c1313 = c1313;
                    }
                    break;
                case -1202442151:
                case 373689776:
                    bArrMo16422 = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    c4424 = c4424;
                    short[] sArr8 = sArr6;
                    c6490.m17687(RunnableC1606.m5481(sArr8, i26, i28, i25), strArr[i17]);
                    c9502 = f63998;
                    bArrM5051 = C1460.m5051(abstractC20745);
                    if (C1025.m3861() <= 0) {
                        sArr6 = sArr8;
                        str = strM5476;
                        sArr = sArr5;
                        int iM4502110 = (i22 - C19806.m45029("᩵ܳ")) * (-107);
                        i3 = ((iM4502110 ^ i21) * 19485) ^ (-1623337684);
                        i4 = iM4502110 ^ (-832658390);
                        str4 = str4;
                        sArr5 = sArr;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        strM5476 = str;
                        bArrMo16422 = bArrMo16422;
                        i24 = i4;
                        i23 = i3;
                        c4424 = c4424;
                        c1313 = c1313;
                    } else {
                        int iM113014 = ThreadFactoryC3888.m11306("ܳۘ") ^ i22;
                        sArr6 = sArr8;
                        c4424 = c4424;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                        i24 = iM113014 ^ (-308411485);
                        i23 = ((iM113014 ^ i21) * (-17575)) ^ 1749434719;
                        bArrMo16422 = bArrMo16422;
                    }
                    break;
                case -1122435006:
                case 923087450:
                    strM7601 = C2477.m7601(c1313);
                    bArrM5051 = bArrM5051;
                    bArr = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    c4424 = c4424;
                    sArr4 = sArr6;
                    int iM450220 = (C19806.m45029("۬ۡ") ^ i21) * (-103);
                    sArr6 = sArr4;
                    c4424 = c4424;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    byte[] bArr2 = bArrM5051;
                    str4 = strM7601;
                    i23 = ((iM450220 ^ i22) * (-26735)) ^ (-1831174605);
                    bArrMo16422 = bArr;
                    i24 = iM450220 ^ 1775078502;
                    bArrM5051 = bArr2;
                    break;
                case -1104411034:
                case 356530783:
                    C4424 c4425 = c4424;
                    C2724 c2724M8469 = C2788.m8469(4130);
                    RunnableC1564.m5349(c2724M8469, strArr[i18]);
                    C1313 c1313M8322 = c2724M8469.m8321();
                    if (RunnableC1564.m5342(c1313M8322)) {
                        iM450211 = ThreadFactoryC3888.m11306("ۨܰ") ^ i21;
                        i = ((iM450211 ^ i22) * (-20623)) ^ 1884543918;
                        i16 = -144261507;
                    } else {
                        iM450211 = (C19806.m45029("ۛۢ") + i22) * 17;
                        i = ((iM450211 ^ i21) * (-28733)) ^ 630115907;
                        i16 = 1530568170;
                    }
                    i24 = iM450211 ^ i16;
                    c4424 = c4425;
                    c1313 = c1313M8322;
                    i23 = i;
                    break;
                case -926484654:
                case 1306143797:
                    bArr = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    str4 = str4;
                    str2 = strM5476;
                    bArrM5051 = bArrM5051;
                    c4424 = c4424;
                    sArr2 = sArr6;
                    C2724 c2724M84610 = C2788.m8469(4129);
                    RunnableC1564.m5349(c2724M84610, strArr[i18]);
                    RunnableC1564.m5349(c2724M84610, strArr[i17]);
                    c1313M8321 = c2724M84610.m8321();
                    zM5342 = RunnableC1564.m5342(c1313M8321);
                    if (C0817.f3443) {
                        iM11309 = (ThreadFactoryC3888.m11306("ۗ۟") ^ i21) * (-89);
                        i13 = ((iM11309 ^ i22) * 25527) ^ (-1470105393);
                        i14 = -115142724;
                    } else {
                        iM11309 = (C19806.m45029("۬ۧ") + i21) * 55;
                        i13 = ((iM11309 ^ i22) * (-2371)) ^ 1718402565;
                        i14 = 126905617;
                    }
                    i15 = iM11309 ^ i14;
                    sArr6 = sArr2;
                    strM5476 = str2;
                    c4424 = c4424;
                    bArrMo16422 = bArr;
                    i24 = i15;
                    i23 = i13;
                    c1313 = c1313;
                    bArrM5051 = bArrM5051;
                    str4 = str4;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    break;
                case -810890280:
                case -375560511:
                    try {
                        byte[] bArrMo16423 = C0834.m3437(c4424.m12357(i18)).mo16422();
                        byte[] bArrM41969 = C18019.m41969(bArrMo16423, bArrMo16423.length);
                        c4424.close();
                        c17684M41161 = C17684.m41160((InputStream) new ByteArrayInputStream(bArrM41969));
                        bArr = bArrMo16422;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                        str4 = str4;
                        str2 = strM5476;
                        bArrM5051 = bArrM5051;
                        c4424 = c4424;
                        str3 = str5;
                        sArr2 = sArr6;
                    } catch (IOException unused3) {
                        bArr = bArrMo16422;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                        str4 = str4;
                        str2 = strM5476;
                        bArrM5051 = bArrM5051;
                        c4424 = c4424;
                        str3 = str5;
                        sArr2 = sArr6;
                        c17684M41161 = c17684;
                    }
                    iM11309 = C19806.m45029("᩷ۡ") ^ i21;
                    str5 = str3;
                    i13 = ((iM11309 ^ i22) * 25139) ^ 1807222356;
                    i14 = -1946375720;
                    i15 = iM11309 ^ i14;
                    sArr6 = sArr2;
                    strM5476 = str2;
                    c4424 = c4424;
                    bArrMo16422 = bArr;
                    i24 = i15;
                    i23 = i13;
                    c1313 = c1313;
                    bArrM5051 = bArrM5051;
                    str4 = str4;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    break;
                case -750264747:
                case 1268564989:
                    if (c17684M41161 == null) {
                        bArr = bArrMo16422;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                        str4 = str4;
                        str2 = strM5476;
                        bArrM5051 = bArrM5051;
                        c4424 = c4424;
                        bigInteger = bigInteger2;
                        sArr2 = sArr6;
                        iM11309 = C19806.m45029("۠᩹") ^ i21;
                        bigInteger2 = bigInteger;
                        i13 = ((iM11309 ^ i22) * (-5451)) ^ (-555770412);
                        i14 = 145050020;
                        i15 = iM11309 ^ i14;
                        sArr6 = sArr2;
                        strM5476 = str2;
                        c4424 = c4424;
                        bArrMo16422 = bArr;
                        i24 = i15;
                        i23 = i13;
                        c1313 = c1313;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    } else {
                        iM11306 = (C19806.m45029("ۖۙ") + i22) * (-41);
                        i = ((iM11306 ^ i21) * 16277) ^ 472900679;
                        i2 = -1494869287;
                        i24 = iM11306 ^ i2;
                        i23 = i;
                    }
                    break;
                case -626721629:
                case 1818893486:
                    C1398.m4895();
                    if (!C2332.f8260) {
                        bArr = bArrMo16422;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                        c4424 = c4424;
                        messageDigest = messageDigest2;
                        sArr3 = sArr6;
                        c9501 = c9502;
                        i12 = i17;
                        i11 = i27;
                        int iM4502111 = (C19806.m45029("ۘۡ") ^ i22) * (-87);
                        i27 = i11;
                        sArr5 = sArr5;
                        i17 = i12;
                        strM5476 = strM5476;
                        c9502 = c9501;
                        bArrMo16422 = bArr;
                        i24 = iM4502111 ^ 1128810313;
                        i23 = ((iM4502111 ^ i21) * 25659) ^ (-1961097840);
                        sArr6 = sArr3;
                        c4424 = c4424;
                        messageDigest2 = messageDigest;
                        c1313 = c1313;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    }
                    bArr = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    str4 = str4;
                    str2 = strM5476;
                    bArrM5051 = bArrM5051;
                    c4424 = c4424;
                    sArr2 = sArr6;
                    iM11309 = (C19806.m45029("۬ۧ") + i21) * 55;
                    i13 = ((iM11309 ^ i22) * (-2371)) ^ 1718402565;
                    i14 = 126905617;
                    i15 = iM11309 ^ i14;
                    sArr6 = sArr2;
                    strM5476 = str2;
                    c4424 = c4424;
                    bArrMo16422 = bArr;
                    i24 = i15;
                    i23 = i13;
                    c1313 = c1313;
                    bArrM5051 = bArrM5051;
                    str4 = str4;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    break;
                case -595645364:
                case 2112262872:
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr2 = new Object[i17];
                    objArr2[i18] = C2642.m8160(abstractC20745);
                    C2788.m8480(sb2, C0216.m1574(iM450212, objArr2));
                    C1148.m4223(sb2, strM4230);
                    C0817.m3408(sb2, c18485Execute2.m42858());
                    if (C2704.f10408) {
                        C2788.m8480(sb2, ViewTreeObserverOnPreDrawListenerC3327.m9869(f63999, UMErrorCode.E_UM_BE_JSON_FAILED, 9, i25));
                        C2788.m8480(sb2, c18485Execute2.m42860().m44053());
                        throw new C4987(C0817.m3407(sb2));
                    }
                    int iM450221 = (i21 - C19806.m45029("۟۫")) * (-117);
                    i3 = ((iM450221 ^ i22) * (-19289)) ^ 62970230;
                    i4 = iM450221 ^ (-181194132);
                    bArrMo16422 = bArrMo16422;
                    i24 = i4;
                    i23 = i3;
                    c4424 = c4424;
                    c1313 = c1313;
                    break;
                case -577283611:
                case -415268119:
                    CallableC1627.m5507();
                    if (!C2704.f10408) {
                        int iM450222 = (i21 - C19806.m45029("۟۫")) * (-117);
                        i3 = ((iM450222 ^ i22) * (-19289)) ^ 62970230;
                        i4 = iM450222 ^ (-181194132);
                        bArrMo16422 = bArrMo16422;
                        i24 = i4;
                        i23 = i3;
                        c4424 = c4424;
                        c1313 = c1313;
                    } else {
                        bArrMo16422 = bArrMo16422;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                        str4 = str4;
                        strM5476 = strM5476;
                        sArr5 = sArr5;
                        bArrM5051 = bArrM5051;
                        c4424 = c4424;
                        messageDigest2 = messageDigest2;
                        messageDigestM49416 = messageDigestM49416;
                        sArr6 = sArr6;
                        c9502 = c9502;
                        iM450210 = (i21 - C19806.m45029("֫᩺")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i7 = ((iM450210 ^ i22) * 14619) ^ (-39200758);
                        i8 = -2005200021;
                        int i210 = iM450210 ^ i8;
                        messageDigestM49416 = messageDigestM49416;
                        c4424 = c4424;
                        sArr5 = sArr5;
                        strM5476 = strM5476;
                        c1313 = c1313;
                        bArrMo16422 = bArrMo16422;
                        i24 = i210;
                        i23 = i7;
                        c9502 = c9502;
                        sArr6 = sArr6;
                        messageDigest2 = messageDigest2;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    }
                    break;
                case -504745441:
                case 1450780584:
                    bArr = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    str4 = str4;
                    str2 = strM5476;
                    bArrM5051 = bArrM5051;
                    c4424 = c4424;
                    sArr2 = sArr6;
                    bigInteger = bigInteger2;
                    strArr = new String[]{bigInteger.toString(36), Base64.encodeToString(messageDigestM49416.digest(), 2)};
                    if (z) {
                        int iM450223 = C19806.m45029("ܰۗ") ^ i22;
                        bigInteger2 = bigInteger;
                        sArr6 = sArr2;
                        strM5476 = str2;
                        c4424 = c4424;
                        bArrM5051 = bArrM5051;
                        bArrMo16422 = bArr;
                        i24 = iM450223 ^ (-1421769813);
                        i23 = ((iM450223 ^ i21) * 27729) ^ 650006859;
                        str4 = str4;
                        c1313 = c1313;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        i18 = 0;
                    } else {
                        i18 = 0;
                        iM11309 = C19806.m45029("۠᩹") ^ i21;
                        bigInteger2 = bigInteger;
                        i13 = ((iM11309 ^ i22) * (-5451)) ^ (-555770412);
                        i14 = 145050020;
                        i15 = iM11309 ^ i14;
                        sArr6 = sArr2;
                        strM5476 = str2;
                        c4424 = c4424;
                        bArrMo16422 = bArr;
                        i24 = i15;
                        i23 = i13;
                        c1313 = c1313;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    }
                    break;
                case -490489941:
                case 1926923210:
                    C1066.m4023();
                    C0797.m3359();
                    return null;
                case -465079891:
                case 967449474:
                    bArr = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    str4 = str4;
                    str2 = strM5476;
                    bArrM5051 = bArrM5051;
                    c4424 = c4424;
                    sArr2 = sArr6;
                    iM450212 = C19806.m45029(C1875.m6105(f63999, 66, 3, i25)) ^ 2121155263;
                    if (zM5342) {
                        iM11309 = ThreadFactoryC3888.m11306("ۘۨ") ^ i22;
                        i13 = ((iM11309 ^ i21) * 15601) ^ (-511674195);
                        i14 = 1383803327;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ۢۙ") ^ i21;
                        i13 = ((iM11309 ^ i22) * (-3297)) ^ (-1639984399);
                        i14 = 939418268;
                    }
                    i15 = iM11309 ^ i14;
                    sArr6 = sArr2;
                    strM5476 = str2;
                    c4424 = c4424;
                    bArrMo16422 = bArr;
                    i24 = i15;
                    i23 = i13;
                    c1313 = c1313;
                    bArrM5051 = bArrM5051;
                    str4 = str4;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    break;
                case -432834227:
                case 1447371083:
                    if (!CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۤ") ^ i22;
                        i = ((iM11306 ^ i21) * (-10243)) ^ 598442457;
                        i2 = 1419808802;
                        i24 = iM11306 ^ i2;
                        i23 = i;
                    } else {
                        bArrMo16422 = bArrMo16422;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                        str4 = str4;
                        strM5476 = strM5476;
                        sArr5 = sArr5;
                        bArrM5051 = bArrM5051;
                        c4424 = c4424;
                        messageDigest2 = messageDigest2;
                        messageDigestM49416 = messageDigestM49416;
                        sArr6 = sArr6;
                        c9502 = c9502;
                        iM450210 = (i21 - C19806.m45029("֫᩺")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i7 = ((iM450210 ^ i22) * 14619) ^ (-39200758);
                        i8 = -2005200021;
                        int i211 = iM450210 ^ i8;
                        messageDigestM49416 = messageDigestM49416;
                        c4424 = c4424;
                        sArr5 = sArr5;
                        strM5476 = strM5476;
                        c1313 = c1313;
                        bArrMo16422 = bArrMo16422;
                        i24 = i211;
                        i23 = i7;
                        c9502 = c9502;
                        sArr6 = sArr6;
                        messageDigest2 = messageDigest2;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    }
                    break;
                case -429390893:
                case 751746694:
                    bArr = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    str4 = str4;
                    strM5476 = strM5476;
                    bArrM5051 = bArrM5051;
                    c4424 = c4424;
                    short[] sArr9 = sArr5;
                    i11 = i27;
                    byte[] bytes = C0962.m3747(sArr9, i11, 20, i25).getBytes();
                    sArr5 = sArr9;
                    messageDigest = messageDigest2;
                    messageDigest.update(bytes);
                    sArr3 = sArr6;
                    c9501 = c9502;
                    i12 = 1;
                    BigInteger bigInteger3 = new BigInteger(1, messageDigest.digest());
                    if (C2642.m8171() == 0) {
                        int iM113015 = (ThreadFactoryC3888.m11306("᩻ܽ") ^ i22) * (-63);
                        bigInteger2 = bigInteger3;
                        i23 = ((iM113015 ^ i21) * 30135) ^ (-1644768429);
                        i27 = i11;
                        sArr5 = sArr5;
                        c9502 = c9501;
                        i17 = 1;
                        strM5476 = strM5476;
                        sArr6 = sArr3;
                        bArrMo16422 = bArr;
                        messageDigest2 = messageDigest;
                        i24 = iM113015 ^ (-1089588404);
                        c4424 = c4424;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        c1313 = c1313;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    } else {
                        bigInteger2 = bigInteger3;
                        int iM4502112 = (C19806.m45029("ۘۡ") ^ i22) * (-87);
                        i27 = i11;
                        sArr5 = sArr5;
                        i17 = i12;
                        strM5476 = strM5476;
                        c9502 = c9501;
                        bArrMo16422 = bArr;
                        i24 = iM4502112 ^ 1128810313;
                        i23 = ((iM4502112 ^ i21) * 25659) ^ (-1961097840);
                        sArr6 = sArr3;
                        c4424 = c4424;
                        messageDigest2 = messageDigest;
                        c1313 = c1313;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    }
                    break;
                case -140644412:
                case 420699522:
                    Object[] objArr3 = new Object[i17];
                    objArr3[i18] = C2642.m8160(abstractC20745);
                    throw new C4987(C4820.m13402(c1313M8321, C0278.m1786(iM450212, objArr3)));
                case -29413908:
                case 826364468:
                    bArr = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    str2 = strM5476;
                    c4424 = c4424;
                    sArr2 = sArr6;
                    C6490 c6491 = new C6490();
                    str4 = str4;
                    c6491.m17686(str4);
                    c6491.m17685();
                    bArrM5051 = bArrM5051;
                    c18485Execute = C16737.m39297().m14157(c6491.m17678()).execute();
                    if (c18485Execute.m42863()) {
                        iM11309 = C19806.m45029("᩵ܿ") ^ i22;
                        i13 = ((iM11309 ^ i21) * (-28665)) ^ (-114441235);
                        i14 = 1635325947;
                    } else {
                        iM11309 = (i21 - C19806.m45029("᩺ۛ")) * (-97);
                        i13 = ((iM11309 ^ i22) * 10447) ^ 464961389;
                        i14 = -2134184694;
                    }
                    i15 = iM11309 ^ i14;
                    sArr6 = sArr2;
                    strM5476 = str2;
                    c4424 = c4424;
                    bArrMo16422 = bArr;
                    i24 = i15;
                    i23 = i13;
                    c1313 = c1313;
                    bArrM5051 = bArrM5051;
                    str4 = str4;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    break;
                case 192748248:
                case 634484806:
                    c9314.m23888();
                    throw iOException;
                case 248220320:
                case 1681347633:
                    i25 = 63450;
                    iM450210 = C19806.m45029("֨ۖ") ^ i21;
                    i7 = ((iM450210 ^ i22) * 29891) ^ 1724935576;
                    i8 = 1746015117;
                    int i212 = iM450210 ^ i8;
                    messageDigestM49416 = messageDigestM49416;
                    c4424 = c4424;
                    sArr5 = sArr5;
                    strM5476 = strM5476;
                    c1313 = c1313;
                    bArrMo16422 = bArrMo16422;
                    i24 = i212;
                    i23 = i7;
                    c9502 = c9502;
                    sArr6 = sArr6;
                    messageDigest2 = messageDigest2;
                    bArrM5051 = bArrM5051;
                    str4 = str4;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    break;
                case 574441630:
                case 1240068445:
                    bArr = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    str4 = str4;
                    bArrM5051 = bArrM5051;
                    c4424 = c4424;
                    sArr4 = sArr6;
                    int iM4680 = c1313M8321.m4680() & 255;
                    strM5476 = RunnableC1606.m5476(c1313M8321);
                    strM4230 = C1148.m4230(f63999, 69, 16, i25);
                    if (iM4680 != 0) {
                        strM7601 = strM5476;
                        int iM450224 = (C19806.m45029("۬ۡ") ^ i21) * (-103);
                        sArr6 = sArr4;
                        c4424 = c4424;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                        byte[] bArr3 = bArrM5051;
                        str4 = strM7601;
                        i23 = ((iM450224 ^ i22) * (-26735)) ^ (-1831174605);
                        bArrMo16422 = bArr;
                        i24 = iM450224 ^ 1775078502;
                        bArrM5051 = bArr3;
                    } else {
                        int iM450225 = (C19806.m45029("֫۬") + i21) * 29;
                        i13 = ((iM450225 ^ i22) * 10123) ^ (-495398382);
                        i15 = iM450225 ^ (-997795137);
                        sArr6 = sArr4;
                        c4424 = c4424;
                        bArrMo16422 = bArr;
                        i24 = i15;
                        i23 = i13;
                        c1313 = c1313;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    }
                    break;
                case 619114874:
                case 659204088:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    bArrMo16422 = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    str4 = str4;
                    strM5476 = strM5476;
                    sArr5 = sArr5;
                    bArrM5051 = bArrM5051;
                    c4424 = c4424;
                    messageDigest2 = messageDigest2;
                    messageDigestM49416 = messageDigestM49416;
                    sArr6 = sArr6;
                    c9502 = c9502;
                    iM450210 = (i21 - C19806.m45029("֫᩺")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i7 = ((iM450210 ^ i22) * 14619) ^ (-39200758);
                    i8 = -2005200021;
                    int i213 = iM450210 ^ i8;
                    messageDigestM49416 = messageDigestM49416;
                    c4424 = c4424;
                    sArr5 = sArr5;
                    strM5476 = strM5476;
                    c1313 = c1313;
                    bArrMo16422 = bArrMo16422;
                    i24 = i213;
                    i23 = i7;
                    c9502 = c9502;
                    sArr6 = sArr6;
                    messageDigest2 = messageDigest2;
                    bArrM5051 = bArrM5051;
                    str4 = str4;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    break;
                case 666381257:
                case 1082853140:
                    byte[] bArr4 = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    C1313 c1314 = c1313;
                    str4 = str4;
                    String str6 = strM5476;
                    bArrM5051 = bArrM5051;
                    C4424 c4426 = c4424;
                    messageDigest2 = messageDigest2;
                    sArr6 = sArr6;
                    c9502 = c9502;
                    messageDigest2.update(strM6918.getBytes());
                    MessageDigest messageDigest3 = messageDigestM49416;
                    C22253.m49419(messageDigest2, messageDigest3, C0834.m3437(interfaceC10008M3435).mo16433());
                    sArr5 = f63999;
                    i27 = 46;
                    if (C3660.f13403 >= 0) {
                        iM11308 = (i21 - C19806.m45029("ۤۜ")) * 123;
                        i9 = ((iM11308 ^ i22) * 4315) ^ 1695518521;
                        i10 = -1924987863;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ܶ֨") ^ i21) * (-49);
                        i9 = ((iM11308 ^ i22) * 26019) ^ (-484854253);
                        i10 = 2409653;
                    }
                    int i30 = iM11308 ^ i10;
                    messageDigestM49416 = messageDigest3;
                    strM5476 = str6;
                    c4424 = c4426;
                    bArrMo16422 = bArr4;
                    i24 = i30;
                    i23 = i9;
                    c1313 = c1314;
                    c9502 = c9502;
                    sArr6 = sArr6;
                    messageDigest2 = messageDigest2;
                    bArrM5051 = bArrM5051;
                    str4 = str4;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    break;
                case 804942578:
                case 1540567316:
                    Object[] objArr4 = new Object[i17];
                    objArr4[i18] = C2642.m8160(abstractC20745);
                    throw new C4987(C4820.m13402(c1313, C0216.m1574(iM450212, objArr4)));
                case 805357138:
                case 956525062:
                    bArrMo16422 = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    str4 = str4;
                    strM5476 = strM5476;
                    sArr5 = sArr5;
                    bArrM5051 = bArrM5051;
                    c4424 = c4424;
                    messageDigest2 = messageDigest2;
                    messageDigestM49416 = messageDigestM49416;
                    sArr6 = sArr6;
                    c9502 = c9502;
                    int i31 = (s * s) + 2624400;
                    if ((i31 + i31) - (i19 * i19) >= 0) {
                        iM450210 = (C19806.m45029("ۛܰ") ^ i21) * 19;
                        i7 = ((iM450210 ^ i22) * 26503) ^ 817949640;
                        i8 = 1235797134;
                    } else {
                        iM450210 = (i22 - C19806.m45029("ۤܽ")) * 23;
                        i7 = ((iM450210 ^ i21) * (-29695)) ^ 183493494;
                        i8 = -1975181563;
                    }
                    int i214 = iM450210 ^ i8;
                    messageDigestM49416 = messageDigestM49416;
                    c4424 = c4424;
                    sArr5 = sArr5;
                    strM5476 = strM5476;
                    c1313 = c1313;
                    bArrMo16422 = bArrMo16422;
                    i24 = i214;
                    i23 = i7;
                    c9502 = c9502;
                    sArr6 = sArr6;
                    messageDigest2 = messageDigest2;
                    bArrM5051 = bArrM5051;
                    str4 = str4;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    break;
                case 1347951309:
                case 1652451627:
                    try {
                        interfaceC10983M3436.write(bArrMo16422);
                        interfaceC10983M3436.close();
                        c9314.m23890();
                        c1313 = c1313;
                        c4424 = c4424;
                        iM11307 = ThreadFactoryC3888.m11306("֡ۧ") ^ i21;
                        i3 = ((iM11307 ^ i22) * 3455) ^ 1868802167;
                        i6 = 1461812195;
                        i24 = iM11307 ^ i6;
                        i23 = i3;
                        c4424 = c4424;
                        c1313 = c1313;
                    } catch (IOException e) {
                        iOException = e;
                        iM11306 = C19806.m45029("۫᩺") ^ i22;
                        i = ((iM11306 ^ i21) * (-27501)) ^ 1393317949;
                        i2 = 1435972248;
                        i24 = iM11306 ^ i2;
                        i23 = i;
                    }
                    break;
                case 1377204567:
                case 1812652169:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("ۚۧ") + i21) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM11306 ^ i22) * (-9147)) ^ 2046436664;
                        i2 = 1273355942;
                        i24 = iM11306 ^ i2;
                        i23 = i;
                    } else {
                        bArrMo16422 = bArrMo16422;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                        str4 = str4;
                        strM5476 = strM5476;
                        sArr5 = sArr5;
                        bArrM5051 = bArrM5051;
                        c4424 = c4424;
                        messageDigest2 = messageDigest2;
                        messageDigestM49416 = messageDigestM49416;
                        sArr6 = sArr6;
                        c9502 = c9502;
                        iM450210 = (i21 - C19806.m45029("֫᩺")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i7 = ((iM450210 ^ i22) * 14619) ^ (-39200758);
                        i8 = -2005200021;
                        int i215 = iM450210 ^ i8;
                        messageDigestM49416 = messageDigestM49416;
                        c4424 = c4424;
                        sArr5 = sArr5;
                        strM5476 = strM5476;
                        c1313 = c1313;
                        bArrMo16422 = bArrMo16422;
                        i24 = i215;
                        i23 = i7;
                        c9502 = c9502;
                        sArr6 = sArr6;
                        messageDigest2 = messageDigest2;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    }
                    break;
                case 1397616755:
                case 1501173835:
                    bArrMo16422 = bArrMo16422;
                    interfaceC10983M3436 = interfaceC10983M3436;
                    c1313 = c1313;
                    str4 = str4;
                    strM5476 = strM5476;
                    sArr5 = sArr5;
                    bArrM5051 = bArrM5051;
                    c4424 = c4424;
                    messageDigest2 = messageDigest2;
                    messageDigestM49416 = messageDigestM49416;
                    sArr6 = sArr6;
                    c9502 = c9502;
                    short s2 = f63999[25];
                    int i32 = s2 + 1620;
                    if (AbstractC0464.m2313() == 0) {
                        int iM113016 = ThreadFactoryC3888.m11306("᩹᩺") ^ i22;
                        s = s2;
                        i23 = ((iM113016 ^ i21) * 28125) ^ (-1939490569);
                        i19 = i32;
                        sArr5 = sArr5;
                        c9502 = c9502;
                        strM5476 = strM5476;
                        sArr6 = sArr6;
                        bArrMo16422 = bArrMo16422;
                        messageDigest2 = messageDigest2;
                        i24 = iM113016 ^ 1229365014;
                        bArrM5051 = bArrM5051;
                        messageDigestM49416 = messageDigestM49416;
                        str4 = str4;
                        c4424 = c4424;
                        interfaceC10983M3436 = interfaceC10983M3436;
                        c1313 = c1313;
                    } else {
                        s = s2;
                        i19 = i32;
                        iM450210 = (i21 - C19806.m45029("֫᩺")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i7 = ((iM450210 ^ i22) * 14619) ^ (-39200758);
                        i8 = -2005200021;
                        int i216 = iM450210 ^ i8;
                        messageDigestM49416 = messageDigestM49416;
                        c4424 = c4424;
                        sArr5 = sArr5;
                        strM5476 = strM5476;
                        c1313 = c1313;
                        bArrMo16422 = bArrMo16422;
                        i24 = i216;
                        i23 = i7;
                        c9502 = c9502;
                        sArr6 = sArr6;
                        messageDigest2 = messageDigest2;
                        bArrM5051 = bArrM5051;
                        str4 = str4;
                        interfaceC10983M3436 = interfaceC10983M3436;
                    }
                    break;
                default:
                    c1313 = c1313;
                    c4424 = c4424;
                    bArrMo16422 = c18485Execute.m42860().mo5211().mo16422();
                    c17684M41160 = C17684.m41160((InputStream) new ByteArrayInputStream(C18019.m41969(bArrMo16422, bArrMo16422.length)));
                    if (z) {
                        iM11307 = ThreadFactoryC3888.m11306("ۙܰ") ^ i22;
                        i3 = ((iM11307 ^ i21) * (-21729)) ^ 916630370;
                        i6 = -235749239;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("֡ۧ") ^ i21;
                        i3 = ((iM11307 ^ i22) * 3455) ^ 1868802167;
                        i6 = 1461812195;
                    }
                    i24 = iM11307 ^ i6;
                    i23 = i3;
                    c4424 = c4424;
                    c1313 = c1313;
                    break;
            }
        }
    }
}
