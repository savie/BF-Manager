package l;

import android.widget.Button;
import bin.mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۡ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q152 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9006 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۜ᩺֡, reason: not valid java name and contains not printable characters */
    private static final short[] f29325 = {3466, -14318, -2467, 7223, -5465, 3477, 7591, 4340, 32088, 28432, -27900, 31646, 30815, -18822, -29741, -23014, -31991, 2830, 15351, -8383, 5100, 23938, 23938, 23938};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f29326;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f29327;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f29328;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8261 f29329;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29330;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f29331;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4245 f29332;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C17539 f29333;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f29334;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f29335;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f29336;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9651 f29337;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29338;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f29339;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29340;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f29341;

    /* JADX WARN: Code duplicated, block: B:150:0x0831 A[PHI: r3 r5 r7 r8 r9 r10 r12 r13 r14 r30 r35 r36 r38 r39
      0x0831: PHI (r3v24 l.ۗۧܺ) = (r3v16 l.ۗۧܺ), (r3v16 l.ۗۧܺ), (r3v25 l.ۗۧܺ) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r5v6 l.۟᩻ܺ) = (r5v2 l.۟᩻ܺ), (r5v2 l.۟᩻ܺ), (r5v1 l.۟᩻ܺ) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r7v15 l.۟ܺܺ) = (r7v6 l.۟ܺܺ), (r7v6 l.۟ܺܺ), (r7v16 l.۟ܺܺ) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r8v11 int) = (r8v4 int), (r8v4 int), (r8v12 int) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r9v11 l.᩶ۤۤ) = (r9v3 l.᩶ۤۤ), (r9v3 l.᩶ۤۤ), (r9v2 l.᩶ۤۤ) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r10v16 l.ۤ۠ᩴ) = (r10v7 l.ۤ۠ᩴ), (r10v7 l.ۤ۠ᩴ), (r10v18 l.ۤ۠ᩴ) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r12v12 int) = (r12v9 int), (r12v9 int), (r12v13 int) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r13v16 l.᩷ۨᩴ) = (r13v8 l.᩷ۨᩴ), (r13v8 l.᩷ۨᩴ), (r13v17 l.᩷ۨᩴ) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r14v19 java.util.ArrayList) = (r14v14 java.util.ArrayList), (r14v14 java.util.ArrayList), (r14v20 java.util.ArrayList) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r30v16 l.ܰ᩻ܺ) = (r30v8 l.ܰ᩻ܺ), (r30v8 l.ܰ᩻ܺ), (r30v17 l.ܰ᩻ܺ) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r35v7 int) = (r35v4 int), (r35v4 int), (r35v8 int) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r36v5 byte[]) = (r36v2 byte[]), (r36v2 byte[]), (r36v6 byte[]) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r38v6 l.ۛۚۤ) = (r38v2 l.ۛۚۤ), (r38v2 l.ۛۚۤ), (r38v7 l.ۛۚۤ) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0831: PHI (r39v7 java.lang.String) = (r39v2 java.lang.String), (r39v2 java.lang.String), (r39v8 java.lang.String) binds: [B:146:0x0826, B:149:0x082f, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x012d, code lost:
    
        if (l.C2419.f7754 < 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x007c, code lost:
    
        if (l.AbstractC0641.f2496 >= 0) goto L7;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m24040(l.C22941 r42, l.C25179 r43) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9006.m24040(l.᩸ܽܺ, l.᩻ܽܺ):void");
    }

    public C9006(ViewOnClickListenerC8261 viewOnClickListenerC8261, AbstractC22044 abstractC22044, C9651 c9651, boolean z, int i, C4245 c4245, boolean z2, boolean z3, String str, int i2, int i3, AbstractC22044 abstractC22045, boolean z4) {
        C17539 c17539 = null;
        int i4 = -1430432309;
        int i5 = C0487.f2131;
        int i6 = AbstractC0641.f2496;
        this.f29329 = viewOnClickListenerC8261;
        this.f29328 = abstractC22044;
        this.f29337 = c9651;
        this.f29336 = z;
        this.f29330 = i;
        this.f29332 = c4245;
        this.f29339 = z2;
        this.f29331 = z3;
        this.f29327 = str;
        this.f29340 = i2;
        this.f29338 = i3;
        this.f29335 = abstractC22045;
        this.f29341 = z4;
        int iM2761 = C0619.m2761("۫᩵") ^ i6;
        int i7 = ((iM2761 ^ i5) * 26283) ^ (-1038808305);
        int i8 = 242703198;
        while (true) {
            i4 = ((((i4 ^ i5) * 6707) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i4) {
                case -2069742010:
                case -191265975:
                    c17539 = new C17539();
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0619.m2761("ۘ᩺") + i6) * (-13);
                        i7 = ((iM2761 ^ i5) * 29215) ^ (-1062941443);
                        i8 = -1690279819;
                    } else {
                        iM2761 = (C0619.m2761("ۨ۫") ^ i5) * (-97);
                        i7 = ((iM2761 ^ i6) * 4693) ^ 1528312588;
                        i8 = 308177498;
                    }
                    break;
                case -1880039154:
                case -1806202852:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0619.m2761("ۘ᩺") + i6) * (-13);
                        i7 = ((iM2761 ^ i5) * 29215) ^ (-1062941443);
                        i8 = -1690279819;
                    } else {
                        iM2761 = C0619.m2761("᩸ۡ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-30917)) ^ (-2006454930);
                        i8 = 1792918162;
                    }
                    break;
                case -1802453397:
                case -243722421:
                    C1519.m5403();
                    C2310.m7813();
                    iM2761 = (C0619.m2761("ۘ᩺") + i6) * (-13);
                    i7 = ((iM2761 ^ i5) * 29215) ^ (-1062941443);
                    i8 = -1690279819;
                    break;
                case -1071245112:
                case 1310712265:
                    if (C3077.f9998) {
                        iM2761 = (C0773.m3169("ܽۖ") ^ i5) * 47;
                        i7 = ((iM2761 ^ i6) * 4381) ^ (-455256730);
                        i8 = 1404668741;
                    } else {
                        iM2761 = C0619.m2761("֡᩵") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-22383)) ^ 484674399;
                        i8 = 1063512185;
                    }
                    break;
                case -806565755:
                case 509996362:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("᩵ۜ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-13933)) ^ (-896118208);
                        i8 = -1765697512;
                    } else {
                        iM2761 = (C0773.m3169("ۡܶ") ^ i5) * 59;
                        i7 = ((iM2761 ^ i6) * 22693) ^ (-362456758);
                        i8 = 607629693;
                    }
                    break;
                case -737569228:
                case 672294805:
                    if (!C2023.f6737) {
                        iM2761 = (C0619.m2761("ۧ᩻") ^ i6) * 7;
                        i7 = ((iM2761 ^ i5) * (-2101)) ^ 1775201859;
                        i8 = -1665798573;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۘ۬")) * (-17);
                        i7 = ((iM2761 ^ i6) * (-20685)) ^ (-171967830);
                        i8 = -2131639049;
                    }
                    break;
                case -733260592:
                case 262861215:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("֡᩵") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-22383)) ^ 484674399;
                        i8 = 1063512185;
                    } else {
                        iM2761 = C0773.m3169("᩷ܺ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-2073)) ^ 1479506505;
                        i8 = 1731713840;
                    }
                    break;
                case -356794685:
                case 1257800817:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (i5 - C0773.m3169("ۘ۬")) * (-17);
                        i7 = ((iM2761 ^ i6) * (-20685)) ^ (-171967830);
                        i8 = -2131639049;
                    } else {
                        iM2761 = C0773.m3169("᩹۬") ^ i6;
                        i7 = ((iM2761 ^ i5) * 13719) ^ 1331247710;
                        i8 = -993439832;
                    }
                    break;
                case -303991455:
                case -293478153:
                    if (C1826.m6301() >= 0) {
                        iM2761 = (C0619.m2761("ۧ᩻") ^ i6) * 7;
                        i7 = ((iM2761 ^ i5) * (-2101)) ^ 1775201859;
                        i8 = -1665798573;
                    } else {
                        iM2761 = (C0619.m2761("ܳ۬") ^ i6) * (-119);
                        i7 = ((iM2761 ^ i5) * (-7445)) ^ 1209586715;
                        i8 = -493840929;
                    }
                    break;
                case 228308412:
                case 2108669667:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (i5 - C0773.m3169("ۘ۬")) * (-17);
                        i7 = ((iM2761 ^ i6) * (-20685)) ^ (-171967830);
                        i8 = -2131639049;
                    } else {
                        iM2761 = C0619.m2761("᩶᩸") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-10395)) ^ 415996605;
                        i8 = 1659373203;
                    }
                    break;
                case 323801244:
                case 1465919737:
                    RunnableC3646.m11813();
                    if (C2288.f7433 > 0) {
                        iM2761 = (i5 - C0773.m3169("ۘ۬")) * (-17);
                        i7 = ((iM2761 ^ i6) * (-20685)) ^ (-171967830);
                        i8 = -2131639049;
                    } else {
                        iM2761 = (C0619.m2761("ۘ᩺") + i6) * (-13);
                        i7 = ((iM2761 ^ i5) * 29215) ^ (-1062941443);
                        i8 = -1690279819;
                    }
                    break;
                case 476438508:
                case 679876876:
                    this.f29333 = c17539;
                    return;
                case 911189564:
                case 1973030729:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (i5 - C0773.m3169("ۘ۬")) * (-17);
                        i7 = ((iM2761 ^ i6) * (-20685)) ^ (-171967830);
                        i8 = -2131639049;
                    } else {
                        iM2761 = C0773.m3169("᩶֫") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-8915)) ^ 1629236673;
                        i8 = 1617760964;
                    }
                    break;
                case 1125737314:
                case 1792207337:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("᩵ۜ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-13933)) ^ (-896118208);
                        i8 = -1765697512;
                    } else {
                        iM2761 = C0773.m3169("᩵ۙ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 10193) ^ 2119891886;
                        i8 = -1571768326;
                    }
                    break;
                case 1750803465:
                case 1990662632:
                    C2023.m6964();
                    throw new RuntimeException();
                default:
                    C3077.m10041();
                    if (C0950.m3785() == 0) {
                        iM2761 = C0619.m2761("֡᩵") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-22383)) ^ 484674399;
                        i8 = 1063512185;
                    } else {
                        iM2761 = (C0619.m2761("ۧ᩻") ^ i6) * 7;
                        i7 = ((iM2761 ^ i5) * (-2101)) ^ 1775201859;
                        i8 = -1665798573;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008f A[PHI: r14 r15
      0x008f: PHI (r14v3 short[]) = (r14v2 short[]), (r14v1 short[]) binds: [B:21:0x008d, B:8:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r15v3 int) = (r15v2 int), (r15v1 int) binds: [B:21:0x008d, B:8:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01e0 A[PHI: r7
      0x01e0: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:55:0x01de, B:11:0x005a, B:8:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x024b A[PHI: r3 r12 r13 r20 r21
      0x024b: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v1 java.lang.String), (r3v2 java.lang.String), (r3v1 java.lang.String) binds: [B:63:0x0249, B:33:0x0112, B:29:0x00ed, B:25:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r12v3 short[]) = (r12v1 short[]), (r12v2 short[]), (r12v1 short[]), (r12v1 short[]) binds: [B:63:0x0249, B:33:0x0112, B:29:0x00ed, B:25:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:63:0x0249, B:33:0x0112, B:29:0x00ed, B:25:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:63:0x0249, B:33:0x0112, B:29:0x00ed, B:25:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r21v3 char) = (r21v2 char), (r21v1 char), (r21v1 char), (r21v1 char) binds: [B:63:0x0249, B:33:0x0112, B:29:0x00ed, B:25:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        int iM3169;
        int i;
        int i2;
        Runnable runnable = null;
        String strM11809 = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = -1068175257;
        int i11 = C2375.f7641;
        int i12 = C0487.f2131;
        int iM31610 = C0773.m3169("ۤ᩻") ^ i11;
        int i13 = ((iM31610 ^ i12) * (-11289)) ^ 528219079;
        int i14 = iM31610 ^ 586111549;
        short[] sArr3 = null;
        C10745 c10745 = null;
        char c = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 24885) >> 31));
            switch (i10) {
                case -1704798384:
                case 1445985470:
                    C2485.m8357();
                    break;
                case -1651602480:
                case -902030391:
                    int i15 = i5 + i6;
                    if (i4 - (i15 + i15) <= 0) {
                        iM3169 = (i12 - C0619.m2761("᩶ܶ")) * (-119);
                        i = ((iM3169 ^ i11) * 15251) ^ 207141521;
                        i2 = 1699374458;
                    } else {
                        iM3169 = (i11 - C0773.m3169("᩻ۜ")) * (-45);
                        i = ((iM3169 ^ i12) * 13479) ^ (-44953351);
                        i2 = 1669266708;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1591133313:
                case 1927991781:
                    c10745.mo25916(runnable);
                    sArr = f29325;
                    i8 = 18;
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("۠ۗ") ^ i11) * (-75);
                        i = ((iM3169 ^ i12) * 2401) ^ (-1237856862);
                        i2 = 1000982125;
                    } else {
                        iM3169 = C0773.m3169("ۚ۟") ^ i12;
                        i = ((iM3169 ^ i11) * 19587) ^ (-2085635549);
                        i2 = 1126345191;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1530148161:
                case 998337551:
                    C3690.m11987();
                    int iM2761 = (C0619.m2761("֨֨") + i11) * (-51);
                    i14 = iM2761 ^ (-508845989);
                    i13 = ((iM2761 ^ i12) * 22463) ^ (-1355811027);
                    c10745 = null;
                    break;
                case -1485796115:
                case -576481874:
                    s = sArr3[c];
                    if (C3734.m12152() < 0) {
                        iM3169 = C0619.m2761("۫۫") ^ i12;
                        i = ((iM3169 ^ i11) * (-1289)) ^ (-581905052);
                        i2 = -572215110;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    } else {
                        int iM2762 = (C0619.m2761("֨֨") + i11) * (-51);
                        i14 = iM2762 ^ (-508845989);
                        i13 = ((iM2762 ^ i12) * 22463) ^ (-1355811027);
                        c10745 = null;
                    }
                    break;
                case -1105954708:
                case 1827491469:
                    RunnableC1848.m6360();
                    if (AbstractC0116.f1064 > 0) {
                        iM3169 = (i12 - C0619.m2761("ܺۨ")) * (-39);
                        i = ((iM3169 ^ i11) * (-14221)) ^ (-36343223);
                        i2 = -919956699;
                    } else {
                        iM3169 = C0773.m3169("ܽۜ") ^ i12;
                        i = ((iM3169 ^ i11) * (-3963)) ^ (-223274179);
                        i2 = 301496097;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1001479375:
                case -852115257:
                    i4 = i3 * i3;
                    i5 = s * s;
                    i6 = 145684900;
                    if (!C3077.f9998) {
                        int iM2763 = (C0619.m2761("֨֨") + i11) * (-51);
                        i14 = iM2763 ^ (-508845989);
                        i13 = ((iM2763 ^ i12) * 22463) ^ (-1355811027);
                        c10745 = null;
                    } else {
                        iM3169 = C0773.m3169("ۡۡ") ^ i12;
                        i = ((iM3169 ^ i11) * 11977) ^ (-293455856);
                        i2 = -582123279;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    }
                    break;
                case -896193854:
                case 72844113:
                    i3 = s + 12070;
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("ܽۜ") ^ i12;
                        i = ((iM3169 ^ i11) * (-3963)) ^ (-223274179);
                        i2 = 301496097;
                    } else {
                        iM3169 = C0619.m2761("ۢۡ") ^ i11;
                        i = ((iM3169 ^ i12) * (-19023)) ^ (-1410173432);
                        i2 = -1175746431;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -673462733:
                case 721872182:
                    sArr2 = f29325;
                    i9 = 21;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ܶۜ") ^ i11) * (-57);
                        i = ((iM3169 ^ i12) * (-13327)) ^ (-858411760);
                        i2 = 1147989877;
                    } else {
                        iM3169 = C0619.m2761("᩹ܰ") ^ i11;
                        i = ((iM3169 ^ i12) * (-17755)) ^ 20820929;
                        i2 = 359740695;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -109611253:
                case 1746299159:
                    C1321.m4852();
                    if (C0269.f1558 > 0) {
                        iM3169 = C0773.m3169("ܽۜ") ^ i12;
                        i = ((iM3169 ^ i11) * (-3963)) ^ (-223274179);
                        i2 = 301496097;
                    } else {
                        iM3169 = (C0773.m3169("ܶۜ") ^ i11) * (-57);
                        i = ((iM3169 ^ i12) * (-13327)) ^ (-858411760);
                        i2 = 1147989877;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -91947307:
                case 478280814:
                    Main mainM9939 = RunnableC3055.m9939(this.f29329.f27190);
                    if (C20932.f66974 > 0) {
                        c10745 = new C10745(mainM9939);
                        runnable = null;
                        if (AbstractC0116.f1064 > 0) {
                            iM3169 = C0773.m3169("ᩳۗ") ^ i11;
                            i = ((iM3169 ^ i12) * 18117) ^ 674300771;
                            i2 = 104300376;
                            i14 = iM3169 ^ i2;
                            i13 = i;
                            break;
                        }
                    }
                    int iM2764 = (C0619.m2761("֨֨") + i11) * (-51);
                    i14 = iM2764 ^ (-508845989);
                    i13 = ((iM2764 ^ i12) * 22463) ^ (-1355811027);
                    c10745 = null;
                    break;
                case 109696774:
                case 586717421:
                    C11235.m28309();
                    if (C2966.f9654 < 0) {
                        iM3169 = (i12 - C0619.m2761("ܺۨ")) * (-39);
                        i = ((iM3169 ^ i11) * (-14221)) ^ (-36343223);
                        i2 = -919956699;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                    } else {
                        int iM2765 = (C0619.m2761("֨֨") + i11) * (-51);
                        i14 = iM2765 ^ (-508845989);
                        i13 = ((iM2765 ^ i12) * 22463) ^ (-1355811027);
                        c10745 = null;
                    }
                    break;
                case 370121404:
                case 535074965:
                    i7 = 55935;
                    iM3169 = (i12 - C0773.m3169("ܽܶ")) * 53;
                    i = ((iM3169 ^ i11) * (-3839)) ^ (-1864474231);
                    i2 = -960349915;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 789009909:
                case 1414739386:
                    strM11809 = RunnableC3646.m11809(sArr, i8, 3, i7);
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("۠ۗ") ^ i11) * (-75);
                        i = ((iM3169 ^ i12) * 2401) ^ (-1237856862);
                        i2 = 1000982125;
                    } else {
                        iM3169 = (C0619.m2761("ܺ᩶") ^ i11) * (-71);
                        i = ((iM3169 ^ i12) * (-18575)) ^ 1374037638;
                        i2 = -923611041;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 1109709553:
                case 1589488834:
                    c10745.m27397(C0619.m2761(strM11809) ^ 2122477032);
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("۠ۗ") ^ i11) * (-75);
                        i = ((iM3169 ^ i12) * 2401) ^ (-1237856862);
                        i2 = 1000982125;
                    } else {
                        iM3169 = (C0773.m3169("ܿۙ") ^ i12) * 37;
                        i = ((iM3169 ^ i11) * 12725) ^ 198884522;
                        i2 = -1263015911;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 1446067795:
                case 1619494126:
                    sArr3 = f29325;
                    c = 17;
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0619.m2761("۠ۗ") ^ i11) * (-75);
                        i = ((iM3169 ^ i12) * 2401) ^ (-1237856862);
                        i2 = 1000982125;
                    } else {
                        iM3169 = (C0773.m3169("۠ۢ") + i11) * 39;
                        i = ((iM3169 ^ i12) * 14759) ^ 603067104;
                        i2 = 1769647696;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 1453065792:
                case 2123561250:
                    i7 = 23980;
                    iM3169 = (i12 - C0773.m3169("ܽܶ")) * 53;
                    i = ((iM3169 ^ i11) * (-3839)) ^ (-1864474231);
                    i2 = -960349915;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                default:
                    c10745.m27393(C3998.m12925(sArr2, i9, 3, i7));
                    c10745.mo25931();
                    this.f29334 = c10745;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 28401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        /*
            Method dump skipped, instruction units count: 2840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9006.mo1136():void");
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int iM2761;
        int i;
        int iM2762;
        int i2;
        int i3;
        C17539 c17539;
        C9006 c9006 = this;
        Main mainM9939 = null;
        int i4 = 0;
        Integer numM3159 = null;
        Integer numM2764 = null;
        int i5 = 0;
        Object[] objArr = null;
        boolean z = false;
        String strM12148 = null;
        String strM3780 = null;
        int i6 = -717863051;
        int i7 = C3492.f12043;
        int i8 = C1080.f3865;
        int iM2763 = C0619.m2761("۟ۜ") ^ i7;
        int i9 = ((iM2763 ^ i8) * 12779) ^ 1764872939;
        int i10 = iM2763 ^ 355755161;
        C17539 c175310 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        ViewOnClickListenerC8261 viewOnClickListenerC8261 = null;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i8) * (-9261)) >> 31));
            switch (i6) {
                case -1962729423:
                case -865340973:
                    strM12148 = C3734.m12148(C0619.m2761(C3099.m10092(sArr2, i12, i13, i11)) ^ 2121917047, objArr);
                    if (C3779.f12953 > 0) {
                        iM2762 = C0773.m3169("᩵᩷") ^ i8;
                        i2 = ((iM2762 ^ i7) * (-151)) ^ (-2072219928);
                        i3 = -625971494;
                        i10 = iM2762 ^ i3;
                        i9 = i2;
                    } else {
                        c175310 = c175310;
                        iM2761 = C0619.m2761("ᩴ᩷") ^ i8;
                        i9 = ((iM2761 ^ i7) * 237) ^ 476479473;
                        i = -1721378543;
                        i10 = iM2761 ^ i;
                        c9006 = this;
                        c175310 = c175310;
                    }
                    break;
                case -1730496315:
                case -428966277:
                    C17539 c175311 = c9006.f29333;
                    i4 = c175311.f57015;
                    if (C1542.f5343 <= 0) {
                        c175310 = c175311;
                        iM2762 = C0619.m2761("۫᩺") ^ i8;
                        i2 = ((iM2762 ^ i7) * 4113) ^ 1899892881;
                        i3 = -191918021;
                        i10 = iM2762 ^ i3;
                        i9 = i2;
                    } else {
                        int iM2764 = C0619.m2761("ۡܿ") ^ i8;
                        i9 = ((iM2764 ^ i7) * 29617) ^ (-1113154316);
                        c175310 = c175311;
                        i10 = iM2764 ^ 550540562;
                    }
                    break;
                case -1688361507:
                case 323958440:
                    if (C20932.m47848() == 0) {
                        c175310 = c175310;
                        iM2761 = C0619.m2761("ᩴ᩷") ^ i8;
                        i9 = ((iM2761 ^ i7) * 237) ^ 476479473;
                        i = -1721378543;
                        i10 = iM2761 ^ i;
                        c9006 = this;
                        c175310 = c175310;
                    } else {
                        c17539 = c175310;
                        int iM2765 = (C0619.m2761("ᩳ۬") + i7) * (-121);
                        i10 = iM2765 ^ 1864394931;
                        i9 = ((iM2765 ^ i8) * 7417) ^ (-280521378);
                        c175310 = c17539;
                        c9006 = this;
                    }
                    break;
                case -1518424686:
                case -1016494132:
                    AbstractC0641.m2813();
                    C3690.m11987();
                    c17539 = c175310;
                    int iM2766 = (C0619.m2761("ᩳ۬") + i7) * (-121);
                    i10 = iM2766 ^ 1864394931;
                    i9 = ((iM2766 ^ i8) * 7417) ^ (-280521378);
                    c175310 = c17539;
                    c9006 = this;
                    break;
                case -1439404469:
                case 2119150214:
                    i11 = 23582;
                    iM2761 = (i8 - C0773.m3169("֡۬")) * 31;
                    i9 = ((iM2761 ^ i7) * (-25503)) ^ 314943469;
                    i = -1638296785;
                    i10 = iM2761 ^ i;
                    c9006 = this;
                    c175310 = c175310;
                    break;
                case -1428722497:
                case 337110536:
                    C0773.m3163(viewOnClickListenerC8261.f27190, C1826.m6311(c9006.f29335));
                    break;
                case -1115064245:
                case 253173004:
                    c17539 = c175310;
                    ViewOnClickListenerC8261 viewOnClickListenerC8262 = c9006.f29329;
                    mainM9939 = RunnableC3055.m9939(viewOnClickListenerC8262.f27190);
                    if (C3077.f9998) {
                        int iM3169 = (C0773.m3169("۬ܰ") + i7) * 83;
                        i9 = ((iM3169 ^ i8) * (-6129)) ^ (-2086156753);
                        c175310 = c17539;
                        viewOnClickListenerC8261 = viewOnClickListenerC8262;
                        i10 = iM3169 ^ (-1621965364);
                    } else {
                        viewOnClickListenerC8261 = viewOnClickListenerC8262;
                        int iM2767 = (C0619.m2761("ᩳ۬") + i7) * (-121);
                        i10 = iM2767 ^ 1864394931;
                        i9 = ((iM2767 ^ i8) * 7417) ^ (-280521378);
                        c175310 = c17539;
                    }
                    c9006 = this;
                    break;
                case -1069396174:
                case 113386381:
                    c175310 = c175310;
                    sArr = f29325;
                    c = 0;
                    if (C3779.f12953 <= 0) {
                        iM2761 = (i7 - C0619.m2761("ۙۙ")) * (-127);
                        i9 = ((iM2761 ^ i8) * (-14719)) ^ (-1689139169);
                        i = -629314843;
                    } else {
                        iM2761 = C0619.m2761("ۖۙ") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-20743)) ^ 1198503089;
                        i = 853450741;
                    }
                    i10 = iM2761 ^ i;
                    c9006 = this;
                    c175310 = c175310;
                    break;
                case -1015146083:
                case -483968115:
                    i11 = 38272;
                    iM2761 = (i8 - C0773.m3169("֡۬")) * 31;
                    i9 = ((iM2761 ^ i7) * (-25503)) ^ 314943469;
                    i = -1638296785;
                    i10 = iM2761 ^ i;
                    c9006 = this;
                    c175310 = c175310;
                    break;
                case -940218922:
                case -749825450:
                    sArr2 = f29325;
                    i12 = 1;
                    i13 = 3;
                    if (C2419.f7754 >= 0) {
                        iM2762 = (C0773.m3169("᩶ܰ") + i7) * (-73);
                        i2 = ((iM2762 ^ i8) * (-14457)) ^ (-896549714);
                        i3 = -694357704;
                    } else {
                        iM2762 = (C0773.m3169("ۘܿ") + i8) * (-71);
                        i2 = ((iM2762 ^ i7) * 25211) ^ (-2110830776);
                        i3 = -368378428;
                    }
                    i10 = iM2762 ^ i3;
                    i9 = i2;
                    break;
                case -846019542:
                case 991223111:
                    objArr = new Object[i5];
                    z = false;
                    objArr[0] = numM3159;
                    objArr[1] = numM2764;
                    if (C3448.f11240 < 0) {
                        iM2762 = (i7 - C0619.m2761("᩶ܺ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM2762 ^ i8) * 9323) ^ 1188928705;
                        i3 = 1634879805;
                        i10 = iM2762 ^ i3;
                        i9 = i2;
                    } else {
                        c175310 = c175310;
                        iM2761 = C0619.m2761("ᩴ᩷") ^ i8;
                        i9 = ((iM2761 ^ i7) * 237) ^ 476479473;
                        i = -1721378543;
                        i10 = iM2761 ^ i;
                        c9006 = this;
                        c175310 = c175310;
                    }
                    break;
                case -519578937:
                case -120637258:
                    mainM9939.m40397(C0773.m3169(strM3780) ^ 2128756953, strM12148, z);
                    if (C3998.f13671 != 0) {
                        iM2762 = C0619.m2761("۫᩺") ^ i8;
                        i2 = ((iM2762 ^ i7) * 4113) ^ 1899892881;
                        i3 = -191918021;
                    } else {
                        iM2762 = C0773.m3169("ܳۡ") ^ i8;
                        i2 = ((iM2762 ^ i7) * (-793)) ^ 128428254;
                        i3 = 1907481689;
                    }
                    i10 = iM2762 ^ i3;
                    i9 = i2;
                    break;
                case -506888995:
                case -317671979:
                    C4282.m13644();
                    C11235.m28309();
                    break;
                case -420122780:
                case 1882422410:
                    c175310 = c175310;
                    if (((s * s) + 85525504) - (s * s2) >= 0) {
                        iM2761 = (C0773.m3169("ۗ᩶") ^ i7) * (-73);
                        i9 = ((iM2761 ^ i8) * 17129) ^ (-841048494);
                        i = -1382125161;
                    } else {
                        iM2761 = (i8 - C0773.m3169("ۘ᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i9 = ((iM2761 ^ i7) * 29839) ^ 2003485073;
                        i = 998464683;
                    }
                    i10 = iM2761 ^ i;
                    c9006 = this;
                    c175310 = c175310;
                    break;
                case -373812258:
                case 1081057469:
                    c175310 = c175310;
                    s = sArr[c];
                    s2 = 18496;
                    if (C17202.f56030) {
                        iM2761 = C0619.m2761("᩶ۢ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-19227)) ^ 369153871;
                        i = 1673976687;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩷") ^ i8;
                        i9 = ((iM2761 ^ i7) * 237) ^ 476479473;
                        i = -1721378543;
                    }
                    i10 = iM2761 ^ i;
                    c9006 = this;
                    c175310 = c175310;
                    break;
                case -285771919:
                case 1107345786:
                    if (AbstractC0116.f1064 > 0) {
                        iM2762 = C0619.m2761("۫᩺") ^ i8;
                        i2 = ((iM2762 ^ i7) * 4113) ^ 1899892881;
                        i3 = -191918021;
                        i10 = iM2762 ^ i3;
                        i9 = i2;
                    } else {
                        c175310 = c175310;
                        iM2761 = (i7 - C0619.m2761("ۙۙ")) * (-127);
                        i9 = ((iM2761 ^ i8) * (-14719)) ^ (-1689139169);
                        i = -629314843;
                        i10 = iM2761 ^ i;
                        c9006 = this;
                        c175310 = c175310;
                    }
                    break;
                case -71950460:
                case 599566303:
                    numM3159 = C0773.m3159(i4);
                    C17539 c175312 = c175310;
                    numM2764 = C0619.m2764(c175312.f57014);
                    if (C0950.m3785() != 0) {
                        c175310 = c175312;
                        i5 = 2;
                        iM2762 = C0619.m2761("۫᩺") ^ i8;
                        i2 = ((iM2762 ^ i7) * 4113) ^ 1899892881;
                        i3 = -191918021;
                        i10 = iM2762 ^ i3;
                        i9 = i2;
                    } else {
                        int iM2768 = (C0619.m2761("ۡᩴ") ^ i7) * 89;
                        i10 = iM2768 ^ (-876939219);
                        c175310 = c175312;
                        i9 = ((iM2768 ^ i8) * 6059) ^ (-1211904837);
                        i5 = 2;
                    }
                    break;
                case 30766736:
                case 894815939:
                    strM3780 = C0950.m3780(f29325, 4, 3, i11);
                    if (AbstractC0641.f2496 < 0) {
                        iM2762 = C0619.m2761("۟ۢ") ^ i7;
                        i2 = ((iM2762 ^ i8) * 13039) ^ 2016451183;
                        i3 = -219046419;
                        i10 = iM2762 ^ i3;
                        i9 = i2;
                    } else {
                        c175310 = c175310;
                        iM2761 = C0619.m2761("ᩴ᩷") ^ i8;
                        i9 = ((iM2761 ^ i7) * 237) ^ 476479473;
                        i = -1721378543;
                        i10 = iM2761 ^ i;
                        c9006 = this;
                        c175310 = c175310;
                    }
                    break;
                default:
                    C2878.m9491();
                    if (C2375.f7641 > 0) {
                        c175310 = c175310;
                        iM2761 = (i7 - C0619.m2761("ۙۙ")) * (-127);
                        i9 = ((iM2761 ^ i8) * (-14719)) ^ (-1689139169);
                        i = -629314843;
                        i10 = iM2761 ^ i;
                        c9006 = this;
                        c175310 = c175310;
                    } else {
                        c17539 = c175310;
                        int iM2769 = (C0619.m2761("ᩳ۬") + i7) * (-121);
                        i10 = iM2769 ^ 1864394931;
                        i9 = ((iM2769 ^ i8) * 7417) ^ (-280521378);
                        c175310 = c17539;
                        c9006 = this;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        int iM2761;
        int i;
        int iM3169;
        int i2;
        int i3;
        int iM2762;
        C2295 c2295;
        int i4;
        int i5;
        C9006 c9006 = this;
        Object obj = null;
        C2295 c2296 = null;
        C2361 c2361M13539 = null;
        Button buttonM1782 = null;
        int iM2763 = 0;
        int i6 = 0;
        String strM7980 = null;
        int iM2764 = 0;
        int i7 = 0;
        int i8 = 956830608;
        int i9 = C0950.f3488;
        int i10 = C1542.f5343;
        int iM31610 = (i9 - C0773.m3169("ܽۢ")) * 7;
        int i11 = ((iM31610 ^ i10) * 31421) ^ (-655442557);
        int i12 = iM31610 ^ 201648947;
        short[] sArr = null;
        short[] sArr2 = null;
        int i13 = 0;
        char c = 0;
        short s = 0;
        int i14 = 0;
        ViewOnClickListenerC8261 viewOnClickListenerC8261 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        while (true) {
            i8 = i12 ^ ((((i8 ^ i10) * 2659) >> 31) & i11);
            switch (i8) {
                case -2075117155:
                case 670509565:
                    C0773.m3161();
                    C2878.m9491();
                    break;
                case -1957279711:
                case 1513023853:
                    iM2764 = C0619.m2761(C3492.m11486(sArr2, 14, 3, i7));
                    if (C0862.f3233 == 0) {
                        iM2761 = C0619.m2761("۫ܰ") ^ i9;
                        i11 = ((iM2761 ^ i10) * (-29603)) ^ (-1894165357);
                        i = -289423653;
                        i12 = iM2761 ^ i;
                    } else {
                        iM2762 = (C0773.m3169("ۤܶ") ^ i9) * 99;
                        c2295 = c2296;
                        i4 = ((iM2762 ^ i10) * (-29951)) ^ (-97177148);
                        i5 = 1212788936;
                        C2295 c2297 = c2295;
                        i12 = iM2762 ^ i5;
                        i11 = i4;
                        c2296 = c2297;
                    }
                    break;
                case -1903676863:
                case -364293480:
                    C13473.m33136(c2361M13539, iM2763 ^ i6);
                    C1519.m5410(c2361M13539, C3779.m12261(c2296));
                    sArr = f29325;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0619.m2761("᩸ۘ") ^ i10) * 97;
                        i11 = ((iM2761 ^ i9) * (-9241)) ^ (-1582885465);
                        i = -1736272822;
                    } else {
                        iM2761 = (C0619.m2761("۟ۚ") + i10) * (-111);
                        i11 = ((iM2761 ^ i9) * (-9775)) ^ (-551167804);
                        i = 1181342171;
                    }
                    i12 = iM2761 ^ i;
                    break;
                case -1446444413:
                case 513487973:
                    boolean z = exc instanceof C2295;
                    ViewOnClickListenerC8261 viewOnClickListenerC8262 = c9006.f29329;
                    if (z) {
                        int iM31611 = (i10 - C0773.m3169("ۤܰ")) * (-19);
                        i3 = ((iM31611 ^ i9) * 31197) ^ 1978093037;
                        viewOnClickListenerC8261 = viewOnClickListenerC8262;
                        obj = null;
                        i12 = iM31611 ^ (-1341725892);
                        i11 = i3;
                    } else {
                        int iM2765 = C0619.m2761("۬᩺") ^ i10;
                        i11 = ((iM2765 ^ i9) * 9779) ^ 1136494776;
                        viewOnClickListenerC8261 = viewOnClickListenerC8262;
                        obj = null;
                        i12 = iM2765 ^ 2834014;
                    }
                    c9006 = this;
                    break;
                case -1379296972:
                case 1864146545:
                    iM2763 = C0619.m2761(C0773.m3166(sArr4, i13, 3, i7));
                    i6 = 2098489285;
                    if (!C17202.f56030) {
                        iM2762 = (C0773.m3169("ۤܶ") ^ i9) * 99;
                        c2295 = c2296;
                        i4 = ((iM2762 ^ i10) * (-29951)) ^ (-97177148);
                        i5 = 1212788936;
                        C2295 c2298 = c2295;
                        i12 = iM2762 ^ i5;
                        i11 = i4;
                        c2296 = c2298;
                    } else {
                        iM2761 = (C0619.m2761("᩶ᩴ") + i10) * (-51);
                        i11 = ((iM2761 ^ i9) * 19751) ^ (-941819845);
                        i = -296340189;
                        i12 = iM2761 ^ i;
                    }
                    break;
                case -1086459521:
                case -153973621:
                    RunnableC1848.m6360();
                    if (C3099.f10023 <= 0) {
                        iM2762 = (C0773.m3169("ۤܶ") ^ i9) * 99;
                        c2295 = c2296;
                        i4 = ((iM2762 ^ i10) * (-29951)) ^ (-97177148);
                        i5 = 1212788936;
                        C2295 c2299 = c2295;
                        i12 = iM2762 ^ i5;
                        i11 = i4;
                        c2296 = c2299;
                    } else {
                        iM3169 = (i9 - C0619.m2761("᩸ᩴ")) * (-5);
                        i11 = ((iM3169 ^ i10) * (-8885)) ^ (-44252684);
                        i2 = 734115309;
                        i12 = iM3169 ^ i2;
                        c9006 = this;
                    }
                    break;
                case -935983359:
                case 1443079046:
                    C3779.m12264();
                    iM3169 = (i9 - C0619.m2761("᩸ᩴ")) * (-5);
                    i11 = ((iM3169 ^ i10) * (-8885)) ^ (-44252684);
                    i2 = 734115309;
                    i12 = iM3169 ^ i2;
                    c9006 = this;
                    break;
                case -730193724:
                case 339828386:
                    C11235.m28299(buttonM1782, new ViewOnClickListenerC24932(1, c9006, c2296));
                    break;
                case -148573336:
                case 187391241:
                    C1519.m5403();
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("᩸ۘ") ^ i10) * 97;
                        i11 = ((iM2761 ^ i9) * (-9241)) ^ (-1582885465);
                        i = -1736272822;
                        i12 = iM2761 ^ i;
                    } else {
                        iM3169 = (i9 - C0619.m2761("᩸ᩴ")) * (-5);
                        i11 = ((iM3169 ^ i10) * (-8885)) ^ (-44252684);
                        i2 = 734115309;
                        i12 = iM3169 ^ i2;
                        c9006 = this;
                    }
                    break;
                case 234710002:
                case 667134324:
                    int i15 = (s * s) + 125037124;
                    if ((i14 * i14) - (i15 + i15) > 0) {
                        iM3169 = C0773.m3169("۫۠") ^ i10;
                        i11 = ((iM3169 ^ i9) * 26949) ^ 1027108889;
                        i2 = 753756429;
                    } else {
                        iM3169 = C0619.m2761("᩹۟") ^ i9;
                        i11 = ((iM3169 ^ i10) * 15065) ^ 1474798300;
                        i2 = -134017418;
                    }
                    i12 = iM3169 ^ i2;
                    c9006 = this;
                    break;
                case 246433960:
                case 774775650:
                    sArr3 = f29325;
                    c = 7;
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0619.m2761("᩺᩸") + i9) * (-105);
                        i11 = ((iM3169 ^ i10) * (-7249)) ^ (-531270313);
                        i2 = -152520049;
                    } else {
                        iM3169 = C0773.m3169("֡᩷") ^ i9;
                        i11 = ((iM3169 ^ i10) * 14603) ^ 1496986186;
                        i2 = -245377818;
                    }
                    i12 = iM3169 ^ i2;
                    c9006 = this;
                    break;
                case 255874864:
                case 2039805266:
                    C11235.m28307(c2361M13539, 2125445439 ^ iM2764, obj);
                    buttonM1782 = C0269.m1782(C3099.m10090(c2361M13539));
                    if (C3448.f11240 < 0) {
                        iM2761 = (i10 - C0773.m3169("ܶ᩹")) * (-53);
                        i11 = ((iM2761 ^ i9) * (-10693)) ^ (-1584563917);
                        i = 445438279;
                        i12 = iM2761 ^ i;
                    } else {
                        iM2762 = (C0773.m3169("ۤܶ") ^ i9) * 99;
                        c2295 = c2296;
                        i4 = ((iM2762 ^ i10) * (-29951)) ^ (-97177148);
                        i5 = 1212788936;
                        C2295 c22910 = c2295;
                        i12 = iM2762 ^ i5;
                        i11 = i4;
                        c2296 = c22910;
                    }
                    break;
                case 366420708:
                case 1718913596:
                    short s2 = sArr3[c];
                    int i16 = s2 + 11182;
                    if (C3998.f13671 == 0) {
                        int iM2766 = (C0619.m2761("᩺᩺") + i10) * 87;
                        i3 = ((iM2766 ^ i9) * (-7431)) ^ 844684382;
                        i12 = iM2766 ^ (-56271290);
                        s = s2;
                        i14 = i16;
                        i11 = i3;
                        c9006 = this;
                    } else {
                        s = s2;
                        i14 = i16;
                        iM3169 = (i9 - C0619.m2761("᩸ᩴ")) * (-5);
                        i11 = ((iM3169 ^ i10) * (-8885)) ^ (-44252684);
                        i2 = 734115309;
                        i12 = iM3169 ^ i2;
                        c9006 = this;
                    }
                    break;
                case 629763716:
                case 1703703668:
                    i7 = 64114;
                    iM3169 = (C0619.m2761("۬ۛ") + i9) * 91;
                    i11 = ((iM3169 ^ i10) * 30961) ^ (-96315645);
                    i2 = 352590490;
                    i12 = iM3169 ^ i2;
                    c9006 = this;
                    break;
                case 935474070:
                case 1865130972:
                    i7 = 63554;
                    iM3169 = (C0619.m2761("۬ۛ") + i9) * 91;
                    i11 = ((iM3169 ^ i10) * 30961) ^ (-96315645);
                    i2 = 352590490;
                    i12 = iM3169 ^ i2;
                    c9006 = this;
                    break;
                case 1036647644:
                case 1950535725:
                    c2296 = (C2295) exc;
                    c2361M13539 = C4238.m13539(RunnableC3055.m9939(viewOnClickListenerC8261.f27190));
                    if (C2966.f9654 >= 0) {
                        iM2762 = (C0773.m3169("ۤܶ") ^ i9) * 99;
                        c2295 = c2296;
                        i4 = ((iM2762 ^ i10) * (-29951)) ^ (-97177148);
                        i5 = 1212788936;
                    } else {
                        iM2762 = (C0619.m2761("᩻ۜ") ^ i9) * 81;
                        c2295 = c2296;
                        i4 = ((iM2762 ^ i10) * 24027) ^ (-1903429609);
                        i5 = -1084850642;
                    }
                    C2295 c22911 = c2295;
                    i12 = iM2762 ^ i5;
                    i11 = i4;
                    c2296 = c22911;
                    break;
                case 1037513504:
                case 1039642866:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0619.m2761("᩺᩸") + i9) * (-105);
                        i11 = ((iM3169 ^ i10) * (-7249)) ^ (-531270313);
                        i2 = -152520049;
                        i12 = iM3169 ^ i2;
                        c9006 = this;
                    }
                    iM3169 = (i9 - C0619.m2761("᩸ᩴ")) * (-5);
                    i11 = ((iM3169 ^ i10) * (-8885)) ^ (-44252684);
                    i2 = 734115309;
                    i12 = iM3169 ^ i2;
                    c9006 = this;
                    break;
                case 1229590396:
                case 1465703438:
                    RunnableC3055.m9930(AbstractC0641.m2816(viewOnClickListenerC8261.f27190), exc, obj);
                    break;
                case 1305042191:
                case 1820948947:
                    sArr4 = f29325;
                    i13 = 8;
                    if (!C1519.m5403()) {
                        iM2762 = (C0773.m3169("ۤܶ") ^ i9) * 99;
                        c2295 = c2296;
                        i4 = ((iM2762 ^ i10) * (-29951)) ^ (-97177148);
                        i5 = 1212788936;
                        C2295 c22912 = c2295;
                        i12 = iM2762 ^ i5;
                        i11 = i4;
                        c2296 = c22912;
                    } else {
                        iM2761 = C0773.m3169("֫ۘ") ^ i9;
                        i11 = ((iM2761 ^ i10) * 18277) ^ (-1257982492);
                        i = 987937173;
                        i12 = iM2761 ^ i;
                    }
                    break;
                case 1750565164:
                case 2134432291:
                    strM7980 = C2354.m7980(sArr, 11, 3, i7);
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0773.m3169("۬۟") + i10) * (-73);
                        i11 = ((iM2761 ^ i9) * 4029) ^ (-329326139);
                        i = -466386654;
                    } else {
                        iM2761 = C0619.m2761("ܽۧ") ^ i9;
                        i11 = ((iM2761 ^ i10) * 15041) ^ (-375077583);
                        i = -1601500473;
                    }
                    i12 = iM2761 ^ i;
                    break;
                default:
                    C3492.m11487(c2361M13539, C0773.m3169(strM7980) ^ 2129448731, obj);
                    sArr2 = f29325;
                    if (C3690.f12684 > 0) {
                        iM2761 = (C0619.m2761("ܿ᩻") + i10) * (-67);
                        i11 = ((iM2761 ^ i9) * (-24681)) ^ 731948304;
                        i = 1082045449;
                        i12 = iM2761 ^ i;
                    } else {
                        iM3169 = (i9 - C0619.m2761("᩸ᩴ")) * (-5);
                        i11 = ((iM3169 ^ i10) * (-8885)) ^ (-44252684);
                        i2 = 734115309;
                        i12 = iM3169 ^ i2;
                        c9006 = this;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C10745 c10745 = null;
        AbstractC22044 abstractC22044 = null;
        AbstractC22044 abstractC22045 = null;
        int i = -861052891;
        int i2 = C3690.f12684;
        int i3 = C4282.f15546;
        int iM2761 = C0619.m2761("۫ᩴ") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-3389)) ^ (-1460482510);
        int i5 = 1700328525;
        while (true) {
            i = ((((i ^ i3) * 30505) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2083936819:
                case -1606655638:
                    if (C3077.m10041()) {
                        iM2761 = (C0773.m3169("۠᩶") + i2) * (-55);
                        i4 = ((iM2761 ^ i3) * 20329) ^ 1722220632;
                        i5 = 196123789;
                    } else {
                        iM2761 = C0773.m3169("ܰۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22675)) ^ (-810525665);
                        i5 = 880096437;
                    }
                    break;
                case -1977739281:
                case -941348459:
                    C0950.m3785();
                    iM2761 = C0773.m3169("ۚܿ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 28833) ^ 1620735234;
                    i5 = -551286616;
                    break;
                case -1783310417:
                case 756060940:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("ۨܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 649) ^ (-120362017);
                        i5 = -115886659;
                    } else {
                        iM2761 = C0773.m3169("ᩴ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6071)) ^ (-210332935);
                        i5 = -564368077;
                    }
                    break;
                case -1698034529:
                case -432497842:
                    abstractC22044 = this.f29328;
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0773.m3169("۠᩶") + i2) * (-55);
                        i4 = ((iM2761 ^ i3) * 20329) ^ 1722220632;
                        i5 = 196123789;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܶ۠")) * 29;
                        i4 = ((iM2761 ^ i2) * 26273) ^ 411824761;
                        i5 = 298044300;
                    }
                    break;
                case -1687683156:
                case -612521847:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("ۢۘ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i3) * 395) ^ 636226648;
                        i5 = 1786644854;
                    } else {
                        iM2761 = C0773.m3169("۟ۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2619)) ^ 1990931600;
                        i5 = 162789371;
                    }
                    break;
                case -1623039473:
                case 176590948:
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0773.m3169("۠᩶") + i2) * (-55);
                        i4 = ((iM2761 ^ i3) * 20329) ^ 1722220632;
                        i5 = 196123789;
                    } else {
                        iM2761 = (C0773.m3169("ܿۢ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i2) * (-7775)) ^ 1714663665;
                        i5 = -1729711789;
                    }
                    break;
                case -1466143189:
                case 1158135018:
                    C17202.m40378(abstractC22045);
                    iM2761 = (C0619.m2761("ۡܽ") + i2) * 101;
                    i4 = ((iM2761 ^ i3) * (-7567)) ^ 1123388109;
                    i5 = 358683217;
                    break;
                case -1423969648:
                case 204708921:
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0619.m2761("ܽۗ") + i3) * 83;
                        i4 = ((iM2761 ^ i2) * (-25505)) ^ 1985489104;
                        i5 = 243087393;
                    } else {
                        iM2761 = C0773.m3169("ۚܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28833) ^ 1620735234;
                        i5 = -551286616;
                    }
                    break;
                case -1263651865:
                case -525592897:
                    c10745.m27405();
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ۨܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 649) ^ (-120362017);
                        i5 = -115886659;
                    } else {
                        iM2761 = (C0773.m3169("ۙۘ") ^ i2) * 115;
                        i4 = ((iM2761 ^ i3) * (-3667)) ^ 511916009;
                        i5 = -1588134845;
                    }
                    break;
                case -1056350846:
                case 641846749:
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0619.m2761("ܽۗ") + i3) * 83;
                        i4 = ((iM2761 ^ i2) * (-25505)) ^ 1985489104;
                        i5 = 243087393;
                    } else {
                        iM2761 = (C0773.m3169("۬ۧ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i3) * 21909) ^ (-1468576165);
                        i5 = 177647514;
                    }
                    break;
                case -1020340835:
                case 99399321:
                    break;
                case -880148067:
                case 288804005:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("ۨܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 649) ^ (-120362017);
                        i5 = -115886659;
                    } else {
                        iM2761 = (C0619.m2761("ۨܽ") + i2) * 13;
                        i4 = ((iM2761 ^ i3) * (-32241)) ^ (-29078816);
                        i5 = 1779186309;
                    }
                    break;
                case -283323460:
                case 904291471:
                    C1826.m6301();
                    if (C3033.m9845() <= 0) {
                        iM2761 = C0773.m3169("ۨܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 649) ^ (-120362017);
                        i5 = -115886659;
                    } else {
                        iM2761 = C0773.m3169("ۚܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28833) ^ 1620735234;
                        i5 = -551286616;
                    }
                    break;
                case -75011048:
                case 133160650:
                    RunnableC0334.m2063();
                    break;
                case 252705077:
                case 934363347:
                    C17202.m40378(abstractC22044);
                    RunnableC0334.m2057();
                    abstractC22045 = this.f29326;
                    if (abstractC22045 != null) {
                        iM2761 = (C0619.m2761("ᩴᩴ") ^ i3) * 15;
                        i4 = ((iM2761 ^ i2) * 19479) ^ (-667511956);
                        i5 = -1913501296;
                    } else {
                        iM2761 = (C0619.m2761("ۡܽ") + i2) * 101;
                        i4 = ((iM2761 ^ i3) * (-7567)) ^ 1123388109;
                        i5 = 358683217;
                    }
                    break;
                case 1483322804:
                case 1875305800:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("ۨܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 649) ^ (-120362017);
                        i5 = -115886659;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩶ۙ")) * (-11);
                        i4 = ((iM2761 ^ i2) * 31833) ^ 827883341;
                        i5 = -288100009;
                    }
                    break;
                case 1916397483:
                case 2106118680:
                    if (C23916.f77426 > 0) {
                        iM2761 = (C0619.m2761("ۢۘ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i3) * 395) ^ 636226648;
                        i5 = 1786644854;
                    } else {
                        iM2761 = C0773.m3169("ۚܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28833) ^ 1620735234;
                        i5 = -551286616;
                    }
                    break;
                default:
                    c10745 = this.f29334;
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("ۚܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28833) ^ 1620735234;
                        i5 = -551286616;
                    } else {
                        iM2761 = C0619.m2761("᩸֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4139)) ^ (-1928033868);
                        i5 = 899041689;
                    }
                    break;
            }
            return;
        }
    }
}
