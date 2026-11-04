package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6ALU */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnLayoutChangeListenerC6449 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC24349 f21691;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C15243.m36585(view);
        view.removeOnLayoutChangeListener(this);
        AbstractC24349 abstractC24349 = this.f21691;
        AbstractC6323 abstractC6323 = abstractC24349.f78962;
        C15243.m36586(abstractC6323);
        abstractC6323.m18045(((C10045) abstractC24349.requireView()).m25944() && ((C10045) abstractC24349.requireView()).m25948());
    }

    public ViewOnLayoutChangeListenerC6449(AbstractC24349 abstractC24349) {
        this.f21691 = abstractC24349;
    }
}
