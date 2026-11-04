package l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: l.۟᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P96C */
/* JADX INFO: loaded from: classes3.dex */
public final class C8235 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0777 f27093 = new C0777();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m22152(Activity activity) {
        f27093.getClass();
        C0777.m3177(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C15243.m36590(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C15243.m36590(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C15243.m36590(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C15243.m36590(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C15243.m36590(activity, "activity");
        C15243.m36590(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C15243.m36590(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C15243.m36590(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        C15243.m36590(activity, "activity");
        int i = FragmentC19422.f62761;
        C18676.m43427(activity, EnumC9330.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        C15243.m36590(activity, "activity");
        int i = FragmentC19422.f62761;
        C18676.m43427(activity, EnumC9330.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        C15243.m36590(activity, "activity");
        int i = FragmentC19422.f62761;
        C18676.m43427(activity, EnumC9330.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        C15243.m36590(activity, "activity");
        int i = FragmentC19422.f62761;
        C18676.m43427(activity, EnumC9330.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        C15243.m36590(activity, "activity");
        int i = FragmentC19422.f62761;
        C18676.m43427(activity, EnumC9330.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        C15243.m36590(activity, "activity");
        int i = FragmentC19422.f62761;
        C18676.m43427(activity, EnumC9330.ON_STOP);
    }
}
