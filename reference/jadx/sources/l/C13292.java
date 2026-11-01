package l;

import java.io.PrintStream;
import moe.shizuku.server.IShizukuApplication;

/* JADX INFO: renamed from: l.۬ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13292 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩶᩷᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f44134 = {8932, -15007, -15024, -15034, -15039, 3758, -2486, -2475, -2479, -2438, -2479, -2488, -2475, -2461, -2496, -2492, -2479, -2480, -2473, -2496, -2474, -2490, -2487, -2492, -2474, -2474, -2496, -2474, -2434, -2537, -2552, -2532, -2440, -2534, -2439, -2549, -2495, -2496, -2467, -2513, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2536, -2513};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1777 f44135;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ StringBuilder f44136;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f44137;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC4514 f44138;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0238 A[PHI: r6 r10 r11 r13 r14 r18
      0x0238: PHI (r6v5 char) = (r6v2 char), (r6v1 char), (r6v1 char), (r6v1 char), (r6v1 char) binds: [B:61:0x0236, B:49:0x01bd, B:45:0x019c, B:93:0x0238, B:89:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r10v5 int) = (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:61:0x0236, B:49:0x01bd, B:45:0x019c, B:93:0x0238, B:89:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r11v5 short) = (r11v1 short), (r11v1 short), (r11v2 short), (r11v1 short), (r11v1 short) binds: [B:61:0x0236, B:49:0x01bd, B:45:0x019c, B:93:0x0238, B:89:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r13v5 short[]) = (r13v1 short[]), (r13v1 short[]), (r13v1 short[]), (r13v2 short[]), (r13v1 short[]) binds: [B:61:0x0236, B:49:0x01bd, B:45:0x019c, B:93:0x0238, B:89:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r14v5 int) = (r14v1 int), (r14v1 int), (r14v1 int), (r14v2 int), (r14v1 int) binds: [B:61:0x0236, B:49:0x01bd, B:45:0x019c, B:93:0x0238, B:89:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r18v29 int) = (r18v6 int), (r18v9 int), (r18v10 int), (r18v19 int), (r18v34 int) binds: [B:61:0x0236, B:49:0x01bd, B:45:0x019c, B:93:0x0238, B:89:0x0238] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0268 A[PHI: r3 r4 r5 r8 r9 r18 r19
      0x0268: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v1 java.lang.String), (r3v1 java.lang.String), (r3v3 java.lang.String) binds: [B:65:0x0266, B:53:0x01e1, B:35:0x0118, B:92:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v1 java.lang.String), (r4v1 java.lang.String), (r4v3 java.lang.String) binds: [B:65:0x0266, B:53:0x01e1, B:35:0x0118, B:92:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r5v3 short[]) = (r5v2 short[]), (r5v1 short[]), (r5v1 short[]), (r5v1 short[]) binds: [B:65:0x0266, B:53:0x01e1, B:35:0x0118, B:92:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:65:0x0266, B:53:0x01e1, B:35:0x0118, B:92:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:65:0x0266, B:53:0x01e1, B:35:0x0118, B:92:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r18v20 int) = (r18v5 int), (r18v8 int), (r18v15 int), (r18v21 int) binds: [B:65:0x0266, B:53:0x01e1, B:35:0x0118, B:92:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r19v6 java.lang.StringBuilder) = 
      (r19v1 java.lang.StringBuilder)
      (r19v1 java.lang.StringBuilder)
      (r19v5 java.lang.StringBuilder)
      (r19v1 java.lang.StringBuilder)
     binds: [B:65:0x0266, B:53:0x01e1, B:35:0x0118, B:92:0x0268] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        int iM45029;
        int i;
        int iM450210;
        int i2;
        int i3;
        C13292 c13292 = this;
        String strM3407 = null;
        String strM5502 = null;
        String str = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short s2 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 256236073;
        int i10 = C1025.f4800;
        int i11 = C1875.f7103;
        int iM11306 = ThreadFactoryC3888.m11306("֡֨") ^ i10;
        int i12 = ((iM11306 ^ i11) * 29531) ^ (-1379117759);
        int i13 = iM11306 ^ 316747049;
        StringBuilder sb = null;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i11) * (-14167)) >> 31));
            switch (i14) {
                case -2004435356:
                case 200283702:
                    i14 = i14;
                    strM5502 = CallableC1627.m5502(sArr2, i8, 4, i7);
                    str = null;
                    if (C0278.f1572 > 0) {
                        iM450210 = (C19806.m45029("ܽ᩺") + i11) * (-63);
                        i2 = ((iM450210 ^ i10) * (-23855)) ^ (-828812369);
                        i3 = -154096578;
                        int i15 = i14;
                        i13 = iM450210 ^ i3;
                        i12 = i2;
                        i9 = i15;
                    } else {
                        iM45029 = (i10 - C19806.m45029("ᩴ᩵")) * 67;
                        i12 = ((iM45029 ^ i11) * (-21127)) ^ 1235880116;
                        i = -362767236;
                        int i16 = iM45029 ^ i;
                        i9 = i14;
                        i13 = i16;
                        c13292 = this;
                    }
                    break;
                case -2004382210:
                case -3173221:
                    i14 = i14;
                    s2 = 14814;
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("᩸֫") ^ i11;
                        i12 = ((iM45029 ^ i10) * (-22751)) ^ (-124093705);
                        i = 644054166;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۛ") ^ i10;
                        i12 = ((iM45029 ^ i11) * 11617) ^ 1332800564;
                        i = -1292167441;
                    }
                    int i17 = iM45029 ^ i;
                    i9 = i14;
                    i13 = i17;
                    c13292 = this;
                    break;
                case -1957367474:
                case -394346444:
                    ActivityC21135.m47562(c13292.f44138, strM3407, strM5502, str, str);
                    break;
                case -1550213113:
                case -1034916415:
                    i14 = i14;
                    sArr = f44134;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (i10 - C19806.m45029("ᩴ᩵")) * 67;
                        i12 = ((iM45029 ^ i11) * (-21127)) ^ 1235880116;
                        i = -362767236;
                    } else {
                        iM45029 = (C19806.m45029("ܽ۬") + i11) * 29;
                        i12 = ((iM45029 ^ i10) * 15511) ^ 408481504;
                        i = 1633347366;
                    }
                    int i18 = iM45029 ^ i;
                    i9 = i14;
                    i13 = i18;
                    c13292 = this;
                    break;
                case -973895254:
                case -486418737:
                    i14 = i14;
                    c = 0;
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("᩸֫") ^ i11;
                        i12 = ((iM45029 ^ i10) * (-22751)) ^ (-124093705);
                        i = 644054166;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i10;
                        i12 = ((iM45029 ^ i11) * 541) ^ 1924082316;
                        i = 724081971;
                    }
                    int i19 = iM45029 ^ i;
                    i9 = i14;
                    i13 = i19;
                    c13292 = this;
                    break;
                case -965508910:
                case 329824616:
                    i14 = i14;
                    i4 = s * s;
                    i5 = 219454596;
                    if (RunnableC1895.f7152) {
                        iM45029 = (i10 - C19806.m45029("۟ۖ")) * 65;
                        i12 = ((iM45029 ^ i11) * 20397) ^ 2102125422;
                        i = -2047315795;
                    } else {
                        iM45029 = (i10 - C19806.m45029("ᩴ᩵")) * 67;
                        i12 = ((iM45029 ^ i11) * (-21127)) ^ 1235880116;
                        i = -362767236;
                    }
                    int i110 = iM45029 ^ i;
                    i9 = i14;
                    i13 = i110;
                    c13292 = this;
                    break;
                case -934823810:
                case 324307245:
                    i14 = i14;
                    C0629.m2907();
                    if (RunnableC1606.f6488 < 0) {
                        iM450210 = (C19806.m45029("ܺ֨") ^ i11) * (-37);
                        i2 = ((iM450210 ^ i10) * (-8523)) ^ (-2104279445);
                        i3 = -769978409;
                        int i111 = i14;
                        i13 = iM450210 ^ i3;
                        i12 = i2;
                        i9 = i111;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ۫") ^ i10) * (-109);
                        i12 = ((iM45029 ^ i11) * 13895) ^ (-1532131400);
                        i = -930860304;
                        int i112 = iM45029 ^ i;
                        i9 = i14;
                        i13 = i112;
                        c13292 = this;
                    }
                    break;
                case -850307832:
                case -507154034:
                    if (!CallableC1627.f6528) {
                        i14 = i14;
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ۫") ^ i10) * (-109);
                        i12 = ((iM45029 ^ i11) * 13895) ^ (-1532131400);
                        i = -930860304;
                        int i113 = iM45029 ^ i;
                        i9 = i14;
                        i13 = i113;
                        c13292 = this;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ܺ۫") ^ i10;
                        i14 = i14;
                        i2 = ((iM450210 ^ i11) * 23179) ^ (-1809991294);
                        i3 = -1008362733;
                        int i114 = i14;
                        i13 = iM450210 ^ i3;
                        i12 = i2;
                        i9 = i114;
                    }
                    break;
                case -599713337:
                case -318415404:
                    i14 = i14;
                    PrintStream printStream = System.out;
                    StringBuilder sb2 = c13292.f44136;
                    printStream.println(sb2);
                    if (C1066.m4023() <= 0) {
                        sb = sb2;
                        iM45029 = (i10 - C19806.m45029("ᩴ᩵")) * 67;
                        i12 = ((iM45029 ^ i11) * (-21127)) ^ 1235880116;
                        i = -362767236;
                        int i115 = iM45029 ^ i;
                        i9 = i14;
                        i13 = i115;
                    } else {
                        int iM11307 = (ThreadFactoryC3888.m11306("᩸ܺ") ^ i11) * (-67);
                        sb = sb2;
                        i9 = i14;
                        i13 = iM11307 ^ (-1764096442);
                        i12 = ((iM11307 ^ i10) * (-10309)) ^ (-1212673784);
                    }
                    c13292 = this;
                    break;
                case -438616028:
                case 1019669769:
                    i7 = 27362;
                    iM45029 = C19806.m45029("ۖۙ") ^ i10;
                    i12 = ((iM45029 ^ i11) * (-21165)) ^ (-2015589344);
                    i = 1035236312;
                    int i116 = iM45029 ^ i;
                    i9 = i14;
                    i13 = i116;
                    c13292 = this;
                    break;
                case -419074891:
                case 1690862697:
                    i14 = i14;
                    strM3407 = C0817.m3407(sb);
                    if (C2477.m7593() >= 0) {
                        iM450210 = (C19806.m45029("ܺ֨") ^ i11) * (-37);
                        i2 = ((iM450210 ^ i10) * (-8523)) ^ (-2104279445);
                        i3 = -769978409;
                    } else {
                        iM450210 = (C19806.m45029("ۤܽ") ^ i10) * 71;
                        i2 = ((iM450210 ^ i11) * (-11025)) ^ 1463681507;
                        i3 = -859403023;
                    }
                    int i117 = i14;
                    i13 = iM450210 ^ i3;
                    i12 = i2;
                    i9 = i117;
                    break;
                case -334132222:
                case 848958691:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    break;
                case -85824471:
                case 1811748898:
                    i7 = 50485;
                    iM45029 = C19806.m45029("ۖۙ") ^ i10;
                    i12 = ((iM45029 ^ i11) * (-21165)) ^ (-2015589344);
                    i = 1035236312;
                    int i118 = iM45029 ^ i;
                    i9 = i14;
                    i13 = i118;
                    c13292 = this;
                    break;
                case -73772362:
                case 1285372082:
                    i14 = i14;
                    s = sArr[c];
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ۫") ^ i10) * (-109);
                        i12 = ((iM45029 ^ i11) * 13895) ^ (-1532131400);
                        i = -930860304;
                    } else {
                        iM45029 = (i11 - C19806.m45029("ܿ֡")) * 119;
                        i12 = ((iM45029 ^ i10) * (-157)) ^ (-206156884);
                        i = 1087219157;
                    }
                    int i119 = iM45029 ^ i;
                    i9 = i14;
                    i13 = i119;
                    c13292 = this;
                    break;
                case 769954539:
                case 1538575057:
                    i14 = i14;
                    sArr2 = f44134;
                    i8 = 1;
                    if (!C2704.f10408) {
                        iM45029 = C19806.m45029("᩸֫") ^ i11;
                        i12 = ((iM45029 ^ i10) * (-22751)) ^ (-124093705);
                        i = 644054166;
                        int i1110 = iM45029 ^ i;
                        i9 = i14;
                        i13 = i1110;
                        c13292 = this;
                    } else {
                        iM450210 = (i11 - ThreadFactoryC3888.m11306("ۙۙ")) * (-39);
                        i2 = ((iM450210 ^ i10) * 8723) ^ 567563052;
                        i3 = -1558061855;
                        int i1111 = i14;
                        i13 = iM450210 ^ i3;
                        i12 = i2;
                        i9 = i1111;
                    }
                    break;
                case 912544941:
                case 2010454550:
                    i14 = i14;
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("᩸֫") ^ i11;
                        i12 = ((iM45029 ^ i10) * (-22751)) ^ (-124093705);
                        i = 644054166;
                        int i1112 = iM45029 ^ i;
                        i9 = i14;
                        i13 = i1112;
                        c13292 = this;
                    } else {
                        iM450210 = (C19806.m45029("ܺ֨") ^ i11) * (-37);
                        i2 = ((iM450210 ^ i10) * (-8523)) ^ (-2104279445);
                        i3 = -769978409;
                        int i1113 = i14;
                        i13 = iM450210 ^ i3;
                        i12 = i2;
                        i9 = i1113;
                    }
                    break;
                case 993385494:
                case 1649032915:
                    i14 = i14;
                    int i20 = s + s2;
                    if ((i20 * i20) - i6 <= 0) {
                        iM45029 = (i11 - C19806.m45029("֡ۡ")) * (-35);
                        i12 = ((iM45029 ^ i10) * (-6425)) ^ 417506609;
                        i = 578910032;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۧ") ^ i10;
                        i12 = ((iM45029 ^ i11) * (-4527)) ^ 1445075760;
                        i = 896110468;
                    }
                    int i1114 = iM45029 ^ i;
                    i9 = i14;
                    i13 = i1114;
                    c13292 = this;
                    break;
                case 1143394378:
                case 2031035989:
                    i14 = i14;
                    int i21 = i4 + i5;
                    i6 = i21 + i21;
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("᩸֫") ^ i11;
                        i12 = ((iM45029 ^ i10) * (-22751)) ^ (-124093705);
                        i = 644054166;
                    } else {
                        iM45029 = (C19806.m45029("֫ۜ") ^ i11) * (-9);
                        i12 = ((iM45029 ^ i10) * 9419) ^ 80315260;
                        i = 868662554;
                    }
                    int i1115 = iM45029 ^ i;
                    i9 = i14;
                    i13 = i1115;
                    c13292 = this;
                    break;
                default:
                    i14 = i14;
                    C0817.m3399();
                    iM45029 = (ThreadFactoryC3888.m11306("ۢ۫") ^ i10) * (-109);
                    i12 = ((iM45029 ^ i11) * 13895) ^ (-1532131400);
                    i = -930860304;
                    int i1116 = iM45029 ^ i;
                    i9 = i14;
                    i13 = i1116;
                    c13292 = this;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        ViewOnClickListenerC4514 viewOnClickListenerC4514 = null;
        int i = 788745590;
        int i2 = C0278.f1572;
        int i3 = C1875.f7103;
        int iM45029 = C19806.m45029("֫ۨ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-4045)) ^ (-1034484062);
        int i5 = 450430677;
        while (true) {
            i = ((((i ^ i3) * (-14969)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2116857463:
                case 658564031:
                    if (C3743.m10966() <= 0) {
                        iM45029 = C19806.m45029("᩻ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9983)) ^ 1298105771;
                        i5 = 1555825722;
                    } else {
                        iM45029 = (C19806.m45029("ۘ֡") ^ i2) * (-23);
                        i4 = ((iM45029 ^ i3) * 17119) ^ 404568205;
                        i5 = -1026675488;
                    }
                    break;
                case -1913383098:
                case -1535018155:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩵") ^ i2) * (-85);
                        i4 = ((iM45029 ^ i3) * 1767) ^ 425087330;
                        i5 = 1655842149;
                    } else {
                        iM45029 = (C19806.m45029("᩷ۖ") + i3) * 65;
                        i4 = ((iM45029 ^ i2) * (-3933)) ^ (-917336568);
                        i5 = 384960742;
                    }
                    break;
                case -1718948803:
                case 1694318729:
                    if (!CallableC1627.f6528) {
                        iM45029 = C19806.m45029("᩻ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9983)) ^ 1298105771;
                        i5 = 1555825722;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation) ^ 1577102042;
                        i5 = 1393953539;
                    }
                    break;
                case -1654862746:
                case 1434979338:
                    C1066.m4023();
                    iM45029 = ThreadFactoryC3888.m11306("ᩳ᩺") ^ i3;
                    i4 = ((iM45029 ^ i2) * IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation) ^ 1577102042;
                    i5 = 1393953539;
                    break;
                case -1363541750:
                case 563317123:
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("᩻ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9983)) ^ 1298105771;
                        i5 = 1555825722;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7905)) ^ (-2092796411);
                        i5 = 433582104;
                    }
                    break;
                case -1217975108:
                case -196651955:
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 25749) ^ 694686636;
                        i5 = -1957577181;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜܺ") + i2) * 49;
                        i4 = ((iM45029 ^ i3) * 1323) ^ 568617490;
                        i5 = -1569377538;
                    }
                    break;
                case -1205578039:
                case 170088558:
                    C3722.m10894();
                    break;
                case -1181665734:
                case 1867418761:
                    C0671.m3019(viewOnClickListenerC4514, exc, null);
                    break;
                case -1128862333:
                case 720622552:
                    viewOnClickListenerC4514 = this.f44138;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۘ") ^ i2) * (-109);
                        i4 = ((iM45029 ^ i3) * 6473) ^ 1898202422;
                        i5 = 386808918;
                    } else {
                        iM45029 = C19806.m45029("۬۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32205) ^ 536584258;
                        i5 = -1528371166;
                    }
                    break;
                case -609512879:
                case 25464523:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation) ^ 1577102042;
                        i5 = 1393953539;
                    } else {
                        iM45029 = (C19806.m45029("ܶۧ") ^ i3) * 79;
                        i4 = ((iM45029 ^ i2) * 17507) ^ 192746913;
                        i5 = -2064110217;
                    }
                    break;
                case -292777061:
                case 278066067:
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 25749) ^ 694686636;
                        i5 = -1957577181;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۚ") ^ i3) * (-25);
                        i4 = ((iM45029 ^ i2) * (-2381)) ^ 1893614542;
                        i5 = 585944616;
                    }
                    break;
                case -219785964:
                case 901976804:
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺᩵") ^ i2) * (-57);
                        i4 = ((iM45029 ^ i3) * 7441) ^ 1972054856;
                        i5 = -2057458743;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩵") ^ i2) * (-85);
                        i4 = ((iM45029 ^ i3) * 1767) ^ 425087330;
                        i5 = 1655842149;
                    }
                    break;
                case 128889647:
                case 1616119512:
                    if (C1977.m6356()) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩵") ^ i2) * (-85);
                        i4 = ((iM45029 ^ i3) * 1767) ^ 425087330;
                        i5 = 1655842149;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ܽ") ^ i3) * (-123);
                        i4 = ((iM45029 ^ i2) * (-12323)) ^ 411492666;
                        i5 = 2126685842;
                    }
                    break;
                case 642372696:
                case 1617158952:
                    if (!C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation) ^ 1577102042;
                        i5 = 1393953539;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩵") ^ i2) * (-85);
                        i4 = ((iM45029 ^ i3) * 1767) ^ 425087330;
                        i5 = 1655842149;
                    }
                    break;
                case 1103641416:
                case 1626901820:
                    C1066.m4023();
                    if (C1937.f7317 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 25749) ^ 694686636;
                        i5 = -1957577181;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩵") ^ i2) * (-85);
                        i4 = ((iM45029 ^ i3) * 1767) ^ 425087330;
                        i5 = 1655842149;
                    }
                    break;
                default:
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 25749) ^ 694686636;
                        i5 = -1957577181;
                    } else {
                        iM45029 = C19806.m45029("ۗۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11681) ^ 2105517094;
                        i5 = -1870409986;
                    }
                    break;
            }
            return;
        }
    }

    public C13292(ViewOnClickListenerC4514 viewOnClickListenerC4514, String str, C1777 c1777, StringBuilder sb) {
        int i = 1266676583;
        int i2 = C3722.f13525;
        int i3 = C1066.f4915;
        this.f44138 = viewOnClickListenerC4514;
        this.f44137 = str;
        this.f44135 = c1777;
        this.f44136 = sb;
        int iM45029 = C19806.m45029("ۛۤ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 8807) ^ (-1670511926);
        int i5 = 1438946306;
        while (true) {
            i = (iM45029 ^ i5) ^ (i4 & (((i ^ i3) * (-11255)) >> 31));
            switch (i) {
                case -1687481253:
                case 727233247:
                    C3286.m9798();
                    if (C1937.m6279() >= 0) {
                        iM45029 = (C19806.m45029("᩵᩷") ^ i3) * (-93);
                        i4 = ((iM45029 ^ i2) * 5355) ^ (-1240550590);
                        i5 = 1209029852;
                    } else {
                        iM45029 = C19806.m45029("֫ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29739)) ^ 2082142477;
                        i5 = 1693633047;
                    }
                    break;
                case -1159668600:
                case 2142498180:
                    return;
                case -695762144:
                case 1099713350:
                    RunnableC1606.m5473();
                    throw new RuntimeException();
                case 7376784:
                case 1891268785:
                    if (RunnableC1895.f7152) {
                        iM45029 = (i3 - C19806.m45029("ۚۗ")) * (-35);
                        i4 = ((iM45029 ^ i2) * (-439)) ^ (-775420925);
                        i5 = 1758962377;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4571) ^ 1665025388;
                        i5 = 590854316;
                    }
                    break;
                case 860176511:
                case 1377893881:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (C19806.m45029("᩵᩷") ^ i3) * (-93);
                        i4 = ((iM45029 ^ i2) * 5355) ^ (-1240550590);
                        i5 = 1209029852;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18031)) ^ 767254675;
                        i5 = -1105867758;
                    }
                    break;
                case 1183547196:
                case 2098021150:
                    if (RunnableC1564.f6300) {
                        iM45029 = (C19806.m45029("᩵᩷") ^ i3) * (-93);
                        i4 = ((iM45029 ^ i2) * 5355) ^ (-1240550590);
                        i5 = 1209029852;
                    } else {
                        iM45029 = (C19806.m45029("ۢ᩵") ^ i2) * (-95);
                        i4 = ((iM45029 ^ i3) * 169) ^ 1195718105;
                        i5 = 1204627792;
                    }
                    break;
                default:
                    C2788.m8472();
                    iM45029 = C19806.m45029("֫ۖ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-29739)) ^ 2082142477;
                    i5 = 1693633047;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0160, code lost:
    
        if (l.C1148.m4232() <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x018f, code lost:
    
        if (l.ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0194, code lost:
    
        if (l.RunnableC1564.f6300 != false) goto L31;
     */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1159() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13292.mo1159():void");
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f44135.m5825();
    }
}
