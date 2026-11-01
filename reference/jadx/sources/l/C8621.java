package l;

/* JADX INFO: renamed from: l.ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8621 implements InterfaceC15616 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f29750 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC10032 f29751;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f29752;

    public C8621(AbstractC10032 abstractC10032) {
        this.f29751 = abstractC10032;
    }

    @Override // l.InterfaceC15616
    /* JADX INFO: renamed from: ۙ */
    public final void mo12847() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f29750 = false;
    }

    @Override // l.InterfaceC15616
    public final void onAnimationEnd() {
        if (this.f29750) {
            return;
        }
        AbstractC10032 abstractC10032 = this.f29751;
        abstractC10032.f34246 = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f29752);
    }

    @Override // l.InterfaceC15616
    public final void onAnimationCancel() {
        this.f29750 = true;
    }
}
