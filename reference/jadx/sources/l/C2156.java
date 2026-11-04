package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F6IK */
/* JADX INFO: loaded from: classes3.dex */
public final class C2156 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ᩺ۧ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f7107 = {8361, 23569, 23614, 23604, 23586, 23615, 23609, 23604, 23664, 23603, 23615, 23613, 23584, 23609, 23612, 23605, 23664, 23612, 23609, 23602, 23586, 23601, 23586, 23593, 23664, 23609, 23587, 23664, 23588, 23615, 23615, 23664, 23612, 23601, 23586, 23607, 23605};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC25004 f7108;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C3374 f7109;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f7110;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5885 f7111;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f7112;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f7113;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f6 A[PHI: r3 r4 r9 r10
      0x00f6: PHI (r3v3 byte[]) = (r3v2 byte[]), (r3v1 byte[]), (r3v1 byte[]), (r3v1 byte[]) binds: [B:36:0x00f4, B:18:0x0069, B:16:0x0065, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r4v3 int) = (r4v2 int), (r4v1 int), (r4v1 int), (r4v1 int) binds: [B:36:0x00f4, B:18:0x0069, B:16:0x0065, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:36:0x00f4, B:18:0x0069, B:16:0x0065, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v4 int) binds: [B:36:0x00f4, B:18:0x0069, B:16:0x0065, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0137 A[PHI: r11
      0x0137: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:41:0x0121, B:23:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0182 A[PHI: r7
      0x0182: PHI (r7v2 long) = (r7v1 long), (r7v3 long) binds: [B:51:0x0180, B:28:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01ce A[PHI: r5
      0x01ce: PHI (r5v3 long) = (r5v1 long), (r5v1 long), (r5v1 long), (r5v2 long), (r5v1 long) binds: [B:59:0x01cc, B:55:0x01ae, B:47:0x0167, B:32:0x00d3, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0217  */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        int iM3169;
        int i;
        int i2;
        byte[] bArr = null;
        int length = 0;
        long j2 = 0;
        long jM8353 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 133189350;
        int i7 = C1321.f4751;
        int i8 = C1519.f5300;
        int iM31610 = (i7 - C0773.m3169("᩻ۡ")) * (-87);
        int i9 = ((iM31610 ^ i8) * (-28071)) ^ (-1526158205);
        int i10 = (-502047604) ^ iM31610;
        long j3 = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i8) * (-22623)) >> 31));
            switch (i6) {
                case -2127166991:
                case 763974272:
                    if (RunnableC0334.m2063()) {
                        iM3169 = C0773.m3169("᩻᩻") ^ i8;
                        i = ((iM3169 ^ i7) * 27363) ^ 1657993869;
                        i2 = -897725864;
                    } else {
                        iM3169 = C0773.m3169("ۡᩳ") ^ i7;
                        i = ((iM3169 ^ i8) * (-4493)) ^ (-376971421);
                        i2 = -1642523905;
                    }
                    int i11 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i11;
                    break;
                case -1941375144:
                case -1886589565:
                    j3 += (long) i5;
                    iM3169 = C0773.m3169("ۨܺ") ^ i8;
                    i = ((iM3169 ^ i7) * (-179)) ^ (-245010184);
                    i2 = -1551398233;
                    int i12 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i12;
                    break;
                case -1875553863:
                case 1230357118:
                    RunnableC3055.m9933();
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("᩻᩻") ^ i8;
                        i = ((iM3169 ^ i7) * 27363) ^ 1657993869;
                        i2 = -897725864;
                    } else {
                        iM3169 = C0619.m2761("ܺܽ") ^ i8;
                        i = ((iM3169 ^ i7) * 32089) ^ 902018698;
                        i2 = -397540782;
                    }
                    int i13 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i13;
                    break;
                case -1830628050:
                case 471217580:
                    j2 = length;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ܺܽ") ^ i8;
                        i = ((iM3169 ^ i7) * 32089) ^ 902018698;
                        i2 = -397540782;
                    } else {
                        iM3169 = (C0773.m3169("ۛܺ") + i8) * 3;
                        i = ((iM3169 ^ i7) * 3389) ^ (-997214818);
                        i2 = -1032010989;
                    }
                    int i14 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i14;
                    break;
                case -1712221056:
                case 1179478806:
                    bArr = this.f7112;
                    length = bArr.length;
                    if (C1826.m6301() >= 0) {
                        iM3169 = C0619.m2761("᩶֡") ^ i7;
                        i = ((iM3169 ^ i8) * 28051) ^ 1433590815;
                        i2 = 1583632652;
                    } else {
                        iM3169 = C0773.m3169("ܺܿ") ^ i7;
                        i = ((iM3169 ^ i8) * (-12187)) ^ 1450506471;
                        i2 = 880471312;
                    }
                    int i15 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i15;
                    break;
                case -1613961114:
                case 352326919:
                    C3734.m12152();
                    iM3169 = C0619.m2761("᩶֡") ^ i7;
                    i = ((iM3169 ^ i8) * 28051) ^ 1433590815;
                    i2 = 1583632652;
                    int i16 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i16;
                    break;
                case -1135368113:
                case -163074571:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("۟᩻") ^ i7;
                        i = ((iM3169 ^ i8) * (-25955)) ^ 894534646;
                        i2 = 1269499334;
                    } else {
                        iM3169 = (C0619.m2761("ܳ۫") ^ i8) * (-117);
                        i = ((iM3169 ^ i7) * (-11709)) ^ (-1484575565);
                        i2 = -1439041423;
                    }
                    int i17 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i17;
                    break;
                case -859861192:
                case -819354220:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ܺܽ") ^ i8;
                        i = ((iM3169 ^ i7) * 32089) ^ 902018698;
                        i2 = -397540782;
                    } else {
                        iM3169 = (i8 - C0619.m2761("ۨ֨")) * 41;
                        i = ((iM3169 ^ i7) * (-6137)) ^ (-386898034);
                        i2 = 2003976216;
                    }
                    int i18 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i18;
                    break;
                case -597105974:
                case 1543667945:
                    jM8353 = C2485.m8353(j2, j - j3);
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("۟᩻") ^ i7;
                        i = ((iM3169 ^ i8) * (-25955)) ^ 894534646;
                        i2 = 1269499334;
                    } else {
                        iM3169 = (i7 - C0619.m2761("᩶ܺ")) * (-95);
                        i = ((iM3169 ^ i8) * (-16853)) ^ 817430208;
                        i2 = -1038772867;
                    }
                    int i19 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i19;
                    break;
                case -315411007:
                case 117130351:
                    C1783.m6232();
                    if (C2966.f9654 < 0) {
                        iM3169 = C0773.m3169("᩻᩻") ^ i8;
                        i = ((iM3169 ^ i7) * 27363) ^ 1657993869;
                        i2 = -897725864;
                    } else {
                        iM3169 = C0773.m3169("ۘۚ") ^ i7;
                        i = ((iM3169 ^ i8) * 12877) ^ 1781585609;
                        i2 = -271727097;
                    }
                    int i110 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i110;
                    break;
                case -117459044:
                case 533119742:
                    C1564.m5509();
                    C3690.m11987();
                    return 0L;
                case -39287107:
                case 596321402:
                    if (C4238.m13540() <= 0) {
                        iM3169 = C0619.m2761("ܺܽ") ^ i8;
                        i = ((iM3169 ^ i7) * 32089) ^ 902018698;
                        i2 = -397540782;
                    } else {
                        iM3169 = (i7 - C0619.m2761("ۗܰ")) * (-11);
                        i = ((iM3169 ^ i8) * (-24755)) ^ (-360073987);
                        i2 = 408843454;
                    }
                    int i111 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i111;
                    break;
                case 33783719:
                case 755491530:
                    j3 = 0;
                    iM3169 = C0773.m3169("ۨܺ") ^ i8;
                    i = ((iM3169 ^ i7) * (-179)) ^ (-245010184);
                    i2 = -1551398233;
                    int i112 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i112;
                    break;
                case 43133805:
                case 1896740956:
                    if (C0487.m2356() >= 0) {
                        iM3169 = C0619.m2761("ܺܽ") ^ i8;
                        i = ((iM3169 ^ i7) * 32089) ^ 902018698;
                        i2 = -397540782;
                    } else {
                        iM3169 = C0773.m3169("ۨ᩸") ^ i7;
                        i = ((iM3169 ^ i8) * (-24881)) ^ 320956673;
                        i2 = -1533325236;
                    }
                    int i113 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i113;
                    break;
                case 63444683:
                case 925922606:
                    if (C2878.f9462) {
                        iM3169 = C0619.m2761("᩶֡") ^ i7;
                        i = ((iM3169 ^ i8) * 28051) ^ 1433590815;
                        i2 = 1583632652;
                    } else {
                        iM3169 = C0773.m3169("᩻᩻") ^ i8;
                        i = ((iM3169 ^ i7) * 27363) ^ 1657993869;
                        i2 = -897725864;
                    }
                    int i114 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i114;
                    break;
                case 184297834:
                case 198063290:
                    return j3;
                case 822322540:
                case 2134911144:
                    i5 = read(bArr, i4, i3);
                    if (i5 == -1) {
                        iM3169 = C0773.m3169("ܺ۬") ^ i7;
                        i = ((iM3169 ^ i8) * (-6279)) ^ 373386454;
                        i2 = -1386869453;
                    } else {
                        iM3169 = C0773.m3169("֫ۗ") ^ i7;
                        i = ((iM3169 ^ i8) * (-26177)) ^ 118554339;
                        i2 = 718315183;
                    }
                    int i115 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i115;
                    break;
                case 947986998:
                case 1515192279:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("᩻᩻") ^ i8;
                        i = ((iM3169 ^ i7) * 27363) ^ 1657993869;
                        i2 = -897725864;
                    } else {
                        iM3169 = (C0619.m2761("֫᩸") ^ i8) * (-115);
                        i = ((iM3169 ^ i7) * 5605) ^ 237237874;
                        i2 = -1179210352;
                    }
                    int i116 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i116;
                    break;
                case 1314614700:
                case 2096744394:
                    if (j3 < j) {
                        iM3169 = C0619.m2761("ۤۜ") ^ i8;
                        i = ((iM3169 ^ i7) * (-2945)) ^ 1975567698;
                        i2 = 1183832263;
                    } else {
                        iM3169 = C0773.m3169("ܺ۬") ^ i7;
                        i = ((iM3169 ^ i8) * (-6279)) ^ 373386454;
                        i2 = -1386869453;
                    }
                    int i117 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i117;
                    break;
                default:
                    i3 = (int) jM8353;
                    i4 = 0;
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("᩶֡") ^ i7;
                        i = ((iM3169 ^ i8) * 28051) ^ 1433590815;
                        i2 = 1583632652;
                    } else {
                        iM3169 = C0773.m3169("ܰܶ") ^ i8;
                        i = ((iM3169 ^ i7) * 30941) ^ 355762238;
                        i2 = -1606525295;
                    }
                    int i118 = i;
                    i10 = iM3169 ^ i2;
                    i9 = i118;
                    break;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2156(InputStream inputStream, InterfaceC25004 interfaceC25004, AtomicBoolean atomicBoolean) {
        super(inputStream);
        byte[] bArr = null;
        C5885 c5885 = null;
        int i = 1773444134;
        int i2 = C2354.f7599;
        int i3 = C2834.f9334;
        int iM3169 = C0773.m3169("ۗ۬") ^ i3;
        int i4 = ((iM3169 ^ i2) * 4083) ^ 479620441;
        int i5 = -45650559;
        while (true) {
            i = ((((i ^ i2) * (-24941)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2088207856:
                case -916182902:
                    if (C0619.f2439) {
                        iM3169 = C0773.m3169("ۜۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 8955) ^ (-1045541163);
                        i5 = 1333566196;
                    } else {
                        iM3169 = C0619.m2761("᩸֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-9941)) ^ (-739211381);
                        i5 = -1745879362;
                    }
                    break;
                case -1854789687:
                case 1640033580:
                    this.f7110 = atomicBoolean;
                    if (C2878.m9491() > 0) {
                        if (C1826.f6190 > 0) {
                            C3374 c3374 = new C3374(9185280L);
                            RunnableC3055.m9935(c3374, interfaceC25004);
                            this.f7109 = c3374;
                            return;
                        }
                        iM3169 = C0773.m3169("ۡ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4589) ^ 846491304;
                        i5 = -78038576;
                    } else {
                        iM3169 = C0619.m2761("ۧܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18937) ^ 1341130212;
                        i5 = -637336456;
                    }
                    break;
                case -1790284656:
                case 112291020:
                    C2287.m7745();
                    C2023.m6964();
                    iM3169 = (C0773.m3169("᩶ۜ") + i2) * (-91);
                    i4 = ((iM3169 ^ i3) * 13931) ^ 1602883290;
                    i5 = -74496992;
                    break;
                case -1307704668:
                case -272009422:
                    bArr = new byte[8192];
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0619.m2761("ۧܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18937) ^ 1341130212;
                        i5 = -637336456;
                    } else {
                        iM3169 = (C0619.m2761("۫ܽ") + i2) * (-27);
                        i4 = ((iM3169 ^ i3) * (-23529)) ^ 290928652;
                        i5 = 212055168;
                    }
                    break;
                case -1273999318:
                case -556698976:
                    if (!C17202.f56030) {
                        iM3169 = (C0773.m3169("᩶ۜ") + i2) * (-91);
                        i4 = ((iM3169 ^ i3) * 13931) ^ 1602883290;
                        i5 = -74496992;
                    } else {
                        iM3169 = C0773.m3169("ۜۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 8955) ^ (-1045541163);
                        i5 = 1333566196;
                    }
                    break;
                case -1244411414:
                case 1720160456:
                    this.f7111 = c5885;
                    this.f7108 = interfaceC25004;
                    if (C0619.f2439) {
                        iM3169 = C0619.m2761("ۘۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29153)) ^ (-765107118);
                        i5 = -482415592;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩺ᩳ")) * (-31);
                        i4 = ((iM3169 ^ i2) * (-30485)) ^ 428667688;
                        i5 = 129597083;
                    }
                    break;
                case -783979785:
                case 1318974031:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0773.m3169("ۜۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 8955) ^ (-1045541163);
                        i5 = 1333566196;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܳ۟")) * 63;
                        i4 = ((iM3169 ^ i3) * (-12295)) ^ (-1354525782);
                        i5 = -843388477;
                    }
                    break;
                case -660246201:
                case 184509039:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("ۜۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 8955) ^ (-1045541163);
                        i5 = 1333566196;
                    } else {
                        iM3169 = C0619.m2761("ۛ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18013) ^ (-2133709798);
                        i5 = 1912597001;
                    }
                    break;
                case -551794462:
                case 1406340373:
                    C1783.m6232();
                    if (C1146.f4234 < 0) {
                        iM3169 = C0619.m2761("ۧܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18937) ^ 1341130212;
                        i5 = -637336456;
                    } else {
                        iM3169 = (C0773.m3169("᩶ۜ") + i2) * (-91);
                        i4 = ((iM3169 ^ i3) * 13931) ^ 1602883290;
                        i5 = -74496992;
                    }
                    break;
                case -509658883:
                case 91440371:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("ۧܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18937) ^ 1341130212;
                        i5 = -637336456;
                    } else {
                        iM3169 = C0773.m3169("ᩴ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18767)) ^ 2103210125;
                        i5 = -1643146846;
                    }
                    break;
                case 360292798:
                case 1463408494:
                    C1826.m6301();
                    throw new RuntimeException();
                case 926486084:
                case 1935556231:
                    if (AbstractC0641.m2813() > 0) {
                        iM3169 = C0773.m3169("ۡ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4589) ^ 846491304;
                        i5 = -78038576;
                    } else {
                        iM3169 = (C0773.m3169("᩶ۜ") + i2) * (-91);
                        i4 = ((iM3169 ^ i3) * 13931) ^ 1602883290;
                        i5 = -74496992;
                    }
                    break;
                case 1255363775:
                case 1626293337:
                    this.f7112 = bArr;
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("ۡ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4589) ^ 846491304;
                        i5 = -78038576;
                    } else {
                        iM3169 = C0773.m3169("ܶܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 12787) ^ (-2094985411);
                        i5 = 1693735094;
                    }
                    break;
                default:
                    c5885 = C11850.f38178;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0773.m3169("᩶ۜ") + i2) * (-91);
                        i4 = ((iM3169 ^ i3) * 13931) ^ 1602883290;
                        i5 = -74496992;
                    } else {
                        iM3169 = C0773.m3169("ۛۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4769)) ^ 1860287938;
                        i5 = 632494874;
                    }
                    break;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        InterfaceC25004 interfaceC25004 = null;
        AtomicBoolean atomicBoolean = null;
        int i = 0;
        int i2 = 1668301509;
        int i3 = RunnableC3055.f9898;
        int i4 = AbstractC3624.f12429;
        int iM2761 = (i3 - C0619.m2761("ۡ۬")) * (-53);
        int i5 = ((iM2761 ^ i4) * (-18055)) ^ 1642252649;
        int i6 = -246922762;
        while (true) {
            i2 = ((((i2 ^ i4) * 14729) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2144990538:
                case 910870341:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ۚ᩺") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-29307)) ^ (-668249983);
                        i6 = -535235366;
                    } else {
                        iM2761 = C0773.m3169("᩻᩶") ^ i4;
                        i5 = ((iM2761 ^ i3) * 16511) ^ 1871192505;
                        i6 = 179658499;
                    }
                    break;
                case -1749225834:
                case -1277917851:
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0773.m3169("ۚܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-22753)) ^ (-2037689913);
                        i6 = 2009508630;
                    } else {
                        iM2761 = C0619.m2761("᩹᩺") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21845)) ^ 435027158;
                        i6 = -598376480;
                    }
                    break;
                case -1745953100:
                case 1900764776:
                    m7419(1);
                    iM2761 = C0619.m2761("ۗܽ") ^ i3;
                    i5 = ((iM2761 ^ i4) * (-8451)) ^ 1559218550;
                    i6 = -668055034;
                    break;
                case -1646622926:
                case -885006041:
                    C0862.m3503();
                    if (!C2023.f6737) {
                        iM2761 = C0619.m2761("ۖܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 19145) ^ (-303521475);
                        i6 = 469514531;
                    } else {
                        iM2761 = (C0619.m2761("֡ۡ") + i4) * 89;
                        i5 = ((iM2761 ^ i3) * 5697) ^ 1385266000;
                        i6 = 1088711564;
                    }
                    break;
                case -1154146542:
                case 65494223:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (i4 - C0619.m2761("ۗܿ")) * (-111);
                        i5 = ((iM2761 ^ i3) * 27453) ^ 648957103;
                        i6 = 1063910127;
                    } else {
                        iM2761 = C0619.m2761("᩻᩺") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-24501)) ^ (-1943809755);
                        i6 = -1562938874;
                    }
                    break;
                case -784876142:
                case -275473112:
                    C11850.m29690(interfaceC25004, atomicBoolean);
                    if (C0950.f3488 >= 0) {
                        iM2761 = (i4 - C0619.m2761("ۗܿ")) * (-111);
                        i5 = ((iM2761 ^ i3) * 27453) ^ 648957103;
                        i6 = 1063910127;
                    } else {
                        iM2761 = (i4 - C0773.m3169("۫ۧ")) * 83;
                        i5 = ((iM2761 ^ i3) * (-4181)) ^ (-954033409);
                        i6 = -1837861259;
                    }
                    break;
                case -758174400:
                case 1096498066:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (i4 - C0619.m2761("ۗܿ")) * (-111);
                        i5 = ((iM2761 ^ i3) * 27453) ^ 648957103;
                        i6 = 1063910127;
                    } else {
                        iM2761 = (C0773.m3169("᩵ۛ") ^ i3) * (-69);
                        i5 = ((iM2761 ^ i4) * 12197) ^ (-1501478287);
                        i6 = -427115463;
                    }
                    break;
                case -519146994:
                case 1903469382:
                    if (C2485.f7950 != 0) {
                        iM2761 = (i4 - C0619.m2761("ۗܿ")) * (-111);
                        i5 = ((iM2761 ^ i3) * 27453) ^ 648957103;
                        i6 = 1063910127;
                    } else {
                        iM2761 = (C0773.m3169("ܶۡ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM2761 ^ i4) * 12383) ^ 2069852709;
                        i6 = 601940875;
                    }
                    break;
                case -478667560:
                case 626469910:
                    C2702.m8876();
                    C0862.m3503();
                    iM2761 = C0619.m2761("ۚ᩺") ^ i3;
                    i5 = ((iM2761 ^ i4) * (-29307)) ^ (-668249983);
                    i6 = -535235366;
                    break;
                case -382134637:
                case 535851597:
                    if (C0619.f2439) {
                        iM2761 = (C0619.m2761("֡ۡ") + i4) * 89;
                        i5 = ((iM2761 ^ i3) * 5697) ^ 1385266000;
                        i6 = 1088711564;
                    } else {
                        iM2761 = C0619.m2761("᩸ۢ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-12579)) ^ (-839494820);
                        i6 = 983217126;
                    }
                    break;
                case 66664544:
                case 1664253308:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("֡ۡ") + i4) * 89;
                        i5 = ((iM2761 ^ i3) * 5697) ^ 1385266000;
                        i6 = 1088711564;
                    } else {
                        iM2761 = C0773.m3169("۬᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * 8401) ^ 2145844902;
                        i6 = -598657961;
                    }
                    break;
                case 168095166:
                case 446994265:
                    C17202.m40372();
                    C2419.m8174();
                    return 0;
                case 357926586:
                case 631301260:
                    atomicBoolean = this.f7110;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("ۚ᩺") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-29307)) ^ (-668249983);
                        i6 = -535235366;
                    } else {
                        iM2761 = C0773.m3169("᩻۠") ^ i3;
                        i5 = ((iM2761 ^ i4) * 20619) ^ (-375650109);
                        i6 = 93016425;
                    }
                    break;
                case 736161101:
                case 1126755052:
                    C3099.m10095();
                    if (!C0862.m3503()) {
                        iM2761 = C0619.m2761("ۖܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 19145) ^ (-303521475);
                        i6 = 469514531;
                    } else {
                        iM2761 = C0773.m3169("ۚܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-22753)) ^ (-2037689913);
                        i6 = 2009508630;
                    }
                    break;
                case 842163908:
                case 1721322842:
                    return i;
                case 1343343040:
                case 1872493858:
                    C2834.m9344();
                    if (C2023.m6964() <= 0) {
                        iM2761 = (C0619.m2761("֡ۡ") + i4) * 89;
                        i5 = ((iM2761 ^ i3) * 5697) ^ 1385266000;
                        i6 = 1088711564;
                    } else {
                        iM2761 = C0619.m2761("ۚ᩺") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-29307)) ^ (-668249983);
                        i6 = -535235366;
                    }
                    break;
                case 1462128157:
                case 2036733797:
                    interfaceC25004 = this.f7108;
                    if (RunnableC1848.f6235) {
                        iM2761 = (i4 - C0619.m2761("ۗܿ")) * (-111);
                        i5 = ((iM2761 ^ i3) * 27453) ^ 648957103;
                        i6 = 1063910127;
                    } else {
                        iM2761 = C0773.m3169("᩺᩷") ^ i3;
                        i5 = ((iM2761 ^ i4) * 21101) ^ (-951527189);
                        i6 = -1993488955;
                    }
                    break;
                default:
                    i = ((FilterInputStream) this).in.read();
                    if (i != -1) {
                        iM2761 = C0773.m3169("۬֨") ^ i4;
                        i5 = ((iM2761 ^ i3) * 669) ^ (-731141834);
                        i6 = -603772606;
                    } else {
                        iM2761 = C0619.m2761("ۗܽ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-8451)) ^ 1559218550;
                        i6 = -668055034;
                    }
                    break;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC25004 interfaceC25004 = null;
        int i3 = 0;
        int i4 = 694524609;
        int i5 = C2354.f7599;
        int i6 = AbstractC3624.f12429;
        int iM2761 = (C0619.m2761("ۢۚ") ^ i5) * 39;
        int i7 = ((iM2761 ^ i6) * (-9187)) ^ (-2138614883);
        int i8 = 1723212618;
        while (true) {
            i4 = ((((i4 ^ i6) * (-25477)) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i4) {
                case -2128694004:
                case 602755549:
                    if (C0862.f3233 != 0) {
                        iM2761 = C0619.m2761("۬ܿ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 20271) ^ 1669339428;
                        i8 = 129317296;
                    } else {
                        iM2761 = (C0619.m2761("ᩴܽ") + i5) * (-5);
                        i7 = ((iM2761 ^ i6) * (-26819)) ^ (-1698282672);
                        i8 = 28350642;
                    }
                    break;
                case -2088019003:
                case -891575232:
                    if (C1542.f5343 > 0) {
                        iM2761 = (i5 - C0773.m3169("ۙ᩵")) * 73;
                        i7 = ((iM2761 ^ i6) * 29709) ^ (-789524613);
                        i8 = -468382854;
                    } else {
                        iM2761 = C0773.m3169("ᩴܶ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 14129) ^ 379068206;
                        i8 = 1332874619;
                    }
                    break;
                case -1903572877:
                case -607277934:
                    if (C2966.m9664()) {
                        iM2761 = (i6 - C0619.m2761("ܽۙ")) * (-79);
                        i7 = ((iM2761 ^ i5) * (-4757)) ^ 1381576052;
                        i8 = -501986729;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۙ᩵")) * 73;
                        i7 = ((iM2761 ^ i6) * 29709) ^ (-789524613);
                        i8 = -468382854;
                    }
                    break;
                case -1737052206:
                case 39161861:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("ۛ᩹") ^ i6) * 71;
                        i7 = ((iM2761 ^ i5) * 1629) ^ 154555778;
                        i8 = 891839772;
                    } else {
                        iM2761 = (i5 - C0773.m3169("۠ۢ")) * (-65);
                        i7 = ((iM2761 ^ i6) * (-27281)) ^ (-499908695);
                        i8 = -1944534432;
                    }
                    break;
                case -1700429371:
                case 810039122:
                    if (C17202.m40372()) {
                        iM2761 = C0773.m3169("ܺܰ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 10933) ^ (-283039122);
                        i8 = 1838797129;
                    } else {
                        iM2761 = C0773.m3169("ᩴܶ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 14129) ^ 379068206;
                        i8 = 1332874619;
                    }
                    break;
                case -1677412855:
                case -1023838583:
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0619.m2761("᩵ۘ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-4019)) ^ 1635315776;
                        i8 = 1522046675;
                    } else {
                        iM2761 = C0773.m3169("ۖ᩷") ^ i6;
                        i7 = ((iM2761 ^ i5) * 7913) ^ (-619676380);
                        i8 = -783793042;
                    }
                    break;
                case -1617758395:
                case 77340147:
                    C2834.m9344();
                    return 0;
                case -1258980729:
                case 645143989:
                    interfaceC25004 = this.f7108;
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0619.m2761("۬ܿ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 20271) ^ 1669339428;
                        i8 = 129317296;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ܰ֨")) * 13;
                        i7 = ((iM2761 ^ i6) * (-11831)) ^ 1011338411;
                        i8 = 935939355;
                    }
                    break;
                case -1036219309:
                case 782908476:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0619.m2761("۬ܿ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 20271) ^ 1669339428;
                        i8 = 129317296;
                    } else {
                        iM2761 = C0619.m2761("ۡۨ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 1071) ^ (-638161805);
                        i8 = 1385800510;
                    }
                    break;
                case -821318386:
                case 1466116307:
                    C0773.m3161();
                    iM2761 = C0773.m3169("ᩴܶ") ^ i6;
                    i7 = ((iM2761 ^ i5) * 14129) ^ 379068206;
                    i8 = 1332874619;
                    break;
                case -286076668:
                case 801062769:
                    if (C17202.f56030) {
                        iM2761 = (C0773.m3169("ܺܳ") ^ i6) * (-83);
                        i7 = ((iM2761 ^ i5) * 30049) ^ 302917160;
                        i8 = 1330426123;
                    } else {
                        iM2761 = C0773.m3169("ᩴܶ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 14129) ^ 379068206;
                        i8 = 1332874619;
                    }
                    break;
                case -182345588:
                case 1520936656:
                    return i3;
                case 255190954:
                case 1280888745:
                    AbstractC0116.m1243();
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0773.m3169("ۛ᩹") ^ i6) * 71;
                        i7 = ((iM2761 ^ i5) * 1629) ^ 154555778;
                        i8 = 891839772;
                    } else {
                        iM2761 = C0619.m2761("᩵ۘ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-4019)) ^ 1635315776;
                        i8 = 1522046675;
                    }
                    break;
                case 339947367:
                case 1879216761:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("ᩴܶ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 14129) ^ 379068206;
                        i8 = 1332874619;
                    } else {
                        iM2761 = (C0619.m2761("ۢ᩹") ^ i6) * 65;
                        i7 = ((iM2761 ^ i5) * 6405) ^ 31422571;
                        i8 = 1784814880;
                    }
                    break;
                case 476665810:
                case 1468376966:
                    m7419(i3);
                    iM2761 = C0619.m2761("᩻ܺ") ^ i5;
                    i7 = ((iM2761 ^ i6) * 18027) ^ 254509707;
                    i8 = 1698862339;
                    break;
                case 758961789:
                case 2044493079:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("۬ܿ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 20271) ^ 1669339428;
                        i8 = 129317296;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ܿ۬")) * (-11);
                        i7 = ((iM2761 ^ i6) * 15127) ^ 859210290;
                        i8 = -402335742;
                    }
                    break;
                case 933862014:
                case 1004131440:
                    C2023.m6964();
                    if (C3492.f12043 > 0) {
                        iM2761 = C0619.m2761("᩵ۘ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-4019)) ^ 1635315776;
                        i8 = 1522046675;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۙ᩵")) * 73;
                        i7 = ((iM2761 ^ i6) * 29709) ^ (-789524613);
                        i8 = -468382854;
                    }
                    break;
                default:
                    C11850.m29690(interfaceC25004, this.f7110);
                    i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
                    if (i3 > 0) {
                        iM2761 = (C0619.m2761("֫۟") + i6) * (-51);
                        i7 = ((iM2761 ^ i5) * 28993) ^ (-930551294);
                        i8 = -2011283264;
                    } else {
                        iM2761 = C0619.m2761("᩻ܺ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 18027) ^ 254509707;
                        i8 = 1698862339;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01af A[PHI: r6 r12 r13 r14
      0x01af: PHI (r6v3 long) = (r6v1 long), (r6v1 long), (r6v1 long), (r6v1 long), (r6v2 long), (r6v1 long) binds: [B:54:0x01ad, B:50:0x018d, B:11:0x004f, B:8:0x0047, B:82:0x01af, B:98:0x01af] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r12v3 int) = (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:54:0x01ad, B:50:0x018d, B:11:0x004f, B:8:0x0047, B:82:0x01af, B:98:0x01af] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r13v3 short) = (r13v2 short), (r13v1 short), (r13v1 short), (r13v1 short), (r13v1 short), (r13v1 short) binds: [B:54:0x01ad, B:50:0x018d, B:11:0x004f, B:8:0x0047, B:82:0x01af, B:98:0x01af] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r14v3 int) = (r14v1 int), (r14v2 int), (r14v1 int), (r14v1 int), (r14v1 int), (r14v1 int) binds: [B:54:0x01ad, B:50:0x018d, B:11:0x004f, B:8:0x0047, B:82:0x01af, B:98:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0230 A[PHI: r4 r19 r20
      0x0230: PHI (r4v5 long) = (r4v1 long), (r4v2 long), (r4v1 long), (r4v1 long), (r4v1 long), (r4v1 long) binds: [B:66:0x022e, B:40:0x0115, B:21:0x0085, B:17:0x0073, B:11:0x004f, B:97:0x0230] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r19v8 short[]) = (r19v5 short[]), (r19v4 short[]), (r19v4 short[]), (r19v4 short[]), (r19v4 short[]), (r19v4 short[]) binds: [B:66:0x022e, B:40:0x0115, B:21:0x0085, B:17:0x0073, B:11:0x004f, B:97:0x0230] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r20v8 long) = (r20v1 long), (r20v5 long), (r20v1 long), (r20v1 long), (r20v1 long), (r20v1 long) binds: [B:66:0x022e, B:40:0x0115, B:21:0x0085, B:17:0x0073, B:11:0x004f, B:97:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x025e A[PHI: r9
      0x025e: PHI (r9v3 char) = (r9v1 char), (r9v2 char), (r9v1 char) binds: [B:70:0x025c, B:62:0x0213, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7419(int i) throws IOException {
        int iM2761;
        int i2;
        int iM2762;
        int i3;
        int i4;
        C2156 c2156 = this;
        long j = 0;
        long j2 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        short s3 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 380527681;
        int i9 = C3492.f12043;
        int i10 = C2288.f7433;
        int iM2763 = C0619.m2761("ۤܶ") ^ i10;
        int i11 = ((iM2763 ^ i9) * 16837) ^ (-984531512);
        int i12 = iM2763 ^ (-1853505124);
        short[] sArr = null;
        long j3 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i9) * (-15631)) >> 31));
            switch (i8) {
                case -2041380018:
                case 1634020624:
                    short[] sArr2 = f7107;
                    if (C1564.f5401 > 0) {
                        throw new IOException(C3690.m11996(sArr2, 1, 36, i7));
                    }
                    iM2761 = C0619.m2761("ۢ֫") ^ i10;
                    i11 = ((iM2761 ^ i9) * (-14901)) ^ 1954609557;
                    i2 = -1346894984;
                    i12 = i2 ^ iM2761;
                    c2156 = this;
                    break;
                case -1776478624:
                case 1706901790:
                    if (i5 - (i6 * i6) > 0) {
                        iM2761 = C0619.m2761("ܽܺ") ^ i10;
                        i11 = ((iM2761 ^ i9) * 11367) ^ 1827530694;
                        i2 = 120881373;
                    } else {
                        iM2761 = (i9 - C0619.m2761("۠۠")) * (-83);
                        i11 = ((iM2761 ^ i10) * 26667) ^ (-422454535);
                        i2 = -729220575;
                    }
                    i12 = i2 ^ iM2761;
                    c2156 = this;
                    break;
                case -1478447731:
                case -1141583060:
                    sArr = f7107;
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("ۢ֫") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-14901)) ^ 1954609557;
                        i2 = -1346894984;
                    } else {
                        iM2761 = (i10 - C0773.m3169("ۗۙ")) * (-53);
                        i11 = ((iM2761 ^ i9) * 16647) ^ (-1711782257);
                        i2 = -1194273330;
                    }
                    i12 = i2 ^ iM2761;
                    c2156 = this;
                    break;
                case -1220661726:
                case 1051342936:
                    C2288.m7767();
                    if (!C17202.m40372()) {
                        iM2762 = C0619.m2761("ܽۗ") ^ i9;
                        i3 = ((iM2762 ^ i10) * (-31309)) ^ 1468248300;
                        i4 = 1152911691;
                        int i13 = i3;
                        i12 = iM2762 ^ i4;
                        i11 = i13;
                    } else {
                        iM2761 = C0619.m2761("ۢ֫") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-14901)) ^ 1954609557;
                        i2 = -1346894984;
                        i12 = i2 ^ iM2761;
                        c2156 = this;
                    }
                    break;
                case -816479736:
                case 503054151:
                    c = 0;
                    if (C2702.f8586 <= 0) {
                        iM2761 = (i9 - C0773.m3169("᩻۫")) * (-75);
                        i11 = ((iM2761 ^ i10) * (-18223)) ^ (-1191349964);
                        i2 = 495242068;
                    } else {
                        iM2761 = C0619.m2761("ᩳۗ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-15233)) ^ 1112623940;
                        i2 = 80347066;
                    }
                    i12 = i2 ^ iM2761;
                    c2156 = this;
                    break;
                case -794351975:
                case 2058538430:
                    C3734.m12155(c2156.f7111);
                    if (j2 <= 9185280) {
                        iM2762 = (C0619.m2761("᩷᩺") + i9) * 47;
                        i3 = ((iM2762 ^ i10) * 24327) ^ (-564707656);
                        i4 = 1988845699;
                    } else {
                        iM2762 = (C0619.m2761("ᩳ۬") ^ i10) * (-5);
                        i3 = ((iM2762 ^ i9) * 14241) ^ 1716577435;
                        i4 = 1963934076;
                    }
                    int i14 = i3;
                    i12 = iM2762 ^ i4;
                    i11 = i14;
                    break;
                case -647757180:
                case 728281864:
                    i5 = s * s2;
                    s3 = 14948;
                    if (C3077.m10041()) {
                        iM2761 = (i10 - C0619.m2761("֨ۛ")) * (-37);
                        i11 = ((iM2761 ^ i9) * (-27403)) ^ (-1051369687);
                        i2 = 2097449676;
                    } else {
                        iM2761 = C0619.m2761("۫ܰ") ^ i9;
                        i11 = ((iM2761 ^ i10) * (-10309)) ^ (-1812529654);
                        i2 = 743957441;
                    }
                    i12 = i2 ^ iM2761;
                    c2156 = this;
                    break;
                case -597089257:
                case -203142192:
                    C17202.m40374(c2156.f7109, i);
                    return;
                case -476065970:
                case 139360676:
                    if (C11235.m28309() != 0) {
                        iM2761 = (i10 - C0619.m2761("֨ۛ")) * (-37);
                        i11 = ((iM2761 ^ i9) * (-27403)) ^ (-1051369687);
                        i2 = 2097449676;
                    } else {
                        iM2761 = (i9 - C0773.m3169("᩻۫")) * (-75);
                        i11 = ((iM2761 ^ i10) * (-18223)) ^ (-1191349964);
                        i2 = 495242068;
                    }
                    i12 = i2 ^ iM2761;
                    c2156 = this;
                    break;
                case -470754493:
                case 2095511015:
                    c2156.f7113 = j2;
                    if (C2288.f7433 > 0) {
                        iM2762 = C0773.m3169("ܳܰ") ^ i10;
                        i3 = ((iM2762 ^ i9) * 11431) ^ (-935177928);
                        i4 = -1292507239;
                        int i15 = i3;
                        i12 = iM2762 ^ i4;
                        i11 = i15;
                    } else {
                        iM2761 = (i10 - C0619.m2761("֨ۛ")) * (-37);
                        i11 = ((iM2761 ^ i9) * (-27403)) ^ (-1051369687);
                        i2 = 2097449676;
                        i12 = i2 ^ iM2761;
                        c2156 = this;
                    }
                    break;
                case -243715004:
                case 1701199901:
                    i7 = 6862;
                    iM2761 = (C0619.m2761("ۖ᩺") ^ i9) * 41;
                    i11 = ((iM2761 ^ i10) * 3121) ^ (-375367796);
                    i2 = -993226824;
                    i12 = i2 ^ iM2761;
                    c2156 = this;
                    break;
                case -203998701:
                case 121256197:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (i9 - C0773.m3169("᩻۫")) * (-75);
                        i11 = ((iM2761 ^ i10) * (-18223)) ^ (-1191349964);
                        i2 = 495242068;
                    } else {
                        iM2761 = (C0619.m2761("۬ۛ") + i9) * (-105);
                        i11 = ((iM2761 ^ i10) * (-161)) ^ 178498602;
                        i2 = 1755214469;
                    }
                    i12 = i2 ^ iM2761;
                    c2156 = this;
                    break;
                case -155921907:
                case 1257300969:
                    long j4 = c2156.f7113;
                    j = i;
                    if (C2023.m6964() <= 0) {
                        j3 = j4;
                        iM2761 = C0619.m2761("ۢ֫") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-14901)) ^ 1954609557;
                        i2 = -1346894984;
                        i12 = i2 ^ iM2761;
                    } else {
                        int iM3169 = (C0773.m3169("ۗ᩻") + i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        j3 = j4;
                        i12 = iM3169 ^ (-809004052);
                        i11 = ((iM3169 ^ i9) * 12007) ^ 1791467088;
                    }
                    c2156 = this;
                    break;
                case 49254508:
                case 1067557549:
                    i6 = s + s3;
                    if (C1826.f6190 <= 0) {
                        iM2761 = (i10 - C0619.m2761("֨ۛ")) * (-37);
                        i11 = ((iM2761 ^ i9) * (-27403)) ^ (-1051369687);
                        i2 = 2097449676;
                    } else {
                        iM2761 = C0773.m3169("֫ۛ") ^ i10;
                        i11 = ((iM2761 ^ i9) * 29445) ^ 430791274;
                        i2 = -196114515;
                    }
                    i12 = i2 ^ iM2761;
                    c2156 = this;
                    break;
                case 313499993:
                case 1084907115:
                    j2 = j3 + j;
                    if (C1564.m5509() > 0) {
                        iM2762 = C0773.m3169("ۢܳ") ^ i9;
                        i3 = ((iM2762 ^ i10) * (-18455)) ^ 307722281;
                        i4 = 1863366079;
                        int i16 = i3;
                        i12 = iM2762 ^ i4;
                        i11 = i16;
                    } else {
                        iM2761 = (i10 - C0619.m2761("֨ۛ")) * (-37);
                        i11 = ((iM2761 ^ i9) * (-27403)) ^ (-1051369687);
                        i2 = 2097449676;
                        i12 = i2 ^ iM2761;
                        c2156 = this;
                    }
                    break;
                case 778377173:
                case 1406829812:
                    i7 = 23632;
                    iM2761 = (C0619.m2761("ۖ᩺") ^ i9) * 41;
                    i11 = ((iM2761 ^ i10) * 3121) ^ (-375367796);
                    i2 = -993226824;
                    i12 = i2 ^ iM2761;
                    c2156 = this;
                    break;
                case 976641113:
                case 1477598269:
                    if (RunnableC1848.m6360()) {
                        iM2761 = (i10 - C0619.m2761("֨ۛ")) * (-37);
                        i11 = ((iM2761 ^ i9) * (-27403)) ^ (-1051369687);
                        i2 = 2097449676;
                    } else {
                        iM2761 = C0619.m2761("ۢ֫") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-14901)) ^ 1954609557;
                        i2 = -1346894984;
                    }
                    i12 = i2 ^ iM2761;
                    c2156 = this;
                    break;
                case 990105559:
                case 1721295395:
                    s = sArr[c];
                    s2 = 59792;
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("ۡܰ") ^ i10;
                        i11 = ((iM2761 ^ i9) * 24355) ^ 1740761787;
                        i2 = 1780253334;
                    } else {
                        iM2761 = (C0773.m3169("ܶ᩹") + i9) * 13;
                        i11 = ((iM2761 ^ i10) * 769) ^ 1365320589;
                        i2 = -621368616;
                    }
                    i12 = i2 ^ iM2761;
                    c2156 = this;
                    break;
                case 1464758968:
                case 2108223998:
                    C0950.m3785();
                    iM2761 = C0619.m2761("ۢ֫") ^ i10;
                    i11 = ((iM2761 ^ i9) * (-14901)) ^ 1954609557;
                    i2 = -1346894984;
                    i12 = i2 ^ iM2761;
                    c2156 = this;
                    break;
                default:
                    C0773.m3161();
                    C3734.m12152();
                    return;
            }
        }
    }
}
