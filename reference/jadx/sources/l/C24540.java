package l;

/* JADX INFO: renamed from: l.᩺᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes.dex */
public final class C24540 extends AbstractC16474 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0673 f79568;

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final void mo9677(AbstractC11800 abstractC11800) {
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo17826() {
        return false;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo17827() {
        return false;
    }

    public C24540(ActivityC0673 activityC0673) {
        this.f79568 = activityC0673;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ᩷ */
    public final int mo9678(AbstractC11800 abstractC11800) {
        return AbstractC16474.m39083(3, 0);
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9676(C25227 c25227, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801) {
        int bindingAdapterPosition = abstractC11800.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC11801.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0 || bindingAdapterPosition2 < 0) {
            return false;
        }
        C7606.m20800(bindingAdapterPosition, bindingAdapterPosition2);
        this.f79568.f2556.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }
}
