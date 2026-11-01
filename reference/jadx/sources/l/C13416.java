package l;

/* JADX INFO: renamed from: l.۬᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes4.dex */
public final class C13416 implements InterfaceC20267 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4242 f44377;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3761 f44378;

    @Override // l.InterfaceC8978
    /* JADX INFO: renamed from: ۘۙ */
    public final /* synthetic */ void mo2885() {
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        C4242 c4242 = this.f44377;
        return c4242.f15336.m13282() || c4242.f15337.mo9170() == EnumC9414.DESTROYED;
    }

    public C13416(C4242 c4242, C3761 c3761) {
        this.f44377 = c4242;
        this.f44378 = c3761;
    }

    @Override // l.InterfaceC20267
    /* JADX INFO: renamed from: ۙ */
    public final void mo3130(long j, long j2, long j3, long j4) {
        C3761 c3761 = this.f44378;
        c3761.m10994(j);
        C4242 c4242 = this.f44377;
        c4242.f15336.m13287(c3761);
        c4242.f15336.m13285(j4);
        c4242.f15336.m13284(c3761.m10996());
    }

    @Override // l.InterfaceC20267
    /* JADX INFO: renamed from: ܶۙ */
    public final C16842 mo3131() {
        return this.f44377.f15333;
    }
}
