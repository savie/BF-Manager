package l;

/* JADX INFO: renamed from: l.ۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public class C9617 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1086 f32398;

    public C9617(ActivityC1086 activityC1086) {
        this.f32398 = activityC1086;
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.ON_DESTROY) {
            ActivityC1086 activityC1086 = this.f32398;
            activityC1086.f4951.m14067();
            if (!activityC1086.isChangingConfigurations()) {
                activityC1086.getViewModelStore().m31027();
            }
            ExecutorC22254 executorC22254 = activityC1086.f4953;
            ActivityC1086 activityC1087 = executorC22254.f72749;
            activityC1087.getWindow().getDecorView().removeCallbacks(executorC22254);
            activityC1087.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC22254);
        }
    }
}
