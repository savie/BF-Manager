package l;

/* JADX INFO: renamed from: l.ܺۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15679 implements InterfaceC8228 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4471 f50905;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f50906;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f50907;

    public C15679(ActivityC4471 activityC4471, boolean z, C6111 c6111) {
        this.f50905 = activityC4471;
        this.f50906 = z;
        this.f50907 = c6111;
    }

    @Override // l.InterfaceC8228
    /* JADX INFO: renamed from: ۙ */
    public final void mo3560(boolean z) {
        ActivityC4471 activityC4471 = this.f50905;
        boolean z2 = this.f50906;
        if (z2) {
            activityC4471.f15897.m36075(z);
        } else {
            activityC4471.f15897.m36057(z);
        }
        if (this.f50907 != activityC4471.f15887.m9095()) {
            return;
        }
        if (z2) {
            activityC4471.m12450();
        } else {
            activityC4471.m12463();
        }
    }

    @Override // l.InterfaceC8228
    /* JADX INFO: renamed from: ۙ */
    public final void mo3561(boolean z, boolean z2) {
        ActivityC4471 activityC4471 = this.f50905;
        if (this.f50907 != activityC4471.f15887.m9095()) {
            return;
        }
        activityC4471.f15897.m36070(z);
        activityC4471.f15897.m36052(z2);
    }
}
