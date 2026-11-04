package l;

import android.app.Application;

/* JADX INFO: renamed from: l.ܿ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: K22G */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18562 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Application f60313;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8121 f60314;

    public RunnableC18562(Application application, C8121 c8121) {
        this.f60313 = application;
        this.f60314 = c8121;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f60313.unregisterActivityLifecycleCallbacks(this.f60314);
    }
}
