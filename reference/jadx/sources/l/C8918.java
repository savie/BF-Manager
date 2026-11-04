package l;

/* JADX INFO: renamed from: l.۠᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T12U */
/* JADX INFO: loaded from: classes4.dex */
public final class C8918 extends AbstractC3050 {
    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final void mo9677(AbstractC11800 abstractC11800) {
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9676(C25227 c25227, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801) {
        int adapterPosition = abstractC11800.getAdapterPosition();
        int adapterPosition2 = abstractC11801.getAdapterPosition();
        int i = DialogInterfaceOnDismissListenerC5102.f17804[adapterPosition];
        if (adapterPosition > adapterPosition2) {
            System.arraycopy(DialogInterfaceOnDismissListenerC5102.f17804, adapterPosition2, DialogInterfaceOnDismissListenerC5102.f17804, adapterPosition2 + 1, adapterPosition - adapterPosition2);
        } else {
            System.arraycopy(DialogInterfaceOnDismissListenerC5102.f17804, adapterPosition + 1, DialogInterfaceOnDismissListenerC5102.f17804, adapterPosition, adapterPosition2 - adapterPosition);
        }
        DialogInterfaceOnDismissListenerC5102.f17804[adapterPosition2] = i;
        c25227.getAdapter().notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }
}
