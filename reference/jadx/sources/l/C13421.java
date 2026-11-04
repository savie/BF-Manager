package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27RL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13421 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayDeque, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15658 m33062(InterfaceC19637 interfaceC19637, EnumC20134 enumC20134) {
        ?? arrayDeque = new ArrayDeque();
        InterfaceC19637 interfaceC19637M33063 = m33063((ArrayDeque) arrayDeque, interfaceC19637);
        if (enumC20134 == EnumC20134.YES) {
            int i = -1;
            int i2 = -1;
            int i3 = 0;
            for (List list : arrayDeque) {
                if (!list.isEmpty()) {
                    AbstractC8036 abstractC8036 = (AbstractC8036) list.get(0);
                    abstractC8036.getClass();
                    int iM28342 = C11239.m28342(abstractC8036);
                    if (iM28342 < i) {
                        ArrayList arrayList = new ArrayList((Collection) arrayDeque);
                        Collections.rotate(arrayList, -(i2 + 1));
                        arrayDeque = arrayList;
                        break;
                    }
                    i2 = i3;
                    i = iM28342;
                }
                i3++;
            }
        }
        return new C15658(interfaceC19637M33063, AbstractC1928.m6612((Iterable) arrayDeque));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19637 m33063(ArrayDeque arrayDeque, InterfaceC19637 interfaceC19637) {
        int i = C23118.f74975[interfaceC19637.mo2283().ordinal()];
        if (i == 1) {
            return m33063(arrayDeque, ((InterfaceC17068) interfaceC19637).getType());
        }
        if (i == 2) {
            InterfaceC2153 interfaceC2153 = (InterfaceC2153) interfaceC19637;
            if (interfaceC2153.mo7418().mo2283() == EnumC22621.ARRAY_TYPE) {
                InterfaceC19637 interfaceC19637M33063 = m33063(arrayDeque, interfaceC2153.mo7418());
                arrayDeque.addFirst(AbstractC1928.copyOf((Collection) interfaceC2153.getAnnotations()));
                return interfaceC19637M33063;
            }
        }
        return interfaceC19637;
    }
}
