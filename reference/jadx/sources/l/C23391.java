package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V60Y */
/* JADX INFO: loaded from: classes.dex */
public final class C23391 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f75726;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final HashMap f75727;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Class f75728;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m52569(Class cls, Object obj, String str) {
        RunnableC0334.m2056(f75727, str, new C15931(cls, obj));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m52570(AbstractActivityC17204 abstractActivityC17204) {
        Class clsM12155 = C3734.m12155(abstractActivityC17204);
        if (f75728 != clsM12155) {
            f75728 = clsM12155;
        }
        RunnableC0334.m2056(f75726, clsM12155, C1542.m5460(C3448.m11251()));
        Iterator itM2811 = AbstractC0641.m2811(f75727.entrySet());
        ArrayList arrayList = null;
        while (C3998.m12923(itM2811)) {
            Map.Entry entry = (Map.Entry) C4238.m13529(itM2811);
            if (((C15931) entry.getValue()).f51743 == clsM12155) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C1519.m5406(arrayList, (String) entry.getKey());
            }
        }
        if (arrayList != null) {
            Iterator itM4942 = C1343.m4942(arrayList);
            while (C3998.m12923(itM4942)) {
                f75727.remove((String) C0950.m3796(itM4942));
            }
        }
    }

    static {
        HashMap map = null;
        int i = 1154412941;
        int i2 = C3492.f12043;
        int i3 = AbstractC0116.f1064;
        int iM3169 = C0773.m3169("ۗۢ") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-7839)) ^ 656236071;
        int i5 = -1530236807;
        while (true) {
            i = ((((i ^ i3) * 30327) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1915233958:
                case 1920506169:
                    C2702.m8876();
                    iM3169 = (C0619.m2761("ۨܰ") ^ i3) * (-71);
                    i4 = ((iM3169 ^ i2) * 27381) ^ (-1465682886);
                    i5 = -1912255042;
                    break;
                case -1220790693:
                case 1884789922:
                    map = new HashMap();
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0773.m3169("ܿ᩻") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * 14769) ^ (-2056297831);
                        i5 = 424129379;
                    } else {
                        iM3169 = C0619.m2761("ۨ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4409) ^ (-1867824516);
                        i5 = -1623994385;
                    }
                    break;
                case -1190110106:
                case -275169748:
                    f75727 = map;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("ܿ᩻") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * 14769) ^ (-2056297831);
                        i5 = 424129379;
                    } else {
                        iM3169 = C0619.m2761("ܽᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22237) ^ 837549716;
                        i5 = -456255242;
                    }
                    break;
                case -1167428874:
                case 302775521:
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ۢ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31119) ^ (-1174538130);
                        i5 = 1636756006;
                    } else {
                        iM3169 = (i2 - C0773.m3169("֡ܽ")) * 101;
                        i4 = ((iM3169 ^ i3) * 23993) ^ 1660003905;
                        i5 = -296784875;
                    }
                    break;
                case -1100777574:
                case 418998253:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (i2 - C0773.m3169("᩺᩵")) * 59;
                        i4 = ((iM3169 ^ i3) * (-15017)) ^ 416776245;
                        i5 = 1304959281;
                    } else {
                        iM3169 = (C0773.m3169("۬֨") ^ i3) * (-105);
                        i4 = ((iM3169 ^ i2) * 22953) ^ (-926312423);
                        i5 = 334383227;
                    }
                    break;
                case -926232682:
                case 1741991781:
                    if (C4282.m13644()) {
                        iM3169 = C0619.m2761("᩵ۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 801) ^ 2130997413;
                        i5 = -1099451315;
                    } else {
                        iM3169 = C0773.m3169("᩷֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11497)) ^ (-159196046);
                        i5 = 1608763395;
                    }
                    break;
                case -723859829:
                case 1598384308:
                    if (AbstractC0116.f1064 > 0) {
                        iM3169 = C0773.m3169("᩷֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11497)) ^ (-159196046);
                        i5 = 1608763395;
                    } else {
                        iM3169 = (C0619.m2761("ۨܰ") ^ i3) * (-71);
                        i4 = ((iM3169 ^ i2) * 27381) ^ (-1465682886);
                        i5 = -1912255042;
                    }
                    break;
                case -695966106:
                case 1645304854:
                    C1519.m5403();
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (i2 - C0773.m3169("᩺᩵")) * 59;
                        i4 = ((iM3169 ^ i3) * (-15017)) ^ 416776245;
                        i5 = 1304959281;
                    } else {
                        iM3169 = (C0619.m2761("ۨܰ") ^ i3) * (-71);
                        i4 = ((iM3169 ^ i2) * 27381) ^ (-1465682886);
                        i5 = -1912255042;
                    }
                    break;
                case -677931841:
                case 844465966:
                    if (C4238.m13540() <= 0) {
                        iM3169 = (C0619.m2761("ۨܰ") ^ i3) * (-71);
                        i4 = ((iM3169 ^ i2) * 27381) ^ (-1465682886);
                        i5 = -1912255042;
                    } else {
                        iM3169 = (C0773.m3169("ۨ۠") + i2) * 95;
                        i4 = ((iM3169 ^ i3) * (-22287)) ^ (-958354556);
                        i5 = 1882147186;
                    }
                    break;
                case -523231331:
                case 422389715:
                    f75726 = new HashMap();
                    return;
                case -100439001:
                case 1790344688:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0619.m2761("ۨܰ") ^ i3) * (-71);
                        i4 = ((iM3169 ^ i2) * 27381) ^ (-1465682886);
                        i5 = -1912255042;
                    } else {
                        iM3169 = C0773.m3169("ܺᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13659)) ^ (-148306353);
                        i5 = 1674225824;
                    }
                    break;
                case -96172800:
                case 239813684:
                    if (C3448.m11248() != 0) {
                        iM3169 = (C0773.m3169("ܿ᩻") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * 14769) ^ (-2056297831);
                        i5 = 424129379;
                    } else {
                        iM3169 = (C0619.m2761("ܺ۟") + i2) * 83;
                        i4 = ((iM3169 ^ i3) * 21071) ^ 292167744;
                        i5 = -1767469242;
                    }
                    break;
                case 947535249:
                case 1436652010:
                    C1826.m6301();
                    C1519.m5403();
                    throw new RuntimeException();
                case 1434422739:
                case 1548356347:
                    if (C0862.f3233 != 0) {
                        iM3169 = (i2 - C0773.m3169("᩺᩵")) * 59;
                        i4 = ((iM3169 ^ i3) * (-15017)) ^ 416776245;
                        i5 = 1304959281;
                    } else {
                        iM3169 = (C0619.m2761("۠ܿ") ^ i2) * (-45);
                        i4 = ((iM3169 ^ i3) * (-25769)) ^ 2110197221;
                        i5 = -2018129531;
                    }
                    break;
                case 1543376821:
                case 1785935534:
                    C0619.m2763();
                    if (C3448.m11248() == 0) {
                        iM3169 = C0773.m3169("ۢ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31119) ^ (-1174538130);
                        i5 = 1636756006;
                    } else {
                        iM3169 = (C0619.m2761("ۨܰ") ^ i3) * (-71);
                        i4 = ((iM3169 ^ i2) * 27381) ^ (-1465682886);
                        i5 = -1912255042;
                    }
                    break;
                default:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("ۢ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31119) ^ (-1174538130);
                        i5 = 1636756006;
                    } else {
                        iM3169 = (C0619.m2761("ۢۨ") + i2) * 53;
                        i4 = ((iM3169 ^ i3) * 27219) ^ 913842356;
                        i5 = -173308764;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m52571(String str) {
        synchronized (C23391.class) {
            C15931 c15931 = (C15931) f75727.remove(str);
            if (c15931 == null) {
                return null;
            }
            Object obj = c15931.f51744;
            if (obj == null) {
                return null;
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m52568(String str) {
        synchronized (C23391.class) {
            C15931 c15931 = (C15931) C2310.m7814(f75727, str);
            if (c15931 == null) {
                return null;
            }
            Object obj = c15931.f51744;
            if (obj == null) {
                return null;
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Class m52567() {
        return f75728;
    }
}
