package l;

import android.view.View;

/* JADX INFO: renamed from: l.۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC13518 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C10818 f42975;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13056 f42976;

    public RunnableC13518(C13056 c13056, C10818 c10818) {
        this.f42976 = c13056;
        this.f42975 = c10818;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13056 c13056 = this.f42976;
        if (c13056.f56497 != null) {
            c13056.f56497.changeMenuMode();
        }
        View view = (View) c13056.f56499;
        if (view != null && view.getWindowToken() != null) {
            C10818 c10818 = this.f42975;
            if (c10818.m36148()) {
                c13056.f41792 = c10818;
            }
        }
        c13056.f41778 = null;
    }
}
