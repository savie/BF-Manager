package l;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۟᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7804 extends AbstractSet {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract AbstractC0477 iterator();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract int mo20470();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z = set instanceof AbstractC7804;
                int iMo20470 = z ? ((AbstractC7804) set).mo20470() : set.size();
                if (iMo20470 >= 0) {
                    int size = z ? 0 : set.size();
                    if (mo20470() >= size) {
                        AbstractC0477 it = iterator();
                        int i = 0;
                        while (true) {
                            AbstractC9943 abstractC9943 = (AbstractC9943) it;
                            if (!abstractC9943.hasNext()) {
                                if (i != iMo20470) {
                                    if (i < size) {
                                        break;
                                    }
                                    Iterator it2 = set.iterator();
                                    int i2 = 0;
                                    while (it2.hasNext()) {
                                        it2.next();
                                        i2++;
                                        if (i2 > i) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                try {
                                    if (!set.contains(abstractC9943.next())) {
                                        break;
                                    }
                                    i++;
                                } catch (ClassCastException | NullPointerException unused) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
