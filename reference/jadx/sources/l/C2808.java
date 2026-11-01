package l;

/* JADX INFO: renamed from: l.ۖ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2808 extends AbstractC11123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7042 f10677;

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo8536(AbstractC12554 abstractC12554) {
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo8537() {
        return false;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo8539() {
        return false;
    }

    public C2808(ActivityC7042 activityC7042) {
        this.f10677 = activityC7042;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo8538(AbstractC12554 abstractC12554) {
        return AbstractC11123.m28050(3, 0);
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        int bindingAdapterPosition = abstractC12554.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC12555.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0 || bindingAdapterPosition2 < 0) {
            return false;
        }
        ActivityC7042 activityC7042 = this.f10677;
        C23520.m51798(bindingAdapterPosition, bindingAdapterPosition2, activityC7042.f23660);
        activityC7042.f23659.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        int i = C4925.f17255;
        C4716.m13051(new RunnableC18999(1), C4925.class, 500L);
        return true;
    }
}
