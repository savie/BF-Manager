package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6065 extends C20981 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9902 f20710;

    public C6065(EnumC14267 enumC14267, EnumC3827 enumC3827, C9902 c9902, C24947 c24947) {
        super(enumC14267, enumC3827, c9902.m25719(), c24947);
        this.f20710 = c9902;
    }

    @Override // l.C20981
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo17571() {
        EnumC3827 enumC3827M47962 = m47962();
        EnumC3827 enumC3827 = EnumC3827.ADDING;
        C9902 c9902 = this.f20710;
        if (enumC3827M47962 == enumC3827) {
            ComponentCallbacksC11612 componentCallbacksC11612M25719 = c9902.m25719();
            View viewFindFocus = componentCallbacksC11612M25719.mView.findFocus();
            if (viewFindFocus != null) {
                componentCallbacksC11612M25719.setFocusedView(viewFindFocus);
                if (AbstractC3191.m10427(2)) {
                    viewFindFocus.toString();
                    componentCallbacksC11612M25719.toString();
                }
            }
            View viewRequireView = m47964().requireView();
            if (viewRequireView.getParent() == null) {
                c9902.m25720();
                viewRequireView.setAlpha(0.0f);
            }
            if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                viewRequireView.setVisibility(4);
            }
            viewRequireView.setAlpha(componentCallbacksC11612M25719.getPostOnViewCreatedAlpha());
            return;
        }
        if (m47962() == EnumC3827.REMOVING) {
            ComponentCallbacksC11612 componentCallbacksC11612M257110 = c9902.m25719();
            View viewRequireView2 = componentCallbacksC11612M257110.requireView();
            if (AbstractC3191.m10427(2)) {
                C17359.toString(viewRequireView2.findFocus());
                viewRequireView2.toString();
                componentCallbacksC11612M257110.toString();
            }
            viewRequireView2.clearFocus();
        }
    }

    @Override // l.C20981
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo17572() {
        super.mo17572();
        this.f20710.m25725();
    }
}
