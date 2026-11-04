package l;

/* JADX INFO: renamed from: l.ܺۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16574 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23288 f53647;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16574(ActivityC23288 activityC23288, ActivityC23288 activityC23289) {
        super(activityC23289, -1);
        this.f53647 = activityC23288;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        ActivityC23288 activityC23288 = this.f53647;
        activityC23288.f75446.f51488.f48832.getItem(activityC23288.f75446.f51485).m47468(m22914());
        activityC23288.f75446.f51490 = true;
        activityC23288.f75448.notifyDataSetChanged();
        m22951();
    }
}
