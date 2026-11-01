package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩷ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20619 extends C16386 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23711 f67166;

    public C20619(EnumC0157 enumC0157, EnumC19914 enumC19914, C23711 c23711, C0921 c0921) {
        super(enumC0157, enumC19914, c23711.m52206(), c0921);
        this.f67166 = c23711;
    }

    @Override // l.C16386
    /* JADX INFO: renamed from: ۬ */
    public final void mo38578() {
        EnumC19914 enumC19914M38576 = m38576();
        EnumC19914 enumC19914 = EnumC19914.ADDING;
        C23711 c23711 = this.f67166;
        if (enumC19914M38576 == enumC19914) {
            ComponentCallbacksC22654 componentCallbacksC22654M52206 = c23711.m52206();
            View viewFindFocus = componentCallbacksC22654M52206.mView.findFocus();
            if (viewFindFocus != null) {
                componentCallbacksC22654M52206.setFocusedView(viewFindFocus);
                if (AbstractC8894.m23060(2)) {
                    viewFindFocus.toString();
                    componentCallbacksC22654M52206.toString();
                }
            }
            View viewRequireView = m38571().requireView();
            if (viewRequireView.getParent() == null) {
                c23711.m52207();
                viewRequireView.setAlpha(0.0f);
            }
            if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                viewRequireView.setVisibility(4);
            }
            viewRequireView.setAlpha(componentCallbacksC22654M52206.getPostOnViewCreatedAlpha());
            return;
        }
        if (m38576() == EnumC19914.REMOVING) {
            ComponentCallbacksC22654 componentCallbacksC22654M52207 = c23711.m52206();
            View viewRequireView2 = componentCallbacksC22654M52207.requireView();
            if (AbstractC8894.m23060(2)) {
                C13638.toString(viewRequireView2.findFocus());
                viewRequireView2.toString();
                componentCallbacksC22654M52207.toString();
            }
            viewRequireView2.clearFocus();
        }
    }

    @Override // l.C16386
    /* JADX INFO: renamed from: ܰ */
    public final void mo38579() {
        super.mo38579();
        this.f67166.m52211();
    }
}
