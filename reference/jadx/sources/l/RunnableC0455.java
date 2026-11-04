package l;

import android.app.Activity;
import com.tencent.open.web.security.JniInterface;

/* JADX INFO: renamed from: l.֡۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0455 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f2044;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8658 f2045;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19020 f2046;

    public RunnableC0455(C8658 c8658, String str, InterfaceC19020 interfaceC19020) {
        this.f2045 = c8658;
        this.f2044 = str;
        this.f2046 = interfaceC19020;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Activity activity;
        C17528.m41151(C8658.f28263, C8658.f28264);
        JniInterface.m919();
        C8658 c8658 = this.f2045;
        if (c8658.f28265 == null || (activity = (Activity) c8658.f28265.get()) == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC18354(this, activity));
    }
}
