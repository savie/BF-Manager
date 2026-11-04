package l;

/* JADX INFO: renamed from: l.᩵֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20249 implements InterfaceC12943 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC2350 f65034;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f65035;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f65036;

    public C20249(ActivityC2350 activityC2350, boolean z, C24132 c24132) {
        this.f65034 = activityC2350;
        this.f65035 = z;
        this.f65036 = c24132;
    }

    @Override // l.InterfaceC12943
    /* JADX INFO: renamed from: ۙ */
    public final void mo15545(boolean z) {
        ActivityC2350 activityC2350 = this.f65034;
        boolean z2 = this.f65035;
        if (z2) {
            activityC2350.f7577.m6477(z);
        } else {
            activityC2350.f7577.m6467(z);
        }
        if (this.f65036 != activityC2350.f7578.m55666()) {
            return;
        }
        if (z2) {
            activityC2350.m7953();
        } else {
            activityC2350.m7948();
        }
    }

    @Override // l.InterfaceC12943
    /* JADX INFO: renamed from: ۙ */
    public final void mo15546(boolean z, boolean z2) {
        ActivityC2350 activityC2350 = this.f65034;
        if (this.f65036 != activityC2350.f7578.m55666()) {
            return;
        }
        activityC2350.f7577.m6482(z);
        activityC2350.f7577.m6484(z2);
    }
}
