package l;

import android.content.SharedPreferences;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.UMConfigure;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩷ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 154F */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22205 implements Runnable {

    /* JADX INFO: renamed from: ۤۡᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f71537 = {282, 10359, 10356, 10356, 10279, 10357, 10273, 10353, 10355, 10279, 10354, 10276, 10359, 10359, 10275, 10272, 10278, 10357, 10359, 10354, 10354, 10354, 10276, 10356, 10354};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71538;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71539;

    public /* synthetic */ RunnableC22205(int i, Object obj) {
        int i2 = 1246300218;
        int i3 = C1542.f5343;
        int i4 = C11235.f35427;
        this.f71538 = i;
        this.f71539 = obj;
        int iM3169 = C0773.m3169("ۨ᩺") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-32675)) ^ (-1711534178);
        int i6 = -2046887710;
        while (true) {
            i2 = (iM3169 ^ i6) ^ (i5 & (((i2 ^ i4) * 11751) >> 31));
            switch (i2) {
                case -861943716:
                case 1774234560:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ᩴۡ")) * 65;
                        i5 = ((iM3169 ^ i4) * 2641) ^ (-1959453306);
                        i6 = 1309370636;
                    } else {
                        iM3169 = C0619.m2761("ܽ᩷") ^ i3;
                        i5 = ((iM3169 ^ i4) * 6819) ^ 986563005;
                        i6 = 676243292;
                    }
                    break;
                case -575984104:
                case 1336320755:
                    C3033.m9845();
                    C2288.m7767();
                    iM3169 = (C0619.m2761("۫᩹") + i4) * 89;
                    i5 = ((iM3169 ^ i3) * (-8711)) ^ (-1538724321);
                    i6 = 1209448311;
                    break;
                case -285950477:
                case 1665358702:
                    if (C2310.m7813() > 0) {
                        iM3169 = (C0619.m2761("֫ܳ") + i3) * (-41);
                        i5 = ((iM3169 ^ i4) * 24325) ^ (-1773046416);
                        i6 = 569828569;
                    } else {
                        iM3169 = (C0619.m2761("ۖ۫") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM3169 ^ i3) * (-19983)) ^ (-1248701447);
                        i6 = 412124191;
                    }
                    break;
                case 516688149:
                case 1464581277:
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = (C0619.m2761("۫᩹") + i4) * 89;
                        i5 = ((iM3169 ^ i3) * (-8711)) ^ (-1538724321);
                        i6 = 1209448311;
                    } else {
                        iM3169 = (i4 - C0619.m2761("֫᩵")) * (-61);
                        i5 = ((iM3169 ^ i3) * 27379) ^ (-2024749123);
                        i6 = -572334362;
                    }
                    break;
                case 1217120817:
                case 1630510506:
                    return;
                case 1491152261:
                case 1752941684:
                    C0773.m3161();
                    throw new RuntimeException();
                default:
                    C3734.m12152();
                    if (C4238.m13540() > 0) {
                        iM3169 = (C0619.m2761("֫ܳ") + i3) * (-41);
                        i5 = ((iM3169 ^ i4) * 24325) ^ (-1773046416);
                        i6 = 569828569;
                    } else {
                        iM3169 = (C0619.m2761("۫᩹") + i4) * 89;
                        i5 = ((iM3169 ^ i3) * (-8711)) ^ (-1538724321);
                        i6 = 1209448311;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0158 A[PHI: r2 r16 r18
      0x0158: PHI (r2v4 l.ܽܿ֫) = (r2v3 l.ܽܿ֫), (r2v1 l.ܽܿ֫), (r2v1 l.ܽܿ֫), (r2v1 l.ܽܿ֫), (r2v1 l.ܽܿ֫) binds: [B:49:0x0156, B:32:0x00d7, B:15:0x006f, B:13:0x006b, B:6:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0158: PHI (r16v20 int) = (r16v12 int), (r16v15 int), (r16v18 int), (r16v19 int), (r16v21 int) binds: [B:49:0x0156, B:32:0x00d7, B:15:0x006f, B:13:0x006b, B:6:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0158: PHI (r18v18 int) = (r18v9 int), (r18v13 int), (r18v16 int), (r18v17 int), (r18v19 int) binds: [B:49:0x0156, B:32:0x00d7, B:15:0x006f, B:13:0x006b, B:6:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0280 A[PHI: r8 r16 r18
      0x0280: PHI (r8v4 short) = (r8v2 short), (r8v1 short), (r8v1 short) binds: [B:71:0x027e, B:13:0x006b, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r16v31 int) = (r16v10 int), (r16v19 int), (r16v36 int) binds: [B:71:0x027e, B:13:0x006b, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r18v28 int) = (r18v7 int), (r18v17 int), (r18v30 int) binds: [B:71:0x027e, B:13:0x006b, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02dd A[PHI: r5 r6 r7 r16 r18
      0x02dd: PHI (r5v3 short) = (r5v2 short), (r5v1 short) binds: [B:79:0x02db, B:75:0x02b7] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r6v3 int) = (r6v2 int), (r6v1 int) binds: [B:79:0x02db, B:75:0x02b7] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:79:0x02db, B:75:0x02b7] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r16v8 int) = (r16v7 int), (r16v9 int) binds: [B:79:0x02db, B:75:0x02b7] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r18v5 int) = (r18v4 int), (r18v6 int) binds: [B:79:0x02db, B:75:0x02b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x032c A[PHI: r3 r4 r10 r11 r12 r16 r18
      0x032c: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:87:0x032a, B:83:0x030a, B:45:0x012f, B:6:0x003d, B:21:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x032c: PHI (r4v3 char) = (r4v1 char), (r4v2 char), (r4v1 char), (r4v1 char), (r4v1 char) binds: [B:87:0x032a, B:83:0x030a, B:45:0x012f, B:6:0x003d, B:21:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x032c: PHI (r10v2 short[]) = (r10v1 short[]), (r10v1 short[]), (r10v1 short[]), (r10v1 short[]), (r10v3 short[]) binds: [B:87:0x032a, B:83:0x030a, B:45:0x012f, B:6:0x003d, B:21:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x032c: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:87:0x032a, B:83:0x030a, B:45:0x012f, B:6:0x003d, B:21:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x032c: PHI (r12v2 int) = (r12v1 int), (r12v1 int), (r12v1 int), (r12v1 int), (r12v3 int) binds: [B:87:0x032a, B:83:0x030a, B:45:0x012f, B:6:0x003d, B:21:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x032c: PHI (r16v26 int) = (r16v5 int), (r16v6 int), (r16v13 int), (r16v21 int), (r16v27 int) binds: [B:87:0x032a, B:83:0x030a, B:45:0x012f, B:6:0x003d, B:21:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x032c: PHI (r18v23 int) = (r18v2 int), (r18v3 int), (r18v10 int), (r18v19 int), (r18v24 int) binds: [B:87:0x032a, B:83:0x030a, B:45:0x012f, B:6:0x003d, B:21:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int iM3169;
        int i2;
        int i3;
        int iM2761;
        int i4;
        int i5;
        int iM2762;
        int i6;
        int i7;
        ApplicationC17729 applicationC17729 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1440109737;
        int i14 = C1783.f6087;
        int i15 = C3448.f11240;
        int iM2763 = C0619.m2761("᩸ۗ") ^ i14;
        int i16 = ((iM2763 ^ i15) * 21415) ^ 381570774;
        int i17 = iM2763 ^ (-733173785);
        Object obj = null;
        while (true) {
            int i18 = i17 ^ (i16 & (((i13 ^ i15) * 6693) >> 31));
            switch (i18) {
                case -2078348458:
                case 2010435464:
                    i18 = i18;
                    C0168 c0168 = (C0168) obj;
                    if (C17202.f56030) {
                        i = i10;
                        int i19 = 1;
                        if (C20932.f66974 > 0) {
                            c0168.m24163(new C9830(i19));
                        }
                        iM3169 = C0619.m2761("۬ܿ") ^ i14;
                        i2 = ((iM3169 ^ i15) * (-15731)) ^ (-585189928);
                        i3 = 258061537;
                        int i20 = iM3169 ^ i3;
                        i13 = i18;
                        i17 = i20;
                        i16 = i2;
                        i10 = i;
                    }
                    i = i10;
                    iM3169 = C0619.m2761("ᩳ᩶") ^ i14;
                    i2 = ((iM3169 ^ i15) * (-22121)) ^ 371519488;
                    i3 = -1697022164;
                    int i21 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i21;
                    i16 = i2;
                    i10 = i;
                    break;
                case -2071708816:
                case -441422298:
                    i = i10;
                    i18 = i18;
                    applicationC17729 = (ApplicationC17729) obj;
                    SharedPreferences sharedPreferences = ApplicationC17729.f58262;
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("۬ܿ") ^ i14;
                        i2 = ((iM3169 ^ i15) * (-15731)) ^ (-585189928);
                        i3 = 258061537;
                    } else {
                        iM3169 = (C0619.m2761("᩺ۖ") ^ i14) * (-101);
                        i2 = ((iM3169 ^ i15) * 525) ^ (-1393934222);
                        i3 = -949168583;
                    }
                    int i22 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i22;
                    i16 = i2;
                    i10 = i;
                    break;
                case -2066284833:
                case -828267216:
                    i18 = i18;
                    C3734.m12152();
                    C3077.m10041();
                    i = i10;
                    iM3169 = C0619.m2761("۬ܿ") ^ i14;
                    i2 = ((iM3169 ^ i15) * (-15731)) ^ (-585189928);
                    i3 = 258061537;
                    int i23 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i23;
                    i16 = i2;
                    i10 = i;
                    break;
                case -2021956960:
                case -169320115:
                    i18 = i18;
                    i = i10;
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("۬ܿ") ^ i14;
                        i2 = ((iM3169 ^ i15) * (-15731)) ^ (-585189928);
                        i3 = 258061537;
                    } else {
                        iM3169 = (C0773.m3169("۟ۛ") ^ i15) * (-13);
                        i2 = ((iM3169 ^ i14) * 32173) ^ 1131647799;
                        i3 = -85713922;
                    }
                    int i24 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i24;
                    i16 = i2;
                    i10 = i;
                    break;
                case -2013601901:
                case -1574703094:
                    i10 = 10306;
                    iM2761 = C0619.m2761("ܽ᩵") ^ i14;
                    i4 = ((iM2761 ^ i15) * (-24141)) ^ (-491103322);
                    i5 = -678203150;
                    i7 = iM2761 ^ i5;
                    int i25 = i18;
                    i17 = i7;
                    i16 = i4;
                    i13 = i25;
                    break;
                case -1962303528:
                case -1889549251:
                    i18 = i18;
                    sArr2 = f71537;
                    i11 = 1;
                    i12 = 24;
                    if (AbstractC0641.m2813() > 0) {
                        iM2761 = (C0619.m2761("᩸ۤ") ^ i15) * 91;
                        i4 = ((iM2761 ^ i14) * (-32609)) ^ (-1619535974);
                        i5 = -1919489954;
                        i7 = iM2761 ^ i5;
                        int i26 = i18;
                        i17 = i7;
                        i16 = i4;
                        i13 = i26;
                    } else {
                        i = i10;
                        iM3169 = C0619.m2761("ᩳ᩶") ^ i14;
                        i2 = ((iM3169 ^ i15) * (-22121)) ^ 371519488;
                        i3 = -1697022164;
                        int i27 = iM3169 ^ i3;
                        i13 = i18;
                        i17 = i27;
                        i16 = i2;
                        i10 = i;
                    }
                    break;
                case -1954371701:
                case -192217039:
                    i = i10;
                    i18 = i18;
                    if (i9 - (s * s2) < 0) {
                        iM3169 = (C0773.m3169("ᩴ᩺") ^ i15) * 115;
                        i2 = ((iM3169 ^ i14) * (-24917)) ^ (-592783899);
                        i3 = -2146761873;
                    } else {
                        iM3169 = C0619.m2761("֡֡") ^ i14;
                        i2 = ((iM3169 ^ i15) * 25093) ^ 241625257;
                        i3 = -401134116;
                    }
                    int i28 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i28;
                    i16 = i2;
                    i10 = i;
                    break;
                case -1649941540:
                case 1475968098:
                    int i29 = i10;
                    i18 = i18;
                    int i30 = this.f71538;
                    Object obj2 = this.f71539;
                    switch (i30) {
                        case 0:
                            iM2762 = (C0619.m2761("᩸֫") ^ i15) * 31;
                            i4 = ((iM2762 ^ i14) * 22875) ^ (-348380999);
                            i6 = -994696659;
                            break;
                        case 1:
                            iM2762 = (C0619.m2761("۬ᩴ") + i14) * (-69);
                            i4 = ((iM2762 ^ i15) * (-31235)) ^ 411857833;
                            i6 = -468342828;
                            break;
                        case 2:
                            iM2762 = (C0773.m3169("ܳ᩶") + i15) * (-107);
                            i4 = ((iM2762 ^ i14) * (-7837)) ^ (-1472758797);
                            i6 = 883642862;
                            break;
                        case 3:
                            iM2762 = (i14 - C0773.m3169("ۤۘ")) * (-91);
                            i4 = ((iM2762 ^ i15) * (-9533)) ^ (-1600139110);
                            i6 = -394756798;
                            break;
                        case 4:
                            iM2762 = (i15 - C0773.m3169("᩻ᩳ")) * 45;
                            i4 = ((iM2762 ^ i14) * 29657) ^ (-1756074676);
                            i6 = -2092332804;
                            break;
                        default:
                            iM2762 = C0773.m3169("ۚۚ") ^ i14;
                            i4 = ((iM2762 ^ i15) * 5839) ^ 2085507331;
                            i6 = 103096291;
                            break;
                    }
                    i7 = iM2762 ^ i6;
                    obj = obj2;
                    i10 = i29;
                    int i210 = i18;
                    i17 = i7;
                    i16 = i4;
                    i13 = i210;
                    break;
                case -1636043442:
                case -1355181231:
                    i = i10;
                    i18 = i18;
                    sArr = f71537;
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("ᩳ᩶") ^ i14;
                        i2 = ((iM3169 ^ i15) * (-22121)) ^ 371519488;
                        i3 = -1697022164;
                    } else {
                        iM3169 = C0773.m3169("ܺܳ") ^ i15;
                        i2 = ((iM3169 ^ i14) * (-7947)) ^ (-1118912144);
                        i3 = -1216872149;
                    }
                    int i211 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i211;
                    i16 = i2;
                    i10 = i;
                    break;
                case -1388630434:
                case 978634278:
                    i = i10;
                    i18 = i18;
                    s = sArr[c];
                    i8 = s * s;
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0773.m3169("ۧ֫") ^ i15;
                        i2 = ((iM3169 ^ i14) * 28573) ^ (-693112935);
                        i3 = -441450754;
                    } else {
                        iM3169 = C0773.m3169("ۛܽ") ^ i15;
                        i2 = ((iM3169 ^ i14) * 30639) ^ 2107157860;
                        i3 = -1277104686;
                    }
                    int i212 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i212;
                    i16 = i2;
                    i10 = i;
                    break;
                case -1366932677:
                case 1163198660:
                    C2287.m7745();
                    C0487.m2356();
                    break;
                case -1273923679:
                case -596730221:
                    ActivityC3846.m12469((ActivityC3846) obj);
                    break;
                case -1075220798:
                case 535342224:
                    i18 = i18;
                    UMConfigure.preInit(applicationC17729, C13473.m33137(sArr2, i11, i12, i10), null);
                    i = i10;
                    iM3169 = (C0773.m3169("᩵᩻") + i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i2 = ((iM3169 ^ i15) * (-20619)) ^ 99685272;
                    i3 = -1089337765;
                    int i213 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i213;
                    i16 = i2;
                    i10 = i;
                    break;
                case -1003137667:
                case 1415928087:
                    break;
                case -789686087:
                case 388341420:
                    C0773.m3161();
                    if (AbstractC0641.f2496 < 0) {
                        iM2761 = C0619.m2761("ۛۙ") ^ i14;
                        i18 = i18;
                        i4 = ((iM2761 ^ i15) * 25391) ^ 1140325759;
                        i5 = -850407416;
                        i7 = iM2761 ^ i5;
                        int i214 = i18;
                        i17 = i7;
                        i16 = i4;
                        i13 = i214;
                    } else {
                        i = i10;
                        i18 = i18;
                        iM3169 = (C0773.m3169("۟ۛ") ^ i15) * (-13);
                        i2 = ((iM3169 ^ i14) * 32173) ^ 1131647799;
                        i3 = -85713922;
                        int i215 = iM3169 ^ i3;
                        i13 = i18;
                        i17 = i215;
                        i16 = i2;
                        i10 = i;
                    }
                    break;
                case -643709169:
                case 1501664728:
                    i10 = 27774;
                    iM2761 = C0619.m2761("ܽ᩵") ^ i14;
                    i4 = ((iM2761 ^ i15) * (-24141)) ^ (-491103322);
                    i5 = -678203150;
                    i7 = iM2761 ^ i5;
                    int i216 = i18;
                    i17 = i7;
                    i16 = i4;
                    i13 = i216;
                    break;
                case -410643061:
                case 462151262:
                    C2375.m8064((DialogInterfaceC8327) obj);
                    break;
                case 55828011:
                case 845487548:
                    i = i10;
                    i18 = i18;
                    s2 = 16516;
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0773.m3169("۟ۛ") ^ i15) * (-13);
                        i2 = ((iM3169 ^ i14) * 32173) ^ 1131647799;
                        i3 = -85713922;
                    } else {
                        iM3169 = (C0773.m3169("ۢᩴ") + i15) * (-57);
                        i2 = ((iM3169 ^ i14) * 30361) ^ (-1183591884);
                        i3 = -857915709;
                    }
                    int i217 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i217;
                    i16 = i2;
                    i10 = i;
                    break;
                case 302793382:
                case 1276226901:
                    ((AbstractC15118) obj).cancel();
                    break;
                case 326366236:
                case 1537837750:
                    i = i10;
                    i18 = i18;
                    i9 = i8 + 68194564;
                    if (C0862.f3233 != 0) {
                        iM3169 = C0773.m3169("ۧ֫") ^ i15;
                        i2 = ((iM3169 ^ i14) * 28573) ^ (-693112935);
                        i3 = -441450754;
                    } else {
                        iM3169 = (i14 - C0773.m3169("᩷۠")) * 65;
                        i2 = ((iM3169 ^ i15) * (-2227)) ^ (-464972008);
                        i3 = -468073391;
                    }
                    int i218 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i218;
                    i16 = i2;
                    i10 = i;
                    break;
                case 358914111:
                case 914125716:
                    i = i10;
                    i18 = i18;
                    int i31 = C2278.f7424;
                    if (C16514.m39144()) {
                        iM3169 = (C0773.m3169("᩵᩻") + i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i2 = ((iM3169 ^ i15) * (-20619)) ^ 99685272;
                        i3 = -1089337765;
                    } else {
                        iM3169 = (C0773.m3169("᩸ܳ") ^ i15) * 3;
                        i2 = ((iM3169 ^ i14) * 19403) ^ (-1066261170);
                        i3 = 869665423;
                    }
                    int i219 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i219;
                    i16 = i2;
                    i10 = i;
                    break;
                case 855719053:
                case 2134944279:
                    i = i10;
                    i18 = i18;
                    C17202.m40369(applicationC17729);
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("ᩳ᩶") ^ i14;
                        i2 = ((iM3169 ^ i15) * (-22121)) ^ 371519488;
                        i3 = -1697022164;
                    } else {
                        iM3169 = (i15 - C0619.m2761("۟ۢ")) * (-33);
                        i2 = ((iM3169 ^ i14) * 11749) ^ 1684138972;
                        i3 = 954692937;
                    }
                    int i2110 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i2110;
                    i16 = i2;
                    i10 = i;
                    break;
                case 972785081:
                case 1597070004:
                    i = i10;
                    i18 = i18;
                    c = 0;
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("᩺᩷") + i14) * 37;
                        i2 = ((iM3169 ^ i15) * 28191) ^ (-181777313);
                        i3 = 389474817;
                    } else {
                        iM3169 = C0619.m2761("ᩳ᩶") ^ i14;
                        i2 = ((iM3169 ^ i15) * (-22121)) ^ 371519488;
                        i3 = -1697022164;
                    }
                    int i2111 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i2111;
                    i16 = i2;
                    i10 = i;
                    break;
                case 1348185670:
                case 1462287946:
                    C13700.m33491((C13700) obj);
                    break;
                default:
                    i = i10;
                    i18 = i18;
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0619.m2761("۬ܿ") ^ i14;
                        i2 = ((iM3169 ^ i15) * (-15731)) ^ (-585189928);
                        i3 = 258061537;
                    } else {
                        iM3169 = C0619.m2761("ᩳ᩶") ^ i14;
                        i2 = ((iM3169 ^ i15) * (-22121)) ^ 371519488;
                        i3 = -1697022164;
                    }
                    int i2112 = iM3169 ^ i3;
                    i13 = i18;
                    i17 = i2112;
                    i16 = i2;
                    i10 = i;
                    break;
            }
            return;
        }
    }
}
