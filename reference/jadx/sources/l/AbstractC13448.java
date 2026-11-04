package l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.۫᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 41PX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13448 extends AbstractC6957 implements Cloneable, InterfaceC5509, InterfaceC14375 {
    @Override // l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* synthetic */ InterfaceC8409 spliterator() {
        return C13629.spliterator(this, 1);
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
        if (set instanceof InterfaceC5509) {
            return mo19257((InterfaceC5509) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int size = size();
        InterfaceC6036 it = iterator();
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
        return super.mo4933(i);
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    @Deprecated
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4933(int i) {
        return remove(i);
    }
}
