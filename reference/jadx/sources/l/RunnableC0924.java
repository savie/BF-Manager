package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0924 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3708;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3709;

    public /* synthetic */ RunnableC0924(int i, Object obj) {
        this.f3708 = i;
        this.f3709 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3708;
        Object obj = this.f3709;
        switch (i) {
            case 0:
                ActivityC5677 activityC5677 = (ActivityC5677) obj;
                int i2 = ActivityC5677.f19358;
                activityC5677.getClass();
                int i3 = C23444.f75887;
                activityC5677.m15664(R.layout.MT_Protector);
                activityC5677.m15664(R.layout.MT_Protector);
                break;
            default:
                C21531 c21531 = ((C15182) obj).f49567;
                c21531.f69943.m5841("resources.arsc");
                c21531.f69943.m5830(R.string.MT_Protector);
                c21531.f69943.m5840(0);
                break;
        }
    }
}
