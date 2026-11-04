package l;

import android.app.Activity;

/* JADX INFO: renamed from: l.ۨ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes4.dex */
public final class C12709 extends C4111 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4506 f40699;

    public C12709(C4506 c4506) {
        this.f40699 = c4506;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        C15243.m36590(activity, "activity");
        this.f40699.m14229();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        C15243.m36590(activity, "activity");
        this.f40699.m14228();
    }
}
