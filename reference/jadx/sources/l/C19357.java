package l;

/* JADX INFO: renamed from: l.ᩳ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19357 extends AbstractC16474 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11064 f62533;

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final void mo9677(AbstractC11800 abstractC11800) {
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo17826() {
        return false;
    }

    public C19357(C11064 c11064) {
        this.f62533 = c11064;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ᩷ */
    public final int mo9678(AbstractC11800 abstractC11800) {
        return AbstractC16474.m39083(C11064.m27970(this.f62533, abstractC11800.getBindingAdapterPosition()) ? 3 : 0, 0);
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo39086(AbstractC11800 abstractC11800) {
        return C11064.m27970(this.f62533, abstractC11800.getBindingAdapterPosition());
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9676(C25227 c25227, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801) {
        int bindingAdapterPosition = abstractC11800.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC11801.getBindingAdapterPosition();
        C11064 c11064 = this.f62533;
        if (!C11064.m27970(c11064, bindingAdapterPosition) || !C11064.m27970(c11064, bindingAdapterPosition2)) {
            return false;
        }
        int i = bindingAdapterPosition - 1;
        int i2 = bindingAdapterPosition2 - 1;
        C0492.m2369(((C0911) c11064.f34897.get(i)).f3413, ((C0911) c11064.f34897.get(i2)).f3413);
        C9911.m25734(i, i2, c11064.f34897);
        c11064.f34905.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }
}
