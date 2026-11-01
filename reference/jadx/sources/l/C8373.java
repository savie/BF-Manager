package l;

/* JADX INFO: renamed from: l.۠᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8373 implements InterfaceC8228 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f29046 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC10490 f29047;

    public C8373(AbstractActivityC10490 abstractActivityC10490) {
        this.f29047 = abstractActivityC10490;
    }

    @Override // l.InterfaceC8228
    /* JADX INFO: renamed from: ۙ */
    public final void mo3560(boolean z) {
        AbstractActivityC10490 abstractActivityC10490 = this.f29047;
        if (abstractActivityC10490.f35944 != null) {
            this.f29046 = abstractActivityC10490.f35944.isEnabled();
        }
        if (z == this.f29046) {
            return;
        }
        if (abstractActivityC10490.f35944 != null) {
            abstractActivityC10490.f35944.setEnabled(z);
        }
        this.f29046 = z;
        String strMo7997 = abstractActivityC10490.mo7997();
        if (z) {
            strMo7997 = C15489.m37076(strMo7997, "*");
        }
        abstractActivityC10490.setTitle(strMo7997);
    }

    @Override // l.InterfaceC8228
    /* JADX INFO: renamed from: ۙ */
    public final void mo3561(boolean z, boolean z2) {
        AbstractActivityC10490 abstractActivityC10490 = this.f29047;
        if (abstractActivityC10490.f35942 != null) {
            abstractActivityC10490.f35942.setEnabled(z);
        }
        if (abstractActivityC10490.f35939 != null) {
            abstractActivityC10490.f35939.setEnabled(z2);
        }
    }
}
