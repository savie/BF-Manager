package l;

/* JADX INFO: renamed from: l.ܺۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16659 implements InterfaceC6917 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15913 f53822;

    public C16659(ActivityC15913 activityC15913) {
        this.f53822 = activityC15913;
    }

    @Override // l.InterfaceC6917
    /* JADX INFO: renamed from: ۙ */
    public final void mo19203(int i) {
        ActivityC15913 activityC15913 = this.f53822;
        activityC15913.m37937();
        activityC15913.f51693.f56592 = activityC15913.m37903(i).getPath();
        activityC15913.f51693.f56596 = null;
        activityC15913.m37902();
    }

    @Override // l.InterfaceC6917
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19204(int i) {
        ActivityC15913.m37905(this.f53822, i);
    }

    @Override // l.InterfaceC6917
    /* JADX INFO: renamed from: ۙ */
    public final void mo19201() {
        ActivityC15913 activityC15913 = this.f53822;
        if (activityC15913.f51687 != null && activityC15913.f51687.m25313()) {
            activityC15913.f51687.m25312();
            return;
        }
        AbstractC13628 abstractC13628 = activityC15913.f51696;
        abstractC13628.getClass();
        if ((abstractC13628 instanceof C0205) || C6790.m18961(activityC15913.m37925()) || activityC15913.f51690 == null || !activityC15913.f51690.m50541(activityC15913.f51696.mo1650())) {
            activityC15913.m37936(!activityC15913.f51693.f56597);
        } else {
            activityC15913.f51690.m50543();
        }
    }

    @Override // l.InterfaceC6917
    /* JADX INFO: renamed from: ۙ */
    public final void mo19202(float f) {
        ActivityC15913 activityC15913 = this.f53822;
        float f2 = 1.0f - f;
        activityC15913.f56046.setAlpha(f2);
        activityC15913.f51688.setAlpha(f2);
        boolean z = activityC15913.f51702 > 0.0f;
        activityC15913.f51702 = f;
        if (z != (f > 0.0f)) {
            if (!activityC15913.f51689 && !activityC15913.isFinishing() && !activityC15913.isDestroyed()) {
                if (f > 0.0f && activityC15913.f51709) {
                    activityC15913.m37924(true);
                } else if (f == 0.0f && activityC15913.f51704) {
                    activityC15913.m37924(false);
                }
            }
            activityC15913.m37912();
        }
    }

    @Override // l.InterfaceC6917
    public final void onDismiss() {
        this.f53822.m37933(true);
    }
}
