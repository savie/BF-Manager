package l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ܳܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBSP */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14613 extends AbstractC20257 implements Cloneable, InterfaceC18928, InterfaceC22810 {
    @Override // l.AbstractC20257, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC20257, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public /* synthetic */ InterfaceC20693 spliterator() {
        return C19988.spliterator(this, 1);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo15519(long j);

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
        if (set instanceof InterfaceC18928) {
            return mo6644((InterfaceC18928) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int size = size();
        InterfaceC1288 it = iterator();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return i;
            }
            long jNextLong = it.nextLong();
            i += (int) (jNextLong ^ (jNextLong >>> 32));
            size = i2;
        }
    }

    @Override // l.InterfaceC14800
    @Deprecated
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo21796(long j) {
        return mo15519(j);
    }
}
