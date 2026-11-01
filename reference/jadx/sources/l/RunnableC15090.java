package l;

import android.app.Activity;
import com.tencent.connect.auth.a;
import com.tencent.open.TDialog;
import com.tencent.open.web.security.JniInterface;

/* JADX INFO: renamed from: l.ܶ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC15090 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f49282;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC21439 f49283;

    public RunnableC15090(RunnableC21439 runnableC21439, Activity activity) {
        this.f49283 = runnableC21439;
        this.f49282 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC21439 runnableC21439 = this.f49283;
        InterfaceC18284 interfaceC18284 = runnableC21439.f69708;
        C7328 c7328 = runnableC21439.f69706;
        boolean z = JniInterface.f907;
        Activity activity = this.f49282;
        if (z) {
            a aVar = new a(activity, runnableC21439.f69707, interfaceC18284, c7328.f5744);
            if (activity.isFinishing()) {
                return;
            }
            aVar.show();
            return;
        }
        C23099.m51112("openSDK_LOG.AuthAgent", "OpenUi, secure so load failed, goto download QQ.");
        TDialog tDialog = new TDialog(activity, c7328.m4820(), interfaceC18284, c7328.f5744);
        if (activity.isFinishing()) {
            return;
        }
        tDialog.show();
    }
}
