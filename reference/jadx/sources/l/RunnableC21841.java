package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC21841 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69594;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f69595;

    public /* synthetic */ RunnableC21841(AbstractActivityC17204 abstractActivityC17204, int i) {
        this.f69594 = i;
        this.f69595 = abstractActivityC17204;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f69594;
        AbstractActivityC17204 abstractActivityC17204 = this.f69595;
        switch (i) {
            case 0:
                ActivityC0848 activityC0848 = (ActivityC0848) abstractActivityC17204;
                int i2 = ActivityC0848.f3169;
                activityC0848.getClass();
                int i3 = C16332.f53020;
                activityC0848.m3456(R.layout.MT_Protector);
                activityC0848.m3456(R.layout.MT_Protector);
                break;
            default:
                ((ActivityC7418) abstractActivityC17204).m20331();
                break;
        }
    }
}
