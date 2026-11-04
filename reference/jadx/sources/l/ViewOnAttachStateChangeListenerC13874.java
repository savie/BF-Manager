package l;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۬۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ1 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC13874 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21832 f44003;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f44004;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC13874(AbstractC21832 abstractC21832, AtomicBoolean atomicBoolean) {
        this.f44003 = abstractC21832;
        this.f44004 = atomicBoolean;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f44004.compareAndSet(true, false)) {
            this.f44003.m49492(EnumC4678.RETRY);
        }
    }
}
