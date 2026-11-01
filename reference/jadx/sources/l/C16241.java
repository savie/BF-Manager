package l;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: renamed from: l.ܺ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16241 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m38360(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C13465.m32966(activity, "activity");
        C13465.m32966(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
