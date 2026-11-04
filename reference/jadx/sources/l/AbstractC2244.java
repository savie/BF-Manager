package l;

import bin.mt.plugin.api.PluginContext;
import java.io.IOException;
import java.io.InputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K3YT */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2244 implements InterfaceC13430 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract InputStream mo7662(String str);

    @Override // l.InterfaceC13430
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo7661(PluginContext pluginContext, String str) {
        InputStream inputStreamMo7662 = null;
        IOException e = null;
        int i = 1467430245;
        int i2 = RunnableC0334.f1808;
        int i3 = C3448.f11240;
        int iM2761 = (C0619.m2761("ۛ֡") ^ i2) * (-125);
        int i4 = ((iM2761 ^ i3) * (-31629)) ^ 1644615883;
        int i5 = -737945116;
        while (true) {
            i = ((((i ^ i3) * 5099) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2142544524:
                case -33402694:
                    C0862.m3503();
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("ۜ۬") + i2) * 5;
                        i4 = ((iM2761 ^ i3) * (-12521)) ^ 1823457457;
                        i5 = -314118379;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۧܳ")) * (-111);
                        i4 = ((iM2761 ^ i2) * 6847) ^ 773790681;
                        i5 = 1453709076;
                    }
                    break;
                case -2072336448:
                case 186873320:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0619.m2761("ۜ۬") + i2) * 5;
                        i4 = ((iM2761 ^ i3) * (-12521)) ^ 1823457457;
                        i5 = -314118379;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܰ᩺")) * 15;
                        i4 = ((iM2761 ^ i3) * (-27893)) ^ 61247488;
                        i5 = 828800916;
                    }
                    break;
                case -2021226092:
                case 860067276:
                    return inputStreamMo7662;
                case -1359672533:
                case -225015246:
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0619.m2761("ۜ۬") + i2) * 5;
                        i4 = ((iM2761 ^ i3) * (-12521)) ^ 1823457457;
                        i5 = -314118379;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۙ") + i2) * (-7);
                        i4 = ((iM2761 ^ i3) * 16161) ^ 1874644493;
                        i5 = 1881182693;
                    }
                    break;
                case -864919648:
                case 817318648:
                    C1519.m5403();
                    C3492.m11488();
                    return null;
                case -850700397:
                case 363406303:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("ܳ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28663) ^ (-427459285);
                        i5 = 607847690;
                    } else {
                        iM2761 = (C0773.m3169("᩸ܳ") ^ i3) * (-3);
                        i4 = ((iM2761 ^ i2) * (-25519)) ^ (-1528723666);
                        i5 = 936451954;
                    }
                    break;
                case -671716540:
                case -511529778:
                    if (C11235.f35427 >= 0) {
                        iM2761 = (i3 - C0773.m3169("ۧܳ")) * (-111);
                        i4 = ((iM2761 ^ i2) * 6847) ^ 773790681;
                        i5 = 1453709076;
                    } else {
                        iM2761 = C0773.m3169("ܳ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28663) ^ (-427459285);
                        i5 = 607847690;
                    }
                    break;
                case -646222763:
                case 168088334:
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("۠ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-8651)) ^ 1169577793;
                        i5 = 153386891;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܶۖ")) * (-11);
                        i4 = ((iM2761 ^ i3) * (-1451)) ^ 1021263928;
                        i5 = 1113553161;
                    }
                    break;
                case -590509508:
                case 516082958:
                    C13473.m33144();
                    if (C1783.f6087 > 0) {
                        iM2761 = C0619.m2761("۠ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-8651)) ^ 1169577793;
                        i5 = 153386891;
                    } else {
                        iM2761 = C0773.m3169("ܳ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28663) ^ (-427459285);
                        i5 = 607847690;
                    }
                    break;
                case -141952683:
                case 1478096782:
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0773.m3169("۬ۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4899) ^ (-657592696);
                        i5 = 1744977081;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۢ᩷")) * 9;
                        i4 = ((iM2761 ^ i2) * (-2783)) ^ (-436000127);
                        i5 = 2131460570;
                    }
                    break;
                case 125139759:
                case 1186422733:
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("۠ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-8651)) ^ 1169577793;
                        i5 = 153386891;
                    } else {
                        iM2761 = (C0619.m2761("ᩴ᩸") ^ i3) * (-47);
                        i4 = ((iM2761 ^ i2) * (-15875)) ^ (-899627646);
                        i5 = 1345935564;
                    }
                    break;
                case 391589215:
                case 1968990448:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("۬ۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4899) ^ (-657592696);
                        i5 = 1744977081;
                    } else {
                        iM2761 = C0773.m3169("ۙܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 11707) ^ 947084218;
                        i5 = -1697487877;
                    }
                    break;
                case 920928634:
                case 1922761770:
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0773.m3169("ܳ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28663) ^ (-427459285);
                        i5 = 607847690;
                    } else {
                        iM2761 = C0619.m2761("۟ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14965) ^ 1600849749;
                        i5 = 1201984679;
                    }
                    break;
                case 982970035:
                case 1894872539:
                    if (C2023.f6737) {
                        iM2761 = (i3 - C0773.m3169("ۧܳ")) * (-111);
                        i4 = ((iM2761 ^ i2) * 6847) ^ 773790681;
                        i5 = 1453709076;
                    } else {
                        iM2761 = C0619.m2761("᩺ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13049)) ^ (-1524141864);
                        i5 = -1312398602;
                    }
                    break;
                case 1016814271:
                case 1250257604:
                    C1321.m4852();
                    AbstractC0641.m2813();
                    iM2761 = C0773.m3169("ܳ۟") ^ i3;
                    i4 = ((iM2761 ^ i2) * 28663) ^ (-427459285);
                    i5 = 607847690;
                    break;
                case 1434759811:
                case 1609733716:
                    try {
                        inputStreamMo7662 = mo7662(str);
                        iM2761 = (i2 - C0773.m3169("᩶ۖ")) * 29;
                        i4 = ((iM2761 ^ i3) * (-1899)) ^ 644871745;
                        i5 = 622968607;
                    } catch (IOException e2) {
                        e = e2;
                        iM2761 = (C0773.m3169("ۜ᩻") + i3) * (-63);
                        i4 = ((iM2761 ^ i2) * (-24487)) ^ 1775956517;
                        i5 = 1648624910;
                    }
                    break;
                case 1914435164:
                case 2095547272:
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0619.m2761("ۜ۬") + i2) * 5;
                        i4 = ((iM2761 ^ i3) * (-12521)) ^ 1823457457;
                        i5 = -314118379;
                    } else {
                        iM2761 = (i3 - C0773.m3169("۠᩶")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * (-6493)) ^ 855183167;
                        i5 = 1356524157;
                    }
                    break;
                default:
                    pluginContext.log(e);
                    return null;
            }
        }
    }
}
