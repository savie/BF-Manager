package l;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ۛ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6744 extends C4111 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4506 f22466;

    public C6744(C4506 c4506) {
        this.f22466 = c4506;
    }

    @Override // l.C4111, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C15243.m36590(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC19422.f62761;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C15243.m36587((Object) fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC19422) fragmentFindFragmentByTag).m44916(this.f22466.f16085);
        }
    }

    @Override // l.C4111, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C15243.m36590(activity, "activity");
        this.f22466.m14226();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        C15243.m36590(activity, "activity");
        C20914.m47776(activity, new C12709(this.f22466));
    }

    @Override // l.C4111, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C15243.m36590(activity, "activity");
        this.f22466.m14230();
    }
}
