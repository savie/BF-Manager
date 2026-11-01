package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11524 extends AbstractC11123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f38740;

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

    public C11524(ArrayList arrayList) {
        this.f38740 = arrayList;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ */
    public final int mo8538(AbstractC12554 abstractC12554) {
        return AbstractC11123.m28050(3, 0);
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        int bindingAdapterPosition = abstractC12554.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC12555.getBindingAdapterPosition();
        C23520.m51798(bindingAdapterPosition, bindingAdapterPosition2, this.f38740);
        AbstractC0414 adapter = c17492.getAdapter();
        C13638.requireNonNull(adapter);
        adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }
}
