package l;

/* JADX INFO: renamed from: l.᩷ۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6MK */
/* JADX INFO: loaded from: classes.dex */
public final class C21969 implements InterfaceC9772 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22715 f70907;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15496 f70908;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15496 f70909;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f70910 = 0;

    public C21969(C22715 c22715, C15496 c15496, C15496 c15497) {
        this.f70907 = c22715;
        this.f70909 = c15496;
        this.f70908 = c15497;
    }

    @Override // l.InterfaceC9772
    /* JADX INFO: renamed from: ᩷ */
    public final void mo25484(AbstractC17734 abstractC17734, int i) {
        boolean z = abstractC17734 instanceof C15496;
        C22715 c22715 = this.f70907;
        if (z) {
            C15496 c15496 = (C15496) abstractC17734;
            if (c22715.f73713.m29026(c15496.m37100())) {
                C10780 c10780M51221 = C22715.m51221(c22715, c15496);
                C15496 c15497 = c10780M51221.f34210;
                this.f70908.m37084(c15497);
                this.f70910 += c10780M51221.f34211;
                this.f70908 = c15497;
                return;
            }
            if (abstractC17734 != this.f70909) {
                this.f70910++;
                return;
            }
            return;
        }
        if (abstractC17734 instanceof C12513) {
            this.f70908.m37084(new C12513(((C12513) abstractC17734).m56170()));
        } else if ((abstractC17734 instanceof C2906) && c22715.f73713.m29026(abstractC17734.mo37068().mo5151())) {
            this.f70908.m37084(new C2906(((C2906) abstractC17734).m56169()));
        } else {
            this.f70910++;
        }
    }

    @Override // l.InterfaceC9772
    /* JADX INFO: renamed from: ۙ */
    public final void mo25483(AbstractC17734 abstractC17734, int i) {
        if ((abstractC17734 instanceof C15496) && this.f70907.f73713.m29026(abstractC17734.mo5151())) {
            this.f70908 = this.f70908.mo37068();
        }
    }
}
