package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۙ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes3.dex */
public final class C4308 extends AbstractC20537 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC22654 f15481;

    public C4308(ComponentCallbacksC22654 componentCallbacksC22654) {
        this.f15481 = componentCallbacksC22654;
    }

    @Override // l.AbstractC20537
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View mo12110(int i) {
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f15481;
        View view = componentCallbacksC22654.mView;
        if (view == null) {
            throw new IllegalStateException("Fragment " + componentCallbacksC22654 + " does not have a view");
        }
        return view.findViewById(i);
    }

    @Override // l.AbstractC20537
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo12111() {
        return this.f15481.mView != null;
    }
}
