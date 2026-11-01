package l;

/* JADX INFO: renamed from: l.ܽۛ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16456 extends AbstractC19432 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10957 f52916;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16456(ActivityC10957 activityC10957) {
        super(true);
        this.f52916 = activityC10957;
    }

    @Override // l.AbstractC19432
    /* JADX INFO: renamed from: ܰ */
    public final void mo4707() {
        ActivityC10957 activityC10957 = this.f52916;
        if (activityC10957.f37304.getVisibility() == 0) {
            ActivityC10957.m27702(activityC10957);
        } else {
            activityC10957.finish();
        }
    }
}
