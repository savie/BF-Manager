package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes5.dex */
public class C16998 extends C22953 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11830 f54346;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16998(AbstractC11830 abstractC11830, Map map) {
        super(map);
        this.f54346 = abstractC11830;
    }

    @Override // l.C22953, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C12060 c12060 = (C12060) it;
            if (!c12060.hasNext()) {
                return;
            }
            c12060.next();
            c12060.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f74624.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f74624.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f74624.keySet().hashCode();
    }

    @Override // l.C22953, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C12060(this, this.f74624.entrySet().iterator());
    }

    @Override // l.C22953, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f74624.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            AbstractC11830.m29506(this.f54346, size);
        } else {
            size = 0;
        }
        return size > 0;
    }
}
