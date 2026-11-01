package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes4.dex */
public final class C15802 implements Set {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16507 f51152;

    public C15802(AbstractC16507 abstractC16507) {
        this.f51152 = abstractC16507;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f51152.mo36172();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f51152.mo36169(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Map mapMo36177 = this.f51152.mo36177();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!mapMo36177.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f51152.mo36175() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C7334(this.f51152, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC16507 abstractC16507 = this.f51152;
        int iMo36169 = abstractC16507.mo36169(obj);
        if (iMo36169 < 0) {
            return false;
        }
        abstractC16507.mo36173(iMo36169);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Map mapMo36177 = this.f51152.mo36177();
        int size = mapMo36177.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mapMo36177.remove(it.next());
        }
        return size != mapMo36177.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC16507.m38780(this.f51152.mo36177(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f51152.mo36175();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f51152.m38782(0, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC16507.m38781((Set) this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        AbstractC16507 abstractC16507 = this.f51152;
        int iHashCode = 0;
        for (int iMo36175 = abstractC16507.mo36175() - 1; iMo36175 >= 0; iMo36175--) {
            Object objMo36170 = abstractC16507.mo36170(iMo36175, 0);
            iHashCode += objMo36170 == null ? 0 : objMo36170.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        AbstractC16507 abstractC16507 = this.f51152;
        int iMo36175 = abstractC16507.mo36175();
        Object[] objArr = new Object[iMo36175];
        for (int i = 0; i < iMo36175; i++) {
            objArr[i] = abstractC16507.mo36170(i, 0);
        }
        return objArr;
    }
}
