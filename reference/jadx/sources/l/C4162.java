package l;

import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.DataOutputStream;
import java.io.IOException;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۘ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes3.dex */
public final class C4162 implements InterfaceC16840 {

    /* JADX INFO: renamed from: ᩶ᩳ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f14131 = {5869, 18208, 18183, 18207, 18184, 18181, 18176, 18189, 18249, 18201, 18184, 18205, 18205, 18188, 18203, 18183, 18249, 18201, 18184, 18205, 18186, 18177, 18249, 18181, 18184, 18192, 18188, 18203, 7968, 8299, 8259, 8286, 8282, 8279, 8206, 8264, 8263, 8258, 8282, 8267, 8284, 8267, 8266, 8206, 8286, 8271, 8282, 8282, 8267, 8284, 8256, 8206, 8286, 8271, 8282, 8269, 8262, 8206, 8258, 8271, 8279, 8267, 8284};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f14132;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20570 f14133;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f14134;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC0433 f14135;

    /* JADX WARN: Code duplicated, block: B:44:0x0160  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:65:0x0241  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13325(C4162 c4162, int i, int i2, byte[] bArr, int i3, int i4, int i5) {
        int iM3169;
        int i6;
        int i7;
        int iM7764 = 0;
        C20570 c20570 = null;
        int iM8353 = 0;
        int i8 = 160532520;
        int i9 = RunnableC0334.f1808;
        int i10 = C3690.f12684;
        int iM2761 = C0619.m2761("ᩴᩳ") ^ i9;
        int i11 = ((iM2761 ^ i10) * (-30193)) ^ (-278060010);
        int i12 = -1239653704;
        while (true) {
            int i13 = iM2761 ^ i12;
            while (true) {
                i8 = ((((i8 ^ i10) * (-3405)) >> 31) & i11) ^ i13;
                switch (i8) {
                    case -2086612472:
                    case -1124811474:
                        if (C0269.f1558 <= 0) {
                            iM3169 = C0773.m3169("ᩴۧ") ^ i9;
                            i6 = ((iM3169 ^ i10) * (-18773)) ^ (-1470925287);
                            i7 = -888484472;
                        } else {
                            iM3169 = (i9 - C0773.m3169("᩷ܶ")) * (-3);
                            i6 = ((iM3169 ^ i10) * (-26903)) ^ (-696541299);
                            i7 = 212671140;
                        }
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                    case -1978829887:
                    case 1462350860:
                        if (AbstractC0641.m2813() <= 0) {
                            iM3169 = C0773.m3169("ᩴۧ") ^ i9;
                            i6 = ((iM3169 ^ i10) * (-18773)) ^ (-1470925287);
                            i7 = -888484472;
                        } else {
                            iM3169 = (C0619.m2761("ۛۛ") ^ i10) * (-11);
                            i6 = ((iM3169 ^ i9) * 13009) ^ 1231015299;
                            i7 = 315302145;
                        }
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                    case -1901394427:
                    case 1275406673:
                        iM7764 = C2288.m7764(i, i5);
                        if (C3448.f11240 >= 0) {
                            iM3169 = C0773.m3169("ۜܿ") ^ i10;
                            i6 = ((iM3169 ^ i9) * (-32691)) ^ (-290529424);
                            i7 = 339138146;
                        } else {
                            iM3169 = C0619.m2761("ۢ֡") ^ i10;
                            i6 = ((iM3169 ^ i9) * (-28627)) ^ 293238913;
                            i7 = 145624288;
                        }
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                    case -1829002808:
                    case 1296128101:
                        C2702.m8876();
                        iM3169 = (i10 - C0619.m2761("ܿ᩵")) * (-117);
                        i6 = ((iM3169 ^ i9) * 18867) ^ 570325722;
                        i7 = 697280614;
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                    case -1784675890:
                    case -1249197820:
                        if (C20932.f66974 <= 0) {
                            iM3169 = C0773.m3169("ۖ᩸") ^ i10;
                            i6 = ((iM3169 ^ i9) * 4847) ^ (-1450068789);
                            i7 = -1976798002;
                        } else {
                            iM3169 = C0619.m2761("ܿۜ") ^ i10;
                            i6 = ((iM3169 ^ i9) * (-2901)) ^ 2116530255;
                            i7 = -628985618;
                        }
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                    case -1769580641:
                    case -1736882764:
                        break;
                    case -1354690871:
                    case 1382329556:
                        if (C0950.f3488 >= 0) {
                            iM3169 = C0773.m3169("ᩴۧ") ^ i9;
                            i6 = ((iM3169 ^ i10) * (-18773)) ^ (-1470925287);
                            i7 = -888484472;
                        } else {
                            iM3169 = C0773.m3169("ۚܿ") ^ i10;
                            i6 = ((iM3169 ^ i9) * 7615) ^ (-1112490794);
                            i7 = 1353271303;
                        }
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                    case -1260397620:
                    case -145840284:
                        if (C0950.f3488 < 0) {
                        }
                        iM3169 = (i10 - C0619.m2761("ܿ᩵")) * (-117);
                        i6 = ((iM3169 ^ i9) * 18867) ^ 570325722;
                        i7 = 697280614;
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                    case -1220730642:
                    case 912103295:
                        C20570 c20571 = c4162.f14133;
                        iM8353 = (int) C2485.m8353(i2, ((long) i5) + ((long) c20571.m47167()));
                        if (iM7764 < iM8353) {
                            int iM31610 = C0773.m3169("ۤۛ") ^ i10;
                            i11 = ((iM31610 ^ i9) * 24667) ^ 201920529;
                            i13 = iM31610 ^ (-695336537);
                            c20570 = c20571;
                        } else {
                            c20570 = c20571;
                            int iM31611 = C0773.m3169("۠᩹") ^ i9;
                            i13 = iM31611 ^ (-1556527415);
                            i11 = ((iM31611 ^ i10) * (-2541)) ^ (-713504215);
                        }
                        break;
                    case -1059447441:
                    case 2026892781:
                        if (C4282.f15546 <= 0) {
                            iM3169 = C0773.m3169("ᩴۧ") ^ i9;
                            i6 = ((iM3169 ^ i10) * (-18773)) ^ (-1470925287);
                            i7 = -888484472;
                        } else {
                            iM3169 = (C0619.m2761("ۤܺ") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i6 = ((iM3169 ^ i10) * 12819) ^ 882464755;
                            i7 = 606271916;
                        }
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                    case -960910494:
                    case 1851445954:
                        if (AbstractC3624.f12429 <= 0) {
                            iM3169 = (i10 - C0619.m2761("ܿ᩵")) * (-117);
                            i6 = ((iM3169 ^ i9) * 18867) ^ 570325722;
                            i7 = 697280614;
                        } else {
                            iM3169 = (C0773.m3169("ۚۚ") ^ i9) * 91;
                            i6 = ((iM3169 ^ i10) * 1539) ^ 835253439;
                            i7 = 2043804862;
                        }
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                    case -948698151:
                    case -21624396:
                        if (C3099.f10023 <= 0) {
                        }
                        iM3169 = C0773.m3169("ۖ᩸") ^ i10;
                        i6 = ((iM3169 ^ i9) * 4847) ^ (-1450068789);
                        i7 = -1976798002;
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                    case -462301453:
                    case 1837308666:
                        if (C3492.f12043 <= 0) {
                            iM3169 = C0773.m3169("ۖ᩸") ^ i10;
                            i6 = ((iM3169 ^ i9) * 4847) ^ (-1450068789);
                            i7 = -1976798002;
                        } else {
                            iM3169 = C0619.m2761("᩹ۖ") ^ i9;
                            i6 = ((iM3169 ^ i10) * (-11639)) ^ 2074454240;
                            i7 = -177809187;
                        }
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                    case -394421072:
                    case 1307373929:
                        C2702.m8882(c20570.f65889, iM7764 - i5, bArr, (i3 + iM7764) - i4, iM8353 - iM7764);
                        int iM31612 = C0773.m3169("۠᩹") ^ i9;
                        i13 = iM31612 ^ (-1556527415);
                        i11 = ((iM31612 ^ i10) * (-2541)) ^ (-713504215);
                        break;
                    case -138430131:
                    case 717573345:
                        if (C2288.f7433 <= 0) {
                            iM3169 = C0773.m3169("ᩴۧ") ^ i9;
                            i6 = ((iM3169 ^ i10) * (-18773)) ^ (-1470925287);
                            i7 = -888484472;
                            i13 = iM3169 ^ i7;
                            i11 = i6;
                        }
                        iM3169 = C0773.m3169("ۖ᩸") ^ i10;
                        i6 = ((iM3169 ^ i9) * 4847) ^ (-1450068789);
                        i7 = -1976798002;
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                    case -125439295:
                    case 315246664:
                        C0269.m1775();
                        C2375.m8065();
                        break;
                    case 545053131:
                    case 1663280491:
                        if (AbstractC3624.f12429 <= 0) {
                            iM3169 = (i10 - C0619.m2761("ܿ᩵")) * (-117);
                            i6 = ((iM3169 ^ i9) * 18867) ^ 570325722;
                            i7 = 697280614;
                        } else {
                            iM3169 = C0619.m2761("᩹۬") ^ i10;
                            i6 = ((iM3169 ^ i9) * 12313) ^ (-559157743);
                            i7 = 1775881983;
                        }
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                    default:
                        if (C13473.m33144()) {
                            iM3169 = C0619.m2761("ܳۙ") ^ i9;
                            i6 = ((iM3169 ^ i10) * (-11677)) ^ (-2042589551);
                            i7 = -1608574713;
                        } else {
                            iM3169 = (i10 - C0619.m2761("ܿ᩵")) * (-117);
                            i6 = ((iM3169 ^ i9) * 18867) ^ 570325722;
                            i7 = 697280614;
                        }
                        i13 = iM3169 ^ i7;
                        i11 = i6;
                        break;
                }
                return;
            }
            iM2761 = (C0773.m3169("۬ۚ") + i9) * (-3);
            i11 = ((iM2761 ^ i10) * (-3701)) ^ 1782744302;
            i12 = -867775871;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x02ce A[PHI: r19 r20
      0x02ce: PHI (r19v14 int) = (r19v13 int), (r19v15 int) binds: [B:71:0x02f3, B:67:0x02cc] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r20v10 int) = (r20v9 int), (r20v11 int) binds: [B:71:0x02f3, B:67:0x02cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0334 A[PHI: r19 r20
      0x0334: PHI (r19v19 int) = (r19v12 int), (r19v17 int), (r19v20 int) binds: [B:76:0x0332, B:59:0x026e, B:51:0x0222] A[DONT_GENERATE, DONT_INLINE]
      0x0334: PHI (r20v15 int) = (r20v8 int), (r20v13 int), (r20v16 int) binds: [B:76:0x0332, B:59:0x026e, B:51:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x03aa A[PHI: r19 r20
      0x03aa: PHI (r19v36 int) = (r19v10 int), (r19v18 int), (r19v43 int) binds: [B:84:0x03a8, B:55:0x0248, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x03aa: PHI (r20v32 int) = (r20v6 int), (r20v14 int), (r20v37 int) binds: [B:84:0x03a8, B:55:0x0248, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
    
        if (l.C23916.f77426 > 0) goto L12;
     */
    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo11173(final byte[] r24, final int r25, int r26, final long[] r27) {
        /*
            Method dump skipped, instruction units count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4162.mo11173(byte[], int, int, long[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x007c, code lost:
    
        if (l.C3998.f13671 == 0) goto L10;
     */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long m13328(int r49, int r50) {
        /*
            Method dump skipped, instruction units count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4162.m13328(int, int):long");
    }

    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ᩴ */
    public final long mo11176() {
        AbstractC0433 abstractC0433 = null;
        long jMo2251 = 0;
        int i = -1180841134;
        int i2 = C0269.f1558;
        int i3 = C3690.f12684;
        int iM2761 = C0619.m2761("᩺᩵") ^ i3;
        int i4 = ((iM2761 ^ i2) * 8835) ^ (-340881069);
        int i5 = 49471568;
        while (true) {
            i = ((((i ^ i2) * (-15665)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2111465967:
                case 305788830:
                    C1519.m5403();
                    C4238.m13540();
                    iM2761 = C0619.m2761("᩺ۜ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-5211)) ^ (-1079721394);
                    i5 = -751473691;
                    break;
                case -2107257534:
                case 1715625354:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("᩶۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31405)) ^ (-795805309);
                        i5 = -683738826;
                    } else {
                        iM2761 = (C0773.m3169("֫ᩴ") ^ i2) * (-59);
                        i4 = ((iM2761 ^ i3) * 9481) ^ (-1379658490);
                        i5 = -1630909237;
                    }
                    break;
                case -2080292539:
                case 1088179741:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0619.m2761("֡֫") ^ i3) * 51;
                        i4 = ((iM2761 ^ i2) * 7505) ^ (-804405436);
                        i5 = -110973131;
                    } else {
                        iM2761 = (C0619.m2761("ۜᩴ") ^ i3) * 123;
                        i4 = ((iM2761 ^ i2) * (-7303)) ^ (-1662793722);
                        i5 = -377847043;
                    }
                    break;
                case -2016439404:
                case 1006824971:
                    abstractC0433 = this.f14135;
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5211)) ^ (-1079721394);
                        i5 = -751473691;
                    } else {
                        iM2761 = (C0619.m2761("ۖܽ") + i2) * (-73);
                        i4 = ((iM2761 ^ i3) * 21111) ^ 1313045703;
                        i5 = -1189668517;
                    }
                    break;
                case -1079446280:
                case -109727419:
                    C1783.m6232();
                    if (C1783.f6087 <= 0) {
                        iM2761 = (i2 - C0773.m3169("᩸ۙ")) * 51;
                        i4 = ((iM2761 ^ i3) * (-10461)) ^ (-1079666975);
                        i5 = 2018676292;
                    } else {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5211)) ^ (-1079721394);
                        i5 = -751473691;
                    }
                    break;
                case -859553927:
                case 718044457:
                    jMo2251 = abstractC0433.mo2251();
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0619.m2761("֡֫") ^ i3) * 51;
                        i4 = ((iM2761 ^ i2) * 7505) ^ (-804405436);
                        i5 = -110973131;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۡᩳ")) * 51;
                        i4 = ((iM2761 ^ i2) * 865) ^ 1013431986;
                        i5 = 1906902170;
                    }
                    break;
                case -810279319:
                case -22806185:
                    if (C3690.f12684 <= 0) {
                        iM2761 = (i2 - C0773.m3169("᩸ۙ")) * 51;
                        i4 = ((iM2761 ^ i3) * (-10461)) ^ (-1079666975);
                        i5 = 2018676292;
                    } else {
                        iM2761 = C0619.m2761("ܰܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10375)) ^ (-1316357966);
                        i5 = 92930875;
                    }
                    break;
                case -697413291:
                case 786405164:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("ۘܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7699)) ^ 1066205350;
                        i5 = -2124714304;
                    } else {
                        iM2761 = (C0773.m3169("᩹᩶") + i3) * 93;
                        i4 = ((iM2761 ^ i2) * 17535) ^ (-251301327);
                        i5 = 547400117;
                    }
                    break;
                case -305852121:
                case 941999128:
                    C3492.m11488();
                    return 0L;
                case -144234225:
                case -126133757:
                    C2023.m6964();
                    if (C0269.f1558 > 0) {
                        iM2761 = C0773.m3169("ۘܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7699)) ^ 1066205350;
                        i5 = -2124714304;
                    } else {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5211)) ^ (-1079721394);
                        i5 = -751473691;
                    }
                    break;
                case -68206288:
                case 1080418071:
                    return jMo2251 + 16;
                case -13445924:
                case 145132391:
                    if (C0269.m1775() <= 0) {
                        iM2761 = (i2 - C0773.m3169("᩸ۙ")) * 51;
                        i4 = ((iM2761 ^ i3) * (-10461)) ^ (-1079666975);
                        i5 = 2018676292;
                    } else {
                        iM2761 = C0773.m3169("ۙۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1655)) ^ (-517783098);
                        i5 = 278459836;
                    }
                    break;
                case 576160208:
                case 1035417681:
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5211)) ^ (-1079721394);
                        i5 = -751473691;
                    } else {
                        iM2761 = (C0619.m2761("֨ۤ") + i3) * (-75);
                        i4 = ((iM2761 ^ i2) * 19487) ^ 955707845;
                        i5 = 216250382;
                    }
                    break;
                case 1071560333:
                case 1479799058:
                    if (C0619.f2439) {
                        iM2761 = (C0619.m2761("֡֫") ^ i3) * 51;
                        i4 = ((iM2761 ^ i2) * 7505) ^ (-804405436);
                        i5 = -110973131;
                    } else {
                        iM2761 = C0619.m2761("ᩴܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22759)) ^ 487101828;
                        i5 = -1117305935;
                    }
                    break;
                case 1702791486:
                case 1945858699:
                    if (C2023.m6964() > 0) {
                        iM2761 = C0773.m3169("᩶۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31405)) ^ (-795805309);
                        i5 = -683738826;
                    } else {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5211)) ^ (-1079721394);
                        i5 = -751473691;
                    }
                    break;
                default:
                    if (RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5211)) ^ (-1079721394);
                        i5 = -751473691;
                    } else {
                        iM2761 = C0773.m3169("۬ۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1485) ^ (-2045217013);
                        i5 = -1067999935;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01c5 A[PHI: r1 r2 r4
      0x01c5: PHI (r1v2 int) = (r1v1 int), (r1v1 int), (r1v1 int), (r1v3 int) binds: [B:51:0x01c3, B:39:0x0130, B:35:0x010d, B:27:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r2v2 long) = (r2v1 long), (r2v1 long), (r2v1 long), (r2v3 long) binds: [B:51:0x01c3, B:39:0x0130, B:35:0x010d, B:27:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r4v2 long) = (r4v1 long), (r4v1 long), (r4v1 long), (r4v3 long) binds: [B:51:0x01c3, B:39:0x0130, B:35:0x010d, B:27:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0233  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13327(C4162 c4162, int i, int i2, long[] jArr, int i3, int i4) {
        int iM2761;
        int i5;
        int i6;
        int i7 = i4;
        int iM7764 = 0;
        long j = 0;
        long j2 = 0;
        long jM8353 = 0;
        int i8 = -1047274192;
        int i9 = C20932.f66974;
        int i10 = C1321.f4751;
        int iM2762 = C0619.m2761("ۧ᩶") ^ i10;
        int i11 = ((iM2762 ^ i9) * 191) ^ 130877182;
        int i12 = iM2762 ^ (-1968689649);
        while (true) {
            i8 = ((((i8 ^ i9) * (-3235)) >> 31) & i11) ^ i12;
            switch (i8) {
                case -2112936371:
                case -615862691:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("ۗᩳ") ^ i10;
                        i5 = ((iM2761 ^ i9) * 5415) ^ (-1294005131);
                        i6 = -1424000629;
                    } else {
                        iM2761 = (C0773.m3169("ᩴܺ") + i10) * (-63);
                        i5 = ((iM2761 ^ i9) * 27171) ^ 1136472268;
                        i6 = -1444316428;
                    }
                    i12 = iM2761 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -2064393356:
                case 1479772431:
                    iM7764 = C2288.m7764(i, i7);
                    j = i2;
                    j2 = i7;
                    if (C13473.f42873 != 0) {
                        iM2761 = (i10 - C0773.m3169("᩺ۙ")) * 15;
                        i5 = ((iM2761 ^ i9) * 26877) ^ 1650568510;
                        i6 = 979136454;
                        i12 = iM2761 ^ i6;
                        i11 = i5;
                    } else {
                        int iM2763 = (i10 - C0619.m2761("ۛۚ")) * (-111);
                        i11 = ((iM2763 ^ i9) * 30175) ^ (-1333644584);
                        i12 = iM2763 ^ (-451366403);
                    }
                    i7 = i4;
                    break;
                case -2007905914:
                case -1989106183:
                    if (C3099.f10023 > 0) {
                        iM2761 = C0619.m2761("ۗᩳ") ^ i10;
                        i5 = ((iM2761 ^ i9) * 5415) ^ (-1294005131);
                        i6 = -1424000629;
                        i12 = iM2761 ^ i6;
                        i11 = i5;
                        i7 = i4;
                    }
                    iM2761 = (C0773.m3169("۠ۙ") + i9) * (-79);
                    i5 = ((iM2761 ^ i10) * (-25941)) ^ 481710120;
                    i6 = 1155588703;
                    i12 = iM2761 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -1733967158:
                case 741343515:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0619.m2761("֡᩸") + i9) * (-49);
                        i5 = ((iM2761 ^ i10) * 29555) ^ (-746085589);
                        i6 = -658638525;
                    } else {
                        iM2761 = C0619.m2761("ᩳ᩺") ^ i10;
                        i5 = ((iM2761 ^ i9) * 8009) ^ (-1326077827);
                        i6 = -636080450;
                    }
                    i12 = iM2761 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -1225478274:
                case 554599969:
                    jM8353 = C2485.m8353(j, ((long) c4162.f14133.m47167()) + j2);
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0773.m3169("۠ۙ") + i9) * (-79);
                        i5 = ((iM2761 ^ i10) * (-25941)) ^ 481710120;
                        i6 = 1155588703;
                        i12 = iM2761 ^ i6;
                        i11 = i5;
                        i7 = i4;
                    } else {
                        int iM3169 = (C0773.m3169("ۘ֡") + i9) * (-35);
                        i12 = iM3169 ^ 831010620;
                        i11 = ((iM3169 ^ i10) * (-4405)) ^ (-1563271255);
                    }
                    break;
                case -1075563721:
                case 928104748:
                    if (C3690.f12684 <= 0) {
                        iM2761 = (i10 - C0773.m3169("᩺ۙ")) * 15;
                        i5 = ((iM2761 ^ i9) * 26877) ^ 1650568510;
                        i6 = 979136454;
                    } else {
                        iM2761 = C0773.m3169("ۧۡ") ^ i9;
                        i5 = ((iM2761 ^ i10) * (-11555)) ^ (-1309184508);
                        i6 = -1463602670;
                    }
                    i12 = iM2761 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -747106636:
                case 2139196485:
                    if (C3690.m11987()) {
                        iM2761 = (i10 - C0773.m3169("᩺ۙ")) * 15;
                        i5 = ((iM2761 ^ i9) * 26877) ^ 1650568510;
                        i6 = 979136454;
                    } else {
                        iM2761 = C0619.m2761("ۤ۠") ^ i9;
                        i5 = ((iM2761 ^ i10) * 3779) ^ (-1966295794);
                        i6 = -875886994;
                    }
                    i12 = iM2761 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -519630185:
                case -327972961:
                    if (C3734.m12152() >= 0) {
                        iM2761 = (C0619.m2761("֡᩸") + i9) * (-49);
                        i5 = ((iM2761 ^ i10) * 29555) ^ (-746085589);
                        i6 = -658638525;
                    } else {
                        iM2761 = C0773.m3169("᩻ۛ") ^ i10;
                        i5 = ((iM2761 ^ i9) * (-22379)) ^ 1799823981;
                        i6 = -22516300;
                    }
                    i12 = iM2761 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -432936905:
                case 226969740:
                    C1343.m4943();
                    iM2761 = (C0773.m3169("۠ۙ") + i9) * (-79);
                    i5 = ((iM2761 ^ i10) * (-25941)) ^ 481710120;
                    i6 = 1155588703;
                    i12 = iM2761 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -124193246:
                case 733908929:
                    if (C3690.f12684 > 0) {
                        iM2761 = (C0619.m2761("֡᩸") + i9) * (-49);
                        i5 = ((iM2761 ^ i10) * 29555) ^ (-746085589);
                        i6 = -658638525;
                        i12 = iM2761 ^ i6;
                        i11 = i5;
                        i7 = i4;
                    }
                    iM2761 = (C0773.m3169("۠ۙ") + i9) * (-79);
                    i5 = ((iM2761 ^ i10) * (-25941)) ^ 481710120;
                    i6 = 1155588703;
                    i12 = iM2761 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case 342554730:
                case 438242924:
                    C10127.m26103(iM7764 - i3, ((int) jM8353) - i3, jArr);
                    break;
                case 370859527:
                case 1423813729:
                    if (C3099.f10023 > 0) {
                        iM2761 = C0773.m3169("᩹ۗ") ^ i10;
                        i5 = ((iM2761 ^ i9) * (-21721)) ^ 1855990783;
                        i6 = 803947004;
                        i12 = iM2761 ^ i6;
                        i11 = i5;
                        i7 = i4;
                    }
                    iM2761 = (C0773.m3169("۠ۙ") + i9) * (-79);
                    i5 = ((iM2761 ^ i10) * (-25941)) ^ 481710120;
                    i6 = 1155588703;
                    i12 = iM2761 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case 1142295475:
                case 2078165643:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (i10 - C0773.m3169("᩺ۙ")) * 15;
                        i5 = ((iM2761 ^ i9) * 26877) ^ 1650568510;
                        i6 = 979136454;
                    } else {
                        iM2761 = C0773.m3169("ۛ᩶") ^ i10;
                        i5 = ((iM2761 ^ i9) * 26941) ^ (-425991744);
                        i6 = 1977630516;
                    }
                    i12 = iM2761 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case 1421476990:
                case 2089664418:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0773.m3169("۠ۙ") + i9) * (-79);
                        i5 = ((iM2761 ^ i10) * (-25941)) ^ 481710120;
                        i6 = 1155588703;
                    } else {
                        iM2761 = C0773.m3169("֡᩵") ^ i9;
                        i5 = ((iM2761 ^ i10) * 18349) ^ (-679244327);
                        i6 = -1792527546;
                    }
                    i12 = iM2761 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case 1450971253:
                case 1570238005:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("᩹ۗ") ^ i10;
                        i5 = ((iM2761 ^ i9) * (-21721)) ^ 1855990783;
                        i6 = 803947004;
                    } else {
                        iM2761 = (C0773.m3169("ܳܿ") ^ i9) * 63;
                        i5 = ((iM2761 ^ i10) * (-5959)) ^ 953152244;
                        i6 = -869695260;
                    }
                    i12 = iM2761 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                default:
                    RunnableC1848.m6360();
                    C0619.m2763();
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ᩷ */
    public final long mo11177(int i, int i2) {
        int iM2761;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iM8883;
        int i8;
        int i9;
        int i10;
        int iM3169;
        int i11;
        int i12;
        int i13 = C1080.f3865;
        int i14 = C1542.f5343;
        int iM2762 = C0619.m2761("ܽ᩹") ^ i14;
        int i15 = ((iM2762 ^ i13) * (-32001)) ^ (-1122146906);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i16 = iM2762 ^ 251928217;
        int i17 = 0;
        int iMo2240 = 0;
        int i18 = 0;
        int i19 = -2125399286;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        C20570 c20570 = null;
        long j7 = 0;
        long j8 = 0;
        int iM7976 = 0;
        AbstractC0433 abstractC0433 = null;
        long j9 = 0;
        int iM47167 = 0;
        long j10 = 0;
        long j11 = 0;
        int i20 = 0;
        while (true) {
            i19 = i16 ^ ((((i19 ^ i13) * 23725) >> 31) & i15);
            switch (i19) {
                case -2121343998:
                case -1205935673:
                    j3 = j6 * j8;
                    if (C3998.f13671 == 0) {
                        iM2761 = C0619.m2761("ܽۗ") ^ i13;
                        i15 = ((iM2761 ^ i14) * (-30985)) ^ (-1810875869);
                        i3 = 1757563143;
                        i16 = iM2761 ^ i3;
                    } else {
                        i8 = iM7976;
                        i9 = i20;
                        i10 = i17;
                        iM3169 = C0773.m3169("ۡ᩺") ^ i14;
                        i15 = ((iM3169 ^ i13) * (-12309)) ^ (-677132699);
                        i11 = 286093252;
                        i12 = iM3169 ^ i11;
                        i17 = i10;
                        iM7976 = i8;
                        i20 = i9;
                        i16 = i12;
                    }
                    break;
                case -2082158785:
                case -330908626:
                    iMo2240 = abstractC0433.mo2240(i18, iM7976);
                    if (iMo2240 == 0) {
                        iM2761 = C0773.m3169("۬ۙ") ^ i13;
                        i15 = ((iM2761 ^ i14) * (-11879)) ^ (-1623970276);
                        i3 = -1172540038;
                    } else {
                        iM2761 = (i13 - C0773.m3169("ۗۧ")) * q.h;
                        i15 = ((iM2761 ^ i14) * (-20875)) ^ (-1790056604);
                        i3 = 1887633662;
                    }
                    i16 = iM2761 ^ i3;
                    break;
                case -2073240511:
                case 180397579:
                    return abstractC0433.mo2241();
                case -2067672863:
                case 1309883682:
                    abstractC0433 = this.f14135;
                    C3734.m12155(abstractC0433);
                    i8 = iM7976;
                    int i21 = i20;
                    i10 = i17;
                    long j12 = i21;
                    if (C1321.f4751 >= 0) {
                        i9 = i21;
                        j10 = j12;
                        iM3169 = C0773.m3169("ۜۤ") ^ i14;
                        i15 = ((iM3169 ^ i13) * 19265) ^ 152362580;
                        i11 = -1346320646;
                        i12 = iM3169 ^ i11;
                        i17 = i10;
                        iM7976 = i8;
                        i20 = i9;
                        i16 = i12;
                    } else {
                        int iM31610 = (C0773.m3169("ܺۢ") + i14) * (-59);
                        i15 = ((iM31610 ^ i13) * (-21841)) ^ (-988546751);
                        i17 = i10;
                        iM7976 = i8;
                        i20 = i21;
                        i16 = iM31610 ^ (-35733101);
                        j10 = j12;
                    }
                    break;
                case -1901241270:
                case -197738796:
                    j11 = ((long) iMo2240) * j5;
                    j9 = j11 + j2;
                    if (iMo2240 <= i17) {
                        iM2761 = (i14 - C0773.m3169("ܺ᩷")) * 55;
                        i15 = ((iM2761 ^ i13) * (-14537)) ^ (-1911425421);
                        i3 = -564100224;
                    } else {
                        iM2761 = C0773.m3169("ܳ۠") ^ i14;
                        i15 = ((iM2761 ^ i13) * 30691) ^ 1554528066;
                        i3 = 1229447361;
                    }
                    i16 = iM2761 ^ i3;
                    break;
                case -1865822974:
                case -56081028:
                    j4 = 1;
                    j = j7 + 1;
                    if (j <= -2147483648L) {
                        iM2761 = C0773.m3169("֫۟") ^ i14;
                        i15 = ((iM2761 ^ i13) * 1653) ^ 1521887128;
                        i3 = 647857589;
                    } else {
                        iM2761 = (C0773.m3169("ۙ֫") + i13) * (-53);
                        i15 = ((iM2761 ^ i14) * (-26087)) ^ (-25399760);
                        i3 = -395595084;
                    }
                    i16 = iM2761 ^ i3;
                    break;
                case -1795760981:
                case 1311805725:
                    j5 = 4;
                    j2 = 48;
                    if (abstractC0433 instanceof C7891) {
                        iM2761 = (C0619.m2761("ۖ᩹") ^ i13) * 51;
                        i15 = ((iM2761 ^ i14) * (-16217)) ^ (-1997395848);
                        i3 = -759529944;
                    } else {
                        iM2761 = (C0619.m2761("ܳܰ") + i14) * (-93);
                        i15 = ((iM2761 ^ i13) * (-21951)) ^ (-681122832);
                        i3 = 745372730;
                    }
                    i16 = iM2761 ^ i3;
                    break;
                case -1788811661:
                case -1629507491:
                    return j2;
                case -1721706957:
                case 1943426060:
                    if (C2310.f7472 < 0) {
                        i8 = iM7976;
                        i9 = i20;
                        i10 = i17;
                        iM3169 = C0773.m3169("ۡ᩺") ^ i14;
                        i15 = ((iM3169 ^ i13) * (-12309)) ^ (-677132699);
                        i11 = 286093252;
                        i12 = iM3169 ^ i11;
                        i17 = i10;
                        iM7976 = i8;
                        i20 = i9;
                        i16 = i12;
                    } else {
                        iM2761 = C0773.m3169("۫֡") ^ i13;
                        i15 = ((iM2761 ^ i14) * (-8639)) ^ (-994078571);
                        i3 = 442885616;
                        i16 = iM2761 ^ i3;
                    }
                    break;
                case -1717155106:
                case -676273712:
                    return abstractC0433.mo2241();
                case -1595977884:
                case -93219394:
                    i8 = iM7976;
                    i9 = i20;
                    i10 = i17;
                    if (C20932.m47848() != 0) {
                        iM3169 = C0773.m3169("ۜۤ") ^ i14;
                        i15 = ((iM3169 ^ i13) * 19265) ^ 152362580;
                        i11 = -1346320646;
                    } else {
                        iM3169 = (i14 - C0619.m2761("۟ܿ")) * 127;
                        i15 = ((iM3169 ^ i13) * (-13929)) ^ 1910788324;
                        i11 = 2124660494;
                    }
                    i12 = iM3169 ^ i11;
                    i17 = i10;
                    iM7976 = i8;
                    i20 = i9;
                    i16 = i12;
                    break;
                case -1366785895:
                case 2541280:
                    j8 = 8;
                    j6 = (j11 - j4) / 8;
                    if (C20932.f66974 > 0) {
                        iM2761 = C0773.m3169("᩷ᩴ") ^ i14;
                        i15 = ((iM2761 ^ i13) * (-6055)) ^ 1996289396;
                        i3 = -924036365;
                        i16 = iM2761 ^ i3;
                    } else {
                        i8 = iM7976;
                        i9 = i20;
                        i10 = i17;
                        iM3169 = C0773.m3169("ۜۤ") ^ i14;
                        i15 = ((iM3169 ^ i13) * 19265) ^ 152362580;
                        i11 = -1346320646;
                        i12 = iM3169 ^ i11;
                        i17 = i10;
                        iM7976 = i8;
                        i20 = i9;
                        i16 = i12;
                    }
                    break;
                case -1281034027:
                case 2137993956:
                    return Math.max(j9, j3 + 64);
                case -1164765553:
                case 1368893903:
                    i6 = iM7976;
                    i4 = i20;
                    i5 = i17;
                    iM47167 = c20570.m47167();
                    if (C3099.f10023 > 0) {
                        int iM2763 = C0619.m2761("۬ۡ") ^ i14;
                        i7 = ((iM2763 ^ i13) * (-597)) ^ (-1104244232);
                        iM7976 = i6;
                        i16 = iM2763 ^ 124919931;
                        i15 = i7;
                        i17 = i5;
                        i20 = i4;
                    } else {
                        iM8883 = i4;
                        int iM2764 = C0619.m2761("ᩴ᩻") ^ i13;
                        i17 = i5;
                        i20 = iM8883;
                        i15 = ((iM2764 ^ i14) * (-26967)) ^ (-1995340796);
                        int i22 = i6;
                        i16 = iM2764 ^ (-1464644509);
                        iM7976 = i22;
                    }
                    break;
                case -1056739570:
                case 509011145:
                    C20932.m47848();
                    if (AbstractC0641.f2496 < 0) {
                        i4 = i20;
                        i5 = i17;
                        int iM31611 = (i14 - C0773.m3169("᩵᩵")) * (-45);
                        i7 = ((iM31611 ^ i13) * (-29309)) ^ 221759565;
                        i16 = iM31611 ^ 1442491951;
                        i15 = i7;
                        i17 = i5;
                        i20 = i4;
                    } else {
                        i8 = iM7976;
                        i9 = i20;
                        i10 = i17;
                        iM3169 = C0773.m3169("ۜۤ") ^ i14;
                        i15 = ((iM3169 ^ i13) * 19265) ^ 152362580;
                        i11 = -1346320646;
                        i12 = iM3169 ^ i11;
                        i17 = i10;
                        iM7976 = i8;
                        i20 = i9;
                        i16 = i12;
                    }
                    break;
                case -987001128:
                case 1960310573:
                    i4 = i20;
                    i5 = i17;
                    iM7976 = C2354.m7976(i2, this.f14132);
                    C20570 c20571 = this.f14133;
                    if (C0619.f2439) {
                        c20570 = c20571;
                        int iM31612 = (i14 - C0773.m3169("᩵᩵")) * (-45);
                        i7 = ((iM31612 ^ i13) * (-29309)) ^ 221759565;
                        i16 = iM31612 ^ 1442491951;
                        i15 = i7;
                    } else {
                        int iM2765 = (C0619.m2761("֫۠") ^ i13) * 85;
                        c20570 = c20571;
                        i15 = ((iM2765 ^ i14) * 13545) ^ (-558920395);
                        i16 = iM2765 ^ (-2000740274);
                    }
                    i17 = i5;
                    i20 = i4;
                    break;
                case -848177553:
                case 92845174:
                    i5 = i17;
                    i6 = iM7976;
                    iM8883 = C2702.m8883(i, this.f14134);
                    if (!C3077.f9998) {
                        int iM2766 = C0619.m2761("ᩴ᩻") ^ i13;
                        i17 = i5;
                        i20 = iM8883;
                        i15 = ((iM2766 ^ i14) * (-26967)) ^ (-1995340796);
                        int i23 = i6;
                        i16 = iM2766 ^ (-1464644509);
                        iM7976 = i23;
                    } else {
                        int iM31613 = (C0773.m3169("ܳۖ") + i13) * 25;
                        int i24 = ((iM31613 ^ i14) * (-25577)) ^ (-816574468);
                        i12 = iM31613 ^ 432211422;
                        i17 = i5;
                        i20 = iM8883;
                        i15 = i24;
                        iM7976 = i6;
                        i16 = i12;
                    }
                    break;
                case -845327779:
                case 868154576:
                    return (((long) iMo2240) * j5) + j2;
                case -657791162:
                case -425599650:
                    C1519.m5403();
                    return 0L;
                case -617145438:
                case 1335665739:
                    C4282.m13644();
                    i8 = iM7976;
                    i9 = i20;
                    i10 = i17;
                    iM3169 = C0773.m3169("ۜۤ") ^ i14;
                    i15 = ((iM3169 ^ i13) * 19265) ^ 152362580;
                    i11 = -1346320646;
                    i12 = iM3169 ^ i11;
                    i17 = i10;
                    iM7976 = i8;
                    i20 = i9;
                    i16 = i12;
                    break;
                case -582389755:
                case 1878848269:
                    i18 = Integer.MIN_VALUE;
                    iM2761 = C0773.m3169("ۧۗ") ^ i14;
                    i15 = ((iM2761 ^ i13) * 11243) ^ 696264525;
                    i3 = -1524129582;
                    i16 = iM2761 ^ i3;
                    break;
                case -489590438:
                case 431140122:
                    i8 = iM7976;
                    i9 = i20;
                    i10 = i17;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("᩸ᩴ") ^ i13;
                        i15 = ((iM3169 ^ i14) * (-30581)) ^ (-431142096);
                        i11 = 1195765482;
                    } else {
                        iM3169 = (C0773.m3169("ܿܰ") + i14) * 41;
                        i15 = ((iM3169 ^ i13) * 3635) ^ 273427630;
                        i11 = 230502890;
                    }
                    i12 = iM3169 ^ i11;
                    i17 = i10;
                    iM7976 = i8;
                    i20 = i9;
                    i16 = i12;
                    break;
                case -431322655:
                case 1605781443:
                    return (((long) iMo2240) * j5) + j2;
                case -341983241:
                case -297146110:
                    j7 = j10 - ((long) iM47167);
                    if (C1519.f5300 < 0) {
                        iM2761 = (C0619.m2761("ܺܰ") + i13) * (-97);
                        i15 = ((iM2761 ^ i14) * (-11855)) ^ 1729867344;
                        i3 = 558445534;
                        i16 = iM2761 ^ i3;
                    } else {
                        i4 = i20;
                        i5 = i17;
                        int iM31614 = (i14 - C0773.m3169("᩵᩵")) * (-45);
                        i7 = ((iM31614 ^ i13) * (-29309)) ^ 221759565;
                        i16 = iM31614 ^ 1442491951;
                        i15 = i7;
                        i17 = i5;
                        i20 = i4;
                    }
                    break;
                case 288809442:
                case 1635450623:
                    return 0L;
                case 290725515:
                case 1483489361:
                    if (C1542.f5343 <= 0) {
                        i8 = iM7976;
                        i9 = i20;
                        i10 = i17;
                        iM3169 = C0619.m2761("᩸ᩴ") ^ i13;
                        i15 = ((iM3169 ^ i14) * (-30581)) ^ (-431142096);
                        i11 = 1195765482;
                        i12 = iM3169 ^ i11;
                        i17 = i10;
                        iM7976 = i8;
                        i20 = i9;
                        i16 = i12;
                    }
                    i8 = iM7976;
                    i9 = i20;
                    i10 = i17;
                    iM3169 = C0773.m3169("ۜۤ") ^ i14;
                    i15 = ((iM3169 ^ i13) * 19265) ^ 152362580;
                    i11 = -1346320646;
                    i12 = iM3169 ^ i11;
                    i17 = i10;
                    iM7976 = i8;
                    i20 = i9;
                    i16 = i12;
                    break;
                case 412402680:
                case 2076790890:
                    i18 = (int) j;
                    iM2761 = C0773.m3169("ۧۗ") ^ i14;
                    i15 = ((iM2761 ^ i13) * 11243) ^ 696264525;
                    i3 = -1524129582;
                    i16 = iM2761 ^ i3;
                    break;
                case 497744665:
                case 1696455725:
                    return j9;
                case 893950503:
                case 1181033577:
                    i8 = iM7976;
                    i9 = i20;
                    i10 = i17;
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ۡ᩺") ^ i14;
                        i15 = ((iM3169 ^ i13) * (-12309)) ^ (-677132699);
                        i11 = 286093252;
                    } else {
                        iM3169 = C0773.m3169("ۘ᩸") ^ i13;
                        i15 = ((iM3169 ^ i14) * (-773)) ^ 1440719062;
                        i11 = 2075785004;
                    }
                    i12 = iM3169 ^ i11;
                    i17 = i10;
                    iM7976 = i8;
                    i20 = i9;
                    i16 = i12;
                    break;
                case 1343129830:
                case 2090809414:
                    if (iMo2240 == abstractC0433.mo2248()) {
                        iM2761 = C0619.m2761("ܳܺ") ^ i13;
                        i15 = ((iM2761 ^ i14) * 14381) ^ (-983691539);
                        i3 = -777644412;
                    } else {
                        iM2761 = C0619.m2761("ۨۗ") ^ i14;
                        i15 = ((iM2761 ^ i13) * (-899)) ^ (-358561975);
                        i3 = -577257368;
                    }
                    i16 = iM2761 ^ i3;
                    break;
                case 1562545802:
                case 1741471129:
                    if (iMo2240 >= 3) {
                        iM2761 = C0619.m2761("۠ۚ") ^ i13;
                        i15 = ((iM2761 ^ i14) * (-8743)) ^ (-1021335136);
                        i3 = 1169767759;
                    } else {
                        iM2761 = C0619.m2761("ۛ᩵") ^ i13;
                        i15 = ((iM2761 ^ i14) * (-9085)) ^ 353698200;
                        i3 = 1026306547;
                    }
                    i16 = iM2761 ^ i3;
                    break;
                case 1616715420:
                case 2134538527:
                    if (iMo2240 <= i17) {
                        iM2761 = C0773.m3169("ܳۛ") ^ i13;
                        i15 = ((iM2761 ^ i14) * (-26751)) ^ 1985971265;
                        i3 = 385606333;
                    } else {
                        iM2761 = (i13 - C0773.m3169("ۤܺ")) * 77;
                        i15 = ((iM2761 ^ i14) * (-14023)) ^ 2133340056;
                        i3 = 1680080308;
                    }
                    i16 = iM2761 ^ i3;
                    break;
                case 1647883874:
                case 2068118529:
                    i17 = 64;
                    if (abstractC0433 instanceof C1925) {
                        iM2761 = C0773.m3169("᩻ۤ") ^ i14;
                        i15 = ((iM2761 ^ i13) * (-17763)) ^ 1525413242;
                        i3 = 692053369;
                    } else {
                        iM2761 = C0619.m2761("ۘۖ") ^ i14;
                        i15 = ((iM2761 ^ i13) * (-9043)) ^ (-760366676);
                        i3 = -1118329850;
                    }
                    i16 = iM2761 ^ i3;
                    break;
                default:
                    if (!RunnableC3646.f12471) {
                        iM2761 = C0773.m3169("۫֡") ^ i13;
                        i15 = ((iM2761 ^ i14) * (-8639)) ^ (-994078571);
                        i3 = 442885616;
                        i16 = iM2761 ^ i3;
                    } else {
                        i4 = i20;
                        i5 = i17;
                        int iM31615 = (i14 - C0773.m3169("᩵᩵")) * (-45);
                        i7 = ((iM31615 ^ i13) * (-29309)) ^ 221759565;
                        i16 = iM31615 ^ 1442491951;
                        i15 = i7;
                        i17 = i5;
                        i20 = i4;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11175(InterfaceC16840 interfaceC16840) {
        C4162 c4162 = null;
        int iM47167 = 0;
        int i = 979860388;
        int i2 = C2287.f7432;
        int i3 = C1783.f6087;
        int iM2761 = (C0619.m2761("֡ۤ") ^ i2) * 91;
        int i4 = ((iM2761 ^ i3) * 12607) ^ (-1588825059);
        int i5 = -212050780;
        while (true) {
            i = ((((i ^ i3) * 28149) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2052773979:
                case 1991528265:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("ۛܳ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * (-12789)) ^ (-152233051);
                        i5 = 243770191;
                    } else {
                        iM2761 = C0773.m3169("ۛۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14139) ^ 676445013;
                        i5 = 1848095012;
                    }
                    break;
                case -1980784053:
                case 368300787:
                    return false;
                case -1920300117:
                case -1076672688:
                    if (this.f14132 == c4162.f14132) {
                        iM2761 = C0773.m3169("᩹ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23115)) ^ 1853816802;
                        i5 = -1962597741;
                    } else {
                        iM2761 = (C0619.m2761("ۚ۫") + i3) * 5;
                        i4 = ((iM2761 ^ i2) * 14607) ^ 1130785934;
                        i5 = -85592024;
                    }
                    break;
                case -1823612737:
                case 2069901834:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0619.m2761("ۛܳ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * (-12789)) ^ (-152233051);
                        i5 = 243770191;
                    } else {
                        iM2761 = C0773.m3169("᩻ܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19579) ^ (-1638379698);
                        i5 = -1838026786;
                    }
                    break;
                case -1671857557:
                case -666453494:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("ۛۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14139) ^ 676445013;
                        i5 = 1848095012;
                    } else {
                        iM2761 = C0773.m3169("ۜܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11751) ^ 1652419326;
                        i5 = 1645565586;
                    }
                    break;
                case -1670431775:
                case 180600053:
                    if (C2419.f7754 < 0) {
                        iM2761 = C0773.m3169("ۛۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14139) ^ 676445013;
                        i5 = 1848095012;
                    } else {
                        iM2761 = (C0619.m2761("ۧܺ") ^ i3) * 3;
                        i4 = ((iM2761 ^ i2) * 30497) ^ 1460241955;
                        i5 = -792578980;
                    }
                    break;
                case -1292496220:
                case 1752856563:
                    c4162 = (C4162) interfaceC16840;
                    if (this.f14134 == c4162.f14134) {
                        iM2761 = (C0773.m3169("᩹ᩳ") + i3) * (-25);
                        i4 = ((iM2761 ^ i2) * (-26789)) ^ 880191480;
                        i5 = 2136844832;
                    } else {
                        iM2761 = (C0619.m2761("ۚ۫") + i3) * 5;
                        i4 = ((iM2761 ^ i2) * 14607) ^ 1130785934;
                        i5 = -85592024;
                    }
                    break;
                case -563120578:
                case 1177938469:
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ۙ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13427)) ^ (-502570485);
                        i5 = 95573776;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۘۚ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i2) * (-32207)) ^ (-1060861318);
                        i5 = 587997713;
                    }
                    break;
                case -503180422:
                case 335670422:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("᩺᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1649)) ^ 1833956393;
                        i5 = -1958070467;
                    } else {
                        iM2761 = C0773.m3169("ۚۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-32199)) ^ 772829248;
                        i5 = -501787237;
                    }
                    break;
                case -489465741:
                case -298781584:
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = C0619.m2761("᩺᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1649)) ^ 1833956393;
                        i5 = -1958070467;
                    } else {
                        iM2761 = (C0619.m2761("ۧܺ") ^ i3) * 3;
                        i4 = ((iM2761 ^ i2) * 30497) ^ 1460241955;
                        i5 = -792578980;
                    }
                    break;
                case -124875290:
                case 1566438317:
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("ۛۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14139) ^ 676445013;
                        i5 = 1848095012;
                    } else {
                        iM2761 = C0619.m2761("ۢܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27731)) ^ (-1642437942);
                        i5 = -424165258;
                    }
                    break;
                case -105732547:
                case 638183250:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0619.m2761("᩺᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1649)) ^ 1833956393;
                        i5 = -1958070467;
                    } else {
                        iM2761 = C0619.m2761("ᩳۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-241)) ^ 315468699;
                        i5 = -1296441633;
                    }
                    break;
                case -37584347:
                case 1644171482:
                    if (C2354.m7983()) {
                        iM2761 = (C0619.m2761("᩸ۘ") ^ i3) * 95;
                        i4 = ((iM2761 ^ i2) * (-30979)) ^ (-2069139342);
                        i5 = -1772593299;
                    } else {
                        iM2761 = (C0619.m2761("ۛܳ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * (-12789)) ^ (-152233051);
                        i5 = 243770191;
                    }
                    break;
                case 37888440:
                case 820163566:
                    if (this.f14135.mo2247(c4162.f14135)) {
                        iM2761 = C0619.m2761("ۧܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 23621) ^ 653664247;
                        i5 = -1965360928;
                    } else {
                        iM2761 = (C0619.m2761("ۚ۫") + i3) * 5;
                        i4 = ((iM2761 ^ i2) * 14607) ^ 1130785934;
                        i5 = -85592024;
                    }
                    break;
                case 185698277:
                case 621833863:
                    iM47167 = this.f14133.m47167();
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("ۙ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13427)) ^ (-502570485);
                        i5 = 95573776;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۧ") + i3) * (-83);
                        i4 = ((iM2761 ^ i2) * (-8059)) ^ (-1079097789);
                        i5 = -551667706;
                    }
                    break;
                case 190768655:
                case 1697172314:
                    RunnableC1848.m6360();
                    iM2761 = (C0619.m2761("ۧܺ") ^ i3) * 3;
                    i4 = ((iM2761 ^ i2) * 30497) ^ 1460241955;
                    i5 = -792578980;
                    break;
                case 191245912:
                case 352691229:
                    if (interfaceC16840 instanceof C4162) {
                        iM2761 = C0619.m2761("ܰۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4479)) ^ (-1091615969);
                        i5 = 853633306;
                    } else {
                        iM2761 = (C0619.m2761("ۚ۫") + i3) * 5;
                        i4 = ((iM2761 ^ i2) * 14607) ^ 1130785934;
                        i5 = -85592024;
                    }
                    break;
                case 240921107:
                case 1125105462:
                    C3690.m11987();
                    return false;
                case 484440775:
                case 745261218:
                    if (C3690.m11987()) {
                        iM2761 = C0619.m2761("ۙ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13427)) ^ (-502570485);
                        i5 = 95573776;
                    } else {
                        iM2761 = (C0619.m2761("ܽۤ") ^ i2) * (-83);
                        i4 = ((iM2761 ^ i3) * 23411) ^ 1461952219;
                        i5 = 1045840275;
                    }
                    break;
                case 820729927:
                case 1314915692:
                    if (iM47167 == c4162.f14133.m47167()) {
                        iM2761 = C0773.m3169("᩵ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 24115) ^ 2104042080;
                        i5 = -2108259140;
                    } else {
                        iM2761 = (C0619.m2761("ۚ۫") + i3) * 5;
                        i4 = ((iM2761 ^ i2) * 14607) ^ 1130785934;
                        i5 = -85592024;
                    }
                    break;
                case 1493163622:
                case 1721795313:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0619.m2761("ۧܺ") ^ i3) * 3;
                        i4 = ((iM2761 ^ i2) * 30497) ^ 1460241955;
                        i5 = -792578980;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܺۖ")) * (-93);
                        i4 = ((iM2761 ^ i3) * (-22503)) ^ 786534060;
                        i5 = 2094619391;
                    }
                    break;
                default:
                    return true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x020e  */
    /* JADX WARN: Code duplicated, block: B:69:0x025a A[PHI: r0 r4
      0x025a: PHI (r0v8 int) = (r0v2 int), (r0v2 int), (r0v2 int), (r0v6 int), (r0v2 int) binds: [B:68:0x0258, B:64:0x023c, B:44:0x017a, B:23:0x008e, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r4v5 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v3 int), (r4v1 int) binds: [B:68:0x0258, B:64:0x023c, B:44:0x017a, B:23:0x008e, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (l.AbstractC3624.f12429 > 0) goto L13;
     */
    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo11170(final int r17, int r18, final long[] r19) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4162.mo11170(int, int, long[]):void");
    }

    public C4162(C20570 c20570, AbstractC0433 abstractC0433, int i, int i2) {
        int i3 = -142730521;
        int i4 = C2288.f7433;
        int i5 = AbstractC0116.f1064;
        short s = f14131[0];
        int i6 = s + 15931;
        int i7 = (s * s) + 253796761;
        int i8 = (i6 * i6) - (i7 + i7) <= 0 ? 18281 : 57745;
        int iM3169 = C0773.m3169("ۡ᩸") ^ i4;
        int i9 = ((iM3169 ^ i5) * (-13577)) ^ (-1853744432);
        int i10 = -127961771;
        while (true) {
            i3 = ((((i3 ^ i5) * (-29431)) >> 31) & i9) ^ (iM3169 ^ i10);
            switch (i3) {
                case -1710375489:
                case -1412893035:
                    if (abstractC0433.mo2248() != 0) {
                        iM3169 = C0773.m3169("ۚۙ") ^ i5;
                        i9 = ((iM3169 ^ i4) * (-14195)) ^ (-866908152);
                        i10 = 1972674801;
                    } else {
                        iM3169 = (C0619.m2761("᩹᩺") ^ i4) * 99;
                        i9 = ((iM3169 ^ i5) * 29419) ^ (-106970366);
                        i10 = 458372095;
                    }
                    break;
                case -1126001879:
                case 1247943732:
                    this.f14134 = i;
                    this.f14132 = i2;
                    return;
                case -775471455:
                case -313617650:
                    C0619.m2763();
                    iM3169 = C0619.m2761("᩷ۨ") ^ i5;
                    i9 = ((iM3169 ^ i4) * (-11501)) ^ (-1074059165);
                    i10 = 771046810;
                    break;
                case -756900718:
                case 808709667:
                    C2310.m7813();
                    if (C2288.f7433 <= 0) {
                        iM3169 = (i5 - C0773.m3169("᩺ۚ")) * 13;
                        i9 = ((iM3169 ^ i4) * (-23103)) ^ 1833999347;
                        i10 = -645388480;
                    } else {
                        iM3169 = C0619.m2761("᩷ۨ") ^ i5;
                        i9 = ((iM3169 ^ i4) * (-11501)) ^ (-1074059165);
                        i10 = 771046810;
                    }
                    break;
                case -320799700:
                case 1247990318:
                    if (C3690.m11987()) {
                        iM3169 = (C0619.m2761("ܳۡ") ^ i4) * (-11);
                        i9 = ((iM3169 ^ i5) * (-22809)) ^ 464938179;
                        i10 = -1521382999;
                    } else {
                        iM3169 = C0619.m2761("᩷ۨ") ^ i5;
                        i9 = ((iM3169 ^ i4) * (-11501)) ^ (-1074059165);
                        i10 = 771046810;
                    }
                    break;
                case 101633458:
                case 142395066:
                    this.f14133 = c20570;
                    this.f14135 = abstractC0433;
                    if (C3448.f11240 >= 0) {
                        iM3169 = (i5 - C0773.m3169("᩺ۚ")) * 13;
                        i9 = ((iM3169 ^ i4) * (-23103)) ^ 1833999347;
                        i10 = -645388480;
                    } else {
                        iM3169 = (i5 - C0619.m2761("۬֫")) * (-39);
                        i9 = ((iM3169 ^ i4) * 23201) ^ (-589040459);
                        i10 = -477464868;
                    }
                    break;
                case 178977084:
                case 1904903794:
                    if (i < i2) {
                        iM3169 = (C0619.m2761("ۚۨ") + i4) * (-19);
                        i9 = ((iM3169 ^ i5) * (-25439)) ^ 1874188251;
                        i10 = -1146483723;
                    } else {
                        iM3169 = (C0619.m2761("᩹᩺") ^ i4) * 99;
                        i9 = ((iM3169 ^ i5) * 29419) ^ (-106970366);
                        i10 = 458372095;
                    }
                    break;
                case 458359556:
                case 703134583:
                    C2023.m6964();
                    C0862.m3503();
                    throw new RuntimeException();
                case 506024971:
                case 1632511761:
                    short[] sArr = f14131;
                    if (C1826.f6190 > 0) {
                        if (C3690.f12684 > 0) {
                            if (C1321.f4751 < 0) {
                                if (C1343.f4799 != 0 || RunnableC3646.f12471 || C3099.m10095()) {
                                    iM3169 = (i5 - C0773.m3169("᩺ۚ")) * 13;
                                    i9 = ((iM3169 ^ i4) * (-23103)) ^ 1833999347;
                                    i10 = -645388480;
                                    break;
                                } else if (C2878.m9491() > 0) {
                                    if (!RunnableC3646.f12471 && !RunnableC1848.f6235) {
                                        throw new IllegalArgumentException(C13473.m33137(sArr, 1, 27, i8));
                                    }
                                }
                            }
                            iM3169 = C0619.m2761("᩷ۨ") ^ i5;
                            i9 = ((iM3169 ^ i4) * (-11501)) ^ (-1074059165);
                            i10 = 771046810;
                        } else {
                            iM3169 = C0619.m2761("ۡܿ") ^ i4;
                            i9 = ((iM3169 ^ i5) * 28273) ^ (-286354560);
                            i10 = -1282030206;
                        }
                        break;
                    }
                    iM3169 = C0773.m3169("ۚۛ") ^ i4;
                    i9 = ((iM3169 ^ i5) * (-13639)) ^ 105127441;
                    i10 = 1382093375;
                    break;
                default:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("ۡܿ") ^ i4;
                        i9 = ((iM3169 ^ i5) * 28273) ^ (-286354560);
                        i10 = -1282030206;
                    } else {
                        iM3169 = C0619.m2761("᩷ۨ") ^ i5;
                        i9 = ((iM3169 ^ i4) * (-11501)) ^ (-1074059165);
                        i10 = 771046810;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x027f A[PHI: r20
      0x027f: PHI (r20v20 int) = (r20v17 int), (r20v21 int) binds: [B:66:0x027d, B:58:0x0238] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0319 A[PHI: r20
      0x0319: PHI (r20v34 int) = (r20v13 int), (r20v16 int), (r20v35 int) binds: [B:82:0x0317, B:70:0x02b3, B:18:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x034f A[PHI: r20
      0x034f: PHI (r20v18 int) = (r20v10 int), (r20v12 int), (r20v14 int), (r20v15 int), (r20v19 int) binds: [B:10:0x006c, B:86:0x034d, B:78:0x02f6, B:74:0x02d6, B:62:0x025b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ۙ */
    public final void mo11171(final int i, final byte[] bArr, int i2, final int i3) {
        int iM3169;
        int i4;
        int i5;
        int i6;
        int iM2761;
        int i7;
        int i8;
        int i9;
        int i10;
        int iM2762;
        int i11;
        int i12;
        int i13;
        C20570 c20570 = null;
        int i14 = 0;
        int i15 = -1493033897;
        int i16 = C2288.f7433;
        int i17 = RunnableC0334.f1808;
        int iM31610 = (C0773.m3169("۬ۛ") + i16) * (-97);
        int i18 = ((iM31610 ^ i17) * 29541) ^ (-243061346);
        int i19 = iM31610 ^ (-91408588);
        AbstractC0433 abstractC0433 = null;
        C7891 c7891 = null;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int iM47167 = 0;
        int i24 = 0;
        int i25 = 0;
        long jM13328 = 0;
        int iM7764 = 0;
        int iM53427 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i17) * 9519) >> 31));
            switch (i15) {
                case -2131246824:
                case -563390689:
                    i6 = i20;
                    if (C2375.m8065() <= 0) {
                        iM2761 = (i16 - C0773.m3169("ۢ۫")) * 89;
                        i7 = ((iM2761 ^ i17) * 15015) ^ (-1398179468);
                        i8 = -514170970;
                    } else {
                        iM2761 = C0773.m3169("᩶᩺") ^ i16;
                        i7 = ((iM2761 ^ i17) * 30819) ^ 1509165324;
                        i8 = 314028253;
                    }
                    i13 = i6;
                    i19 = iM2761 ^ i8;
                    i18 = i7;
                    i20 = i13;
                    break;
                case -2125831110:
                case -1429615174:
                    i9 = i20;
                    iM7764 = C2288.m7764(i, this.f14134);
                    iM53427 = C23916.m53427(i2, this.f14132);
                    if (iM7764 >= iM53427) {
                        int iM2763 = C0619.m2761("֫۬") ^ i17;
                        int i26 = ((iM2763 ^ i16) * (-55)) ^ (-1035417808);
                        i10 = iM2763 ^ 419679582;
                        i18 = i26;
                    } else {
                        int iM31611 = (i16 - C0773.m3169("ۗܺ")) * (-21);
                        i18 = ((iM31611 ^ i17) * 3275) ^ (-1786181994);
                        i10 = iM31611 ^ 253327247;
                    }
                    i13 = i9;
                    i19 = i10;
                    i20 = i13;
                    break;
                case -1489670996:
                case 1349341015:
                    i6 = i20;
                    if (C4238.f15451 >= 0) {
                        iM2761 = (i16 - C0773.m3169("ۢ۫")) * 89;
                        i7 = ((iM2761 ^ i17) * 15015) ^ (-1398179468);
                        i8 = -514170970;
                    } else {
                        iM2761 = (i17 - C0773.m3169("᩺ܽ")) * (-75);
                        i7 = ((iM2761 ^ i16) * (-32689)) ^ (-214879512);
                        i8 = -1052430556;
                    }
                    i13 = i6;
                    i19 = iM2761 ^ i8;
                    i18 = i7;
                    i20 = i13;
                    break;
                case -1407649443:
                case 1366250335:
                    int iM47168 = c20570.m47167();
                    final int i27 = iM7764;
                    final int i28 = iM53427;
                    abstractC0433.m2242(iM7764, iM53427, iM47168, new InterfaceC25046() { // from class: l.ۛ۫ܳ
                        @Override // l.InterfaceC25046
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo16641(int i29, int i30) {
                            C4162.m13325(this.f21595, i27, i28, bArr, i3, i, i30);
                        }
                    });
                    break;
                case -1331846437:
                case -1099598203:
                    jM13328 = m13328(iM7764, iM53427);
                    abstractC0433 = this.f14135;
                    if (jM13328 != -1) {
                        int iM2764 = C0619.m2761("᩻ۛ") ^ i17;
                        i18 = ((iM2764 ^ i16) * 19259) ^ (-53799137);
                        i20 = i20;
                        i19 = iM2764 ^ (-1073596426);
                    } else {
                        i9 = i20;
                        iM2762 = C0619.m2761("֨ۙ") ^ i16;
                        i11 = ((iM2762 ^ i17) * 16665) ^ 587195369;
                        i12 = -833984463;
                        i10 = iM2762 ^ i12;
                        i18 = i11;
                        i13 = i9;
                        i19 = i10;
                        i20 = i13;
                    }
                    break;
                case -1180216447:
                case 672225681:
                    i6 = i20;
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("᩺ۗ") ^ i16;
                        i7 = ((iM2761 ^ i17) * 2729) ^ 1466582949;
                        i8 = -1117342269;
                    } else {
                        iM2761 = (i16 - C0619.m2761("ۡܰ")) * (-35);
                        i7 = ((iM2761 ^ i17) * 301) ^ (-1141125250);
                        i8 = -561017311;
                    }
                    i13 = i6;
                    i19 = iM2761 ^ i8;
                    i18 = i7;
                    i20 = i13;
                    break;
                case -913146746:
                case 865499699:
                    if ((((i23 ^ iM47167) >> 31) | i14) > 0) {
                        i22 = i24;
                        iM3169 = (C0619.m2761("ۤ۫") + i16) * 75;
                        i4 = ((iM3169 ^ i17) * (-8327)) ^ 1955537810;
                        i5 = 902133255;
                    } else {
                        iM3169 = (C0619.m2761("ۤ᩻") + i16) * 41;
                        i4 = ((iM3169 ^ i17) * (-9787)) ^ 1189812667;
                        i5 = -126154808;
                    }
                    i19 = iM3169 ^ i5;
                    i18 = i4;
                    break;
                case -820427182:
                case -303166885:
                    if (C2419.f7754 < 0) {
                        iM3169 = (C0773.m3169("ۜ᩺") ^ i17) * (-45);
                        i4 = ((iM3169 ^ i16) * (-6907)) ^ 1584928012;
                        i5 = -654108943;
                        i19 = iM3169 ^ i5;
                        i18 = i4;
                    } else {
                        iM2761 = C0619.m2761("۟ܺ") ^ i17;
                        i6 = i20;
                        i7 = ((iM2761 ^ i16) * (-5051)) ^ 37614318;
                        i8 = 839056809;
                        i13 = i6;
                        i19 = iM2761 ^ i8;
                        i18 = i7;
                        i20 = i13;
                    }
                    break;
                case -734443765:
                case -722099445:
                    i6 = i20;
                    if (C1343.f4799 != 0) {
                        iM2761 = (i16 - C0773.m3169("ۢ۫")) * 89;
                        i7 = ((iM2761 ^ i17) * 15015) ^ (-1398179468);
                        i8 = -514170970;
                    } else {
                        iM2761 = (C0773.m3169("ۤۡ") ^ i17) * (-65);
                        i7 = ((iM2761 ^ i16) * 1223) ^ (-1063217835);
                        i8 = -471899313;
                    }
                    i13 = i6;
                    i19 = iM2761 ^ i8;
                    i18 = i7;
                    i20 = i13;
                    break;
                case -550000381:
                case -371572927:
                    C3779.m12264();
                    C3998.m12920();
                    iM2761 = C0619.m2761("۟ܺ") ^ i17;
                    i6 = i20;
                    i7 = ((iM2761 ^ i16) * (-5051)) ^ 37614318;
                    i8 = 839056809;
                    i13 = i6;
                    i19 = iM2761 ^ i8;
                    i18 = i7;
                    i20 = i13;
                    break;
                case -531777967:
                case -356811076:
                    i9 = i20;
                    c20570 = this.f14133;
                    i25 = 0;
                    i14 = 1;
                    if (c20570.m47167() == 1) {
                        iM2762 = (C0619.m2761("ۘ᩸") + i17) * (-89);
                        i11 = ((iM2762 ^ i16) * (-31057)) ^ (-1505798556);
                        i12 = 872527649;
                    } else {
                        iM2762 = (i16 - C0619.m2761("᩵ܰ")) * (-29);
                        i11 = ((iM2762 ^ i17) * 26527) ^ (-1354968119);
                        i12 = 1668953411;
                    }
                    i10 = iM2762 ^ i12;
                    i18 = i11;
                    i13 = i9;
                    i19 = i10;
                    i20 = i13;
                    break;
                case -500133041:
                case -158271548:
                    i6 = i20;
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("ܽ۠") ^ i17;
                        i7 = ((iM2761 ^ i16) * 31827) ^ 1194801114;
                        i8 = 453735772;
                    } else {
                        iM2761 = (i17 - C0619.m2761("ܿᩳ")) * (-101);
                        i7 = ((iM2761 ^ i16) * (-25783)) ^ 169664772;
                        i8 = 1256841987;
                    }
                    i13 = i6;
                    i19 = iM2761 ^ i8;
                    i18 = i7;
                    i20 = i13;
                    break;
                case -420977358:
                case -73968181:
                    C10127.m26104(i22, c20570.f65889, (i3 + i20) - i, bArr, i21 - i20);
                    break;
                case -249166326:
                case 1894177092:
                    i6 = i20;
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0619.m2761("᩺ۗ") ^ i16;
                        i7 = ((iM2761 ^ i17) * 2729) ^ 1466582949;
                        i8 = -1117342269;
                    } else {
                        iM2761 = (i17 - C0619.m2761("֫ܽ")) * 23;
                        i7 = ((iM2761 ^ i16) * (-30771)) ^ (-500774648);
                        i8 = -784702667;
                    }
                    i13 = i6;
                    i19 = iM2761 ^ i8;
                    i18 = i7;
                    i20 = i13;
                    break;
                case -183935477:
                case 750552368:
                    break;
                case -172035335:
                case 1227475712:
                    i20 = (int) (jM13328 >>> 32);
                    i21 = (int) jM13328;
                    c7891 = (C7891) abstractC0433;
                    if (C1519.f5300 < 0) {
                        iM3169 = (C0773.m3169("֨֨") ^ i16) * (-57);
                        i4 = ((iM3169 ^ i17) * (-12177)) ^ (-709341646);
                        i5 = 1913693248;
                        i19 = iM3169 ^ i5;
                        i18 = i4;
                    } else {
                        iM2761 = C0619.m2761("۟ܺ") ^ i17;
                        i6 = i20;
                        i7 = ((iM2761 ^ i16) * (-5051)) ^ 37614318;
                        i8 = 839056809;
                        i13 = i6;
                        i19 = iM2761 ^ i8;
                        i18 = i7;
                        i20 = i13;
                    }
                    break;
                case 47338152:
                case 85268462:
                    i6 = i20;
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("ܽ۠") ^ i17;
                        i7 = ((iM2761 ^ i16) * 31827) ^ 1194801114;
                        i8 = 453735772;
                    } else {
                        iM2761 = (i17 - C0619.m2761("ܶۧ")) * (-25);
                        i7 = ((iM2761 ^ i16) * 11159) ^ 1614189606;
                        i8 = -204922297;
                    }
                    i13 = i6;
                    i19 = iM2761 ^ i8;
                    i18 = i7;
                    i20 = i13;
                    break;
                case 98288329:
                case 783576272:
                    C1080.m4050();
                    if (!C1519.m5403()) {
                        i6 = i20;
                        iM2761 = (i16 - C0773.m3169("ۢ۫")) * 89;
                        i7 = ((iM2761 ^ i17) * 15015) ^ (-1398179468);
                        i8 = -514170970;
                        i13 = i6;
                        i19 = iM2761 ^ i8;
                        i18 = i7;
                        i20 = i13;
                    } else {
                        iM3169 = (C0773.m3169("ۜ᩺") ^ i17) * (-45);
                        i4 = ((iM3169 ^ i16) * (-6907)) ^ 1584928012;
                        i5 = -654108943;
                        i19 = iM3169 ^ i5;
                        i18 = i4;
                    }
                    break;
                case 129883997:
                case 737247038:
                    C3779.m12264();
                    C3492.m11488();
                    break;
                case 140333290:
                case 866106517:
                    i6 = i20;
                    if (C23916.m53419() != 0) {
                        iM2761 = (i16 - C0773.m3169("ۢ۫")) * 89;
                        i7 = ((iM2761 ^ i17) * 15015) ^ (-1398179468);
                        i8 = -514170970;
                    } else {
                        iM2761 = (C0773.m3169("ܳ۫") ^ i16) * (-125);
                        i7 = ((iM2761 ^ i17) * 25953) ^ (-799421685);
                        i8 = 531051008;
                    }
                    i13 = i6;
                    i19 = iM2761 ^ i8;
                    i18 = i7;
                    i20 = i13;
                    break;
                case 284734873:
                case 1141250432:
                    i6 = i20;
                    if (C2485.m8357() <= 0) {
                        i20 = i6;
                        iM2761 = C0619.m2761("۟ܺ") ^ i17;
                        i6 = i20;
                        i7 = ((iM2761 ^ i16) * (-5051)) ^ 37614318;
                        i8 = 839056809;
                    } else {
                        iM2761 = (i16 - C0619.m2761("ۤᩴ")) * 109;
                        i7 = ((iM2761 ^ i17) * (-4011)) ^ (-1261330690);
                        i8 = 140585154;
                    }
                    i13 = i6;
                    i19 = iM2761 ^ i8;
                    i18 = i7;
                    i20 = i13;
                    break;
                case 723532768:
                case 1194706524:
                    i22 = i24 + iM47167;
                    iM3169 = (C0619.m2761("ۤ۫") + i16) * 75;
                    i4 = ((iM3169 ^ i17) * (-8327)) ^ 1955537810;
                    i5 = 902133255;
                    i19 = iM3169 ^ i5;
                    i18 = i4;
                    break;
                case 950235397:
                case 1770900747:
                    i23 = i20 - c7891.f26236;
                    iM47167 = c20570.m47167();
                    i24 = i23 % iM47167;
                    if (i24 == 0) {
                        i22 = i25;
                        iM3169 = (C0619.m2761("ۤ۫") + i16) * 75;
                        i4 = ((iM3169 ^ i17) * (-8327)) ^ 1955537810;
                        i5 = 902133255;
                    } else {
                        iM3169 = C0773.m3169("֡ܿ") ^ i17;
                        i4 = ((iM3169 ^ i16) * 24953) ^ 2133903993;
                        i5 = 103362882;
                    }
                    i19 = iM3169 ^ i5;
                    i18 = i4;
                    break;
                case 1391947304:
                case 1416284338:
                    if (C2354.f7599 >= 0) {
                        i6 = i20;
                        iM2761 = C0619.m2761("᩺ۗ") ^ i16;
                        i7 = ((iM2761 ^ i17) * 2729) ^ 1466582949;
                        i8 = -1117342269;
                        i13 = i6;
                        i19 = iM2761 ^ i8;
                        i18 = i7;
                        i20 = i13;
                    }
                    iM2761 = C0619.m2761("۟ܺ") ^ i17;
                    i6 = i20;
                    i7 = ((iM2761 ^ i16) * (-5051)) ^ 37614318;
                    i8 = 839056809;
                    i13 = i6;
                    i19 = iM2761 ^ i8;
                    i18 = i7;
                    i20 = i13;
                    break;
                default:
                    this.f14135.mo2245(bArr, iM7764, iM53427, c20570.f65889[i25], (i3 + iM7764) - i);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01c6 A[PHI: r17
      0x01c6: PHI (r17v23 int) = (r17v12 int), (r17v15 int), (r17v24 int) binds: [B:48:0x01c4, B:36:0x0141, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0261 A[PHI: r8 r9 r10 r17
      0x0261: PHI (r8v7 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v8 int) binds: [B:61:0x025f, B:44:0x019f, B:32:0x011c, B:13:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r9v4 byte[]) = (r9v2 byte[]), (r9v2 byte[]), (r9v2 byte[]), (r9v5 byte[]) binds: [B:61:0x025f, B:44:0x019f, B:32:0x011c, B:13:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v5 int) binds: [B:61:0x025f, B:44:0x019f, B:32:0x011c, B:13:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r17v20 int) = (r17v6 int), (r17v13 int), (r17v16 int), (r17v21 int) binds: [B:61:0x025f, B:44:0x019f, B:32:0x011c, B:13:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        if (l.C1826.f6190 > 0) goto L16;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m13326(l.C4162 r21, int r22, int r23, byte[] r24, int r25, long[] r26, int r27) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4162.m13326(l.ۘ۫ܳ, int, int, byte[], int, long[], int):void");
    }

    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11174(int i, int i2) {
        int iM2761;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM2762;
        int i7;
        C4162 c4162 = this;
        int i8 = C2419.f7754;
        int i9 = C4282.f15546;
        int iM2763 = C0619.m2761("۟᩷") ^ i8;
        int i10 = ((iM2763 ^ i9) * 28921) ^ (-1780500093);
        long j = 0;
        int i11 = iM2763 ^ 2092161650;
        int iM8883 = 0;
        int iM7976 = 0;
        int i12 = 0;
        int i13 = -2021132122;
        int i14 = 0;
        long j2 = 0;
        long j3 = 0;
        AbstractC0433 abstractC0433 = null;
        int iM47167 = 0;
        while (true) {
            i13 = i11 ^ (i10 & (((i13 ^ i9) * (-30319)) >> 31));
            switch (i13) {
                case -1965315351:
                case 1730569951:
                    j = 1 + (j3 - j2);
                    if (!RunnableC3646.f12471) {
                        iM2761 = (i9 - C0773.m3169("ܺܳ")) * (-75);
                        i3 = ((iM2761 ^ i8) * 8125) ^ (-953290163);
                        i4 = -1631359321;
                        i11 = iM2761 ^ i4;
                        i10 = i3;
                    } else {
                        i5 = i14;
                        iM2762 = C0773.m3169("᩸᩶") ^ i8;
                        i10 = ((iM2762 ^ i9) * (-30581)) ^ 568905621;
                        i7 = 1948211731;
                        i14 = i5;
                        i11 = iM2762 ^ i7;
                        c4162 = this;
                    }
                    break;
                case -1848732175:
                case 48903865:
                    i5 = i14;
                    if (C3690.f12684 <= 0) {
                        iM2762 = (C0619.m2761("᩵ۢ") ^ i8) * (-107);
                        i10 = ((iM2762 ^ i9) * 8657) ^ (-1922004363);
                        i7 = -958034943;
                    } else {
                        iM2762 = C0773.m3169("ۖ᩸") ^ i9;
                        i10 = ((iM2762 ^ i8) * 12441) ^ 2087889145;
                        i7 = 1801433103;
                    }
                    i14 = i5;
                    i11 = iM2762 ^ i7;
                    c4162 = this;
                    break;
                case -1648776716:
                case 99211933:
                    int i15 = c4162.f14134;
                    if (C2023.f6737) {
                        i14 = i15;
                        int iM2764 = C0619.m2761("ۖ᩻") ^ i9;
                        i10 = ((iM2764 ^ i8) * 13719) ^ (-1791093748);
                        i11 = iM2764 ^ 648451320;
                    } else {
                        int iM3169 = (i8 - C0773.m3169("ܺۙ")) * (-57);
                        i11 = iM3169 ^ (-1706488448);
                        i14 = i15;
                        i10 = ((iM3169 ^ i9) * 31955) ^ 553691333;
                    }
                    c4162 = this;
                    break;
                case -1607955354:
                case 1953958054:
                    return false;
                case -1316415405:
                case 1068505935:
                    i5 = i14;
                    if (C1564.f5401 <= 0) {
                        iM2762 = C0773.m3169("᩸᩶") ^ i8;
                        i10 = ((iM2762 ^ i9) * (-30581)) ^ 568905621;
                        i7 = 1948211731;
                    } else {
                        iM2762 = C0773.m3169("᩻ۧ") ^ i9;
                        i10 = ((iM2762 ^ i8) * (-14513)) ^ (-187020587);
                        i7 = -1251077848;
                    }
                    i14 = i5;
                    i11 = iM2762 ^ i7;
                    c4162 = this;
                    break;
                case -1243936695:
                case 164153427:
                    i12 = (int) j;
                    iM2761 = C0773.m3169("ᩴ۠") ^ i8;
                    i3 = ((iM2761 ^ i9) * 17189) ^ (-2102636329);
                    i4 = 1607118756;
                    i11 = iM2761 ^ i4;
                    i10 = i3;
                    break;
                case -932221728:
                case -370018093:
                    i12 = Integer.MIN_VALUE;
                    iM2761 = C0773.m3169("ᩴ۠") ^ i8;
                    i3 = ((iM2761 ^ i9) * 17189) ^ (-2102636329);
                    i4 = 1607118756;
                    i11 = iM2761 ^ i4;
                    i10 = i3;
                    break;
                case -680643093:
                case 1355692769:
                    C2485.m8357();
                    i5 = i14;
                    iM2762 = C0773.m3169("᩸᩶") ^ i8;
                    i10 = ((iM2762 ^ i9) * (-30581)) ^ 568905621;
                    i7 = 1948211731;
                    i14 = i5;
                    i11 = iM2762 ^ i7;
                    c4162 = this;
                    break;
                case -675392318:
                case 118815114:
                    if (abstractC0433.mo2240(i12, iM7976) == 0) {
                        i6 = i14;
                        int iM2765 = C0619.m2761("ۖ֨") ^ i9;
                        int i16 = i6;
                        i3 = ((iM2765 ^ i8) * 3041) ^ (-565451347);
                        i14 = i16;
                        i11 = iM2765 ^ 1356099105;
                        i10 = i3;
                    } else {
                        iM2761 = (C0773.m3169("ܽ۟") ^ i9) * 53;
                        i3 = ((iM2761 ^ i8) * (-15887)) ^ (-1413015719);
                        i4 = -2063275806;
                        i11 = iM2761 ^ i4;
                        i10 = i3;
                    }
                    break;
                case -628511701:
                case 835496712:
                    if (j <= -2147483648L) {
                        iM2761 = C0619.m2761("᩺ᩳ") ^ i8;
                        i3 = ((iM2761 ^ i9) * (-4209)) ^ 1618354569;
                        i4 = 1075569235;
                    } else {
                        iM2761 = (C0619.m2761("ۜ᩸") + i9) * (-105);
                        i3 = ((iM2761 ^ i8) * (-14247)) ^ (-2072086017);
                        i4 = -239319628;
                    }
                    i11 = iM2761 ^ i4;
                    i10 = i3;
                    break;
                case -452170450:
                case -410606508:
                    RunnableC1848.m6360();
                    if (C2310.m7813() <= 0) {
                        int iM2766 = C0619.m2761("ۖ᩻") ^ i9;
                        i10 = ((iM2766 ^ i8) * 13719) ^ (-1791093748);
                        i11 = iM2766 ^ 648451320;
                        c4162 = this;
                    } else {
                        iM2761 = (C0773.m3169("᩶ۡ") + i9) * 61;
                        i3 = ((iM2761 ^ i8) * (-25129)) ^ 1389700268;
                        i4 = 1822921899;
                        i11 = iM2761 ^ i4;
                        i10 = i3;
                    }
                    break;
                case -202629762:
                case 1211573391:
                    i5 = i14;
                    if (C2354.f7599 >= 0) {
                        iM2762 = C0619.m2761("ܺ᩵") ^ i8;
                        i10 = ((iM2762 ^ i9) * (-17197)) ^ (-44679530);
                        i7 = 1836799711;
                    } else {
                        iM2762 = (C0773.m3169("ܳ۟") ^ i9) * (-125);
                        i10 = ((iM2762 ^ i8) * 683) ^ 993800450;
                        i7 = -2122000577;
                    }
                    i14 = i5;
                    i11 = iM2762 ^ i7;
                    c4162 = this;
                    break;
                case -188418944:
                case 2072884396:
                    i5 = i14;
                    if (C13473.f42873 == 0) {
                        iM2762 = (i8 - C0619.m2761("᩺᩶")) * (-7);
                        i10 = ((iM2762 ^ i9) * (-22139)) ^ 1748324203;
                        i7 = 2069939345;
                        i14 = i5;
                        i11 = iM2762 ^ i7;
                        c4162 = this;
                    }
                    i14 = i5;
                    int iM2767 = C0619.m2761("ۖ᩻") ^ i9;
                    i10 = ((iM2767 ^ i8) * 13719) ^ (-1791093748);
                    i11 = iM2767 ^ 648451320;
                    c4162 = this;
                    break;
                case -172869832:
                case 15452308:
                    j3 = iM8883;
                    j2 = iM47167;
                    if (C2485.f7950 == 0) {
                        iM2761 = (C0619.m2761("ۢ۫") ^ i8) * 101;
                        i3 = ((iM2761 ^ i9) * 26865) ^ 523800940;
                        i4 = -1311188176;
                        i11 = iM2761 ^ i4;
                        i10 = i3;
                    } else {
                        i5 = i14;
                        iM2762 = (C0619.m2761("᩵ۢ") ^ i8) * (-107);
                        i10 = ((iM2762 ^ i9) * 8657) ^ (-1922004363);
                        i7 = -958034943;
                        i14 = i5;
                        i11 = iM2762 ^ i7;
                        c4162 = this;
                    }
                    break;
                case -60041881:
                case 665507417:
                    C1080.m4050();
                    return false;
                case 33932680:
                case 1683920114:
                    if (!RunnableC1848.f6235) {
                        iM2761 = (C0773.m3169("᩶ۡ") + i9) * 61;
                        i3 = ((iM2761 ^ i8) * (-25129)) ^ 1389700268;
                        i4 = 1822921899;
                        i11 = iM2761 ^ i4;
                        i10 = i3;
                    } else {
                        i5 = i14;
                        iM2762 = C0773.m3169("᩸᩶") ^ i8;
                        i10 = ((iM2762 ^ i9) * (-30581)) ^ 568905621;
                        i7 = 1948211731;
                        i14 = i5;
                        i11 = iM2762 ^ i7;
                        c4162 = this;
                    }
                    break;
                case 84816206:
                case 572028558:
                    C17202.m40369(abstractC0433);
                    if (C2878.f9462) {
                        iM2761 = (C0773.m3169("᩶ۡ") + i9) * 61;
                        i3 = ((iM2761 ^ i8) * (-25129)) ^ 1389700268;
                        i4 = 1822921899;
                    } else {
                        iM2761 = (C0619.m2761("ܿ᩶") ^ i9) * (-9);
                        i3 = ((iM2761 ^ i8) * 25339) ^ (-1615849568);
                        i4 = -1230417030;
                    }
                    i11 = iM2761 ^ i4;
                    i10 = i3;
                    break;
                case 130040429:
                case 1306285760:
                    i6 = i14;
                    iM8883 = C2702.m8883(i, i6);
                    iM7976 = C2354.m7976(i2, c4162.f14132);
                    if (iM8883 < iM7976) {
                        int iM2768 = C0619.m2761("ۧۜ") ^ i8;
                        i10 = ((iM2768 ^ i9) * 26781) ^ 1616175057;
                        i11 = iM2768 ^ (-506681932);
                        i14 = i6;
                    } else {
                        int iM2769 = C0619.m2761("ۖ֨") ^ i9;
                        int i17 = i6;
                        i3 = ((iM2769 ^ i8) * 3041) ^ (-565451347);
                        i14 = i17;
                        i11 = iM2769 ^ 1356099105;
                        i10 = i3;
                    }
                    break;
                case 222742145:
                case 838780306:
                    C2485.m8357();
                    if (C3448.f11240 >= 0) {
                        i5 = i14;
                        iM2762 = C0619.m2761("ܺ᩵") ^ i8;
                        i10 = ((iM2762 ^ i9) * (-17197)) ^ (-44679530);
                        i7 = 1836799711;
                        i14 = i5;
                        i11 = iM2762 ^ i7;
                        c4162 = this;
                    }
                    i5 = i14;
                    iM2762 = C0773.m3169("᩸᩶") ^ i8;
                    i10 = ((iM2762 ^ i9) * (-30581)) ^ 568905621;
                    i7 = 1948211731;
                    i14 = i5;
                    i11 = iM2762 ^ i7;
                    c4162 = this;
                    break;
                case 282436321:
                case 1449136449:
                    return true;
                case 364142260:
                case 1341972856:
                    i5 = i14;
                    if (C4238.f15451 < 0) {
                        iM2762 = C0619.m2761("ۜ᩺") ^ i8;
                        i10 = ((iM2762 ^ i9) * (-6943)) ^ 489881488;
                        i7 = -1069544933;
                        i14 = i5;
                        i11 = iM2762 ^ i7;
                        c4162 = this;
                    }
                    i14 = i5;
                    int iM27610 = C0619.m2761("ۖ᩻") ^ i9;
                    i10 = ((iM27610 ^ i8) * 13719) ^ (-1791093748);
                    i11 = iM27610 ^ 648451320;
                    c4162 = this;
                    break;
                default:
                    iM47167 = c4162.f14133.m47167();
                    abstractC0433 = c4162.f14135;
                    if (C4238.f15451 < 0) {
                        iM2761 = C0619.m2761("ܶ۠") ^ i8;
                        i3 = ((iM2761 ^ i9) * (-32519)) ^ (-380108403);
                        i4 = -1921444178;
                        i11 = iM2761 ^ i4;
                        i10 = i3;
                    } else {
                        int iM27611 = C0619.m2761("ۖ᩻") ^ i9;
                        i10 = ((iM27611 ^ i8) * 13719) ^ (-1791093748);
                        i11 = iM27611 ^ 648451320;
                        c4162 = this;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ۙ */
    public final long mo11169() {
        return this.f14135.mo2241();
    }

    /* JADX WARN: Code duplicated, block: B:96:0x041e A[PHI: r19 r21 r25
      0x041e: PHI (r19v16 int) = (r19v6 int), (r19v7 int), (r19v13 int), (r19v19 int) binds: [B:93:0x0404, B:89:0x03dd, B:15:0x008c, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x041e: PHI (r21v14 int) = (r21v5 int), (r21v6 int), (r21v11 int), (r21v16 int) binds: [B:93:0x0404, B:89:0x03dd, B:15:0x008c, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x041e: PHI (r25v23 short) = (r25v10 short), (r25v11 short), (r25v20 short), (r25v26 short) binds: [B:93:0x0404, B:89:0x03dd, B:15:0x008c, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13329(DataOutputStream dataOutputStream, int i, int i2, int i3) throws IOException {
        int i4;
        int i5;
        short s;
        int i6;
        int iM3169;
        int i7;
        int i8;
        int i9;
        int iM2761;
        int i10;
        int i11;
        int i12;
        int i13;
        int iM31610;
        int i14;
        int iM2762;
        int i15;
        DataOutputStream dataOutputStream2 = dataOutputStream;
        short[] sArr = null;
        char c = 0;
        int i16 = 0;
        int i17 = 1725960439;
        int i18 = C11235.f35427;
        int i19 = C1080.f3865;
        int iM2763 = (i18 - C0619.m2761("ۛۢ")) * (-69);
        int i20 = ((iM2763 ^ i19) * (-31605)) ^ (-435417642);
        int i21 = iM2763 ^ (-834487241);
        long j = 0;
        long j2 = 0;
        AbstractC0433 abstractC0433M2237 = null;
        int iMo2240 = 0;
        int iM7764 = 0;
        int i22 = 0;
        int iM47167 = 0;
        short s2 = 0;
        C20570 c20570 = null;
        AbstractC0433 abstractC0433 = null;
        long j3 = 0;
        int iM7976 = 0;
        int i23 = 0;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i19) * 21285) >> 31));
            switch (i17) {
                case -2125702068:
                case -1912329233:
                    i9 = iM47167;
                    iMo2240 = iMo2240;
                    s2 = sArr[c];
                    i16 = (s2 * s2) + 1996569;
                    if (C2966.f9654 >= 0) {
                        i12 = i9;
                        iM2761 = C0773.m3169("ܺܰ") ^ i19;
                        i9 = i12;
                        i10 = ((iM2761 ^ i18) * 3509) ^ (-1210623129);
                        i11 = -995754888;
                    } else {
                        iM2761 = (i19 - C0619.m2761("᩻ۤ")) * 115;
                        i10 = ((iM2761 ^ i18) * (-9469)) ^ (-327090531);
                        i11 = 1567525256;
                    }
                    i21 = iM2761 ^ i11;
                    i20 = i10;
                    iMo2240 = iMo2240;
                    iM47167 = i9;
                    dataOutputStream2 = dataOutputStream;
                    break;
                case -2120779805:
                case -1493044952:
                    i5 = iM47167;
                    s = s2;
                    i6 = iMo2240;
                    if (C3734.f12817 >= 0) {
                        iM3169 = (i18 - C0773.m3169("֫ۜ")) * 49;
                        i7 = ((iM3169 ^ i19) * 30063) ^ 1359218019;
                        i8 = 888535395;
                    } else {
                        iM3169 = C0773.m3169("᩻ܳ") ^ i18;
                        i7 = ((iM3169 ^ i19) * (-309)) ^ 262875636;
                        i8 = 637085878;
                    }
                    int i24 = iM3169 ^ i8;
                    i20 = i7;
                    s2 = s;
                    dataOutputStream2 = dataOutputStream;
                    i21 = i24;
                    iMo2240 = i6;
                    iM47167 = i5;
                    break;
                case -2043599256:
                case -265520400:
                    j2 = j + j3;
                    if (j2 <= -2147483648L) {
                        iM31610 = (C0619.m2761("᩸ᩴ") ^ i18) * (-45);
                        i4 = ((iM31610 ^ i19) * 14605) ^ (-696298212);
                        i14 = -350739000;
                    } else {
                        iM31610 = (C0773.m3169("ۖ᩶") + i19) * (-105);
                        i4 = ((iM31610 ^ i18) * (-2529)) ^ 2047527725;
                        i14 = -565607410;
                    }
                    i21 = iM31610 ^ i14;
                    dataOutputStream2 = dataOutputStream;
                    i20 = i4;
                    break;
                case -1901728270:
                case -1687502539:
                    i5 = iM47167;
                    s = s2;
                    i6 = iMo2240;
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0619.m2761("۫۟") ^ i19;
                        i7 = ((iM3169 ^ i18) * 8989) ^ 1316707029;
                        i8 = -381855585;
                    } else {
                        iM3169 = C0773.m3169("᩹᩻") ^ i19;
                        i7 = ((iM3169 ^ i18) * 21933) ^ 1076380816;
                        i8 = 2140295967;
                    }
                    int i25 = iM3169 ^ i8;
                    i20 = i7;
                    s2 = s;
                    dataOutputStream2 = dataOutputStream;
                    i21 = i25;
                    iMo2240 = i6;
                    iM47167 = i5;
                    break;
                case -1899807674:
                case 702355504:
                    if (C1826.f6190 <= 0) {
                        int iM2764 = C0619.m2761("ܳ۬") ^ i19;
                        i4 = ((iM2764 ^ i18) * (-939)) ^ 113534009;
                        i21 = iM2764 ^ 1028529593;
                        i20 = i4;
                    } else {
                        i5 = iM47167;
                        s = s2;
                        i6 = iMo2240;
                        iM3169 = C0619.m2761("۫۟") ^ i19;
                        i7 = ((iM3169 ^ i18) * 8989) ^ 1316707029;
                        i8 = -381855585;
                        int i26 = iM3169 ^ i8;
                        i20 = i7;
                        s2 = s;
                        dataOutputStream2 = dataOutputStream;
                        i21 = i26;
                        iMo2240 = i6;
                        iM47167 = i5;
                    }
                    break;
                case -1750605727:
                case 650076098:
                    throw new IOException(C3998.m12925(f14131, 29, 34, i23));
                case -1684450308:
                case -985346896:
                    i22 = Integer.MIN_VALUE;
                    iM31610 = C0619.m2761("ܽ۬") ^ i18;
                    i4 = ((iM31610 ^ i19) * (-2203)) ^ (-2031010575);
                    i14 = 1133033753;
                    i21 = iM31610 ^ i14;
                    dataOutputStream2 = dataOutputStream;
                    i20 = i4;
                    break;
                case -1667025414:
                case -224486792:
                    C1321.m4853(dataOutputStream2, i3);
                    C1321.m4853(dataOutputStream2, iM7764 - i);
                    C3099.m10084(dataOutputStream2, iM7976 - iM7764);
                    abstractC0433M2237.mo2244(dataOutputStream2, i);
                    return;
                case -1565251604:
                case -1499216296:
                    final int[] iArr = new int[iMo2240];
                    final int[] iArr2 = {0};
                    if (C4282.f15546 > 0) {
                        abstractC0433.mo2243(i22, iM7976, new InterfaceC25046() { // from class: l.᩶۫ܳ
                            @Override // l.InterfaceC25046
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo16641(int i27, int i28) {
                                int[] iArr3 = iArr2;
                                int i29 = iArr3[0];
                                iArr3[0] = i29 + 1;
                                iArr[i29] = i28;
                            }
                        });
                        abstractC0433M2237 = AbstractC0433.m2237(iMo2240, iArr);
                        iM31610 = (i18 - C0619.m2761("᩹᩶")) * 31;
                        i4 = ((iM31610 ^ i19) * 27809) ^ 1728042332;
                        i14 = 849844636;
                        i21 = iM31610 ^ i14;
                        dataOutputStream2 = dataOutputStream;
                        i20 = i4;
                    } else {
                        i5 = iM47167;
                        s = s2;
                        i6 = iMo2240;
                        iM3169 = C0619.m2761("۫۟") ^ i19;
                        i7 = ((iM3169 ^ i18) * 8989) ^ 1316707029;
                        i8 = -381855585;
                        int i27 = iM3169 ^ i8;
                        i20 = i7;
                        s2 = s;
                        dataOutputStream2 = dataOutputStream;
                        i21 = i27;
                        iMo2240 = i6;
                        iM47167 = i5;
                    }
                    break;
                case -1527297323:
                case 1973505155:
                    i5 = iM47167;
                    s = s2;
                    i6 = iMo2240;
                    sArr = f14131;
                    c = 28;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0619.m2761("ۤۜ") + i18) * 17;
                        i7 = ((iM3169 ^ i19) * (-15419)) ^ (-2099205678);
                        i8 = -1683390569;
                    } else {
                        iM3169 = (C0619.m2761("֨۠") ^ i18) * (-127);
                        i7 = ((iM3169 ^ i19) * 5165) ^ (-1835648105);
                        i8 = -1596746976;
                    }
                    int i28 = iM3169 ^ i8;
                    i20 = i7;
                    s2 = s;
                    dataOutputStream2 = dataOutputStream;
                    i21 = i28;
                    iMo2240 = i6;
                    iM47167 = i5;
                    break;
                case -1239553864:
                case -433541816:
                    C3779.m12264();
                    if (C2288.f7433 > 0) {
                        i5 = iM47167;
                        s = s2;
                        i6 = iMo2240;
                        iM3169 = (C0619.m2761("ۤۜ") + i18) * 17;
                        i7 = ((iM3169 ^ i19) * (-15419)) ^ (-2099205678);
                        i8 = -1683390569;
                        int i29 = iM3169 ^ i8;
                        i20 = i7;
                        s2 = s;
                        dataOutputStream2 = dataOutputStream;
                        i21 = i29;
                        iMo2240 = i6;
                        iM47167 = i5;
                    }
                    i5 = iM47167;
                    s = s2;
                    i6 = iMo2240;
                    iM3169 = C0619.m2761("۫۟") ^ i19;
                    i7 = ((iM3169 ^ i18) * 8989) ^ 1316707029;
                    i8 = -381855585;
                    int i210 = iM3169 ^ i8;
                    i20 = i7;
                    s2 = s;
                    dataOutputStream2 = dataOutputStream;
                    i21 = i210;
                    iMo2240 = i6;
                    iM47167 = i5;
                    break;
                case -1132075384:
                case -94749899:
                    if (abstractC0433M2237.mo2248() != 0) {
                        iM2762 = (i18 - C0773.m3169("ܰۖ")) * (-121);
                        i13 = ((iM2762 ^ i19) * 31593) ^ (-298638664);
                        i15 = 1629278906;
                    } else {
                        iM2762 = C0619.m2761("ۡܺ") ^ i19;
                        i13 = ((iM2762 ^ i18) * 16787) ^ 1534660284;
                        i15 = 1287744240;
                    }
                    i21 = iM2762 ^ i15;
                    i20 = i13;
                    break;
                case -1115467852:
                case 1782190884:
                    int i30 = iM47167;
                    iM7764 = C2288.m7764(i, this.f14134);
                    iM7976 = C2354.m7976(i2, this.f14132);
                    i6 = iMo2240;
                    C20570 c20571 = this.f14133;
                    if (C1146.f4234 < 0) {
                        int iM31611 = C0773.m3169("᩹۠") ^ i18;
                        i21 = iM31611 ^ (-1745124099);
                        i20 = ((iM31611 ^ i19) * (-19571)) ^ (-2029217945);
                        iMo2240 = i6;
                        c20570 = c20571;
                        iM47167 = i30;
                        dataOutputStream2 = dataOutputStream;
                    } else {
                        c20570 = c20571;
                        i5 = i30;
                        s = s2;
                        iM3169 = (C0619.m2761("ۤۜ") + i18) * 17;
                        i7 = ((iM3169 ^ i19) * (-15419)) ^ (-2099205678);
                        i8 = -1683390569;
                        int i211 = iM3169 ^ i8;
                        i20 = i7;
                        s2 = s;
                        dataOutputStream2 = dataOutputStream;
                        i21 = i211;
                        iMo2240 = i6;
                        iM47167 = i5;
                    }
                    break;
                case -1037541315:
                case 1522365211:
                    C1519.m5403();
                    AbstractC0641.m2813();
                    i5 = iM47167;
                    s = s2;
                    i6 = iMo2240;
                    iM3169 = C0619.m2761("۫۟") ^ i19;
                    i7 = ((iM3169 ^ i18) * 8989) ^ 1316707029;
                    i8 = -381855585;
                    int i212 = iM3169 ^ i8;
                    i20 = i7;
                    s2 = s;
                    dataOutputStream2 = dataOutputStream;
                    i21 = i212;
                    iMo2240 = i6;
                    iM47167 = i5;
                    break;
                case -978106983:
                case -490695933:
                    i5 = iM47167;
                    s = s2;
                    i6 = iMo2240;
                    if (C0619.f2439) {
                        iM3169 = C0619.m2761("۫۟") ^ i19;
                        i7 = ((iM3169 ^ i18) * 8989) ^ 1316707029;
                        i8 = -381855585;
                    } else {
                        iM3169 = (C0619.m2761("ۧۤ") + i18) * 109;
                        i7 = ((iM3169 ^ i19) * 4925) ^ (-1911797402);
                        i8 = 298264040;
                    }
                    int i213 = iM3169 ^ i8;
                    i20 = i7;
                    s2 = s;
                    dataOutputStream2 = dataOutputStream;
                    i21 = i213;
                    iMo2240 = i6;
                    iM47167 = i5;
                    break;
                case -967995896:
                case -711965950:
                    i23 = 26121;
                    iM2761 = (C0619.m2761("᩺֫") ^ i19) * (-15);
                    i9 = iM47167;
                    i10 = ((iM2761 ^ i18) * (-23191)) ^ (-1894810699);
                    i11 = 1328853037;
                    i21 = iM2761 ^ i11;
                    i20 = i10;
                    iMo2240 = iMo2240;
                    iM47167 = i9;
                    dataOutputStream2 = dataOutputStream;
                    break;
                case -789862555:
                case 1250084307:
                    i5 = iM47167;
                    i6 = iMo2240;
                    short s3 = s2;
                    if (i16 - (s3 * 2826) < 0) {
                        s = s3;
                        iM3169 = C0773.m3169("ۤ᩹") ^ i18;
                        i7 = ((iM3169 ^ i19) * 10403) ^ (-1794080879);
                        i8 = 1420774729;
                        int i214 = iM3169 ^ i8;
                        i20 = i7;
                        s2 = s;
                        dataOutputStream2 = dataOutputStream;
                        i21 = i214;
                        iMo2240 = i6;
                        iM47167 = i5;
                    } else {
                        int iM31612 = C0773.m3169("۟᩸") ^ i19;
                        i20 = ((iM31612 ^ i18) * 4823) ^ (-1543621059);
                        iMo2240 = i6;
                        iM47167 = i5;
                        s2 = s3;
                        i21 = iM31612 ^ 130598435;
                        dataOutputStream2 = dataOutputStream;
                    }
                    break;
                case -781554430:
                case 255217452:
                    iMo2240 = abstractC0433.mo2240(i22, iM7976);
                    if (iMo2240 == abstractC0433.mo2248()) {
                        abstractC0433M2237 = abstractC0433;
                        iM31610 = (i18 - C0619.m2761("᩹᩶")) * 31;
                        i4 = ((iM31610 ^ i19) * 27809) ^ 1728042332;
                        i14 = 849844636;
                    } else {
                        iM31610 = C0619.m2761("ܽۘ") ^ i19;
                        i4 = ((iM31610 ^ i18) * (-6905)) ^ (-2114499514);
                        i14 = 100531171;
                    }
                    i21 = iM31610 ^ i14;
                    dataOutputStream2 = dataOutputStream;
                    i20 = i4;
                    break;
                case -751896875:
                case 1412890676:
                    i12 = iM47167;
                    j = ((long) iM7764) - ((long) i12);
                    j3 = 1;
                    if (C3690.f12684 <= 0) {
                        iMo2240 = iMo2240;
                        iM2761 = C0773.m3169("ܺܰ") ^ i19;
                        i9 = i12;
                        i10 = ((iM2761 ^ i18) * 3509) ^ (-1210623129);
                        i11 = -995754888;
                        i21 = iM2761 ^ i11;
                        i20 = i10;
                        iMo2240 = iMo2240;
                        iM47167 = i9;
                    } else {
                        int iM31613 = C0773.m3169("ᩳ۟") ^ i19;
                        i21 = iM31613 ^ 726210260;
                        iM47167 = i12;
                        i20 = ((iM31613 ^ i18) * (-4401)) ^ (-1713563896);
                    }
                    dataOutputStream2 = dataOutputStream;
                    break;
                case -592543822:
                case 1866607868:
                    i23 = 8238;
                    iM2761 = (C0619.m2761("᩺֫") ^ i19) * (-15);
                    i9 = iM47167;
                    i10 = ((iM2761 ^ i18) * (-23191)) ^ (-1894810699);
                    i11 = 1328853037;
                    i21 = iM2761 ^ i11;
                    i20 = i10;
                    iMo2240 = iMo2240;
                    iM47167 = i9;
                    dataOutputStream2 = dataOutputStream;
                    break;
                case -588443274:
                case 284671247:
                    i22 = (int) j2;
                    iM31610 = C0619.m2761("ܽ۬") ^ i18;
                    i4 = ((iM31610 ^ i19) * (-2203)) ^ (-2031010575);
                    i14 = 1133033753;
                    i21 = iM31610 ^ i14;
                    dataOutputStream2 = dataOutputStream;
                    i20 = i4;
                    break;
                case -560248272:
                case 1471632071:
                    if (iMo2240 == 0) {
                        iM31610 = C0773.m3169("ܽۜ") ^ i18;
                        i4 = ((iM31610 ^ i19) * (-3095)) ^ (-1498085825);
                        i14 = 1994355294;
                    } else {
                        iM31610 = (i19 - C0773.m3169("۟᩹")) * 81;
                        i4 = ((iM31610 ^ i18) * 18701) ^ 1275073126;
                        i14 = -843677802;
                    }
                    i21 = iM31610 ^ i14;
                    dataOutputStream2 = dataOutputStream;
                    i20 = i4;
                    break;
                case -465721803:
                case 1819443761:
                    abstractC0433M2237 = C11619.f36453;
                    iM31610 = (i18 - C0619.m2761("᩹᩶")) * 31;
                    i4 = ((iM31610 ^ i19) * 27809) ^ 1728042332;
                    i14 = 849844636;
                    i21 = iM31610 ^ i14;
                    dataOutputStream2 = dataOutputStream;
                    i20 = i4;
                    break;
                case 85625902:
                case 1243692086:
                    iM47167 = c20570.m47167();
                    abstractC0433 = this.f14135;
                    C17202.m40369(abstractC0433);
                    if (C23916.f77426 > 0) {
                        int iM2765 = C0619.m2761("ܳۤ") ^ i18;
                        i13 = ((iM2765 ^ i19) * (-22165)) ^ 918210734;
                        i21 = iM2765 ^ 1103897488;
                        dataOutputStream2 = dataOutputStream;
                        i20 = i13;
                    } else {
                        i12 = iM47167;
                        iMo2240 = iMo2240;
                        iM2761 = C0773.m3169("ܺܰ") ^ i19;
                        i9 = i12;
                        i10 = ((iM2761 ^ i18) * 3509) ^ (-1210623129);
                        i11 = -995754888;
                        i21 = iM2761 ^ i11;
                        i20 = i10;
                        iMo2240 = iMo2240;
                        iM47167 = i9;
                        dataOutputStream2 = dataOutputStream;
                    }
                    break;
                case 91235262:
                case 844878627:
                    C1783.m6232();
                    return;
                case 491084627:
                case 532893094:
                    if (C2375.m8065() > 0) {
                        i5 = iM47167;
                        s = s2;
                        i6 = iMo2240;
                        iM3169 = (i18 - C0773.m3169("֫ۜ")) * 49;
                        i7 = ((iM3169 ^ i19) * 30063) ^ 1359218019;
                        i8 = 888535395;
                        int i215 = iM3169 ^ i8;
                        i20 = i7;
                        s2 = s;
                        dataOutputStream2 = dataOutputStream;
                        i21 = i215;
                        iMo2240 = i6;
                        iM47167 = i5;
                    } else {
                        int iM2766 = C0619.m2761("ܳ۬") ^ i19;
                        i4 = ((iM2766 ^ i18) * (-939)) ^ 113534009;
                        i21 = iM2766 ^ 1028529593;
                        i20 = i4;
                    }
                    break;
                default:
                    i5 = iM47167;
                    s = s2;
                    i6 = iMo2240;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("۫۟") ^ i19;
                        i7 = ((iM3169 ^ i18) * 8989) ^ 1316707029;
                        i8 = -381855585;
                    } else {
                        iM3169 = (C0773.m3169("᩷ۘ") ^ i19) * 95;
                        i7 = ((iM3169 ^ i18) * (-4349)) ^ (-1470061773);
                        i8 = -1357843410;
                    }
                    int i216 = iM3169 ^ i8;
                    i20 = i7;
                    s2 = s;
                    dataOutputStream2 = dataOutputStream;
                    i21 = i216;
                    iMo2240 = i6;
                    iM47167 = i5;
                    break;
            }
        }
    }
}
