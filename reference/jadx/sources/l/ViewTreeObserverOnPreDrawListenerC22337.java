package l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5XN */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC22337 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f72923;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Runnable f72924;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f72925;

    public ViewTreeObserverOnPreDrawListenerC22337(View view, Runnable runnable) {
        this.f72925 = view;
        this.f72923 = view.getViewTreeObserver();
        this.f72924 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49503(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC22337 viewTreeObserverOnPreDrawListenerC22337 = new ViewTreeObserverOnPreDrawListenerC22337(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC22337);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC22337);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f72923.isAlive();
        View view = this.f72925;
        if (zIsAlive) {
            this.f72923.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f72924.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f72923.isAlive();
        View view2 = this.f72925;
        if (zIsAlive) {
            this.f72923.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f72923 = view.getViewTreeObserver();
    }
}
