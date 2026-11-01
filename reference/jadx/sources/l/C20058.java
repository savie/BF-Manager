package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20058 extends AbstractC19432 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f64201;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20058(ActivityC11632 activityC11632) {
        super(true);
        this.f64201 = activityC11632;
    }

    @Override // l.AbstractC19432
    /* JADX INFO: renamed from: ܰ */
    public final void mo4707() {
        ActivityC11632 activityC11632 = this.f64201;
        if (activityC11632.f39061.m40473(8388611)) {
            if (activityC11632.f39077.m28846()) {
                activityC11632.f39077.m28844(true);
                return;
            } else {
                activityC11632.f39061.m40477(8388611);
                return;
            }
        }
        if (activityC11632.f39064 != -1) {
            ComponentCallbacksC22654 componentCallbacksC22654M23077 = activityC11632.m43943().m23077(R.id.MT_Protector);
            if ((componentCallbacksC22654M23077 instanceof C20409) && ((C20409) componentCallbacksC22654M23077).m46143()) {
                return;
            }
        }
        activityC11632.m29017(true);
    }
}
