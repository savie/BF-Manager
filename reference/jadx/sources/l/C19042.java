package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ᩴ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19042 implements InterfaceC22089 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f61595;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7753 f61596;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16386 f61597;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f61598;

    public C19042(View view, ViewGroup viewGroup, C7753 c7753, C16386 c16386) {
        this.f61595 = view;
        this.f61598 = viewGroup;
        this.f61596 = c7753;
        this.f61597 = c16386;
    }

    @Override // l.InterfaceC22089
    /* JADX INFO: renamed from: ۙ */
    public final void mo18972() {
        View view = this.f61595;
        view.clearAnimation();
        this.f61598.endViewTransition(view);
        this.f61596.m47610();
        if (AbstractC8894.m23060(2)) {
            C13638.toString(this.f61597);
        }
    }
}
