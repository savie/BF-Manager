package l;

import com.umeng.analytics.pro.am;
import java.lang.reflect.Method;
import moe.shizuku.server.IShizukuService;
import org.lsposed.lsplant.Hooker;

/* JADX INFO: renamed from: l.᩷ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: MAK5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20948 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String f68275 = "";

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f68276 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String f68277 = "";

    /* JADX INFO: renamed from: ᩶᩸ܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f68278 = {474, 27668, 27670, 27655, 27696, 27679, 27666, 27648, 27648, 27709, 27666, 27678, 27670, 27668, 27670, 27655, 27710, 27670, 27655, 27675, 27676, 27671, 27709, 27666, 27678, 27670};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static synchronized void m47122() {
        if (f68276) {
            return;
        }
        m47126();
        f68276 = true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static synchronized void m47125() {
        m47122();
        m47124("aa", "bb");
        StackTraceElement stackTraceElement = new StackTraceElement(am.av, "b", am.aF, 0);
        if (!"aa".equals(stackTraceElement.getClassName()) || !"bb".equals(stackTraceElement.getMethodName())) {
            throw new IllegalStateException("JavaHook probe failed");
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01c0 A[PHI: r11 r12
      0x01c0: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:51:0x01be, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:51:0x01be, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01f7 A[PHI: r1 r2 r10 r14 r15
      0x01f7: PHI (r1v6 java.lang.Class<java.lang.StackTraceElement>) = 
      (r1v2 java.lang.Class<java.lang.StackTraceElement>)
      (r1v2 java.lang.Class<java.lang.StackTraceElement>)
      (r1v3 java.lang.Class<java.lang.StackTraceElement>)
      (r1v2 java.lang.Class<java.lang.StackTraceElement>)
     binds: [B:55:0x01f5, B:39:0x0131, B:6:0x005b, B:86:0x01f7] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:55:0x01f5, B:39:0x0131, B:6:0x005b, B:86:0x01f7] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r10v5 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:55:0x01f5, B:39:0x0131, B:6:0x005b, B:86:0x01f7] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r14v5 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:55:0x01f5, B:39:0x0131, B:6:0x005b, B:86:0x01f7] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r15v5 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:55:0x01f5, B:39:0x0131, B:6:0x005b, B:86:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m47126() throws NoSuchMethodException {
        int iM45029;
        int i;
        int i2;
        int i3 = C0278.f1572;
        int i4 = C2642.f10294;
        int iM450210 = (C19806.m45029("ۗۨ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
        int i5 = ((iM450210 ^ i4) * (-12685)) ^ (-324021349);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM450210 ^ 862879563;
        int i7 = 0;
        C10365 c10365 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 656692078;
        char c = 0;
        short s = 0;
        String strM8240 = null;
        Method declaredMethod = null;
        Class<?>[] clsArr = null;
        String strM6105 = null;
        Class<StackTraceElement> cls = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 3999) >> 31));
            switch (i13) {
                case -1960775022:
                case 198345972:
                    C0629.m2907();
                    break;
                case -1775767858:
                case 1767600433:
                    i11 = 27763;
                    iM45029 = (i3 - C19806.m45029("᩵ۤ")) * 89;
                    i = ((iM45029 ^ i4) * (-18559)) ^ (-233629998);
                    i2 = 46251216;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1732790850:
                case 516166510:
                    clsArr = null;
                    declaredMethod = cls.getDeclaredMethod(strM6105, null);
                    if (C2871.f10837 < 0) {
                        c10365 = new C10365();
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۢ᩸") ^ i3;
                            i = ((iM45029 ^ i4) * (-1775)) ^ 1505962577;
                            i2 = 371622870;
                        } else {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ۙܶ")) * 35;
                            i = ((iM45029 ^ i4) * 21457) ^ 629971409;
                            i2 = 1754096341;
                        }
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450211 = (i3 - C19806.m45029("ۛ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = iM450211 ^ (-1139008912);
                        i5 = ((iM450211 ^ i4) * 9499) ^ (-1835440837);
                        c10365 = null;
                    }
                    break;
                case -1695260593:
                case 1251303319:
                    Hooker.m52895(cls.getDeclaredMethod(strM8240, clsArr), new C7542());
                    break;
                case -1652421716:
                case -540591155:
                    s = sArr[c];
                    if (!C3743.f13569) {
                        int iM450212 = (i3 - C19806.m45029("ۛ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = iM450212 ^ (-1139008912);
                        i5 = ((iM450212 ^ i4) * 9499) ^ (-1835440837);
                        c10365 = null;
                    } else {
                        iM45029 = C19806.m45029("᩶ܶ") ^ i4;
                        i = ((iM45029 ^ i3) * (-15593)) ^ (-1164488207);
                        i2 = -55987849;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1452128877:
                case -1380418997:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM45029 = C19806.m45029("ۘۛ") ^ i4;
                    i = ((iM45029 ^ i3) * 6301) ^ 2057967040;
                    i2 = -1799662677;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1312385024:
                case -463291570:
                    if ((i9 + i10) - i8 < 0) {
                        iM45029 = C19806.m45029("ܽ᩶") ^ i4;
                        i = ((iM45029 ^ i3) * (-27669)) ^ (-984339878);
                        i2 = 1306329009;
                    } else {
                        iM45029 = (C19806.m45029("۬ܰ") + i3) * 55;
                        i = ((iM45029 ^ i4) * 31845) ^ (-1604634820);
                        i2 = 1033507084;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -885608978:
                case 1435547439:
                    strM8240 = C2704.m8240(sArr3, i7, 13, i11);
                    if (C2249.f8050 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡᩹") + i4) * 17;
                        i = ((iM45029 ^ i3) * 12039) ^ (-1152790357);
                        i2 = 1408575941;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450213 = (i3 - C19806.m45029("ۛ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = iM450213 ^ (-1139008912);
                        i5 = ((iM450213 ^ i4) * 9499) ^ (-1835440837);
                        c10365 = null;
                    }
                    break;
                case -622086797:
                case -608613269:
                    i9 = s * s;
                    i10 = 309126724;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("ܿ۬") ^ i4;
                        i = ((iM45029 ^ i3) * (-19611)) ^ 1738051753;
                        i2 = 1661302049;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽᩴ") ^ i4;
                        i = ((iM45029 ^ i3) * (-8785)) ^ (-65655272);
                        i2 = -67552349;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -527409105:
                case 2090789014:
                    RunnableC1606.m5473();
                    if (!C2332.f8260) {
                        int iM450214 = (i3 - C19806.m45029("ۛ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = iM450214 ^ (-1139008912);
                        i5 = ((iM450214 ^ i4) * 9499) ^ (-1835440837);
                        c10365 = null;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֡۬")) * 101;
                        i = ((iM45029 ^ i4) * (-30203)) ^ (-1264527368);
                        i2 = -1462535669;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case -483266355:
                case 423033319:
                    i8 = s * 35164;
                    if (C0629.m2907()) {
                        iM45029 = (C19806.m45029("۬᩹") ^ i3) * 67;
                        i = ((iM45029 ^ i4) * (-8957)) ^ 507047828;
                        i2 = 1843215829;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֡۬")) * 101;
                        i = ((iM45029 ^ i4) * (-30203)) ^ (-1264527368);
                        i2 = -1462535669;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -396954607:
                case 1417251242:
                    sArr = f68278;
                    c = 0;
                    if (!C1977.m6356()) {
                        iM45029 = (i3 - C19806.m45029("᩵᩹")) * (-115);
                        i = ((iM45029 ^ i4) * (-19181)) ^ (-132155002);
                        i2 = 1485293515;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450215 = (i3 - C19806.m45029("ۛ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = iM450215 ^ (-1139008912);
                        i5 = ((iM450215 ^ i4) * 9499) ^ (-1835440837);
                        c10365 = null;
                    }
                    break;
                case -351635699:
                case 189886311:
                    if (C3722.f13525 > 0) {
                        iM45029 = C19806.m45029("ۘۛ") ^ i4;
                        i = ((iM45029 ^ i3) * 6301) ^ 2057967040;
                        i2 = -1799662677;
                    } else {
                        iM45029 = C19806.m45029("ܿ۬") ^ i4;
                        i = ((iM45029 ^ i3) * (-19611)) ^ 1738051753;
                        i2 = 1661302049;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 931118695:
                case 1283750449:
                    if (AbstractC0464.m2313() != 0) {
                        int iM450216 = (i3 - C19806.m45029("ۛ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = iM450216 ^ (-1139008912);
                        i5 = ((iM450216 ^ i4) * 9499) ^ (-1835440837);
                        c10365 = null;
                    } else {
                        iM45029 = C19806.m45029("ۘۛ") ^ i4;
                        i = ((iM45029 ^ i3) * 6301) ^ 2057967040;
                        i2 = -1799662677;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case 1380417362:
                case 1812910884:
                    i11 = 743;
                    iM45029 = (i3 - C19806.m45029("᩵ۤ")) * 89;
                    i = ((iM45029 ^ i4) * (-18559)) ^ (-233629998);
                    i2 = 46251216;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1618417150:
                case 1873417771:
                    Hooker.m52895(declaredMethod, c10365);
                    sArr3 = f68278;
                    i7 = 13;
                    if (C1460.f5948 < 0) {
                        iM45029 = (C19806.m45029("ܿܰ") ^ i3) * (-95);
                        i = ((iM45029 ^ i4) * (-29435)) ^ 2034795965;
                        i2 = 1158846297;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450217 = (i3 - C19806.m45029("ۛ᩷")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = iM450217 ^ (-1139008912);
                        i5 = ((iM450217 ^ i4) * 9499) ^ (-1835440837);
                        c10365 = null;
                    }
                    break;
                case 1667820600:
                case 1737901308:
                    strM6105 = C1875.m6105(sArr2, i12, 12, i11);
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (i3 - C19806.m45029("֡۬")) * 101;
                        i = ((iM45029 ^ i4) * (-30203)) ^ (-1264527368);
                        i2 = -1462535669;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ֨") + i4) * (-45);
                        i = ((iM45029 ^ i3) * (-20387)) ^ 1484599431;
                        i2 = -382537574;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    cls = StackTraceElement.class;
                    sArr2 = f68278;
                    i12 = 1;
                    if (C1937.f7317 >= 0) {
                        iM45029 = (i3 - C19806.m45029("֡۬")) * 101;
                        i = ((iM45029 ^ i4) * (-30203)) ^ (-1264527368);
                        i2 = -1462535669;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩹") ^ i4;
                        i = ((iM45029 ^ i3) * (-24537)) ^ (-1110536145);
                        i2 = 2014171142;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47124(String str, String str2) {
        if (f68276) {
            f68275 = str;
            f68277 = str2;
        }
    }
}
