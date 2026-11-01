package l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes2.dex */
public class C2886 extends AbstractCollection {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Collection f10884;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11830 f10885;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C2886 f10886;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f10887;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Collection f10888;

    public C2886(AbstractC11830 abstractC11830, Object obj, List list, C2886 c2886) {
        this.f10885 = abstractC11830;
        this.f10887 = obj;
        this.f10884 = list;
        this.f10886 = c2886;
        this.f10888 = c2886 == null ? null : c2886.f10884;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m8687() {
        Collection collection;
        C2886 c2886 = this.f10886;
        if (c2886 != null) {
            c2886.m8687();
            if (c2886.f10884 != this.f10888) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f10884.isEmpty() || (collection = (Collection) this.f10885.f39727.get(this.f10887)) == null) {
                return;
            }
            this.f10884 = collection;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m8686() {
        C2886 c2886 = this.f10886;
        if (c2886 != null) {
            c2886.m8686();
        } else if (this.f10884.isEmpty()) {
            this.f10885.f39727.remove(this.f10887);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m8688() {
        C2886 c2886 = this.f10886;
        if (c2886 == null) {
            this.f10885.f39727.put(this.f10887, this.f10884);
        } else {
            c2886.m8688();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        m8687();
        return this.f10884.size();
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m8687();
        return this.f10884.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        m8687();
        return this.f10884.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m8687();
        return this.f10884.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        m8687();
        return new C9238(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        m8687();
        boolean zIsEmpty = this.f10884.isEmpty();
        boolean zAdd = this.f10884.add(obj);
        if (zAdd) {
            AbstractC11830.m29505(this.f10885);
            if (zIsEmpty) {
                m8688();
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
        boolean zAddAll = this.f10884.addAll(collection);
        if (zAddAll) {
            AbstractC11830.m29502(this.f10885, this.f10884.size() - size);
            if (size == 0) {
                m8688();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        m8687();
        return this.f10884.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        m8687();
        return this.f10884.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f10884.clear();
        AbstractC11830.m29506(this.f10885, size);
        m8686();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        m8687();
        boolean zRemove = this.f10884.remove(obj);
        if (zRemove) {
            AbstractC11830.m29504(this.f10885);
            m8686();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f10884.removeAll(collection);
        if (zRemoveAll) {
            AbstractC11830.m29502(this.f10885, this.f10884.size() - size);
            m8686();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f10884.retainAll(collection);
        if (zRetainAll) {
            AbstractC11830.m29502(this.f10885, this.f10884.size() - size);
            m8686();
        }
        return zRetainAll;
    }
}
