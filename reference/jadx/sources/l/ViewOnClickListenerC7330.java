package l;

import android.view.View;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۜᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC7330 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۠֫۠, reason: not valid java name and contains not printable characters */
    private static final short[] f24145 = {9557, 11197, 11169, 11169, 11185, 11168, 11193, 11242, 11263, 11263, 11190, 11199, 11170, 11175, 11185, 11170, 11188, 11263, 11173, 11170, 11196, 11247, 11171, 11170, 11187, 11151, 11172, 11177, 11168, 11189, 11245, 11175, 11189, 11186, 11254, 11174, 11189, 11170, 11171, 11193, 11199, 11198, 11245, 11233, 11254, 11173, 11170, 11196, 11151, 11168, 11170, 11189, 11190, 11193, 11176, 11245, 11185, 11198, 11188, 11170, 11199, 11193, 11188, 11262, 11193, 11198, 11172, 11189, 11198, 11172, 11262, 11185, 11187, 11172, 11193, 11199, 11198, 11262, 11142, 11161, 11157, 11143, 11191, 11189, 11172, 11154, 11177, 11172, 11189, 11171, 11256, 11262, 11262, 11262, 11257};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24146;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24147;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f24148;

    public /* synthetic */ ViewOnClickListenerC7330(C1101 c1101, AbstractActivityC17204 abstractActivityC17204, List list) {
        int i = 1683581791;
        int i2 = C23916.f77426;
        int i3 = C1146.f4234;
        this.f24146 = 0;
        int iM2761 = C0619.m2761("᩵ܶ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-19435)) ^ (-521978444);
        int i5 = -526771395;
        while (true) {
            i = ((((i ^ i2) * (-20019)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1997722936:
                case -1026568821:
                    if (C0950.m3785() != 0) {
                        iM2761 = C0773.m3169("۫᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14989) ^ (-1825853814);
                        i5 = 2136197994;
                    } else {
                        iM2761 = C0773.m3169("ܳۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32717)) ^ 1254964767;
                        i5 = 2040489983;
                    }
                    break;
                case -1725969635:
                case -485736193:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("۫᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14989) ^ (-1825853814);
                        i5 = 2136197994;
                    } else {
                        iM2761 = C0619.m2761("᩷᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29929)) ^ (-1601649862);
                        i5 = -127636432;
                    }
                    break;
                case -1589220479:
                case 1204713196:
                    if (C2485.f7950 != 0) {
                        iM2761 = C0773.m3169("ܳۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32717)) ^ 1254964767;
                        i5 = 2040489983;
                    } else {
                        iM2761 = C0619.m2761("᩹ܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28781)) ^ (-1088350808);
                        i5 = 949440279;
                    }
                    break;
                case -1571296006:
                case 1169188886:
                    C0773.m3161();
                    RunnableC1848.m6360();
                    iM2761 = C0773.m3169("ܳۘ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-32717)) ^ 1254964767;
                    i5 = 2040489983;
                    break;
                case -1560468196:
                case -1423842132:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0619.m2761("᩷ܺ") ^ i2) * (-73);
                        i4 = ((iM2761 ^ i3) * (-359)) ^ (-1880426732);
                        i5 = 1909210639;
                    } else {
                        iM2761 = C0773.m3169("ۙܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 27861) ^ (-1752174963);
                        i5 = -2072242304;
                    }
                    break;
                case -1539339260:
                case -907616264:
                    C13473.m33144();
                    RunnableC3646.m11813();
                    throw new RuntimeException();
                case -1478090607:
                case 611861760:
                    this.f24147 = list;
                    return;
                case -1279343409:
                case -300150412:
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0773.m3169("۫᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14989) ^ (-1825853814);
                        i5 = 2136197994;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܶۚ")) * (-59);
                        i4 = ((iM2761 ^ i3) * 19573) ^ (-1591254803);
                        i5 = -673853267;
                    }
                    break;
                case -1194968862:
                case -1174075945:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("ۡܶ") ^ i3) * (-5);
                        i4 = ((iM2761 ^ i2) * (-23979)) ^ 2087959300;
                        i5 = -810056833;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ۟") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i2) * (-7753)) ^ (-564374208);
                        i5 = 1302460193;
                    }
                    break;
                case 116746159:
                case 872780543:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0619.m2761("᩷ܺ") ^ i2) * (-73);
                        i4 = ((iM2761 ^ i3) * (-359)) ^ (-1880426732);
                        i5 = 1909210639;
                    } else {
                        iM2761 = C0619.m2761("۠ܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30317) ^ 1136353413;
                        i5 = -1471664403;
                    }
                    break;
                case 219169345:
                case 1108865234:
                    if (C2878.m9491() <= 0) {
                        iM2761 = (C0619.m2761("᩷ܺ") ^ i2) * (-73);
                        i4 = ((iM2761 ^ i3) * (-359)) ^ (-1880426732);
                        i5 = 1909210639;
                    } else {
                        iM2761 = C0773.m3169("۫᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14989) ^ (-1825853814);
                        i5 = 2136197994;
                    }
                    break;
                case 405908668:
                case 991414146:
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0773.m3169("۫᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14989) ^ (-1825853814);
                        i5 = 2136197994;
                    } else {
                        iM2761 = C0773.m3169("᩵ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-747)) ^ (-608839588);
                        i5 = 471622811;
                    }
                    break;
                case 496693822:
                case 921465358:
                    if (C17202.f56030) {
                        iM2761 = C0619.m2761("֡ܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22415)) ^ (-1554031597);
                        i5 = -721422498;
                    } else {
                        iM2761 = C0773.m3169("ܳۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-32717)) ^ 1254964767;
                        i5 = 2040489983;
                    }
                    break;
                case 654052435:
                case 1873081501:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0619.m2761("ۡܶ") ^ i3) * (-5);
                        i4 = ((iM2761 ^ i2) * (-23979)) ^ 2087959300;
                        i5 = -810056833;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۖ᩸")) * 17;
                        i4 = ((iM2761 ^ i2) * 20261) ^ 813536254;
                        i5 = -1436181602;
                    }
                    break;
                case 1356889694:
                case 1380156915:
                    this.f24148 = abstractActivityC17204;
                    if (C2354.m7983()) {
                        iM2761 = C0773.m3169("᩷ܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27405) ^ 1766630987;
                        i5 = -638834448;
                    } else {
                        iM2761 = (C0619.m2761("᩷ܺ") ^ i2) * (-73);
                        i4 = ((iM2761 ^ i3) * (-359)) ^ (-1880426732);
                        i5 = 1909210639;
                    }
                    break;
                default:
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0773.m3169("۫᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14989) ^ (-1825853814);
                        i5 = 2136197994;
                    } else {
                        iM2761 = (C0773.m3169("᩻֨") ^ i2) * 37;
                        i4 = ((iM2761 ^ i3) * (-22173)) ^ (-1222521281);
                        i5 = 693032011;
                    }
                    break;
            }
        }
    }

    public /* synthetic */ ViewOnClickListenerC7330(ViewOnClickListenerC7793 viewOnClickListenerC7793, String str) {
        int i = -1988293353;
        int i2 = C2419.f7754;
        int i3 = C1321.f4751;
        this.f24146 = 1;
        int iM3169 = C0773.m3169("ۤܺ") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-10143)) ^ (-1915570078);
        int i5 = 1342590093;
        while (true) {
            i = ((((i ^ i3) * (-10945)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1954566316:
                case -1392805619:
                    if (C0619.m2763()) {
                        iM3169 = (C0773.m3169("ۚᩴ") + i2) * (-115);
                        i4 = ((iM3169 ^ i3) * (-29845)) ^ (-1403132091);
                        i5 = -165346670;
                    } else {
                        iM3169 = C0619.m2761("ۜ۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-9801)) ^ 1263489141;
                        i5 = 1853174974;
                    }
                    break;
                case -1484773792:
                case -310427743:
                    this.f24147 = str;
                    return;
                case -1305779043:
                case 1447385279:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("ۛۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4499)) ^ (-1727892675);
                        i5 = -2098669314;
                    } else {
                        iM3169 = (C0773.m3169("ۧ۬") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 15015) ^ 737344203;
                        i5 = 784881991;
                    }
                    break;
                case -1280337336:
                case 178242073:
                    C2419.m8174();
                    if (C1826.m6301() < 0) {
                        iM3169 = (C0619.m2761("ۚܳ") ^ i2) * (-119);
                        i4 = ((iM3169 ^ i3) * (-24259)) ^ 766126493;
                        i5 = 662792769;
                    } else {
                        iM3169 = C0773.m3169("۟ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15295)) ^ 1237514360;
                        i5 = -2080744822;
                    }
                    break;
                case -1276092370:
                case 1017903326:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0773.m3169("ۖۙ") ^ i3) * 11;
                        i4 = ((iM3169 ^ i2) * 29329) ^ (-734263423);
                        i5 = 975008099;
                    } else {
                        iM3169 = C0773.m3169("֡ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-609)) ^ (-1132807089);
                        i5 = -1162324040;
                    }
                    break;
                case -1222407318:
                case -733443097:
                    C1146.m4231();
                    iM3169 = C0773.m3169("۟ۨ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-15295)) ^ 1237514360;
                    i5 = -2080744822;
                    break;
                case -1020494867:
                case 1470084754:
                    if (RunnableC1848.m6360()) {
                        iM3169 = C0619.m2761("ۛۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4499)) ^ (-1727892675);
                        i5 = -2098669314;
                    } else {
                        iM3169 = (C0619.m2761("ۛۖ") ^ i3) * (-31);
                        i4 = ((iM3169 ^ i2) * (-7255)) ^ (-604689640);
                        i5 = -2049779553;
                    }
                    break;
                case -892534362:
                case 1206763910:
                    C3779.m12264();
                    if (!RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("۟ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15295)) ^ 1237514360;
                        i5 = -2080744822;
                    } else {
                        iM3169 = (C0773.m3169("ۖۙ") ^ i3) * 11;
                        i4 = ((iM3169 ^ i2) * 29329) ^ (-734263423);
                        i5 = 975008099;
                    }
                    break;
                case -819433890:
                case 2119806826:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ۛۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4499)) ^ (-1727892675);
                        i5 = -2098669314;
                    } else {
                        iM3169 = (C0619.m2761("ܺۤ") ^ i3) * (-113);
                        i4 = ((iM3169 ^ i2) * 26981) ^ (-1535465360);
                        i5 = -38717013;
                    }
                    break;
                case -737161864:
                case 627203608:
                    AbstractC0641.m2813();
                    throw new RuntimeException();
                case -712963205:
                case 614621474:
                    if (C3033.m9845() <= 0) {
                        iM3169 = (C0619.m2761("ۚܳ") ^ i2) * (-119);
                        i4 = ((iM3169 ^ i3) * (-24259)) ^ 766126493;
                        i5 = 662792769;
                    } else {
                        iM3169 = (C0619.m2761("֨۫") ^ i2) * (-91);
                        i4 = ((iM3169 ^ i3) * (-21649)) ^ (-9220006);
                        i5 = -830993501;
                    }
                    break;
                case -663662127:
                case 119640436:
                    this.f24148 = viewOnClickListenerC7793;
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("۟ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15295)) ^ 1237514360;
                        i5 = -2080744822;
                    } else {
                        iM3169 = C0619.m2761("ۛ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26339) ^ 2122968821;
                        i5 = -1829539525;
                    }
                    break;
                case -166722936:
                case 311775115:
                    if (C3734.f12817 < 0) {
                        iM3169 = C0619.m2761("ۛۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4499)) ^ (-1727892675);
                        i5 = -2098669314;
                    } else {
                        iM3169 = C0773.m3169("۟ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15295)) ^ 1237514360;
                        i5 = -2080744822;
                    }
                    break;
                case -142346205:
                case 471874941:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("ۛۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4499)) ^ (-1727892675);
                        i5 = -2098669314;
                    } else {
                        iM3169 = C0773.m3169("ۘ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14789)) ^ (-820436346);
                        i5 = 1197438163;
                    }
                    break;
                case 879444155:
                case 1921481360:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0773.m3169("ۚᩴ") + i2) * (-115);
                        i4 = ((iM3169 ^ i3) * (-29845)) ^ (-1403132091);
                        i5 = -165346670;
                    } else {
                        iM3169 = C0773.m3169("ۛۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13295)) ^ (-42520318);
                        i5 = 1264279867;
                    }
                    break;
                default:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("ۚᩴ") + i2) * (-115);
                        i4 = ((iM3169 ^ i3) * (-29845)) ^ (-1403132091);
                        i5 = -165346670;
                    } else {
                        iM3169 = C0619.m2761("ܽۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 14463) ^ (-1923970425);
                        i5 = 1695029600;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0465 A[PHI: r6 r9 r10 r21 r23 r24 r25
      0x0465: PHI (r6v4 java.lang.Object) = (r6v2 java.lang.Object), (r6v3 java.lang.Object), (r6v2 java.lang.Object), (r6v2 java.lang.Object) binds: [B:107:0x0463, B:64:0x0237, B:53:0x01b8, B:17:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0465: PHI (r9v5 l.۟ۢ֫) = (r9v2 l.۟ۢ֫), (r9v2 l.۟ۢ֫), (r9v4 l.۟ۢ֫), (r9v2 l.۟ۢ֫) binds: [B:107:0x0463, B:64:0x0237, B:53:0x01b8, B:17:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0465: PHI (r10v5 java.lang.String) = (r10v2 java.lang.String), (r10v2 java.lang.String), (r10v4 java.lang.String), (r10v2 java.lang.String) binds: [B:107:0x0463, B:64:0x0237, B:53:0x01b8, B:17:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0465: PHI (r21v28 short) = (r21v11 short), (r21v20 short), (r21v22 short), (r21v29 short) binds: [B:107:0x0463, B:64:0x0237, B:53:0x01b8, B:17:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0465: PHI (r23v19 short) = (r23v3 short), (r23v12 short), (r23v14 short), (r23v20 short) binds: [B:107:0x0463, B:64:0x0237, B:53:0x01b8, B:17:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0465: PHI (r24v19 java.lang.String) = (r24v3 java.lang.String), (r24v12 java.lang.String), (r24v14 java.lang.String), (r24v20 java.lang.String) binds: [B:107:0x0463, B:64:0x0237, B:53:0x01b8, B:17:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0465: PHI (r25v18 int) = (r25v3 int), (r25v11 int), (r25v13 int), (r25v19 int) binds: [B:107:0x0463, B:64:0x0237, B:53:0x01b8, B:17:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        if (l.C3448.f11240 >= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        if (l.C0487.f2131 <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ea, code lost:
    
        if (l.C2023.m6964() > 0) goto L35;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r27) {
        /*
            Method dump skipped, instruction units count: 1412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7330.onClick(android.view.View):void");
    }
}
