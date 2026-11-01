package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: IAZ0 */
/* JADX INFO: loaded from: classes4.dex */
public class C17916 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static Constructor f56905;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f56906;

    /* JADX INFO: renamed from: ۗ᩹ܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f56907 = {2440, 10303, 10299, 10279, 10299, 10364, 10289, 10301, 10300, 10278, 10295, 10300, 10278, 10364, 10272, 10295, 10273, 10364, 10267, 10289, 10301, 10300, 10257, 10279, 10273, 10278, 10301, 10303, 10299, 10280, 10295, 10272, 10291, 10300, 10294, 10272, 10301, 10299, 10294, 10364, 10291, 10274, 10274, 10364, 10259, 10274, 10274, 10302, 10299, 10289, 10291, 10278, 10299, 10301, 10300, 10242, 10291, 10289, 10297, 10291, 10293, 10295, 10271, 10291, 10300, 10291, 10293, 10295, 10272, 10289, 10302, 10295, 10291, 10272, 10257, 10291, 10289, 10298, 10295, 10240, 10295, 10273, 10301, 10279, 10272, 10289, 10295, 10268, 10291, 10303, 10295, 10240, 10295, 10273, 10301, 10279, 10272, 10289, 10295, 10268, 10291, 10303, 10295, 10354, 10289, 10302, 10291, 10273, 10273, 10354, 10300, 10301, 10278, 10354, 10292, 10301, 10279, 10300, 10294, 10273, 10241, 10283, 10300, 10289, 10273, 10267, 10289, 10301, 10300, 10257, 10291, 10289, 10298, 10295};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static byte[] f56908;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String f56909;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f56910;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Field f56911;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static Object f56912;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Method f56913;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static Class f56914;

    /* JADX INFO: renamed from: ۙ */
    public void mo36718(int i, String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo36719(int i, C14388 c14388) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo36721(C14388 c14388) {
        throw null;
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo36723(int i, C14388 c14388) {
        throw null;
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo36724(int i, C14388 c14388) {
        throw null;
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo36725(C14388 c14388) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m41607() {
        short s = f56907[0];
        int i = s + 19640;
        int i2 = (s * s) + 385729600;
        int i3 = (i2 + i2) - (i * i) >= 0 ? 10322 : 11567;
        synchronized (C17916.class) {
            if (f56910) {
                return true;
            }
            if (f56906) {
                return false;
            }
            try {
                Method declaredMethod = Class.forName(C2642.m8172(f56907, 1, 31, i3)).getDeclaredMethod(C0278.m1774(f56907, 69, 10, i3), String.class);
                declaredMethod.setAccessible(true);
                f56913 = declaredMethod;
            } catch (Exception unused) {
            }
            try {
                Class<?> cls = Class.forName(C3660.m10790(f56907, 32, 37, i3));
                for (Class<?> cls2 : cls.getDeclaredClasses()) {
                    if (C1460.m5058(cls2.getSimpleName(), C0278.m1774(f56907, 79, 12, i3))) {
                        f56914 = cls2;
                        break;
                    }
                }
                Class cls3 = f56914;
                if (cls3 == null) {
                    throw new NoSuchFieldException(C0629.m2906(f56907, 91, 28, i3));
                }
                Constructor declaredConstructor = cls3.getDeclaredConstructor(String.class, Integer.TYPE);
                f56905 = declaredConstructor;
                declaredConstructor.setAccessible(true);
                Field declaredField = cls.getDeclaredField(C1875.m6105(f56907, 119, 5, i3));
                declaredField.setAccessible(true);
                f56912 = declaredField.get(null);
                Field declaredField2 = cls.getDeclaredField(C1025.m3859(f56907, 124, 10, i3));
                f56911 = declaredField2;
                declaredField2.setAccessible(true);
                f56910 = true;
                return true;
            } catch (Exception unused2) {
                f56906 = true;
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo36720(int i, C14388 c14388, String str, String str2, String str3) {
        int i2 = -1263481023;
        int i3 = AbstractC0464.f2088;
        int i4 = C10634.f36300;
        int iM11306 = (ThreadFactoryC3888.m11306("۬ܿ") + i4) * (-95);
        int i5 = ((iM11306 ^ i3) * (-31605)) ^ (-55319326);
        int i6 = 430869192;
        while (true) {
            i2 = ((((i2 ^ i3) * 1009) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1945889554:
                case 917220692:
                    CallableC1627.m5507();
                    if (C1025.f4800 >= 0) {
                        iM11306 = (C19806.m45029("᩻ۛ") + i4) * 63;
                        i5 = ((iM11306 ^ i3) * (-25233)) ^ 172544779;
                        i6 = -1393130232;
                    } else {
                        iM11306 = C19806.m45029("ۗܿ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 18131) ^ (-1845991090);
                        i6 = -327478763;
                    }
                    break;
                case -1737954895:
                case 886516191:
                    if (!C0962.f3784) {
                        iM11306 = (C19806.m45029("᩻ۛ") + i4) * 63;
                        i5 = ((iM11306 ^ i3) * (-25233)) ^ 172544779;
                        i6 = -1393130232;
                    } else {
                        iM11306 = (C19806.m45029("᩵ۗ") + i4) * 123;
                        i5 = ((iM11306 ^ i3) * (-5593)) ^ 514500082;
                        i6 = -27718645;
                    }
                    break;
                case -1690807493:
                case -1506366903:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (C19806.m45029("᩵ۗ") + i4) * 123;
                        i5 = ((iM11306 ^ i3) * (-5593)) ^ 514500082;
                        i6 = -27718645;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۛ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-16331)) ^ (-936496172);
                        i6 = 145433033;
                    }
                    break;
                case -1662418298:
                case -227178143:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (C19806.m45029("᩻ۛ") + i4) * 63;
                        i5 = ((iM11306 ^ i3) * (-25233)) ^ 172544779;
                        i6 = -1393130232;
                    } else {
                        iM11306 = (C19806.m45029("ܰ۠") + i3) * 7;
                        i5 = ((iM11306 ^ i4) * (-28451)) ^ (-100875771);
                        i6 = 1135820405;
                    }
                    break;
                case -1649564616:
                case -1076672125:
                    throw null;
                case -1484184082:
                case -1434132596:
                    if (C2871.m8646()) {
                        iM11306 = (C19806.m45029("۠ۘ") ^ i4) * (-59);
                        i5 = ((iM11306 ^ i3) * (-2051)) ^ (-350501846);
                        i6 = 1630712356;
                    } else {
                        iM11306 = (C19806.m45029("᩻ۛ") + i4) * 63;
                        i5 = ((iM11306 ^ i3) * (-25233)) ^ 172544779;
                        i6 = -1393130232;
                    }
                    break;
                case -1460008784:
                case 1302471076:
                    C2642.m8171();
                    if (C1148.f5161 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ᩶") + i3) * 127;
                        i5 = ((iM11306 ^ i4) * (-27491)) ^ (-853097323);
                        i6 = -306682429;
                    } else {
                        iM11306 = C19806.m45029("ۗܿ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 18131) ^ (-1845991090);
                        i6 = -327478763;
                    }
                    break;
                case -1343006819:
                case 3851960:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM11306 = C19806.m45029("ۗܿ") ^ i3;
                    i5 = ((iM11306 ^ i4) * 18131) ^ (-1845991090);
                    i6 = -327478763;
                    break;
                case -847875287:
                case 1159538808:
                    if (C2249.m6915() <= 0) {
                        iM11306 = (C19806.m45029("᩵ۗ") + i4) * 123;
                        i5 = ((iM11306 ^ i3) * (-5593)) ^ 514500082;
                        i6 = -27718645;
                    } else {
                        iM11306 = C19806.m45029("ᩴ᩶") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-6597)) ^ 1246261804;
                        i6 = 1285046274;
                    }
                    break;
                case -617261034:
                case 1355369482:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ᩶") + i3) * 127;
                        i5 = ((iM11306 ^ i4) * (-27491)) ^ (-853097323);
                        i6 = -306682429;
                    } else {
                        iM11306 = C19806.m45029("۫ܶ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-8331)) ^ (-420267148);
                        i6 = 1299294369;
                    }
                    break;
                case -318070124:
                case 421304114:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ᩸") ^ i4;
                        i5 = ((iM11306 ^ i3) * 5633) ^ (-1680298378);
                        i6 = 14113641;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܰܳ")) * (-75);
                        i5 = ((iM11306 ^ i3) * (-12019)) ^ 947779319;
                        i6 = 1148145196;
                    }
                    break;
                case 91916342:
                case 920046599:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (C19806.m45029("᩻ۛ") + i4) * 63;
                        i5 = ((iM11306 ^ i3) * (-25233)) ^ 172544779;
                        i6 = -1393130232;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۗ۬")) * 19;
                        i5 = ((iM11306 ^ i3) * (-27131)) ^ 895644968;
                        i6 = -533198613;
                    }
                    break;
                case 351910311:
                case 1325441521:
                    if (C2704.f10408) {
                        iM11306 = (i3 - C19806.m45029("֫ۘ")) * (-51);
                        i5 = ((iM11306 ^ i4) * (-20981)) ^ 1099023535;
                        i6 = 1318975300;
                    } else {
                        iM11306 = (C19806.m45029("᩵ۗ") + i4) * 123;
                        i5 = ((iM11306 ^ i3) * (-5593)) ^ 514500082;
                        i6 = -27718645;
                    }
                    break;
                case 688551828:
                case 1437593011:
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ۗܿ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 18131) ^ (-1845991090);
                        i6 = -327478763;
                    } else {
                        iM11306 = (C19806.m45029("ۧ֡") + i3) * 7;
                        i5 = ((iM11306 ^ i4) * (-11559)) ^ (-31108630);
                        i6 = -2018270765;
                    }
                    break;
                case 719590934:
                case 812002762:
                    if (C1066.m4023() <= 0) {
                        iM11306 = (C19806.m45029("᩻ۛ") + i4) * 63;
                        i5 = ((iM11306 ^ i3) * (-25233)) ^ 172544779;
                        i6 = -1393130232;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗܺ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-7973)) ^ 800499383;
                        i6 = 411894470;
                    }
                    break;
                default:
                    AbstractC0464.m2313();
                    RunnableC1606.m5473();
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m41608(int i, String str) {
        if (str == null || C3660.m10786(str) || !m41607()) {
            return;
        }
        Method method = f56913;
        if (method != null) {
            try {
                method.invoke(null, str);
            } catch (Exception unused) {
            }
        }
        try {
            Object objNewInstance = f56905.newInstance(str, C1148.m4234(i));
            synchronized (f56912) {
                try {
                    Map map = (Map) f56911.get(null);
                    if (map != null) {
                        map.remove(objNewInstance);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused2) {
        }
    }
}
