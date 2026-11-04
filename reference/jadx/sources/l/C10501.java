package l;

/* JADX INFO: renamed from: l.ۤ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes4.dex */
public final class C10501 extends AbstractC16474 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8044 f33411;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19452 f33412;

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

    public C10501(C19452 c19452, C8044 c8044) {
        this.f33412 = c19452;
        this.f33411 = c8044;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ᩷ */
    public final int mo9678(AbstractC11800 abstractC11800) {
        return AbstractC16474.m39083(3, 0);
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9676(C25227 c25227, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801) {
        C19452 c19452 = this.f33412;
        if (c19452.m44955()) {
            return false;
        }
        int bindingAdapterPosition = abstractC11800.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC11801.getBindingAdapterPosition();
        if (!this.f33411.m21925(bindingAdapterPosition, bindingAdapterPosition2)) {
            return false;
        }
        c19452.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C4052.f13792.mo40348(Object.class);
        return true;
    }
}
