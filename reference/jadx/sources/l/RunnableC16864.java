package l;

/* JADX INFO: renamed from: l.ܽ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16864 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11220 f53959;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f53960;

    public RunnableC16864(ActivityC11220 activityC11220, String str) {
        this.f53959 = activityC11220;
        this.f53960 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityC11220 activityC11220 = this.f53959;
        if (activityC11220.isFinishing()) {
            return;
        }
        C5575 c5575M13834 = activityC11220.f37972.f21274.m13834();
        if (c5575M13834 == null || c5575M13834.m15437() == 0) {
            C16737.m39273(this);
        } else {
            activityC11220.f37972.f21274.m48569(this.f53960.toString());
        }
    }
}
