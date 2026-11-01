package l;

import android.os.Build;
import com.alipay.sdk.m.w.a;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0665 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C0665 f2805;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1931 f2806;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC9134 f2807;

    public C0665() {
        String str = "AndroidSDK_" + Build.VERSION.SDK + "_" + C11105.m28002().m28003() + "_" + Build.VERSION.RELEASE;
        try {
            this.f2807 = new C20422(str);
        } catch (NoClassDefFoundError unused) {
            C23099.m51113("openSDK_LOG.OpenHttpService", "initClient okHttp fail NoClassDefFoundError");
        } catch (Throwable th) {
            C23099.m51111("openSDK_LOG.OpenHttpService", "initClient okHttp catch throwable", th);
        }
        if (this.f2807 == null) {
            this.f2807 = new C10545(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0665 m2989() {
        if (f2805 == null) {
            synchronized (C0665.class) {
                if (f2805 == null) {
                    f2805 = new C0665();
                }
            }
        }
        f2805.m2990();
        return f2805;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2993(C1931 c1931) {
        this.f2806 = c1931;
        m2990();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m2990() {
        C1931 c1931 = this.f2806;
        if (c1931 == null) {
            return;
        }
        int iM6273 = c1931.m6273("Common_HttpConnectionTimeout");
        if (iM6273 == 0) {
            iM6273 = 15000;
        }
        int iM6274 = this.f2806.m6273("Common_SocketConnectionTimeout");
        if (iM6274 == 0) {
            iM6274 = 30000;
        }
        long j = iM6273;
        long j2 = iM6274;
        InterfaceC9134 interfaceC9134 = this.f2807;
        if (interfaceC9134 != null) {
            interfaceC9134.a(j, j2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16894 m2992(HashMap map, String str) {
        if (!map.isEmpty()) {
            StringBuilder sb = new StringBuilder("");
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    sb.append(C17290.encode(str2, a.D));
                    sb.append("=");
                    sb.append(C17290.encode(str3, a.D));
                    sb.append(a.p);
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return this.f2807.mo23456(str, sb.toString());
        }
        return this.f2807.mo23456(str, "");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16894 m2994(HashMap map, String str) {
        return this.f2807.mo23458(str, map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16894 m2991(String str, HashMap map, HashMap map2) {
        if (map2.size() == 0) {
            return this.f2807.mo23458(str, map);
        }
        return this.f2807.mo23457(str, map, map2);
    }
}
