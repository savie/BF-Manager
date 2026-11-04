package l;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܺۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16809 extends AbstractC8934 {
    public static C20277 u0(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409) {
        C8189 c8189 = new C8189(7);
        C22272 c22272 = new C22272(2);
        C22272 c22273 = new C22272(3);
        C17359.requireNonNull(c8189);
        C17359.requireNonNull(c22272);
        C17359.requireNonNull(c22273);
        return new C20277((Collection) new C4240(EnumC14154.REFERENCE, c22273, c22272, c8189, 3).e(abstractC13956, interfaceC8409));
    }

    @Override // l.AbstractC15470
    public final InterfaceC13409 n0(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, IntFunction intFunction) {
        AbstractC15470 abstractC15470 = (AbstractC15470) abstractC13956;
        if (EnumC21614.DISTINCT.p(abstractC15470.m)) {
            return abstractC13956.Q(interfaceC8409, false, intFunction);
        }
        if (EnumC21614.ORDERED.p(abstractC15470.m)) {
            return u0(abstractC13956, interfaceC8409);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249();
        C15602 c15602 = new C15602(5, atomicBoolean, concurrentMapC17249);
        C17359.requireNonNull(c15602);
        new C17555(c15602, false).a(abstractC13956, interfaceC8409);
        Collection collectionKeySet = concurrentMapC17249.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new C20277(collectionKeySet);
    }

    @Override // l.AbstractC15470
    public final InterfaceC8409 o0(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        if (EnumC21614.DISTINCT.p(abstractC15470.m)) {
            return abstractC15470.h0(interfaceC8409);
        }
        if (EnumC21614.ORDERED.p(abstractC15470.m)) {
            return u0(abstractC15470, interfaceC8409).spliterator();
        }
        return new C24269(abstractC15470.h0(interfaceC8409), new ConcurrentMapC17249());
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        C17359.requireNonNull(interfaceC15143);
        if (EnumC21614.DISTINCT.p(i)) {
            return interfaceC15143;
        }
        if (EnumC21614.SORTED.p(i)) {
            return new C18542(interfaceC15143);
        }
        return new C4877(interfaceC15143);
    }
}
