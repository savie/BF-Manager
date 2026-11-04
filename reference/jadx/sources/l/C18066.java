package l;

/* JADX INFO: renamed from: l.ܿۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5MM */
/* JADX INFO: loaded from: classes5.dex */
public final class C18066 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0167 f59140;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18066(ActivityC0167 activityC0167, ActivityC0167 activityC0168) {
        super(activityC0168, -1);
        this.f59140 = activityC0167;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        try {
            this.f59140.f1205.f39464.f23204 = Integer.parseInt(m22914().trim());
            ActivityC22957.f74567 = true;
            m22951();
        } catch (Exception e) {
            m22925(e.getMessage());
        }
    }
}
