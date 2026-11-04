package l;

/* JADX INFO: renamed from: l.۠᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8956 extends AbstractC13233 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8956(AbstractC15470 abstractC15470, int i, int i2) {
        super(abstractC15470, i);
        this.s = i2;
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        switch (this.s) {
            case 0:
                return interfaceC15143;
            case 1:
                return new C25366(1, interfaceC15143);
            case 2:
                return new C1257(interfaceC15143);
            default:
                return new C12443(this, interfaceC15143, 3);
        }
    }
}
