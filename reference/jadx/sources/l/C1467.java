package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֨᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1467 extends C1600 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20024 f5118;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1467(AbstractC20024 abstractC20024, Map map) {
        super(map);
        this.f5118 = abstractC20024;
    }

    @Override // l.C1600, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C10415 c10415 = (C10415) it;
            if (!c10415.hasNext()) {
                return;
            }
            c10415.next();
            c10415.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f5499.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f5499.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5499.keySet().hashCode();
    }

    @Override // l.C1600, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C10415(this, this.f5499.entrySet().iterator());
    }

    @Override // l.C1600, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f5499.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            AbstractC20024.m46062(this.f5118, size);
        } else {
            size = 0;
        }
        return size > 0;
    }
}
