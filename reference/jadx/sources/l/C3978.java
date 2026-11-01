package l;

import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۘܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3978 extends AbstractC10580 {
    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        C13638.requireNonNull(interfaceC19171);
        if (EnumC2970.SORTED.s(i)) {
            return interfaceC19171;
        }
        return EnumC2970.SIZED.s(i) ? new C23674(interfaceC19171) : new C6532(interfaceC19171);
    }

    @Override // l.AbstractC5752
    public final InterfaceC8616 n0(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, IntFunction intFunction) {
        if (EnumC2970.SORTED.s(((AbstractC5752) abstractC22686).m)) {
            return abstractC22686.Q(interfaceC20693, false, intFunction);
        }
        double[] dArr = (double[]) ((InterfaceC7163) abstractC22686.Q(interfaceC20693, true, intFunction)).b();
        Arrays.sort(dArr);
        return new C17759(dArr);
    }
}
