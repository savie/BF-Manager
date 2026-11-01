package l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: l.֡֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes2.dex */
public class C0064 extends AbstractC18719 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient Map f963;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11830 f964;

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f963;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object c13947;
        Map map = this.f963;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        AbstractC7120 abstractC7120 = (AbstractC7120) this.f964;
        List list = (List) collection;
        if (!(list instanceof RandomAccess)) {
            c13947 = new C13947(abstractC7120, obj, list, null);
        } else {
            c13947 = new C23349(abstractC7120, obj, list, null);
        }
        return c13947;
    }

    public C0064(AbstractC11830 abstractC11830, Map map) {
        this.f964 = abstractC11830;
        this.f963 = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f964.m49698();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f963.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f963.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractC11830 abstractC11830 = this.f964;
        Collection collectionMo29507 = abstractC11830.mo29507();
        collectionMo29507.addAll(collection);
        AbstractC11830.m29506(abstractC11830, collection.size());
        collection.clear();
        return collectionMo29507;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f963.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f963.hashCode();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f963.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC11830 abstractC11830 = this.f964;
        Map map = abstractC11830.f39727;
        Map map2 = this.f963;
        if (map2 == map) {
            abstractC11830.clear();
            return;
        }
        Iterator it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Collection collection = (Collection) entry.getValue();
            m982(entry);
            C18304.m42522("no calls to next() since the last call to remove()", collection != null);
            it.remove();
            AbstractC11830.m29506(abstractC11830, collection.size());
            collection.clear();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractMap.SimpleImmutableEntry m982(Map.Entry entry) {
        Object c13947;
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        AbstractC7120 abstractC7120 = (AbstractC7120) this.f964;
        List list = (List) collection;
        if (!(list instanceof RandomAccess)) {
            c13947 = new C13947(abstractC7120, key, list, null);
        } else {
            c13947 = new C23349(abstractC7120, key, list, null);
        }
        return new AbstractMap.SimpleImmutableEntry(key, c13947);
    }
}
