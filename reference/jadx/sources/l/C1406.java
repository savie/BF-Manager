package l;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.֨᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1406 extends AbstractC12808 {
    public final /* synthetic */ IntPredicate s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1406(AbstractC23392 abstractC23392, int i, IntPredicate intPredicate) {
        super(abstractC23392, i);
        this.s = intPredicate;
    }

    @Override // l.AbstractC5752
    public final InterfaceC20693 o0(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        return EnumC2970.ORDERED.s(abstractC5752.m) ? n0(abstractC5752, interfaceC20693, new C1040(25)).spliterator() : new C9563((InterfaceC18576) abstractC5752.h0(interfaceC20693), this.s);
    }

    @Override // l.AbstractC5752
    public final InterfaceC8616 n0(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, IntFunction intFunction) {
        return (InterfaceC8616) new C15269(this, abstractC22686, interfaceC20693, intFunction).invoke();
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        return new C23488(this, interfaceC19171);
    }
}
