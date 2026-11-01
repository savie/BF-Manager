package l;

import android.os.Build;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17672 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41148(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m41150(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m41149(InterfaceC15785 interfaceC15785, String str, byte[] bArr, Map map) throws C13169 {
        Map map2;
        List list;
        C19000 c19000 = new C19000(interfaceC15785);
        C16490 c16490 = new C16490();
        c16490.m38763(str);
        c16490.m38758(map);
        c16490.m38761(2);
        c16490.m38759(bArr);
        c16490.m38754(1);
        C12257 c12257M38753 = c16490.m38753();
        int i = 0;
        int i2 = 0;
        C12257 c12257M38754 = c12257M38753;
        while (true) {
            try {
                C0261 c0261 = new C0261(c19000, c12257M38754);
                try {
                    try {
                        byte[] bArrM6841 = C2221.m6841(c0261);
                        C17983.m41837(c0261);
                        return bArrM6841;
                    } catch (C1360 e) {
                        int i3 = e.f5709;
                        String str2 = null;
                        if ((i3 == 307 || i3 == 308) && i2 < 5 && (map2 = e.f5708) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i2++;
                        C16490 c16490M30477 = c12257M38754.m30477();
                        c16490M30477.m38763(str2);
                        c12257M38754 = c16490M30477.m38753();
                        C17983.m41837(c0261);
                    }
                } catch (Throwable th) {
                    C17983.m41837(c0261);
                    throw th;
                }
            } catch (Exception e2) {
                throw new C13169(c12257M38753, c19000.m43700(), c19000.mo9273(), c19000.m43703(), e2);
            }
        }
    }
}
