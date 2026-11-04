package l;

import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2465 extends AbstractC8934 implements InterfaceC21769 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Predicate t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2465(AbstractC24007 abstractC24007, int i, Predicate predicate, int i2) {
        super(abstractC24007, i);
        this.s = i2;
        this.t = predicate;
    }

    @Override // l.AbstractC15470
    public final InterfaceC8409 o0(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        switch (this.s) {
            case 0:
                return EnumC21614.ORDERED.p(abstractC15470.m) ? n0(abstractC15470, interfaceC8409, new C13189(11)).spliterator() : new C2245(abstractC15470.h0(interfaceC8409), this.t, 1);
            default:
                return EnumC21614.ORDERED.p(abstractC15470.m) ? n0(abstractC15470, interfaceC8409, new C13189(11)).spliterator() : new C2245(abstractC15470.h0(interfaceC8409), this.t, 0);
        }
    }

    @Override // l.AbstractC15470
    public final InterfaceC13409 n0(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, IntFunction intFunction) {
        switch (this.s) {
            case 0:
                return (InterfaceC13409) new C5118(this, abstractC13956, interfaceC8409, intFunction).invoke();
            default:
                return (InterfaceC13409) new C18039(this, abstractC13956, interfaceC8409, intFunction).invoke();
        }
    }

    @Override // l.InterfaceC21769
    public InterfaceC17293 d(InterfaceC4262 interfaceC4262, boolean z) {
        return new C5974(this, interfaceC4262, z);
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        switch (this.s) {
            case 0:
                return new C18542(this, interfaceC15143);
            default:
                return new C5974(this, interfaceC15143, false);
        }
    }
}
