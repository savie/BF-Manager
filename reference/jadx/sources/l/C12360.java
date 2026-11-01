package l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۫ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12360 extends AbstractC11123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f41329 = new AtomicInteger();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f41330;

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final void mo8536(AbstractC12554 abstractC12554) {
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo8537() {
        return false;
    }

    public C12360(ActivityC5677 activityC5677) {
        this.f41330 = activityC5677;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ */
    public final int mo8538(AbstractC12554 abstractC12554) {
        ActivityC5677 activityC5677 = this.f41330;
        if (!activityC5677.f19371.m28846() || abstractC12554.getBindingAdapterPosition() == -1) {
            return 0;
        }
        return AbstractC11123.m28050(ActivityC5677.m15620(activityC5677, (AbstractC22611) activityC5677.f19367.get(abstractC12554.getBindingAdapterPosition())) ? 3 : 0, 0);
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        int bindingAdapterPosition = abstractC12554.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC12555.getBindingAdapterPosition();
        ActivityC5677 activityC5677 = this.f41330;
        if (!ActivityC5677.m15620(activityC5677, (AbstractC22611) activityC5677.f19367.get(bindingAdapterPosition2)) || ((AbstractC22611) activityC5677.f19367.get(bindingAdapterPosition)).m50134() != ((AbstractC22611) activityC5677.f19367.get(bindingAdapterPosition2)).m50134()) {
            return false;
        }
        C23520.m51798(bindingAdapterPosition, bindingAdapterPosition2, activityC5677.f19367);
        if (activityC5677.f19362 == bindingAdapterPosition) {
            activityC5677.f19362 = bindingAdapterPosition2;
        } else if (activityC5677.f19362 == bindingAdapterPosition2) {
            activityC5677.f19362 = bindingAdapterPosition;
        }
        activityC5677.f19363.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        activityC5677.m15612();
        final int iIncrementAndGet = this.f41329.incrementAndGet();
        C16737.m39274(new Runnable() { // from class: l.ܽۧۘ
            @Override // java.lang.Runnable
            public final void run() {
                C12360 c12360 = this.f53246;
                if (iIncrementAndGet == c12360.f41329.get()) {
                    c12360.f41330.m15610();
                }
            }
        }, 300L);
        return true;
    }
}
