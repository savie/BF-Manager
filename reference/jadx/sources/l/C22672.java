package l;

import java.util.HashMap;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩸۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R98C */
/* JADX INFO: loaded from: classes.dex */
public final class C22672 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f73636;

    /* JADX INFO: renamed from: ۬ܽۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f73637 = {6918, -16439, -16433, -16437, -16418, -16436, -16432, -16433, -16428, -16436, -16421, 7950, -3478, -3474, -3461, -3479, -3467, -3478, -3471, -3479, -3476, -3458};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m51151(String str, C10737 c10737) {
        try {
            if (c10737 == null) {
                if (f73636.remove(str) != null) {
                    m51150();
                }
            } else if (!C3492.m11490(c10737, C1519.m5396(f73636, str, c10737))) {
                m51150();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10737 m51149(String str) {
        Object objM7814 = null;
        int i = 1204899621;
        int i2 = C4282.f15546;
        int i3 = C2834.f9334;
        int iM2761 = C0619.m2761("ۗۜ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-1843)) ^ 1761575626;
        int i5 = -1975674703;
        while (true) {
            i = ((((i ^ i2) * (-2255)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2073437126:
                case 1189426887:
                    objM7814 = C2310.m7814(f73636, str);
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (i2 - C0619.m2761("֡֫")) * (-43);
                        i4 = ((iM2761 ^ i3) * (-25199)) ^ (-578256916);
                        i5 = -1134106368;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۬֡")) * 41;
                        i4 = ((iM2761 ^ i2) * (-13549)) ^ (-805656710);
                        i5 = 1931729146;
                    }
                    break;
                case -1990522148:
                case 1491346856:
                    C2834.m9344();
                    C3998.m12920();
                    iM2761 = (i2 - C0619.m2761("֡֫")) * (-43);
                    i4 = ((iM2761 ^ i3) * (-25199)) ^ (-578256916);
                    i5 = -1134106368;
                    break;
                case -1888668674:
                case 2035373734:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ۖۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10567)) ^ (-1123703648);
                        i5 = 1453251010;
                    } else {
                        iM2761 = (C0773.m3169("ᩳ۠") ^ i2) * (-101);
                        i4 = ((iM2761 ^ i3) * 3143) ^ (-1028294645);
                        i5 = 1896379681;
                    }
                    break;
                case -1800172635:
                case -760799462:
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ܶۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4955) ^ 1043782369;
                        i5 = -898683464;
                    } else {
                        iM2761 = C0773.m3169("۬۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24757) ^ (-1769115244);
                        i5 = 698645491;
                    }
                    break;
                case -1517083521:
                case -1219096860:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0773.m3169("ۖۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10567)) ^ (-1123703648);
                        i5 = 1453251010;
                    } else {
                        iM2761 = C0773.m3169("ۡۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 19605) ^ 1608973578;
                        i5 = -141181453;
                    }
                    break;
                case -1513185093:
                case -222853694:
                    if (C1564.m5512(str)) {
                        iM2761 = C0619.m2761("ܶܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10749) ^ 1737959178;
                        i5 = -2111539764;
                    } else {
                        iM2761 = (C0773.m3169("۫֫") ^ i2) * (-99);
                        i4 = ((iM2761 ^ i3) * (-25627)) ^ 187829384;
                        i5 = -1841982394;
                    }
                    break;
                case -1383062454:
                case 1726813020:
                    return (C10737) objM7814;
                case -1190339346:
                case -982190204:
                    if (str != null) {
                        iM2761 = (C0773.m3169("۬᩶") ^ i2) * (-89);
                        i4 = ((iM2761 ^ i3) * (-9843)) ^ (-307372500);
                        i5 = -419989630;
                    } else {
                        iM2761 = C0619.m2761("ܶܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10749) ^ 1737959178;
                        i5 = -2111539764;
                    }
                    break;
                case -1047985879:
                case 1041761505:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("ۤ᩹") ^ i2) * 43;
                        i4 = ((iM2761 ^ i3) * (-16957)) ^ 1234795332;
                        i5 = 1720549868;
                    } else {
                        iM2761 = C0773.m3169("۠᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-30367)) ^ (-1582732754);
                        i5 = 654327346;
                    }
                    break;
                case -854196662:
                case -39631639:
                    if (C0950.f3488 >= 0) {
                        iM2761 = (C0619.m2761("ۤ᩹") ^ i2) * 43;
                        i4 = ((iM2761 ^ i3) * (-16957)) ^ 1234795332;
                        i5 = 1720549868;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܶۡ")) * 75;
                        i4 = ((iM2761 ^ i2) * (-18425)) ^ (-662377840);
                        i5 = 715065595;
                    }
                    break;
                case -848484651:
                case -335334909:
                    return null;
                case -751378701:
                case 195355881:
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0773.m3169("᩹ܰ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * 6821) ^ (-553886426);
                        i5 = 265557923;
                    } else {
                        iM2761 = C0619.m2761("ۖ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 9019) ^ (-1080360325);
                        i5 = -1645318141;
                    }
                    break;
                case -367050280:
                case 1105446124:
                    if (C2023.m6964() <= 0) {
                        iM2761 = (C0773.m3169("᩹ܰ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * 6821) ^ (-553886426);
                        i5 = 265557923;
                    } else {
                        iM2761 = (i2 - C0619.m2761("֡֫")) * (-43);
                        i4 = ((iM2761 ^ i3) * (-25199)) ^ (-578256916);
                        i5 = -1134106368;
                    }
                    break;
                case -288590653:
                case 484999147:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("ۖۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10567)) ^ (-1123703648);
                        i5 = 1453251010;
                    } else {
                        iM2761 = (C0619.m2761("ۤ᩹") ^ i2) * 43;
                        i4 = ((iM2761 ^ i3) * (-16957)) ^ 1234795332;
                        i5 = 1720549868;
                    }
                    break;
                case -180814222:
                case 281791084:
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0773.m3169("ۖۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10567)) ^ (-1123703648);
                        i5 = 1453251010;
                    } else {
                        iM2761 = C0619.m2761("֨ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3819) ^ (-200011803);
                        i5 = -1812658226;
                    }
                    break;
                case 723169801:
                case 1330747768:
                    if (C2485.m8357() <= 0) {
                        iM2761 = (i2 - C0619.m2761("֡֫")) * (-43);
                        i4 = ((iM2761 ^ i3) * (-25199)) ^ (-578256916);
                        i5 = -1134106368;
                    } else {
                        iM2761 = C0773.m3169("ۧܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7699) ^ 1904262682;
                        i5 = 907558469;
                    }
                    break;
                case 1694221191:
                case 2092705580:
                    C1343.m4943();
                    return null;
                case 1749640314:
                case 2055381865:
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0619.m2761("ܶۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4955) ^ 1043782369;
                        i5 = -898683464;
                    } else {
                        iM2761 = C0619.m2761("ۤۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32339) ^ (-159114041);
                        i5 = 263836011;
                    }
                    break;
                default:
                    if (C23916.f77426 > 0) {
                        iM2761 = (C0619.m2761("ۤ᩹") ^ i2) * 43;
                        i4 = ((iM2761 ^ i3) * (-16957)) ^ 1234795332;
                        i5 = 1720549868;
                    } else {
                        iM2761 = (C0773.m3169("᩹ܰ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * 6821) ^ (-553886426);
                        i5 = 265557923;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0395, code lost:
    
        if (l.AbstractC3624.f12429 > 0) goto L70;
     */
    static {
        /*
            Method dump skipped, instruction units count: 2344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22672.<clinit>():void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13861. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51150() {
        /*
            Method dump skipped, instruction units count: 1386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22672.m51150():void");
    }
}
