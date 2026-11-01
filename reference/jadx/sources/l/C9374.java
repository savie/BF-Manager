package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۢۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9374 extends AbstractC11123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1403 f31742;

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

    public C9374(C1403 c1403) {
        this.f31742 = c1403;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ */
    public final int mo8538(AbstractC12554 abstractC12554) {
        if (this.f31742.f5818.f63459) {
            return 0;
        }
        return AbstractC11123.m28050(3, 0);
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        C1403 c1403 = this.f31742;
        BitSet bitSet = c1403.f5819;
        int bindingAdapterPosition = abstractC12554.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC12555.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0 || bindingAdapterPosition2 < 0) {
            return false;
        }
        boolean z = bitSet.get(bindingAdapterPosition);
        boolean z2 = bitSet.get(bindingAdapterPosition2);
        if (z != z2) {
            bitSet.set(bindingAdapterPosition, z2);
            bitSet.set(bindingAdapterPosition2, z);
        }
        C23520.m51798(bindingAdapterPosition, bindingAdapterPosition2, c1403.m4914());
        c1403.f5816.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C7754.m20408();
        return true;
    }
}
