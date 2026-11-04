package l;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.net.URL;

/* JADX INFO: renamed from: l.ܺۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16782 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C16782 f54156;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile WeakReference f54157;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C16782 m39621() {
        if (f54156 == null) {
            C16782 c16782 = new C16782();
            c16782.f54157 = null;
            f54156 = c16782;
        }
        return f54156;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m39622(Context context, String str) {
        if (this.f54157 == null || this.f54157.get() == null) {
            this.f54157 = new WeakReference(context.getSharedPreferences("ServerPrefs", 0));
        }
        try {
            String host = new URL(str).getHost();
            if (host == null) {
                C21587.m49116("openSDK_LOG.ServerSetting", "Get host error. url=".concat(str));
                return str;
            }
            String string = ((SharedPreferences) this.f54157.get()).getString(host, null);
            if (string != null && !host.equals(string)) {
                String strReplace = str.replace(host, string);
                C21587.m49118("openSDK_LOG.ServerSetting", "return environment url : " + strReplace);
                return strReplace;
            }
            C21587.m49118("openSDK_LOG.ServerSetting", "host=" + host + ", envHost=" + string);
            return str;
        } catch (Exception e) {
            StringBuilder sbM51387 = C22783.m51387("getEnvUrl url=", str, "error.: ");
            sbM51387.append(e.getMessage());
            C21587.m49116("openSDK_LOG.ServerSetting", sbM51387.toString());
            return str;
        }
    }
}
