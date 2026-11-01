package l;

/* JADX INFO: renamed from: l.᩵᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19662 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC10490 f63115;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f63116;

    public C19662(AbstractActivityC10490 abstractActivityC10490) {
        this.f63115 = abstractActivityC10490;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        AbstractActivityC10490 abstractActivityC10490 = this.f63115;
        abstractActivityC10490.f35938.m16854(abstractActivityC10490.f35937, true, false);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        AbstractActivityC10490 abstractActivityC10490 = this.f63115;
        abstractActivityC10490.f35938.m16845(abstractActivityC10490.mo7995(), new C7087());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        AbstractActivityC10490 abstractActivityC10490 = this.f63115;
        abstractActivityC10490.f35938.m16902();
        abstractActivityC10490.f35938.m17057(false);
        abstractActivityC10490.f35938.m16949();
        if (abstractActivityC10490.f35939 != null) {
            abstractActivityC10490.f35939.setEnabled(false);
        }
        if (abstractActivityC10490.f35942 != null) {
            abstractActivityC10490.f35942.setEnabled(false);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f63116 = true;
        AbstractActivityC10490 abstractActivityC10490 = this.f63115;
        abstractActivityC10490.f35938.setEnabled(false);
        abstractActivityC10490.f35938.m17057(false);
        abstractActivityC10490.f35938.setFocusable(false);
        abstractActivityC10490.f35938.setFocusableInTouchMode(false);
        abstractActivityC10490.f35941.m39494(false);
        abstractActivityC10490.m31003((Throwable) exc, true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        AbstractActivityC10490 abstractActivityC10490 = this.f63115;
        abstractActivityC10490.f35938.m16854(abstractActivityC10490.f35937, false, !this.f63116);
    }
}
