package l;

import java.util.AbstractCollection;
import java.util.LinkedList;
import java.util.Set;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1YZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14718 {

    /* JADX INFO: renamed from: ۫᩹ܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f48102 = {3566, 14229, 14220, 14210, 14255, 14240, 14250, 14268, 14241, 14247, 14250, 14305, 14267, 14266, 14247, 14242, 14305, 14220, 14255, 14269, 14251, 14328, 14330, 14325, 14250, 14251, 14253, 14241, 14250, 14251, 14210, 14244, 14255, 14264, 14255, 14305, 14242, 14255, 14240, 14249, 14305, 14237, 14266, 14268, 14247, 14240, 14249, 14325, 14215};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8752 f48103;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedList f48104;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC12384 f48105;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C22420 f48106;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f48107;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5122 f48108;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC12384 f48109;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C8007 f48110;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC12384 f48111;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f48112;

    public C14718(C22420 c22420) {
        this.f48106 = c22420;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0531 A[PHI: r3 r4 r8 r16 r17 r22
      0x0531: PHI (r3v4 l.ۤۙۛ) = (r3v3 l.ۤۙۛ), (r3v2 l.ۤۙۛ) binds: [B:122:0x052f, B:99:0x0407] A[DONT_GENERATE, DONT_INLINE]
      0x0531: PHI (r4v21 int) = (r4v7 int), (r4v22 int) binds: [B:122:0x052f, B:99:0x0407] A[DONT_GENERATE, DONT_INLINE]
      0x0531: PHI (r8v62 int) = (r8v56 int), (r8v63 int) binds: [B:122:0x052f, B:99:0x0407] A[DONT_GENERATE, DONT_INLINE]
      0x0531: PHI (r16v3 l.ۨۚۛ) = (r16v2 l.ۨۚۛ), (r16v5 l.ۨۚۛ) binds: [B:122:0x052f, B:99:0x0407] A[DONT_GENERATE, DONT_INLINE]
      0x0531: PHI (r17v10 int) = (r17v4 int), (r17v11 int) binds: [B:122:0x052f, B:99:0x0407] A[DONT_GENERATE, DONT_INLINE]
      0x0531: PHI (r22v45 l.᩶۬ۨ) = (r22v38 l.᩶۬ۨ), (r22v46 l.᩶۬ۨ) binds: [B:122:0x052f, B:99:0x0407] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6 A[PHI: r18
      0x00e6: PHI (r18v4 java.util.Set) = (r18v3 java.util.Set), (r18v2 java.util.Set), (r18v2 java.util.Set) binds: [B:34:0x00e4, B:24:0x00b2, B:17:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0120 A[PHI: r4
      0x0120: PHI (r4v5 l.᩶۬ۨ) = (r4v4 l.᩶۬ۨ), (r4v2 l.᩶۬ۨ), (r4v2 l.᩶۬ۨ) binds: [B:38:0x011e, B:21:0x00a9, B:6:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01d7 A[PHI: r7 r13 r14 r15
      0x01d7: PHI (r7v5 l.ۨ۬ۨ) = (r7v2 l.ۨ۬ۨ), (r7v2 l.ۨ۬ۨ), (r7v3 l.ۨ۬ۨ), (r7v2 l.ۨ۬ۨ) binds: [B:163:0x01d7, B:51:0x01d5, B:43:0x016f, B:6:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r13v5 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:163:0x01d7, B:51:0x01d5, B:43:0x016f, B:6:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r14v5 l.ۨ۬ۨ) = (r14v2 l.ۨ۬ۨ), (r14v3 l.ۨ۬ۨ), (r14v2 l.ۨ۬ۨ), (r14v2 l.ۨ۬ۨ) binds: [B:163:0x01d7, B:51:0x01d5, B:43:0x016f, B:6:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r15v6 l.ۘܺ᩸) = (r15v2 l.ۘܺ᩸), (r15v2 l.ۘܺ᩸), (r15v4 l.ۘܺ᩸), (r15v2 l.ۘܺ᩸) binds: [B:163:0x01d7, B:51:0x01d5, B:43:0x016f, B:6:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x023e A[PHI: r11
      0x023e: PHI (r11v4 l.᩶۬ۨ) = (r11v2 l.᩶۬ۨ), (r11v3 l.᩶۬ۨ), (r11v2 l.᩶۬ۨ), (r11v2 l.᩶۬ۨ), (r11v2 l.᩶۬ۨ) binds: [B:164:0x023e, B:61:0x023c, B:26:0x00b6, B:24:0x00b2, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35412(C12328 c12328) {
        int iM3169;
        int i;
        int i2;
        C21335 c21335;
        int i3;
        int i4;
        int i5;
        int iM31610;
        int i6;
        int i7;
        int iM2761;
        int i8;
        int i9;
        C21335 c21336;
        int iM31611;
        int i10;
        int i11;
        int iM31612;
        int i12;
        int i13;
        int i14 = C2310.f7472;
        int i15 = AbstractC0116.f1064;
        int iM2762 = (C0619.m2761("ܿ᩸") + i14) * 123;
        int i16 = ((iM2762 ^ i15) * (-28681)) ^ (-581856999);
        Object objM24747 = null;
        AbstractC12384 abstractC12384 = null;
        C21335 c21335M18177 = null;
        Set setM24747 = null;
        int i17 = iM2762 ^ 1394616800;
        C10628 c10628 = null;
        int i18 = 0;
        int iM35125 = 0;
        int i19 = 0;
        int i20 = -1939171777;
        int i21 = 0;
        InterfaceC12142 interfaceC12142 = null;
        C21335 c21335M18178 = null;
        C4278 c4278 = null;
        int iM24745 = 0;
        int i22 = 0;
        AbstractC12384 abstractC12385 = null;
        int iM24746 = 0;
        while (true) {
            i20 = i17 ^ (i16 & (((i20 ^ i15) * (-31261)) >> 31));
            switch (i20) {
                case -2135804620:
                case 2059529785:
                    if (C14565.m35132(c12328, C0862.m3499((InterfaceC12142) abstractC12385), iM24746 + i18)) {
                        iM3169 = (i15 - C0773.m3169("᩻ۗ")) * (-87);
                        i = ((iM3169 ^ i14) * 29295) ^ 2128429284;
                        i2 = 1314808540;
                    } else {
                        iM3169 = (C0773.m3169("۬۬") ^ i15) * (-7);
                        i = ((iM3169 ^ i14) * 31207) ^ (-172719159);
                        i2 = -506494183;
                    }
                    i17 = iM3169 ^ i2;
                    i16 = i;
                    break;
                case -2088361679:
                case -415215634:
                    if (this.f48104.isEmpty()) {
                        iM3169 = (C0773.m3169("ۨ֡") + i14) * (-23);
                        i = ((iM3169 ^ i15) * (-28911)) ^ (-590858275);
                        i2 = 315903051;
                    } else {
                        iM3169 = (C0773.m3169("ۧܶ") + i14) * 21;
                        i = ((iM3169 ^ i15) * (-17321)) ^ (-857316826);
                        i2 = -1155162406;
                    }
                    i17 = iM3169 ^ i2;
                    i16 = i;
                    break;
                case -2079372916:
                case -1770710518:
                    AbstractC3624.m11755();
                    iM3169 = (C0619.m2761("ܽۖ") + i14) * 65;
                    i = ((iM3169 ^ i15) * 8365) ^ (-50252088);
                    i2 = -371527779;
                    i17 = iM3169 ^ i2;
                    i16 = i;
                    break;
                case -1959430001:
                case -934372911:
                    C3690.m11987();
                    break;
                case -1936016238:
                case 1156919622:
                    break;
                case -1809690188:
                case -1578375245:
                    C11235.m28309();
                    if (!C2878.f9462) {
                        c21335 = c21335M18177;
                        i4 = i21;
                        iM31612 = (C0773.m3169("ۛ᩺") ^ i14) * (-67);
                        i12 = ((iM31612 ^ i15) * (-8567)) ^ 1427151471;
                        i13 = 1445954228;
                        int i23 = iM31612 ^ i13;
                        i21 = i4;
                        c21336 = c21335;
                        i17 = i23;
                        i16 = i12;
                        c21335M18177 = c21336;
                    } else {
                        iM3169 = C0773.m3169("ᩴۗ") ^ i15;
                        i = ((iM3169 ^ i14) * 17987) ^ 274414348;
                        i2 = -777828434;
                        i17 = iM3169 ^ i2;
                        i16 = i;
                    }
                    break;
                case -1754915029:
                case 1479940572:
                    C1321.m4849(c10628, this.f48109);
                    C3099.m10094(c10628, this.f48105);
                    break;
                case -1740549642:
                case -1700344217:
                    C21335 c21337 = c21335M18177;
                    int i24 = i19;
                    int i25 = i18;
                    int iM7743 = C2287.m7743(interfaceC12142);
                    iM35125 = C14565.m35125(c12328, iM7743, iM24745 - 1);
                    if (iM35125 == -1) {
                        iM31611 = C0619.m2761("ۙۖ") ^ i15;
                        i10 = ((iM31611 ^ i14) * (-20475)) ^ 529130185;
                        i11 = -872237039;
                    } else {
                        iM31611 = (C0773.m3169("֡ۢ") + i14) * (-63);
                        i10 = ((iM31611 ^ i15) * (-8597)) ^ 1862251139;
                        i11 = 955841333;
                    }
                    int i26 = iM31611 ^ i11;
                    i21 = iM7743;
                    i16 = i10;
                    i19 = i24;
                    c21335M18177 = c21337;
                    i17 = i26;
                    i18 = i25;
                    break;
                case -1717790602:
                case 344526017:
                    c21335 = c21335M18177;
                    i4 = i21;
                    C3099.m10094(c10628, this.f48109);
                    C1321.m4849(c10628, this.f48105);
                    if (AbstractC0116.m1243() != 0) {
                        iM31612 = (C0773.m3169("ۛ᩺") ^ i14) * (-67);
                        i12 = ((iM31612 ^ i15) * (-8567)) ^ 1427151471;
                        i13 = 1445954228;
                    } else {
                        iM31612 = C0619.m2761("᩸ۧ") ^ i14;
                        i12 = ((iM31612 ^ i15) * 10061) ^ 107902648;
                        i13 = -836331916;
                    }
                    int i27 = iM31612 ^ i13;
                    i21 = i4;
                    c21336 = c21335;
                    i17 = i27;
                    i16 = i12;
                    c21335M18177 = c21336;
                    break;
                case -1679156831:
                case -937648464:
                    i4 = i21;
                    if (!C14565.m35132(c12328, i4, iM24745 + i18)) {
                        iM31612 = (i15 - C0773.m3169("ۘۙ")) * (-21);
                        c21335 = c21335M18177;
                        i12 = ((iM31612 ^ i14) * (-24841)) ^ 80365615;
                        i13 = 1574789209;
                        int i28 = iM31612 ^ i13;
                        i21 = i4;
                        c21336 = c21335;
                        i17 = i28;
                        i16 = i12;
                        c21335M18177 = c21336;
                    } else {
                        c21335 = c21335M18177;
                        i3 = i19;
                        i5 = i18;
                        iM31610 = (i15 - C0773.m3169("᩷۬")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM31610 ^ i14) * 16287) ^ (-30699634);
                        i7 = 603455661;
                        int i29 = iM31610 ^ i7;
                        i21 = i4;
                        c21336 = c21335;
                        i17 = i29;
                        i16 = i6;
                        i18 = i5;
                        i19 = i3;
                        c21335M18177 = c21336;
                    }
                    break;
                case -1653886226:
                case -1082562966:
                    ((AbstractCollection) objM24747).remove(c21335M18178);
                    C3099.m10094(c10628, this.f48111);
                    break;
                case -1645448350:
                case -1359822082:
                    setM24747 = c21335M18177.m48561().m24747();
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("᩹ۙ") ^ i15;
                        i = ((iM3169 ^ i14) * (-4259)) ^ 1019460407;
                        i2 = -1838621642;
                    } else {
                        iM3169 = (C0619.m2761("ۛۤ") ^ i14) * (-103);
                        i = ((iM3169 ^ i15) * (-2565)) ^ (-1813447952);
                        i2 = -599542721;
                    }
                    i17 = iM3169 ^ i2;
                    i16 = i;
                    break;
                case -1630992264:
                case 404203074:
                    this.f48103.m23447(c12328);
                    this.f48110.m21869(c12328);
                    break;
                case -1608305776:
                case -680350526:
                    C21335 c21338 = c21335M18177;
                    int i30 = i21;
                    int i31 = this.f48107;
                    if (i31 == 1) {
                        iM2761 = (i14 - C0619.m2761("۫۠")) * 75;
                        i8 = ((iM2761 ^ i15) * 4063) ^ (-630087289);
                        i9 = 1460560903;
                    } else {
                        iM2761 = C0619.m2761("ۙܽ") ^ i15;
                        i8 = ((iM2761 ^ i14) * (-3867)) ^ (-902378225);
                        i9 = -808514705;
                    }
                    int i32 = iM2761 ^ i9;
                    i19 = i31;
                    i16 = i8;
                    i21 = i30;
                    i18 = 1;
                    c21336 = c21338;
                    i17 = i32;
                    c21335M18177 = c21336;
                    break;
                case -1515705448:
                case 688426482:
                    c4278 = (C4278) this.f48104.removeLast();
                    abstractC12384 = c4278.f15543;
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ᩴۗ") ^ i15;
                        i = ((iM3169 ^ i14) * 17987) ^ 274414348;
                        i2 = -777828434;
                    } else {
                        iM3169 = C0619.m2761("֫ۘ") ^ i15;
                        i = ((iM3169 ^ i14) * (-25089)) ^ (-1705292910);
                        i2 = 290195580;
                    }
                    i17 = iM3169 ^ i2;
                    i16 = i;
                    break;
                case -1424406221:
                case 81322659:
                    C3033.m9845();
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0619.m2761("ܽۖ") + i14) * 65;
                        i = ((iM3169 ^ i15) * 8365) ^ (-50252088);
                        i2 = -371527779;
                    } else {
                        iM3169 = (C0619.m2761("۟֫") ^ i14) * 31;
                        i = ((iM3169 ^ i15) * 567) ^ (-963346942);
                        i2 = -699721838;
                    }
                    i17 = iM3169 ^ i2;
                    i16 = i;
                    break;
                case -1354190669:
                case 1254765584:
                    RunnableC0334.m2063();
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0773.m3169("᩹ۙ") ^ i15;
                        i = ((iM3169 ^ i14) * (-4259)) ^ 1019460407;
                        i2 = -1838621642;
                    } else {
                        iM3169 = (C0619.m2761("᩷ۨ") + i14) * (-81);
                        i = ((iM3169 ^ i15) * (-959)) ^ 229326746;
                        i2 = -1841435387;
                    }
                    i17 = iM3169 ^ i2;
                    i16 = i;
                    break;
                case -1337045790:
                case 1728585274:
                    if (!C14565.m35132(c12328, iM35125, i22)) {
                        iM3169 = (i14 - C0773.m3169("ۢܶ")) * (-65);
                        i = ((iM3169 ^ i15) * (-18083)) ^ 717657026;
                        i2 = 1526991214;
                        i17 = iM3169 ^ i2;
                        i16 = i;
                    } else {
                        c21335 = c21335M18177;
                        i3 = i19;
                        i4 = i21;
                        i5 = i18;
                        iM31610 = (i15 - C0773.m3169("᩷۬")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM31610 ^ i14) * 16287) ^ (-30699634);
                        i7 = 603455661;
                        int i210 = iM31610 ^ i7;
                        i21 = i4;
                        c21336 = c21335;
                        i17 = i210;
                        i16 = i6;
                        i18 = i5;
                        i19 = i3;
                        c21335M18177 = c21336;
                    }
                    break;
                case -1306335417:
                case 357712717:
                    C3099.m10094(c10628, abstractC12384);
                    c4278.f15545.m21869(c12328);
                    c21335 = c21335M18177;
                    i3 = i19;
                    i4 = i21;
                    iM31610 = C0619.m2761("ۨۖ") ^ i14;
                    i5 = i18;
                    i6 = ((iM31610 ^ i15) * (-24327)) ^ (-1175016852);
                    i7 = 1437922950;
                    int i211 = iM31610 ^ i7;
                    i21 = i4;
                    c21336 = c21335;
                    i17 = i211;
                    i16 = i6;
                    i18 = i5;
                    i19 = i3;
                    c21335M18177 = c21336;
                    break;
                case -1299926853:
                case 231573647:
                    ((AbstractCollection) setM24747).remove(c21335M18177);
                    C1321.m4849(c10628, this.f48111);
                    break;
                case -1240003954:
                case 1903847695:
                    c21335 = c21335M18177;
                    i4 = i21;
                    i22 = iM24745 + i18;
                    if (!C14565.m35132(c12328, i4, i22)) {
                        iM31612 = C0773.m3169("ܽ۬") ^ i14;
                        i12 = ((iM31612 ^ i15) * 2595) ^ (-1544463130);
                        i13 = -1321536980;
                        int i212 = iM31612 ^ i13;
                        i21 = i4;
                        c21336 = c21335;
                        i17 = i212;
                        i16 = i12;
                        c21335M18177 = c21336;
                    }
                    i3 = i19;
                    i5 = i18;
                    iM31610 = (i15 - C0773.m3169("᩷۬")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i6 = ((iM31610 ^ i14) * 16287) ^ (-30699634);
                    i7 = 603455661;
                    int i213 = iM31610 ^ i7;
                    i21 = i4;
                    c21336 = c21335;
                    i17 = i213;
                    i16 = i6;
                    i18 = i5;
                    i19 = i3;
                    c21335M18177 = c21336;
                    break;
                case -1180421850:
                case -1126355319:
                    c21335 = c21335M18177;
                    i3 = i19;
                    i4 = i21;
                    i5 = i18;
                    c10628 = c12328.f39606;
                    if (C0269.f1558 <= 0) {
                        iM31610 = C0773.m3169("ۙ᩷") ^ i14;
                        i6 = ((iM31610 ^ i15) * 23753) ^ (-392796812);
                        i7 = 1108390995;
                    } else {
                        iM31610 = (i14 - C0773.m3169("ۛۡ")) * (-75);
                        i6 = ((iM31610 ^ i15) * (-30177)) ^ 159457983;
                        i7 = -387686643;
                    }
                    int i214 = iM31610 ^ i7;
                    i21 = i4;
                    c21336 = c21335;
                    i17 = i214;
                    i16 = i6;
                    i18 = i5;
                    i19 = i3;
                    c21335M18177 = c21336;
                    break;
                case -964225387:
                case -388495460:
                    c21335M18177 = ((AbstractC6419) this.f48111).m18177();
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0619.m2761("۟֫") ^ i14) * 31;
                        i = ((iM3169 ^ i15) * 567) ^ (-963346942);
                        i2 = -699721838;
                    } else {
                        iM3169 = C0773.m3169("ۤۜ") ^ i15;
                        i = ((iM3169 ^ i14) * (-26535)) ^ 320190729;
                        i2 = -1427315910;
                    }
                    i17 = iM3169 ^ i2;
                    i16 = i;
                    break;
                case -875483817:
                case 1061775261:
                    c21335 = c21335M18177;
                    i3 = i19;
                    i4 = i21;
                    i5 = i18;
                    if (i3 == 2) {
                        iM31610 = C0773.m3169("ۡܿ") ^ i15;
                        i6 = ((iM31610 ^ i14) * 257) ^ (-1090394917);
                        i7 = 2014237001;
                    } else {
                        iM31610 = (C0773.m3169("ܽ۠") + i15) * (-75);
                        i6 = ((iM31610 ^ i14) * (-18723)) ^ (-335051638);
                        i7 = 916726216;
                    }
                    int i215 = iM31610 ^ i7;
                    i21 = i4;
                    c21336 = c21335;
                    i17 = i215;
                    i16 = i6;
                    i18 = i5;
                    i19 = i3;
                    c21335M18177 = c21336;
                    break;
                case -777407889:
                case -708935439:
                    if (!C3690.m11987()) {
                        c21335 = c21335M18177;
                        i3 = i19;
                        i4 = i21;
                        i5 = i18;
                        iM31610 = (C0619.m2761("ۤۤ") + i15) * (-89);
                        i6 = ((iM31610 ^ i14) * (-8021)) ^ (-1807530532);
                        i7 = 1067815319;
                        int i216 = iM31610 ^ i7;
                        i21 = i4;
                        c21336 = c21335;
                        i17 = i216;
                        i16 = i6;
                        i18 = i5;
                        i19 = i3;
                        c21335M18177 = c21336;
                    } else {
                        iM3169 = (C0619.m2761("ܽۖ") + i14) * 65;
                        i = ((iM3169 ^ i15) * 8365) ^ (-50252088);
                        i2 = -371527779;
                        i17 = iM3169 ^ i2;
                        i16 = i;
                    }
                    break;
                case -742821591:
                case 201102922:
                    iM24746 = this.f48111.m30863().m24745();
                    abstractC12385 = this.f48111;
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("ᩴۗ") ^ i15;
                        i = ((iM3169 ^ i14) * 17987) ^ 274414348;
                        i2 = -777828434;
                    } else {
                        iM3169 = (i15 - C0619.m2761("ۙۜ")) * 93;
                        i = ((iM3169 ^ i14) * 22873) ^ 1521838049;
                        i2 = -29317983;
                    }
                    i17 = iM3169 ^ i2;
                    i16 = i;
                    break;
                case -724602660:
                case 1981001647:
                    this.f48110.m21869(c12328);
                    c21335 = c21335M18177;
                    i3 = i19;
                    i4 = i21;
                    i5 = i18;
                    iM31610 = (i15 - C0773.m3169("᩷۬")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i6 = ((iM31610 ^ i14) * 16287) ^ (-30699634);
                    i7 = 603455661;
                    int i217 = iM31610 ^ i7;
                    i21 = i4;
                    c21336 = c21335;
                    i17 = i217;
                    i16 = i6;
                    i18 = i5;
                    i19 = i3;
                    c21335M18177 = c21336;
                    break;
                case -387395257:
                case 1226949297:
                    c21335 = c21335M18177;
                    i3 = i19;
                    i4 = i21;
                    i5 = i18;
                    interfaceC12142 = (InterfaceC12142) this.f48111;
                    if (C1146.m4231()) {
                        iM31610 = C0773.m3169("ᩴᩳ") ^ i15;
                        i6 = ((iM31610 ^ i14) * 27315) ^ (-1154856897);
                        i7 = -1631879772;
                    } else {
                        iM31610 = C0773.m3169("ۙ᩷") ^ i14;
                        i6 = ((iM31610 ^ i15) * 23753) ^ (-392796812);
                        i7 = 1108390995;
                    }
                    int i218 = iM31610 ^ i7;
                    i21 = i4;
                    c21336 = c21335;
                    i17 = i218;
                    i16 = i6;
                    i18 = i5;
                    i19 = i3;
                    c21335M18177 = c21336;
                    break;
                case -195410192:
                case 749304911:
                    c21335M18178 = ((AbstractC6419) this.f48111).m18177();
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("۠ܰ") ^ i15;
                        i = ((iM3169 ^ i14) * (-5075)) ^ 1360620099;
                        i2 = 2145873741;
                    } else {
                        iM3169 = (C0619.m2761("ܽۖ") + i14) * 65;
                        i = ((iM3169 ^ i15) * 8365) ^ (-50252088);
                        i2 = -371527779;
                    }
                    i17 = iM3169 ^ i2;
                    i16 = i;
                    break;
                case -66860925:
                case 1242478979:
                    c21335 = c21335M18177;
                    i3 = i19;
                    i4 = i21;
                    i5 = i18;
                    if (i3 == 3) {
                        iM31610 = C0773.m3169("ۙۚ") ^ i15;
                        i6 = ((iM31610 ^ i14) * (-11449)) ^ 186690027;
                        i7 = -1652375829;
                    } else {
                        iM31610 = (i14 - C0773.m3169("᩻ܽ")) * 127;
                        i6 = ((iM31610 ^ i15) * 12827) ^ (-2001341378);
                        i7 = 1449274801;
                    }
                    int i219 = iM31610 ^ i7;
                    i21 = i4;
                    c21336 = c21335;
                    i17 = i219;
                    i16 = i6;
                    i18 = i5;
                    i19 = i3;
                    c21335M18177 = c21336;
                    break;
                case 48405829:
                case 1756187151:
                    C1321.m4849(c10628, this.f48111);
                    iM3169 = (i15 - C0773.m3169("᩻ۗ")) * (-87);
                    i = ((iM3169 ^ i14) * 29295) ^ 2128429284;
                    i2 = 1314808540;
                    i17 = iM3169 ^ i2;
                    i16 = i;
                    break;
                case 192437450:
                case 644643641:
                    C2288.m7767();
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = (C0619.m2761("ܽۖ") + i14) * 65;
                        i = ((iM3169 ^ i15) * 8365) ^ (-50252088);
                        i2 = -371527779;
                    } else {
                        iM3169 = C0773.m3169("᩹ۙ") ^ i15;
                        i = ((iM3169 ^ i14) * (-4259)) ^ 1019460407;
                        i2 = -1838621642;
                    }
                    i17 = iM3169 ^ i2;
                    i16 = i;
                    break;
                case 391832056:
                case 1596328721:
                    c21335 = c21335M18177;
                    i4 = i21;
                    i3 = i19;
                    if (i3 == 4) {
                        iM31610 = C0619.m2761("ۨۖ") ^ i14;
                        i5 = i18;
                        i6 = ((iM31610 ^ i15) * (-24327)) ^ (-1175016852);
                        i7 = 1437922950;
                    } else {
                        i5 = i18;
                        iM31610 = (i15 - C0773.m3169("᩷۬")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM31610 ^ i14) * 16287) ^ (-30699634);
                        i7 = 603455661;
                    }
                    int i2110 = iM31610 ^ i7;
                    i21 = i4;
                    c21336 = c21335;
                    i17 = i2110;
                    i16 = i6;
                    i18 = i5;
                    i19 = i3;
                    c21335M18177 = c21336;
                    break;
                case 1028116939:
                case 2081484939:
                    c21335 = c21335M18177;
                    i3 = i19;
                    i4 = i21;
                    i5 = i18;
                    iM24745 = this.f48111.m30863().m24745();
                    if (C11235.f35427 >= 0) {
                        iM31610 = (C0619.m2761("ۤۤ") + i15) * (-89);
                        i6 = ((iM31610 ^ i14) * (-8021)) ^ (-1807530532);
                        i7 = 1067815319;
                    } else {
                        iM31610 = C0773.m3169("ۜۗ") ^ i14;
                        i6 = ((iM31610 ^ i15) * 18581) ^ 1631842048;
                        i7 = -1626140013;
                    }
                    int i2111 = iM31610 ^ i7;
                    i21 = i4;
                    c21336 = c21335;
                    i17 = i2111;
                    i16 = i6;
                    i18 = i5;
                    i19 = i3;
                    c21335M18177 = c21336;
                    break;
                case 1418557747:
                case 2079936161:
                    objM24747 = c21335M18178.m48561().m24747();
                    if (C1564.f5401 > 0) {
                        iM3169 = C0773.m3169("ۛ֫") ^ i14;
                        i = ((iM3169 ^ i15) * (-2841)) ^ (-1311724361);
                        i2 = 1766569731;
                        i17 = iM3169 ^ i2;
                        i16 = i;
                    } else {
                        c21335 = c21335M18177;
                        i3 = i19;
                        i4 = i21;
                        i5 = i18;
                        iM31610 = (C0619.m2761("ۤۤ") + i15) * (-89);
                        i6 = ((iM31610 ^ i14) * (-8021)) ^ (-1807530532);
                        i7 = 1067815319;
                        int i2112 = iM31610 ^ i7;
                        i21 = i4;
                        c21336 = c21335;
                        i17 = i2112;
                        i16 = i6;
                        i18 = i5;
                        i19 = i3;
                        c21335M18177 = c21336;
                    }
                    break;
                default:
                    C3448.m11248();
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("۟֫") ^ i14) * 31;
                        i = ((iM3169 ^ i15) * 567) ^ (-963346942);
                        i2 = -699721838;
                    } else {
                        iM3169 = C0773.m3169("ᩴۗ") ^ i15;
                        i = ((iM3169 ^ i14) * 17987) ^ 274414348;
                        i2 = -777828434;
                    }
                    i17 = iM3169 ^ i2;
                    i16 = i;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 62881. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35413(l.C12328 r50, int r51, int r52) {
        /*
            Method dump skipped, instruction units count: 6288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14718.m35413(l.ۨۧ᩸, int, int):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m35414() {
        return this.f48112;
    }
}
