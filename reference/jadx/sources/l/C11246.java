package l;

/* JADX INFO: renamed from: l.ۧ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5MM */
/* JADX INFO: loaded from: classes4.dex */
public final class C11246 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23946 f38039;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11246(ActivityC23946 activityC23946, ActivityC23946 activityC23947) {
        super(activityC23947, -1);
        this.f38039 = activityC23946;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        try {
            this.f38039.f77669.f33623.f56225 = Integer.parseInt(m40352().trim());
            ActivityC3588.f13200 = true;
            m40364();
        } catch (Exception e) {
            m40347(e.getMessage());
        }
    }
}
