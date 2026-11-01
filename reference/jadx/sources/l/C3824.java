package l;

/* JADX INFO: renamed from: l.ۘ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes2.dex */
public final class C3824 extends AbstractC11123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22876 f14169;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2017 f14170;

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final void mo8536(AbstractC12554 abstractC12554) {
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo8537() {
        return false;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo8539() {
        return false;
    }

    public C3824(C22876 c22876, C2017 c2017) {
        this.f14169 = c22876;
        this.f14170 = c2017;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ */
    public final int mo8538(AbstractC12554 abstractC12554) {
        return AbstractC11123.m28050(3, 0);
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        C22876 c22876 = this.f14169;
        if (c22876.m50624()) {
            return false;
        }
        int bindingAdapterPosition = abstractC12554.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC12555.getBindingAdapterPosition();
        if (!this.f14170.m6495(bindingAdapterPosition, bindingAdapterPosition2)) {
            return false;
        }
        c22876.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C8432.f29283.mo23641(Object.class);
        return true;
    }
}
