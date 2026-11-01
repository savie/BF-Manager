package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۢܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6ALU */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnLayoutChangeListenerC9692 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3340 f32658;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C13465.m32961(view);
        view.removeOnLayoutChangeListener(this);
        AbstractC3340 abstractC3340 = this.f32658;
        AbstractC19432 abstractC19432 = abstractC3340.f12365;
        C13465.m32962(abstractC19432);
        abstractC19432.m44475(((C22246) abstractC3340.requireView()).m49392() && ((C22246) abstractC3340.requireView()).m49386());
    }

    public ViewOnLayoutChangeListenerC9692(AbstractC3340 abstractC3340) {
        this.f32658 = abstractC3340;
    }
}
