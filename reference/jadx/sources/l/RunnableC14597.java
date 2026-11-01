package l;

import android.view.ViewParent;

/* JADX INFO: renamed from: l.ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YF */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC14597 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnTouchListenerC9658 f47770;

    public RunnableC14597(AbstractViewOnTouchListenerC9658 abstractViewOnTouchListenerC9658) {
        this.f47770 = abstractViewOnTouchListenerC9658;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.f47770.f32475.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
