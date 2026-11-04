package l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5XN */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC12794 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Runnable f40923;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f40924;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f40925;

    public ViewTreeObserverOnPreDrawListenerC12794(View view, Runnable runnable) {
        this.f40925 = view;
        this.f40924 = view.getViewTreeObserver();
        this.f40923 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31683(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC12794 viewTreeObserverOnPreDrawListenerC12794 = new ViewTreeObserverOnPreDrawListenerC12794(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC12794);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC12794);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f40924.isAlive();
        View view = this.f40925;
        if (zIsAlive) {
            this.f40924.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f40923.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f40924.isAlive();
        View view2 = this.f40925;
        if (zIsAlive) {
            this.f40924.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f40924 = view.getViewTreeObserver();
    }
}
