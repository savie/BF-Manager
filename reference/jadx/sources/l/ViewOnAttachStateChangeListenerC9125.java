package l;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۡ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ1 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC9125 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7713 f31062;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f31063;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC9125(AbstractC7713 abstractC7713, AtomicBoolean atomicBoolean) {
        this.f31062 = abstractC7713;
        this.f31063 = atomicBoolean;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f31063.compareAndSet(true, false)) {
            this.f31062.m20351(EnumC10536.RETRY);
        }
    }
}
