package l;

import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.۠ۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8343 extends AbstractC9481 {
    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        C17359.requireNonNull(interfaceC15143);
        if (EnumC21614.SORTED.p(i)) {
            return interfaceC15143;
        }
        return EnumC21614.SIZED.p(i) ? new C6369(interfaceC15143) : new C7443(interfaceC15143);
    }

    @Override // l.AbstractC15470
    public final InterfaceC13409 n0(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, IntFunction intFunction) {
        if (EnumC21614.SORTED.p(((AbstractC15470) abstractC13956).m)) {
            return abstractC13956.Q(interfaceC8409, false, intFunction);
        }
        double[] dArr = (double[]) ((InterfaceC2047) abstractC13956.Q(interfaceC8409, true, intFunction)).b();
        Arrays.sort(dArr);
        return new C10668(dArr);
    }
}
