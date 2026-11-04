package l;

/* JADX INFO: renamed from: l.ܽᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 657B */
/* JADX INFO: loaded from: classes5.dex */
public final class C17780 extends AbstractC3050 {
    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final void mo9677(AbstractC11800 abstractC11800) {
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9676(C25227 c25227, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801) {
        int bindingAdapterPosition = abstractC11800.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC11801.getBindingAdapterPosition();
        int[] iArr = (int[]) DialogInterfaceOnDismissListenerC3610.f12369.clone();
        int[] iArr2 = DialogInterfaceOnDismissListenerC3610.f12369;
        int i = iArr2[bindingAdapterPosition];
        iArr2[bindingAdapterPosition] = iArr2[bindingAdapterPosition2];
        iArr2[bindingAdapterPosition2] = i;
        C8050.m21936(new C17034(iArr), true).m35496(c25227.getAdapter());
        return true;
    }
}
