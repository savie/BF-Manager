package l;

import android.app.Activity;
import com.tencent.open.web.security.JniInterface;

/* JADX INFO: renamed from: l.᩸۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21439 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7328 f69706;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69707;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18284 f69708;

    public RunnableC21439(C7328 c7328, String str, InterfaceC18284 interfaceC18284) {
        this.f69706 = c7328;
        this.f69707 = str;
        this.f69708 = interfaceC18284;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Activity activity;
        C3342.m9950(C7328.f24361, C7328.f24362);
        JniInterface.m925();
        C7328 c7328 = this.f69706;
        if (c7328.f24364 == null || (activity = (Activity) c7328.f24364.get()) == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC15090(this, activity));
    }
}
