package l;

import android.app.Application;

/* JADX INFO: renamed from: l.᩵᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: K22G */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC19681 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Application f63188;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10509 f63189;

    public RunnableC19681(Application application, C10509 c10509) {
        this.f63188 = application;
        this.f63189 = c10509;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f63188.unregisterActivityLifecycleCallbacks(this.f63189);
    }
}
