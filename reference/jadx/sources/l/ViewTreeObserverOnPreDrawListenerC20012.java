package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.᩶ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC20012 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BooleanSupplier f64067;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f64068;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12251 f64069;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f64070;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5900 f64071;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewTreeObserverOnPreDrawListenerC20012(C5900 c5900, BooleanSupplier booleanSupplier, int i, Runnable runnable) {
        this.f64071 = c5900;
        this.f64067 = booleanSupplier;
        this.f64068 = i;
        this.f64070 = runnable;
        this.f64069 = new C12251(c5900);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.f64067.getAsBoolean()) {
            m45315();
            return true;
        }
        if (!this.f64069.m30458(this.f64068)) {
            return false;
        }
        m45315();
        Runnable runnable = this.f64070;
        if (runnable != null) {
            runnable.run();
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m45315();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45315() {
        C5900 c5900 = this.f64071;
        c5900.f20120.getViewTreeObserver().removeOnPreDrawListener(this);
        c5900.f20120.removeOnAttachStateChangeListener(this);
    }
}
