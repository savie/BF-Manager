package l;

/* JADX INFO: renamed from: l.᩵۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC19465 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17492 f62677;

    public RunnableC19465(C17492 c17492) {
        this.f62677 = c17492;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C17492 c17492 = this.f62677;
        AbstractC1825 abstractC1825 = c17492.mItemAnimator;
        if (abstractC1825 != null) {
            abstractC1825.mo5962();
        }
        c17492.mPostedAnimatorRunner = false;
    }
}
