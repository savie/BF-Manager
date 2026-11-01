package l;

/* JADX INFO: renamed from: l.ۡܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 657B */
/* JADX INFO: loaded from: classes4.dex */
public final class C8997 extends AbstractC9712 {
    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final void mo8536(AbstractC12554 abstractC12554) {
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        int bindingAdapterPosition = abstractC12554.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC12555.getBindingAdapterPosition();
        int[] iArr = (int[]) DialogInterfaceOnDismissListenerC20991.f68353.clone();
        int[] iArr2 = DialogInterfaceOnDismissListenerC20991.f68353;
        int i = iArr2[bindingAdapterPosition];
        iArr2[bindingAdapterPosition] = iArr2[bindingAdapterPosition2];
        iArr2[bindingAdapterPosition2] = i;
        C4066.m11593(new C19580(iArr)).m15146(c17492.getAdapter());
        return true;
    }
}
