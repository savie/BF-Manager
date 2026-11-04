package l;

import android.view.View;

/* JADX INFO: renamed from: l.۬ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13914 extends AbstractC24293 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC11612 f44126;

    public C13914(ComponentCallbacksC11612 componentCallbacksC11612) {
        this.f44126 = componentCallbacksC11612;
    }

    @Override // l.AbstractC24293
    /* JADX INFO: renamed from: ۙ */
    public final View mo21642(int i) {
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f44126;
        View view = componentCallbacksC11612.mView;
        if (view == null) {
            throw new IllegalStateException("Fragment " + componentCallbacksC11612 + " does not have a view");
        }
        return view.findViewById(i);
    }

    @Override // l.AbstractC24293
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo21643() {
        return this.f44126.mView != null;
    }
}
