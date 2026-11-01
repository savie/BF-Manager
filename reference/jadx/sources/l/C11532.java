package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11532 extends AbstractC19432 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C22959 f38761;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7298 f38762;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11532(ActivityC7298 activityC7298) {
        super(true);
        this.f38762 = activityC7298;
        this.f38761 = C22959.m50801();
    }

    @Override // l.AbstractC19432
    /* JADX INFO: renamed from: ܰ */
    public final void mo4707() {
        ActivityC7298 activityC7298 = this.f38762;
        if (activityC7298.f24235 != null && activityC7298.f24235.m44426() == 0 && activityC7298.f24234.f69596.m22541()) {
            return;
        }
        if (this.f38761.m50803()) {
            C15829.m37616();
            activityC7298.finish();
        } else {
            C15829.m37611(R.string.MT_Protector);
        }
    }
}
