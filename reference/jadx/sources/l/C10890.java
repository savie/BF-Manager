package l;

import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7HN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10890 {

    /* JADX INFO: renamed from: ᩹᩸֫, reason: not valid java name and contains not printable characters */
    private static final short[] f34468 = {5782, -18044, -18001, -17998, -18007, -18004, -17945, -17997, -17995, -18010, -18007, -17996, -18005, -18010, -17997, -18002, -18008, -18007, -17945, -17995, -18014, -17997, -17998, -17995, -18007, -18014, -18013, -17945, -18007, -17998, -18005, -18005, -18043, -18010, -17997, -18012, -18001, -18029, -17995, -18010, -18007, -17996, -18005, -18010, -17997, -18002, -18008, -18007, -18046, -18007, -18016, -18002, -18007, -18014, -17943, -18011, -18010, -17997, -18012, -18001, -18029, -17995, -18010, -18007, -17996, -18005, -18010, -17997, -18014, -17945, -17995, -18014, -17997, -17998, -17995, -18007, -18014, -18013, -17945, -18007, -17998, -18005, -18005, -18029, -17995, -18010, -18007, -17996, -18005, -18010, -17997, -18002, -18008, -18007, -17945, -18010, -17995, -17995, -18010, -17986, -17945, -18005, -18014, -18007, -18016, -17997, -18001, -17945, -18013, -18008, -18014, -17996, -17945, -18007, -18008, -17997, -17945, -18006, -18010, -17997, -18012, -18001, -17945, -17996, -18008, -17998, -17995, -18012, -18014, -17945, -18010, -17995, -17995, -18010, -17986, -17945, -18005, -18014, -18007, -18016, -17997, -18001, -18029, -17995, -18010, -18007, -17996, -18005, -18010, -17997, -18002, -18008, -18007, -17945, -17995, -18014, -17997, -17998, -17995, -18007, -18014, -18013, -17945, -18007, -17998, -18005, -18005, -18029, -17995, -18010, -18007, -17996, -18005, -18010, -17997, -18002, -18008, -18007, -18046, -18007, -18016, -18002, -18007, -18014, -17943, -17997, -17995, -18010, -18007, -17996, -18005, -18010, -17997, -18014, -17945, -17995, -18014, -17997, -17998, -17995, -18007, -18014, -18013, -17945, -18007, -17998, -18005, -18005, 809, -12051, -12082, -12069, -12084, -12089, -12037, -12067, -12082, -12095, -12068, -12093, -12082, -12069, -12090, -12096, -12095, -12054, -12095, -12088, -12090, -12095, -12086, -12159, -12083, -12082, -12069, -12084, -12089, -12037, -12067, -12082, -12095, -12068, -12093, -12082, -12069, -12086, -12145, -12067, -12086, -12069, -12070, -12067, -12095, -12086, -12085, -12145, -12095, -12070, -12093, -12093, -12037, -12067, -12082, -12095, -12068, -12093, -12082, -12069, -12090, -12096, -12095, -12145, -12082, -12067, -12067, -12082, -12074, -12145, -12093, -12086, -12095, -12088, -12069, -12089, -12145, -12085, -12096, -12086, -12068, -12145, -12095, -12096, -12069, -12145, -12094, -12082, -12069, -12084, -12089, -12145, -12068, -12096, -12070, -12067, -12084, -12086, -12145, -12082, -12067, -12067, -12082, -12074, -12145, -12093, -12086, -12095, -12088, -12069, -12089, -12051, -12082, -12069, -12084, -12089, -12037, -12067, -12082, -12095, -12068, -12093, -12082, -12069, -12090, -12096, -12095, -12054, -12095, -12088, -12090, -12095, -12086, -12159, -12083, -12082, -12069, -12084, -12089, -12037, -12067, -12082, -12095, -12068, -12093, -12082, -12069, -12086, -12145, -12067, -12086, -12068, -12070, -12093, -12069, -12145, -12084, -12096, -12095, -12069, -12082, -12090, -12095, -12068, -12145, -12095, -12070, -12093, -12093, -12145, -12082, -12069, -12145, -12090, -12095, -12085, -12086, -12073, -12145};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BatchTranslationEngine f34469;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine f34470;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TranslationEngine.Configuration f34471;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19841 f34472;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BatchTranslationEngine.BatchingStrategy m27637() {
        BatchTranslationEngine batchTranslationEngine = null;
        C19841 c19841 = null;
        int i = 803363315;
        int i2 = C0269.f1558;
        int i3 = AbstractC0641.f2496;
        int iM2761 = C0619.m2761("᩹ۡ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-22723)) ^ (-1504831982);
        int i5 = 1795759095;
        while (true) {
            i = ((((i ^ i2) * (-7497)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2082548981:
                case 19500147:
                    if (C1146.m4231()) {
                        iM2761 = C0619.m2761("ۛᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25333)) ^ (-1899893636);
                        i5 = 451338452;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩵᩸")) * (-125);
                        i4 = ((iM2761 ^ i2) * (-7151)) ^ 1906063082;
                        i5 = -570300063;
                    }
                    break;
                case -1945590251:
                case 1613524924:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0773.m3169("ۚ᩹") + i3) * 53;
                        i4 = ((iM2761 ^ i2) * 19877) ^ (-1869896558);
                        i5 = -364300647;
                    } else {
                        iM2761 = C0619.m2761("ۧܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20973) ^ 322460674;
                        i5 = -620511581;
                    }
                    break;
                case -1906910160:
                case -474834097:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("᩵ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7631) ^ (-1847770901);
                        i5 = -678032468;
                    } else {
                        iM2761 = C0619.m2761("ܰ۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30381) ^ (-963795761);
                        i5 = 1158586573;
                    }
                    break;
                case -1881803088:
                case 1832938630:
                    if (C2419.m8174() >= 0) {
                        iM2761 = (C0773.m3169("֨᩹") ^ i2) * (-49);
                        i4 = ((iM2761 ^ i3) * (-23657)) ^ 515836830;
                        i5 = -1997667360;
                    } else {
                        iM2761 = (C0773.m3169("֡ᩴ") ^ i2) * (-37);
                        i4 = ((iM2761 ^ i3) * (-23597)) ^ 273636189;
                        i5 = -1535077932;
                    }
                    break;
                case -1807131337:
                case -1729707:
                    if (C2702.m8876()) {
                        iM2761 = (C0619.m2761("۫ۖ") + i3) * (-109);
                        i4 = ((iM2761 ^ i2) * (-9011)) ^ (-949313216);
                        i5 = -476486796;
                    } else {
                        iM2761 = C0773.m3169("֫ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 733) ^ (-2068115773);
                        i5 = 1392854072;
                    }
                    break;
                case -1582148492:
                case -380451060:
                    C23916.m53419();
                    if (C23916.m53419() == 0) {
                        iM2761 = C0773.m3169("᩵ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7631) ^ (-1847770901);
                        i5 = -678032468;
                    } else {
                        iM2761 = C0773.m3169("֫ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 733) ^ (-2068115773);
                        i5 = 1392854072;
                    }
                    break;
                case -1544310723:
                case -1528647619:
                    return batchTranslationEngine.createBatchingStrategy();
                case -1148641724:
                case -282908645:
                    return c19841.m45702();
                case -818164645:
                case 124788786:
                    throw new UnsupportedOperationException();
                case -807677809:
                case 458789017:
                    if (C3734.m12152() >= 0) {
                        iM2761 = (C0773.m3169("ۚ᩹") + i3) * 53;
                        i4 = ((iM2761 ^ i2) * 19877) ^ (-1869896558);
                        i5 = -364300647;
                    } else {
                        iM2761 = C0619.m2761("ܳ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13065) ^ 544401395;
                        i5 = -794559762;
                    }
                    break;
                case -640653478:
                case 1251261808:
                    C1519.m5403();
                    return null;
                case -505432691:
                case 400718478:
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0773.m3169("᩵ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7631) ^ (-1847770901);
                        i5 = -678032468;
                    } else {
                        iM2761 = (C0619.m2761("ᩳۢ") ^ i2) * (-59);
                        i4 = ((iM2761 ^ i3) * (-15943)) ^ (-1458797790);
                        i5 = 1612214210;
                    }
                    break;
                case -436048603:
                case -79977101:
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("᩵ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7631) ^ (-1847770901);
                        i5 = -678032468;
                    } else {
                        iM2761 = (C0773.m3169("ᩴۗ") ^ i3) * (-67);
                        i4 = ((iM2761 ^ i2) * 7937) ^ 714517819;
                        i5 = -906215119;
                    }
                    break;
                case -376438217:
                case -196740214:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("᩵ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7631) ^ (-1847770901);
                        i5 = -678032468;
                    } else {
                        iM2761 = C0773.m3169("᩵ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29695) ^ 1371818784;
                        i5 = 84105285;
                    }
                    break;
                case -120333011:
                case 1581518139:
                    if (!C0619.m2763()) {
                        iM2761 = (C0773.m3169("ۚ᩹") + i3) * 53;
                        i4 = ((iM2761 ^ i2) * 19877) ^ (-1869896558);
                        i5 = -364300647;
                    } else {
                        iM2761 = C0773.m3169("֫ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 733) ^ (-2068115773);
                        i5 = 1392854072;
                    }
                    break;
                case 134282061:
                case 327042789:
                    c19841 = this.f34472;
                    if (c19841 != null) {
                        iM2761 = (i3 - C0619.m2761("᩷֨")) * (-43);
                        i4 = ((iM2761 ^ i2) * 19133) ^ 1900207709;
                        i5 = 1099544878;
                    } else {
                        iM2761 = C0619.m2761("֡ܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14759) ^ 791152999;
                        i5 = -528621077;
                    }
                    break;
                case 899716658:
                case 1475051410:
                    batchTranslationEngine = this.f34469;
                    if (batchTranslationEngine != null) {
                        iM2761 = C0619.m2761("ۡܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-24711)) ^ 1197939849;
                        i5 = 690420147;
                    } else {
                        iM2761 = C0773.m3169("֫ۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27607)) ^ 719656730;
                        i5 = 658953693;
                    }
                    break;
                case 954057292:
                case 1411402204:
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0773.m3169("֨᩹") ^ i2) * (-49);
                        i4 = ((iM2761 ^ i3) * (-23657)) ^ 515836830;
                        i5 = -1997667360;
                    } else {
                        iM2761 = C0773.m3169("֫ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 733) ^ (-2068115773);
                        i5 = 1392854072;
                    }
                    break;
                case 1157442210:
                case 2062226898:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("֫ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 733) ^ (-2068115773);
                        i5 = 1392854072;
                    } else {
                        iM2761 = C0773.m3169("ܶ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16357)) ^ 1720373519;
                        i5 = 1911478007;
                    }
                    break;
                default:
                    C0487.m2356();
                    iM2761 = C0773.m3169("֫ۛ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 733) ^ (-2068115773);
                    i5 = 1392854072;
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ᩴ۬ۤ] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public C10890(TranslationEngine translationEngine) {
        int iM2761;
        int i;
        TranslationEngine.Configuration configuration = null;
        BatchTranslationEngine batchTranslationEngine = null;
        BatchTranslationEngine batchTranslationEngine2 = null;
        ?? c19841 = 0;
        int i2 = 1033642246;
        int i3 = C0950.f3488;
        int i4 = C3779.f12953;
        int iM2762 = (i4 - C0619.m2761("ۤܳ")) * 97;
        int i5 = ((iM2762 ^ i3) * 18393) ^ 2023081982;
        int i6 = 1552245793;
        while (true) {
            int i7 = iM2762 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * (-31949)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1970560262:
                    case 749470441:
                        if (translationEngine instanceof BatchTranslationEngine) {
                            iM2761 = (i3 - C0773.m3169("ۘ۟")) * (-71);
                            i5 = ((iM2761 ^ i4) * (-31829)) ^ (-2060298888);
                            i = -1499224454;
                        } else {
                            iM2761 = C0619.m2761("۬᩶") ^ i4;
                            i5 = ((iM2761 ^ i3) * 4723) ^ 2098804211;
                            i = 725909725;
                        }
                        i7 = iM2761 ^ i;
                        batchTranslationEngine = null;
                        break;
                    case -1926582198:
                    case 1378077120:
                        C23916.m53419();
                        C2834.m9344();
                        throw new RuntimeException();
                    case -1629272282:
                    case 980156075:
                        this.f34470 = translationEngine;
                        configuration = translationEngine.getConfiguration();
                        if (C20932.f66974 > 0) {
                            iM2762 = (C0619.m2761("᩻᩺") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i5 = ((iM2762 ^ i3) * 15743) ^ 441396133;
                            i6 = 1553885207;
                        } else {
                            iM2762 = (C0619.m2761("᩵ۗ") ^ i4) * (-101);
                            i5 = ((iM2762 ^ i3) * 595) ^ 1745487643;
                            i6 = 1351309410;
                        }
                        break;
                    case -1524987093:
                    case 1324710214:
                        if (!C2702.m8876()) {
                            iM2762 = (C0619.m2761("᩵ۗ") ^ i4) * (-101);
                            i5 = ((iM2762 ^ i3) * 595) ^ 1745487643;
                            i6 = 1351309410;
                            break;
                        }
                        iM2762 = (C0619.m2761("ۧۘ") ^ i4) * 95;
                        i5 = ((iM2762 ^ i3) * (-16217)) ^ (-844515131);
                        i6 = -1554322913;
                        break;
                    case -1521808048:
                    case 2091848553:
                        if (C0487.f2131 > 0) {
                            iM2762 = C0619.m2761("᩺۫") ^ i4;
                            i5 = ((iM2762 ^ i3) * 24527) ^ 370337378;
                            i6 = -2033238621;
                        } else {
                            iM2762 = C0619.m2761("֨ۧ") ^ i4;
                            i5 = ((iM2762 ^ i3) * (-23209)) ^ (-572031719);
                            i6 = -1531814077;
                        }
                        break;
                    case -1497599755:
                    case -986113762:
                        if (C1080.f3865 < 0) {
                            iM2762 = (C0619.m2761("ۚۖ") + i4) * 91;
                            i5 = ((iM2762 ^ i3) * (-1869)) ^ (-1009444012);
                            i6 = 257568060;
                        } else {
                            iM2762 = C0619.m2761("֨ۧ") ^ i4;
                            i5 = ((iM2762 ^ i3) * (-23209)) ^ (-572031719);
                            i6 = -1531814077;
                        }
                        break;
                    case -1441550038:
                    case 629534269:
                        C1146.m4231();
                        if (C1826.m6301() >= 0) {
                            iM2762 = (C0619.m2761("۫֫") + i3) * (-91);
                            i5 = ((iM2762 ^ i4) * 6547) ^ (-2089879079);
                            i6 = 526853984;
                        } else {
                            iM2762 = C0619.m2761("֨ۧ") ^ i4;
                            i5 = ((iM2762 ^ i3) * (-23209)) ^ (-572031719);
                            i6 = -1531814077;
                        }
                        break;
                    case -1353425116:
                    case 1655173635:
                        if (C2834.f9334 > 0) {
                            iM2762 = (i3 - C0773.m3169("ۗᩴ")) * (-105);
                            i5 = ((iM2762 ^ i4) * 9833) ^ 1850722511;
                            i6 = -282473111;
                        } else {
                            iM2762 = (C0619.m2761("ۚۖ") + i4) * 91;
                            i5 = ((iM2762 ^ i3) * (-1869)) ^ (-1009444012);
                            i6 = 257568060;
                        }
                        break;
                    case -1312006944:
                    case -515982364:
                        if (C3448.m11248() == 0) {
                            iM2762 = (C0773.m3169("۬᩹") + i3) * 33;
                            i5 = ((iM2762 ^ i4) * 22815) ^ (-1939315455);
                            i6 = 117434892;
                        } else {
                            iM2762 = (C0773.m3169("ۘ֫") + i3) * (-19);
                            i5 = ((iM2762 ^ i4) * 22807) ^ 644452420;
                            i6 = 1839202617;
                        }
                        break;
                    case -1310002634:
                    case -1240749884:
                        this.f34471 = configuration;
                        if (!C3077.m10041()) {
                            iM2762 = (C0619.m2761("᩹۠") + i3) * (-11);
                            i5 = ((iM2762 ^ i4) * 20653) ^ 1246713302;
                            i6 = 175595445;
                        } else {
                            iM2762 = (C0619.m2761("᩵ۗ") ^ i4) * (-101);
                            i5 = ((iM2762 ^ i3) * 595) ^ 1745487643;
                            i6 = 1351309410;
                        }
                        break;
                    case -1275393712:
                    case -859612506:
                        if (C1146.f4234 < 0) {
                            iM2762 = C0619.m2761("ܶ۬") ^ i3;
                            i5 = ((iM2762 ^ i4) * 28661) ^ (-376936859);
                            i6 = 845184266;
                        } else {
                            iM2762 = C0619.m2761("֨ۧ") ^ i4;
                            i5 = ((iM2762 ^ i3) * (-23209)) ^ (-572031719);
                            i6 = -1531814077;
                        }
                        break;
                    case -1249526073:
                    case 1738736486:
                        batchTranslationEngine2 = (BatchTranslationEngine) translationEngine;
                        c19841 = batchTranslationEngine;
                        iM2762 = (C0773.m3169("ܿܿ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM2762 ^ i4) * (-27601)) ^ (-1875421278);
                        i6 = -1355693158;
                        break;
                    case -1200479854:
                    case 861295945:
                        c19841 = new C19841(translationEngine);
                        batchTranslationEngine2 = batchTranslationEngine;
                        iM2762 = (C0773.m3169("ܿܿ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM2762 ^ i4) * (-27601)) ^ (-1875421278);
                        i6 = -1355693158;
                        break;
                        break;
                    case -1175797338:
                    case 455665874:
                        this.f34469 = batchTranslationEngine2;
                        this.f34472 = c19841;
                        return;
                    case -969963078:
                    case 263360048:
                        if (!C3779.m12264()) {
                            iM2762 = (C0773.m3169("ۘ֫") + i3) * (-19);
                            i5 = ((iM2762 ^ i4) * 22807) ^ 644452420;
                            i6 = 1839202617;
                            break;
                        }
                        iM2762 = C0619.m2761("֨ۧ") ^ i4;
                        i5 = ((iM2762 ^ i3) * (-23209)) ^ (-572031719);
                        i6 = -1531814077;
                        break;
                    case -907170779:
                    case 2051179605:
                        if (C4282.f15546 > 0) {
                            iM2762 = C0619.m2761("ۘ᩹") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-29161)) ^ 1872104770;
                            i6 = 1811725612;
                        } else {
                            iM2762 = (C0619.m2761("۫֫") + i3) * (-91);
                            i5 = ((iM2762 ^ i4) * 6547) ^ (-2089879079);
                            i6 = 526853984;
                        }
                        break;
                    case -833418962:
                    case -52968031:
                        if (C3998.f13671 == 0) {
                            iM2762 = C0619.m2761("᩵ۢ") ^ i4;
                            i5 = ((iM2762 ^ i3) * (-5815)) ^ (-1855423518);
                            i6 = -1937643248;
                        } else {
                            iM2762 = (C0619.m2761("۫֫") + i3) * (-91);
                            i5 = ((iM2762 ^ i4) * 6547) ^ (-2089879079);
                            i6 = 526853984;
                        }
                        break;
                    case -364012360:
                    case 279508048:
                        if (C2419.f7754 < 0) {
                            iM2762 = (C0619.m2761("ۗ᩹") + i4) * 69;
                            i5 = ((iM2762 ^ i3) * (-7557)) ^ 306458254;
                            i6 = -2017810770;
                        } else {
                            iM2762 = (C0619.m2761("۫֫") + i3) * (-91);
                            i5 = ((iM2762 ^ i4) * 6547) ^ (-2089879079);
                            i6 = 526853984;
                        }
                        break;
                    case 47982817:
                    case 992418850:
                        if (!configuration.allowBatchTranslationBySeparator) {
                            batchTranslationEngine2 = batchTranslationEngine;
                            c19841 = batchTranslationEngine2;
                            iM2762 = (C0773.m3169("ܿܿ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i5 = ((iM2762 ^ i4) * (-27601)) ^ (-1875421278);
                            i6 = -1355693158;
                            break;
                            break;
                        }
                        iM2762 = (i4 - C0773.m3169("ۢۜ")) * 5;
                        i5 = ((iM2762 ^ i3) * (-22963)) ^ (-691039461);
                        i6 = 2005356926;
                        break;
                    default:
                        C2878.m9491();
                        C2288.m7767();
                        iM2762 = C0619.m2761("֨ۧ") ^ i4;
                        i5 = ((iM2762 ^ i3) * (-23209)) ^ (-572031719);
                        i6 = -1531814077;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0cd5 A[PHI: r2 r3 r5 r6 r7 r10 r14 r17 r20 r21 r22 r23 r25 r26 r27 r30 r31 r32 r33 r34 r35
      0x0cd5: PHI (r2v4 short[]) = (r2v2 short[]), (r2v3 short[]), (r2v5 short[]) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r3v4 short[]) = (r3v2 short[]), (r3v3 short[]), (r3v5 short[]) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r5v11 bin.mt.plugin.api.translation.TranslationEngine$Configuration) = 
      (r5v9 bin.mt.plugin.api.translation.TranslationEngine$Configuration)
      (r5v10 bin.mt.plugin.api.translation.TranslationEngine$Configuration)
      (r5v12 bin.mt.plugin.api.translation.TranslationEngine$Configuration)
     binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r6v6 int) = (r6v4 int), (r6v5 int), (r6v7 int) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r7v5 bin.mt.plugin.api.translation.BatchTranslationEngine$BatchingStrategy) = 
      (r7v3 bin.mt.plugin.api.translation.BatchTranslationEngine$BatchingStrategy)
      (r7v4 bin.mt.plugin.api.translation.BatchTranslationEngine$BatchingStrategy)
      (r7v6 bin.mt.plugin.api.translation.BatchTranslationEngine$BatchingStrategy)
     binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r10v38 bin.mt.plugin.api.translation.BatchTranslationEngine) = 
      (r10v36 bin.mt.plugin.api.translation.BatchTranslationEngine)
      (r10v37 bin.mt.plugin.api.translation.BatchTranslationEngine)
      (r10v39 bin.mt.plugin.api.translation.BatchTranslationEngine)
     binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r14v6 int) = (r14v4 int), (r14v5 int), (r14v7 int) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r17v6 java.lang.String) = (r17v4 java.lang.String), (r17v5 java.lang.String), (r17v7 java.lang.String) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r20v6 int) = (r20v4 int), (r20v5 int), (r20v7 int) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r21v6 java.lang.String) = (r21v4 java.lang.String), (r21v5 java.lang.String), (r21v7 java.lang.String) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r22v5 java.lang.String[]) = (r22v3 java.lang.String[]), (r22v4 java.lang.String[]), (r22v6 java.lang.String[]) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r23v6 java.lang.StringBuilder) = (r23v4 java.lang.StringBuilder), (r23v5 java.lang.StringBuilder), (r23v7 java.lang.StringBuilder) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r25v3 short[]) = (r25v1 short[]), (r25v2 short[]), (r25v1 short[]) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r26v2 short) = (r26v1 short), (r26v1 short), (r26v3 short) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r27v2 int) = (r27v1 int), (r27v1 int), (r27v3 int) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r30v25 int) = (r30v23 int), (r30v24 int), (r30v26 int) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r31v4 short[]) = (r31v2 short[]), (r31v3 short[]), (r31v5 short[]) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r32v4 java.lang.String) = (r32v2 java.lang.String), (r32v3 java.lang.String), (r32v5 java.lang.String) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r33v4 java.lang.String) = (r33v2 java.lang.String), (r33v3 java.lang.String), (r33v5 java.lang.String) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r34v4 int) = (r34v2 int), (r34v3 int), (r34v5 int) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]
      0x0cd5: PHI (r35v4 short[]) = (r35v2 short[]), (r35v3 short[]), (r35v5 short[]) binds: [B:178:0x0cd3, B:174:0x0c93, B:170:0x0c4d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x016a  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x011e, code lost:
    
        if (l.C2834.f9334 > 0) goto L16;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m27638(java.lang.String r56, java.lang.String r57, java.lang.String r58) {
        /*
            Method dump skipped, instruction units count: 3788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10890.m27638(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m27640() {
        int i = 800097437;
        int i2 = C11235.f35427;
        int i3 = C2834.f9334;
        int iM3169 = (C0773.m3169("᩹ܺ") ^ i2) * 75;
        int i4 = ((iM3169 ^ i3) * (-9137)) ^ 1832496919;
        int i5 = 792037819;
        while (true) {
            i = ((((i ^ i3) * (-2003)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1908344631:
                case -733371764:
                    C0269.m1775();
                    C2288.m7767();
                    iM3169 = (C0773.m3169("ۚ᩹") + i3) * (-77);
                    i4 = ((iM3169 ^ i2) * (-13721)) ^ 1261323524;
                    i5 = 196419386;
                    break;
                case -1796691375:
                case -238344352:
                    return true;
                case -1356591171:
                case -599042330:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0773.m3169("۬ܰ") + i3) * q.h;
                        i4 = ((iM3169 ^ i2) * (-1917)) ^ 487341234;
                        i5 = -428211617;
                    } else {
                        iM3169 = (C0619.m2761("ܽᩳ") ^ i3) * (-127);
                        i4 = ((iM3169 ^ i2) * 1523) ^ (-1973010086);
                        i5 = -1648849040;
                    }
                    break;
                case -1217466993:
                case 1207198355:
                    if (C3734.m12152() >= 0) {
                        iM3169 = (C0619.m2761("ۨܰ") ^ i3) * (-77);
                        i4 = ((iM3169 ^ i2) * 8667) ^ 522497201;
                        i5 = -1465159039;
                    } else {
                        iM3169 = (C0773.m3169("ۚ᩹") + i3) * (-77);
                        i4 = ((iM3169 ^ i2) * (-13721)) ^ 1261323524;
                        i5 = 196419386;
                    }
                    break;
                case -1094054503:
                case 1360006427:
                    if (!RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("ۚ᩹") + i3) * (-77);
                        i4 = ((iM3169 ^ i2) * (-13721)) ^ 1261323524;
                        i5 = 196419386;
                    } else {
                        iM3169 = C0773.m3169("ۖۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26085)) ^ 861215601;
                        i5 = -520699907;
                    }
                    break;
                case -768633422:
                case 1801105871:
                    if (C1343.m4943()) {
                        iM3169 = (C0773.m3169("ܺ᩶") + i3) * (-73);
                        i4 = ((iM3169 ^ i2) * 21375) ^ (-965540071);
                        i5 = -1887533191;
                    } else {
                        iM3169 = (C0619.m2761("ۨܰ") ^ i3) * (-77);
                        i4 = ((iM3169 ^ i2) * 8667) ^ 522497201;
                        i5 = -1465159039;
                    }
                    break;
                case -432511196:
                case -166371768:
                    if (this.f34472 != null) {
                        iM3169 = C0619.m2761("۫᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20323) ^ (-939823351);
                        i5 = -610144403;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۛ᩺")) * 79;
                        i4 = ((iM3169 ^ i3) * (-935)) ^ (-515122983);
                        i5 = 1002740483;
                    }
                    break;
                case -322093779:
                case 207867188:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("۬ܰ") + i3) * q.h;
                        i4 = ((iM3169 ^ i2) * (-1917)) ^ 487341234;
                        i5 = -428211617;
                    } else {
                        iM3169 = C0773.m3169("ܿ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-161)) ^ (-470475990);
                        i5 = 695438571;
                    }
                    break;
                case -228951842:
                case 346571171:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0619.m2761("ۨܰ") ^ i3) * (-77);
                        i4 = ((iM3169 ^ i2) * 8667) ^ 522497201;
                        i5 = -1465159039;
                    } else {
                        iM3169 = C0773.m3169("ܶۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4613)) ^ 664847690;
                        i5 = -105356054;
                    }
                    break;
                case 28061803:
                case 989713212:
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ۖۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26085)) ^ 861215601;
                        i5 = -520699907;
                    } else {
                        iM3169 = C0619.m2761("᩺ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 31871) ^ (-1530561057);
                        i5 = 255692698;
                    }
                    break;
                case 33093370:
                case 924402550:
                    if (this.f34469 == null) {
                        iM3169 = (i2 - C0773.m3169("᩻ۙ")) * (-117);
                        i4 = ((iM3169 ^ i3) * (-3257)) ^ 1831408770;
                        i5 = 369985082;
                    } else {
                        iM3169 = C0619.m2761("۫᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20323) ^ (-939823351);
                        i5 = -610144403;
                    }
                    break;
                case 243534786:
                case 1143809443:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ۚ᩹") + i3) * (-77);
                        i4 = ((iM3169 ^ i2) * (-13721)) ^ 1261323524;
                        i5 = 196419386;
                    } else {
                        iM3169 = (i2 - C0773.m3169("֨ۛ")) * 5;
                        i4 = ((iM3169 ^ i3) * (-2021)) ^ 1060710698;
                        i5 = 742197627;
                    }
                    break;
                case 317315685:
                case 1715126823:
                    if (C0862.m3503()) {
                        iM3169 = C0773.m3169("᩸ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21171) ^ 138946000;
                        i5 = -1138223688;
                    } else {
                        iM3169 = C0773.m3169("ۖۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26085)) ^ 861215601;
                        i5 = -520699907;
                    }
                    break;
                case 391046642:
                case 685245628:
                    if (C1542.m5459() >= 0) {
                        iM3169 = (C0619.m2761("ۨܰ") ^ i3) * (-77);
                        i4 = ((iM3169 ^ i2) * 8667) ^ 522497201;
                        i5 = -1465159039;
                    } else {
                        iM3169 = C0619.m2761("ۜܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18297)) ^ (-105385820);
                        i5 = 1103979973;
                    }
                    break;
                case 784932274:
                case 793619212:
                    if (C3099.m10095()) {
                        iM3169 = C0773.m3169("ۖۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26085)) ^ 861215601;
                        i5 = -520699907;
                    } else {
                        iM3169 = C0773.m3169("ۖ᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11785) ^ (-1399911241);
                        i5 = -1474359796;
                    }
                    break;
                case 1081570675:
                case 1556195439:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ۚ᩹") + i3) * (-77);
                        i4 = ((iM3169 ^ i2) * (-13721)) ^ 1261323524;
                        i5 = 196419386;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24841)) ^ 1252261013;
                        i5 = 1036436815;
                    }
                    break;
                case 1172637010:
                case 1749060920:
                    return false;
                case 1527385926:
                case 1913935458:
                    C2023.m6964();
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0619.m2761("ۨܰ") ^ i3) * (-77);
                        i4 = ((iM3169 ^ i2) * 8667) ^ 522497201;
                        i5 = -1465159039;
                    } else {
                        iM3169 = (C0619.m2761("֨۫") ^ i2) * 49;
                        i4 = ((iM3169 ^ i3) * (-8819)) ^ 1388786903;
                        i5 = -1439329048;
                    }
                    break;
                default:
                    C17202.m40372();
                    return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x039f A[PHI: r5 r6 r21
      0x039f: PHI (r5v4 l.ᩴ۬ۤ) = (r5v3 l.ᩴ۬ۤ), (r5v2 l.ᩴ۬ۤ) binds: [B:105:0x0388, B:97:0x0336] A[DONT_GENERATE, DONT_INLINE]
      0x039f: PHI (r6v4 bin.mt.plugin.api.translation.BatchTranslationEngine) = 
      (r6v3 bin.mt.plugin.api.translation.BatchTranslationEngine)
      (r6v2 bin.mt.plugin.api.translation.BatchTranslationEngine)
     binds: [B:105:0x0388, B:97:0x0336] A[DONT_GENERATE, DONT_INLINE]
      0x039f: PHI (r21v14 int) = (r21v12 int), (r21v15 int) binds: [B:105:0x0388, B:97:0x0336] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x04dc A[PHI: r15 r16 r17 r21
      0x04dc: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:136:0x04da, B:132:0x04bd, B:124:0x0471, B:116:0x041a, B:13:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x04dc: PHI (r16v4 short) = (r16v2 short), (r16v2 short), (r16v2 short), (r16v3 short), (r16v2 short) binds: [B:136:0x04da, B:132:0x04bd, B:124:0x0471, B:116:0x041a, B:13:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x04dc: PHI (r17v4 short[]) = (r17v2 short[]), (r17v2 short[]), (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:136:0x04da, B:132:0x04bd, B:124:0x0471, B:116:0x041a, B:13:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x04dc: PHI (r21v47 int) = (r21v2 int), (r21v3 int), (r21v5 int), (r21v7 int), (r21v50 int) binds: [B:136:0x04da, B:132:0x04bd, B:124:0x0471, B:116:0x041a, B:13:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] m27639(String[] strArr, String str, String str2) {
        int iM3169;
        int i;
        int i2;
        String[] strArrM45703;
        int iM31610;
        int i3;
        int i4;
        int i5 = C11235.f35427;
        int i6 = C1146.f4234;
        int iM31611 = (C0773.m3169("᩺֨") ^ i6) * (-23);
        int i7 = ((iM31611 ^ i5) * (-8529)) ^ 273824281;
        BatchTranslationEngine batchTranslationEngine = null;
        String[] strArr2 = null;
        short[] sArr = null;
        int i8 = iM31611 ^ (-549563220);
        C19841 c19841 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = 403054313;
        int i14 = 0;
        String strM15607 = null;
        int i15 = 0;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i5) * 32557) >> 31));
            switch (i13) {
                case -2105452974:
                case 1957484396:
                    AbstractC0641.m2813();
                    if (C2419.m8174() >= 0) {
                        iM3169 = C0619.m2761("֫۟") ^ i6;
                        i = ((iM3169 ^ i5) * (-11597)) ^ (-1454098104);
                        i2 = 2069169707;
                        int i16 = i15;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        i15 = i16;
                    } else {
                        iM31610 = (C0773.m3169("ᩳ᩹") + i6) * 71;
                        i3 = ((iM31610 ^ i5) * 10917) ^ (-1452416263);
                        i4 = -1858178970;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -2054389090:
                case 1946987084:
                    i11 = 2930;
                    iM3169 = C0619.m2761("᩵᩷") ^ i5;
                    i = ((iM3169 ^ i6) * 621) ^ (-1382037707);
                    i2 = 246467054;
                    int i17 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i17;
                    break;
                case -2026478127:
                case -813303146:
                    i15 = i15;
                    int i18 = s + s2;
                    if ((i18 * i18) - i12 <= 0) {
                        iM3169 = (i5 - C0619.m2761("ۧ֨")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i6) * (-28747)) ^ 992960788;
                        i2 = 1543747607;
                    } else {
                        iM3169 = C0773.m3169("ۧ۫") ^ i6;
                        i = ((iM3169 ^ i5) * (-17401)) ^ 1720630028;
                        i2 = 905248888;
                    }
                    int i19 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i19;
                    break;
                case -1922109965:
                case -200168965:
                    i10++;
                    iM3169 = C0619.m2761("ۖۘ") ^ i6;
                    i = ((iM3169 ^ i5) * 14721) ^ (-1341581277);
                    i2 = -1538748009;
                    int i110 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i110;
                    break;
                case -1783415924:
                case -58745676:
                    C1321.m4852();
                    if (C3779.f12953 > 0) {
                        iM31610 = (C0773.m3169("ᩳ᩹") + i6) * 71;
                        i3 = ((iM31610 ^ i5) * 10917) ^ (-1452416263);
                        i4 = -1858178970;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    } else {
                        iM3169 = (C0773.m3169("ᩴۧ") ^ i6) * (-97);
                        i = ((iM3169 ^ i5) * 9911) ^ 276210027;
                        i2 = -1797895946;
                        int i111 = i15;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        i15 = i111;
                    }
                    break;
                case -1755906050:
                case -892571298:
                    i15 = i15;
                    i9 = 0;
                    if (strArr.length == 0) {
                        iM3169 = (C0619.m2761("ۛ۫") + i5) * (-83);
                        i = ((iM3169 ^ i6) * (-32409)) ^ 1179224773;
                        i2 = 1509741865;
                    } else {
                        iM3169 = (i6 - C0773.m3169("ۛܳ")) * 27;
                        i = ((iM3169 ^ i5) * (-28877)) ^ (-2146592044);
                        i2 = -1647551003;
                    }
                    int i112 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i112;
                    break;
                case -1746381922:
                case -63392753:
                    i15 = i15;
                    s = sArr[208];
                    i14 = s * s;
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0619.m2761("ᩳ᩺") ^ i5) * (-119);
                        i = ((iM3169 ^ i6) * 18837) ^ (-1630205117);
                        i2 = 1001364249;
                    } else {
                        iM3169 = C0619.m2761("ۢ۠") ^ i5;
                        i = ((iM3169 ^ i6) * 7989) ^ (-273530239);
                        i2 = 1069409766;
                    }
                    int i113 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i113;
                    break;
                case -1735570172:
                case 247545136:
                    if (i15 >= strArr2.length) {
                        iM3169 = C0773.m3169("ܺۜ") ^ i6;
                        i = ((iM3169 ^ i5) * 28933) ^ (-588240439);
                        i2 = -1952136701;
                        int i114 = i15;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        i15 = i114;
                    } else {
                        iM31610 = (C0619.m2761("᩺ۛ") + i6) * 33;
                        i3 = ((iM31610 ^ i5) * 16517) ^ (-1976402199);
                        i4 = 268377967;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -1672367080:
                case -624867895:
                    i15 = i15;
                    c19841 = this.f34472;
                    batchTranslationEngine = this.f34469;
                    if (batchTranslationEngine == null) {
                        iM3169 = C0773.m3169("֫۠") ^ i5;
                        i = ((iM3169 ^ i6) * (-18567)) ^ 821312936;
                        i2 = -1639689437;
                    } else {
                        iM3169 = C0619.m2761("۬ۤ") ^ i6;
                        i = ((iM3169 ^ i5) * 3225) ^ (-1495990818);
                        i2 = 657423492;
                    }
                    int i115 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i115;
                    break;
                case -1535147169:
                case -1253472167:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("֫ۨ") + i5) * (-43);
                        i = ((iM3169 ^ i6) * 13591) ^ 731402191;
                        i2 = -1107262310;
                        int i116 = i15;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        i15 = i116;
                    } else {
                        iM31610 = (C0619.m2761("ܰۗ") ^ i5) * (-125);
                        i3 = ((iM31610 ^ i6) * 28029) ^ 486847762;
                        i4 = 2032018386;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -1386280308:
                case 1180310149:
                    i15 = i15;
                    int i20 = i14 + 104571076;
                    i12 = i20 + i20;
                    s2 = 10226;
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0773.m3169("ۤۛ") ^ i5) * 13;
                        i = ((iM3169 ^ i6) * (-27965)) ^ (-1825532780);
                        i2 = 634081683;
                    } else {
                        iM3169 = C0619.m2761("᩻ۛ") ^ i6;
                        i = ((iM3169 ^ i5) * (-19007)) ^ 1003014737;
                        i2 = 2147458900;
                    }
                    int i117 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i117;
                    break;
                case -1298563666:
                case 1004370659:
                    return strArr2;
                case -1274342319:
                case 24764459:
                    i15 = i15;
                    if (batchTranslationEngine != null) {
                        iM3169 = (C0619.m2761("۫ܺ") ^ i6) * (-53);
                        i = ((iM3169 ^ i5) * 2413) ^ (-411122241);
                        i2 = 1518421349;
                    } else {
                        iM3169 = C0773.m3169("ܺ᩻") ^ i5;
                        i = ((iM3169 ^ i6) * 4649) ^ (-1264860000);
                        i2 = -1478731780;
                    }
                    int i118 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i118;
                    break;
                case -1200654112:
                case 338761047:
                    i15 = i15;
                    if (i10 < strArr2.length) {
                        iM3169 = C0773.m3169("ۨܶ") ^ i5;
                        i = ((iM3169 ^ i6) * (-28361)) ^ 1892527955;
                        i2 = -414388711;
                    } else {
                        iM3169 = (i6 - C0773.m3169("۟᩶")) * (-121);
                        i = ((iM3169 ^ i5) * (-9553)) ^ (-1332426431);
                        i2 = -879383700;
                    }
                    int i119 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i119;
                    break;
                case -1177349562:
                case 1891825104:
                    if (!this.f34471.autoRepairFormatSpecifiersError) {
                        iM3169 = C0773.m3169("ܺۜ") ^ i6;
                        i = ((iM3169 ^ i5) * 28933) ^ (-588240439);
                        i2 = -1952136701;
                        int i1110 = i15;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        i15 = i1110;
                    } else {
                        i15 = i9;
                        iM31610 = (i5 - C0773.m3169("ۖܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM31610 ^ i6) * 26099) ^ (-546236286);
                        i4 = -1200619276;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -1090965651:
                case -899850921:
                    i15 = i15;
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0773.m3169("ۚ֡") ^ i6;
                        i = ((iM3169 ^ i5) * (-7923)) ^ (-971433316);
                        i2 = -902114144;
                    } else {
                        iM3169 = (C0619.m2761("ܽܰ") + i6) * (-27);
                        i = ((iM3169 ^ i5) * 15585) ^ (-49297884);
                        i2 = 34356534;
                    }
                    int i1111 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i1111;
                    break;
                case -1080398251:
                case 1651458172:
                    i11 = 53423;
                    iM3169 = C0619.m2761("᩵᩷") ^ i5;
                    i = ((iM3169 ^ i6) * 621) ^ (-1382037707);
                    i2 = 246467054;
                    int i1112 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i1112;
                    break;
                case -911982641:
                case 1347253588:
                    C3077.m10041();
                    if (!C0862.m3503()) {
                        iM31610 = (C0619.m2761("֨ۗ") ^ i5) * 87;
                        i3 = ((iM31610 ^ i6) * (-19149)) ^ (-1730196219);
                        i4 = 2135451457;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    } else {
                        iM3169 = (C0619.m2761("֫ۨ") + i5) * (-43);
                        i = ((iM3169 ^ i6) * 13591) ^ 731402191;
                        i2 = -1107262310;
                        int i1113 = i15;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        i15 = i1113;
                    }
                    break;
                case -899818889:
                case 1552313121:
                    i15 = i15;
                    if (strArr2.length == strArr.length) {
                        iM3169 = (C0619.m2761("ܳܳ") ^ i5) * (-77);
                        i = ((iM3169 ^ i6) * 23519) ^ (-333382284);
                        i2 = -1593365876;
                    } else {
                        iM3169 = C0773.m3169("᩹᩷") ^ i6;
                        i = ((iM3169 ^ i5) * (-7395)) ^ (-881311043);
                        i2 = -1972755999;
                    }
                    int i1114 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i1114;
                    break;
                case -886247747:
                case 1392843603:
                    if (!C3998.m12920()) {
                        iM31610 = (C0619.m2761("֨ۗ") ^ i5) * 87;
                        i3 = ((iM31610 ^ i6) * (-19149)) ^ (-1730196219);
                        i4 = 2135451457;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    } else {
                        i15 = i15;
                        iM3169 = (C0773.m3169("ۤۛ") ^ i5) * 13;
                        i = ((iM3169 ^ i6) * (-27965)) ^ (-1825532780);
                        i2 = 634081683;
                        int i1115 = i15;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        i15 = i1115;
                    }
                    break;
                case -873608154:
                case -808964660:
                    i15 = i15;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("ۤۛ") ^ i5) * 13;
                        i = ((iM3169 ^ i6) * (-27965)) ^ (-1825532780);
                        i2 = 634081683;
                    } else {
                        iM3169 = (C0619.m2761("ܶܺ") + i6) * 73;
                        i = ((iM3169 ^ i5) * (-25665)) ^ 1003434596;
                        i2 = -1736392415;
                    }
                    int i1116 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i1116;
                    break;
                case -809430101:
                case 1031125119:
                    i15 = i15;
                    if (strArr2 != null) {
                        iM3169 = C0619.m2761("᩺ܳ") ^ i5;
                        i = ((iM3169 ^ i6) * (-27069)) ^ (-1903156280);
                        i2 = -385364840;
                    } else {
                        iM3169 = C0773.m3169("ܳ᩷") ^ i6;
                        i = ((iM3169 ^ i5) * (-21409)) ^ (-517659451);
                        i2 = -101723604;
                    }
                    int i1117 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i1117;
                    break;
                case -806301332:
                case -784797258:
                    strM15607 = C5178.m15607(strArr[i15], strArr2[i15]);
                    if (C2485.f7950 == 0) {
                        iM31610 = (C0773.m3169("֨᩺") ^ i5) * (-73);
                        i3 = ((iM31610 ^ i6) * (-7741)) ^ (-1577130505);
                        i4 = 1855067509;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    } else {
                        iM3169 = C0619.m2761("֫۟") ^ i6;
                        i = ((iM3169 ^ i5) * (-11597)) ^ (-1454098104);
                        i2 = 2069169707;
                        int i1118 = i15;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        i15 = i1118;
                    }
                    break;
                case -699224223:
                case 212260578:
                    i15 = i15;
                    if (c19841 != null) {
                        iM3169 = C0619.m2761("۬ۤ") ^ i6;
                        i = ((iM3169 ^ i5) * 3225) ^ (-1495990818);
                        i2 = 657423492;
                    } else {
                        iM3169 = C0619.m2761("ܺ۬") ^ i6;
                        i = ((iM3169 ^ i5) * (-1101)) ^ (-1259589814);
                        i2 = 1463556368;
                    }
                    int i1119 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i1119;
                    break;
                case -414866976:
                case 2057429254:
                    throw new UnsupportedOperationException();
                case -344210824:
                case 1974337539:
                    i15 = i15;
                    if (strArr2[i10] != null) {
                        iM3169 = C0773.m3169("᩻ܰ") ^ i5;
                        i = ((iM3169 ^ i6) * 10927) ^ (-636760379);
                        i2 = 529523378;
                    } else {
                        iM3169 = C0619.m2761("ۛ᩶") ^ i6;
                        i = ((iM3169 ^ i5) * (-3009)) ^ 633551591;
                        i2 = -3132743;
                    }
                    int i11110 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i11110;
                    break;
                case -303943649:
                case 2095741681:
                    if (C4282.f15546 > 0) {
                        i15 = i15;
                        iM3169 = C0773.m3169("ۚ֡") ^ i6;
                        i = ((iM3169 ^ i5) * (-7923)) ^ (-971433316);
                        i2 = -902114144;
                        int i11111 = i15;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        i15 = i11111;
                    } else {
                        iM31610 = (C0619.m2761("ܰۗ") ^ i5) * (-125);
                        i3 = ((iM31610 ^ i6) * 28029) ^ 486847762;
                        i4 = 2032018386;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -283120624:
                case 1943313087:
                    strArr2[i15] = strM15607;
                    i15++;
                    iM31610 = (i5 - C0773.m3169("ۖܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i3 = ((iM31610 ^ i6) * 26099) ^ (-546236286);
                    i4 = -1200619276;
                    i8 = iM31610 ^ i4;
                    i7 = i3;
                    break;
                case -141364746:
                case 1042491531:
                    C0950.m3785();
                    return null;
                case -96651802:
                case 893296169:
                    strArrM45703 = c19841.m45703(strArr, str, str2);
                    strArr2 = strArrM45703;
                    iM3169 = (C0773.m3169("۟ۤ") ^ i5) * (-97);
                    i = ((iM3169 ^ i6) * (-15793)) ^ 1719522039;
                    i2 = 1701866640;
                    int i11112 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i11112;
                    break;
                case -96555296:
                case 2134823825:
                    i15 = i15;
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0773.m3169("ۤۛ") ^ i5) * 13;
                        i = ((iM3169 ^ i6) * (-27965)) ^ (-1825532780);
                        i2 = 634081683;
                    } else {
                        iM3169 = C0773.m3169("ۜܰ") ^ i5;
                        i = ((iM3169 ^ i6) * 32237) ^ 375427504;
                        i2 = 1563084108;
                    }
                    int i11113 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i11113;
                    break;
                case 210558512:
                case 2078721077:
                    i10 = 0;
                    iM3169 = C0619.m2761("ۖۘ") ^ i6;
                    i = ((iM3169 ^ i5) * 14721) ^ (-1341581277);
                    i2 = -1538748009;
                    int i11114 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i11114;
                    break;
                case 310174587:
                case 1672323262:
                    if (C3033.f9831 < 0) {
                        iM3169 = (C0773.m3169("ᩴۧ") ^ i6) * (-97);
                        i = ((iM3169 ^ i5) * 9911) ^ 276210027;
                        i2 = -1797895946;
                        int i11115 = i15;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        i15 = i11115;
                    } else {
                        iM31610 = (C0619.m2761("ܰۗ") ^ i5) * (-125);
                        i3 = ((iM31610 ^ i6) * 28029) ^ 486847762;
                        i4 = 2032018386;
                        i8 = iM31610 ^ i4;
                        i7 = i3;
                    }
                    break;
                case 966714205:
                case 1575163106:
                    return new String[i9];
                case 974139645:
                case 1580320872:
                    short[] sArr2 = f34468;
                    if (RunnableC3055.f9898 < 0) {
                        throw new RuntimeException(C2702.m8881(sArr2, 260, 59, i11));
                    }
                    iM3169 = (C0773.m3169("ᩴۧ") ^ i6) * (-97);
                    i = ((iM3169 ^ i5) * 9911) ^ 276210027;
                    i2 = -1797895946;
                    int i11116 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i11116;
                    break;
                case 1234597258:
                case 1651477633:
                    short[] sArr3 = f34468;
                    if (C3099.f10023 > 0) {
                        throw new NullPointerException(C0487.m2361(sArr3, 209, 51, i11));
                    }
                    iM3169 = (C0619.m2761("֫ۨ") + i5) * (-43);
                    i = ((iM3169 ^ i6) * 13591) ^ 731402191;
                    i2 = -1107262310;
                    int i11117 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i11117;
                    break;
                case 1336508992:
                case 1349776180:
                    short[] sArr4 = f34468;
                    if (C1542.f5343 > 0) {
                        throw new NullPointerException(C2354.m7981(i10, C2287.m7749(sArr4, 319, 68, i11)));
                    }
                    iM3169 = C0619.m2761("֫۟") ^ i6;
                    i = ((iM3169 ^ i5) * (-11597)) ^ (-1454098104);
                    i2 = 2069169707;
                    int i11118 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i11118;
                    break;
                case 1525664292:
                case 2051231909:
                    RunnableC3646.m11813();
                    iM31610 = (C0619.m2761("ܰۗ") ^ i5) * (-125);
                    i3 = ((iM31610 ^ i6) * 28029) ^ 486847762;
                    i4 = 2032018386;
                    i8 = iM31610 ^ i4;
                    i7 = i3;
                    break;
                case 1628869759:
                case 1938255142:
                    i15 = i15;
                    sArr = f34468;
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0773.m3169("ۤۛ") ^ i5) * 13;
                        i = ((iM3169 ^ i6) * (-27965)) ^ (-1825532780);
                        i2 = 634081683;
                    } else {
                        iM3169 = C0773.m3169("᩵ܰ") ^ i5;
                        i = ((iM3169 ^ i6) * 16299) ^ (-214021570);
                        i2 = 84499345;
                    }
                    int i11119 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i11119;
                    break;
                default:
                    strArrM45703 = batchTranslationEngine.batchTranslate(strArr, str, str2);
                    strArr2 = strArrM45703;
                    iM3169 = (C0773.m3169("۟ۤ") ^ i5) * (-97);
                    i = ((iM3169 ^ i6) * (-15793)) ^ 1719522039;
                    i2 = 1701866640;
                    int i111110 = i15;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    i15 = i111110;
                    break;
            }
        }
    }
}
