package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ᩳۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes5.dex */
public final class C19056 extends AbstractC16535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10105 f61749;

    public C19056(C10105 c10105) {
        this.f61749 = c10105;
    }

    @Override // l.AbstractC16535, l.InterfaceC11314
    public final void onAnimationEnd() {
        C10105 c10105 = this.f61749;
        ViewGroup viewGroup = c10105.f32375;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
            c10105.f32375 = null;
        }
        c10105.f32377 = null;
    }
}
