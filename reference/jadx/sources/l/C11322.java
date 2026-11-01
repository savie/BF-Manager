package l;

import android.app.Activity;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۧ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W52J */
/* JADX INFO: loaded from: classes3.dex */
public final class C11322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f38212;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f38213 = true;

    public C11322(Activity activity) {
        C13890.m33727();
        activity.runOnUiThread(new RunnableC7228(3, this, activity));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28380(C11322 c11322) {
        c11322.f38213 = false;
        c11322.f38212 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28379(C11322 c11322) {
        c11322.f38213 = false;
        c11322.f38212 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28381() {
        C13890.m33727();
        while (this.f38213) {
            SystemClock.sleep(100L);
        }
        return this.f38212;
    }
}
