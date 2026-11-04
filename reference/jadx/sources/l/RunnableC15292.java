package l;

/* JADX INFO: renamed from: l.ܳۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC15292 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11563 f50000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f50001;

    public RunnableC15292(ActivityC11563 activityC11563, String str) {
        this.f50000 = activityC11563;
        this.f50001 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityC11563 activityC11563 = this.f50000;
        if (activityC11563.isFinishing()) {
            return;
        }
        C18605 c18605M54258 = activityC11563.f36351.f6297.m54258();
        if (c18605M54258 == null || c18605M54258.m43269() == 0) {
            C21576.m49068(this);
        } else {
            activityC11563.f36351.f6297.m23822(this.f50001.toString());
        }
    }
}
