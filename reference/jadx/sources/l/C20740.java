package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes4.dex */
public final class C20740 implements Set {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16507 f67486;

    public C20740(AbstractC16507 abstractC16507) {
        this.f67486 = abstractC16507;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC16507 abstractC16507 = this.f67486;
        int iMo36175 = abstractC16507.mo36175();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            abstractC16507.mo36174(entry.getKey(), entry.getValue());
        }
        return iMo36175 != abstractC16507.mo36175();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f67486.mo36172();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            AbstractC16507 abstractC16507 = this.f67486;
            int iMo36169 = abstractC16507.mo36169(key);
            if (iMo36169 >= 0) {
                Object objMo36170 = abstractC16507.mo36170(iMo36169, 1);
                Object value = entry.getValue();
                return objMo36170 == value || (objMo36170 != null && objMo36170.equals(value));
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f67486.mo36175() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C20035(this.f67486);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f67486.mo36175();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC16507.m38781((Set) this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        AbstractC16507 abstractC16507 = this.f67486;
        int iHashCode = 0;
        for (int iMo36175 = abstractC16507.mo36175() - 1; iMo36175 >= 0; iMo36175--) {
            Object objMo36170 = abstractC16507.mo36170(iMo36175, 0);
            Object objMo36171 = abstractC16507.mo36170(iMo36175, 1);
            iHashCode += (objMo36170 == null ? 0 : objMo36170.hashCode()) ^ (objMo36171 == null ? 0 : objMo36171.hashCode());
        }
        return iHashCode;
    }
}
