package l;

import android.os.Build;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17469 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m40974(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m40976(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m40975(InterfaceC13433 interfaceC13433, String str, byte[] bArr, Map map) throws C10010 {
        Map map2;
        List list;
        C7467 c7467 = new C7467(interfaceC13433);
        C11941 c11941 = new C11941();
        c11941.m29918(str);
        c11941.m29913(map);
        c11941.m29916(2);
        c11941.m29914(bArr);
        c11941.m29909(1);
        C25368 c25368M29908 = c11941.m29908();
        int i = 0;
        int i2 = 0;
        C25368 c25368M29909 = c25368M29908;
        while (true) {
            try {
                C2247 c2247 = new C2247(c7467, c25368M29909);
                try {
                    try {
                        byte[] bArrM15248 = C5020.m15248(c2247);
                        C7116.m19484(c2247);
                        return bArrM15248;
                    } catch (C8213 e) {
                        int i3 = e.f27043;
                        String str2 = null;
                        if ((i3 == 307 || i3 == 308) && i2 < 5 && (map2 = e.f27041) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i2++;
                        C11941 c11941M56734 = c25368M29909.m56734();
                        c11941M56734.m29918(str2);
                        c25368M29909 = c11941M56734.m29908();
                        C7116.m19484(c2247);
                    }
                } catch (Throwable th) {
                    C7116.m19484(c2247);
                    throw th;
                }
            } catch (Exception e2) {
                throw new C10010(c25368M29908, c7467.m20512(), c7467.mo10893(), c7467.m20513(), e2);
            }
        }
    }
}
