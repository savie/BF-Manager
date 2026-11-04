package l;

/* JADX INFO: renamed from: l.ۜ᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes4.dex */
public final class C7371 implements InterfaceC12943 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24263 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC22047 f24264;

    public C7371(AbstractActivityC22047 abstractActivityC22047) {
        this.f24264 = abstractActivityC22047;
    }

    @Override // l.InterfaceC12943
    /* JADX INFO: renamed from: ۙ */
    public final void mo15545(boolean z) {
        AbstractActivityC22047 abstractActivityC22047 = this.f24264;
        if (abstractActivityC22047.f71110 != null) {
            this.f24263 = abstractActivityC22047.f71110.isEnabled();
        }
        if (z == this.f24263) {
            return;
        }
        if (abstractActivityC22047.f71110 != null) {
            abstractActivityC22047.f71110.setEnabled(z);
        }
        this.f24263 = z;
        String strMo1386 = abstractActivityC22047.mo1386();
        if (z) {
            strMo1386 = C14483.m34972(strMo1386, "*");
        }
        abstractActivityC22047.setTitle(strMo1386);
    }

    @Override // l.InterfaceC12943
    /* JADX INFO: renamed from: ۙ */
    public final void mo15546(boolean z, boolean z2) {
        AbstractActivityC22047 abstractActivityC22047 = this.f24264;
        if (abstractActivityC22047.f71107 != null) {
            abstractActivityC22047.f71107.setEnabled(z);
        }
        if (abstractActivityC22047.f71103 != null) {
            abstractActivityC22047.f71103.setEnabled(z2);
        }
    }
}
