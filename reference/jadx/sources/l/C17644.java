package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܽܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17644 implements InterfaceC11520 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12423 f58013;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20981 f58014;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f58015;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f58016;

    public C17644(View view, ViewGroup viewGroup, C12423 c12423, C20981 c20981) {
        this.f58016 = view;
        this.f58015 = viewGroup;
        this.f58013 = c12423;
        this.f58014 = c20981;
    }

    @Override // l.InterfaceC11520
    /* JADX INFO: renamed from: ۙ */
    public final void mo22385() {
        View view = this.f58016;
        view.clearAnimation();
        this.f58015.endViewTransition(view);
        this.f58013.m18238();
        if (AbstractC3191.m10427(2)) {
            C17359.toString(this.f58014);
        }
    }
}
