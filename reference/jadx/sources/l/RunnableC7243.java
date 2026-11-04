package l;

import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YF */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7243 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnTouchListenerC5028 f23884;

    public RunnableC7243(AbstractViewOnTouchListenerC5028 abstractViewOnTouchListenerC5028) {
        this.f23884 = abstractViewOnTouchListenerC5028;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.f23884.f17429.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
