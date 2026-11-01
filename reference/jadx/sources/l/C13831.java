package l;

/* JADX INFO: renamed from: l.ܰ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13831 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13125 f45645;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13831(ActivityC13125 activityC13125, ActivityC13125 activityC13126) {
        super(activityC13126, -1);
        this.f45645 = activityC13125;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (strM40352.length() > 0) {
            ActivityC13125 activityC13125 = this.f45645;
            activityC13125.f43713.f5080.m19387(strM40352);
            activityC13125.f43711.notifyDataSetChanged();
            activityC13125.f43713.f5074 = true;
        }
        m40364();
    }
}
