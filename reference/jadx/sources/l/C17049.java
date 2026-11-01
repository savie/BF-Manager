package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܿۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L2RS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17049 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩸᩻ۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f54442 = {7001, -31750, 21013, -21127, 146, 16273, 16356, 16260, 16269, 16380, 16356, 16257, 16300, 16305, 28466, -24402, 24191, 3019, 7993, -1350, -12890, 7441, -560, 7950};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f54443;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18419 f54444;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f54445;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f54446;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f54447;

    /* JADX WARN: Code duplicated, block: B:21:0x008d A[PHI: r4
      0x008d: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:20:0x008b, B:13:0x006f, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0137 A[PHI: r5 r6
      0x0137: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:36:0x0135, B:32:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r6v4 int) = (r6v3 int), (r6v2 int) binds: [B:36:0x0135, B:32:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0172 A[PHI: r8 r9 r11 r12
      0x0172: PHI (r8v5 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:40:0x0170, B:24:0x00c6, B:13:0x006f, B:10:0x0067, B:5:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r9v5 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:40:0x0170, B:24:0x00c6, B:13:0x006f, B:10:0x0067, B:5:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r11v5 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:40:0x0170, B:24:0x00c6, B:13:0x006f, B:10:0x0067, B:5:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r12v5 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:40:0x0170, B:24:0x00c6, B:13:0x006f, B:10:0x0067, B:5:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x024c A[PHI: r7 r16 r17
      0x024c: PHI (r7v5 java.lang.String) = (r7v2 java.lang.String), (r7v4 java.lang.String), (r7v2 java.lang.String) binds: [B:59:0x024a, B:28:0x00eb, B:10:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:59:0x024a, B:28:0x00eb, B:10:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r17v4 int) = (r17v3 int), (r17v2 int), (r17v2 int) binds: [B:59:0x024a, B:28:0x00eb, B:10:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0286 A[PHI: r2 r3 r10 r14 r22
      0x0286: PHI (r2v4 l.֫ۧۚ) = (r2v2 l.֫ۧۚ), (r2v2 l.֫ۧۚ), (r2v3 l.֫ۧۚ), (r2v2 l.֫ۧۚ) binds: [B:63:0x0284, B:55:0x0229, B:44:0x01ac, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r3v4 java.lang.Runnable) = (r3v2 java.lang.Runnable), (r3v2 java.lang.Runnable), (r3v3 java.lang.Runnable), (r3v2 java.lang.Runnable) binds: [B:63:0x0284, B:55:0x0229, B:44:0x01ac, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r10v5 short) = (r10v4 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:63:0x0284, B:55:0x0229, B:44:0x01ac, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r14v4 short) = (r14v2 short), (r14v3 short), (r14v2 short), (r14v2 short) binds: [B:63:0x0284, B:55:0x0229, B:44:0x01ac, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r22v5 int) = (r22v3 int), (r22v4 int), (r22v3 int), (r22v3 int) binds: [B:63:0x0284, B:55:0x0229, B:44:0x01ac, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        int iM45029;
        int i;
        int i2;
        int i3 = C3535.f13026;
        int i4 = C1148.f5161;
        int iM11306 = (ThreadFactoryC3888.m11306("ܿۨ") + i4) * 87;
        int i5 = ((iM11306 ^ i3) * (-1439)) ^ (-1855712064);
        Runnable runnable = null;
        String strM5047 = null;
        short[] sArr = null;
        int i6 = iM11306 ^ 374626691;
        C1777 c1777 = null;
        int i7 = 0;
        int iM11307 = 0;
        int i8 = 0;
        int iM450210 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1625091201;
        int i15 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * 2273) >> 31));
            switch (i14) {
                case -2003330287:
                case 2061331253:
                    iM11307 = ThreadFactoryC3888.m11306(C3722.m10901(sArr, i10, 3, i11));
                    i8 = 2129563932;
                    if (C0962.m3746() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۧ") + i4) * 95;
                        i = ((iM45029 ^ i3) * (-11191)) ^ 54652786;
                        i2 = -392121535;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙۘ") ^ i4) * 127;
                        i = ((iM45029 ^ i3) * (-23235)) ^ 1222761504;
                        i2 = 201242861;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1955357998:
                case -353410740:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿۛ") + i3) * (-83);
                        i = ((iM45029 ^ i4) * (-11685)) ^ (-2132447694);
                        i2 = 1509948165;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۡ") + i3) * 13;
                        i = ((iM45029 ^ i4) * 3689) ^ (-2073912437);
                        i2 = -925372624;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1683861407:
                case -304419001:
                    strM5047 = C1460.m5047(f54442, 21, 3, i11);
                    if (C3743.f13569) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹۬") ^ i3;
                        i = ((iM45029 ^ i4) * (-19667)) ^ 1106338890;
                        i2 = -1990362818;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۖ") ^ i4) * (-115);
                        i = ((iM45029 ^ i3) * (-6495)) ^ 278223327;
                        i2 = 69262634;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1663493730:
                case -885024340:
                    c1777 = new C1777(this.f54443);
                    runnable = null;
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻۬") ^ i4;
                        i = ((iM45029 ^ i3) * (-12511)) ^ 166595525;
                        i2 = -1798123588;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۡ") + i3) * 13;
                        i = ((iM45029 ^ i4) * 3689) ^ (-2073912437);
                        i2 = -925372624;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1603287576:
                case 1150843955:
                    C3577.m10565();
                    C0629.m2907();
                    break;
                case -1501696106:
                case -696184630:
                    if (C0050.m946() > 0) {
                        iM45029 = (C19806.m45029("ܶ᩻") ^ i4) * 77;
                        i = ((iM45029 ^ i3) * (-15431)) ^ (-44597338);
                        i2 = 764478153;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿۛ") + i3) * (-83);
                        i = ((iM45029 ^ i4) * (-11685)) ^ (-2132447694);
                        i2 = 1509948165;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1376986996:
                case 984635101:
                    int i16 = s + s2;
                    if ((i16 * i16) - i15 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۧ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM45029 ^ i4) * 27007) ^ (-1795444010);
                        i2 = -1371763761;
                    } else {
                        iM45029 = (C19806.m45029("᩷ۜ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM45029 ^ i4) * 2075) ^ (-441103302);
                        i2 = -1284759685;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1317076536:
                case 851639993:
                    c1777.m5840(i7);
                    c1777.mo5843();
                    this.f54447 = c1777;
                    break;
                case -1198079616:
                case -41950399:
                    i11 = 27994;
                    iM45029 = (i4 - C19806.m45029("ۙۛ")) * (-55);
                    i = ((iM45029 ^ i3) * (-30593)) ^ 1128926588;
                    i2 = 209518131;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1166709728:
                case 983077354:
                    c1777.m5830(iM450210 ^ i9);
                    i7 = 0;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿۛ") + i3) * (-83);
                        i = ((iM45029 ^ i4) * (-11685)) ^ (-2132447694);
                        i2 = 1509948165;
                    } else {
                        iM45029 = C19806.m45029("ۜ۟") ^ i3;
                        i = ((iM45029 ^ i4) * (-13789)) ^ 1101099936;
                        i2 = 1830951205;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -692158798:
                case 362983223:
                    iM450210 = C19806.m45029(strM5047);
                    i9 = 2098613851;
                    if (RunnableC3388.m10064()) {
                        iM45029 = C19806.m45029("ۨۨ") ^ i4;
                        i = ((iM45029 ^ i3) * 5917) ^ (-1348776494);
                        i2 = -976819001;
                    } else {
                        iM45029 = (C19806.m45029("ܶ᩻") ^ i4) * 77;
                        i = ((iM45029 ^ i3) * (-15431)) ^ (-44597338);
                        i2 = 764478153;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -531569412:
                case 1880604819:
                    s = f54442[17];
                    if (C10634.m26820()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۡ") + i3) * 13;
                        i = ((iM45029 ^ i4) * 3689) ^ (-2073912437);
                        i2 = -925372624;
                    } else {
                        iM45029 = C19806.m45029("۬۠") ^ i4;
                        i = ((iM45029 ^ i3) * (-24973)) ^ 52193719;
                        i2 = 1966100975;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -345855606:
                case 731210758:
                    c1777.mo5828(runnable);
                    sArr = f54442;
                    i10 = 18;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (C19806.m45029("ܶ᩻") ^ i4) * 77;
                        i = ((iM45029 ^ i3) * (-15431)) ^ (-44597338);
                        i2 = 764478153;
                    } else {
                        iM45029 = (C19806.m45029("ۘ۬") + i3) * (-81);
                        i = ((iM45029 ^ i4) * (-21031)) ^ 803790862;
                        i2 = -753220632;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -312464660:
                case 381279985:
                    C3535.m10431();
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۖ") ^ i4) * (-115);
                        i = ((iM45029 ^ i3) * (-6495)) ^ 278223327;
                        i2 = 69262634;
                    } else {
                        iM45029 = (C19806.m45029("ܶ᩻") ^ i4) * 77;
                        i = ((iM45029 ^ i3) * (-15431)) ^ (-44597338);
                        i2 = 764478153;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -215763215:
                case 81466441:
                    int i17 = i12 + i13;
                    i15 = i17 + i17;
                    s2 = 10883;
                    if (C1189.f5284 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۡ") + i3) * 13;
                        i = ((iM45029 ^ i4) * 3689) ^ (-2073912437);
                        i2 = -925372624;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܿ۫")) * 89;
                        i = ((iM45029 ^ i3) * (-18847)) ^ (-889657747);
                        i2 = 1606120318;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -120652748:
                case 1637453775:
                    i11 = 39684;
                    iM45029 = (i4 - C19806.m45029("ۙۛ")) * (-55);
                    i = ((iM45029 ^ i3) * (-30593)) ^ 1128926588;
                    i2 = 209518131;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 176411004:
                case 2129633839:
                    i12 = s * s;
                    i13 = 118439689;
                    if (C19806.f63586) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۖ") ^ i4) * (-115);
                        i = ((iM45029 ^ i3) * (-6495)) ^ 278223327;
                        i2 = 69262634;
                    } else {
                        iM45029 = (C19806.m45029("᩵֡") ^ i3) * 61;
                        i = ((iM45029 ^ i4) * 14493) ^ 1530972824;
                        i2 = 708564406;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 884419774:
                case 1374768613:
                    c1777.m5837(iM11307 ^ i8);
                    if (C0526.f2219) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۧ") + i4) * 95;
                        i = ((iM45029 ^ i3) * (-11191)) ^ 54652786;
                        i2 = -392121535;
                    } else {
                        iM45029 = C19806.m45029("ۛܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-14331)) ^ 647838730;
                        i2 = -1002260550;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1668.m5583();
                    C1189.m4368();
                    iM45029 = (C19806.m45029("ܶ᩻") ^ i4) * 77;
                    i = ((iM45029 ^ i3) * (-15431)) ^ (-44597338);
                    i2 = 764478153;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x019b A[PHI: r8 r12 r16
      0x019b: PHI (r8v2 int) = (r8v1 int), (r8v1 int), (r8v4 int) binds: [B:33:0x00cc, B:14:0x0056, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r12v3 int) = (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:33:0x00cc, B:14:0x0056, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r16v29 int) = (r16v17 int), (r16v24 int), (r16v32 int) binds: [B:33:0x00cc, B:14:0x0056, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01d1 A[PHI: r6 r7 r10 r11 r16
      0x01d1: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:54:0x01cf, B:37:0x00ee, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:54:0x01cf, B:37:0x00ee, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]) binds: [B:54:0x01cf, B:37:0x00ee, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:54:0x01cf, B:37:0x00ee, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r16v25 int) = (r16v10 int), (r16v16 int), (r16v28 int) binds: [B:54:0x01cf, B:37:0x00ee, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0225 A[PHI: r4 r16 r17
      0x0225: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:62:0x0223, B:29:0x00ac, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r16v26 int) = (r16v8 int), (r16v18 int), (r16v27 int) binds: [B:62:0x0223, B:29:0x00ac, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r17v3 int) = (r17v1 int), (r17v2 int), (r17v1 int) binds: [B:62:0x0223, B:29:0x00ac, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0255 A[PHI: r3 r5 r16
      0x0255: PHI (r3v3 char) = (r3v2 char), (r3v1 char), (r3v1 char) binds: [B:66:0x0253, B:58:0x0203, B:26:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:66:0x0253, B:58:0x0203, B:26:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r16v19 int) = (r16v7 int), (r16v9 int), (r16v21 int) binds: [B:66:0x0253, B:58:0x0203, B:26:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (l.MenuItemOnMenuItemClickListenerC3244.f12064 < 0) goto L14;
     */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1157() {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17049.mo1157():void");
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        AbstractActivityC12483 abstractActivityC12483 = null;
        int i = 1270107749;
        int i2 = C0278.f1572;
        int i3 = ThreadFactoryC3888.f14547;
        int iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩹") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
        int i4 = ((iM11306 ^ i3) * 5045) ^ (-422130614);
        int i5 = 342648273;
        while (true) {
            i = ((((i ^ i3) * (-6911)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1967127997:
                case 1995847065:
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20887) ^ 770681694;
                        i5 = 655916487;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31387) ^ 1560306014;
                        i5 = 161081576;
                    }
                    break;
                case -1943936392:
                case 1903736963:
                    C2871.m8646();
                    if (C2249.f8050 < 0) {
                        iM11306 = (i2 - C19806.m45029("֫۠")) * 61;
                        i4 = ((iM11306 ^ i3) * 24657) ^ 1581007523;
                        i5 = 15542940;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩵ۨ")) * (-33);
                        i4 = ((iM11306 ^ i2) * (-927)) ^ 316506529;
                        i5 = 124799750;
                    }
                    break;
                case -1930820264:
                case 230995319:
                    if (C3660.f13403 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۤ") ^ i3) * 57;
                        i4 = ((iM11306 ^ i2) * (-21739)) ^ 1543250025;
                        i5 = -79467311;
                    } else {
                        iM11306 = C19806.m45029("ᩴۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27253) ^ (-1999891306);
                        i5 = 460584118;
                    }
                    break;
                case -1662554533:
                case 98395286:
                    C2642.m8171();
                    if (!C1377.f5749) {
                        iM11306 = (i3 - C19806.m45029("᩵ۨ")) * (-33);
                        i4 = ((iM11306 ^ i2) * (-927)) ^ 316506529;
                        i5 = 124799750;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29077) ^ 1564485740;
                        i5 = 1345307043;
                    }
                    break;
                case -1476422145:
                case 1297622190:
                    RunnableC3388.m10064();
                    iM11306 = (i3 - C19806.m45029("᩵ۨ")) * (-33);
                    i4 = ((iM11306 ^ i2) * (-927)) ^ 316506529;
                    i5 = 124799750;
                    break;
                case -1264068727:
                case -730684240:
                    if (C1189.m4368() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29077) ^ 1564485740;
                        i5 = 1345307043;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ᩷") ^ i3) * 81;
                        i4 = ((iM11306 ^ i2) * 897) ^ (-576503022);
                        i5 = 1488350125;
                    }
                    break;
                case -1060832652:
                case -885390089:
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20887) ^ 770681694;
                        i5 = 655916487;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩵ۨ")) * (-33);
                        i4 = ((iM11306 ^ i2) * (-927)) ^ 316506529;
                        i5 = 124799750;
                    }
                    break;
                case -992061873:
                case -479754321:
                    abstractActivityC12483 = this.f54443;
                    if (C1066.m4023() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۤ") ^ i3) * 57;
                        i4 = ((iM11306 ^ i2) * (-21739)) ^ 1543250025;
                        i5 = -79467311;
                    } else {
                        iM11306 = (C19806.m45029("֡۟") + i2) * 115;
                        i4 = ((iM11306 ^ i3) * (-17631)) ^ 1976585401;
                        i5 = 717588153;
                    }
                    break;
                case -622487063:
                case 1116953792:
                    C1025.m3861();
                    RunnableC0195.m1431();
                    break;
                case -403220153:
                case 1293108305:
                    if (C1937.f7317 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29077) ^ 1564485740;
                        i5 = 1345307043;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14255) ^ 1351253250;
                        i5 = -1749563153;
                    }
                    break;
                case -254609931:
                case 311314443:
                    if (RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۤ") ^ i3) * 57;
                        i4 = ((iM11306 ^ i2) * (-21739)) ^ 1543250025;
                        i5 = -79467311;
                    } else {
                        iM11306 = (C19806.m45029("ᩴᩳ") ^ i3) * (-103);
                        i4 = ((iM11306 ^ i2) * (-30671)) ^ (-79971004);
                        i5 = -70343476;
                    }
                    break;
                case -222171749:
                case 1637282370:
                    if (C1377.f5749) {
                        iM11306 = C19806.m45029("ۚۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-4009)) ^ 1454850412;
                        i5 = 936315704;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۤ") ^ i3) * 57;
                        i4 = ((iM11306 ^ i2) * (-21739)) ^ 1543250025;
                        i5 = -79467311;
                    }
                    break;
                case 227504211:
                case 339318944:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i2 - C19806.m45029("֫۠")) * 61;
                        i4 = ((iM11306 ^ i3) * 24657) ^ 1581007523;
                        i5 = 15542940;
                    } else {
                        iM11306 = (C19806.m45029("ۡܰ") ^ i2) * 89;
                        i4 = ((iM11306 ^ i3) * 18285) ^ 1793540837;
                        i5 = -1978966463;
                    }
                    break;
                case 351165819:
                case 1384008264:
                    if (C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29077) ^ 1564485740;
                        i5 = 1345307043;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۤ") + i3) * 23;
                        i4 = ((iM11306 ^ i2) * 26821) ^ (-407789643);
                        i5 = -1567146919;
                    }
                    break;
                case 716755810:
                case 1120767996:
                    if (C0797.m3359()) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵۫") + i3) * (-73);
                        i4 = ((iM11306 ^ i2) * 14351) ^ (-1262042143);
                        i5 = 1312785309;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29077) ^ 1564485740;
                        i5 = 1345307043;
                    }
                    break;
                default:
                    C0671.m3019(abstractActivityC12483, exc, null);
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 25441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        /*
            Method dump skipped, instruction units count: 2544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17049.mo1159():void");
    }

    public C17049(AbstractActivityC12483 abstractActivityC12483, AbstractC20745 abstractC20745, C18419 c18419, Runnable runnable) {
        int i = -1551021543;
        int i2 = C2477.f9839;
        int i3 = C1461.f5957;
        this.f54443 = abstractActivityC12483;
        this.f54445 = abstractC20745;
        this.f54444 = c18419;
        this.f54446 = runnable;
        int iM11306 = ThreadFactoryC3888.m11306("֫᩹") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-29813)) ^ (-115932478);
        int i5 = 638246793;
        while (true) {
            i = (iM11306 ^ i5) ^ (i4 & (((i ^ i2) * 14661) >> 31));
            switch (i) {
                case -2037347800:
                case 91573663:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-30319)) ^ (-1915658500);
                        i5 = 1049242094;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩶ܳ")) * 17;
                        i4 = ((iM11306 ^ i3) * 32643) ^ (-723306749);
                        i5 = 971634590;
                    }
                    break;
                case -1908818804:
                case 1727001259:
                    C2124.m6673();
                    throw new RuntimeException();
                case -1800078585:
                case 2121213956:
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 10395) ^ 129004685;
                        i5 = -1435457127;
                    } else {
                        iM11306 = (C19806.m45029("֫ۘ") + i2) * (-39);
                        i4 = ((iM11306 ^ i3) * (-31745)) ^ 1811313515;
                        i5 = 1342019248;
                    }
                    break;
                case -1483623181:
                case 685877176:
                    return;
                case -633267716:
                case 2091494291:
                    C1461.m5080();
                    if (RunnableC0195.m1431()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-30319)) ^ (-1915658500);
                        i5 = 1049242094;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 31217) ^ (-1785142461);
                        i5 = -1583632157;
                    }
                    break;
                case 872476282:
                case 1256420639:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    iM11306 = ThreadFactoryC3888.m11306("ܺ۠") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-30319)) ^ (-1915658500);
                    i5 = 1049242094;
                    break;
                default:
                    if (C0629.f2722 > 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩶ܳ")) * 17;
                        i4 = ((iM11306 ^ i3) * 32643) ^ (-723306749);
                        i5 = 971634590;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻ᩳ")) * (-103);
                        i4 = ((iM11306 ^ i2) * (-22935)) ^ (-1342754894);
                        i5 = -167143941;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f54447.m5825();
    }
}
