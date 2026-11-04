package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.᩹֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23233 extends C9959 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC2350 f75261;

    public C23233(ActivityC2350 activityC2350) {
        this.f75261 = activityC2350;
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ۙ */
    public final void mo4581(ResultCallback resultCallback) {
        ActivityC2350 activityC2350 = this.f75261;
        if (activityC2350.f7585.f3541.booleanValue()) {
            super.mo4581(resultCallback);
        } else {
            ActivityC2350.m7936(activityC2350, true, false, resultCallback);
        }
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4582() {
        ActivityC2350 activityC2350 = this.f75261;
        return !activityC2350.f7585.f3541.booleanValue() && activityC2350.f7578.m55686().m53890();
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ۤ */
    public final String mo10079() {
        ActivityC2350 activityC2350 = this.f75261;
        if (activityC2350.f7585.f3537 == null && activityC2350.f7585.f3543 != null) {
            return activityC2350.f7585.f3543.mo4294();
        }
        return null;
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ᩷ */
    public final String mo4583() {
        ActivityC2350 activityC2350 = this.f75261;
        if (activityC2350.f7585.f3537 != null) {
            return activityC2350.f7585.f3537;
        }
        return activityC2350.f7585.f3543 != null ? activityC2350.f7585.f3543.getName() : "";
    }
}
