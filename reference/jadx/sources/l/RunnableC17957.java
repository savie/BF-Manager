package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X1Y5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17957 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57434;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57435;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57436;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57437;

    public /* synthetic */ RunnableC17957(Object obj, Object obj2, Object obj3, int i) {
        this.f57435 = i;
        this.f57437 = obj;
        this.f57434 = obj2;
        this.f57436 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f57435;
        Object obj = this.f57436;
        Object obj2 = this.f57434;
        Object obj3 = this.f57437;
        switch (i) {
            case 0:
                C19369.m44396((C19369) obj3, (C21422) obj2, (ArrayList) obj);
                break;
            default:
                View view = (View) obj2;
                View view2 = (View) obj;
                int i2 = ViewOnClickListenerC13209.f43954;
                view.setVisibility((((C17492) obj3).canScrollVertically(1) || view.getTop() < view2.getBottom()) ? 0 : 4);
                break;
        }
    }
}
