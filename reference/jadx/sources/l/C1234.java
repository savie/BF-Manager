package l;

/* JADX INFO: renamed from: l.֨ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C1234 extends AbstractC6323 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7135 f4486;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234(ActivityC7135 activityC7135) {
        super(true);
        this.f4486 = activityC7135;
    }

    @Override // l.AbstractC6323
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2768() {
        ActivityC7135 activityC7135 = this.f4486;
        if (activityC7135.f23595.getVisibility() == 0) {
            ActivityC7135.m19698(activityC7135);
        } else {
            activityC7135.finish();
        }
    }
}
