package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۫᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V60Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C12670 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f42304;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final HashMap f42305;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Class f42306;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m31503(Class cls, Object obj, String str) {
        RunnableC1895.m6172(f42305, str, new C16903(cls, obj));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m31504(AbstractActivityC12483 abstractActivityC12483) {
        Class clsM10051 = RunnableC3388.m10051(abstractActivityC12483);
        if (f42306 != clsM10051) {
            f42306 = clsM10051;
        }
        RunnableC1895.m6172(f42304, clsM10051, ViewTreeObserverOnPreDrawListenerC3327.m9877(C1460.m5059()));
        Iterator itM943 = C0050.m943(f42305.entrySet());
        ArrayList arrayList = null;
        while (C0962.m3748(itM943)) {
            Map.Entry entry = (Map.Entry) C0278.m1776(itM943);
            if (((C16903) entry.getValue()).f54057 == clsM10051) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C2249.m6905(arrayList, (String) entry.getKey());
            }
        }
        if (arrayList != null) {
            Iterator itM10563 = C3577.m10563(arrayList);
            while (RunnableC1564.m5348(itM10563)) {
                f42305.remove((String) C0278.m1776(itM10563));
            }
        }
    }

    static {
        HashMap map = null;
        int i = -619531869;
        int i2 = C7105.f23796;
        int i3 = C3535.f13026;
        int iM11306 = (ThreadFactoryC3888.m11306("ۘ᩵") ^ i3) * 91;
        int i4 = ((iM11306 ^ i2) * (-20929)) ^ 219642427;
        int i5 = 1420821400;
        while (true) {
            i = ((((i ^ i2) * 9237) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1948689517:
                case 532602044:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ܶۚ")) * (-99);
                        i4 = ((iM11306 ^ i2) * 26247) ^ 1701708520;
                        i5 = -1897430215;
                    } else {
                        iM11306 = C19806.m45029("᩺ۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-369)) ^ (-360855222);
                        i5 = 189753136;
                    }
                    break;
                case -1783803636:
                case 1773075841:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    C1875.m6086();
                    throw new RuntimeException();
                case -1733162151:
                case 1402033727:
                    C2642.m8171();
                    iM11306 = ThreadFactoryC3888.m11306("֫ۤ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-24779)) ^ 1740695664;
                    i5 = 911111943;
                    break;
                case -1724052052:
                case -1461598320:
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("۫᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13831) ^ (-1003013221);
                        i5 = 1389801117;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 489) ^ 186298843;
                        i5 = -707153289;
                    }
                    break;
                case -1561568675:
                case -213117695:
                    f42305 = map;
                    if (C1937.f7317 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ܶۚ")) * (-99);
                        i4 = ((iM11306 ^ i2) * 26247) ^ 1701708520;
                        i5 = -1897430215;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܺ֫")) * (-37);
                        i4 = ((iM11306 ^ i3) * 20955) ^ (-792823604);
                        i5 = -758184561;
                    }
                    break;
                case -1469948967:
                case 1696873819:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ܶۚ")) * (-99);
                        i4 = ((iM11306 ^ i2) * 26247) ^ 1701708520;
                        i5 = -1897430215;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۨ۟")) * 47;
                        i4 = ((iM11306 ^ i2) * (-1121)) ^ (-1543052793);
                        i5 = -1775170227;
                    }
                    break;
                case -1372490481:
                case 1837143047:
                    if (C1977.f7413 <= 0) {
                        iM11306 = C19806.m45029("۫᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13831) ^ (-1003013221);
                        i5 = 1389801117;
                    } else {
                        iM11306 = C19806.m45029("ۧ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20377)) ^ 1241643986;
                        i5 = -1570043118;
                    }
                    break;
                case -1306125123:
                case 857685768:
                    RunnableC1564.m5345();
                    if (C1937.f7317 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 13401) ^ 264130770;
                        i5 = 417133690;
                    } else {
                        iM11306 = C19806.m45029("۫᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13831) ^ (-1003013221);
                        i5 = 1389801117;
                    }
                    break;
                case -920632439:
                case 1420583041:
                    if (C0817.f3443) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("֫ܽ")) * (-103);
                        i4 = ((iM11306 ^ i3) * 16479) ^ (-1647249196);
                        i5 = 965283500;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܶۚ")) * (-99);
                        i4 = ((iM11306 ^ i2) * 26247) ^ 1701708520;
                        i5 = -1897430215;
                    }
                    break;
                case -472802626:
                case 1836050245:
                    f42304 = new HashMap();
                    return;
                case 204698901:
                case 1487372027:
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("ᩳ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23029) ^ (-1774362918);
                        i5 = -109566908;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۛ") + i3) * 85;
                        i4 = ((iM11306 ^ i2) * (-27823)) ^ 1361303569;
                        i5 = 1999397455;
                    }
                    break;
                case 610396078:
                case 639608041:
                    if (C1875.m6086() != 0) {
                        iM11306 = C19806.m45029("ᩳ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23029) ^ (-1774362918);
                        i5 = -109566908;
                    } else {
                        iM11306 = (C19806.m45029("֫ۧ") + i2) * 81;
                        i4 = ((iM11306 ^ i3) * 14201) ^ 890338572;
                        i5 = 1685598012;
                    }
                    break;
                case 658851335:
                case 1195345669:
                    C2871.m8646();
                    if (C1461.f5957 > 0) {
                        iM11306 = C19806.m45029("۫᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13831) ^ (-1003013221);
                        i5 = 1389801117;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24779)) ^ 1740695664;
                        i5 = 911111943;
                    }
                    break;
                case 799459326:
                case 1648778134:
                    C1977.m6356();
                    if (C0050.f912 > 0) {
                        iM11306 = C19806.m45029("ᩳ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23029) ^ (-1774362918);
                        i5 = -109566908;
                    } else {
                        iM11306 = C19806.m45029("۫᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13831) ^ (-1003013221);
                        i5 = 1389801117;
                    }
                    break;
                case 1079695278:
                case 1392144050:
                    map = new HashMap();
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 13401) ^ 264130770;
                        i5 = 417133690;
                    } else {
                        iM11306 = (C19806.m45029("ۘ֨") + i3) * 25;
                        i4 = ((iM11306 ^ i2) * (-19527)) ^ (-429284097);
                        i5 = 2061795518;
                    }
                    break;
                default:
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("۫᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13831) ^ (-1003013221);
                        i5 = 1389801117;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7609) ^ 1391712723;
                        i5 = 1398432596;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m31505(String str) {
        synchronized (C12670.class) {
            C16903 c16903 = (C16903) f42305.remove(str);
            if (c16903 == null) {
                return null;
            }
            Object obj = c16903.f54058;
            if (obj == null) {
                return null;
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m31502(String str) {
        synchronized (C12670.class) {
            C16903 c16903 = (C16903) C2332.m7077(f42305, str);
            if (c16903 == null) {
                return null;
            }
            Object obj = c16903.f54058;
            if (obj == null) {
                return null;
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Class m31501() {
        return f42306;
    }
}
