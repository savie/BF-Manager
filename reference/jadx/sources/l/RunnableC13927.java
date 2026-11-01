package l;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.umeng.analytics.pro.am;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܰܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13927 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2636 f45860;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f45861;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f45862;

    public RunnableC13927(C2636 c2636, Bundle bundle, boolean z) {
        this.f45860 = c2636;
        this.f45861 = bundle;
        this.f45862 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM8432 = "";
        C2636 c2636 = this.f45860;
        List list = c2636.f10280;
        Handler handler = c2636.f10277;
        try {
            Bundle bundle = new Bundle();
            bundle.putString("uin", "1000");
            bundle.putString("platform", "1");
            bundle.putString("os_ver", Build.VERSION.RELEASE);
            bundle.putString("position", "");
            int i = C11250.f38046;
            bundle.putString("network", "unknown");
            bundle.putString(am.N, Locale.getDefault().getLanguage());
            bundle.putString(am.z, C9839.m24944(C1791.m5862()));
            bundle.putString("apn", "");
            bundle.putString("mn", C11105.m28002().m28006());
            bundle.putString(am.M, TimeZone.getDefault().getID());
            bundle.putString("sdk_ver", "3.5.18.lite");
            bundle.putString("qz_ver", C2761.m8432(C1791.m5862(), "com.qzone"));
            bundle.putString("qq_ver", C2761.m8436(C1791.m5862()));
            Context contextM5862 = C1791.m5862();
            String strM5872 = C1791.m5872();
            if (contextM5862 != null) {
                strM8432 = C2761.m8432(contextM5862, strM5872);
            }
            bundle.putString("qua", strM8432);
            bundle.putString("packagename", C1791.m5872());
            bundle.putString("app_ver", C2761.m8432(C1791.m5862(), C1791.m5872()));
            bundle.putAll(this.f45861);
            list.add(new C2076(bundle));
            int size = list.size();
            int iM6273 = C1931.m6267(C1791.m5862(), (String) null).m6273("Agent_ReportTimeInterval");
            if (iM6273 == 0) {
                iM6273 = 10000;
            }
            int iM6274 = C1931.m6267(C1791.m5862(), (String) null).m6273("Agent_ReportBatchCount");
            if (iM6274 == 0) {
                iM6274 = 5;
            }
            C23099.m51107("openSDK_LOG.ReportManager", "-->availableCount, report: report_via | dataSize: " + size + " | maxcount: " + iM6274);
            if (!(size >= iM6274) && !this.f45862) {
                if (handler.hasMessages(1001)) {
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 1001;
                handler.sendMessageDelayed(messageObtain, iM6273);
                return;
            }
            if (C2761.m8429(C1791.m5862())) {
                c2636.f10279.execute(new RunnableC11810(c2636));
            }
            handler.removeMessages(1001);
        } catch (Exception e) {
            C23099.m51111("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", e);
        }
    }
}
