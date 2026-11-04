package l;

import android.content.SharedPreferences;
import android.os.Process;
import java.util.UUID;
import java.util.function.Consumer;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 154F */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5797 implements Consumer {

    /* JADX INFO: renamed from: ۜܰۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f19917 = {1776, 8717, 8716, 8707, 8760};

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        int i4;
        String strM36172 = null;
        InterfaceC18752 interfaceC18752M11489 = null;
        String strM6952 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1689781639;
        int i10 = C20932.f66974;
        int i11 = C3099.f10023;
        int iM2763 = C0619.m2761("ᩳܳ") ^ i10;
        int i12 = ((iM2763 ^ i11) * (-3657)) ^ 1597861776;
        int i13 = iM2763 ^ 222268706;
        String strM6953 = null;
        while (true) {
            StringBuilder sb = null;
            while (true) {
                i9 = i13 ^ (i12 & (((i9 ^ i11) * (-19507)) >> 31));
                switch (i9) {
                    case -2067865710:
                    case -1540572551:
                        short[] sArr2 = f19917;
                        if (C1826.f6190 > 0) {
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                            String strM7803 = C2310.m7803(sArr2, 1, 4, i8);
                            if (C2966.f9654 < 0) {
                                StringBuilder sb2 = new StringBuilder(strM7803);
                                C3779.m12269(sb2, Process.myUid());
                                if (C23916.m53419() != 0) {
                                    sb = sb2;
                                    iM2761 = (C0619.m2761("ۗ᩻") + i10) * (-85);
                                    i = ((iM2761 ^ i11) * 15711) ^ 830246917;
                                    i2 = -269564043;
                                    i13 = iM2761 ^ i2;
                                    i12 = i;
                                } else {
                                    int iM3169 = (C0773.m3169("ۡ᩺") ^ i11) * 13;
                                    sb = sb2;
                                    i13 = iM3169 ^ 761308919;
                                    i12 = ((iM3169 ^ i10) * (-22629)) ^ (-288366322);
                                }
                                strM36172 = strM36172;
                                interfaceC18752M11489 = interfaceC18752M11489;
                            } else {
                                strM36172 = strM36172;
                                interfaceC18752M11489 = interfaceC18752M11489;
                                int iM31610 = (C0773.m3169("ᩴۜ") ^ i11) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                i13 = iM31610 ^ 1939675310;
                                i12 = ((iM31610 ^ i10) * 25249) ^ 379026828;
                            }
                        } else {
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                            int iM2764 = (C0619.m2761("ᩴ᩷") ^ i11) * (-21);
                            i13 = iM2764 ^ (-2090285154);
                            i12 = ((iM2764 ^ i10) * 14893) ^ 889653398;
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                        }
                        break;
                    case -2059807005:
                    case 1697901072:
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        if (i5 - (i6 + i7) <= 0) {
                            iM2761 = (i11 - C0773.m3169("ۙ֫")) * (-99);
                            i = ((iM2761 ^ i10) * (-13787)) ^ 1406074063;
                            i2 = 940785992;
                        } else {
                            iM2761 = C0619.m2761("ܽۗ") ^ i10;
                            i = ((iM2761 ^ i11) * 21473) ^ (-1968262524);
                            i2 = 1134434723;
                        }
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        break;
                    case -1848860122:
                    case -533846132:
                        i8 = 8807;
                        iM2761 = C0619.m2761("᩵᩸") ^ i11;
                        i = ((iM2761 ^ i10) * (-21143)) ^ (-2032686157);
                        i2 = -495896721;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        break;
                    case -1486401752:
                    case 643628406:
                        C1783.m6232();
                        if (C11235.f35427 >= 0) {
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                            int iM2765 = (C0619.m2761("ᩴ᩷") ^ i11) * (-21);
                            i13 = iM2765 ^ (-2090285154);
                            i12 = ((iM2765 ^ i10) * 14893) ^ 889653398;
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                        }
                        iM2762 = (C0773.m3169("ۤۖ") ^ i11) * (-17);
                        i3 = ((iM2762 ^ i10) * 17691) ^ 870283974;
                        i4 = 1994159515;
                        i13 = iM2762 ^ i4;
                        i12 = i3;
                        break;
                    case -1172274358:
                    case -809036455:
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        String str = (String) obj;
                        SharedPreferences sharedPreferences = ApplicationC17729.f58262;
                        if (str == null) {
                            iM2761 = (C0619.m2761("ۨۨ") ^ i10) * (-97);
                            i = ((iM2761 ^ i11) * 7783) ^ 714179204;
                            i2 = -2128797028;
                        } else {
                            strM6953 = str;
                            iM2761 = C0619.m2761("ۜۢ") ^ i10;
                            i = ((iM2761 ^ i11) * (-27611)) ^ 1285854810;
                            i2 = -662664709;
                        }
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        break;
                    case -1171622841:
                    case 1243280816:
                        if (C2419.f7754 >= 0) {
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                            iM2761 = (i10 - C0619.m2761("ۚۨ")) * 37;
                            i = ((iM2761 ^ i11) * 25709) ^ (-1310706998);
                            i2 = 1946171838;
                            i13 = iM2761 ^ i2;
                            i12 = i;
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                        } else {
                            iM2762 = (C0773.m3169("ۤۖ") ^ i11) * (-17);
                            i3 = ((iM2762 ^ i10) * 17691) ^ 870283974;
                            i4 = 1994159515;
                            i13 = iM2762 ^ i4;
                            i12 = i3;
                        }
                        break;
                    case -1121775624:
                    case 1363915460:
                        strM6952 = C2023.m6952(sb);
                        if (C2375.f7641 > 0) {
                            iM2762 = (C0619.m2761("۠ۚ") + i10) * (-69);
                            i3 = ((iM2762 ^ i11) * (-19381)) ^ 1378053534;
                            i4 = 464544892;
                            i13 = iM2762 ^ i4;
                            i12 = i3;
                        } else {
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                            int iM2766 = (C0619.m2761("ᩴ᩷") ^ i11) * (-21);
                            i13 = iM2766 ^ (-2090285154);
                            i12 = ((iM2766 ^ i10) * 14893) ^ 889653398;
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                        }
                        break;
                    case -1032492526:
                    case 670072455:
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        if (C2310.m7813() <= 0) {
                            iM2761 = (i10 - C0619.m2761("ۚۨ")) * 37;
                            i = ((iM2761 ^ i11) * 25709) ^ (-1310706998);
                            i2 = 1946171838;
                        } else {
                            iM2761 = (i11 - C0619.m2761("ۡܶ")) * 45;
                            i = ((iM2761 ^ i10) * (-10409)) ^ (-1181761116);
                            i2 = -1841519013;
                        }
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        break;
                    case -702455862:
                    case 341044902:
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        sArr = f19917;
                        if (C2310.m7813() > 0) {
                            iM2761 = C0619.m2761("ۗܳ") ^ i10;
                            i = ((iM2761 ^ i11) * 3469) ^ 1603664251;
                            i2 = 2032802463;
                            i13 = iM2761 ^ i2;
                            i12 = i;
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                        } else {
                            int iM2767 = (C0619.m2761("ᩴ᩷") ^ i11) * (-21);
                            i13 = iM2767 ^ (-2090285154);
                            i12 = ((iM2767 ^ i10) * 14893) ^ 889653398;
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                        }
                        break;
                    case -549034367:
                    case 1766995484:
                        i8 = 55953;
                        iM2761 = C0619.m2761("᩵᩸") ^ i11;
                        i = ((iM2761 ^ i10) * (-21143)) ^ (-2032686157);
                        i2 = -495896721;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        break;
                    case -451188952:
                    case 1236728327:
                        strM6953 = C2023.m6952(UUID.randomUUID());
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        iM2761 = C0619.m2761("ۜۢ") ^ i10;
                        i = ((iM2761 ^ i11) * (-27611)) ^ 1285854810;
                        i2 = -662664709;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        break;
                    case -341886283:
                    case 1109720073:
                        C2834.m9344();
                        break;
                    case -229860616:
                    case 949725339:
                        strM36172 = C15022.m36172(strM6953);
                        interfaceC18752M11489 = C3492.m11489(ApplicationC17729.f58258);
                        if (C0269.m1775() > 0) {
                            iM2762 = (i11 - C0619.m2761("ܺ֡")) * 39;
                            i3 = ((iM2762 ^ i10) * (-9249)) ^ (-1019371793);
                            i4 = -264244629;
                            i13 = iM2762 ^ i4;
                            i12 = i3;
                        } else {
                            int iM31611 = (C0773.m3169("ᩴۜ") ^ i11) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i13 = iM31611 ^ 1939675310;
                            i12 = ((iM31611 ^ i10) * 25249) ^ 379026828;
                        }
                        break;
                    case -16131606:
                    case 1366136463:
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        s = sArr[c];
                        s2 = 14760;
                        if (AbstractC3624.f12429 > 0) {
                            iM2761 = (C0619.m2761("᩺᩸") + i10) * (-59);
                            i = ((iM2761 ^ i11) * (-16629)) ^ (-2139528375);
                            i2 = 1250423906;
                            i13 = iM2761 ^ i2;
                            i12 = i;
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                        } else {
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                            int iM31612 = (C0773.m3169("ᩴۜ") ^ i11) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i13 = iM31612 ^ 1939675310;
                            i12 = ((iM31612 ^ i10) * 25249) ^ 379026828;
                        }
                        break;
                    case 584745415:
                    case 1754100333:
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        i5 = s * s2;
                        i6 = s * s;
                        i7 = 54464400;
                        if (!C1146.m4231()) {
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                            int iM31613 = (C0773.m3169("ᩴۜ") ^ i11) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i13 = iM31613 ^ 1939675310;
                            i12 = ((iM31613 ^ i10) * 25249) ^ 379026828;
                        } else {
                            iM2761 = (i10 - C0773.m3169("۟֨")) * (-113);
                            i = ((iM2761 ^ i11) * (-4659)) ^ (-696435831);
                            i2 = -1631201529;
                            i13 = iM2761 ^ i2;
                            i12 = i;
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                        }
                        break;
                    case 633990230:
                    case 1534685517:
                        if (C1080.f3865 < 0) {
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                            iM2761 = (C0619.m2761("ۗ᩻") + i10) * (-85);
                            i = ((iM2761 ^ i11) * 15711) ^ 830246917;
                            i2 = -269564043;
                            i13 = iM2761 ^ i2;
                            i12 = i;
                            strM36172 = strM36172;
                            interfaceC18752M11489 = interfaceC18752M11489;
                        } else {
                            iM2762 = (C0773.m3169("ۤۖ") ^ i11) * (-17);
                            i3 = ((iM2762 ^ i10) * 17691) ^ 870283974;
                            i4 = 1994159515;
                            i13 = iM2762 ^ i4;
                            i12 = i3;
                        }
                        break;
                    case 1059937006:
                    case 1407584550:
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        c = 0;
                        if (C0773.f2792 <= 0) {
                            iM2761 = (C0619.m2761("ۗ᩻") + i10) * (-85);
                            i = ((iM2761 ^ i11) * 15711) ^ 830246917;
                            i2 = -269564043;
                        } else {
                            iM2761 = C0773.m3169("ۤۡ") ^ i11;
                            i = ((iM2761 ^ i10) * 26697) ^ (-296649077);
                            i2 = -1487143151;
                        }
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        break;
                    case 1234094370:
                    case 1414995031:
                        C3998.m12920();
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        int iM2768 = (C0619.m2761("ᩴ᩷") ^ i11) * (-21);
                        i13 = iM2768 ^ (-2090285154);
                        i12 = ((iM2768 ^ i10) * 14893) ^ 889653398;
                        strM36172 = strM36172;
                        interfaceC18752M11489 = interfaceC18752M11489;
                        break;
                    default:
                        C11235.m28308(C3077.m10040(interfaceC18752M11489, strM6952, strM36172));
                        C2592.m8673(strM36172);
                        break;
                }
                return;
            }
        }
    }
}
