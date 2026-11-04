package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܰ᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14922 extends AbstractC19531 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14922(AbstractC15470 abstractC15470, int i, Object obj, int i2) {
        super(abstractC15470, i);
        this.s = i2;
        this.t = obj;
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        switch (this.s) {
            case 0:
                return new C21111(this, interfaceC15143, 3);
            case 1:
                return new C12443(this, interfaceC15143, 1);
            case 2:
                return new C15646(this, interfaceC15143);
            case 3:
                return new C12443(this, interfaceC15143, 4);
            case 4:
                return new C12443(this, interfaceC15143, 5);
            case 5:
                return new C13978(this, interfaceC15143);
            default:
                return new C4877(this, interfaceC15143, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14922(AbstractC3123 abstractC3123, LongConsumer longConsumer) {
        super(abstractC3123, 0);
        this.s = 4;
        this.t = longConsumer;
    }
}
