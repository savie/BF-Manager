package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24841 extends AbstractC1632 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24841(AbstractC15470 abstractC15470, int i, Object obj, int i2) {
        super(abstractC15470, i);
        this.s = i2;
        this.t = obj;
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        switch (this.s) {
            case 0:
                return new C13825(this, interfaceC15143, 0);
            case 1:
                return new C21111(this, interfaceC15143, 0);
            case 2:
                return new C12443(this, interfaceC15143, 0);
            case 3:
                return new C4877(this, interfaceC15143, 1);
            default:
                return new C4877(this, interfaceC15143, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24841(AbstractC24007 abstractC24007, Consumer consumer) {
        super(abstractC24007, 0);
        this.s = 3;
        this.t = consumer;
    }
}
