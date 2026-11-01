package l;

/* JADX INFO: renamed from: l.ܰܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T12U */
/* JADX INFO: loaded from: classes4.dex */
public final class C13936 extends AbstractC9712 {
    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final void mo8536(AbstractC12554 abstractC12554) {
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        int adapterPosition = abstractC12554.getAdapterPosition();
        int adapterPosition2 = abstractC12555.getAdapterPosition();
        int i = DialogInterfaceOnDismissListenerC5468.f18839[adapterPosition];
        if (adapterPosition > adapterPosition2) {
            System.arraycopy(DialogInterfaceOnDismissListenerC5468.f18839, adapterPosition2, DialogInterfaceOnDismissListenerC5468.f18839, adapterPosition2 + 1, adapterPosition - adapterPosition2);
        } else {
            System.arraycopy(DialogInterfaceOnDismissListenerC5468.f18839, adapterPosition + 1, DialogInterfaceOnDismissListenerC5468.f18839, adapterPosition, adapterPosition2 - adapterPosition);
        }
        DialogInterfaceOnDismissListenerC5468.f18839[adapterPosition2] = i;
        c17492.getAdapter().notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }
}
