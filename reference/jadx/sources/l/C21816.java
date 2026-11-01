package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C21816 extends AbstractC11123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f70863;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6293 f70864;

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

    public C21816(C6293 c6293, ArrayList arrayList) {
        this.f70864 = c6293;
        this.f70863 = arrayList;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ */
    public final int mo8538(AbstractC12554 abstractC12554) {
        return AbstractC11123.m28050(this.f70864.m17367() ? 3 : 0, 0);
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        int bindingAdapterPosition = abstractC12554.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC12555.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || bindingAdapterPosition2 == -1) {
            return false;
        }
        ArrayList arrayList = this.f70863;
        C23520.m51798(bindingAdapterPosition, bindingAdapterPosition2, arrayList);
        this.f70864.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C11359.m28460(arrayList);
        return true;
    }
}
