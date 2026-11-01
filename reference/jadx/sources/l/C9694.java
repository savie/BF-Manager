package l;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.net.URL;

/* JADX INFO: renamed from: l.ۢܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9694 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9694 f32672;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile WeakReference f32673;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C9694 m24660() {
        if (f32672 == null) {
            C9694 c9694 = new C9694();
            c9694.f32673 = null;
            f32672 = c9694;
        }
        return f32672;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24661(Context context, String str) {
        if (this.f32673 == null || this.f32673.get() == null) {
            this.f32673 = new WeakReference(context.getSharedPreferences("ServerPrefs", 0));
        }
        try {
            String host = new URL(str).getHost();
            if (host == null) {
                C23099.m51115("openSDK_LOG.ServerSetting", "Get host error. url=".concat(str));
                return str;
            }
            String string = ((SharedPreferences) this.f32673.get()).getString(host, null);
            if (string != null && !host.equals(string)) {
                String strReplace = str.replace(host, string);
                C23099.m51107("openSDK_LOG.ServerSetting", "return environment url : " + strReplace);
                return strReplace;
            }
            C23099.m51107("openSDK_LOG.ServerSetting", "host=" + host + ", envHost=" + string);
            return str;
        } catch (Exception e) {
            StringBuilder sbM30914 = C12441.m30914("getEnvUrl url=", str, "error.: ");
            sbM30914.append(e.getMessage());
            C23099.m51115("openSDK_LOG.ServerSetting", sbM30914.toString());
            return str;
        }
    }
}
