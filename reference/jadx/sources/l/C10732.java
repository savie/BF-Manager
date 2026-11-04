package l;

import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.storage.StorageVolume;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۤ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: UAQE */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10732 implements InterfaceC19795, InterfaceC1603 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ AudioDeviceInfo m27331(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ StorageVolume m27332(Object obj) {
        return (StorageVolume) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m27333(String str) {
        StringBuilder sb = new StringBuilder();
        C1783.m6234(sb, str);
        return sb;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ List m27334(Object[] objArr) {
        int iM3169;
        int i;
        int length = 0;
        int iM9136 = 0;
        int i2 = -745137507;
        int i3 = C1519.f5300;
        int i4 = C1146.f4234;
        int iM31610 = (C0773.m3169("֨ۚ") + i4) * (-63);
        int i5 = ((iM31610 ^ i3) * (-13871)) ^ (-2015678466);
        int i6 = -179461293;
        while (true) {
            int i7 = iM31610 ^ i6;
            ArrayList arrayList = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-23917)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1873099744:
                    case 685706583:
                        if (iM9136 < length) {
                            iM3169 = C0619.m2761("ܳ᩺") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-12043)) ^ (-1799536033);
                            i = 2143689518;
                        } else {
                            iM3169 = (C0773.m3169("֡ۨ") ^ i3) * 123;
                            i5 = ((iM3169 ^ i4) * (-2157)) ^ 568019125;
                            i = 627724979;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1165492714:
                    case -183635691:
                        C3099.m10095();
                        iM31610 = (C0773.m3169("ۧ֡") + i3) * (-29);
                        i5 = ((iM31610 ^ i4) * 30357) ^ 239473683;
                        i6 = 1501398329;
                        break;
                    case -1132877642:
                    case -809517941:
                        Object obj = objArr[iM9136];
                        iM9136 = C2764.m9136(obj, arrayList, obj, iM9136, 1);
                        iM3169 = C0773.m3169("᩺᩺") ^ i4;
                        i5 = ((iM3169 ^ i3) * 28283) ^ (-28826504);
                        i = 539022690;
                        i7 = iM3169 ^ i;
                        break;
                    case -1042187934:
                    case 1689822311:
                        if (C1146.f4234 < 0) {
                            if (C4282.f15546 > 0) {
                                if (C4282.f15546 > 0) {
                                    if (C20932.f66974 > 0) {
                                        if (C2419.f7754 < 0) {
                                            if (C4238.f15451 >= 0) {
                                                iM31610 = C0619.m2761("ܳۨ") ^ i3;
                                                i5 = ((iM31610 ^ i4) * (-14283)) ^ 2105179466;
                                                i6 = -1092452540;
                                                break;
                                            } else if (C3734.f12817 < 0) {
                                                if (RunnableC3055.f9898 < 0) {
                                                    if (C3998.f13671 == 0) {
                                                        int length2 = objArr.length;
                                                        if (C3779.f12953 > 0) {
                                                            arrayList = new ArrayList(length2);
                                                            length = objArr.length;
                                                            iM9136 = 0;
                                                            iM3169 = C0773.m3169("᩺᩺") ^ i4;
                                                            i5 = ((iM3169 ^ i3) * 28283) ^ (-28826504);
                                                            i = 539022690;
                                                            i7 = iM3169 ^ i;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    iM31610 = (C0773.m3169("ܳᩴ") + i4) * 33;
                                    i5 = ((iM31610 ^ i3) * 7379) ^ (-1696549096);
                                    i6 = -1366909798;
                                    break;
                                }
                                iM31610 = (i3 - C0773.m3169("ܰ֨")) * (-67);
                                i5 = ((iM31610 ^ i4) * (-18001)) ^ 74639963;
                                i6 = 178434203;
                                break;
                            }
                            iM31610 = C0773.m3169("ۢܿ") ^ i4;
                            i5 = ((iM31610 ^ i3) * (-209)) ^ 347325539;
                            i6 = 184450185;
                            break;
                        }
                        iM31610 = (C0773.m3169("ۧ֡") + i3) * (-29);
                        i5 = ((iM31610 ^ i4) * 30357) ^ 239473683;
                        i6 = 1501398329;
                        break;
                    case -850496779:
                    case 289656985:
                        if (!C1146.m4231()) {
                            iM31610 = C0773.m3169("ۢܿ") ^ i4;
                            i5 = ((iM31610 ^ i3) * (-209)) ^ 347325539;
                            i6 = 184450185;
                        } else {
                            iM31610 = C0619.m2761("ܳۨ") ^ i3;
                            i5 = ((iM31610 ^ i4) * (-14283)) ^ 2105179466;
                            i6 = -1092452540;
                        }
                        break;
                    case -399776208:
                    case 1156686843:
                        return C4681.unmodifiableList(arrayList);
                    case -135443118:
                    case 1357097052:
                        C3998.m12920();
                        return null;
                    case 1637615982:
                    case 2002052204:
                        C0950.m3785();
                        if (C2287.m7745() > 0) {
                            iM31610 = (i3 - C0773.m3169("ܰ֨")) * (-67);
                            i5 = ((iM31610 ^ i4) * (-18001)) ^ 74639963;
                            i6 = 178434203;
                        } else {
                            iM31610 = C0773.m3169("ۢܿ") ^ i4;
                            i5 = ((iM31610 ^ i3) * (-209)) ^ 347325539;
                            i6 = 184450185;
                        }
                        break;
                    default:
                        if (!C3077.f9998) {
                            iM31610 = (C0773.m3169("ۧ֡") + i3) * (-29);
                            i5 = ((iM31610 ^ i4) * 30357) ^ 239473683;
                            i6 = 1501398329;
                        } else {
                            iM31610 = C0773.m3169("ۢܿ") ^ i4;
                            i5 = ((iM31610 ^ i3) * (-209)) ^ 347325539;
                            i6 = 184450185;
                        }
                        break;
                }
            }
        }
    }

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC1603 mo5614() {
        return this;
    }

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC1603 mo5615(C3509 c3509) {
        return this;
    }

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC1603 mo5616(boolean z) {
        return this;
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        C17202.m40369((InterfaceC19992) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27335(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2) {
        int i = -1751732009;
        int i2 = C4282.f15546;
        int i3 = C2375.f7641;
        int iM2761 = C0619.m2761("۬ܿ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-2569)) ^ 1042366701;
        int i5 = -1849235454;
        while (true) {
            i = ((((i ^ i2) * (-26629)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1941336248:
                case -1716536335:
                    if (C1519.m5403()) {
                        iM2761 = C0619.m2761("ۚۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5883)) ^ (-1807354241);
                        i5 = -564129328;
                    } else {
                        iM2761 = (C0619.m2761("ۨ֡") + i3) * 27;
                        i4 = ((iM2761 ^ i2) * 5731) ^ 2122354112;
                        i5 = 244416462;
                    }
                    break;
                case -1900472477:
                case 1603813219:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("ۨ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * 13833) ^ (-327810138);
                        i5 = -1706927786;
                    } else {
                        iM2761 = C0773.m3169("֨ܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19649) ^ 1629849919;
                        i5 = 485356312;
                    }
                    break;
                case -1707027870:
                case -812650106:
                    C1783.m6234(sb, str);
                    configurableProvider.addAlgorithm(str2, C1080.m4058(sb));
                    break;
                case -1627708393:
                case 209656722:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (i2 - C0619.m2761("֨ۢ")) * (-67);
                        i4 = ((iM2761 ^ i3) * 25533) ^ 2060019931;
                        i5 = -1722294541;
                    } else {
                        iM2761 = C0619.m2761("᩶ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26701) ^ (-357927061);
                        i5 = -416585602;
                    }
                    break;
                case -1610874449:
                case 704572182:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0619.m2761("ۨ֡") + i3) * 27;
                        i4 = ((iM2761 ^ i2) * 5731) ^ 2122354112;
                        i5 = 244416462;
                    } else {
                        iM2761 = C0619.m2761("۟᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24633)) ^ (-1931628161);
                        i5 = 1859989657;
                    }
                    break;
                case -1484495023:
                case 1560390280:
                    if (C0487.m2356() < 0) {
                        iM2761 = (i2 - C0619.m2761("֨ۢ")) * (-67);
                        i4 = ((iM2761 ^ i3) * 25533) ^ 2060019931;
                        i5 = -1722294541;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۘܰ")) * (-73);
                        i4 = ((iM2761 ^ i2) * (-4471)) ^ 1303803240;
                        i5 = -1748780886;
                    }
                    break;
                case -1212118549:
                case 1211980147:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ۘܰ")) * (-73);
                        i4 = ((iM2761 ^ i2) * (-4471)) ^ 1303803240;
                        i5 = -1748780886;
                    } else {
                        iM2761 = (C0619.m2761("᩵᩹") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * (-16663)) ^ (-992810940);
                        i5 = -49458222;
                    }
                    break;
                case -1014240179:
                case 1168731492:
                    if (C2878.f9462) {
                        iM2761 = (C0619.m2761("ۨ֡") + i3) * 27;
                        i4 = ((iM2761 ^ i2) * 5731) ^ 2122354112;
                        i5 = 244416462;
                    } else {
                        iM2761 = C0773.m3169("ۢۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1253)) ^ (-125198012);
                        i5 = -1822168378;
                    }
                    break;
                case -922474119:
                case -268210084:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۘܰ")) * (-73);
                        i4 = ((iM2761 ^ i2) * (-4471)) ^ 1303803240;
                        i5 = -1748780886;
                    } else {
                        iM2761 = C0619.m2761("ۖ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-14099)) ^ (-292812270);
                        i5 = -803429624;
                    }
                    break;
                case -455656436:
                case -451370584:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (i2 - C0619.m2761("֨ۢ")) * (-67);
                        i4 = ((iM2761 ^ i3) * 25533) ^ 2060019931;
                        i5 = -1722294541;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۢۤ")) * (-13);
                        i4 = ((iM2761 ^ i2) * 2939) ^ (-476641319);
                        i5 = 960712227;
                    }
                    break;
                case -291750496:
                case 1646568189:
                    C0487.m2356();
                    if (C2310.f7472 < 0) {
                        iM2761 = (C0619.m2761("ۨ֡") + i3) * 27;
                        i4 = ((iM2761 ^ i2) * 5731) ^ 2122354112;
                        i5 = 244416462;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۘܰ")) * (-73);
                        i4 = ((iM2761 ^ i2) * (-4471)) ^ 1303803240;
                        i5 = -1748780886;
                    }
                    break;
                case -259864590:
                case 1748226538:
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0619.m2761("ۨ֡") + i3) * 27;
                        i4 = ((iM2761 ^ i2) * 5731) ^ 2122354112;
                        i5 = 244416462;
                    } else {
                        iM2761 = (C0773.m3169("᩺֨") ^ i2) * 35;
                        i4 = ((iM2761 ^ i3) * 20243) ^ 1857003969;
                        i5 = -1738701792;
                    }
                    break;
                case -188747139:
                case 459748467:
                    C2287.m7745();
                    C3690.m11987();
                    break;
                case -87853681:
                case 795133262:
                    if (C2834.m9344() >= 0) {
                        iM2761 = C0619.m2761("ۨ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * 13833) ^ (-327810138);
                        i5 = -1706927786;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩷᩻")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * (-29437)) ^ 1977427196;
                        i5 = 576748443;
                    }
                    break;
                case 752141971:
                case 1249796342:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("ۖ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-14099)) ^ (-292812270);
                        i5 = -803429624;
                    } else {
                        iM2761 = C0773.m3169("ᩳܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17131)) ^ 244399163;
                        i5 = 2023929025;
                    }
                    break;
                default:
                    RunnableC1848.m6360();
                    C4238.m13540();
                    iM2761 = C0619.m2761("ۖ᩶") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-14099)) ^ (-292812270);
                    i5 = -803429624;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC22486[] m27336() {
        int iM2761;
        int i;
        InterfaceC22486[] interfaceC22486Arr = null;
        int i2 = 863652765;
        int i3 = C2310.f7472;
        int i4 = RunnableC3055.f9898;
        int iM3169 = (i4 - C0773.m3169("ᩳܶ")) * (-67);
        int i5 = ((iM3169 ^ i3) * 9219) ^ (-1678080666);
        int i6 = 473828328;
        while (true) {
            int i7 = iM3169 ^ i6;
            C7370 c7370 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 1491) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2058347753:
                    case 660313897:
                        C4238.m13540();
                        AbstractC3624.m11755();
                        iM3169 = (C0773.m3169("۠ܳ") + i3) * 99;
                        i5 = ((iM3169 ^ i4) * 19085) ^ (-1903872685);
                        i6 = 2073587040;
                        break;
                    case -1484932747:
                    case 2062778719:
                        if (C2375.f7641 > 0) {
                            if (C0950.m3785() == 0) {
                                if (!C3779.m12264()) {
                                    iM3169 = C0619.m2761("֨ۛ") ^ i4;
                                    i5 = ((iM3169 ^ i3) * (-25901)) ^ (-1975033324);
                                    i6 = 1867274912;
                                } else {
                                    C1150 c1150 = new C1150(C25227.FOREVER_NS);
                                    if (AbstractC0641.f2496 < 0) {
                                        if (C3690.f12684 <= 0) {
                                            iM3169 = (C0773.m3169("۠ܳ") + i3) * 99;
                                            i5 = ((iM3169 ^ i4) * 19085) ^ (-1903872685);
                                            i6 = 2073587040;
                                            break;
                                        } else {
                                            C9103 c9103 = new C9103(24);
                                            if (C3779.m12264()) {
                                                if (C3492.f12043 > 0) {
                                                    InterfaceC1272 interfaceC1272 = InterfaceC1272.f4579;
                                                    if (!RunnableC3646.f12471) {
                                                        c7370 = new C7370(2, 1, interfaceC1272, c1150, c9103);
                                                        if (C3998.f13671 == 0) {
                                                            iM2761 = (C0619.m2761("ۜۡ") + i4) * (-73);
                                                            i5 = ((iM2761 ^ i3) * 13135) ^ 513377462;
                                                            i = -612522067;
                                                            i7 = iM2761 ^ i;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    iM3169 = C0619.m2761("ܶ֫") ^ i4;
                                    i5 = ((iM3169 ^ i3) * 30781) ^ (-910559027);
                                    i6 = -642894077;
                                }
                                break;
                            }
                            iM3169 = C0619.m2761("֡۠") ^ i4;
                            i5 = ((iM3169 ^ i3) * 14503) ^ 1298870214;
                            i6 = -1988015429;
                            break;
                        }
                        iM3169 = (i3 - C0619.m2761("֫ܽ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM3169 ^ i4) * 30713) ^ (-340302181);
                        i6 = 1897278760;
                        break;
                    case -1386575315:
                    case -246182174:
                        interfaceC22486Arr[0] = c7370;
                        return interfaceC22486Arr;
                    case -1368017535:
                    case 6545119:
                        if (!C1321.m4852()) {
                            iM3169 = (C0773.m3169("۠ܳ") + i3) * 99;
                            i5 = ((iM3169 ^ i4) * 19085) ^ (-1903872685);
                            i6 = 2073587040;
                        } else {
                            iM3169 = C0619.m2761("֨ۛ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-25901)) ^ (-1975033324);
                            i6 = 1867274912;
                        }
                        break;
                    case -435980862:
                    case 325466334:
                        interfaceC22486Arr = new InterfaceC22486[1];
                        if (C0269.f1558 > 0) {
                            iM2761 = (C0619.m2761("ۖ۟") ^ i3) * 91;
                            i5 = ((iM2761 ^ i4) * 24623) ^ (-604386109);
                            i = -716967726;
                            i7 = iM2761 ^ i;
                        } else {
                            iM3169 = C0619.m2761("֨ۛ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-25901)) ^ (-1975033324);
                            i6 = 1867274912;
                        }
                        break;
                    case 153825591:
                    case 867313074:
                        AbstractC3624.m11755();
                        if (C1321.f4751 < 0) {
                            iM3169 = (i3 - C0619.m2761("֫ܽ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i5 = ((iM3169 ^ i4) * 30713) ^ (-340302181);
                            i6 = 1897278760;
                        } else {
                            iM3169 = C0619.m2761("֨ۛ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-25901)) ^ (-1975033324);
                            i6 = 1867274912;
                        }
                        break;
                    case 1286620264:
                    case 1671235680:
                        if (C1826.f6190 <= 0) {
                            iM3169 = C0619.m2761("ܶ֫") ^ i4;
                            i5 = ((iM3169 ^ i3) * 30781) ^ (-910559027);
                            i6 = -642894077;
                        } else {
                            iM3169 = (C0773.m3169("۠ܳ") + i3) * 99;
                            i5 = ((iM3169 ^ i4) * 19085) ^ (-1903872685);
                            i6 = 2073587040;
                        }
                        break;
                    default:
                        RunnableC0334.m2063();
                        return null;
                }
            }
        }
    }

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC22486[] mo5617(Uri uri, Map map) {
        return m27336();
    }
}
