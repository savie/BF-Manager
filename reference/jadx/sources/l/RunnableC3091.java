package l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۗ۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3091 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11676;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11677 = 1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11678;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11679;

    public /* synthetic */ RunnableC3091(C1824 c1824, C14526 c14526, C23698 c23698) {
        this.f11679 = c1824;
        this.f11676 = c14526;
        this.f11678 = c23698;
    }

    public /* synthetic */ RunnableC3091(ActivityC15481 activityC15481, C17485 c17485, AtomicBoolean atomicBoolean, Exception exc) {
        this.f11679 = activityC15481;
        this.f11676 = c17485;
        this.f11678 = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11677) {
            case 0:
                ActivityC15481.m37041((ActivityC15481) this.f11679, (C17485) this.f11676, (AtomicBoolean) this.f11678);
                break;
            default:
                C1824.m5932((C1824) this.f11679, (C14526) this.f11676, (C23698) this.f11678);
                break;
        }
    }
}
