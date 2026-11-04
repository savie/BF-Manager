package l;

/* JADX INFO: renamed from: l.ܳ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC14982 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11999 f48901;

    public RunnableC14982(C11999 c11999) {
        this.f48901 = c11999;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11999 c11999 = this.f48901;
        if (c11999.f38677 == null || !c11999.m30174()) {
            return;
        }
        AbstractC11800 abstractC11800 = c11999.f38677;
        if (abstractC11800 != null) {
            c11999.m30170(abstractC11800);
        }
        c11999.f38692.removeCallbacks(c11999.f38682);
        C25227 c25227 = c11999.f38692;
        int i = C22666.f73603;
        c25227.postOnAnimation(this);
    }
}
