package l;

import android.app.Activity;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩺ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W52J */
/* JADX INFO: loaded from: classes.dex */
public final class C24253 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f78542;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f78543 = true;

    public C24253(Activity activity) {
        C22415.m50556();
        activity.runOnUiThread(new RunnableC14461(5, this, activity));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m54265(C24253 c24253) {
        c24253.f78543 = false;
        c24253.f78542 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m54264(C24253 c24253) {
        c24253.f78543 = false;
        c24253.f78542 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54266() {
        C22415.m50556();
        while (this.f78543) {
            SystemClock.sleep(100L);
        }
        return this.f78542;
    }
}
