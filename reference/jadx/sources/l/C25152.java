package l;

import com.google.android.material.slider.BaseSlider;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩻ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C19Y */
/* JADX INFO: loaded from: classes.dex */
public final class C25152 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0884 f81293;

    /* JADX INFO: renamed from: ۠ۖ֫, reason: not valid java name and contains not printable characters */
    private static final short[] f81294;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C14307 f81295;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static native C15126 m56060(byte[] bArr);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static native byte[] m56061(String str, byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m56057(String str) {
        f81295.remove(str);
    }

    static {
        ApplicationC23172.m52091(174);
        f81294 = new short[]{5646, 4766, -8118, -4149, -544, -7557, 5920, -30001, -29964, -29967, -29964, -29963, -29971, -29964, -30022, -29953, -29976, -29976, -29963, -29976, 7342, 20554, 18727, -18724};
        C14307 c14307 = null;
        int i = -678651968;
        int i2 = C2310.f7472;
        int i3 = AbstractC0116.f1064;
        int iM3169 = (C0773.m3169("᩻᩷") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i4 = ((iM3169 ^ i3) * 3011) ^ 1143693425;
        int i5 = 1045915931;
        while (true) {
            i = ((((i ^ i3) * 21071) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1890308173:
                case -915340581:
                    f81295 = c14307;
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("᩸ۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19987) ^ (-58951148);
                        i5 = -748621549;
                    } else {
                        iM3169 = C0773.m3169("۟ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20311) ^ (-79974412);
                        i5 = -1952904882;
                    }
                    break;
                case -1886967613:
                case 2055568699:
                    if (C0773.m3161() == 0) {
                        f81293 = new C2031(1048576);
                        return;
                    }
                    iM3169 = (C0619.m2761("ܿ֡") + i3) * (-27);
                    i4 = ((iM3169 ^ i2) * (-23411)) ^ 555489745;
                    i5 = -924365507;
                    break;
                case -1866336375:
                case -1850466303:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("ᩳۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18407)) ^ (-791011685);
                        i5 = 115834776;
                    } else {
                        iM3169 = (C0619.m2761("ۡܰ") ^ i2) * (-117);
                        i4 = ((iM3169 ^ i3) * (-31351)) ^ 1460077537;
                        i5 = -905236192;
                    }
                    break;
                case -1864759311:
                case -1101380663:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("᩸ۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19987) ^ (-58951148);
                        i5 = -748621549;
                    } else {
                        iM3169 = C0773.m3169("᩺ۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10413)) ^ 1001525331;
                        i5 = -848509701;
                    }
                    break;
                case -1385918717:
                case 1711260201:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("ܽۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28107) ^ (-1494956431);
                        i5 = -429585076;
                    } else {
                        iM3169 = C0773.m3169("۫֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31501) ^ 512720686;
                        i5 = 508052783;
                    }
                    break;
                case -1376759603:
                case -792160910:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0619.m2761("᩸ۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19987) ^ (-58951148);
                        i5 = -748621549;
                    } else {
                        iM3169 = C0773.m3169("ۤۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 20765) ^ (-419820346);
                        i5 = 1751684323;
                    }
                    break;
                case -1152815879:
                case 1480964363:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ᩳۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18407)) ^ (-791011685);
                        i5 = 115834776;
                    } else {
                        iM3169 = (i2 - C0773.m3169("֡᩷")) * 109;
                        i4 = ((iM3169 ^ i3) * 22151) ^ 708244262;
                        i5 = 905589497;
                    }
                    break;
                case -931491242:
                case 843005561:
                    if (C2485.m8357() <= 0) {
                        iM3169 = (C0619.m2761("ܿ֡") + i3) * (-27);
                        i4 = ((iM3169 ^ i2) * (-23411)) ^ 555489745;
                        i5 = -924365507;
                    } else {
                        iM3169 = (C0619.m2761("ۗ᩷") + i2) * (-69);
                        i4 = ((iM3169 ^ i3) * (-10793)) ^ 123218400;
                        i5 = 566339059;
                    }
                    break;
                case -791261690:
                case 357371855:
                    C1519.m5403();
                    iM3169 = C0619.m2761("᩸ۚ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 19987) ^ (-58951148);
                    i5 = -748621549;
                    break;
                case -754526151:
                case 89243944:
                    C3690.m11987();
                    C3998.m12920();
                    throw new RuntimeException();
                case -623673518:
                case 551378364:
                    c14307 = new C14307();
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("᩸ۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19987) ^ (-58951148);
                        i5 = -748621549;
                    } else {
                        iM3169 = C0773.m3169("ܳۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21977) ^ 6492953;
                        i5 = -1451584335;
                    }
                    break;
                case -507939003:
                case 117667550:
                    if (!C3779.m12264()) {
                        iM3169 = C0773.m3169("ܽۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28107) ^ (-1494956431);
                        i5 = -429585076;
                    } else {
                        iM3169 = C0619.m2761("᩸ۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19987) ^ (-58951148);
                        i5 = -748621549;
                    }
                    break;
                case -495249463:
                case 672335052:
                    C3690.m11987();
                    if (C1080.f3865 < 0) {
                        iM3169 = C0773.m3169("ᩳۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18407)) ^ (-791011685);
                        i5 = 115834776;
                    } else {
                        iM3169 = C0619.m2761("᩸ۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19987) ^ (-58951148);
                        i5 = -748621549;
                    }
                    break;
                case 641514758:
                case 1855796095:
                    if (C1080.m4050()) {
                        iM3169 = (C0773.m3169("᩵ۛ") + i3) * (-51);
                        i4 = ((iM3169 ^ i2) * 6001) ^ 1829877723;
                        i5 = -1108392237;
                    } else {
                        iM3169 = C0619.m2761("᩸ۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19987) ^ (-58951148);
                        i5 = -748621549;
                    }
                    break;
                default:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ᩳۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18407)) ^ (-791011685);
                        i5 = 115834776;
                    } else {
                        iM3169 = C0773.m3169("۬֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 13671) ^ (-66861111);
                        i5 = 1786974966;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m56058(byte[] bArr) {
        m56063(C15022.m36173(bArr), bArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static synchronized Future m56063(final String str, final byte[] bArr) {
        if (!C3077.m10037()) {
            return null;
        }
        byte[] bArr2 = (byte[]) f81293.m3588(str);
        if (bArr2 != null) {
            return new FutureC11725(bArr2);
        }
        C14307 c14307 = f81295;
        Future future = (Future) c14307.get(str);
        if (future != null) {
            return future;
        }
        Future futureSubmit = C5261.f18538.submit(new Callable() { // from class: l.ۚܺۧ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C25152.m56061(str, bArr);
            }
        });
        c14307.put(str, futureSubmit);
        return futureSubmit;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01e7 A[PHI: r1 r4 r5
      0x01e7: PHI (r1v85 int) = (r1v80 int), (r1v81 int), (r1v86 int) binds: [B:58:0x01cd, B:53:0x01a5, B:41:0x0122] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r4v5 int) = (r4v4 int), (r4v2 int), (r4v2 int) binds: [B:58:0x01cd, B:53:0x01a5, B:41:0x0122] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r5v49 int) = (r5v45 int), (r5v46 int), (r5v50 int) binds: [B:58:0x01cd, B:53:0x01a5, B:41:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0313 A[PHI: r1 r3 r5 r17 r27
      0x0313: PHI (r1v108 int) = (r1v65 int), (r1v78 int), (r1v84 int), (r1v110 int) binds: [B:91:0x0311, B:66:0x0243, B:44:0x0142, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0313: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:91:0x0311, B:66:0x0243, B:44:0x0142, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0313: PHI (r5v63 int) = (r5v31 int), (r5v43 int), (r5v48 int), (r5v64 int) binds: [B:91:0x0311, B:66:0x0243, B:44:0x0142, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0313: PHI (r17v3 long) = (r17v2 long), (r17v1 long), (r17v1 long), (r17v1 long) binds: [B:91:0x0311, B:66:0x0243, B:44:0x0142, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0313: PHI (r27v3 long) = (r27v1 long), (r27v1 long), (r27v2 long), (r27v1 long) binds: [B:91:0x0311, B:66:0x0243, B:44:0x0142, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m56062(byte[] bArr) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int iM3169;
        int i5;
        int i6;
        int iM31610;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int length;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int iM2761;
        int i26;
        int i27;
        int iM31611;
        int i28;
        int iM31612;
        int i29;
        int i30;
        byte[] bArr2 = bArr;
        int i31 = C1564.f5401;
        int i32 = C1080.f3865;
        int iM2762 = C0619.m2761("ۨܰ") ^ i31;
        int i33 = ((iM2762 ^ i32) * (-3617)) ^ (-2024027068);
        long j = 0;
        long j2 = 0;
        int i34 = iM2762 ^ 1675697108;
        int i35 = 0;
        int iM19212 = 0;
        int iM4236 = 0;
        int iM11802 = 0;
        int i36 = 0;
        int iM19213 = 0;
        int i37 = 0;
        int i38 = 0;
        int iM11803 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = -1421855645;
        int i43 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        int i44 = 0;
        int i45 = 0;
        while (true) {
            i42 = i34 ^ (i33 & (((i42 ^ i32) * (-22071)) >> 31));
            switch (i42) {
                case -2107891587:
                case 245621420:
                    i23 = i37;
                    i17 = i38;
                    j = j5 + j3;
                    if (C23916.f77426 <= 0) {
                        iM31611 = (C0619.m2761("ܿۘ") + i32) * 41;
                        i24 = ((iM31611 ^ i31) * (-30931)) ^ (-619677275);
                        i28 = -830913848;
                    } else {
                        iM31611 = (i31 - C0773.m3169("ۜܳ")) * 109;
                        i24 = ((iM31611 ^ i32) * 803) ^ (-746416556);
                        i28 = 1118249169;
                    }
                    i34 = iM31611 ^ i28;
                    i37 = i23;
                    i33 = i24;
                    i38 = i17;
                    break;
                case -2021189026:
                case -1994021266:
                    i = i35;
                    i2 = i37;
                    i38 = i36 + i2;
                    if (C1783.f6087 <= 0) {
                        iM31610 = C0619.m2761("᩶ۖ") ^ i31;
                        i7 = ((iM31610 ^ i32) * 17839) ^ (-1033220259);
                        i8 = -1027178821;
                    } else {
                        iM31610 = (C0773.m3169("֡۫") + i31) * 7;
                        i7 = ((iM31610 ^ i32) * (-29473)) ^ 1251547495;
                        i8 = -772421945;
                    }
                    int i46 = iM31610 ^ i8;
                    i37 = i2;
                    i33 = i7;
                    i9 = i;
                    i34 = i46;
                    i35 = i9;
                    break;
                case -1948653812:
                case 547427606:
                    i16 = i35;
                    i23 = i37;
                    i17 = i38;
                    iM11803 = RunnableC3646.m11802(i17, bArr2);
                    if (iM11803 >= 8) {
                        iM2761 = C0773.m3169("ۖۚ") ^ i31;
                        i26 = ((iM2761 ^ i32) * (-10495)) ^ 954528400;
                        i27 = -998335274;
                    } else {
                        iM2761 = (i32 - C0773.m3169("ۡۧ")) * 11;
                        i26 = ((iM2761 ^ i31) * 17387) ^ 795325111;
                        i27 = 5415343;
                    }
                    int i47 = iM2761 ^ i27;
                    i38 = i17;
                    int i48 = i26;
                    i37 = i23;
                    i33 = i48;
                    int i49 = i16;
                    i34 = i47;
                    i35 = i49;
                    break;
                case -1944480120:
                case 456367113:
                    i16 = i35;
                    i23 = i37;
                    i17 = i38;
                    i44 = -1;
                    iM2761 = C0619.m2761("᩷ܰ") ^ i31;
                    i26 = ((iM2761 ^ i32) * (-8017)) ^ 671429979;
                    i27 = 1084589255;
                    int i410 = iM2761 ^ i27;
                    i38 = i17;
                    int i411 = i26;
                    i37 = i23;
                    i33 = i411;
                    int i412 = i16;
                    i34 = i410;
                    i35 = i412;
                    break;
                case -1829480947:
                case -1584691159:
                    if (C13473.f42873 == 0) {
                        iM31612 = (C0773.m3169("ۨܽ") ^ i31) * (-79);
                        i29 = ((iM31612 ^ i32) * 15027) ^ 1609827777;
                        i30 = -711251269;
                        i34 = iM31612 ^ i30;
                        i33 = i29;
                    } else {
                        i3 = i35;
                        i4 = i38;
                        iM3169 = C0773.m3169("ۗ֫") ^ i32;
                        i5 = ((iM3169 ^ i31) * 5665) ^ (-514091692);
                        i6 = -1314010005;
                        int i50 = iM3169 ^ i6;
                        i38 = i4;
                        i9 = i3;
                        i34 = i50;
                        i33 = i5;
                        i35 = i9;
                    }
                    break;
                case -1790894613:
                case 1355513127:
                    if (C3099.f10023 <= 0) {
                        i23 = i37;
                        i17 = i38;
                        iM31611 = (C0773.m3169("ۘܶ") + i32) * (-15);
                        i24 = ((iM31611 ^ i31) * (-27131)) ^ 1265087885;
                        i28 = -2055240241;
                        i34 = iM31611 ^ i28;
                        i37 = i23;
                        i33 = i24;
                        i38 = i17;
                    } else {
                        i3 = i35;
                        i4 = i38;
                        iM3169 = C0773.m3169("ۗ֫") ^ i32;
                        i5 = ((iM3169 ^ i31) * 5665) ^ (-514091692);
                        i6 = -1314010005;
                        int i51 = iM3169 ^ i6;
                        i38 = i4;
                        i9 = i3;
                        i34 = i51;
                        i33 = i5;
                        i35 = i9;
                    }
                    break;
                case -1777840244:
                case -1681641017:
                    throw new IOException();
                case -1703240492:
                case 1327793383:
                    i16 = i35;
                    i23 = i37;
                    i17 = i38;
                    if (i36 <= iM11802 - 8) {
                        iM2761 = (C0773.m3169("ۨ᩺") + i32) * (-125);
                        i26 = ((iM2761 ^ i31) * 10543) ^ 434089256;
                        i27 = 509693365;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩸") ^ i31;
                        i26 = ((iM2761 ^ i32) * (-15767)) ^ 51278070;
                        i27 = 1638347582;
                    }
                    int i413 = iM2761 ^ i27;
                    i38 = i17;
                    int i414 = i26;
                    i37 = i23;
                    i33 = i414;
                    int i415 = i16;
                    i34 = i413;
                    i35 = i415;
                    break;
                case -1550433220:
                case 147152473:
                    i23 = i37;
                    i17 = i38;
                    if (C6929.m19212(i44, bArr2) != 512) {
                        i16 = i35;
                        iM2761 = (C0619.m2761("ۘ᩹") + i32) * (-43);
                        i26 = ((iM2761 ^ i31) * 31645) ^ 430406422;
                        i27 = 544011903;
                        int i416 = iM2761 ^ i27;
                        i38 = i17;
                        int i417 = i26;
                        i37 = i23;
                        i33 = i417;
                        int i418 = i16;
                        i34 = i416;
                        i35 = i418;
                    } else {
                        iM31611 = (C0619.m2761("ۧ֨") + i31) * 29;
                        i24 = ((iM31611 ^ i32) * (-2397)) ^ 550172931;
                        i28 = 1015002090;
                        i34 = iM31611 ^ i28;
                        i37 = i23;
                        i33 = i24;
                        i38 = i17;
                    }
                    break;
                case -1368521342:
                case 1003714175:
                    if (C1080.f3865 >= 0) {
                        i23 = i37;
                        i17 = i38;
                        iM31611 = C0619.m2761("ܶ۫") ^ i32;
                        i24 = ((iM31611 ^ i31) * (-1181)) ^ (-1157866932);
                        i28 = -1469553145;
                        i34 = iM31611 ^ i28;
                        i37 = i23;
                        i33 = i24;
                        i38 = i17;
                    }
                    i23 = i37;
                    i17 = i38;
                    iM31611 = (C0773.m3169("ۘܶ") + i32) * (-15);
                    i24 = ((iM31611 ^ i31) * (-27131)) ^ 1265087885;
                    i28 = -2055240241;
                    i34 = iM31611 ^ i28;
                    i37 = i23;
                    i33 = i24;
                    i38 = i17;
                    break;
                case -1264264592:
                case 1925169689:
                    i16 = i35;
                    i23 = i37;
                    i17 = i38;
                    int i52 = i43;
                    if (iM11802 < i52) {
                        i43 = i52;
                        i22 = i40;
                        i15 = i45;
                        i14 = i23;
                        int iM2763 = (i31 - C0619.m2761("ۖۙ")) * 97;
                        i20 = ((iM2763 ^ i32) * (-13837)) ^ 2046728615;
                        i21 = iM2763 ^ 1029821970;
                        i40 = i22;
                        i38 = i17;
                        i25 = i16;
                        i34 = i21;
                        i33 = i20;
                        i35 = i25;
                        int i53 = i14;
                        i45 = i15;
                        i37 = i53;
                    } else {
                        int iM2764 = C0619.m2761("ۙ᩶") ^ i31;
                        i24 = ((iM2764 ^ i32) * 28805) ^ 2136736086;
                        i43 = i52;
                        i35 = i16;
                        i34 = iM2764 ^ 160147006;
                        i37 = i23;
                        i33 = i24;
                        i38 = i17;
                    }
                    break;
                case -1241973736:
                case 1931258160:
                    i16 = i35;
                    i23 = i37;
                    i17 = i38;
                    if (iM11802 > bArr2.length) {
                        i22 = i40;
                        i15 = i45;
                        i14 = i23;
                        int iM2765 = (i31 - C0619.m2761("ۖۙ")) * 97;
                        i20 = ((iM2765 ^ i32) * (-13837)) ^ 2046728615;
                        i21 = iM2765 ^ 1029821970;
                        i40 = i22;
                        i38 = i17;
                        i25 = i16;
                        i34 = i21;
                        i33 = i20;
                        i35 = i25;
                        int i54 = i14;
                        i45 = i15;
                        i37 = i54;
                    } else {
                        i36 = i43;
                        iM2761 = (i32 - C0619.m2761("ۨۘ")) * 87;
                        i26 = ((iM2761 ^ i31) * 3663) ^ 283249990;
                        i27 = -1067911249;
                        int i419 = iM2761 ^ i27;
                        i38 = i17;
                        int i4110 = i26;
                        i37 = i23;
                        i33 = i4110;
                        int i4111 = i16;
                        i34 = i419;
                        i35 = i4111;
                    }
                    break;
                case -1202543576:
                case 1855177824:
                    AbstractC0116.m1243();
                    if (C2310.f7472 >= 0) {
                        i23 = i37;
                        i17 = i38;
                        iM31611 = (C0619.m2761("ܿۘ") + i32) * 41;
                        i24 = ((iM31611 ^ i31) * (-30931)) ^ (-619677275);
                        i28 = -830913848;
                        i34 = iM31611 ^ i28;
                        i37 = i23;
                        i33 = i24;
                        i38 = i17;
                    } else {
                        iM31612 = (i32 - C0619.m2761("᩺ۜ")) * (-29);
                        i29 = ((iM31612 ^ i31) * (-23183)) ^ 2068289568;
                        i30 = 1479602897;
                        i34 = iM31612 ^ i30;
                        i33 = i29;
                    }
                    break;
                case -1176726357:
                case 1177422050:
                    i23 = i37;
                    i17 = i38;
                    int i55 = i36 + iM11803;
                    i16 = i35;
                    if (iM19213 != 1) {
                        i36 = i55;
                        iM2761 = (i32 - C0619.m2761("ۨۘ")) * 87;
                        i26 = ((iM2761 ^ i31) * 3663) ^ 283249990;
                        i27 = -1067911249;
                        int i4112 = iM2761 ^ i27;
                        i38 = i17;
                        int i4113 = i26;
                        i37 = i23;
                        i33 = i4113;
                        int i4114 = i16;
                        i34 = i4112;
                        i35 = i4114;
                    } else {
                        i44 = i55;
                        iM2761 = C0619.m2761("᩷ܰ") ^ i31;
                        i26 = ((iM2761 ^ i32) * (-8017)) ^ 671429979;
                        i27 = 1084589255;
                        int i4115 = iM2761 ^ i27;
                        i38 = i17;
                        int i4116 = i26;
                        i37 = i23;
                        i33 = i4116;
                        int i4117 = i16;
                        i34 = i4115;
                        i35 = i4117;
                    }
                    break;
                case -1091983455:
                case 1903141806:
                    i2 = i37;
                    int i56 = i38;
                    j5 = i36;
                    long j7 = iM11803;
                    if (C2878.f9462) {
                        i = i35;
                        j3 = j7;
                        i38 = i56;
                        iM31610 = C0619.m2761("᩶ۖ") ^ i31;
                        i7 = ((iM31610 ^ i32) * 17839) ^ (-1033220259);
                        i8 = -1027178821;
                        int i420 = iM31610 ^ i8;
                        i37 = i2;
                        i33 = i7;
                        i9 = i;
                        i34 = i420;
                        i35 = i9;
                    } else {
                        int iM31613 = C0773.m3169("֫᩷") ^ i32;
                        i37 = i2;
                        i33 = ((iM31613 ^ i31) * (-14111)) ^ 221445958;
                        i38 = i56;
                        i35 = i35;
                        i34 = iM31613 ^ 1497021625;
                        j3 = j7;
                    }
                    break;
                case -1061074218:
                case -302923967:
                    C3998.m12920();
                    if (C3690.f12684 <= 0) {
                        iM31612 = (C0773.m3169("ۨܽ") ^ i31) * (-79);
                        i29 = ((iM31612 ^ i32) * 15027) ^ 1609827777;
                        i30 = -711251269;
                    } else {
                        iM31612 = (i31 - C0773.m3169("ᩴܳ")) * (-53);
                        i29 = ((iM31612 ^ i32) * 22457) ^ 2081916765;
                        i30 = -1054725924;
                    }
                    i34 = iM31612 ^ i30;
                    i33 = i29;
                    break;
                case -1057794853:
                case -925307808:
                    i3 = i35;
                    i4 = i38;
                    iM19213 = C6929.m19212(i36, bArr2);
                    i37 = 4;
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("ۗ֫") ^ i32;
                        i5 = ((iM3169 ^ i31) * 5665) ^ (-514091692);
                        i6 = -1314010005;
                    } else {
                        iM3169 = (C0773.m3169("ܶܿ") + i32) * (-89);
                        i5 = ((iM3169 ^ i31) * (-27303)) ^ 1157191700;
                        i6 = 1050449705;
                    }
                    int i57 = iM3169 ^ i6;
                    i38 = i4;
                    i9 = i3;
                    i34 = i57;
                    i33 = i5;
                    i35 = i9;
                    break;
                case -1053325979:
                case 1894407805:
                    i23 = i37;
                    i17 = i38;
                    if (j > iM11802) {
                        i16 = i35;
                        iM2761 = (i32 - C0773.m3169("ۡۧ")) * 11;
                        i26 = ((iM2761 ^ i31) * 17387) ^ 795325111;
                        i27 = 5415343;
                        int i4118 = iM2761 ^ i27;
                        i38 = i17;
                        int i4119 = i26;
                        i37 = i23;
                        i33 = i4119;
                        int i41110 = i16;
                        i34 = i4118;
                        i35 = i41110;
                    } else {
                        iM31611 = C0773.m3169("᩵᩻") ^ i31;
                        i24 = ((iM31611 ^ i32) * (-19725)) ^ 1317710190;
                        i28 = -1018676290;
                        i34 = iM31611 ^ i28;
                        i37 = i23;
                        i33 = i24;
                        i38 = i17;
                    }
                    break;
                case -803871698:
                case 655627466:
                    i16 = i35;
                    int i58 = i37;
                    i17 = i38;
                    i15 = i45;
                    int iM19214 = C6929.m19212(i15, bArr2);
                    iM11802 = RunnableC3646.m11802(4, bArr2);
                    i22 = i40;
                    if (iM19214 < i22) {
                        i14 = i58;
                        i43 = iM19214;
                        int iM2766 = (i31 - C0619.m2761("ۖۙ")) * 97;
                        i20 = ((iM2766 ^ i32) * (-13837)) ^ 2046728615;
                        i21 = iM2766 ^ 1029821970;
                        i40 = i22;
                        i38 = i17;
                        i25 = i16;
                        i34 = i21;
                        i33 = i20;
                        i35 = i25;
                        int i59 = i14;
                        i45 = i15;
                        i37 = i59;
                    } else {
                        int iM2767 = C0619.m2761("۟᩷") ^ i32;
                        i14 = i58;
                        i33 = ((iM2767 ^ i31) * 1155) ^ 1710996864;
                        i43 = iM19214;
                        i35 = i16;
                        i34 = iM2767 ^ (-1445364855);
                        i40 = i22;
                        i38 = i17;
                        int i60 = i14;
                        i45 = i15;
                        i37 = i60;
                    }
                    break;
                case -801481584:
                case 1065509921:
                    i23 = i37;
                    i17 = i38;
                    j2 = j6 + j4;
                    if (C1321.f4751 >= 0) {
                        iM31611 = (C0619.m2761("ܿۘ") + i32) * 41;
                        i24 = ((iM31611 ^ i31) * (-30931)) ^ (-619677275);
                        i28 = -830913848;
                    } else {
                        iM31611 = C0773.m3169("۟ᩳ") ^ i32;
                        i24 = ((iM31611 ^ i31) * (-22919)) ^ 220988738;
                        i28 = 646539179;
                    }
                    i34 = iM31611 ^ i28;
                    i37 = i23;
                    i33 = i24;
                    i38 = i17;
                    break;
                case -781425737:
                case 1354803847:
                    i23 = i37;
                    i17 = i38;
                    j6 = i44;
                    long j8 = iM4236;
                    if (C2310.f7472 >= 0) {
                        j4 = j8;
                        iM31611 = (C0773.m3169("ۘܶ") + i32) * (-15);
                        i24 = ((iM31611 ^ i31) * (-27131)) ^ 1265087885;
                        i28 = -2055240241;
                        i34 = iM31611 ^ i28;
                        i37 = i23;
                        i33 = i24;
                        i38 = i17;
                    } else {
                        int iM2768 = (C0619.m2761("֡᩵") ^ i31) * 89;
                        int i61 = ((iM2768 ^ i32) * 25175) ^ 1359177616;
                        i34 = iM2768 ^ (-1592836722);
                        i38 = i17;
                        j4 = j8;
                        i37 = i23;
                        i33 = i61;
                    }
                    break;
                case -753607423:
                case 2099322691:
                    i23 = i37;
                    i17 = i38;
                    if (i44 > iM11802 - 284) {
                        i16 = i35;
                        iM2761 = (C0619.m2761("ۘ᩹") + i32) * (-43);
                        i26 = ((iM2761 ^ i31) * 31645) ^ 430406422;
                        i27 = 544011903;
                        int i41111 = iM2761 ^ i27;
                        i38 = i17;
                        int i41112 = i26;
                        i37 = i23;
                        i33 = i41112;
                        int i41113 = i16;
                        i34 = i41111;
                        i35 = i41113;
                    } else {
                        iM31611 = C0619.m2761("ۡ֨") ^ i32;
                        i24 = ((iM31611 ^ i31) * 27311) ^ 2802145;
                        i28 = 2029045811;
                        i34 = iM31611 ^ i28;
                        i37 = i23;
                        i33 = i24;
                        i38 = i17;
                    }
                    break;
                case -637713086:
                case 97232770:
                    throw new IOException();
                case -602659063:
                case 1578869024:
                    C3077.m10041();
                    if (C2375.m8065() <= 0) {
                        iM31612 = (i32 - C0619.m2761("᩺ۜ")) * (-29);
                        i29 = ((iM31612 ^ i31) * (-23183)) ^ 2068289568;
                        i30 = 1479602897;
                        i34 = iM31612 ^ i30;
                        i33 = i29;
                    } else {
                        i10 = i35;
                        i11 = i38;
                        length = i39;
                        i12 = i40;
                        i13 = i43;
                        int i62 = i45;
                        i14 = i37;
                        i15 = i62;
                        int iM2769 = (C0619.m2761("ۢ֡") + i31) * (-117);
                        i40 = i12;
                        i43 = i13;
                        i39 = length;
                        i38 = i11;
                        i33 = ((iM2769 ^ i32) * (-5463)) ^ 194532274;
                        bArr2 = bArr;
                        i25 = i10;
                        i34 = iM2769 ^ 1836113741;
                        i35 = i25;
                        int i510 = i14;
                        i45 = i15;
                        i37 = i510;
                    }
                    break;
                case -594141030:
                case 809983080:
                    return i44;
                case -550321810:
                case -336346967:
                    i23 = i37;
                    i17 = i38;
                    i35 = i44 + 2;
                    if (C1826.m6301() >= 0) {
                        iM31611 = C0619.m2761("ܶ۫") ^ i32;
                        i24 = ((iM31611 ^ i31) * (-1181)) ^ (-1157866932);
                        i28 = -1469553145;
                    } else {
                        iM31611 = (i31 - C0619.m2761("ۘܰ")) * 55;
                        i24 = ((iM31611 ^ i32) * 1325) ^ (-133280128);
                        i28 = -1378781927;
                    }
                    i34 = iM31611 ^ i28;
                    i37 = i23;
                    i33 = i24;
                    i38 = i17;
                    break;
                case -549768672:
                case -15543074:
                    throw new IOException();
                case -457212261:
                case 694804246:
                    i23 = i37;
                    i17 = i38;
                    iM4236 = C1146.m4236(i44 + i41, bArr2);
                    if (iM19212 >= 284) {
                        iM31611 = (C0773.m3169("ᩳܶ") + i31) * 57;
                        i24 = ((iM31611 ^ i32) * (-3543)) ^ 1038343303;
                        i28 = 1352553749;
                    } else {
                        iM31611 = (C0773.m3169("֨ܳ") + i32) * 33;
                        i24 = ((iM31611 ^ i31) * 7549) ^ 73786910;
                        i28 = -1754035725;
                    }
                    i34 = iM31611 ^ i28;
                    i37 = i23;
                    i33 = i24;
                    i38 = i17;
                    break;
                case -325707790:
                case 2113215427:
                    RunnableC0334.m2063();
                    if (C1564.f5401 > 0) {
                        i10 = i35;
                        i11 = i38;
                        length = i39;
                        i12 = i40;
                        i13 = i43;
                        int i63 = i45;
                        i14 = i37;
                        i15 = i63;
                        int iM27610 = (C0619.m2761("ۢ֡") + i31) * (-117);
                        i40 = i12;
                        i43 = i13;
                        i39 = length;
                        i38 = i11;
                        i33 = ((iM27610 ^ i32) * (-5463)) ^ 194532274;
                        bArr2 = bArr;
                        i25 = i10;
                        i34 = iM27610 ^ 1836113741;
                        i35 = i25;
                        int i511 = i14;
                        i45 = i15;
                        i37 = i511;
                    } else {
                        iM31612 = (C0773.m3169("ۨܽ") ^ i31) * (-79);
                        i29 = ((iM31612 ^ i32) * 15027) ^ 1609827777;
                        i30 = -711251269;
                        i34 = iM31612 ^ i30;
                        i33 = i29;
                    }
                    break;
                case -112441245:
                case 1999226796:
                    i16 = i35;
                    i14 = i37;
                    i17 = i38;
                    int i64 = i40;
                    i18 = i43;
                    if (C6929.m19212(0, bArr2) == 2) {
                        int iM27611 = C0619.m2761("۠ۧ") ^ i31;
                        i43 = i18;
                        i40 = i64;
                        i35 = i16;
                        i34 = iM27611 ^ (-1434265190);
                        i38 = i17;
                        i33 = ((iM27611 ^ i32) * 3959) ^ (-1685931232);
                        i37 = i14;
                        i45 = 2;
                    } else {
                        i40 = i64;
                        i19 = i39;
                        i15 = 2;
                        int iM27612 = (C0619.m2761("ܿ۟") ^ i32) * (-51);
                        int i65 = i18;
                        i20 = ((iM27612 ^ i31) * (-17405)) ^ (-981643334);
                        i21 = iM27612 ^ (-783378033);
                        i43 = i65;
                        i39 = i19;
                        i38 = i17;
                        i25 = i16;
                        i34 = i21;
                        i33 = i20;
                        i35 = i25;
                        int i512 = i14;
                        i45 = i15;
                        i37 = i512;
                    }
                    break;
                case -73193324:
                case 856924117:
                    i23 = i37;
                    i17 = i38;
                    iM19212 = C6929.m19212(i35, bArr2);
                    if (C2702.m8876()) {
                        iM31611 = C0619.m2761("ۛۖ") ^ i32;
                        i24 = ((iM31611 ^ i31) * 16601) ^ (-2007242757);
                        i28 = -795675609;
                    } else {
                        iM31611 = (C0619.m2761("ܿۘ") + i32) * 41;
                        i24 = ((iM31611 ^ i31) * (-30931)) ^ (-619677275);
                        i28 = -830913848;
                    }
                    i34 = iM31611 ^ i28;
                    i37 = i23;
                    i33 = i24;
                    i38 = i17;
                    break;
                case -52113130:
                case -19980355:
                    C1321.m4852();
                    i3 = i35;
                    i4 = i38;
                    iM3169 = C0773.m3169("ۗ֫") ^ i32;
                    i5 = ((iM3169 ^ i31) * 5665) ^ (-514091692);
                    i6 = -1314010005;
                    int i513 = iM3169 ^ i6;
                    i38 = i4;
                    i9 = i3;
                    i34 = i513;
                    i33 = i5;
                    i35 = i9;
                    break;
                case -34611657:
                case 1121055554:
                    i23 = i37;
                    i17 = i38;
                    if (j2 <= iM11802) {
                        iM31611 = (i31 - C0773.m3169("ۖ᩵")) * 33;
                        i24 = ((iM31611 ^ i32) * 29545) ^ 1997206382;
                        i28 = -47054404;
                    } else {
                        iM31611 = (C0773.m3169("֨ܳ") + i32) * 33;
                        i24 = ((iM31611 ^ i31) * 7549) ^ 73786910;
                        i28 = -1754035725;
                    }
                    i34 = iM31611 ^ i28;
                    i37 = i23;
                    i33 = i24;
                    i38 = i17;
                    break;
                case 43097997:
                case 1314420450:
                    throw new IOException();
                case 200571284:
                case 587928175:
                    i23 = i37;
                    i17 = i38;
                    i41 = 4;
                    if (C3448.m11248() != 0) {
                        iM31611 = (i32 - C0773.m3169("ᩳۛ")) * 95;
                        i24 = ((iM31611 ^ i31) * (-17815)) ^ 1889721846;
                        i28 = 1377048991;
                    } else {
                        iM31611 = (C0619.m2761("᩺ܳ") ^ i31) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i24 = ((iM31611 ^ i32) * (-13081)) ^ (-46411033);
                        i28 = -662158731;
                    }
                    i34 = iM31611 ^ i28;
                    i37 = i23;
                    i33 = i24;
                    i38 = i17;
                    break;
                case 339148972:
                case 1791705911:
                    RunnableC1848.m6360();
                    C2375.m8065();
                    return 0;
                case 427173679:
                case 1916379878:
                    i10 = i35;
                    i11 = i38;
                    i12 = i40;
                    i13 = i43;
                    int i66 = i45;
                    i14 = i37;
                    i15 = i66;
                    length = bArr2.length;
                    if (C3690.f12684 > 0) {
                        int iM31614 = (C0773.m3169("ۗ۟") + i31) * 5;
                        i40 = i12;
                        i43 = i13;
                        i39 = length;
                        i33 = ((iM31614 ^ i32) * (-9647)) ^ 1791614429;
                        i38 = i11;
                        i35 = i10;
                        i34 = iM31614 ^ 2121913475;
                        bArr2 = bArr;
                        int i67 = i14;
                        i45 = i15;
                        i37 = i67;
                    } else {
                        int iM27613 = (C0619.m2761("ۢ֡") + i31) * (-117);
                        i40 = i12;
                        i43 = i13;
                        i39 = length;
                        i38 = i11;
                        i33 = ((iM27613 ^ i32) * (-5463)) ^ 194532274;
                        bArr2 = bArr;
                        i25 = i10;
                        i34 = iM27613 ^ 1836113741;
                        i35 = i25;
                        int i514 = i14;
                        i45 = i15;
                        i37 = i514;
                    }
                    break;
                case 444758916:
                case 1571372230:
                    i16 = i35;
                    i17 = i38;
                    i18 = i43;
                    int i68 = i45;
                    i14 = i37;
                    i15 = i68;
                    i19 = i39;
                    if (i19 < 12) {
                        i40 = 12;
                        int iM27614 = (C0619.m2761("ܿ۟") ^ i32) * (-51);
                        int i69 = i18;
                        i20 = ((iM27614 ^ i31) * (-17405)) ^ (-981643334);
                        i21 = iM27614 ^ (-783378033);
                        i43 = i69;
                        i39 = i19;
                        i38 = i17;
                        i25 = i16;
                        i34 = i21;
                        i33 = i20;
                        i35 = i25;
                        int i515 = i14;
                        i45 = i15;
                        i37 = i515;
                    } else {
                        int iM31615 = C0773.m3169("ܶ᩺") ^ i32;
                        i33 = ((iM31615 ^ i31) * 14907) ^ 1883362602;
                        i43 = i18;
                        i35 = i16;
                        i40 = 12;
                        i34 = iM31615 ^ (-1404081344);
                        i39 = i19;
                        i38 = i17;
                        int i610 = i14;
                        i45 = i15;
                        i37 = i610;
                    }
                    break;
                case 471285427:
                case 503476042:
                    i23 = i37;
                    i17 = i38;
                    if (iM4236 >= iM19212) {
                        iM31611 = C0619.m2761("֡ᩴ") ^ i32;
                        i24 = ((iM31611 ^ i31) * 16215) ^ (-154111192);
                        i28 = 168492460;
                    } else {
                        iM31611 = (C0773.m3169("֨ܳ") + i32) * 33;
                        i24 = ((iM31611 ^ i31) * 7549) ^ 73786910;
                        i28 = -1754035725;
                    }
                    i34 = iM31611 ^ i28;
                    i37 = i23;
                    i33 = i24;
                    i38 = i17;
                    break;
                case 976314093:
                case 1895928616:
                    i16 = i35;
                    i23 = i37;
                    i17 = i38;
                    if (i44 >= 0) {
                        iM2761 = C0619.m2761("֡ۗ") ^ i32;
                        i26 = ((iM2761 ^ i31) * 25199) ^ (-729997343);
                        i27 = -1505231619;
                    } else {
                        iM2761 = (C0619.m2761("ۘ᩹") + i32) * (-43);
                        i26 = ((iM2761 ^ i31) * 31645) ^ 430406422;
                        i27 = 544011903;
                    }
                    int i41114 = iM2761 ^ i27;
                    i38 = i17;
                    int i41115 = i26;
                    i37 = i23;
                    i33 = i41115;
                    int i41116 = i16;
                    i34 = i41114;
                    i35 = i41116;
                    break;
                case 1720540025:
                case 1829693433:
                    throw new IOException();
                default:
                    if (C2702.f8586 <= 0) {
                        i = i35;
                        i2 = i37;
                        iM31610 = C0619.m2761("᩶ۖ") ^ i31;
                        i7 = ((iM31610 ^ i32) * 17839) ^ (-1033220259);
                        i8 = -1027178821;
                        int i421 = iM31610 ^ i8;
                        i37 = i2;
                        i33 = i7;
                        i9 = i;
                        i34 = i421;
                        i35 = i9;
                    } else {
                        iM31612 = (i32 - C0619.m2761("᩺ۜ")) * (-29);
                        i29 = ((iM31612 ^ i31) * (-23183)) ^ 2068289568;
                        i30 = 1479602897;
                        i34 = iM31612 ^ i30;
                        i33 = i29;
                    }
                    break;
            }
        }
    }
}
