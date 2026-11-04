package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ۗ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3095 extends C9959 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC2350 f10022;

    public C3095(ActivityC2350 activityC2350) {
        this.f10022 = activityC2350;
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ۙ */
    public final void mo4581(ResultCallback resultCallback) {
        ActivityC2350 activityC2350 = this.f10022;
        if (activityC2350.f7581.f3541.booleanValue()) {
            super.mo4581(resultCallback);
        } else {
            ActivityC2350.m7936(activityC2350, false, true, resultCallback);
        }
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4582() {
        ActivityC2350 activityC2350 = this.f10022;
        return !activityC2350.f7581.f3541.booleanValue() && activityC2350.f7578.m55680().m53890();
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo10079() {
        ActivityC2350 activityC2350 = this.f10022;
        if (activityC2350.f7581.f3537 == null && activityC2350.f7581.f3543 != null) {
            return activityC2350.f7581.f3543.mo4294();
        }
        return null;
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ᩷ */
    public final String mo4583() {
        ActivityC2350 activityC2350 = this.f10022;
        if (activityC2350.f7581.f3537 != null) {
            return activityC2350.f7581.f3537;
        }
        return activityC2350.f7581.f3543 != null ? activityC2350.f7581.f3543.getName() : "";
    }
}
