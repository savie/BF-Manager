package l;

/* JADX INFO: renamed from: l.۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public final class C14108 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5577 f44622;

    public C14108(ActivityC5577 activityC5577) {
        this.f44622 = activityC5577;
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_DESTROY) {
            ActivityC5577 activityC5577 = this.f44622;
            activityC5577.f19377.m33007();
            if (!activityC5577.isChangingConfigurations()) {
                activityC5577.getViewModelStore().m52890();
            }
            ExecutorC13034 executorC13034 = activityC5577.f19382;
            ActivityC5577 activityC5578 = executorC13034.f41715;
            activityC5578.getWindow().getDecorView().removeCallbacks(executorC13034);
            activityC5578.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC13034);
        }
    }
}
