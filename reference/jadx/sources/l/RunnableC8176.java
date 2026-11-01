package l;

/* JADX INFO: renamed from: l.۠۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8176 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17492 f28525;

    public RunnableC8176(C17492 c17492) {
        this.f28525 = c17492;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C17492 c17492 = this.f28525;
        if (!c17492.mFirstLayoutComplete || c17492.isLayoutRequested()) {
            return;
        }
        if (!c17492.mIsAttached) {
            c17492.requestLayout();
        } else if (c17492.mLayoutSuppressed) {
            c17492.mLayoutWasDefered = true;
        } else {
            c17492.consumePendingUpdateOperations();
        }
    }
}
