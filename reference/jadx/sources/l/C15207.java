package l;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܶۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15207 extends AbstractC3709 {
    public static C5827 u0(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693) {
        C17821 c17821 = new C17821(7);
        C13858 c13858 = new C13858(2);
        C13858 c13859 = new C13858(3);
        C13638.requireNonNull(c17821);
        C13638.requireNonNull(c13858);
        C13638.requireNonNull(c13859);
        return new C5827((Collection) new C1746(EnumC22761.REFERENCE, c13859, c13858, c17821, 3).e(abstractC22686, interfaceC20693));
    }

    @Override // l.AbstractC5752
    public final InterfaceC8616 n0(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, IntFunction intFunction) {
        AbstractC5752 abstractC5752 = (AbstractC5752) abstractC22686;
        if (EnumC2970.DISTINCT.s(abstractC5752.m)) {
            return abstractC22686.Q(interfaceC20693, false, intFunction);
        }
        if (EnumC2970.ORDERED.s(abstractC5752.m)) {
            return u0(abstractC22686, interfaceC20693);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentMapC13783 concurrentMapC13783 = new ConcurrentMapC13783();
        C11251 c11251 = new C11251(5, atomicBoolean, concurrentMapC13783);
        C13638.requireNonNull(c11251);
        new C21556(c11251, false).a(abstractC22686, interfaceC20693);
        Collection collectionKeySet = concurrentMapC13783.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new C5827(collectionKeySet);
    }

    @Override // l.AbstractC5752
    public final InterfaceC20693 o0(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        if (EnumC2970.DISTINCT.s(abstractC5752.m)) {
            return abstractC5752.h0(interfaceC20693);
        }
        if (EnumC2970.ORDERED.s(abstractC5752.m)) {
            return u0(abstractC5752, interfaceC20693).spliterator();
        }
        return new C14502(abstractC5752.h0(interfaceC20693), new ConcurrentMapC13783());
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        C13638.requireNonNull(interfaceC19171);
        if (EnumC2970.DISTINCT.s(i)) {
            return interfaceC19171;
        }
        if (EnumC2970.SORTED.s(i)) {
            return new C0451(interfaceC19171);
        }
        return new C4622(interfaceC19171);
    }
}
