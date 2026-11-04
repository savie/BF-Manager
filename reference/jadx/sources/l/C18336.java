package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܿ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes5.dex */
public final class C18336 extends AbstractC16474 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8640 f59806;

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

    public C18336(C8640 c8640) {
        this.f59806 = c8640;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ᩷ */
    public final int mo9678(AbstractC11800 abstractC11800) {
        if (this.f59806.f28230.f19006) {
            return 0;
        }
        return AbstractC16474.m39083(3, 0);
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9676(C25227 c25227, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801) {
        C8640 c8640 = this.f59806;
        BitSet bitSet = c8640.f28229;
        int bindingAdapterPosition = abstractC11800.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC11801.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0 || bindingAdapterPosition2 < 0) {
            return false;
        }
        boolean z = bitSet.get(bindingAdapterPosition);
        boolean z2 = bitSet.get(bindingAdapterPosition2);
        if (z != z2) {
            bitSet.set(bindingAdapterPosition, z2);
            bitSet.set(bindingAdapterPosition2, z);
        }
        C9911.m25734(bindingAdapterPosition, bindingAdapterPosition2, c8640.m23286());
        c8640.f28227.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C24832.m55356();
        return true;
    }
}
