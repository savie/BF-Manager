package l;

import java.util.function.DoublePredicate;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۤ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11171 extends AbstractC9481 implements InterfaceC21769 {
    public final /* synthetic */ int s;
    public final /* synthetic */ DoublePredicate t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11171(AbstractC12487 abstractC12487, int i, DoublePredicate doublePredicate, int i2) {
        super(abstractC12487, i);
        this.s = i2;
        this.t = doublePredicate;
    }

    @Override // l.AbstractC15470
    public final InterfaceC8409 o0(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        switch (this.s) {
            case 0:
                return EnumC21614.ORDERED.p(abstractC15470.m) ? n0(abstractC15470, interfaceC8409, new C13189(29)).spliterator() : new C21526((InterfaceC3012) abstractC15470.h0(interfaceC8409), this.t);
            default:
                return EnumC21614.ORDERED.p(abstractC15470.m) ? n0(abstractC15470, interfaceC8409, new C16392()).spliterator() : new C17050((InterfaceC3012) abstractC15470.h0(interfaceC8409), this.t);
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
        return new C0731(this, interfaceC4262, z);
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        switch (this.s) {
            case 0:
                return new C7969(this, interfaceC15143);
            default:
                return new C0731(this, interfaceC15143, false);
        }
    }
}
