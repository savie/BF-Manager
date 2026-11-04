package l;

import android.app.Activity;
import com.tencent.connect.auth.a;
import com.tencent.open.TDialog;
import com.tencent.open.web.security.JniInterface;

/* JADX INFO: renamed from: l.ܿ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18354 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f59828;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC0455 f59829;

    public RunnableC18354(RunnableC0455 runnableC0455, Activity activity) {
        this.f59829 = runnableC0455;
        this.f59828 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC0455 runnableC0455 = this.f59829;
        InterfaceC19020 interfaceC19020 = runnableC0455.f2046;
        C8658 c8658 = runnableC0455.f2045;
        boolean z = JniInterface.f897;
        Activity activity = this.f59828;
        if (z) {
            a aVar = new a(activity, runnableC0455.f2044, interfaceC19020, c8658.f21019);
            if (activity.isFinishing()) {
                return;
            }
            aVar.show();
            return;
        }
        C21587.m49114("openSDK_LOG.AuthAgent", "OpenUi, secure so load failed, goto download QQ.");
        TDialog tDialog = new TDialog(activity, c8658.m17773(), interfaceC19020, c8658.f21019);
        if (activity.isFinishing()) {
            return;
        }
        tDialog.show();
    }
}
