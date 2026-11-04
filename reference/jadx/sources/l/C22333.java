package l;

import android.os.Build;
import com.alipay.sdk.m.w.a;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩷᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C22333 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C22333 f72305;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24988 f72306;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC9149 f72307;

    public C22333() {
        String str = "AndroidSDK_" + Build.VERSION.SDK + "_" + C13053.m32513().m32514() + "_" + Build.VERSION.RELEASE;
        try {
            this.f72307 = new C5179(str);
        } catch (NoClassDefFoundError unused) {
            C21587.m49113("openSDK_LOG.OpenHttpService", "initClient okHttp fail NoClassDefFoundError");
        } catch (Throwable th) {
            C21587.m49112("openSDK_LOG.OpenHttpService", "initClient okHttp catch throwable", th);
        }
        if (this.f72307 == null) {
            this.f72307 = new C2438(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22333 m50398() {
        if (f72305 == null) {
            synchronized (C22333.class) {
                if (f72305 == null) {
                    f72305 = new C22333();
                }
            }
        }
        f72305.m50399();
        return f72305;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50402(C24988 c24988) {
        this.f72306 = c24988;
        m50399();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m50399() {
        C24988 c24988 = this.f72306;
        if (c24988 == null) {
            return;
        }
        int iM55837 = c24988.m55837("Common_HttpConnectionTimeout");
        if (iM55837 == 0) {
            iM55837 = 15000;
        }
        int iM55838 = this.f72306.m55837("Common_SocketConnectionTimeout");
        if (iM55838 == 0) {
            iM55838 = 30000;
        }
        long j = iM55837;
        long j2 = iM55838;
        InterfaceC9149 interfaceC9149 = this.f72307;
        if (interfaceC9149 != null) {
            interfaceC9149.a(j, j2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11144 m50401(HashMap map, String str) {
        if (!map.isEmpty()) {
            StringBuilder sb = new StringBuilder("");
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    sb.append(C22837.encode(str2, a.D));
                    sb.append("=");
                    sb.append(C22837.encode(str3, a.D));
                    sb.append(a.p);
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return this.f72307.mo8231(str, sb.toString());
        }
        return this.f72307.mo8231(str, "");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC11144 m50403(HashMap map, String str) {
        return this.f72307.mo8233(str, map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11144 m50400(String str, HashMap map, HashMap map2) {
        if (map2.size() == 0) {
            return this.f72307.mo8233(str, map);
        }
        return this.f72307.mo8232(str, map, map2);
    }
}
