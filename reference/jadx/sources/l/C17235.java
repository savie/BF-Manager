package l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܿۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17235 extends AbstractC11123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f54909 = new AtomicInteger();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f54910;

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final void mo8536(AbstractC12554 abstractC12554) {
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo8537() {
        return false;
    }

    public C17235(ActivityC11632 activityC11632) {
        this.f54910 = activityC11632;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ */
    public final int mo8538(AbstractC12554 abstractC12554) {
        if (!this.f54910.f39077.m28846() || abstractC12554.getBindingAdapterPosition() == -1) {
            return 0;
        }
        return AbstractC11123.m28050(3, 0);
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        int bindingAdapterPosition = abstractC12554.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC12555.getBindingAdapterPosition();
        ActivityC11632 activityC11632 = this.f54910;
        if (((C20409) activityC11632.f39080.get(bindingAdapterPosition)).m13358() != ((C20409) activityC11632.f39080.get(bindingAdapterPosition2)).m13358()) {
            return false;
        }
        C23520.m51798(bindingAdapterPosition, bindingAdapterPosition2, activityC11632.f39080);
        if (activityC11632.f39064 == bindingAdapterPosition) {
            activityC11632.f39064 = bindingAdapterPosition2;
        } else if (activityC11632.f39064 == bindingAdapterPosition2) {
            activityC11632.f39064 = bindingAdapterPosition;
        }
        activityC11632.m28978();
        activityC11632.f39062.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        activityC11632.m28998();
        final int iIncrementAndGet = this.f54909.incrementAndGet();
        C16737.m39274(new Runnable() { // from class: l.۫ۡۖ
            @Override // java.lang.Runnable
            public final void run() {
                C17235 c17235 = this.f41120;
                if (iIncrementAndGet == c17235.f54909.get()) {
                    c17235.f54910.m29009();
                }
            }
        }, 300L);
        return true;
    }
}
