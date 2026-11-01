package l;

import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܳܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14564 extends AbstractC5793 {
    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        C13638.requireNonNull(interfaceC19171);
        if (EnumC2970.SORTED.s(i)) {
            return interfaceC19171;
        }
        return EnumC2970.SIZED.s(i) ? new C8588(interfaceC19171) : new C1593(interfaceC19171);
    }

    @Override // l.AbstractC5752
    public final InterfaceC8616 n0(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, IntFunction intFunction) {
        if (EnumC2970.SORTED.s(((AbstractC5752) abstractC22686).m)) {
            return abstractC22686.Q(interfaceC20693, false, intFunction);
        }
        long[] jArr = (long[]) ((InterfaceC23620) abstractC22686.Q(interfaceC20693, true, intFunction)).b();
        Arrays.sort(jArr);
        return new C10767(jArr);
    }
}
