package l;

import java.util.function.IntFunction;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.۫ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12331 extends AbstractC5793 implements InterfaceC21349 {
    public final /* synthetic */ LongPredicate s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12331(AbstractC7944 abstractC7944, int i, LongPredicate longPredicate) {
        super(abstractC7944, i);
        this.s = longPredicate;
    }

    @Override // l.AbstractC5752
    public final InterfaceC20693 o0(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        return EnumC2970.ORDERED.s(abstractC5752.m) ? n0(abstractC5752, interfaceC20693, new C1040(28)).spliterator() : new C20582((InterfaceC19282) abstractC5752.h0(interfaceC20693), this.s);
    }

    @Override // l.AbstractC5752
    public final InterfaceC8616 n0(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, IntFunction intFunction) {
        return (InterfaceC8616) new C4684(this, abstractC22686, interfaceC20693, intFunction).invoke();
    }

    @Override // l.InterfaceC21349
    public final InterfaceC0182 d(InterfaceC23280 interfaceC23280, boolean z) {
        return new C18680(this, interfaceC23280, z);
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        return new C18680(this, interfaceC19171, false);
    }
}
