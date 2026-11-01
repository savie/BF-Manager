package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J7C4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11814 extends AbstractC11123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2640 f39690;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f39691;

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final void mo8536(AbstractC12554 abstractC12554) {
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo8537() {
        return false;
    }

    public C11814(ArrayList arrayList, C2640 c2640) {
        this.f39691 = arrayList;
        this.f39690 = c2640;
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
        if (bindingAdapterPosition == -1 || bindingAdapterPosition2 == -1) {
            return false;
        }
        C23520.m51798(bindingAdapterPosition, bindingAdapterPosition2, this.f39691);
        this.f39690.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }
}
