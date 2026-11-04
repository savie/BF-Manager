package l;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۡ᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9701 extends AbstractC5776 {
    public final /* synthetic */ IntPredicate s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9701(AbstractC9503 abstractC9503, int i, IntPredicate intPredicate) {
        super(abstractC9503, i);
        this.s = intPredicate;
    }

    @Override // l.AbstractC15470
    public final InterfaceC8409 o0(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        return EnumC21614.ORDERED.p(abstractC15470.m) ? n0(abstractC15470, interfaceC8409, new C13189(25)).spliterator() : new C14571((InterfaceC7664) abstractC15470.h0(interfaceC8409), this.s);
    }

    @Override // l.AbstractC15470
    public final InterfaceC13409 n0(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, IntFunction intFunction) {
        return (InterfaceC13409) new C5118(this, abstractC13956, interfaceC8409, intFunction).invoke();
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        return new C6720(this, interfaceC15143);
    }
}
