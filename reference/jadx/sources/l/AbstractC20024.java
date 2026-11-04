package l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ᩴᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20024 extends AbstractC5854 implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient Map f64322;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient int f64323;

    /* JADX INFO: renamed from: ۫ */
    public abstract Collection mo41614();

    public AbstractC20024(Map map) {
        C12128.m30309(map.isEmpty());
        this.f64322 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46058(AbstractC20024 abstractC20024, int i) {
        abstractC20024.f64323 += i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46060(AbstractC20024 abstractC20024) {
        abstractC20024.f64323--;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46061(AbstractC20024 abstractC20024) {
        abstractC20024.f64323++;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46062(AbstractC20024 abstractC20024, int i) {
        abstractC20024.f64323 -= i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46064(Map map) {
        this.f64322 = map;
        this.f64323 = 0;
        for (Collection collection : map.values()) {
            C12128.m30309(!collection.isEmpty());
            this.f64323 = collection.size() + this.f64323;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Map m46068() {
        return this.f64322;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m46067() {
        return this.f64323;
    }

    @Override // l.InterfaceC23229
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo46065(Number number, Object obj) {
        Collection collection = (Collection) this.f64322.get(number);
        if (collection == null) {
            Collection collectionMo41614 = mo41614();
            if (collectionMo41614.add(obj)) {
                this.f64323++;
                this.f64322.put(number, collectionMo41614);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(obj)) {
            return false;
        }
        this.f64323++;
        return true;
    }

    public final void clear() {
        Iterator it = this.f64322.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f64322.clear();
        this.f64323 = 0;
    }

    @Override // l.InterfaceC23229
    public Collection get(Object obj) {
        Collection collectionMo41614 = (Collection) this.f64322.get(obj);
        if (collectionMo41614 == null) {
            collectionMo41614 = mo41614();
        }
        AbstractC14890 abstractC14890 = (AbstractC14890) this;
        List list = (List) collectionMo41614;
        if (!(list instanceof RandomAccess)) {
            return new C23008(abstractC14890, obj, list, null);
        }
        return new C8924(abstractC14890, obj, list, null);
    }

    @Override // l.AbstractC5854
    /* JADX INFO: renamed from: ۤ */
    public Set mo17040() {
        return new C1467(this, this.f64322);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set m46063() {
        Map map = this.f64322;
        if (map instanceof NavigableMap) {
            return new C2958(this, (NavigableMap) this.f64322);
        }
        if (map instanceof SortedMap) {
            return new C14144(this, (SortedMap) this.f64322);
        }
        return new C1467(this, this.f64322);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46059(AbstractC20024 abstractC20024, Object obj) {
        Object objRemove;
        Map map = abstractC20024.f64322;
        map.getClass();
        try {
            objRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC20024.f64323 -= size;
        }
    }

    @Override // l.AbstractC5854
    /* JADX INFO: renamed from: ᩸ */
    public final Collection mo17043() {
        return new C13311(this);
    }

    @Override // l.AbstractC5854
    /* JADX INFO: renamed from: ᩷ */
    public Map mo17042() {
        return new C8179(this, this.f64322);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Map m46066() {
        Map map = this.f64322;
        if (map instanceof NavigableMap) {
            return new C9669(this, (NavigableMap) this.f64322);
        }
        if (map instanceof SortedMap) {
            return new C7433(this, (SortedMap) this.f64322);
        }
        return new C8179(this, this.f64322);
    }
}
