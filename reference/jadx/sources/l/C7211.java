package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.۟ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7211 extends C9640 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4471 f24022;

    public C7211(ActivityC4471 activityC4471) {
        this.f24022 = activityC4471;
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ۙ */
    public final void mo7023(ResultCallback resultCallback) {
        ActivityC4471 activityC4471 = this.f24022;
        if (activityC4471.f15885.f32341.booleanValue()) {
            super.mo7023(resultCallback);
        } else {
            ActivityC4471.m12460(activityC4471, true, false, resultCallback);
        }
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo7024() {
        ActivityC4471 activityC4471 = this.f24022;
        return !activityC4471.f15885.f32341.booleanValue() && activityC4471.f15887.m9091().m17040();
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ۨ */
    public final String mo15468() {
        ActivityC4471 activityC4471 = this.f24022;
        if (activityC4471.f15885.f32340 == null && activityC4471.f15885.f32339 != null) {
            return activityC4471.f15885.f32339.mo33986();
        }
        return null;
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ܰ */
    public final String mo7025() {
        ActivityC4471 activityC4471 = this.f24022;
        if (activityC4471.f15885.f32340 != null) {
            return activityC4471.f15885.f32340;
        }
        return activityC4471.f15885.f32339 != null ? activityC4471.f15885.f32339.getName() : "";
    }
}
