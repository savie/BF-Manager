package l;

import android.app.Activity;

/* JADX INFO: renamed from: l.᩶᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20474 extends C19997 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12713 f66413;

    public C20474(C12713 c12713) {
        this.f66413 = c12713;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        C13465.m32966(activity, "activity");
        this.f66413.m31567();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        C13465.m32966(activity, "activity");
        this.f66413.m31566();
    }
}
