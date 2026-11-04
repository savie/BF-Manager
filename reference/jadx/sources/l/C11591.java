package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۧۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W78J */
/* JADX INFO: loaded from: classes3.dex */
public final class C11591 {

    /* JADX INFO: renamed from: ۚ֨֡, reason: not valid java name and contains not printable characters */
    private static final short[] f36388 = {7557, 30412, 30407, 30429, 30427, 30416, 30454, 30429, 30412, 30417, 30429, 30408, 30417, 30404, 30405, 30413, 30412, 30417, 30454, 30410, 30405, 30408, 30426, 30426, 30454, 30426, 30404, 30408, 30405, 30400, 30413, 30412, 30417, 30454, 30404, 30412, 30429, 30401, 30406, 30413, 30454, 30426, 30404, 30408, 30405, 30400, 30410, 30405, 30408, 30426, 30426, 30454, 30426, 30404, 30408, 30405, 30400, 30413, 30412, 30417, 30454, 30415, 30400, 30412, 30405, 30413, 30454, 30426, 30404, 30408, 30405, 30400, 30460, 30407, 30426, 30428, 30425, 30425, 30406, 30427, 30429, 30412, 30413, 30345, 30427, 30412, 30408, 30413, 30345, 30402, 30400, 30407, 30413, 30410, 30405, 30408, 30426, 30426, 30454, 30426, 30404, 30408, 30405, 30400, 30415, 30400, 30412, 30405, 30413, 30410, 30405, 30408, 30426, 30426, 30454, 30426, 30404, 30408, 30405, 30400};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18282 f36389;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15473 f36390;

