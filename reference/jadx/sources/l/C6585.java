package l;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S3XU */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6585 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22072;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22073;

    public /* synthetic */ C6585(int i, Object obj) {
        int i2 = 910398917;
        int i3 = C1519.f5300;
        int i4 = C3734.f12817;
        this.f22072 = i;
        this.f22073 = obj;
        int iM3169 = C0773.m3169("ᩴ᩺") ^ i3;
        int i5 = ((iM3169 ^ i4) * 17379) ^ 48388011;
        int i6 = 830625220;
        while (true) {
            i2 = (iM3169 ^ i6) ^ (i5 & (((i2 ^ i4) * 32265) >> 31));
            switch (i2) {
                case -1071538757:
                case 1698126486:
                    return;
                case -730723663:
                case 1630062988:
                    C2878.m9491();
                    iM3169 = C0619.m2761("ۡۨ") ^ i3;
                    i5 = ((iM3169 ^ i4) * 13779) ^ 1816029620;
                    i6 = -494184733;
                    break;
                case -722876565:
                case -638726658:
                    C3734.m12152();
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0619.m2761("ᩴۡ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-2527)) ^ (-411631370);
                        i6 = 1096941285;
                    } else {
                        iM3169 = C0773.m3169("᩺ܶ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-7923)) ^ 606127315;
                        i6 = 541583749;
                    }
                    break;
                case -285242499:
                case 1710812374:
                    if (C2878.f9462) {
                        iM3169 = C0619.m2761("ۜۜ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-1605)) ^ (-104083263);
                        i6 = -756275758;
                    } else {
                        iM3169 = (C0773.m3169("ۜۙ") + i4) * 89;
                        i5 = ((iM3169 ^ i3) * 25001) ^ 748150348;
                        i6 = -1240238512;
                    }
                    break;
                case -12959162:
                case 1398728615:
                    C1564.m5509();
                    if (!RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("ᩴۡ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-2527)) ^ (-411631370);
                        i6 = 1096941285;
                    } else {
                        iM3169 = C0619.m2761("ۡۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 13779) ^ 1816029620;
                        i6 = -494184733;
                    }
                    break;
                case 1039473403:
                case 1810599164:
                    C2966.m9664();
                    C3033.m9845();
                    throw new RuntimeException();
                default:
                    C2702.m8876();
                    if (C1542.m5459() < 0) {
                        iM3169 = C0619.m2761("ᩴۡ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-2527)) ^ (-411631370);
                        i6 = 1096941285;
                    } else {
                        iM3169 = C0619.m2761("ᩳ֨") ^ i4;
                        i5 = ((iM3169 ^ i3) * 5167) ^ 992436968;
                        i6 = 1106915399;
                    }
                    break;
            }
        }
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        C12550 c12550 = null;
        TonalPalette tonalPalette = null;
        int i = 1330428512;
        int i2 = C1564.f5401;
        int i3 = C4238.f15451;
        int iM3169 = (C0773.m3169("᩷֫") ^ i3) * 55;
        int i4 = ((iM3169 ^ i2) * 23395) ^ 1394390091;
        int i5 = 725577316;
        while (true) {
            i = ((((i ^ i2) * (-25099)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2041145928:
                case -1560304001:
                    if (C1321.m4852()) {
                        iM3169 = (C0619.m2761("᩹ۛ") + i2) * (-107);
                        i4 = ((iM3169 ^ i3) * 24901) ^ 1901662947;
                        i5 = -1455063302;
                    } else {
                        iM3169 = C0619.m2761("֫ܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17209) ^ 2027797287;
                        i5 = 1621726257;
                    }
                    break;
                case -1913287929:
                case 440320871:
                    C0487.m2356();
                    if (!C2354.m7983()) {
                        iM3169 = (i3 - C0619.m2761("ۚ۫")) * (-17);
                        i4 = ((iM3169 ^ i2) * (-19161)) ^ (-497790804);
                        i5 = -203181286;
                    } else {
                        iM3169 = C0773.m3169("۫۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28501) ^ (-1817614897);
                        i5 = -352264887;
                    }
                    break;
                case -1852317266:
                case -1521062137:
                    C0773.m3161();
                    C2287.m7745();
                    return null;
                case -1824437656:
                case -61885555:
                    c12550 = (C12550) this.f22073;
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0619.m2761("֫ܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17209) ^ 2027797287;
                        i5 = 1621726257;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۢ᩷")) * (-43);
                        i4 = ((iM3169 ^ i3) * (-21959)) ^ 782166596;
                        i5 = 1756694075;
                    }
                    break;
                case -1663727495:
                case -675628269:
                    C2023.m6964();
                    RunnableC3646.m11813();
                    iM3169 = C0773.m3169("۫۟") ^ i2;
                    i4 = ((iM3169 ^ i3) * 28501) ^ (-1817614897);
                    i5 = -352264887;
                    break;
                case -1613728242:
                case -181612533:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ܳۤ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i3) * (-6321)) ^ (-447238904);
                        i5 = 1758787115;
                    } else {
                        iM3169 = (C0773.m3169("ۤۤ") + i3) * 89;
                        i4 = ((iM3169 ^ i2) * (-22083)) ^ (-1468999729);
                        i5 = -1520953121;
                    }
                    break;
                case -1508671229:
                case 771765170:
                    C3690.m11987();
                    if (C0862.f3233 == 0) {
                        iM3169 = (i2 - C0619.m2761("ܳۤ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i3) * (-6321)) ^ (-447238904);
                        i5 = 1758787115;
                    } else {
                        iM3169 = C0619.m2761("۬᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2617) ^ (-6475508);
                        i5 = 1628272438;
                    }
                    break;
                case -1377968901:
                case 593031966:
                    if (C13473.f42873 != 0) {
                        iM3169 = (i3 - C0619.m2761("ۚ۫")) * (-17);
                        i4 = ((iM3169 ^ i2) * (-19161)) ^ (-497790804);
                        i5 = -203181286;
                    } else {
                        iM3169 = (C0619.m2761("۫ۨ") + i2) * (-105);
                        i4 = ((iM3169 ^ i3) * (-22349)) ^ (-1493592830);
                        i5 = -1226968145;
                    }
                    break;
                case -1011835631:
                case -69827171:
                    return DynamicColor.lambda$fromArgb$0(tonalPalette, (DynamicScheme) obj);
                case -854918525:
                case 655223297:
                    tonalPalette = (TonalPalette) this.f22073;
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("۫۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28501) ^ (-1817614897);
                        i5 = -352264887;
                    } else {
                        iM3169 = C0619.m2761("ᩳۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28787) ^ 1351562059;
                        i5 = 1298301555;
                    }
                    break;
                case -515726684:
                case 5641293:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (i2 - C0619.m2761("ܳۤ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i3) * (-6321)) ^ (-447238904);
                        i5 = 1758787115;
                    } else {
                        iM3169 = C0773.m3169("᩻᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-2577)) ^ 1730215978;
                        i5 = 694420604;
                    }
                    break;
                case -194045978:
                case 25448927:
                    switch (this.f22072) {
                        case 0:
                            iM3169 = (C0619.m2761("᩻᩻") ^ i3) * (-33);
                            i4 = ((iM3169 ^ i2) * 20249) ^ (-1708210847);
                            i5 = -1896679654;
                            break;
                        default:
                            iM3169 = (C0773.m3169("ۜ۟") + i2) * 73;
                            i4 = ((iM3169 ^ i3) * (-19909)) ^ 2133935031;
                            i5 = 948375269;
                            break;
                    }
                    break;
                case 28534128:
                case 1752151075:
                    if (C3779.f12953 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ܳۤ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i3) * (-6321)) ^ (-447238904);
                        i5 = 1758787115;
                    } else {
                        iM3169 = C0773.m3169("ۡ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7555)) ^ (-1625795640);
                        i5 = -1522412919;
                    }
                    break;
                case 334888983:
                case 1767367974:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("۫۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28501) ^ (-1817614897);
                        i5 = -352264887;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩵ۚ")) * (-89);
                        i4 = ((iM3169 ^ i3) * (-17731)) ^ (-843192510);
                        i5 = 997554213;
                    }
                    break;
                case 360496858:
                case 1495758247:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ۚ۫")) * (-17);
                        i4 = ((iM3169 ^ i2) * (-19161)) ^ (-497790804);
                        i5 = -203181286;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩷۬")) * (-105);
                        i4 = ((iM3169 ^ i3) * (-32743)) ^ (-401612790);
                        i5 = 1480942038;
                    }
                    break;
                case 980142085:
                case 1225860388:
                    if (C13473.f42873 == 0) {
                        iM3169 = C0619.m2761("۬᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2617) ^ (-6475508);
                        i5 = 1628272438;
                    } else {
                        iM3169 = C0773.m3169("۫۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28501) ^ (-1817614897);
                        i5 = -352264887;
                    }
                    break;
                case 1804787839:
                case 1925689804:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("۬᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2617) ^ (-6475508);
                        i5 = 1628272438;
                    } else {
                        iM3169 = C0773.m3169("᩸۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17217) ^ 510062318;
                        i5 = 820155362;
                    }
                    break;
                default:
                    return (C5061) c12550.invoke(obj);
            }
        }
    }
}
