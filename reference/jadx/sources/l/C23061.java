package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes.dex */
public final class C23061 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f74812;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8144 f74813;

    public C23061(AbstractActivityC17204 abstractActivityC17204) {
        this.f74812 = abstractActivityC17204;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8199(this.f74812, 300);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f74813 = C19331.m44714();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        AbstractActivityC17204 abstractActivityC17204 = this.f74812;
        if (abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed() || !abstractActivityC17204.getLifecycle().mo23076().m8762(EnumC2619.STARTED)) {
            return;
        }
        C23807 c23807M11951 = C3669.m11951();
        if (c23807M11951 != null && !c23807M11951.f77115.mo2982()) {
            C3669.m11940(abstractActivityC17204);
            return;
        }
        if (!C19331.m44720(this.f74813)) {
            C3669.m11940(abstractActivityC17204);
            return;
        }
        C12184 c12184M22022 = this.f74813.m22022();
        if (c12184M22022 != null) {
            new C3669(abstractActivityC17204);
            C3669.m11939(c12184M22022, this.f74813.m22023());
        } else {
            C22673.m51159(R.string.MT_Protector);
            if (abstractActivityC17204 instanceof ActivityC20823) {
                abstractActivityC17204.finish();
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        AbstractActivityC17204 abstractActivityC17204 = this.f74812;
        if (abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) {
            return;
        }
        abstractActivityC17204.m40402(exc, abstractActivityC17204 instanceof ActivityC20823);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
