package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܰۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14397 extends AbstractC13233 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14397(AbstractC15470 abstractC15470, int i, Object obj, int i2) {
        super(abstractC15470, i);
        this.s = i2;
        this.t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14397(AbstractC12487 abstractC12487, DoubleConsumer doubleConsumer) {
        super(abstractC12487, 0);
        this.s = 3;
        this.t = doubleConsumer;
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        switch (this.s) {
            case 0:
                return new C13825(this, interfaceC15143, 1);
            case 1:
                return new C4482(this, interfaceC15143);
            case 2:
                return new C13825(this, interfaceC15143, 4);
            case 3:
                return new C13825(this, interfaceC15143, 5);
            case 4:
                return new C21111(this, interfaceC15143, 4);
            case 5:
                return new C4877(this, interfaceC15143, 6);
            default:
                return new C11917(this, interfaceC15143);
        }
    }
}
