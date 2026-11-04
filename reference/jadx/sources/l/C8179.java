package l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: l.۟᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public class C8179 extends AbstractC17261 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20024 f26974;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient Map f26975;

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f26975;
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
        Object c23008;
        Map map = this.f26975;
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
        AbstractC14890 abstractC14890 = (AbstractC14890) this.f26974;
        List list = (List) collection;
        if (!(list instanceof RandomAccess)) {
            c23008 = new C23008(abstractC14890, obj, list, null);
        } else {
            c23008 = new C8924(abstractC14890, obj, list, null);
        }
        return c23008;
    }

    public C8179(AbstractC20024 abstractC20024, Map map) {
        this.f26974 = abstractC20024;
        this.f26975 = map;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        return this.f26974.m17041();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f26975.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f26975.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractC20024 abstractC20024 = this.f26974;
        Collection collectionMo41614 = abstractC20024.mo41614();
        collectionMo41614.addAll(collection);
        AbstractC20024.m46062(abstractC20024, collection.size());
        collection.clear();
        return collectionMo41614;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f26975.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f26975.hashCode();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f26975.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC20024 abstractC20024 = this.f26974;
        if (this.f26975 == abstractC20024.f64322) {
            abstractC20024.clear();
            return;
        }
        C0721 c0721 = new C0721(this);
        while (c0721.hasNext()) {
            c0721.next();
            c0721.remove();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractMap.SimpleImmutableEntry m22089(Map.Entry entry) {
        Object c23008;
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        AbstractC14890 abstractC14890 = (AbstractC14890) this.f26974;
        List list = (List) collection;
        if (!(list instanceof RandomAccess)) {
            c23008 = new C23008(abstractC14890, key, list, null);
        } else {
            c23008 = new C8924(abstractC14890, key, list, null);
        }
        return new AbstractMap.SimpleImmutableEntry(key, c23008);
    }
}
