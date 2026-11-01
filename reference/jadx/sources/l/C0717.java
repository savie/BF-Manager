package l;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: l.֡᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0717 extends C19997 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12713 f2994;

    public C0717(C12713 c12713) {
        this.f2994 = c12713;
    }

    @Override // l.C19997, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C13465.m32966(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC9891.f33768;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C13465.m32963((Object) fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC9891) fragmentFindFragmentByTag).m25035(this.f2994.f42397);
        }
    }

    @Override // l.C19997, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C13465.m32966(activity, "activity");
        this.f2994.m31564();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        C13465.m32966(activity, "activity");
        C16241.m38360(activity, new C20474(this.f2994));
    }

    @Override // l.C19997, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C13465.m32966(activity, "activity");
        this.f2994.m31563();
    }
}
