package l;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ܰ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC14470 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f45530;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewTreeObserver f45531;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25227 f45532;

    public ViewTreeObserverOnPreDrawListenerC14470(ViewTreeObserver viewTreeObserver, DialogInterfaceC8327 dialogInterfaceC8327, C25227 c25227) {
        this.f45531 = viewTreeObserver;
        this.f45530 = dialogInterfaceC8327;
        this.f45532 = c25227;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.f45531;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f45530;
        if (dialogInterfaceC8327 == null) {
            return true;
        }
        AbstractC3269 itemAnimator = this.f45532.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.m10757(new C4030(dialogInterfaceC8327));
            return true;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC20330(1, dialogInterfaceC8327));
        return true;
    }
}
