package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۬ۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13651 extends AbstractC6522 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13651(AbstractC15470 abstractC15470, int i, Object obj, int i2) {
        super(abstractC15470, i);
        this.s = i2;
        this.t = obj;
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        switch (this.s) {
            case 0:
                return new C21111(this, interfaceC15143, 1);
            case 1:
                return new C21111(this, interfaceC15143, 2);
            case 2:
                return new C24400(this, interfaceC15143);
            case 3:
                return new C21111(this, interfaceC15143, 5);
            case 4:
                return new C4877(this, interfaceC15143, 4);
            default:
                return new C7223(this, interfaceC15143);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13651(AbstractC9503 abstractC9503, IntConsumer intConsumer) {
        super(abstractC9503, 0);
        this.s = 0;
        this.t = intConsumer;
    }
}
