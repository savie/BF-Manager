package l;

/* JADX INFO: renamed from: l.ۙۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4697 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22597 f16583;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4697(ActivityC22597 activityC22597, ActivityC22597 activityC22598) {
        super(activityC22598, -1);
        this.f16583 = activityC22597;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        ActivityC22597 activityC22597 = this.f16583;
        C10662 c10662 = activityC22597.f73046;
        c10662.f33813.getItem(c10662.f33821).m47468(m22914());
        activityC22597.f73046.f33806 = true;
        activityC22597.f73050.notifyDataSetChanged();
        m22951();
    }
}
