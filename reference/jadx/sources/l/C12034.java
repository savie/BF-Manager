package l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۨ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12034 extends AbstractC16474 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f38775;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AtomicInteger f38776 = new AtomicInteger();

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final void mo9677(AbstractC11800 abstractC11800) {
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo17826() {
        return false;
    }

    public C12034(ActivityC0848 activityC0848) {
        this.f38775 = activityC0848;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ᩷ */
    public final int mo9678(AbstractC11800 abstractC11800) {
        ActivityC0848 activityC0848 = this.f38775;
        if (!activityC0848.f3177.m23776() || abstractC11800.getBindingAdapterPosition() == -1) {
            return 0;
        }
        return AbstractC16474.m39083(ActivityC0848.m3391(activityC0848, (AbstractC9051) activityC0848.f3173.get(abstractC11800.getBindingAdapterPosition())) ? 3 : 0, 0);
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9676(C25227 c25227, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801) {
        int bindingAdapterPosition = abstractC11800.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC11801.getBindingAdapterPosition();
        ActivityC0848 activityC0848 = this.f38775;
        if (!ActivityC0848.m3391(activityC0848, (AbstractC9051) activityC0848.f3173.get(bindingAdapterPosition2)) || ((AbstractC9051) activityC0848.f3173.get(bindingAdapterPosition)).m24169() != ((AbstractC9051) activityC0848.f3173.get(bindingAdapterPosition2)).m24169()) {
            return false;
        }
        C9911.m25734(bindingAdapterPosition, bindingAdapterPosition2, activityC0848.f3173);
        if (activityC0848.f3172 == bindingAdapterPosition) {
            activityC0848.f3172 = bindingAdapterPosition2;
        } else if (activityC0848.f3172 == bindingAdapterPosition2) {
            activityC0848.f3172 = bindingAdapterPosition;
        }
        activityC0848.f3189.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        activityC0848.m3408();
        final int iIncrementAndGet = this.f38776.incrementAndGet();
        C21576.m49069(new Runnable() { // from class: l.᩵֫ۧ
            @Override // java.lang.Runnable
            public final void run() {
                C12034 c12034 = this.f64943;
                if (iIncrementAndGet == c12034.f38776.get()) {
                    c12034.f38775.m3355();
                }
            }
        }, 300L);
        return true;
    }
}
