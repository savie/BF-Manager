package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۨܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 7ANL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12414 extends AbstractC6323 implements InterfaceC18250 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC24349 f39914;

    @Override // l.InterfaceC18250
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30883(View view) {
        C15243.m36590(view, "panel");
    }

    @Override // l.InterfaceC18250
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo30884(View view) {
        C15243.m36590(view, "panel");
        m18045(false);
    }

    @Override // l.InterfaceC18250
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo30885(View view) {
        C15243.m36590(view, "panel");
        m18045(true);
    }

    public C12414(AbstractC24349 abstractC24349) {
        super(true);
        this.f39914 = abstractC24349;
        ((C10045) abstractC24349.requireView()).m25938(this);
    }

    @Override // l.AbstractC6323
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2768() {
        ((C10045) this.f39914.requireView()).m25935();
    }
}
