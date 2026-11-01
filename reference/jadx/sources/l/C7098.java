package l;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V578 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7098 extends AbstractC0934 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C7098 f23785;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC22433 f23786;

    static {
        int i = AbstractC22433.f73217;
        f23785 = new C7098(C12038.f40301, C17308.f55088);
    }

    public C7098(AbstractC22433 abstractC22433, Comparator comparator) {
        super(comparator);
        this.f23786 = abstractC22433;
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۨ */
    public final Object[] mo5970() {
        return this.f23786.mo5970();
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۚ */
    public final int mo5969() {
        return this.f23786.mo5969();
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۖ */
    public final int mo5967() {
        return this.f23786.mo5967();
    }

    @Override // l.AbstractC0934, l.AbstractC23844, l.AbstractC1826, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final AbstractC0477 iterator() {
        return this.f23786.listIterator(0);
    }

    @Override // l.AbstractC0934, java.util.NavigableSet
    public final AbstractC0477 descendingIterator() {
        return this.f23786.mo29543().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23786.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC12370) {
            collection = ((InterfaceC12370) collection).m30783();
        }
        Comparator comparator = this.f3735;
        if (!C0747.m3242(collection, comparator) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC0477 it = iterator();
        Iterator it2 = collection.iterator();
        AbstractC19115 abstractC19115 = (AbstractC19115) it;
        if (!abstractC19115.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = abstractC19115.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!abstractC19115.hasNext()) {
                        return false;
                    }
                    next2 = abstractC19115.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // l.AbstractC1826, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f23786, obj, this.f3735) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5042() {
        return this.f23786.mo5042();
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۙ */
    public final int mo5968(int i, Object[] objArr) {
        return this.f23786.mo5968(i, objArr);
    }

    @Override // l.AbstractC23844, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f23786.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f3735;
        if (C0747.m3242(set, comparator)) {
            Iterator it = set.iterator();
            try {
                AbstractC0477 it2 = iterator();
                do {
                    AbstractC19115 abstractC19115 = (AbstractC19115) it2;
                    if (!abstractC19115.hasNext()) {
                        return true;
                    }
                    next = abstractC19115.next();
                    next2 = it.next();
                    if (next2 == null) {
                        break;
                    }
                } while (comparator.compare(next, next2) == 0);
                return false;
            } catch (ClassCastException | NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // l.AbstractC0934, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f23786.get(0);
    }

    @Override // l.AbstractC0934, java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            AbstractC22433 abstractC22433 = this.f23786;
            return abstractC22433.get(abstractC22433.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // l.AbstractC0934, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM18974 = m18974(obj, false) - 1;
        if (iM18974 == -1) {
            return null;
        }
        return this.f23786.get(iM18974);
    }

    @Override // l.AbstractC0934, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM18974 = m18974(obj, true) - 1;
        if (iM18974 == -1) {
            return null;
        }
        return this.f23786.get(iM18974);
    }

    @Override // l.AbstractC0934, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM18973 = m18973(obj, true);
        AbstractC22433 abstractC22433 = this.f23786;
        if (iM18973 == abstractC22433.size()) {
            return null;
        }
        return abstractC22433.get(iM18973);
    }

    @Override // l.AbstractC0934, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM18973 = m18973(obj, false);
        AbstractC22433 abstractC22433 = this.f23786;
        if (iM18973 == abstractC22433.size()) {
            return null;
        }
        return abstractC22433.get(iM18973);
    }

    @Override // l.AbstractC0934
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC0934 mo3686(Object obj, boolean z) {
        return m18975(0, m18974(obj, z));
    }

    @Override // l.AbstractC0934
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC0934 mo3687(Object obj, boolean z, Object obj2, boolean z2) {
        return mo3689(obj, z).mo3686(obj2, z2);
    }

    @Override // l.AbstractC0934
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC0934 mo3689(Object obj, boolean z) {
        return m18975(m18973(obj, z), this.f23786.size());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7098 m18975(int i, int i2) {
        AbstractC22433 abstractC22433 = this.f23786;
        if (i == 0 && i2 == abstractC22433.size()) {
            return this;
        }
        Comparator comparator = this.f3735;
        if (i < i2) {
            return new C7098(abstractC22433.subList(i, i2), comparator);
        }
        return AbstractC0934.m3685(comparator);
    }

    @Override // l.AbstractC23844, l.AbstractC1826
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC22433 mo5971() {
        return this.f23786;
    }

    @Override // l.AbstractC0934
    /* JADX INFO: renamed from: ۜ */
    public final AbstractC0934 mo3688() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f3735);
        if (isEmpty()) {
            return AbstractC0934.m3685(comparatorReverseOrder);
        }
        return new C7098(this.f23786.mo29543(), comparatorReverseOrder);
    }

    @Override // l.AbstractC0934, l.AbstractC23844, l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m18973(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f23786, obj, this.f3735);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m18974(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f23786, obj, this.f3735);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }
}
