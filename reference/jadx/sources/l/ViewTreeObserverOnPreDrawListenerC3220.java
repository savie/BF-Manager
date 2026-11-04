package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۗۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC3220 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f10493;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10494;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6204 f10495;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BooleanSupplier f10496;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3966 f10497;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewTreeObserverOnPreDrawListenerC3220(C3966 c3966, BooleanSupplier booleanSupplier, int i, Runnable runnable) {
        this.f10497 = c3966;
        this.f10496 = booleanSupplier;
        this.f10494 = i;
        this.f10493 = runnable;
        this.f10495 = new C6204(c3966);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.f10496.getAsBoolean()) {
            m10566();
            return true;
        }
        if (!this.f10495.m17842(this.f10494)) {
            return false;
        }
        m10566();
        Runnable runnable = this.f10493;
        if (runnable != null) {
            runnable.run();
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m10566();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10566() {
        C3966 c3966 = this.f10497;
        c3966.f13559.getViewTreeObserver().removeOnPreDrawListener(this);
        c3966.f13559.removeOnAttachStateChangeListener(this);
    }
}
