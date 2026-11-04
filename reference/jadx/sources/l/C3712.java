package l;

/* JADX INFO: renamed from: l.ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H56R */
/* JADX INFO: loaded from: classes3.dex */
public final class C3712 extends C5596 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f12738 = false;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12739;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20866 f12740;

    public C3712(C20866 c20866, int i) {
        this.f12740 = c20866;
        this.f12739 = i;
    }

    @Override // l.C5596, l.InterfaceC4020
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12073() {
        this.f12740.f66791.setVisibility(0);
    }

    @Override // l.InterfaceC4020
    public final void onAnimationEnd() {
        if (this.f12738) {
            return;
        }
        this.f12740.f66791.setVisibility(this.f12739);
    }

    @Override // l.C5596, l.InterfaceC4020
    public final void onAnimationCancel() {
        this.f12738 = true;
    }
}
