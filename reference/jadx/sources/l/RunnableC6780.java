package l;

/* JADX INFO: renamed from: l.ۜ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC6780 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25227 f22603;

    public RunnableC6780(C25227 c25227) {
        this.f22603 = c25227;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25227 c25227 = this.f22603;
        if (!c25227.mFirstLayoutComplete || c25227.isLayoutRequested()) {
            return;
        }
        if (!c25227.mIsAttached) {
            c25227.requestLayout();
        } else if (c25227.mLayoutSuppressed) {
            c25227.mLayoutWasDefered = true;
        } else {
            c25227.consumePendingUpdateOperations();
        }
    }
}
