package l;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V578 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5613 extends AbstractC5439 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C5613 f19444;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC1928 f19445;

    static {
        int i = AbstractC1928.f6477;
        f19444 = new C5613(C4867.f16966, C0108.f1051);
    }

    public C5613(AbstractC1928 abstractC1928, Comparator comparator) {
        super(comparator);
        this.f19445 = abstractC1928;
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ۤ */
    public final Object[] mo14904() {
        return this.f19445.mo14904();
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ᩴ */
    public final int mo14906() {
        return this.f19445.mo14906();
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ᩸ */
    public final int mo14907() {
        return this.f19445.mo14907();
    }

    @Override // l.AbstractC5439, l.AbstractC8639, l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final AbstractC4516 iterator() {
        return this.f19445.listIterator(0);
    }

    @Override // l.AbstractC5439, java.util.NavigableSet
    public final AbstractC4516 descendingIterator() {
        return this.f19445.mo6620().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19445.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC18007) {
            collection = ((InterfaceC18007) collection).m41988();
        }
        Comparator comparator = this.f18990;
        if (!C4121.m13216(collection, comparator) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC4516 it = iterator();
        Iterator it2 = collection.iterator();
        AbstractC6688 abstractC6688 = (AbstractC6688) it;
        if (!abstractC6688.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = abstractC6688.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!abstractC6688.hasNext()) {
                        return false;
                    }
                    next2 = abstractC6688.next();
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

    @Override // l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f19445, obj, this.f18990) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo14905() {
        return this.f19445.mo14905();
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ۙ */
    public final int mo6619(int i, Object[] objArr) {
        return this.f19445.mo6619(i, objArr);
    }

    @Override // l.AbstractC8639, java.util.Collection, java.util.Set
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
        if (this.f19445.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f18990;
        if (C4121.m13216(set, comparator)) {
            Iterator it = set.iterator();
            try {
                AbstractC4516 it2 = iterator();
                do {
                    AbstractC6688 abstractC6688 = (AbstractC6688) it2;
                    if (!abstractC6688.hasNext()) {
                        return true;
                    }
                    next = abstractC6688.next();
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

    @Override // l.AbstractC5439, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f19445.get(0);
    }

    @Override // l.AbstractC5439, java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            AbstractC1928 abstractC1928 = this.f19445;
            return abstractC1928.get(abstractC1928.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // l.AbstractC5439, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM16591 = m16591(obj, false) - 1;
        if (iM16591 == -1) {
            return null;
        }
        return this.f19445.get(iM16591);
    }

    @Override // l.AbstractC5439, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM16591 = m16591(obj, true) - 1;
        if (iM16591 == -1) {
            return null;
        }
        return this.f19445.get(iM16591);
    }

    @Override // l.AbstractC5439, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM16593 = m16593(obj, true);
        AbstractC1928 abstractC1928 = this.f19445;
        if (iM16593 == abstractC1928.size()) {
            return null;
        }
        return abstractC1928.get(iM16593);
    }

    @Override // l.AbstractC5439, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM16593 = m16593(obj, false);
        AbstractC1928 abstractC1928 = this.f19445;
        if (iM16593 == abstractC1928.size()) {
            return null;
        }
        return abstractC1928.get(iM16593);
    }

    @Override // l.AbstractC5439
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC5439 mo16231(Object obj, boolean z) {
        return m16592(0, m16591(obj, z));
    }

    @Override // l.AbstractC5439
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC5439 mo16232(Object obj, boolean z, Object obj2, boolean z2) {
        return mo16234(obj, z).mo16231(obj2, z2);
    }

    @Override // l.AbstractC5439
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC5439 mo16234(Object obj, boolean z) {
        return m16592(m16593(obj, z), this.f19445.size());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5613 m16592(int i, int i2) {
        AbstractC1928 abstractC1928 = this.f19445;
        if (i == 0 && i2 == abstractC1928.size()) {
            return this;
        }
        Comparator comparator = this.f18990;
        if (i < i2) {
            return new C5613(abstractC1928.subList(i, i2), comparator);
        }
        return AbstractC5439.m16230(comparator);
    }

    @Override // l.AbstractC8639, l.AbstractC4911
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC1928 mo6621() {
        return this.f19445;
    }

    @Override // l.AbstractC5439
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC5439 mo16233() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f18990);
        if (isEmpty()) {
            return AbstractC5439.m16230(comparatorReverseOrder);
        }
        return new C5613(this.f19445.mo6620(), comparatorReverseOrder);
    }

    @Override // l.AbstractC5439, l.AbstractC8639, l.AbstractC4911
    public Object writeReplace() {
        return super.writeReplace();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m16591(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f19445, obj, this.f18990);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m16593(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f19445, obj, this.f18990);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }
}
