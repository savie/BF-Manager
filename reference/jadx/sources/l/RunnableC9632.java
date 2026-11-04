package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۡ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V7F9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9632 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31147;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31148;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31149;

    public /* synthetic */ RunnableC9632(int i, Object obj, Object obj2) {
        this.f31147 = i;
        this.f31149 = obj;
        this.f31148 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31147) {
            case 0:
                C8887.m23766((C8887) this.f31149, (MenuItem[]) this.f31148);
                break;
            default:
                ActivityC0848 activityC0848 = (ActivityC0848) this.f31149;
                ((C20283) this.f31148).m46584(activityC0848, activityC0848.f3180);
                break;
        }
    }
}
