package l;

/* JADX INFO: renamed from: l.۠۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8643 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22597 f28238;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8643(ActivityC22597 activityC22597, ActivityC22597 activityC22598) {
        super(activityC22598, -1);
        this.f28238 = activityC22597;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (strM22914.length() > 0) {
            ActivityC22597 activityC22597 = this.f28238;
            activityC22597.f73046.f33804.m56369(strM22914);
            activityC22597.f73050.notifyDataSetChanged();
            activityC22597.f73046.f33806 = true;
        }
        m22951();
    }
}
