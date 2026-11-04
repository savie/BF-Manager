package l;

/* JADX INFO: renamed from: l.᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 64NR */
/* JADX INFO: loaded from: classes.dex */
public final class C23961 implements InterfaceC4020 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f77552 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3823 f77553;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f77554;

    public C23961(AbstractC3823 abstractC3823) {
        this.f77553 = abstractC3823;
    }

    @Override // l.InterfaceC4020
    /* JADX INFO: renamed from: ۙ */
    public final void mo12073() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f77552 = false;
    }

    @Override // l.InterfaceC4020
    public final void onAnimationEnd() {
        if (this.f77552) {
            return;
        }
        AbstractC3823 abstractC3823 = this.f77553;
        abstractC3823.f13035 = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f77554);
    }

    @Override // l.InterfaceC4020
    public final void onAnimationCancel() {
        this.f77552 = true;
    }
}
