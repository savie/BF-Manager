package l;

import android.text.Editable;
import android.widget.EditText;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 517G */
/* JADX INFO: loaded from: classes3.dex */
public final class C7295 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۘ۫ܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f24224 = {4029, -10928, 13369, 13890, -14893, 13603, -10725, 8159, -31098, -24112, 22412, 2001, -27966, -28910, -19640};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20701 f24225;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f24226;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ExecutorService f24227;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f24228;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f24229;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC10324 f24230;

    /* JADX WARN: Code duplicated, block: B:56:0x01be A[PHI: r4 r5 r10 r11 r12 r20
      0x01be: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:55:0x01bc, B:35:0x00dc, B:15:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:55:0x01bc, B:35:0x00dc, B:15:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:55:0x01bc, B:35:0x00dc, B:15:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:55:0x01bc, B:35:0x00dc, B:15:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:55:0x01bc, B:35:0x00dc, B:15:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r20v16 l.۫ܶۘ) = (r20v4 l.۫ܶۘ), (r20v10 l.۫ܶۘ), (r20v17 l.۫ܶۘ) binds: [B:55:0x01bc, B:35:0x00dc, B:15:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01f2 A[PHI: r3 r9 r20
      0x01f2: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:59:0x01f0, B:31:0x00b4, B:24:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:59:0x01f0, B:31:0x00b4, B:24:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r20v12 l.۫ܶۘ) = (r20v3 l.۫ܶۘ), (r20v11 l.۫ܶۘ), (r20v15 l.۫ܶۘ) binds: [B:59:0x01f0, B:31:0x00b4, B:24:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x024e A[PHI: r6 r15 r16 r20 r21
      0x024e: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:39:0x00fe, B:26:0x009e, B:6:0x0057, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:39:0x00fe, B:26:0x009e, B:6:0x0057, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r16v4 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v3 short[]), (r16v2 short[]) binds: [B:39:0x00fe, B:26:0x009e, B:6:0x0057, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r20v21 l.۫ܶۘ) = (r20v9 l.۫ܶۘ), (r20v14 l.۫ܶۘ), (r20v18 l.۫ܶۘ), (r20v22 l.۫ܶۘ) binds: [B:39:0x00fe, B:26:0x009e, B:6:0x0057, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r21v5 char) = (r21v3 char), (r21v3 char), (r21v4 char), (r21v3 char) binds: [B:39:0x00fe, B:26:0x009e, B:6:0x0057, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int i5 = C1460.f5948;
        int i6 = C1977.f7413;
        int iM11306 = ThreadFactoryC3888.m11306("ۨۗ") ^ i5;
        int i7 = ((iM11306 ^ i6) * (-24367)) ^ 1030784953;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM11306 ^ 746779978;
        AbstractActivityC12483 abstractActivityC12483 = null;
        int i9 = 0;
        int iM450211 = 0;
        int i10 = 0;
        int i11 = 0;
        short s = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = -1956247334;
        char c = 0;
        while (true) {
            i18 = i8 ^ (i7 & (((i18 ^ i6) * (-23043)) >> 31));
            switch (i18) {
                case -2141436258:
                case 71269194:
                    abstractActivityC12483 = abstractActivityC12483;
                    i12 = s + 9143;
                    if (C0629.f2722 <= 0) {
                        iM45029 = (C19806.m45029("ܶ۬") ^ i5) * 11;
                        i = ((iM45029 ^ i6) * 14403) ^ (-1006527118);
                        i2 = -1629221490;
                    } else {
                        iM45029 = (i5 - C19806.m45029("۠ۛ")) * (-85);
                        i = ((iM45029 ^ i6) * (-26785)) ^ (-73902672);
                        i2 = 1934667596;
                    }
                    AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    abstractActivityC12483 = abstractActivityC12484;
                    break;
                case -2056742070:
                case -595484231:
                    abstractActivityC12483 = abstractActivityC12483;
                    iM450211 = C19806.m45029(C1398.m4892(sArr2, i17, i11, i16));
                    i10 = 2127637223;
                    if (C10634.f36300 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬۬") + i6) * 31;
                        i = ((iM45029 ^ i5) * 26765) ^ (-279814906);
                        i2 = 1221446124;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۙ") + i5) * (-49);
                        i = ((iM45029 ^ i6) * (-15981)) ^ (-667900979);
                        i2 = 1544856943;
                    }
                    AbstractActivityC12483 abstractActivityC12485 = abstractActivityC12483;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    abstractActivityC12483 = abstractActivityC12485;
                    break;
                case -1926481738:
                case -82361455:
                    abstractActivityC12483 = abstractActivityC12483;
                    s = sArr[c];
                    if (C1460.f5948 >= 0) {
                        iM45029 = C19806.m45029("᩷ۖ") ^ i6;
                        i = ((iM45029 ^ i5) * 27549) ^ 2012572546;
                        i2 = 903859613;
                    } else {
                        iM45029 = C19806.m45029("᩶᩶") ^ i5;
                        i = ((iM45029 ^ i6) * (-18113)) ^ (-1047823782);
                        i2 = -534073284;
                    }
                    AbstractActivityC12483 abstractActivityC12486 = abstractActivityC12483;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    abstractActivityC12483 = abstractActivityC12486;
                    break;
                case -1874539525:
                case 675257678:
                    abstractActivityC12483 = abstractActivityC12483;
                    int i19 = i14 + i15;
                    if ((i19 + i19) - i13 >= 0) {
                        iM45029 = (i5 - C19806.m45029("᩷ᩳ")) * 127;
                        i = ((iM45029 ^ i6) * (-9823)) ^ (-2956929);
                        i2 = -545073760;
                    } else {
                        iM45029 = (C19806.m45029("ۛۚ") ^ i6) * (-93);
                        i = ((iM45029 ^ i5) * (-18919)) ^ 1552652086;
                        i2 = 134059371;
                    }
                    AbstractActivityC12483 abstractActivityC12487 = abstractActivityC12483;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    abstractActivityC12483 = abstractActivityC12487;
                    break;
                case -1724895964:
                case -467563184:
                    m10246(abstractActivityC12483, i9);
                    C17485 c17485 = this.f12806;
                    if (RunnableC1606.m5473() == 0) {
                        abstractActivityC12483 = abstractActivityC12483;
                        final ExecutorService executorService = this.f24227;
                        if (C3286.m9798() > 0) {
                            c17485.m40697(new Runnable(this) { // from class: l.ۤۜۘ

                                /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                                public final /* synthetic */ C7295 f34528;

                                {
                                    int i20 = 763888354;
                                    int i21 = C2477.f9839;
                                    int i22 = C1937.f7317;
                                    int iM11307 = ThreadFactoryC3888.m11306("֨ܳ") ^ i21;
                                    int i23 = ((iM11307 ^ i22) * (-22465)) ^ 1594280956;
                                    int i24 = 1551825081;
                                    while (true) {
                                        i20 = ((((i20 ^ i22) * (-25431)) >> 31) & i23) ^ (iM11307 ^ i24);
                                        switch (i20) {
                                            case -1868521435:
                                            case 77655367:
                                                if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                                    iM11307 = (C19806.m45029("ᩴ᩵") ^ i22) * (-103);
                                                    i23 = ((iM11307 ^ i21) * (-2753)) ^ (-1165236286);
                                                    i24 = -506840411;
                                                } else {
                                                    iM11307 = (ThreadFactoryC3888.m11306("۟᩺") ^ i21) * (-83);
                                                    i23 = ((iM11307 ^ i22) * 11415) ^ (-1883473508);
                                                    i24 = 1566841788;
                                                }
                                                break;
                                            case -1793932502:
                                            case 123315272:
                                                if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                                    iM11307 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i21;
                                                    i23 = ((iM11307 ^ i22) * (-20737)) ^ 1556715974;
                                                    i24 = -677224449;
                                                } else {
                                                    iM11307 = C19806.m45029("ܳ᩷") ^ i21;
                                                    i23 = ((iM11307 ^ i22) * (-28811)) ^ (-536796781);
                                                    i24 = -350405610;
                                                }
                                                break;
                                            case -1691565220:
                                            case -426176996:
                                                if (C1377.m4833() != 0) {
                                                    iM11307 = (C19806.m45029("ᩴ᩵") ^ i22) * (-103);
                                                    i23 = ((iM11307 ^ i21) * (-2753)) ^ (-1165236286);
                                                    i24 = -506840411;
                                                } else {
                                                    iM11307 = (C19806.m45029("ۜᩴ") ^ i22) * 23;
                                                    i23 = ((iM11307 ^ i21) * (-30035)) ^ (-2026026791);
                                                    i24 = 1851182306;
                                                }
                                                break;
                                            case -1511446357:
                                            case 2021213003:
                                                if (C1377.f5749) {
                                                    iM11307 = C19806.m45029("᩷ۗ") ^ i22;
                                                    i23 = ((iM11307 ^ i21) * 1521) ^ 1816101046;
                                                    i24 = -129552224;
                                                } else {
                                                    iM11307 = ThreadFactoryC3888.m11306("ۛܶ") ^ i22;
                                                    i23 = ((iM11307 ^ i21) * (-12729)) ^ (-441907475);
                                                    i24 = -853575126;
                                                }
                                                break;
                                            case -1508651948:
                                            case -1483709166:
                                                C3743.m10966();
                                                iM11307 = ThreadFactoryC3888.m11306("ۛܶ") ^ i22;
                                                i23 = ((iM11307 ^ i21) * (-12729)) ^ (-441907475);
                                                i24 = -853575126;
                                                break;
                                            case -1494365708:
                                            case 944030897:
                                                if (C2788.f10625 >= 0) {
                                                    iM11307 = (C19806.m45029("ᩴ᩵") ^ i22) * (-103);
                                                    i23 = ((iM11307 ^ i21) * (-2753)) ^ (-1165236286);
                                                    i24 = -506840411;
                                                } else {
                                                    iM11307 = ThreadFactoryC3888.m11306("ܿۙ") ^ i22;
                                                    i23 = ((iM11307 ^ i21) * 16189) ^ 2087029559;
                                                    i24 = -283345072;
                                                }
                                                break;
                                            case -1245766383:
                                            case 1135029345:
                                                return;
                                            case -1234459016:
                                            case 1592563493:
                                                C2332.m7079();
                                                if (C1398.f5802 > 0) {
                                                    iM11307 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i21;
                                                    i23 = ((iM11307 ^ i22) * (-20737)) ^ 1556715974;
                                                    i24 = -677224449;
                                                } else {
                                                    iM11307 = ThreadFactoryC3888.m11306("ۛܶ") ^ i22;
                                                    i23 = ((iM11307 ^ i21) * (-12729)) ^ (-441907475);
                                                    i24 = -853575126;
                                                }
                                                break;
                                            case -1192632696:
                                            case -1033465954:
                                                if (C0629.f2722 <= 0) {
                                                    iM11307 = (C19806.m45029("ᩴ᩵") ^ i22) * (-103);
                                                    i23 = ((iM11307 ^ i21) * (-2753)) ^ (-1165236286);
                                                    i24 = -506840411;
                                                } else {
                                                    iM11307 = ThreadFactoryC3888.m11306("ᩴᩴ") ^ i22;
                                                    i23 = ((iM11307 ^ i21) * 2133) ^ (-1972814179);
                                                    i24 = -320430171;
                                                }
                                                break;
                                            case -1167825511:
                                            case 648271100:
                                                C2332.m7079();
                                                C1937.m6279();
                                                throw new RuntimeException();
                                            case -1028301043:
                                            case 1039343189:
                                                if (C2642.m8171() != 0) {
                                                    iM11307 = (ThreadFactoryC3888.m11306("᩹᩶") + i21) * 49;
                                                    i23 = ((iM11307 ^ i22) * (-6781)) ^ (-1669140156);
                                                    i24 = -1796308567;
                                                } else {
                                                    iM11307 = (i22 - ThreadFactoryC3888.m11306("ۡ֨")) * 19;
                                                    i23 = ((iM11307 ^ i21) * 23169) ^ (-1966490372);
                                                    i24 = 110441657;
                                                }
                                                break;
                                            case -943399255:
                                            case 129378037:
                                                ThreadFactoryC3888.m11300();
                                                if (C0216.m1591() > 0) {
                                                    iM11307 = (ThreadFactoryC3888.m11306("᩹᩶") + i21) * 49;
                                                    i23 = ((iM11307 ^ i22) * (-6781)) ^ (-1669140156);
                                                    i24 = -1796308567;
                                                } else {
                                                    iM11307 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i21;
                                                    i23 = ((iM11307 ^ i22) * (-20737)) ^ 1556715974;
                                                    i24 = -677224449;
                                                }
                                                break;
                                            case -286590542:
                                            case 1437301140:
                                                if (C1668.f6641 < 0) {
                                                    iM11307 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i21;
                                                    i23 = ((iM11307 ^ i22) * (-20737)) ^ 1556715974;
                                                    i24 = -677224449;
                                                } else {
                                                    iM11307 = C19806.m45029("֡ۜ") ^ i22;
                                                    i23 = ((iM11307 ^ i21) * (-4551)) ^ 1108420421;
                                                    i24 = -1253026029;
                                                }
                                                break;
                                            case -10403880:
                                            case 743393500:
                                                this.f34528 = this;
                                                if (ThreadFactoryC3888.f14547 <= 0) {
                                                    iM11307 = ThreadFactoryC3888.m11306("ۛܶ") ^ i22;
                                                    i23 = ((iM11307 ^ i21) * (-12729)) ^ (-441907475);
                                                    i24 = -853575126;
                                                } else {
                                                    iM11307 = (ThreadFactoryC3888.m11306("ۛ᩷") + i21) * 27;
                                                    i23 = ((iM11307 ^ i22) * (-5501)) ^ 1162044044;
                                                    i24 = 1940465242;
                                                }
                                                break;
                                            case 335052429:
                                            case 1201254568:
                                                if (C2477.f9839 <= 0) {
                                                    iM11307 = (C19806.m45029("ᩴ᩵") ^ i22) * (-103);
                                                    i23 = ((iM11307 ^ i21) * (-2753)) ^ (-1165236286);
                                                    i24 = -506840411;
                                                } else {
                                                    iM11307 = (ThreadFactoryC3888.m11306("ܶۡ") ^ i21) * 89;
                                                    i23 = ((iM11307 ^ i22) * (-26369)) ^ 768128339;
                                                    i24 = -610271157;
                                                }
                                                break;
                                            default:
                                                if (C2477.f9839 <= 0) {
                                                    iM11307 = (C19806.m45029("ᩴ᩵") ^ i22) * (-103);
                                                    i23 = ((iM11307 ^ i21) * (-2753)) ^ (-1165236286);
                                                    i24 = -506840411;
                                                } else {
                                                    iM11307 = (ThreadFactoryC3888.m11306("ܺۢ") + i21) * 35;
                                                    i23 = ((iM11307 ^ i22) * (-20723)) ^ 1238380917;
                                                    i24 = -1800074276;
                                                }
                                                break;
                                        }
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C7295.m19446(this.f34528, executorService);
                                }
                            });
                            this.f24230.mo26151();
                        }
                        iM45029 = ThreadFactoryC3888.m11306("۫֫") ^ i5;
                        i = ((iM45029 ^ i6) * 20035) ^ 1810227965;
                        i2 = 580952783;
                        AbstractActivityC12483 abstractActivityC12488 = abstractActivityC12483;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                        abstractActivityC12483 = abstractActivityC12488;
                    } else {
                        abstractActivityC12483 = abstractActivityC12483;
                        iM45029 = (C19806.m45029("ܶ۬") ^ i5) * 11;
                        i = ((iM45029 ^ i6) * 14403) ^ (-1006527118);
                        i2 = -1629221490;
                        AbstractActivityC12483 abstractActivityC12489 = abstractActivityC12483;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                        abstractActivityC12483 = abstractActivityC12489;
                    }
                    break;
                case -1624555493:
                case -99949690:
                    i16 = 58989;
                    iM45029 = ThreadFactoryC3888.m11306("֫ۛ") ^ i5;
                    i = ((iM45029 ^ i6) * (-30969)) ^ (-1163363775);
                    i2 = 1404413921;
                    AbstractActivityC12483 abstractActivityC124810 = abstractActivityC12483;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    abstractActivityC12483 = abstractActivityC124810;
                    break;
                case -1577788696:
                case -1214016313:
                    abstractActivityC12483 = this.f24225.f67319;
                    sArr2 = f24224;
                    if (C2124.f7782 <= 0) {
                        iM450210 = (i6 - ThreadFactoryC3888.m11306("ۜ۟")) * 57;
                        i3 = ((iM450210 ^ i5) * (-22513)) ^ (-1739614612);
                        i4 = 32075997;
                    } else {
                        iM450210 = (C19806.m45029("᩷ܳ") ^ i6) * 81;
                        i3 = ((iM450210 ^ i5) * (-12277)) ^ 621945141;
                        i4 = -484152744;
                    }
                    i8 = iM450210 ^ i4;
                    i7 = i3;
                    break;
                case -1509610352:
                case 446312148:
                    if (C2704.m8255() > 0) {
                        abstractActivityC12483 = abstractActivityC12483;
                        iM45029 = ThreadFactoryC3888.m11306("۫֫") ^ i5;
                        i = ((iM45029 ^ i6) * 20035) ^ 1810227965;
                        i2 = 580952783;
                        AbstractActivityC12483 abstractActivityC124811 = abstractActivityC12483;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                        abstractActivityC12483 = abstractActivityC124811;
                    } else {
                        iM450210 = (i6 - ThreadFactoryC3888.m11306("ۜ۟")) * 57;
                        i3 = ((iM450210 ^ i5) * (-22513)) ^ (-1739614612);
                        i4 = 32075997;
                        i8 = iM450210 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -961086631:
                case 29021458:
                    C1148.m4232();
                    iM450210 = (i6 - ThreadFactoryC3888.m11306("ۜ۟")) * 57;
                    i3 = ((iM450210 ^ i5) * (-22513)) ^ (-1739614612);
                    i4 = 32075997;
                    i8 = iM450210 ^ i4;
                    i7 = i3;
                    break;
                case -690305946:
                case 933104549:
                    abstractActivityC12483 = abstractActivityC12483;
                    i13 = i12 * i12;
                    i14 = s * s;
                    i15 = 83594449;
                    if (C1066.m4023() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬۬") + i6) * 31;
                        i = ((iM45029 ^ i5) * 26765) ^ (-279814906);
                        i2 = 1221446124;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬۠") ^ i6;
                        i = ((iM45029 ^ i5) * 15303) ^ (-1347539489);
                        i2 = 2050678206;
                    }
                    AbstractActivityC12483 abstractActivityC124812 = abstractActivityC12483;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    abstractActivityC12483 = abstractActivityC124812;
                    break;
                case 194588070:
                case 2085602908:
                    abstractActivityC12483 = abstractActivityC12483;
                    i9 = iM450211 ^ i10;
                    if (C1937.f7317 >= 0) {
                        iM45029 = (C19806.m45029("ܶ۬") ^ i5) * 11;
                        i = ((iM45029 ^ i6) * 14403) ^ (-1006527118);
                        i2 = -1629221490;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܺ") ^ i5;
                        i = ((iM45029 ^ i6) * (-14849)) ^ (-1450478591);
                        i2 = 3652959;
                    }
                    AbstractActivityC12483 abstractActivityC124813 = abstractActivityC12483;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    abstractActivityC12483 = abstractActivityC124813;
                    break;
                case 389998528:
                case 1557626639:
                    abstractActivityC12483 = abstractActivityC12483;
                    i17 = 12;
                    i11 = 3;
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("۫֫") ^ i5;
                        i = ((iM45029 ^ i6) * 20035) ^ 1810227965;
                        i2 = 580952783;
                    } else {
                        iM45029 = C19806.m45029("۟᩷") ^ i6;
                        i = ((iM45029 ^ i5) * 5135) ^ 1670676389;
                        i2 = -1903897787;
                    }
                    AbstractActivityC12483 abstractActivityC124814 = abstractActivityC12483;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    abstractActivityC12483 = abstractActivityC124814;
                    break;
                case 700534249:
                case 1122386660:
                    RunnableC0195.m1431();
                    break;
                case 870897434:
                case 1476246595:
                    i16 = 26385;
                    iM45029 = ThreadFactoryC3888.m11306("֫ۛ") ^ i5;
                    i = ((iM45029 ^ i6) * (-30969)) ^ (-1163363775);
                    i2 = 1404413921;
                    AbstractActivityC12483 abstractActivityC124815 = abstractActivityC12483;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    abstractActivityC12483 = abstractActivityC124815;
                    break;
                case 1376928974:
                case 1716016880:
                    if (C0050.f912 > 0) {
                        abstractActivityC12483 = abstractActivityC12483;
                        iM45029 = C19806.m45029("᩷ۖ") ^ i6;
                        i = ((iM45029 ^ i5) * 27549) ^ 2012572546;
                        i2 = 903859613;
                        AbstractActivityC12483 abstractActivityC124816 = abstractActivityC12483;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                        abstractActivityC12483 = abstractActivityC124816;
                    } else {
                        iM450210 = (i6 - ThreadFactoryC3888.m11306("ۜ۟")) * 57;
                        i3 = ((iM450210 ^ i5) * (-22513)) ^ (-1739614612);
                        i4 = 32075997;
                        i8 = iM450210 ^ i4;
                        i7 = i3;
                    }
                    break;
                case 1742301990:
                case 1990716765:
                    RunnableC0195.m1431();
                    if (C1148.f5161 > 0) {
                        abstractActivityC12483 = abstractActivityC12483;
                        iM45029 = (ThreadFactoryC3888.m11306("۬۬") + i6) * 31;
                        i = ((iM45029 ^ i5) * 26765) ^ (-279814906);
                        i2 = 1221446124;
                        AbstractActivityC12483 abstractActivityC124817 = abstractActivityC12483;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                        abstractActivityC12483 = abstractActivityC124817;
                    }
                    abstractActivityC12483 = abstractActivityC12483;
                    iM45029 = ThreadFactoryC3888.m11306("۫֫") ^ i5;
                    i = ((iM45029 ^ i6) * 20035) ^ 1810227965;
                    i2 = 580952783;
                    AbstractActivityC12483 abstractActivityC124818 = abstractActivityC12483;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    abstractActivityC12483 = abstractActivityC124818;
                    break;
                default:
                    abstractActivityC12483 = abstractActivityC12483;
                    sArr = f24224;
                    c = 11;
                    if (C2788.f10625 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫֫") ^ i5;
                        i = ((iM45029 ^ i6) * 20035) ^ 1810227965;
                        i2 = 580952783;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۨ") ^ i6;
                        i = ((iM45029 ^ i5) * 15461) ^ (-202849312);
                        i2 = -1458423396;
                    }
                    AbstractActivityC12483 abstractActivityC124819 = abstractActivityC12483;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    abstractActivityC12483 = abstractActivityC124819;
                    break;
            }
            return;
        }
    }

    public C7295(C20701 c20701, ExecutorService executorService, AbstractC10324 abstractC10324, EditText editText, EditText editText2) {
        int i = -1023871308;
        int i2 = RunnableC0195.f1321;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        this.f24225 = c20701;
        this.f24227 = executorService;
        this.f24230 = abstractC10324;
        this.f24228 = editText;
        this.f24226 = editText2;
        int iM11306 = (i2 - ThreadFactoryC3888.m11306("᩵ۢ")) * (-19);
        int i4 = ((iM11306 ^ i3) * (-1505)) ^ 1016401461;
        int i5 = 1105290955;
        while (true) {
            i = (iM11306 ^ i5) ^ (i4 & (((i ^ i3) * 31349) >> 31));
            switch (i) {
                case -2138284649:
                case -1765859579:
                    if (C0817.f3443) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۤ") + i3) * (-101);
                        i4 = ((iM11306 ^ i2) * 14115) ^ 1696822364;
                        i5 = 474212549;
                    } else {
                        iM11306 = (C19806.m45029("ܶܺ") + i2) * (-17);
                        i4 = ((iM11306 ^ i3) * 9189) ^ 1178646330;
                        i5 = 1965656338;
                    }
                    break;
                case -1978832050:
                case 674922480:
                    RunnableC0195.m1431();
                    if (!RunnableC3388.m10064()) {
                        iM11306 = C19806.m45029("ᩳ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4413) ^ 772227530;
                        i5 = -1136578910;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨܶ") + i2) * (-17);
                        i4 = ((iM11306 ^ i3) * (-9625)) ^ (-280219067);
                        i5 = -315589063;
                    }
                    break;
                case -1658250985:
                case 1804925035:
                    if (C1377.f5749) {
                        iM11306 = (i3 - C19806.m45029("ۧۤ")) * (-57);
                        i4 = ((iM11306 ^ i2) * (-13467)) ^ 762732071;
                        i5 = -1397277640;
                    } else {
                        iM11306 = C19806.m45029("ᩳ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4413) ^ 772227530;
                        i5 = -1136578910;
                    }
                    break;
                case -524802921:
                case 179581210:
                    RunnableC0195.m1431();
                    throw new RuntimeException();
                case -500782901:
                case 490734221:
                    if (C7105.f23796 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨܶ") + i2) * (-17);
                        i4 = ((iM11306 ^ i3) * (-9625)) ^ (-280219067);
                        i5 = -315589063;
                    } else {
                        iM11306 = C19806.m45029("᩸ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18061) ^ 558461961;
                        i5 = 1131334068;
                    }
                    break;
                case -187836448:
                case 1688541235:
                    return;
                default:
                    ThreadFactoryC3888.m11300();
                    iM11306 = C19806.m45029("᩸ۨ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 18061) ^ 558461961;
                    i5 = 1131334068;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19446(C7295 c7295, ExecutorService executorService) {
        C17485 c17485 = null;
        int i = -1063541379;
        int i2 = C3535.f13026;
        int i3 = C1460.f5948;
        int iM11306 = ThreadFactoryC3888.m11306("᩺ۡ") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-8531)) ^ (-777132790);
        int i5 = 2106380249;
        while (true) {
            i = ((((i ^ i2) * (-5175)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2095867033:
                case 1648963287:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۙۗ")) * 15;
                        i4 = ((iM11306 ^ i3) * 9973) ^ (-738869874);
                        i5 = -2022398795;
                    } else {
                        iM11306 = C19806.m45029("ᩴۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22203) ^ 782826403;
                        i5 = -9684731;
                    }
                    break;
                case -1942207128:
                case -1900211528:
                    if (C19806.f63586) {
                        iM11306 = (i2 - C19806.m45029("ᩳᩴ")) * (-117);
                        i4 = ((iM11306 ^ i3) * 26285) ^ (-1778542414);
                        i5 = 497475260;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧ᩸")) * (-19);
                        i4 = ((iM11306 ^ i2) * (-18951)) ^ 834614744;
                        i5 = 1540827276;
                    }
                    break;
                case -1741930491:
                case 1900434253:
                    if (C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18751)) ^ 655496213;
                        i5 = -243978067;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۙۗ")) * 15;
                        i4 = ((iM11306 ^ i3) * 9973) ^ (-738869874);
                        i5 = -2022398795;
                    }
                    break;
                case -1717997112:
                case 563581876:
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("ᩴۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22203) ^ 782826403;
                        i5 = -9684731;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-8659)) ^ 1026848067;
                        i5 = -456127028;
                    }
                    break;
                case -1601224716:
                case 1213692554:
                    C1025.m3861();
                    break;
                case -1544336903:
                case -165219788:
                    C2788.m8472();
                    iM11306 = C19806.m45029("ᩴۢ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 22203) ^ 782826403;
                    i5 = -9684731;
                    break;
                case -1344357240:
                case -1339943724:
                    if (C2332.f8260) {
                        iM11306 = (C19806.m45029("ۗ᩸") + i2) * 127;
                        i4 = ((iM11306 ^ i3) * 27065) ^ (-2080551520);
                        i5 = 571647107;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩹۫")) * (-99);
                        i4 = ((iM11306 ^ i2) * 3247) ^ 600249909;
                        i5 = 1335480179;
                    }
                    break;
                case -1297710621:
                case -869937947:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩹۫")) * (-99);
                        i4 = ((iM11306 ^ i2) * 3247) ^ 600249909;
                        i5 = 1335480179;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 10023) ^ 1828361889;
                        i5 = -200683198;
                    }
                    break;
                case -1216934757:
                case 169640595:
                    if (C3286.f12186) {
                        iM11306 = (i2 - C19806.m45029("ᩳᩴ")) * (-117);
                        i4 = ((iM11306 ^ i3) * 26285) ^ (-1778542414);
                        i5 = 497475260;
                    } else {
                        iM11306 = (C19806.m45029("ۤۢ") + i3) * 25;
                        i4 = ((iM11306 ^ i2) * 18267) ^ (-107449931);
                        i5 = -160791616;
                    }
                    break;
                case -1154422686:
                case -678483687:
                    if (C3286.f12186) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۙۗ")) * 15;
                        i4 = ((iM11306 ^ i3) * 9973) ^ (-738869874);
                        i5 = -2022398795;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ܶ") ^ i3) * (-15);
                        i4 = ((iM11306 ^ i2) * 19325) ^ 154868158;
                        i5 = 738511137;
                    }
                    break;
                case -704449464:
                case 765560470:
                    if (!C19806.f63586) {
                        iM11306 = C19806.m45029("ᩴۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22203) ^ 782826403;
                        i5 = -9684731;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩹۫")) * (-99);
                        i4 = ((iM11306 ^ i2) * 3247) ^ 600249909;
                        i5 = 1335480179;
                    }
                    break;
                case 35123001:
                case 425855930:
                    C7105.m18985();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("ᩴۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22203) ^ 782826403;
                        i5 = -9684731;
                    } else {
                        iM11306 = (C19806.m45029("ۙۙ") + i3) * (-49);
                        i4 = ((iM11306 ^ i2) * (-18679)) ^ 1979325808;
                        i5 = -1583315650;
                    }
                    break;
                case 265751301:
                case 1463005037:
                    C1419.m4978(c17485);
                    executorService.shutdownNow();
                    break;
                case 358830672:
                case 1327591975:
                    if (C3286.m9798() <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۙۗ")) * 15;
                        i4 = ((iM11306 ^ i3) * 9973) ^ (-738869874);
                        i5 = -2022398795;
                    } else {
                        iM11306 = C19806.m45029("ܰۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19663)) ^ 1562154455;
                        i5 = -392702686;
                    }
                    break;
                case 1223318203:
                case 1236452205:
                    if (C19806.f63586) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩹۫")) * (-99);
                        i4 = ((iM11306 ^ i2) * 3247) ^ 600249909;
                        i5 = 1335480179;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27215)) ^ (-294046596);
                        i5 = 782669199;
                    }
                    break;
                default:
                    c17485 = c7295.f12806;
                    if (C1460.m5050() != 0) {
                        iM11306 = (i2 - C19806.m45029("ᩳᩴ")) * (-117);
                        i4 = ((iM11306 ^ i3) * 26285) ^ (-1778542414);
                        i5 = 497475260;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡᩸") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i2) * (-30129)) ^ (-1801109576);
                        i5 = -1298608062;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        AbstractC10324 abstractC10324 = null;
        Editable editableM9864 = null;
        String strM3407 = null;
        String str = null;
        String strMo26150 = null;
        int i = -1634740255;
        int i2 = RunnableC1606.f6488;
        int i3 = ThreadFactoryC3888.f14547;
        int iM11306 = ThreadFactoryC3888.m11306("ۜ᩻") ^ i2;
        int i4 = ((iM11306 ^ i3) * 12493) ^ (-1043328259);
        int i5 = -1681582743;
        while (true) {
            i = ((((i ^ i3) * (-27367)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2022557539:
                case -666102240:
                    if (C1461.f5957 <= 0) {
                        iM11306 = C19806.m45029("᩷᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3885) ^ (-101102656);
                        i5 = -1343044103;
                    } else {
                        iM11306 = C19806.m45029("ᩴ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28315)) ^ (-178429699);
                        i5 = -1210470018;
                    }
                    break;
                case -1864727891:
                case 1496162916:
                    abstractC10324.mo26149();
                    if (C3722.f13525 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۘ") ^ i3) * 69;
                        i4 = ((iM11306 ^ i2) * 961) ^ 2131866938;
                        i5 = -1603719835;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۗ") + i3) * (-71);
                        i4 = ((iM11306 ^ i2) * (-6871)) ^ (-1405682093);
                        i5 = 158271554;
                    }
                    break;
                case -1727367044:
                case -1271298402:
                    strMo26150 = abstractC10324.mo26150(strM3407, str);
                    if (C1460.m5050() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۘ") ^ i3) * 69;
                        i4 = ((iM11306 ^ i2) * 961) ^ 2131866938;
                        i5 = -1603719835;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۛ") ^ i3) * (-127);
                        i4 = ((iM11306 ^ i2) * (-21299)) ^ 693118060;
                        i5 = 829406860;
                    }
                    break;
                case -1570563493:
                case 131736923:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ۘ᩹")) * 35;
                        i4 = ((iM11306 ^ i3) * (-31891)) ^ 596809596;
                        i5 = -1341108702;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29925)) ^ (-482167791);
                        i5 = 440379697;
                    }
                    break;
                case -1198444473:
                case -391265896:
                    if (!C0629.m2907()) {
                        iM11306 = C19806.m45029("᩷᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3885) ^ (-101102656);
                        i5 = -1343044103;
                    } else {
                        iM11306 = C19806.m45029("᩶ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19233) ^ 2114475269;
                        i5 = -1440367817;
                    }
                    break;
                case -722658337:
                case -507969135:
                    if (C0962.f3784) {
                        iM11306 = (i2 - C19806.m45029("ۘ᩹")) * 35;
                        i4 = ((iM11306 ^ i3) * (-31891)) ^ 596809596;
                        i5 = -1341108702;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۡ۠")) * (-75);
                        i4 = ((iM11306 ^ i3) * (-5645)) ^ (-144014846);
                        i5 = 752748896;
                    }
                    break;
                case -421499427:
                case 1076256197:
                    C1668.m5583();
                    iM11306 = C19806.m45029("᩶ܳ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 19233) ^ 2114475269;
                    i5 = -1440367817;
                    break;
                case -416444950:
                case 967397036:
                    if (C3743.f13569) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳۙ") ^ i3) * 69;
                        i4 = ((iM11306 ^ i2) * 29055) ^ 1948892691;
                        i5 = -1870656854;
                    } else {
                        iM11306 = C19806.m45029("᩺ۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17761)) ^ 625669607;
                        i5 = -502364522;
                    }
                    break;
                case -180935977:
                case 1497932527:
                    strM3407 = C0817.m3407(editableM9864);
                    str = null;
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = (i2 - C19806.m45029("ۘ᩹")) * 35;
                        i4 = ((iM11306 ^ i3) * (-31891)) ^ 596809596;
                        i5 = -1341108702;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28623) ^ (-1669546128);
                        i5 = 1542286164;
                    }
                    break;
                case -62584242:
                case 776853898:
                    C1668.m5583();
                    RunnableC1895.m6170();
                    break;
                case 20163638:
                case 2054287783:
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۘ") ^ i3) * 69;
                        i4 = ((iM11306 ^ i2) * 961) ^ 2131866938;
                        i5 = -1603719835;
                    } else {
                        iM11306 = C19806.m45029("᩺ۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17761)) ^ 625669607;
                        i5 = -502364522;
                    }
                    break;
                case 232418284:
                case 437013833:
                    C1977.m6356();
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۘ") ^ i3) * 69;
                        i4 = ((iM11306 ^ i2) * 961) ^ 2131866938;
                        i5 = -1603719835;
                    } else {
                        iM11306 = C19806.m45029("᩶ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19233) ^ 2114475269;
                        i5 = -1440367817;
                    }
                    break;
                case 366292343:
                case 928376860:
                    this.f24229 = strMo26150;
                    abstractC10324.mo26152();
                    break;
                case 581614964:
                case 1947348142:
                    abstractC10324 = this.f24230;
                    if (C2332.m7079() <= 0) {
                        iM11306 = C19806.m45029("᩷᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3885) ^ (-101102656);
                        i5 = -1343044103;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛ۬") + i2) * (-75);
                        i4 = ((iM11306 ^ i3) * (-945)) ^ 1128587831;
                        i5 = -1134960186;
                    }
                    break;
                case 1281300670:
                case 1795198850:
                    if (C0817.f3443) {
                        iM11306 = (C19806.m45029("۬᩸") + i2) * (-121);
                        i4 = ((iM11306 ^ i3) * 9359) ^ 1718002446;
                        i5 = -1692349552;
                    } else {
                        iM11306 = C19806.m45029("᩷᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3885) ^ (-101102656);
                        i5 = -1343044103;
                    }
                    break;
                default:
                    editableM9864 = ViewTreeObserverOnPreDrawListenerC3327.m9864(this.f24228);
                    if (C0797.f3386) {
                        iM11306 = (i2 - C19806.m45029("ۘ᩹")) * 35;
                        i4 = ((iM11306 ^ i3) * (-31891)) ^ 596809596;
                        i5 = -1341108702;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-4641)) ^ (-2039226541);
                        i5 = 451137318;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0165 A[PHI: r12 r13
      0x0165: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:44:0x0163, B:39:0x0127, B:13:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:44:0x0163, B:39:0x0127, B:13:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x022a A[PHI: r2 r8 r9 r21
      0x022a: PHI (r2v3 int) = (r2v1 int), (r2v2 int), (r2v1 int), (r2v1 int) binds: [B:59:0x0228, B:35:0x0107, B:18:0x007d, B:16:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:59:0x0228, B:35:0x0107, B:18:0x007d, B:16:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:59:0x0228, B:35:0x0107, B:18:0x007d, B:16:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r21v3 int) = (r21v1 int), (r21v2 int), (r21v1 int), (r21v1 int) binds: [B:59:0x0228, B:35:0x0107, B:18:0x007d, B:16:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x025e A[PHI: r3 r7
      0x025e: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v3 java.lang.String) binds: [B:63:0x025c, B:25:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r7v3 int) = (r7v2 int), (r7v1 int) binds: [B:63:0x025c, B:25:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02b2 A[PHI: r4 r6 r11 r14 r15 r16 r22
      0x02b2: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:71:0x02b0, B:67:0x0290, B:29:0x00c3, B:16:0x0079, B:13:0x0070, B:9:0x0051, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short), (r6v1 short), (r6v1 short), (r6v1 short), (r6v1 short) binds: [B:71:0x02b0, B:67:0x0290, B:29:0x00c3, B:16:0x0079, B:13:0x0070, B:9:0x0051, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r11v2 short[]) = (r11v1 short[]), (r11v1 short[]), (r11v1 short[]), (r11v1 short[]), (r11v1 short[]), (r11v1 short[]), (r11v4 short[]) binds: [B:71:0x02b0, B:67:0x0290, B:29:0x00c3, B:16:0x0079, B:13:0x0070, B:9:0x0051, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r14v3 short[]) = (r14v1 short[]), (r14v1 short[]), (r14v2 short[]), (r14v1 short[]), (r14v1 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:71:0x02b0, B:67:0x0290, B:29:0x00c3, B:16:0x0079, B:13:0x0070, B:9:0x0051, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r15v3 int) = (r15v1 int), (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int), (r15v1 int), (r15v1 int) binds: [B:71:0x02b0, B:67:0x0290, B:29:0x00c3, B:16:0x0079, B:13:0x0070, B:9:0x0051, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:71:0x02b0, B:67:0x0290, B:29:0x00c3, B:16:0x0079, B:13:0x0070, B:9:0x0051, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r22v5 char) = (r22v4 char), (r22v3 char), (r22v3 char), (r22v3 char), (r22v3 char), (r22v3 char), (r22v3 char) binds: [B:71:0x02b0, B:67:0x0290, B:29:0x00c3, B:16:0x0079, B:13:0x0070, B:9:0x0051, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        int iM45029;
        int i;
        int i2;
        int i3 = 0;
        String strM1588 = null;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 0;
        int i11 = -1754829817;
        int i12 = ThreadFactoryC3888.f14547;
        int i13 = AbstractC0464.f2088;
        int iM450210 = (i12 - C19806.m45029("᩻֡")) * 109;
        int i14 = ((iM450210 ^ i13) * 21343) ^ (-2115091877);
        int i15 = iM450210 ^ (-723626104);
        short[] sArr3 = null;
        int i16 = 0;
        int iM450211 = 0;
        char c = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * (-6697)) >> 31));
            switch (i11) {
                case -2090077629:
                case -823723949:
                    C3535.m10431();
                    C3722.m10894();
                    break;
                case -1806014784:
                case -382474670:
                    C0050.m946();
                    iM45029 = ThreadFactoryC3888.m11306("ۖۨ") ^ i12;
                    i = ((iM45029 ^ i13) * 23893) ^ 443128341;
                    i2 = -720854379;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -1659491695:
                case -683893976:
                    if (this.f12806.m40693()) {
                        iM45029 = (i12 - C19806.m45029("ۗܺ")) * (-61);
                        i = ((iM45029 ^ i13) * 24161) ^ (-1554559781);
                        i2 = -1302268694;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫᩹") ^ i13) * 73;
                        i = ((iM45029 ^ i12) * (-3831)) ^ (-609369486);
                        i2 = -2077519826;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -1406738420:
                case -521975408:
                    i5 = i4 * i4;
                    i6 = s * 2;
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۨ") ^ i12;
                        i = ((iM45029 ^ i13) * 23893) ^ 443128341;
                        i2 = -720854379;
                    } else {
                        iM45029 = (i13 - C19806.m45029("᩸ܽ")) * (-83);
                        i = ((iM45029 ^ i12) * 6669) ^ 714817159;
                        i2 = -1269632223;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -1339168641:
                case 400729072:
                    MenuItemOnMenuItemClickListenerC3244.m9704(this.f24226, this.f24229);
                    if (C2871.m8646()) {
                        iM45029 = (i13 - ThreadFactoryC3888.m11306("֡ܶ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM45029 ^ i12) * (-30149)) ^ (-826240501);
                        i2 = -21894184;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۬") ^ i12;
                        i = ((iM45029 ^ i13) * 15681) ^ 1402119047;
                        i2 = 71475575;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -1314958149:
                case -511910806:
                    C2788.m8472();
                    if (C3722.f13525 <= 0) {
                        iM45029 = (C19806.m45029("۬᩺") + i13) * 35;
                        i = ((iM45029 ^ i12) * 1319) ^ 883524207;
                        i2 = -55830163;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۬") ^ i12;
                        i = ((iM45029 ^ i13) * 15681) ^ 1402119047;
                        i2 = 71475575;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -1182764358:
                case -312996837:
                    if (i5 - (i6 + 1) >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺ۘ") + i13) * q.h;
                        i = ((iM45029 ^ i12) * (-16401)) ^ 1625908845;
                        i2 = -304156343;
                    } else {
                        iM45029 = C19806.m45029("᩸ۘ") ^ i12;
                        i = ((iM45029 ^ i13) * 9331) ^ 1249934919;
                        i2 = 905357645;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -1159964041:
                case 1670780969:
                    i7 = 5921;
                    iM45029 = (ThreadFactoryC3888.m11306("ܰ۫") ^ i12) * 49;
                    i = ((iM45029 ^ i13) * 29527) ^ 1660882081;
                    i2 = 1580529831;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -1056958939:
                case -783730229:
                    C1066.m4023();
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = (C19806.m45029("۬᩺") + i13) * 35;
                        i = ((iM45029 ^ i12) * 1319) ^ 883524207;
                        i2 = -55830163;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻᩵") ^ i13;
                        i = ((iM45029 ^ i12) * (-10073)) ^ (-1856615362);
                        i2 = -369185594;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -1004962952:
                case 587112814:
                    i7 = 47816;
                    iM45029 = (ThreadFactoryC3888.m11306("ܰ۫") ^ i12) * 49;
                    i = ((iM45029 ^ i13) * 29527) ^ 1660882081;
                    i2 = 1580529831;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -890304163:
                case 473139120:
                    i8 = 1;
                    i9 = 3;
                    if (C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۬") ^ i12;
                        i = ((iM45029 ^ i13) * 15681) ^ 1402119047;
                        i2 = 71475575;
                    } else {
                        iM45029 = (C19806.m45029("ܳܶ") + i12) * 51;
                        i = ((iM45029 ^ i13) * 14017) ^ (-1579186112);
                        i2 = 2082883067;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -819371446:
                case 167058730:
                    i4 = s + 1;
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ᩵") ^ i12) * (-33);
                        i = ((iM45029 ^ i13) * (-12885)) ^ (-1272920167);
                        i2 = 208061065;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۜ") ^ i12) * (-91);
                        i = ((iM45029 ^ i13) * (-599)) ^ (-1227170013);
                        i2 = -1437500272;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -800885709:
                case -402746382:
                    this.f24230.mo26142();
                    break;
                case -669210391:
                case 591770774:
                    sArr2 = f24224;
                    i10 = 4;
                    i16 = 3;
                    if (C0526.f2219) {
                        iM45029 = (C19806.m45029("۬᩺") + i13) * 35;
                        i = ((iM45029 ^ i12) * 1319) ^ 883524207;
                        i2 = -55830163;
                    } else {
                        iM45029 = C19806.m45029("ܶۢ") ^ i13;
                        i = ((iM45029 ^ i12) * (-32653)) ^ 399163676;
                        i2 = 872795811;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -379233717:
                case 632018835:
                    C1189.m4360(ThreadFactoryC3888.m11306(strM1588) ^ 2130509470);
                    iM45029 = (i12 - ThreadFactoryC3888.m11306("᩹ᩴ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM45029 ^ i13) * 20155) ^ 1973431627;
                    i2 = -264669974;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -328777840:
                case 801341769:
                    C1668.m5582(iM450211 ^ i3);
                    iM45029 = (i12 - ThreadFactoryC3888.m11306("᩹ᩴ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM45029 ^ i13) * 20155) ^ 1973431627;
                    i2 = -264669974;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -247660886:
                case 333418286:
                    sArr3 = f24224;
                    c = 0;
                    if (C2642.f10294 <= 0) {
                        iM45029 = (C19806.m45029("۬᩺") + i13) * 35;
                        i = ((iM45029 ^ i12) * 1319) ^ 883524207;
                        i2 = -55830163;
                    } else {
                        iM45029 = (C19806.m45029("ۖᩴ") + i13) * 75;
                        i = ((iM45029 ^ i12) * (-9731)) ^ (-1771767325);
                        i2 = -258440405;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case -33155753:
                case 1377946986:
                    RunnableC3388.m10064();
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۨ") ^ i12;
                        i = ((iM45029 ^ i13) * 23893) ^ 443128341;
                        i2 = -720854379;
                    } else {
                        iM45029 = (C19806.m45029("۬᩺") + i13) * 35;
                        i = ((iM45029 ^ i12) * 1319) ^ 883524207;
                        i2 = -55830163;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case 363462364:
                case 385089816:
                    s = sArr3[c];
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("۬᩺") + i13) * 35;
                        i = ((iM45029 ^ i12) * 1319) ^ 883524207;
                        i2 = -55830163;
                    } else {
                        iM45029 = (i12 - ThreadFactoryC3888.m11306("ۖ۫")) * 39;
                        i = ((iM45029 ^ i13) * 4957) ^ (-724114058);
                        i2 = 553495811;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case 646142601:
                case 1818730472:
                    strM1588 = C0216.m1588(sArr2, i10, i16, i7);
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ᩵") ^ i12) * (-33);
                        i = ((iM45029 ^ i13) * (-12885)) ^ (-1272920167);
                        i2 = 208061065;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۚ") + i13) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM45029 ^ i12) * (-6037)) ^ 1186093495;
                        i2 = -359594686;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                case 1213730844:
                case 1243881854:
                    iM450211 = C19806.m45029(C0797.m3361(sArr, i8, i9, i7));
                    i3 = 2124859067;
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۨ") ^ i12;
                        i = ((iM45029 ^ i13) * 23893) ^ 443128341;
                        i2 = -720854379;
                    } else {
                        iM45029 = (C19806.m45029("ܿۚ") ^ i13) * 45;
                        i = ((iM45029 ^ i12) * (-23663)) ^ 1229874801;
                        i2 = -1500798619;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
                default:
                    sArr = f24224;
                    if (CallableC1627.f6528) {
                        iM45029 = C19806.m45029("ܽܺ") ^ i12;
                        i = ((iM45029 ^ i13) * (-23327)) ^ 1943565843;
                        i2 = 1246816809;
                    } else {
                        iM45029 = (C19806.m45029("۬᩺") + i13) * 35;
                        i = ((iM45029 ^ i12) * 1319) ^ 883524207;
                        i2 = -55830163;
                    }
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0233 A[PHI: r9 r10 r18
      0x0233: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:59:0x0231, B:55:0x020d, B:9:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r10v3 short) = (r10v1 short), (r10v2 short), (r10v1 short) binds: [B:59:0x0231, B:55:0x020d, B:9:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r18v25 int) = (r18v9 int), (r18v10 int), (r18v28 int) binds: [B:59:0x0231, B:55:0x020d, B:9:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02ad A[PHI: r5 r7 r8 r12 r13 r14 r18 r19
      0x02ad: PHI (r5v3 short[]) = (r5v2 short[]), (r5v1 short[]), (r5v1 short[]), (r5v1 short[]), (r5v1 short[]) binds: [B:71:0x02ab, B:63:0x026b, B:36:0x011e, B:32:0x00f8, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r7v3 short) = (r7v1 short), (r7v2 short), (r7v1 short), (r7v1 short), (r7v1 short) binds: [B:71:0x02ab, B:63:0x026b, B:36:0x011e, B:32:0x00f8, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:71:0x02ab, B:63:0x026b, B:36:0x011e, B:32:0x00f8, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r12v3 short[]) = (r12v1 short[]), (r12v1 short[]), (r12v2 short[]), (r12v1 short[]), (r12v1 short[]) binds: [B:71:0x02ab, B:63:0x026b, B:36:0x011e, B:32:0x00f8, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:71:0x02ab, B:63:0x026b, B:36:0x011e, B:32:0x00f8, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r14v3 int) = (r14v1 int), (r14v1 int), (r14v1 int), (r14v2 int), (r14v1 int) binds: [B:71:0x02ab, B:63:0x026b, B:36:0x011e, B:32:0x00f8, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r18v19 int) = (r18v6 int), (r18v8 int), (r18v17 int), (r18v18 int), (r18v20 int) binds: [B:71:0x02ab, B:63:0x026b, B:36:0x011e, B:32:0x00f8, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r19v2 java.lang.String) = 
      (r19v1 java.lang.String)
      (r19v1 java.lang.String)
      (r19v1 java.lang.String)
      (r19v1 java.lang.String)
      (r19v3 java.lang.String)
     binds: [B:71:0x02ab, B:63:0x026b, B:36:0x011e, B:32:0x00f8, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02e1 A[PHI: r6 r18
      0x02e1: PHI (r6v3 char) = (r6v1 char), (r6v2 char), (r6v1 char) binds: [B:75:0x02df, B:67:0x028b, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r18v26 int) = (r18v5 int), (r18v7 int), (r18v27 int) binds: [B:75:0x02df, B:67:0x028b, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        int iM45029;
        int i;
        int i2;
        int iM450210 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1443964222;
        int i10 = C1460.f5948;
        int i11 = C1189.f5284;
        int iM11306 = ThreadFactoryC3888.m11306("᩻۟") ^ i10;
        int i12 = ((iM11306 ^ i11) * 4455) ^ (-2033809287);
        int i13 = iM11306 ^ (-1197335942);
        String strM18989 = null;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i11) * (-17093)) >> 31));
            switch (i14) {
                case -2045398837:
                case 1504264963:
                    i14 = i14;
                    sArr = f24224;
                    if (C0216.m1591() <= 0) {
                        iM45029 = (C19806.m45029("᩷ۤ") + i11) * (-121);
                        i = ((iM45029 ^ i10) * 9061) ^ (-1344145478);
                        i2 = 557975326;
                    } else {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("᩸ۜ")) * 97;
                        i = ((iM45029 ^ i11) * 31233) ^ 513960311;
                        i2 = 556414641;
                    }
                    int i15 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i15;
                    break;
                case -1901660873:
                case -1324449082:
                    C0278.m1789();
                    C1461.m5080();
                    break;
                case -1886656456:
                case -1424219038:
                    C1977.m6356();
                    RunnableC1895.m6170();
                    iM45029 = C19806.m45029("ᩳᩳ") ^ i11;
                    i14 = i14;
                    i = ((iM45029 ^ i10) * 10759) ^ (-2125433696);
                    i2 = -1052019049;
                    int i16 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i16;
                    break;
                case -1857305260:
                case 521004837:
                    C1189.m4360(iM450210 ^ i3);
                    break;
                case -1856847935:
                case 1873985896:
                    i14 = i14;
                    iM450210 = C19806.m45029(strM18989);
                    i3 = 2119957957;
                    if (RunnableC3388.m10064()) {
                        iM45029 = C19806.m45029("֡۬") ^ i10;
                        i = ((iM45029 ^ i11) * 31961) ^ 903229565;
                        i2 = -82061320;
                    } else {
                        iM45029 = C19806.m45029("ܰۛ") ^ i11;
                        i = ((iM45029 ^ i10) * (-8145)) ^ 990200398;
                        i2 = -614827016;
                    }
                    int i17 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i17;
                    break;
                case -1786063874:
                case -1005004115:
                    i6 = 53898;
                    iM45029 = (i10 - C19806.m45029("ۙ᩹")) * (-11);
                    i = ((iM45029 ^ i11) * (-26737)) ^ (-1806377736);
                    i2 = 1664713222;
                    int i18 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i18;
                    break;
                case -1470623620:
                case -737638392:
                    i14 = i14;
                    strM18989 = C7105.m18989(sArr2, i7, i8, i6);
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("᩷ۤ") + i11) * (-121);
                        i = ((iM45029 ^ i10) * 9061) ^ (-1344145478);
                        i2 = 557975326;
                    } else {
                        iM45029 = (C19806.m45029("᩻᩷") ^ i10) * 69;
                        i = ((iM45029 ^ i11) * 31165) ^ (-1834959490);
                        i2 = -393408813;
                    }
                    int i19 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i19;
                    break;
                case -1022876011:
                case 554012422:
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ᩳᩳ") ^ i11;
                        i14 = i14;
                        i = ((iM45029 ^ i10) * 10759) ^ (-2125433696);
                        i2 = -1052019049;
                    } else {
                        i14 = i14;
                        iM45029 = C19806.m45029("ܰۛ") ^ i11;
                        i = ((iM45029 ^ i10) * (-8145)) ^ 990200398;
                        i2 = -614827016;
                    }
                    int i110 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i110;
                    break;
                case -878462745:
                case 2142690088:
                    i14 = i14;
                    s2 = 7148;
                    if (C3722.f13525 <= 0) {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("֨ܶ")) * (-125);
                        i = ((iM45029 ^ i11) * (-17067)) ^ (-294102194);
                        i2 = 2048458583;
                    } else {
                        iM45029 = C19806.m45029("ۜۙ") ^ i11;
                        i = ((iM45029 ^ i10) * 2777) ^ (-482436498);
                        i2 = -1611569960;
                    }
                    int i111 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i111;
                    break;
                case -867635092:
                case 407049346:
                    if (C2642.f10294 > 0) {
                        i14 = i14;
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("֨ܶ")) * (-125);
                        i = ((iM45029 ^ i11) * (-17067)) ^ (-294102194);
                        i2 = 2048458583;
                        int i112 = i14;
                        i13 = iM45029 ^ i2;
                        i12 = i;
                        i9 = i112;
                    }
                    i14 = i14;
                    iM45029 = (C19806.m45029("᩻ۢ") ^ i10) * 95;
                    i = ((iM45029 ^ i11) * 11303) ^ (-1302836927);
                    i2 = -2062277399;
                    int i113 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i113;
                    break;
                case -721696639:
                case 1344995688:
                    i14 = i14;
                    if (this.f12806.m40693()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳܽ") ^ i11;
                        i = ((iM45029 ^ i10) * 21329) ^ 1057150931;
                        i2 = 1326212572;
                    } else {
                        iM45029 = (i11 - C19806.m45029("۟ۧ")) * 79;
                        i = ((iM45029 ^ i10) * 27667) ^ (-1472779298);
                        i2 = 1081358410;
                    }
                    int i114 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i114;
                    break;
                case -720529267:
                case -268886754:
                    break;
                case -616487377:
                case 223781212:
                    C2332.m7079();
                    if (C3722.m10894() > 0) {
                        iM45029 = C19806.m45029("ᩳᩳ") ^ i11;
                        i14 = i14;
                        i = ((iM45029 ^ i10) * 10759) ^ (-2125433696);
                        i2 = -1052019049;
                    } else {
                        i14 = i14;
                        iM45029 = (C19806.m45029("᩻ۢ") ^ i10) * 95;
                        i = ((iM45029 ^ i11) * 11303) ^ (-1302836927);
                        i2 = -2062277399;
                    }
                    int i115 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i115;
                    break;
                case -436494131:
                case 996236720:
                    i14 = i14;
                    if (this.f24230.mo26144(exc)) {
                        iM45029 = C19806.m45029("۫ܿ") ^ i11;
                        i = ((iM45029 ^ i10) * 21863) ^ (-1118735338);
                        i2 = -1521746168;
                    } else {
                        iM45029 = C19806.m45029("۠۬") ^ i10;
                        i = ((iM45029 ^ i11) * (-12067)) ^ (-1181337214);
                        i2 = -1609929676;
                    }
                    int i116 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i116;
                    break;
                case -372948328:
                case -278586025:
                    i6 = 15604;
                    iM45029 = (i10 - C19806.m45029("ۙ᩹")) * (-11);
                    i = ((iM45029 ^ i11) * (-26737)) ^ (-1806377736);
                    i2 = 1664713222;
                    int i117 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i117;
                    break;
                case -354548348:
                case 1555538952:
                    i14 = i14;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (C19806.m45029("᩻ۢ") ^ i10) * 95;
                        i = ((iM45029 ^ i11) * 11303) ^ (-1302836927);
                        i2 = -2062277399;
                    } else {
                        iM45029 = C19806.m45029("ۤܳ") ^ i11;
                        i = ((iM45029 ^ i10) * (-11937)) ^ (-269030288);
                        i2 = -162277835;
                    }
                    int i118 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i118;
                    break;
                case -318094320:
                case -273218156:
                    i14 = i14;
                    if (i5 - (s * s2) < 0) {
                        iM45029 = (i10 - C19806.m45029("ۡۖ")) * 67;
                        i = ((iM45029 ^ i11) * 477) ^ 1587084101;
                        i2 = 1590589556;
                    } else {
                        iM45029 = (C19806.m45029("ᩴۡ") + i11) * (-105);
                        i = ((iM45029 ^ i10) * 557) ^ 495892199;
                        i2 = 900901919;
                    }
                    int i119 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i119;
                    break;
                case -248818294:
                case 155812649:
                    i14 = i14;
                    i5 = i4 + 12773476;
                    if (C0629.m2907()) {
                        iM45029 = (i10 - C19806.m45029("᩻ۗ")) * (-117);
                        i = ((iM45029 ^ i11) * 10201) ^ (-1668849672);
                        i2 = 143427673;
                    } else {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("֨ܶ")) * (-125);
                        i = ((iM45029 ^ i11) * (-17067)) ^ (-294102194);
                        i2 = 2048458583;
                    }
                    int i1110 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i1110;
                    break;
                case -158066064:
                case 1339422984:
                    i14 = i14;
                    s = sArr[c];
                    i4 = s * s;
                    if (C2124.f7782 <= 0) {
                        iM45029 = (C19806.m45029("᩷ۤ") + i11) * (-121);
                        i = ((iM45029 ^ i10) * 9061) ^ (-1344145478);
                        i2 = 557975326;
                    } else {
                        iM45029 = (C19806.m45029("۬ܿ") + i11) * 89;
                        i = ((iM45029 ^ i10) * 26147) ^ (-790263275);
                        i2 = -104297234;
                    }
                    int i1111 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i1111;
                    break;
                case -1099785:
                case 1248141219:
                    i14 = i14;
                    c = 7;
                    if (C1668.f6641 >= 0) {
                        iM45029 = (C19806.m45029("᩻ۢ") ^ i10) * 95;
                        i = ((iM45029 ^ i11) * 11303) ^ (-1302836927);
                        i2 = -2062277399;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩺") ^ i10;
                        i = ((iM45029 ^ i11) * (-6855)) ^ (-2131529330);
                        i2 = -1413467233;
                    }
                    int i1112 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i1112;
                    break;
                case 530838755:
                case 1116661155:
                    i14 = i14;
                    i8 = 3;
                    if (C1461.m5080()) {
                        iM45029 = (C19806.m45029("᩷ۤ") + i11) * (-121);
                        i = ((iM45029 ^ i10) * 9061) ^ (-1344145478);
                        i2 = 557975326;
                    } else {
                        iM45029 = (C19806.m45029("۬֨") ^ i11) * (-119);
                        i = ((iM45029 ^ i10) * (-13261)) ^ 579663661;
                        i2 = 1730060169;
                    }
                    int i1113 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i1113;
                    break;
                case 611591337:
                case 1061828999:
                    i14 = i14;
                    sArr2 = f24224;
                    i7 = 8;
                    if (C0629.m2907()) {
                        iM45029 = (C19806.m45029("᩷۟") ^ i10) * (-35);
                        i = ((iM45029 ^ i11) * (-20577)) ^ (-1752827735);
                        i2 = -1819801883;
                    } else {
                        iM45029 = (C19806.m45029("᩷ۤ") + i11) * (-121);
                        i = ((iM45029 ^ i10) * 9061) ^ (-1344145478);
                        i2 = 557975326;
                    }
                    int i1114 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i1114;
                    break;
                default:
                    i14 = i14;
                    C1875.m6102(this.f24225.f67319, exc, null);
                    iM45029 = C19806.m45029("۫ܿ") ^ i11;
                    i = ((iM45029 ^ i10) * 21863) ^ (-1118735338);
                    i2 = -1521746168;
                    int i1115 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i1115;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C1419.m4978(this.f12806);
    }
}
