package l;

/* JADX INFO: renamed from: l.۬֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC13491 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25227 f42909;

    public RunnableC13491(C25227 c25227) {
        this.f42909 = c25227;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25227 c25227 = this.f42909;
        AbstractC3269 abstractC3269 = c25227.mItemAnimator;
        if (abstractC3269 != null) {
            abstractC3269.mo10759();
        }
        c25227.mPostedAnimatorRunner = false;
    }
}
