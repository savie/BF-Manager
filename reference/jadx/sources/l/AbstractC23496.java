package l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩻ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41PX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23496 extends AbstractC15735 implements Cloneable, InterfaceC14842, InterfaceC22810 {
    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
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
        if (set instanceof InterfaceC14842) {
            return mo19503((InterfaceC14842) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int size = size();
        InterfaceC13431 it = iterator();
        int iNextInt = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iNextInt;
            }
            iNextInt += it.nextInt();
            size = i;
        }
    }

    public boolean remove(int i) {
        return super.mo3182(i);
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    @Deprecated
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo3182(int i) {
        return remove(i);
    }
}
