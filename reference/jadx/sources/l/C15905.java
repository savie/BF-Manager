package l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܶۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15905 extends AbstractC16474 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f51676;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AtomicInteger f51677 = new AtomicInteger();

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final void mo9677(AbstractC11800 abstractC11800) {
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo17826() {
        return false;
    }

    public C15905(ActivityC18143 activityC18143) {
        this.f51676 = activityC18143;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ᩷ */
    public final int mo9678(AbstractC11800 abstractC11800) {
        if (!this.f51676.f59328.m23776() || abstractC11800.getBindingAdapterPosition() == -1) {
            return 0;
        }
        return AbstractC16474.m39083(3, 0);
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9676(C25227 c25227, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801) {
        int bindingAdapterPosition = abstractC11800.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC11801.getBindingAdapterPosition();
        ActivityC18143 activityC18143 = this.f51676;
        if (((C7941) activityC18143.f59346.get(bindingAdapterPosition)).m19936() != ((C7941) activityC18143.f59346.get(bindingAdapterPosition2)).m19936()) {
            return false;
        }
        C9911.m25734(bindingAdapterPosition, bindingAdapterPosition2, activityC18143.f59346);
        if (activityC18143.f59340 == bindingAdapterPosition) {
            activityC18143.f59340 = bindingAdapterPosition2;
        } else if (activityC18143.f59340 == bindingAdapterPosition2) {
            activityC18143.f59340 = bindingAdapterPosition;
        }
        activityC18143.m42258();
        activityC18143.f59343.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        activityC18143.m42284();
        final int iIncrementAndGet = this.f51677.incrementAndGet();
        C21576.m49069(new Runnable() { // from class: l.ܽۛ᩸
            @Override // java.lang.Runnable
            public final void run() {
                C15905 c15905 = this.f56567;
                if (iIncrementAndGet == c15905.f51677.get()) {
                    c15905.f51676.m42293();
                }
            }
        }, 300L);
        return true;
    }
}
