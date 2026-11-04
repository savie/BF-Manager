package l;

/* JADX INFO: renamed from: l.ۢ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9806 extends AbstractC6323 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC2350 f31594;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9806(ActivityC2350 activityC2350) {
        super(true);
        this.f31594 = activityC2350;
    }

    @Override // l.AbstractC6323
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2768() {
        ActivityC2350 activityC2350 = this.f31594;
        if (activityC2350.f7593) {
            return;
        }
        if (activityC2350.f7583.m13084()) {
            activityC2350.f7583.m13082();
        } else if (activityC2350.f7587) {
            activityC2350.finish();
        } else {
            activityC2350.m7959();
        }
    }
}
