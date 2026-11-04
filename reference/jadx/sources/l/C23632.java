package l;

import java.util.function.IntFunction;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.᩹ܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23632 extends AbstractC10425 implements InterfaceC21769 {
    public final /* synthetic */ LongPredicate s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23632(AbstractC3123 abstractC3123, int i, LongPredicate longPredicate) {
        super(abstractC3123, i);
        this.s = longPredicate;
    }

    @Override // l.AbstractC15470
    public final InterfaceC8409 o0(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        return EnumC21614.ORDERED.p(abstractC15470.m) ? n0(abstractC15470, interfaceC8409, new C13189(28)).spliterator() : new C11414((InterfaceC9900) abstractC15470.h0(interfaceC8409), this.s);
    }

    @Override // l.AbstractC15470
    public final InterfaceC13409 n0(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, IntFunction intFunction) {
        return (InterfaceC13409) new C18039(this, abstractC13956, interfaceC8409, intFunction).invoke();
    }

    @Override // l.InterfaceC21769
    public final InterfaceC17293 d(InterfaceC4262 interfaceC4262, boolean z) {
        return new C22886(this, interfaceC4262, z);
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        return new C22886(this, interfaceC15143, false);
    }
}
