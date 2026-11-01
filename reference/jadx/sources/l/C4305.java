package l;

/* JADX INFO: renamed from: l.ۙ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 28AQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4305 implements InterfaceC20267 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16842 f15477;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13479 f15478;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10594 f15479;

    public C4305(C13479 c13479, InterfaceC10594 interfaceC10594, C16842 c16842) {
        this.f15478 = c13479;
        this.f15479 = interfaceC10594;
        this.f15477 = c16842;
    }

    @Override // l.InterfaceC20267
    /* JADX INFO: renamed from: ۙ */
    public final void mo3130(long j, long j2, long j3, long j4) {
        C13479 c13479 = this.f15478;
        c13479.f44556.m10994(j);
        C21026 c21026 = c13479.f44556;
        InterfaceC10594 interfaceC10594 = this.f15479;
        interfaceC10594.mo24047(c21026);
        interfaceC10594.mo24048(j4);
        interfaceC10594.setProgress(c13479.f44556.m10996());
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f15478.f44558.mo2357();
    }

    @Override // l.InterfaceC20267
    /* JADX INFO: renamed from: ܶۙ */
    public final C16842 mo3131() {
        return this.f15477;
    }

    @Override // l.InterfaceC8978
    /* JADX INFO: renamed from: ۘۙ */
    public final void mo2885() {
        String str = (String) this.f15478.f44557.get();
        if (str != null) {
            this.f15479.setName(str);
        }
    }
}
