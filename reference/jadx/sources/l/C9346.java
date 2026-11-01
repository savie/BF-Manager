package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۢۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes4.dex */
public final class C9346 extends AbstractC9467 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2994 f31694;

    public C9346(C2994 c2994) {
        this.f31694 = c2994;
    }

    @Override // l.AbstractC9467, l.InterfaceC14406
    public final void onAnimationEnd() {
        C2994 c2994 = this.f31694;
        ViewGroup viewGroup = c2994.f11240;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
            c2994.f11240 = null;
        }
        c2994.f11238 = null;
    }
}
