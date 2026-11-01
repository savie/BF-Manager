package l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩵ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1DS */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19385 extends AbstractC3861 implements Cloneable, InterfaceC14572, InterfaceC22810 {
    @Override // l.AbstractC3861, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public /* synthetic */ InterfaceC20693 spliterator() {
        return C19988.spliterator(this, 1);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != size()) {
            return false;
        }
        if (set instanceof InterfaceC14572) {
            return mo11183((InterfaceC14572) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int size = size();
        InterfaceC15277 it = iterator();
        int iMo1416 = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iMo1416;
            }
            iMo1416 += it.mo1416();
            size = i;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo2289(char c) {
        return super.mo5455(c);
    }

    @Override // l.AbstractC3861, l.InterfaceC23475
    @Deprecated
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5455(char c) {
        return mo2289(c);
    }
}
