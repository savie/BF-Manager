package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14680 extends AbstractC1632 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Function t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14680(AbstractC24007 abstractC24007, int i, Function function, int i2) {
        super(abstractC24007, i);
        this.s = i2;
        this.t = function;
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        switch (this.s) {
            case 0:
                return new C4877(this, interfaceC15143, 3);
            default:
                return new C18542(this, interfaceC15143);
        }
    }
}
