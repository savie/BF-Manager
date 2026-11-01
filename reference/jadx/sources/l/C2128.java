package l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: l.֫᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 763R */
/* JADX INFO: loaded from: classes2.dex */
public final class C2128 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C14830 f7794 = new C14830();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m6691(Activity activity) {
        f7794.getClass();
        C14830.m35509(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C13465.m32966(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C13465.m32966(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C13465.m32966(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C13465.m32966(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C13465.m32966(activity, "activity");
        C13465.m32966(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C13465.m32966(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C13465.m32966(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        C13465.m32966(activity, "activity");
        int i = FragmentC9891.f33768;
        C24002.m52832(activity, EnumC1651.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        C13465.m32966(activity, "activity");
        int i = FragmentC9891.f33768;
        C24002.m52832(activity, EnumC1651.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        C13465.m32966(activity, "activity");
        int i = FragmentC9891.f33768;
        C24002.m52832(activity, EnumC1651.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        C13465.m32966(activity, "activity");
        int i = FragmentC9891.f33768;
        C24002.m52832(activity, EnumC1651.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        C13465.m32966(activity, "activity");
        int i = FragmentC9891.f33768;
        C24002.m52832(activity, EnumC1651.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        C13465.m32966(activity, "activity");
        int i = FragmentC9891.f33768;
        C24002.m52832(activity, EnumC1651.ON_STOP);
    }
}