    /* JADX WARN: Type inference failed for: r2v67, types: [bin.mt.json.JSONArray, bin.mt.json.JSONObject, bin.mt.json.JSONValue, java.lang.String] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7358 m29121(C14069 c14069, String str, C13828 c13828, C4156 c4156) throws C10186 {
        int iM3169;
        int i;
        Iterator it;
        String str2;
        int iM31610;
        int i2;
        int i3;
        C4574 c4574;
        String str3;
        String str4;
        String str5;
        String str6;
        int iM31611;
        int i4;
        int i5;
        String str7;
        int i6;
        int iM2761;
        int i7;
        int i8;
        int i9;
        C4574 c4575;
        String str8;
        int i10;
        int iM2762;
        int i11;
        int iM31612;
        int i12;
        int i13;
        int iM31613;
        int i14;
        c14069 = c14069;
        int i15 = 0;
        int i16 = 0;
        int i17 = -396777405;
        int i18 = C3734.f12817;
        int i19 = C20932.f66974;
        int iM2763 = C0619.m2761("۬֨") ^ i18;
        int i20 = ((iM2763 ^ i19) * (-29337)) ^ (-2131144494);
        int i21 = iM2763 ^ 579046178;
        String str9 = null;
        short[] sArr = null;
        int i22 = 0;
        int i23 = 0;
        String str10 = null;
        short s = 0;
        int i24 = 0;
        C4574 c4576 = null;
        C18282 c18282 = null;
        String str11 = null;
        C4574 c4577 = null;
        C4574 c4578 = null;
        Iterator it2 = null;
        String str12 = null;
        String str13 = null;
        C4574 c4574M50677 = null;
        String strM4319 = null;
        short[] sArr2 = null;
        while (true) {
            i17 = i21 ^ ((((i17 ^ i19) * 29301) >> 31) & i20);
            switch (i17) {
                case -2062547486:
                case 1066198729:
                    if (C2310.f7472 < 0) {
                        i9 = i22;
                        c4575 = c4577;
                        str8 = str12;
                        int iM31614 = (C0773.m3169("ۡ᩶") + i18) * (-109);
                        i20 = ((iM31614 ^ i19) * 23239) ^ (-963526482);
                        i21 = iM31614 ^ 200595586;
                        c14069 = c14069;
                        str12 = str8;
                        i22 = i9;
                        c4577 = c4575;
                    } else {
                        iM31613 = C0773.m3169("ܰۖ") ^ i18;
                        i20 = ((iM31613 ^ i19) * 22797) ^ (-842798874);
                        i14 = 202062558;
                        i21 = iM31613 ^ i14;
                    }
                    break;
                case -2045542689:
                case -1375935735:
                    return c18282.m42595(c14069, str, str9);
                case -1968300837:
                case 893872164:
                    i23 = 30377;
                    iM31610 = (C0773.m3169("ۙۙ") ^ i19) * 21;
                    i2 = ((iM31610 ^ i18) * (-13443)) ^ 487172065;
                    i3 = -879491942;
                    i21 = iM31610 ^ i3;
                    c14069 = c14069;
                    str10 = str10;
                    sArr = sArr;
                    i24 = i24;
                    str11 = str11;
                    str12 = str12;
                    c4577 = c4577;
                    str9 = str9;
                    i20 = i2;
                    i22 = i22;
                    break;
                case -1937427544:
                case -964251633:
                    C2834.m9344();
                    if (!RunnableC3646.f12471) {
                        iM31613 = C0619.m2761("᩹۠") ^ i18;
                        i20 = ((iM31613 ^ i19) * 6679) ^ (-1383284946);
                        i14 = -519583240;
                        i21 = iM31613 ^ i14;
                    } else {
                        str7 = str11;
                        i6 = i24;
                        iM2761 = (C0619.m2761("۟ۗ") ^ i19) * 41;
                        i7 = ((iM2761 ^ i18) * 14255) ^ 160159400;
                        i8 = -1800616581;
                        i21 = iM2761 ^ i8;
                        sArr = sArr;
                        i24 = i6;
                        str11 = str7;
                        s = s;
                        str12 = str12;
                        c4577 = c4577;
                        str9 = str9;
                        str10 = str10;
                        i22 = i22;
                        i20 = i7;
                    }
                    break;
                case -1927744429:
                case 1605924874:
                    str12 = str12;
                    if (C1826.m6317(it2)) {
                        iM3169 = (i19 - C0773.m3169("۬ۚ")) * 19;
                        i20 = ((iM3169 ^ i18) * 18605) ^ (-224489020);
                        i = -1315170015;
                    } else {
                        c4578 = c4576;
                        iM3169 = (i18 - C0619.m2761("᩷ܶ")) * 39;
                        i20 = ((iM3169 ^ i19) * 16979) ^ 908657036;
                        i = -1008554145;
                    }
                    i21 = iM3169 ^ i;
                    str12 = str12;
                    break;
                case -1816081576:
                case -1576209776:
                    throw C18723.m43540(c14069.f44556, str, str11);
                case -1780303590:
                case -460012923:
                    i22 = i22;
                    c4577 = c4577;
                    str12 = str12;
                    str9 = str9;
                    str10 = str10;
                    sArr = sArr;
                    str11 = str11;
                    i24 = i24;
                    s = f36388[0];
                    if (AbstractC0116.m1243() != 0) {
                        iM31610 = C0773.m3169("᩵۟") ^ i19;
                        i2 = ((iM31610 ^ i18) * 3485) ^ (-1050132683);
                        i3 = -1242904872;
                    } else {
                        iM31610 = C0773.m3169("۟᩸") ^ i18;
                        i2 = ((iM31610 ^ i19) * 10311) ^ 506444252;
                        i3 = 242998346;
                    }
                    i21 = iM31610 ^ i3;
                    c14069 = c14069;
                    str10 = str10;
                    sArr = sArr;
                    i24 = i24;
                    str11 = str11;
                    str12 = str12;
                    c4577 = c4577;
                    str9 = str9;
                    i20 = i2;
                    i22 = i22;
                    break;
                case -1765222481:
                case 1158728254:
                    String strM43110 = C1173.m4319(c18282.m42587(c14069, str, str11, c4156));
                    short[] sArr3 = f36388;
                    if (C2375.f7641 > 0) {
                        return new C7358(strM43110, C2375.m8069(sArr3, 46, 11, i23), false, null, null);
                    }
                    str7 = str11;
                    i6 = i24;
                    iM2761 = (C0619.m2761("۟ۗ") ^ i19) * 41;
                    i7 = ((iM2761 ^ i18) * 14255) ^ 160159400;
                    i8 = -1800616581;
                    i21 = iM2761 ^ i8;
                    sArr = sArr;
                    i24 = i6;
                    str11 = str7;
                    s = s;
                    str12 = str12;
                    c4577 = c4577;
                    str9 = str9;
                    str10 = str10;
                    i22 = i22;
                    i20 = i7;
                    break;
                    break;
                case -1726279231:
                case -578756107:
                    if (C0487.f2131 <= 0) {
                        str12 = str12;
                        iM3169 = C0773.m3169("ܿۗ") ^ i19;
                        i20 = ((iM3169 ^ i18) * (-18881)) ^ (-576896185);
                        i = -2139391605;
                        i21 = iM3169 ^ i;
                        str12 = str12;
                    } else {
                        iM31613 = C0619.m2761("᩹۠") ^ i18;
                        i20 = ((iM31613 ^ i19) * 6679) ^ (-1383284946);
                        i14 = -519583240;
                        i21 = iM31613 ^ i14;
                    }
                    break;
                case -1687421558:
                case 1072905845:
                    i22 = i22;
                    c4577 = c4577;
                    str12 = str12;
                    str9 = str9;
                    str10 = str10;
                    sArr = sArr;
                    str7 = str11;
                    i6 = i24;
                    s = s;
                    int i25 = s + 2179;
                    i15 = i25 * i25;
                    i16 = s * s;
                    if (!C1146.m4231()) {
                        int iM31615 = (i19 - C0773.m3169("᩷ܿ")) * 43;
                        short s2 = s;
                        i10 = ((iM31615 ^ i18) * (-31957)) ^ 838842825;
                        i21 = iM31615 ^ (-1429558019);
                        sArr = sArr;
                        i24 = i6;
                        str11 = str7;
                        s = s2;
                        str12 = str12;
                        c4577 = c4577;
                        str9 = str9;
                        str10 = str10;
                        i22 = i22;
                        i20 = i10;
                        c14069 = c14069;
                    } else {
                        s = s;
                        iM2761 = (i18 - C0619.m2761("ܰۧ")) * 57;
                        i7 = ((iM2761 ^ i19) * 6293) ^ 1451787714;
                        i8 = -1072122927;
                        i21 = iM2761 ^ i8;
                        sArr = sArr;
                        i24 = i6;
                        str11 = str7;
                        s = s;
                        str12 = str12;
                        c4577 = c4577;
                        str9 = str9;
                        str10 = str10;
                        i22 = i22;
                        i20 = i7;
                    }
                    break;
                case -1665242220:
                case -787706292:
                    str12 = str12;
                    c4577 = (C4574) C0950.m3796(it2);
                    sArr2 = f36388;
                    i22 = IShizukuService.Stub.TRANSACTION_isHidden;
                    if (AbstractC0116.m1243() == 0) {
                        iM3169 = (C0773.m3169("᩶۬") + i18) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i20 = ((iM3169 ^ i19) * (-24981)) ^ (-1110103546);
                        i = -1865248567;
                        i21 = iM3169 ^ i;
                        str12 = str12;
                    } else {
                        c4577 = c4577;
                        i22 = IShizukuService.Stub.TRANSACTION_isHidden;
                        str11 = str11;
                        i24 = i24;
                        iM31610 = C0773.m3169("᩵۟") ^ i19;
                        i2 = ((iM31610 ^ i18) * 3485) ^ (-1050132683);
                        i3 = -1242904872;
                        i21 = iM31610 ^ i3;
                        c14069 = c14069;
                        str10 = str10;
                        sArr = sArr;
                        i24 = i24;
                        str11 = str11;
                        str12 = str12;
                        c4577 = c4577;
                        str9 = str9;
                        i20 = i2;
                        i22 = i22;
                    }
                    break;
                case -1624951465:
                case 1548305020:
                    C4238.m13540();
                    if (RunnableC3055.f9898 >= 0) {
                        iM31613 = (C0619.m2761("ۛ۟") ^ i18) * (-119);
                        i20 = ((iM31613 ^ i19) * 22185) ^ 476490289;
                        i14 = 1772107249;
                        i21 = iM31613 ^ i14;
                    } else {
                        str12 = str12;
                        iM3169 = C0773.m3169("ܿۗ") ^ i19;
                        i20 = ((iM3169 ^ i18) * (-18881)) ^ (-576896185);
                        i = -2139391605;
                        i21 = iM3169 ^ i;
                        str12 = str12;
                    }
                    break;
                case -1484515623:
                case -795543179:
                    return c18282.m42611(c14069, str, str9);
                case -1430825354:
                case 689427085:
                    C1519.m5403();
                    iM31613 = C0619.m2761("᩹۠") ^ i18;
                    i20 = ((iM31613 ^ i19) * 6679) ^ (-1383284946);
                    i14 = -519583240;
                    i21 = iM31613 ^ i14;
                    break;
                case -1242922034:
                case -412069218:
                    str12 = str12;
                    if (!C3492.m11490(C1146.m4222(sArr2, i22, 5, i23), c4577.f16284)) {
                        it = it2;
                        str2 = str12;
                        int iM31616 = C0773.m3169("ܳ᩹") ^ i19;
                        i22 = i22;
                        i21 = iM31616 ^ 1970555177;
                        str12 = str2;
                        it2 = it;
                        i20 = ((iM31616 ^ i18) * (-30749)) ^ 2122733527;
                        i22 = i22;
                    } else {
                        iM3169 = (C0773.m3169("ۙۖ") ^ i19) * (-75);
                        i20 = ((iM3169 ^ i18) * (-17547)) ^ 1690394418;
                        i = -1517720961;
                        i21 = iM3169 ^ i;
                        str12 = str12;
                    }
                    break;
                case -1215063641:
                case -863535243:
                    i22 = i22;
                    c4577 = c4577;
                    str12 = str12;
                    str9 = str9;
                    str10 = str10;
                    s = s;
                    sArr = sArr;
                    str7 = str11;
                    i6 = i24;
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0619.m2761("۟ۗ") ^ i19) * 41;
                        i7 = ((iM2761 ^ i18) * 14255) ^ 160159400;
                        i8 = -1800616581;
                    } else {
                        iM2761 = C0619.m2761("ۨۙ") ^ i19;
                        i7 = ((iM2761 ^ i18) * (-11983)) ^ 1550599586;
                        i8 = -1087459986;
                    }
                    i21 = iM2761 ^ i8;
                    sArr = sArr;
                    i24 = i6;
                    str11 = str7;
                    s = s;
                    str12 = str12;
                    c4577 = c4577;
                    str9 = str9;
                    str10 = str10;
                    i22 = i22;
                    i20 = i7;
                    break;
                case -1193120404:
                case 1995687849:
                    str12 = str12;
                    if (c4578 != null) {
                        iM3169 = C0773.m3169("ᩴ۫") ^ i18;
                        i20 = ((iM3169 ^ i19) * (-3935)) ^ (-1816660504);
                        i = -1870965987;
                    } else {
                        iM3169 = (C0773.m3169("ᩳ֡") ^ i19) * (-79);
                        i20 = ((iM3169 ^ i18) * (-29587)) ^ 339670781;
                        i = -1925382578;
                    }
                    i21 = iM3169 ^ i;
                    str12 = str12;
                    break;
                case -1041845299:
                case 542796821:
                    i22 = i22;
                    c4577 = c4577;
                    str12 = str12;
                    str9 = str9;
                    str10 = str10;
                    String str14 = str11;
                    short[] sArr4 = sArr;
                    int i26 = i24;
                    boolean zM8175 = C2419.m8175(C23916.m53420(sArr4, i26, 10, i23), str10);
                    C18282 c18283 = this.f36389;
                    if (!zM8175) {
                        int iM2764 = (C0619.m2761("᩶ᩴ") + i19) * (-109);
                        i7 = ((iM2764 ^ i18) * (-7705)) ^ (-860335354);
                        i21 = iM2764 ^ 108199922;
                        sArr = sArr4;
                        i24 = i26;
                        str11 = str14;
                        c18282 = c18283;
                        str12 = str12;
                        c4577 = c4577;
                        str9 = str9;
                        str10 = str10;
                        i22 = i22;
                        i20 = i7;
                    } else {
                        int iM2765 = (i18 - C0619.m2761("᩺᩹")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i10 = ((iM2765 ^ i19) * 24615) ^ (-879644539);
                        i21 = iM2765 ^ (-1544177185);
                        sArr = sArr4;
                        i24 = i26;
                        str11 = str14;
                        c18282 = c18283;
                        str12 = str12;
                        c4577 = c4577;
                        str9 = str9;
                        str10 = str10;
                        i22 = i22;
                        i20 = i10;
                        c14069 = c14069;
                    }
                    break;
                case -1022040181:
                case 949367757:
                    i22 = i22;
                    c4574 = c4577;
                    str3 = str12;
                    str4 = str9;
                    str5 = str10;
                    str6 = str11;
                    if (C2419.m8175(C2966.m9670(f36388, 11, 4, i23), str5)) {
                        iM31611 = (i18 - C0619.m2761("ܺۗ")) * 33;
                        i4 = ((iM31611 ^ i19) * (-16725)) ^ 2145438245;
                        i5 = -1323328125;
                    } else {
                        iM31611 = C0773.m3169("۠ۙ") ^ i19;
                        i4 = ((iM31611 ^ i18) * 6843) ^ 753714551;
                        i5 = 1481120178;
                    }
                    i21 = iM31611 ^ i5;
                    str10 = str5;
                    i20 = i4;
                    str11 = str6;
                    str12 = str3;
                    c4577 = c4574;
                    str9 = str4;
                    i22 = i22;
                    break;
                case -950320464:
                case -175214765:
                    i9 = i22;
                    str8 = str12;
                    c4575 = c4577;
                    String str15 = str10;
                    c4576 = null;
                    if (C3492.m11490(C2702.m8881(f36388, 57, 15, i23), str15)) {
                        iM31612 = (i18 - C0773.m3169("ۡ۠")) * 69;
                        i12 = ((iM31612 ^ i19) * 8035) ^ (-1351350966);
                        i13 = -1030559570;
                    } else {
                        iM31612 = C0773.m3169("ۘ֨") ^ i19;
                        i12 = ((iM31612 ^ i18) * 20817) ^ 1996953424;
                        i13 = 920848834;
                    }
                    i21 = iM31612 ^ i13;
                    str10 = str15;
                    i20 = i12;
                    str12 = str8;
                    i22 = i9;
                    c4577 = c4575;
                    break;
                case -894120098:
                case 1921256142:
                    i22 = i22;
                    c4574 = c4577;
                    str3 = str12;
                    str4 = str9;
                    str5 = str10;
                    str6 = str11;
                    if (C3492.m11490(AbstractC0641.m2820(f36388, 15, 15, i23), str5)) {
                        iM31611 = C0619.m2761("֨۬") ^ i19;
                        i4 = ((iM31611 ^ i18) * 12623) ^ (-1590071143);
                        i5 = 1876735231;
                    } else {
                        iM31611 = (C0773.m3169("۠᩵") + i19) * (-53);
                        i4 = ((iM31611 ^ i18) * 7067) ^ (-1593304394);
                        i5 = 1254042500;
                    }
                    i21 = iM31611 ^ i5;
                    str10 = str5;
                    i20 = i4;
                    str11 = str6;
                    str12 = str3;
                    c4577 = c4574;
                    str9 = str4;
                    i22 = i22;
                    break;
                case -861849886:
                case 606546581:
                    str12 = str12;
                    int i27 = c4574M50677.f16278;
                    String strM4318 = C1173.m4318(i27, c4574M50677.f16279, strM4319);
                    if (C2310.f7472 < 0) {
                        Integer numM2764 = C0619.m2764(i27 - 1);
                        if (C2966.f9654 < 0) {
                            return new C7358(strM4318, C0269.m1785(f36388, 93, 11, i23), false, null, numM2764);
                        }
                        iM3169 = C0773.m3169("ܿۗ") ^ i19;
                        i20 = ((iM3169 ^ i18) * (-18881)) ^ (-576896185);
                        i = -2139391605;
                        i21 = iM3169 ^ i;
                        str12 = str12;
                    } else {
                        i22 = i22;
                        c4577 = c4577;
                        str11 = str11;
                        i24 = i24;
                        iM31610 = C0773.m3169("᩵۟") ^ i19;
                        i2 = ((iM31610 ^ i18) * 3485) ^ (-1050132683);
                        i3 = -1242904872;
                        i21 = iM31610 ^ i3;
                        c14069 = c14069;
                        str10 = str10;
                        sArr = sArr;
                        i24 = i24;
                        str11 = str11;
                        str12 = str12;
                        c4577 = c4577;
                        str9 = str9;
                        i20 = i2;
                        i22 = i22;
                    }
                    break;
                case -742447097:
                case -607111168:
                    if (!C3492.m11490(str12, c4577.f16280)) {
                        it = it2;
                        str2 = str12;
                        int iM31617 = C0773.m3169("ܳ᩹") ^ i19;
                        i22 = i22;
                        i21 = iM31617 ^ 1970555177;
                        str12 = str2;
                        it2 = it;
                        i20 = ((iM31617 ^ i18) * (-30749)) ^ 2122733527;
                        i22 = i22;
                    } else {
                        c4578 = c4577;
                        str12 = str12;
                        iM3169 = (i18 - C0619.m2761("᩷ܶ")) * 39;
                        i20 = ((iM3169 ^ i19) * 16979) ^ 908657036;
                        i = -1008554145;
                        i21 = iM3169 ^ i;
                        str12 = str12;
                    }
                    break;
                case -650287022:
                case 1156080597:
                    throw C18723.m43533(c14069.f44556, str, str11);
                case -601496652:
                case 2010809669:
                    if (C0487.f2131 > 0) {
                        str12 = str12;
                        str7 = str11;
                        i6 = i24;
                        int iM31618 = (i19 - C0773.m3169("᩷ܿ")) * 43;
                        short s3 = s;
                        i10 = ((iM31618 ^ i18) * (-31957)) ^ 838842825;
                        i21 = iM31618 ^ (-1429558019);
                        sArr = sArr;
                        i24 = i6;
                        str11 = str7;
                        s = s3;
                        str12 = str12;
                        c4577 = c4577;
                        str9 = str9;
                        str10 = str10;
                        i22 = i22;
                        i20 = i10;
                        c14069 = c14069;
                    } else {
                        iM31613 = C0619.m2761("᩹۠") ^ i18;
                        i20 = ((iM31613 ^ i19) * 6679) ^ (-1383284946);
                        i14 = -519583240;
                        i21 = iM31613 ^ i14;
                    }
                    break;
                case -427277702:
                case 1389351040:
                    i22 = i22;
                    String str16 = str12;
                    c4576 = c4576;
                    strM4319 = C1173.m4319(c18282.m42587(c14069, str, str11, c4156));
                    c4574M50677 = C22474.m50676(str11, strM4319).m50677(c13828.f43894);
                    if (c4574M50677 != null) {
                        int iM2766 = (C0619.m2761("۠ۧ") ^ i18) * 115;
                        i21 = iM2766 ^ (-769703473);
                        i20 = ((iM2766 ^ i19) * (-26751)) ^ (-392822744);
                    } else {
                        int iM2767 = (i19 - C0619.m2761("֡۠")) * 127;
                        i20 = ((iM2767 ^ i18) * 31123) ^ (-1395089647);
                        i21 = iM2767 ^ (-1459768190);
                    }
                    str12 = str16;
                    i22 = i22;
                    break;
                case -273347791:
                case 1775749402:
                    int i28 = i22;
                    C4574 c4579 = c4577;
                    String str17 = str12;
                    String str18 = str10;
                    if (C2419.m8175(AbstractC0116.m1236(f36388, 30, 16, i23), str18)) {
                        iM2762 = (C0773.m3169("᩷ᩳ") ^ i18) * (-97);
                        i7 = ((iM2762 ^ i19) * (-31483)) ^ 747478732;
                        i11 = -783054533;
                    } else {
                        iM2762 = (C0619.m2761("ܰۚ") ^ i18) * 33;
                        i7 = ((iM2762 ^ i19) * 30139) ^ 679126353;
                        i11 = -1029971424;
                    }
                    i21 = iM2762 ^ i11;
                    str10 = str18;
                    str12 = str17;
                    i22 = i28;
                    c4577 = c4579;
                    i20 = i7;
                    break;
                case -270628052:
                case 1004368595:
                    String strM43111 = C1173.m4319(c18282.m42587(c14069, str, str11, c4156));
                    C22474 c22474M50676 = C22474.m50676(str11, strM43111);
                    str2 = c13828.f43892;
                    Iterator itM13647 = C4282.m13647(c22474M50676.f72713);
                    str13 = strM43111;
                    it = itM13647;
                    int iM31619 = C0773.m3169("ܳ᩹") ^ i19;
                    i22 = i22;
                    i21 = iM31619 ^ 1970555177;
                    str12 = str2;
                    it2 = it;
                    i20 = ((iM31619 ^ i18) * (-30749)) ^ 2122733527;
                    i22 = i22;
                    break;
                case -105050494:
                case 1227462675:
                    i9 = i22;
                    c4575 = c4577;
                    str8 = str12;
                    String str19 = c13828.f43896;
                    String str20 = c13828.f43895;
                    str11 = c13828.f43891;
                    sArr = f36388;
                    i24 = 1;
                    if (C1519.f5300 < 0) {
                        int iM31620 = C0773.m3169("ܳܶ") ^ i18;
                        i20 = ((iM31620 ^ i19) * (-26231)) ^ 793839119;
                        i21 = iM31620 ^ 1425447703;
                        str10 = str19;
                        str9 = str20;
                        str12 = str8;
                        i22 = i9;
                        c4577 = c4575;
                        c14069 = c14069;
                    } else {
                        str10 = str19;
                        str9 = str20;
                        int iM316110 = (C0773.m3169("ۡ᩶") + i18) * (-109);
                        i20 = ((iM316110 ^ i19) * 23239) ^ (-963526482);
                        i21 = iM316110 ^ 200595586;
                        c14069 = c14069;
                        str12 = str8;
                        i22 = i9;
                        c4577 = c4575;
                    }
                    break;
                case -59925940:
                case 8449401:
                    i23 = 29075;
                    iM31610 = (C0773.m3169("ۙۙ") ^ i19) * 21;
                    i2 = ((iM31610 ^ i18) * (-13443)) ^ 487172065;
                    i3 = -879491942;
                    i21 = iM31610 ^ i3;
                    c14069 = c14069;
                    str10 = str10;
                    sArr = sArr;
                    i24 = i24;
                    str11 = str11;
                    str12 = str12;
                    c4577 = c4577;
                    str9 = str9;
                    i20 = i2;
                    i22 = i22;
                    break;
                case -57374101:
                case 472848535:
                    ?? r2 = c4576;
                    throw C10186.m26301(C1519.m5399(f36388, 72, 21, i23), (String) r2, (JSONValue) r2, (JSONArray) r2, (JSONObject) r2);
                case -52366894:
                case 1308875934:
                    C20932.m47848();
                    if (C1146.f4234 < 0) {
                        iM31613 = C0619.m2761("᩹۠") ^ i18;
                        i20 = ((iM31613 ^ i19) * 6679) ^ (-1383284946);
                        i14 = -519583240;
                    } else {
                        iM31613 = C0773.m3169("ܰۖ") ^ i18;
                        i20 = ((iM31613 ^ i19) * 22797) ^ (-842798874);
                        i14 = 202062558;
                    }
                    i21 = iM31613 ^ i14;
                    break;
                case 90744659:
                case 558356752:
                    int i29 = c4578.f16278;
                    str12 = str12;
                    String strM43112 = C1173.m4318(i29, c4578.f16279, str13);
                    if (AbstractC3624.m11755() == 0) {
                        Integer numM2765 = C0619.m2764(i29 - 1);
                        if (AbstractC0641.f2496 < 0) {
                            return new C7358(strM43112, C1080.m4056(f36388, 109, 11, i23), false, null, numM2765);
                        }
                        i22 = i22;
                        c4577 = c4577;
                        str11 = str11;
                        i24 = i24;
                        iM31610 = C0773.m3169("᩵۟") ^ i19;
                        i2 = ((iM31610 ^ i18) * 3485) ^ (-1050132683);
                        i3 = -1242904872;
                        i21 = iM31610 ^ i3;
                        c14069 = c14069;
                        str10 = str10;
                        sArr = sArr;
                        i24 = i24;
                        str11 = str11;
                        str12 = str12;
                        c4577 = c4577;
                        str9 = str9;
                        i20 = i2;
                        i22 = i22;
                    } else {
                        str7 = str11;
                        i6 = i24;
                        int iM316111 = (i19 - C0773.m3169("᩷ܿ")) * 43;
                        short s4 = s;
                        i10 = ((iM316111 ^ i18) * (-31957)) ^ 838842825;
                        i21 = iM316111 ^ (-1429558019);
                        sArr = sArr;
                        i24 = i6;
                        str11 = str7;
                        s = s4;
                        str12 = str12;
                        c4577 = c4577;
                        str9 = str9;
                        str10 = str10;
                        i22 = i22;
                        i20 = i10;
                        c14069 = c14069;
                    }
                    break;
                case 818612773:
                case 1947483334:
                    C3734.m12152();
                    C0773.m3161();
                    return null;
                default:
                    i22 = i22;
                    c4577 = c4577;
                    str12 = str12;
                    str9 = str9;
                    str10 = str10;
                    sArr = sArr;
                    str11 = str11;
                    i24 = i24;
                    int i30 = i16 + 4748041;
                    if ((i30 + i30) - i15 >= 0) {
                        iM31610 = (C0619.m2761("֡ܿ") + i19) * 15;
                        i2 = ((iM31610 ^ i18) * 11857) ^ (-1513080469);
                        i3 = 144996662;
                    } else {
                        iM31610 = (i18 - C0773.m3169("ۚܰ")) * (-27);
                        i2 = ((iM31610 ^ i19) * (-28443)) ^ (-509500281);
                        i3 = 1204926006;
                    }
                    i21 = iM31610 ^ i3;
                    c14069 = c14069;
                    str10 = str10;
                    sArr = sArr;
                    i24 = i24;
                    str11 = str11;
                    str12 = str12;
                    c4577 = c4577;
                    str9 = str9;
                    i20 = i2;
                    i22 = i22;
                    break;
            }
        }
    }

    public C11591(C18282 c18282, C15473 c15473) {
        this.f36389 = c18282;
        this.f36390 = c15473;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6943 m29126(C14069 c14069, C2642 c2642) throws C10186 {
        String str = c2642.f8440;
        C13828 c13828 = c2642.f8450;
        C7972 c7972M37042 = this.f36390.m37042(c14069, this.f36389, str);
        String str2 = c14069.f44556;
        try {
            if (c7972M37042.m21754(c13828.f43893, m29120(c14069, str)) == null) {
                throw C18723.m43539(str2, str);
            }
            c7972M37042.m21756();
            return new C6943();
        } catch (C10186 e) {
            if (C18282.m42583(str)) {
                C15473.m37035(c14069, e);
            }
            if (!"INVALID_ARGUMENT".equals(e.f32601)) {
                throw e;
            }
            JSONObject jSONObject = e.f32602;
            if (!"variant".equals(jSONObject.getString("argument", null)) || jSONObject.getJSONArray("availableVariants") == null) {
                throw e;
            }
            JSONObject jSONObjectAdd = C22121.m50076("workspaceId", str2, "editSessionId", str).add("reads", JSON.array().add(JSON.object().add("locator", C4375.m13906("resource", (String) null, (String) null, (String) null, (String) null, c13828.f43893)).add("variant", "default"))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0);
            JSONArray jSONArray = new JSONArray(e.f32599);
            jSONArray.add(C2729.m9064(jSONObjectAdd, "mt_apk_resource_read", "retry", "Retry reading the same resource with batch resource_read arguments"));
            throw e.m26307(jSONArray);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9179 m29123(C14069 c14069, C7117 c7117) throws C10186 {
        String str;
        C7117 c7118 = c7117;
        String str2 = c7118.f23457;
        C7972 c7972M37042 = this.f36390.m37042(c14069, this.f36389, str2);
        HashSet hashSetM29120 = m29120(c14069, str2);
        ArrayList arrayList = c7118.f23463;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i < arrayList.size()) {
            try {
                C8608 c8608 = (C8608) arrayList.get(i);
                String str3 = c8608.f28107;
                String str4 = c8608.f28107;
                int i2 = i;
                ArrayList arrayList3 = arrayList;
                str = str2;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                try {
                    C16921 c16921M21753 = c7972M37042.m21753(str3, c8608.f28108, c7118.f23460, c7118.f23458, c7118.f23462, c7118.f23461, hashSetM29120);
                    if (c16921M21753 != null) {
                        ArrayList arrayList4 = c16921M21753.f55312;
                        if (!linkedHashMap2.containsKey(str3)) {
                            linkedHashMap2.put(str3, new C13654(str3, c16921M21753.f55311));
                        }
                        if (arrayList4.isEmpty()) {
                            arrayList2.add(new C0977(i2, str4, c8608.f28108, "RESOURCE_VARIANT_NOT_FOUND", "Resource variant not found.", c16921M21753.f55313, null));
                        } else {
                            C3497 c3497 = (C3497) arrayList4.get(0);
                            arrayList2.add(new C0977(i2, str4, c3497.f12055, null, null, c16921M21753.f55313, c3497));
                        }
                    } else {
                        arrayList2.add(new C0977(i2, str4, c8608.f28108, "RESOURCE_NOT_FOUND", "Resource not found.", null, null));
                    }
                    i = i2 + 1;
                    c7118 = c7117;
                    linkedHashMap = linkedHashMap2;
                    arrayList = arrayList3;
                    str2 = str;
                } catch (C10186 e) {
                    e = e;
                    if (C18282.m42583(str)) {
                        C15473.m37035(c14069, e);
                    }
                    throw e;
                }
            } catch (C10186 e2) {
                e = e2;
                str = str2;
            }
        }
        return new C9179(c14069.f44556, c7972M37042.m21756(), new ArrayList(linkedHashMap.values()), arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private HashSet m29120(C14069 c14069, String str) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f36389.m42605(c14069, str).iterator();
        while (it.hasNext()) {
            hashSet.add(((C19291) it.next()).f62362);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13434 m29124(C14069 c14069, C2642 c2642, C4156 c4156) throws C10186 {
        String str = c2642.f8440;
        String str2 = c2642.f8447;
        C13828 c13828 = c2642.f8450;
        C7358 c7358M29121 = m29121(c14069, str, c13828, c4156);
        try {
            return new C13434(c14069.f44556, c13828, c7358M29121.f24203, C18282.m42535(c7358M29121.f24201), C1173.m4320(c7358M29121.f24201, c2642.f8441, c2642.f8449, c2642.f8444, c2642.f8443), c7358M29121.f24204, c7358M29121.f24202, c2642.f8444, c2642.f8443, c7358M29121.f24200);
        } catch (C10186 e) {
            if (!"INVALID_ARGUMENT".equals(e.f32601) || !"lineCharOffset".equals(e.f32602.getString("argument", null))) {
                throw e;
            }
            JSONValue jSONValue = c2642.f8445;
            if (str2 == null) {
                throw e;
            }
            if ("startColumn".equals(str2)) {
                throw C10186.m26301("Invalid startColumn", "startColumn", jSONValue, JSON.array(0, Integer.MAX_VALUE), JSON.object().add("startColumn", 0));
            }
            if ("nextCursor".equals(str2)) {
                throw C10186.m26301("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24098 m29125(C14069 c14069, C2642 c2642) throws Throwable {
        C22941 c22941;
        Throwable th;
        InputStream inputStream;
        Throwable th2;
        C10823 c10823M42609;
        String str = c14069.f44556;
        C13828 c13828 = c2642.f8450;
        int i = c2642.f8442;
        String str2 = c2642.f8440;
        String str3 = c13828.f43895;
        int i2 = c2642.f8439;
        if (!"entry_text".equals(c13828.f43896)) {
            throw C10186.m26301("Byte reads are valid only for zip_entry locators", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        boolean zEquals = "resources.arsc".equals(str3);
        C18282 c18282 = this.f36389;
        if (zEquals && (c10823M42609 = c18282.m42609(c14069, str2)) != null) {
            return m29122(str, c2642, c10823M42609.f34305);
        }
        C22758 c22758M42616 = c18282.m42616(c14069, str2, str3);
        boolean z = false;
        if (c22758M42616 != null) {
            String str4 = c14069.f44556;
            AbstractC22044 abstractC22044 = c22758M42616.f73832;
            long jMo4285 = abstractC22044.mo4285();
            int i3 = c2642.f8442;
            long j = i3;
            if (j >= jMo4285) {
                return new C24098(str4, c13828, new byte[0], i3, c2642.f8439, jMo4285, i3, false);
            }
            int iMin = (int) Math.min(i2, jMo4285 - j);
            byte[] bArr = new byte[iMin];
            try {
                C13961 c13961M49855 = abstractC22044.m49855("r");
                try {
                    c13961M49855.seek(i);
                    c13961M49855.readFully(bArr, 0, iMin);
                    c13961M49855.close();
                    int i4 = c2642.f8442;
                    long j2 = ((long) i4) + ((long) iMin);
                    if (j2 < jMo4285 && j2 <= 2147483647L) {
                        z = true;
                    }
                    return new C24098(str4, c13828, bArr, i4, c2642.f8439, jMo4285, (int) Math.min(j2, 2147483647L), z);
                } catch (Throwable th3) {
                    try {
                        c13961M49855.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException | RuntimeException unused) {
                throw C10186.m26305("ENTRY_READ_FAILED", "Failed to read entry overlay.");
            }
        }
        C10823 c10823M42606 = c18282.m42606(c14069, str2, str3);
        if (c10823M42606 != null) {
            return m29122(str, c2642, c10823M42606.f34305);
        }
        try {
            C22941 c22942 = new C22941(c14069.m34234());
            try {
                C8002 entry = c22942.getEntry(str3);
                try {
                    if (entry == null) {
                        throw C10186.m26300("ENTRY_NOT_FOUND", "ZIP entry not found");
                    }
                    if (!entry.isDirectory()) {
                        long size = entry.getSize();
                        if (size >= 0) {
                            try {
                                int i5 = c2642.f8442;
                                if (i5 >= size) {
                                    C24098 c24098 = new C24098(c14069.f44556, c13828, new byte[0], i5, c2642.f8439, size, i5, false);
                                    c22942.close();
                                    return c24098;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c22941 = c22942;
                                try {
                                    c22941.close();
                                    throw th;
                                } catch (Throwable th6) {
                                    th.addSuppressed(th6);
                                    throw th;
                                }
                            }
                        }
                        int i6 = size >= 0 ? i2 : i2 + 1;
                        InputStream inputStreamM51727 = c22942.m51727(entry);
                        try {
                            try {
                                C5125.m15502(i, inputStreamM51727);
                                int i7 = 8192;
                                C9982 c9982 = new C9982(Math.min(i6, 8192));
                                byte[] bArr2 = new byte[8192];
                                while (i6 > 0) {
                                    int i8 = inputStreamM51727.read(bArr2, 0, Math.min(i7, i6));
                                    if (i8 == -1) {
                                        break;
                                    }
                                    c9982.write(bArr2, 0, i8);
                                    i6 -= i8;
                                    i7 = 8192;
                                }
                                byte[] bArrCopyOf = c9982.f32079;
                                int length = bArrCopyOf.length;
                                int i9 = c9982.f32081;
                                if (length != i9) {
                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i9);
                                }
                                inputStreamM51727.close();
                                boolean z2 = size < 0 && bArrCopyOf.length > i2;
                                if (z2) {
                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
                                }
                                byte[] bArr3 = bArrCopyOf;
                                int i10 = c2642.f8442;
                                long length2 = ((long) i10) + ((long) bArr3.length);
                                if (size >= 0) {
                                    z2 = length2 < size;
                                }
                                C24098 c24099 = new C24098(c14069.f44556, c13828, bArr3, i10, c2642.f8439, size, (int) Math.min(length2, 2147483647L), (!z2 || length2 <= 2147483647L) ? z2 : false);
                                c22942.close();
                                return c24099;
                            } catch (Throwable th7) {
                                c22941 = c22942;
                                th2 = th7;
                                inputStream = inputStreamM51727;
                                try {
                                    inputStream.close();
                                    throw th2;
                                } catch (Throwable th8) {
                                    th2.addSuppressed(th8);
                                    throw th2;
                                }
                            }
                        } catch (EOFException unused2) {
                            c22941 = c22942;
                            try {
                                String str5 = c14069.f44556;
                                byte[] bArr4 = new byte[0];
                                int i11 = c2642.f8442;
                                inputStream = inputStreamM51727;
                                try {
                                    C24098 c240910 = new C24098(str5, c13828, bArr4, i11, c2642.f8439, size, i11, false);
                                    inputStream.close();
                                    c22941.close();
                                    return c240910;
                                } catch (Throwable th9) {
                                    th = th9;
                                    th2 = th;
                                    inputStream.close();
                                    throw th2;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                inputStream = inputStreamM51727;
                            }
                        }
                    } else {
                        throw C10186.m26305("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                    }
                } catch (Throwable th11) {
                    th = th11;
                    th = th;
                    c22941.close();
                    throw th;
                }
            } catch (Throwable th12) {
                th = th12;
                c22941 = c22942;
            }
        } catch (C10186 e) {
            throw e;
        } catch (Exception e2) {
            throw C10186.m26305("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24098 m29122(String str, C2642 c2642, byte[] bArr) {
        C13828 c13828 = c2642.f8450;
        int i = c2642.f8442;
        if (i >= bArr.length) {
            return new C24098(str, c13828, new byte[0], i, c2642.f8439, bArr.length, i, false);
        }
        int iMin = Math.min(c2642.f8439, bArr.length - i);
        int i2 = c2642.f8442;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i2 + iMin);
        int i3 = c2642.f8442;
        int i4 = i3 + iMin;
        return new C24098(str, c13828, bArrCopyOfRange, i3, c2642.f8439, bArr.length, i4, i4 < bArr.length);
    }
}
