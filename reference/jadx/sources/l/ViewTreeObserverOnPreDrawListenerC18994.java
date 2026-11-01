package l;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ᩴ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC18994 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewTreeObserver f61473;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f61474;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17492 f61475;

    public ViewTreeObserverOnPreDrawListenerC18994(ViewTreeObserver viewTreeObserver, DialogInterfaceC19356 dialogInterfaceC19356, C17492 c17492) {
        this.f61473 = viewTreeObserver;
        this.f61474 = dialogInterfaceC19356;
        this.f61475 = c17492;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.f61473;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f61474;
        if (dialogInterfaceC19356 == null) {
            return true;
        }
        AbstractC1825 itemAnimator = this.f61475.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.m5958(new C18288(dialogInterfaceC19356));
            return true;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC16260(3, dialogInterfaceC19356));
        return true;
    }
}
