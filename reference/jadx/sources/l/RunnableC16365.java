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

/* JADX INFO: renamed from: l.ܶ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16365 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f53142;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3687 f53143;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f53144;

    public RunnableC16365(C3687 c3687, Bundle bundle, boolean z) {
        this.f53143 = c3687;
        this.f53142 = bundle;
        this.f53144 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM47037 = "";
        C3687 c3687 = this.f53143;
        List list = c3687.f12676;
        Handler handler = c3687.f12680;
        try {
            Bundle bundle = new Bundle();
            bundle.putString("uin", "1000");
            bundle.putString("platform", "1");
            bundle.putString("os_ver", Build.VERSION.RELEASE);
            bundle.putString("position", "");
            int i = C13382.f42666;
            bundle.putString("network", "unknown");
            bundle.putString(am.N, Locale.getDefault().getLanguage());
            bundle.putString(am.z, C25317.m56593(C5596.m16575()));
            bundle.putString("apn", "");
            bundle.putString("mn", C13053.m32513().m32517());
            bundle.putString(am.M, TimeZone.getDefault().getID());
            bundle.putString("sdk_ver", "3.5.18.lite");
            bundle.putString("qz_ver", C20512.m47037(C5596.m16575(), "com.qzone"));
            bundle.putString("qq_ver", C20512.m47042(C5596.m16575()));
            Context contextM16575 = C5596.m16575();
            String strM16572 = C5596.m16572();
            if (contextM16575 != null) {
                strM47037 = C20512.m47037(contextM16575, strM16572);
            }
            bundle.putString("qua", strM47037);
            bundle.putString("packagename", C5596.m16572());
            bundle.putString("app_ver", C20512.m47037(C5596.m16575(), C5596.m16572()));
            bundle.putAll(this.f53142);
            list.add(new C11890(bundle));
            int size = list.size();
            int iM55837 = C24988.m55831(C5596.m16575(), (String) null).m55837("Agent_ReportTimeInterval");
            if (iM55837 == 0) {
                iM55837 = 10000;
            }
            int iM55838 = C24988.m55831(C5596.m16575(), (String) null).m55837("Agent_ReportBatchCount");
            if (iM55838 == 0) {
                iM55838 = 5;
            }
            C21587.m49118("openSDK_LOG.ReportManager", "-->availableCount, report: report_via | dataSize: " + size + " | maxcount: " + iM55838);
            if (!(size >= iM55838) && !this.f53144) {
                if (handler.hasMessages(1001)) {
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 1001;
                handler.sendMessageDelayed(messageObtain, iM55837);
                return;
            }
            if (C20512.m47035(C5596.m16575())) {
                c3687.f12678.execute(new RunnableC23825(c3687));
            }
            handler.removeMessages(1001);
        } catch (Exception e) {
            C21587.m49112("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", e);
        }
    }
}
