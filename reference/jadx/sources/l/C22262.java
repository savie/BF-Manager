package l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes.dex */
public class C22262 extends AbstractCollection {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f71731;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20024 f71732;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22262 f71733;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Collection f71734;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Collection f71735;

    public C22262(AbstractC20024 abstractC20024, Object obj, List list, C22262 c22262) {
        this.f71732 = abstractC20024;
        this.f71731 = obj;
        this.f71734 = list;
        this.f71733 = c22262;
        this.f71735 = c22262 == null ? null : c22262.f71734;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50313() {
        Collection collection;
        C22262 c22262 = this.f71733;
        if (c22262 != null) {
            c22262.m50313();
            if (c22262.f71734 != this.f71735) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f71734.isEmpty() || (collection = (Collection) this.f71732.f64322.get(this.f71731)) == null) {
                return;
            }
            this.f71734 = collection;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m50315() {
        C22262 c22262 = this.f71733;
        if (c22262 != null) {
            c22262.m50315();
        } else if (this.f71734.isEmpty()) {
            this.f71732.f64322.remove(this.f71731);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50314() {
        C22262 c22262 = this.f71733;
        if (c22262 == null) {
            this.f71732.f64322.put(this.f71731, this.f71734);
        } else {
            c22262.m50314();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        m50313();
        return this.f71734.size();
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m50313();
        return this.f71734.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        m50313();
        return this.f71734.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m50313();
        return this.f71734.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        m50313();
        return new C5108(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        m50313();
        boolean zIsEmpty = this.f71734.isEmpty();
        boolean zAdd = this.f71734.add(obj);
        if (zAdd) {
            AbstractC20024.m46061(this.f71732);
            if (zIsEmpty) {
                m50314();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f71734.addAll(collection);
        if (zAddAll) {
            AbstractC20024.m46058(this.f71732, this.f71734.size() - size);
            if (size == 0) {
                m50314();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        m50313();
        return this.f71734.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        m50313();
        return this.f71734.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f71734.clear();
        AbstractC20024.m46062(this.f71732, size);
        m50315();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        m50313();
        boolean zRemove = this.f71734.remove(obj);
        if (zRemove) {
            AbstractC20024.m46060(this.f71732);
            m50315();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f71734.removeAll(collection);
        if (zRemoveAll) {
            AbstractC20024.m46058(this.f71732, this.f71734.size() - size);
            m50315();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f71734.retainAll(collection);
        if (zRetainAll) {
            AbstractC20024.m46058(this.f71732, this.f71734.size() - size);
            m50315();
        }
        return zRetainAll;
    }
}
