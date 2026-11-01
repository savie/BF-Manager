package l;

/* JADX INFO: renamed from: l.ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H56R */
/* JADX INFO: loaded from: classes5.dex */
public final class C15406 extends C10336 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f50223 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50224;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21755 f50225;

    public C15406(C21755 c21755, int i) {
        this.f50225 = c21755;
        this.f50224 = i;
    }

    @Override // l.C10336, l.InterfaceC15616
    /* JADX INFO: renamed from: ۙ */
    public final void mo12847() {
        this.f50225.f70507.setVisibility(0);
    }

    @Override // l.InterfaceC15616
    public final void onAnimationEnd() {
        if (this.f50223) {
            return;
        }
        this.f50225.f70507.setVisibility(this.f50224);
    }

    @Override // l.C10336, l.InterfaceC15616
    public final void onAnimationCancel() {
        this.f50223 = true;
    }
}
