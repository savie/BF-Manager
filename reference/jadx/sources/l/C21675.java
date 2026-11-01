package l;

import bin.mt.plus.Main;
import java.io.IOException;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩸ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21675 implements InterfaceC21692 {

    /* JADX INFO: renamed from: ۢ᩺ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f70299 = {638, 23230, 23219, 23203, 23214, 23207, 23218, 23180, 23271, 23270, 23178, 23180, 23271, 23270, 23178, 23180, 23271, 23270, 23178, 23180, 23271, 23270, 23178, 23203, 23230, 23203, 23227, 23218, 23226, 23218, 23204, 23204, 23222, 23216, 23218, 23221, 23202, 23203, 23203, 23224, 23225, 23270, 23221, 23202, 23203, 23203, 23224, 23225, 23269, 23221, 23202, 23203, 23203, 23224, 23225, 23268, 23227, 23222, 23204, 23203, 23176, 23207, 23202, 23204, 23231, 23176, 23230, 23219, 23194, 23204, 23216, 23198, 23219, 23272, 23170, 23204, 23218, 23205, 23225, 23222, 23226, 23218, 23170, 23204, 23218, 23205, 23171, 23214, 23207, 23218, 23207, 23202, 23204, 23231, 23290, 23204, 23231, 23224, 23200};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f70300;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f70301;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f70302;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70303;

    public C21675(Runnable runnable, int i, Main main) {
        int i2 = -1582551975;
        int i3 = C1668.f6641;
        int i4 = RunnableC3388.f12514;
        int iM45029 = C19806.m45029("ۘۚ") ^ i4;
        int i5 = ((iM45029 ^ i3) * 24853) ^ (-1892940683);
        int i6 = 689470821;
        while (true) {
            i2 = ((((i2 ^ i3) * 4979) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -1855493753:
                case -1747576158:
                    C1419.m4973();
                    C2788.m8472();
                    iM45029 = C19806.m45029("۫ܳ") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-12771)) ^ (-838348404);
                    i6 = -619493158;
                    break;
                case -1839625687:
                case 1158898893:
                    C3577.m10565();
                    C2332.m7079();
                    throw new RuntimeException();
                case -1820902048:
                case -1745993548:
                    if (C2788.m8472() != 0) {
                        iM45029 = C19806.m45029("֡ۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 11871) ^ 462389321;
                        i6 = 687349801;
                    } else {
                        iM45029 = C19806.m45029("ۨۚ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-6787)) ^ 1375134683;
                        i6 = 130249099;
                    }
                    break;
                case -1715249978:
                case 1716175511:
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("۠ۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-5655)) ^ (-1848958511);
                        i6 = 1524478522;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-21389)) ^ (-52719463);
                        i6 = -1210251457;
                    }
                    break;
                case -1546880765:
                case 1388250299:
                    if (C7105.m18985()) {
                        iM45029 = C19806.m45029("ܽۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-26701)) ^ (-1034044236);
                        i6 = 1213421523;
                    } else {
                        iM45029 = C19806.m45029("᩵ܽ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-4351)) ^ (-1346234230);
                        i6 = 1463394343;
                    }
                    break;
                case -1393624970:
                case -179559553:
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-21389)) ^ (-52719463);
                        i6 = -1210251457;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩵") ^ i3;
                        i5 = ((iM45029 ^ i4) * 26701) ^ 654577330;
                        i6 = 68067105;
                    }
                    break;
                case -1225235215:
                case 599183585:
                    if (!C3743.f13569) {
                        iM45029 = C19806.m45029("ܽۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-26701)) ^ (-1034044236);
                        i6 = 1213421523;
                    } else {
                        iM45029 = C19806.m45029("۫ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-12771)) ^ (-838348404);
                        i6 = -619493158;
                    }
                    break;
                case -1223141416:
                case 1947300199:
                    this.f70302 = runnable;
                    this.f70303 = i;
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("֡ۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 11871) ^ 462389321;
                        i6 = 687349801;
                    } else {
                        iM45029 = (C19806.m45029("۬ۙ") + i4) * 55;
                        i5 = ((iM45029 ^ i3) * 28991) ^ 825002161;
                        i6 = 167219871;
                    }
                    break;
                case -992108670:
                case -867568340:
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("֡ۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 11871) ^ 462389321;
                        i6 = 687349801;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-30745)) ^ 1702403653;
                        i6 = 884351175;
                    }
                    break;
                case -780099953:
                case -74182421:
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("ܽۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-26701)) ^ (-1034044236);
                        i6 = 1213421523;
                    } else {
                        iM45029 = C19806.m45029("۫᩸") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-11691)) ^ 1454687256;
                        i6 = 1647722253;
                    }
                    break;
                case -753697074:
                case 1008129981:
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("֡ۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 11871) ^ 462389321;
                        i6 = 687349801;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-28635)) ^ 286045667;
                        i6 = -504860386;
                    }
                    break;
                case -699186864:
                case 610900080:
                    if (!C0526.f2219) {
                        iM45029 = (C19806.m45029("ۜ۠") + i3) * (-5);
                        i5 = ((iM45029 ^ i4) * 29383) ^ 1206717479;
                        i6 = -1656549901;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-21389)) ^ (-52719463);
                        i6 = -1210251457;
                    }
                    break;
                case -306368292:
                case 123085503:
                    if (C1377.f5749) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۚ֡")) * 83;
                        i5 = ((iM45029 ^ i4) * (-15699)) ^ (-975258728);
                        i6 = -813205114;
                    } else {
                        iM45029 = C19806.m45029("۫ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-12771)) ^ (-838348404);
                        i6 = -619493158;
                    }
                    break;
                case -33095958:
                case 2145937071:
                    this.f70301 = main;
                    return;
                case 547819997:
                case 842525571:
                    RunnableC1564.m5345();
                    if (RunnableC3388.f12514 < 0) {
                        iM45029 = (C19806.m45029("ۜ۠") + i3) * (-5);
                        i5 = ((iM45029 ^ i4) * 29383) ^ 1206717479;
                        i6 = -1656549901;
                    } else {
                        iM45029 = C19806.m45029("۫ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-12771)) ^ (-838348404);
                        i6 = -619493158;
                    }
                    break;
                default:
                    if (C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸᩺") ^ i3;
                        i5 = ((iM45029 ^ i4) * 24863) ^ (-148584835);
                        i6 = 2059703105;
                    } else {
                        iM45029 = C19806.m45029("֡ۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 11871) ^ 462389321;
                        i6 = 687349801;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC21692
    /* JADX INFO: renamed from: ۙ */
    public final void mo22087(byte[] bArr) throws Throwable {
        Runnable runnable = null;
        Throwable th = null;
        int i = 1352527020;
        int i2 = C1025.f4800;
        int i3 = C1398.f5802;
        int iM11306 = ThreadFactoryC3888.m11306("֡ܶ") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-31533)) ^ 1213374159;
        int i5 = 1410462910;
        while (true) {
            i = ((((i ^ i2) * (-24019)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1916790710:
                case 1942503899:
                    if (C1066.f4915 <= 0) {
                        iM11306 = C19806.m45029("ܶᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-12443)) ^ 1386732464;
                        i5 = -879054385;
                    } else {
                        iM11306 = (C19806.m45029("۠ᩴ") + i2) * 29;
                        i4 = ((iM11306 ^ i3) * (-4689)) ^ (-680147612);
                        i5 = -434362570;
                    }
                    break;
                case -1855541786:
                case 455851261:
                    if (C2788.f10625 < 0) {
                        iM11306 = (C19806.m45029("ܳۗ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-1285)) ^ (-339331669);
                        i5 = -846652776;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17527)) ^ 1302183586;
                        i5 = -895519131;
                    }
                    break;
                case -1807785859:
                case -867139979:
                    if (C1189.m4368() <= 0) {
                        iM11306 = (C19806.m45029("ܳۗ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-1285)) ^ (-339331669);
                        i5 = -846652776;
                    } else {
                        iM11306 = C19806.m45029("ۗܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 26521) ^ (-538422759);
                        i5 = -991102485;
                    }
                    break;
                case -1706864840:
                case 1282526389:
                    if (this.f70300) {
                        iM11306 = (C19806.m45029("ᩴۘ") + i3) * 99;
                        i4 = ((iM11306 ^ i2) * 15039) ^ (-2064021461);
                        i5 = 38804088;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܰۘ")) * 31;
                        i4 = ((iM11306 ^ i3) * 14553) ^ 263879913;
                        i5 = 1746901836;
                    }
                    break;
                case -1592538492:
                case 770765489:
                    runnable = this.f70302;
                    iM11306 = (ThreadFactoryC3888.m11306("ۤܳ") + i2) * (-113);
                    i4 = ((iM11306 ^ i3) * (-28115)) ^ (-1165851147);
                    i5 = -1127820364;
                    break;
                case -1474052741:
                case -1323136924:
                    return;
                case -1384509988:
                case 1300919645:
                    ((RunnableC11196) runnable).run();
                    iM11306 = ThreadFactoryC3888.m11306("ۡۤ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-12139)) ^ (-384902637);
                    i5 = 470929832;
                    break;
                case -1345501966:
                case 471451036:
                    if (C0671.f2816 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17527)) ^ 1302183586;
                        i5 = -895519131;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22949)) ^ (-489911570);
                        i5 = 484533274;
                    }
                    break;
                case -1097195008:
                case -202830903:
                    if (C2332.f8260) {
                        iM11306 = C19806.m45029("᩵ܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24241)) ^ (-1394102712);
                        i5 = 1490964291;
                    } else {
                        iM11306 = C19806.m45029("ܶᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-12443)) ^ 1386732464;
                        i5 = -879054385;
                    }
                    break;
                case -1071324600:
                case 1719331769:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    C1668.m5583();
                    iM11306 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-17527)) ^ 1302183586;
                    i5 = -895519131;
                    break;
                case -943090426:
                case 1424929724:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = C19806.m45029("ܶᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-12443)) ^ 1386732464;
                        i5 = -879054385;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4505) ^ (-119967121);
                        i5 = -2066174572;
                    }
                    break;
                case -899598968:
                case -511084390:
                    C0671.m3008();
                    return;
                case -395781342:
                case 2029668869:
                    if (C1937.m6279() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17527)) ^ 1302183586;
                        i5 = -895519131;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֡ۨ")) * (-39);
                        i4 = ((iM11306 ^ i2) * (-14913)) ^ 2108111725;
                        i5 = -1473643488;
                    }
                    break;
                case -322529679:
                case 975126464:
                    if (this.f70300) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12139)) ^ (-384902637);
                        i5 = 470929832;
                    } else {
                        iM11306 = C19806.m45029("۟ۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11191) ^ (-1843371471);
                        i5 = 2110464753;
                    }
                    break;
                case -268888235:
                case 1537606085:
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20801)) ^ 867460800;
                        i5 = 1261799025;
                    } else {
                        iM11306 = C19806.m45029("ۢᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-5379)) ^ 433597269;
                        i5 = 1906495897;
                    }
                    break;
                case -145994372:
                case 2130998518:
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20801)) ^ 867460800;
                        i5 = 1261799025;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-14487)) ^ (-513445278);
                        i5 = 592979399;
                    }
                    break;
                case 500678515:
                case 1113585665:
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17527)) ^ 1302183586;
                        i5 = -895519131;
                    } else {
                        iM11306 = C19806.m45029("᩷ۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7491)) ^ 1626933393;
                        i5 = 2044382869;
                    }
                    break;
                case 698140023:
                case 1389150245:
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17527)) ^ 1302183586;
                        i5 = -895519131;
                    } else {
                        iM11306 = C19806.m45029("᩵ۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-29253)) ^ (-824423578);
                        i5 = 953816300;
                    }
                    break;
                case 923023478:
                case 1864063104:
                    throw th;
                case 923941528:
                case 1497712910:
                    if (C1398.f5802 <= 0) {
                        iM11306 = C19806.m45029("ܶᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-12443)) ^ 1386732464;
                        i5 = -879054385;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17527)) ^ 1302183586;
                        i5 = -895519131;
                    }
                    break;
                case 1166853056:
                case 1612971501:
                    if (C1066.m4023() <= 0) {
                        iM11306 = (C19806.m45029("ܳۗ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-1285)) ^ (-339331669);
                        i5 = -846652776;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28391) ^ 746435996;
                        i5 = -1980266859;
                    }
                    break;
                case 1318208656:
                case 1574415094:
                    try {
                        m48408(bArr);
                        iM11306 = (i3 - C19806.m45029("۠ܶ")) * (-7);
                        i4 = ((iM11306 ^ i2) * 28577) ^ (-110379219);
                        i5 = 1211286359;
                    } catch (Throwable th2) {
                        th = th2;
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-28417)) ^ (-1949540648);
                        i5 = -357726806;
                    }
                    break;
                default:
                    ((RunnableC11196) runnable).run();
                    iM11306 = (C19806.m45029("ᩴۘ") + i3) * 99;
                    i4 = ((iM11306 ^ i2) * 15039) ^ (-2064021461);
                    i5 = 38804088;
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 46621. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m48408(byte[] r52) {
        /*
            Method dump skipped, instruction units count: 4662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21675.m48408(byte[]):void");
    }

    @Override // l.InterfaceC21692
    /* JADX INFO: renamed from: ۙ */
    public final void mo22086(IOException iOException) {
        int i = 1715704878;
        int i2 = C0278.f1572;
        int i3 = C0629.f2722;
        int iM45029 = (C19806.m45029("ۜᩴ") + i3) * 53;
        int i4 = ((iM45029 ^ i2) * (-9771)) ^ (-498246316);
        int i5 = 1398675098;
        while (true) {
            i = ((((i ^ i2) * 865) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2081306538:
                case -783776980:
                    if (C1189.f5284 > 0) {
                        iM45029 = C19806.m45029("᩷ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 629) ^ 2035898125;
                        i5 = 1652784276;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6085)) ^ 202351244;
                        i5 = -628919419;
                    }
                    break;
                case -2029027080:
                case 60858706:
                    break;
                case -1954414904:
                case 214896986:
                    C0671.m3008();
                    break;
                case -1902284437:
                case -1728653834:
                    C1148.m4232();
                    iM45029 = C19806.m45029("᩶ܳ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 3795) ^ (-1594622616);
                    i5 = 297478464;
                    break;
                case -1900738232:
                case 1111888454:
                    if (this.f70300) {
                        iM45029 = C19806.m45029("᩺۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24209) ^ (-1179688577);
                        i5 = 281823792;
                    } else {
                        iM45029 = C19806.m45029("ۖۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27249) ^ 129056576;
                        i5 = 1457946742;
                    }
                    break;
                case -1601656782:
                case 1861701999:
                    if (C3743.m10966() <= 0) {
                        iM45029 = (C19806.m45029("۫ۛ") + i2) * (-75);
                        i4 = ((iM45029 ^ i3) * 12721) ^ (-60027123);
                        i5 = -569318859;
                    } else {
                        iM45029 = (C19806.m45029("۬ۧ") ^ i3) * (-53);
                        i4 = ((iM45029 ^ i2) * (-31233)) ^ (-1985389344);
                        i5 = 1958161981;
                    }
                    break;
                case -1574568054:
                case 1911527188:
                    C3286.m9798();
                    if (!RunnableC0195.m1431()) {
                        iM45029 = C19806.m45029("ܿۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1665)) ^ 1123806266;
                        i5 = -1645066539;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6085)) ^ 202351244;
                        i5 = -628919419;
                    }
                    break;
                case -1155692975:
                case -122937934:
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("᩷ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 629) ^ 2035898125;
                        i5 = 1652784276;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11519)) ^ 1165254443;
                        i5 = -431341752;
                    }
                    break;
                case -940267254:
                case 896031951:
                    if (C1419.f5860 < 0) {
                        iM45029 = C19806.m45029("ܿۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1665)) ^ 1123806266;
                        i5 = -1645066539;
                    } else {
                        iM45029 = C19806.m45029("᩶ܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3795) ^ (-1594622616);
                        i5 = 297478464;
                    }
                    break;
                case -735996029:
                case -398329920:
                    if (C1419.m4973()) {
                        iM45029 = (C19806.m45029("۫ۛ") + i2) * (-75);
                        i4 = ((iM45029 ^ i3) * 12721) ^ (-60027123);
                        i5 = -569318859;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩷") + i2) * 29;
                        i4 = ((iM45029 ^ i3) * 23981) ^ (-157185323);
                        i5 = 1975830885;
                    }
                    break;
                case -79837847:
                case 1891922855:
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("᩷ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 629) ^ 2035898125;
                        i5 = 1652784276;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20329)) ^ (-2085455492);
                        i5 = -1029582131;
                    }
                    break;
                case 48027580:
                case 592600503:
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("ܿۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1665)) ^ 1123806266;
                        i5 = -1645066539;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2303)) ^ (-72079067);
                        i5 = 1937803731;
                    }
                    break;
                case 517663392:
                case 2073472254:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ۨۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13781) ^ (-944728248);
                        i5 = 1194145081;
                    } else {
                        iM45029 = C19806.m45029("᩷ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 629) ^ 2035898125;
                        i5 = 1652784276;
                    }
                    break;
                case 585072325:
                case 1426697750:
                    if (C2871.f10837 >= 0) {
                        iM45029 = (C19806.m45029("۫ۛ") + i2) * (-75);
                        i4 = ((iM45029 ^ i3) * 12721) ^ (-60027123);
                        i5 = -569318859;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۨ") + i3) * (-17);
                        i4 = ((iM45029 ^ i2) * 24583) ^ (-1376819498);
                        i5 = -1417232129;
                    }
                    break;
                case 629727064:
                case 680695893:
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("᩶ܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3795) ^ (-1594622616);
                        i5 = 297478464;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܽۚ")) * (-55);
                        i4 = ((iM45029 ^ i3) * 19769) ^ 611704365;
                        i5 = 1395912520;
                    }
                    break;
                case 685312225:
                case 1515907746:
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("᩷ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 629) ^ 2035898125;
                        i5 = 1652784276;
                    } else {
                        iM45029 = C19806.m45029("ۡ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19903)) ^ 1020088278;
                        i5 = 1006479145;
                    }
                    break;
                case 1267816917:
                case 1621142242:
                    C2871.m8647(this.f70302);
                    iM45029 = C19806.m45029("᩺۠") ^ i3;
                    i4 = ((iM45029 ^ i2) * 24209) ^ (-1179688577);
                    i5 = 281823792;
                    break;
                default:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (C19806.m45029("۫ۛ") + i2) * (-75);
                        i4 = ((iM45029 ^ i3) * 12721) ^ (-60027123);
                        i5 = -569318859;
                    } else {
                        iM45029 = C19806.m45029("ᩳ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26781) ^ (-1046984660);
                        i5 = -951222881;
                    }
                    break;
            }
            return;
        }
    }
}
