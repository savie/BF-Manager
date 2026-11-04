package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۖ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2880 extends AbstractC8934 {
    public final boolean s;
    public final Comparator t;

    public C2880(AbstractC24007 abstractC24007) {
        super(abstractC24007, EnumC21614.q | EnumC21614.o);
        this.s = true;
        this.t = EnumC24993.INSTANCE;
    }

    public C2880(AbstractC24007 abstractC24007, Comparator comparator) {
        super(abstractC24007, EnumC21614.q | EnumC21614.p);
        this.s = false;
        this.t = (Comparator) C17359.requireNonNull(comparator);
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        C17359.requireNonNull(interfaceC15143);
        if (EnumC21614.SORTED.p(i) && this.s) {
            return interfaceC15143;
        }
        if (EnumC21614.SIZED.p(i)) {
            return new C12160(interfaceC15143, this.t);
        }
        return new C5623(interfaceC15143, this.t);
    }

    @Override // l.AbstractC15470
    public final InterfaceC13409 n0(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, IntFunction intFunction) {
        if (EnumC21614.SORTED.p(((AbstractC15470) abstractC13956).m) && this.s) {
            return abstractC13956.Q(interfaceC8409, false, intFunction);
        }
        Object[] objArrM = abstractC13956.Q(interfaceC8409, true, intFunction).m(intFunction);
        Arrays.sort(objArrM, this.t);
        return new C15055(objArrM);
    }
}
