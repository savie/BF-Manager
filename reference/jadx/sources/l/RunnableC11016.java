package l;

import android.content.SharedPreferences;
import android.view.View;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;

/* JADX INFO: renamed from: l.ۤܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 154F */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11016 implements Runnable {

    /* JADX INFO: renamed from: ۟᩸۟, reason: not valid java name and contains not printable characters */
    private static final short[] f34792 = {8973, -792, -789, -789, -840, -790, -834, -786, -788, -840, -787, -837, -792, -792, -836, -833, -839, -790, -792, -787, -787, -787, -837, -789, -787};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34793;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34794;

    public /* synthetic */ RunnableC11016(int i, Object obj) {
        int i2 = -1526135694;
        int i3 = C3448.f11240;
        int i4 = C2310.f7472;
        this.f34793 = i;
        this.f34794 = obj;
        int iM3169 = (C0773.m3169("۬ܿ") ^ i3) * (-17);
        int i5 = ((iM3169 ^ i4) * 21901) ^ (-371941009);
        int i6 = -1500357064;
        while (true) {
            i2 = (iM3169 ^ i6) ^ (i5 & (((i2 ^ i4) * 16869) >> 31));
            switch (i2) {
                case -562561116:
                case 172438926:
                    C1080.m4050();
                    throw new RuntimeException();
                case -387274516:
                case 1448617887:
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("᩺᩶") ^ i3) * (-49);
                        i5 = ((iM3169 ^ i4) * 19019) ^ 325547077;
                        i6 = -1140550138;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۗ") + i4) * 55;
                        i5 = ((iM3169 ^ i3) * (-15421)) ^ 1989923856;
                        i6 = -310810513;
                    }
                    break;
                case -273308778:
                case 900913411:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0619.m2761("ۡ۫") ^ i3;
                        i5 = ((iM3169 ^ i4) * 23179) ^ (-295771692);
                        i6 = -1106163949;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۚܶ")) * (-105);
                        i5 = ((iM3169 ^ i4) * 5121) ^ (-932299110);
                        i6 = -425393336;
                    }
                    break;
                case 227339920:
                case 899926400:
                    C2375.m8065();
                    C2288.m7767();
                    iM3169 = C0773.m3169("᩻֫") ^ i4;
                    i5 = ((iM3169 ^ i3) * (-14311)) ^ 1860521469;
                    i6 = -596245433;
                    break;
                case 310516288:
                case 2018826175:
                    C20932.m47848();
                    if (C3448.f11240 < 0) {
                        iM3169 = (C0773.m3169("᩺᩶") ^ i3) * (-49);
                        i5 = ((iM3169 ^ i4) * 19019) ^ 325547077;
                        i6 = -1140550138;
                    } else {
                        iM3169 = C0773.m3169("᩻֫") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-14311)) ^ 1860521469;
                        i6 = -596245433;
                    }
                    break;
                case 981215883:
                case 1556001198:
                    return;
                default:
                    if (C3033.f9831 < 0) {
                        iM3169 = C0773.m3169("᩻֫") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-14311)) ^ 1860521469;
                        i6 = -596245433;
                    } else {
                        iM3169 = (C0619.m2761("۬ۚ") + i4) * (-47);
                        i5 = ((iM3169 ^ i3) * (-19607)) ^ 163824198;
                        i6 = -1104848585;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x025a A[PHI: r2 r10 r11 r14 r15
      0x025a: PHI (r2v5 l.ܽܿ֫) = (r2v3 l.ܽܿ֫), (r2v1 l.ܽܿ֫), (r2v1 l.ܽܿ֫), (r2v1 l.ܽܿ֫), (r2v1 l.ܽܿ֫), (r2v1 l.ܽܿ֫) binds: [B:103:0x025a, B:101:0x025a, B:99:0x025a, B:63:0x0258, B:17:0x0068, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:103:0x025a, B:101:0x025a, B:99:0x025a, B:63:0x0258, B:17:0x0068, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:103:0x025a, B:101:0x025a, B:99:0x025a, B:63:0x0258, B:17:0x0068, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r14v4 short[]) = (r14v1 short[]), (r14v1 short[]), (r14v2 short[]), (r14v1 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:103:0x025a, B:101:0x025a, B:99:0x025a, B:63:0x0258, B:17:0x0068, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r15v4 int) = (r15v1 int), (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int), (r15v1 int) binds: [B:103:0x025a, B:101:0x025a, B:99:0x025a, B:63:0x0258, B:17:0x0068, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02c7 A[PHI: r4 r5 r9 r22
      0x02c7: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v1 java.lang.String), (r4v1 java.lang.String) binds: [B:102:0x02c7, B:75:0x02c5, B:67:0x028a] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r5v4 int) = (r5v2 int), (r5v1 int), (r5v1 int) binds: [B:102:0x02c7, B:75:0x02c5, B:67:0x028a] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v3 int) binds: [B:102:0x02c7, B:75:0x02c5, B:67:0x028a] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r22v5 char) = (r22v3 char), (r22v4 char), (r22v3 char) binds: [B:102:0x02c7, B:75:0x02c5, B:67:0x028a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02f7 A[PHI: r8 r16
      0x02f7: PHI (r8v6 short) = (r8v1 short), (r8v2 short), (r8v1 short) binds: [B:79:0x02f5, B:71:0x02a8, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r16v7 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:79:0x02f5, B:71:0x02a8, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        RunnableC11016 runnableC11016 = this;
        ApplicationC17729 applicationC17729 = null;
        C5797 c5797 = null;
        String strM3780 = null;
        int i4 = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short[] sArr = null;
        int i10 = 0;
        int i11 = -2002441662;
        int i12 = C0773.f2792;
        int i13 = C20932.f66974;
        int iM31610 = (i12 - C0773.m3169("۟ܽ")) * 53;
        int i14 = ((iM31610 ^ i13) * 20967) ^ 419075377;
        int i15 = iM31610 ^ 503733456;
        short[] sArr2 = null;
        int i16 = 0;
        Object obj = null;
        char c = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * (-14059)) >> 31));
            switch (i11) {
                case -2083156370:
                case 54973756:
                    i6 = i5 * i5;
                    i7 = s * s;
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0619.m2761("ᩴ᩹") ^ i13;
                        i14 = ((iM2761 ^ i12) * (-24575)) ^ (-636207867);
                        i3 = 1054158019;
                    } else {
                        iM2761 = C0773.m3169("ܽ᩵") ^ i12;
                        i14 = ((iM2761 ^ i13) * (-31699)) ^ 1956392718;
                        i3 = 1716902493;
                    }
                    i15 = iM2761 ^ i3;
                    runnableC11016 = this;
                    break;
                case -1897660169:
                case 587602486:
                    C21576.m49089(0, (View) obj);
                    break;
                case -1861116814:
                case -1836813686:
                    int i17 = runnableC11016.f34793;
                    Object obj2 = runnableC11016.f34794;
                    switch (i17) {
                        case 0:
                            int iM2762 = (i13 - C0619.m2761("ۚᩳ")) * (-29);
                            i15 = iM2762 ^ 1791673959;
                            i14 = ((iM2762 ^ i12) * 7339) ^ (-527437417);
                            obj = obj2;
                            break;
                        default:
                            int iM2763 = C0619.m2761("۠ᩴ") ^ i13;
                            i14 = ((iM2763 ^ i12) * 24873) ^ (-158067015);
                            i15 = iM2763 ^ (-1540872218);
                            runnableC11016 = this;
                            obj = obj2;
                            continue;
                    }
                    runnableC11016 = this;
                    break;
                case -1664257486:
                case -948349404:
                    C0487.m2356();
                    if (!C1080.m4050()) {
                        iM3169 = C0619.m2761("ۤۤ") ^ i12;
                        i = ((iM3169 ^ i13) * 3221) ^ 312765751;
                        i2 = 677813170;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    } else {
                        iM2761 = C0773.m3169("֨ۡ") ^ i13;
                        i14 = ((iM2761 ^ i12) * (-10031)) ^ (-1168181827);
                        i3 = 1029727569;
                        i15 = iM2761 ^ i3;
                        runnableC11016 = this;
                    }
                    break;
                case -1583910172:
                case -1394761058:
                    c5797 = new C5797();
                    if (C16514.m39144()) {
                        iM3169 = (C0773.m3169("ۨܿ") + i12) * 99;
                        i = ((iM3169 ^ i13) * (-9927)) ^ (-1589681098);
                        i2 = -2082408430;
                    } else {
                        iM3169 = C0773.m3169("۬᩶") ^ i12;
                        i = ((iM3169 ^ i13) * 9309) ^ (-2138316683);
                        i2 = -1857603529;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -1532543241:
                case -1179676184:
                    sArr2 = f34792;
                    if (C0862.f3233 != 0) {
                        iM2761 = C0619.m2761("ۗ֫") ^ i13;
                        i14 = ((iM2761 ^ i12) * 3111) ^ (-1478208541);
                        i3 = 404004435;
                    } else {
                        iM2761 = (i13 - C0619.m2761("ܳ᩹")) * (-35);
                        i14 = ((iM2761 ^ i12) * 10367) ^ 1208961777;
                        i3 = 564513492;
                    }
                    i15 = iM2761 ^ i3;
                    runnableC11016 = this;
                    break;
                case -1000778961:
                case -472272492:
                    UMConfigure.getOaid(applicationC17729, new C6007(0, c5797));
                    iM3169 = (C0773.m3169("ۨܿ") + i12) * 99;
                    i = ((iM3169 ^ i13) * (-9927)) ^ (-1589681098);
                    i2 = -2082408430;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -994186583:
                case 853053282:
                    AbstractC3624.m11755();
                    if (C0487.f2131 > 0) {
                        iM3169 = C0619.m2761("ۤۤ") ^ i12;
                        i = ((iM3169 ^ i13) * 3221) ^ 312765751;
                        i2 = 677813170;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩹") ^ i13;
                        i14 = ((iM2761 ^ i12) * (-24575)) ^ (-636207867);
                        i3 = 1054158019;
                        i15 = iM2761 ^ i3;
                        runnableC11016 = this;
                    }
                    break;
                case -981376400:
                case 126319959:
                    c = 0;
                    if (C1783.f6087 <= 0) {
                        iM2761 = (i12 - C0619.m2761("۠ܳ")) * (-69);
                        i14 = ((iM2761 ^ i13) * 29385) ^ (-1861053863);
                        i3 = -2025214240;
                    } else {
                        iM2761 = C0619.m2761("۬ۚ") ^ i12;
                        i14 = ((iM2761 ^ i13) * 15045) ^ 472115417;
                        i3 = -1121923799;
                    }
                    i15 = iM2761 ^ i3;
                    runnableC11016 = this;
                    break;
                case -897610810:
                case 348870700:
                    i8 = 1920996;
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("֨ۡ") ^ i13;
                        i14 = ((iM2761 ^ i12) * (-10031)) ^ (-1168181827);
                        i3 = 1029727569;
                    } else {
                        iM2761 = C0773.m3169("ᩳ᩷") ^ i13;
                        i14 = ((iM2761 ^ i12) * (-26665)) ^ (-1364605987);
                        i3 = 1462417408;
                    }
                    i15 = iM2761 ^ i3;
                    runnableC11016 = this;
                    break;
                case -894401680:
                case 793288841:
                    i5 = s + 1386;
                    if (C0619.m2763()) {
                        iM2761 = (i12 - C0619.m2761("۠ܳ")) * (-69);
                        i14 = ((iM2761 ^ i13) * 29385) ^ (-1861053863);
                        i3 = -2025214240;
                    } else {
                        iM2761 = (i12 - C0619.m2761("ۤ۠")) * (-113);
                        i14 = ((iM2761 ^ i13) * 25107) ^ (-912852224);
                        i3 = -340025779;
                    }
                    i15 = iM2761 ^ i3;
                    runnableC11016 = this;
                    break;
                case -809604882:
                case 2008188925:
                    s = sArr2[c];
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ۗ֫") ^ i13;
                        i14 = ((iM2761 ^ i12) * 3111) ^ (-1478208541);
                        i3 = 404004435;
                    } else {
                        iM2761 = (C0619.m2761("ۢۡ") ^ i13) * (-39);
                        i14 = ((iM2761 ^ i12) * 24645) ^ 744908854;
                        i3 = 1436579619;
                    }
                    i15 = iM2761 ^ i3;
                    runnableC11016 = this;
                    break;
                case -797001198:
                case 17255097:
                    break;
                case -775608814:
                case 266794373:
                    strM3780 = C0950.m3780(sArr, i10, i16, i9);
                    i4 = 1;
                    if (C2287.f7432 < 0) {
                        iM3169 = (C0773.m3169("᩵ܺ") + i13) * (-67);
                        i = ((iM3169 ^ i12) * 11559) ^ 234199379;
                        i2 = -502358404;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    } else {
                        iM2761 = (i12 - C0619.m2761("۠ܳ")) * (-69);
                        i14 = ((iM2761 ^ i13) * 29385) ^ (-1861053863);
                        i3 = -2025214240;
                        i15 = iM2761 ^ i3;
                        runnableC11016 = this;
                    }
                    break;
                case -403881033:
                case 605692388:
                    i9 = 42943;
                    iM2761 = (i12 - C0773.m3169("۠ۤ")) * (-107);
                    i14 = ((iM2761 ^ i13) * 13287) ^ (-166705748);
                    i3 = -1995564165;
                    i15 = iM2761 ^ i3;
                    runnableC11016 = this;
                    break;
                case -403619467:
                case 397155309:
                    if (C0269.m1775() > 0) {
                        iM2761 = C0619.m2761("ᩴ᩹") ^ i13;
                        i14 = ((iM2761 ^ i12) * (-24575)) ^ (-636207867);
                        i3 = 1054158019;
                    } else {
                        iM2761 = C0619.m2761("ۗ֫") ^ i13;
                        i14 = ((iM2761 ^ i12) * 3111) ^ (-1478208541);
                        i3 = 404004435;
                    }
                    i15 = iM2761 ^ i3;
                    runnableC11016 = this;
                    break;
                case -191228532:
                case 965161446:
                    i9 = 64733;
                    iM2761 = (i12 - C0773.m3169("۠ۤ")) * (-107);
                    i14 = ((iM2761 ^ i13) * 13287) ^ (-166705748);
                    i3 = -1995564165;
                    i15 = iM2761 ^ i3;
                    runnableC11016 = this;
                    break;
                case -189329541:
                case 1277333987:
                    applicationC17729 = (ApplicationC17729) obj;
                    SharedPreferences sharedPreferences = ApplicationC17729.f58262;
                    if (!C2354.m7983()) {
                        iM2761 = C0619.m2761("ᩴ᩹") ^ i13;
                        i14 = ((iM2761 ^ i12) * (-24575)) ^ (-636207867);
                        i3 = 1054158019;
                        i15 = iM2761 ^ i3;
                        runnableC11016 = this;
                    } else {
                        iM3169 = C0773.m3169("᩸᩷") ^ i12;
                        i = ((iM3169 ^ i13) * 7859) ^ 977522030;
                        i2 = 212559776;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    }
                    break;
                case 113814124:
                case 1584352953:
                    i16 = 24;
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("ۤۤ") ^ i12;
                        i = ((iM3169 ^ i13) * 3221) ^ 312765751;
                        i2 = 677813170;
                    } else {
                        iM3169 = C0619.m2761("֨ܶ") ^ i13;
                        i = ((iM3169 ^ i12) * (-18733)) ^ (-879529967);
                        i2 = -83273703;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case 223150768:
                case 1526218651:
                    C3998.m12920();
                    iM2761 = C0619.m2761("ᩴ᩹") ^ i13;
                    i14 = ((iM2761 ^ i12) * (-24575)) ^ (-636207867);
                    i3 = 1054158019;
                    i15 = iM2761 ^ i3;
                    runnableC11016 = this;
                    break;
                case 337291971:
                case 1457260911:
                    C1080.m4050();
                    break;
                case 423918353:
                case 2117489142:
                    int i18 = C2278.f7424;
                    if (C16514.m39144()) {
                        iM3169 = C0619.m2761("ܽܳ") ^ i13;
                        i = ((iM3169 ^ i12) * (-6845)) ^ 1661372372;
                        i2 = -2045670003;
                    } else {
                        iM3169 = C0773.m3169("ۤۗ") ^ i12;
                        i = ((iM3169 ^ i13) * (-27251)) ^ 1501774817;
                        i2 = 1107270495;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case 696281022:
                case 1010202784:
                    UMConfigure.init(applicationC17729, strM3780, null, i4, null);
                    MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.LEGACY_MANUAL);
                    iM3169 = C0619.m2761("ܽܳ") ^ i13;
                    i = ((iM3169 ^ i12) * (-6845)) ^ 1661372372;
                    i2 = -2045670003;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case 1490942788:
                case 2112175841:
                    int i19 = i7 + i8;
                    if ((i19 + i19) - i6 < 0) {
                        iM2761 = C0619.m2761("᩵֡") ^ i12;
                        i14 = ((iM2761 ^ i13) * 16987) ^ (-1452236557);
                        i3 = 1451712641;
                    } else {
                        iM2761 = (C0773.m3169("۬᩸") + i13) * (-39);
                        i14 = ((iM2761 ^ i12) * 28691) ^ 1544638122;
                        i3 = -1909280923;
                    }
                    i15 = iM2761 ^ i3;
                    runnableC11016 = this;
                    break;
                default:
                    sArr = f34792;
                    i10 = 1;
                    if (C1343.f4799 == 0) {
                        iM3169 = (i12 - C0619.m2761("֫ܰ")) * 87;
                        i = ((iM3169 ^ i13) * 23953) ^ 1948786940;
                        i2 = -179014672;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩹") ^ i13;
                        i14 = ((iM2761 ^ i12) * (-24575)) ^ (-636207867);
                        i3 = 1054158019;
                        i15 = iM2761 ^ i3;
                        runnableC11016 = this;
                    }
                    break;
            }
            return;
        }
    }
}
