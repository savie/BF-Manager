package l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ۤ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: K22G */
/* JADX INFO: loaded from: classes3.dex */
public final class C10509 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f35997;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f35998;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Activity f36001;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f35999 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f36000 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f36002 = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public C10509(Activity activity) {
        this.f36001 = activity;
        this.f35997 = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f36001 == activity) {
            this.f35999 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f36000 || this.f36002 || this.f35999 || !C7686.m20318(this.f35998, this.f35997, activity)) {
            return;
        }
        this.f36002 = true;
        this.f35998 = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f36001 == activity) {
            this.f36001 = null;
            this.f36000 = true;
        }
    }
}
