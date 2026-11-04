package l;

/* JADX INFO: renamed from: l.۬᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes4.dex */
public final class C14082 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC22047 f44586;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f44587;

    public C14082(AbstractActivityC22047 abstractActivityC22047) {
        this.f44586 = abstractActivityC22047;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        AbstractActivityC22047 abstractActivityC22047 = this.f44586;
        abstractActivityC22047.f71108.m53900(abstractActivityC22047.f71101, true, false);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        AbstractActivityC22047 abstractActivityC22047 = this.f44586;
        abstractActivityC22047.f71108.m53892(abstractActivityC22047.mo1388(), new C13557());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        AbstractActivityC22047 abstractActivityC22047 = this.f44586;
        abstractActivityC22047.f71108.m54093();
        abstractActivityC22047.f71108.m54016(false);
        abstractActivityC22047.f71108.m54048();
        if (abstractActivityC22047.f71103 != null) {
            abstractActivityC22047.f71103.setEnabled(false);
        }
        if (abstractActivityC22047.f71107 != null) {
            abstractActivityC22047.f71107.setEnabled(false);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f44587 = true;
        AbstractActivityC22047 abstractActivityC22047 = this.f44586;
        abstractActivityC22047.f71108.setEnabled(false);
        abstractActivityC22047.f71108.m54016(false);
        abstractActivityC22047.f71108.setFocusable(false);
        abstractActivityC22047.f71108.setFocusableInTouchMode(false);
        abstractActivityC22047.f71106.m16627(false);
        abstractActivityC22047.m40402((Throwable) exc, true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        AbstractActivityC22047 abstractActivityC22047 = this.f44586;
        abstractActivityC22047.f71108.m53900(abstractActivityC22047.f71101, false, !this.f44587);
    }
}
