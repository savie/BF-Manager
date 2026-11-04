package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes5.dex */
public final class C14840 extends AbstractC6323 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19974 f48532;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C24720 f48533;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14840(ActivityC19974 activityC19974) {
        super(true);
        this.f48532 = activityC19974;
        this.f48533 = C24720.m55196();
    }

    @Override // l.AbstractC6323
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2768() {
        ActivityC19974 activityC19974 = this.f48532;
        if (activityC19974.f64183 != null && activityC19974.f64183.m36517() == 0 && activityC19974.f64184.f28993.m27888()) {
            return;
        }
        if (this.f48533.m55200()) {
            C22673.m51157();
            activityC19974.finish();
        } else {
            C22673.m51152(R.string.MT_Protector);
        }
    }
}
