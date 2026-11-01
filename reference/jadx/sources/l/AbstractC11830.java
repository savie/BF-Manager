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

/* JADX INFO: renamed from: l.ۨܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11830 extends AbstractC22413 implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f39726;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient Map f39727;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public abstract Collection mo29507();

    public AbstractC11830(Map map) {
        C18304.m42517(map.isEmpty());
        this.f39727 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29502(AbstractC11830 abstractC11830, int i) {
        abstractC11830.f39726 += i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29504(AbstractC11830 abstractC11830) {
        abstractC11830.f39726--;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29505(AbstractC11830 abstractC11830) {
        abstractC11830.f39726++;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29506(AbstractC11830 abstractC11830, int i) {
        abstractC11830.f39726 -= i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29510(Map map) {
        this.f39727 = map;
        this.f39726 = 0;
        for (Collection collection : map.values()) {
            C18304.m42517(!collection.isEmpty());
            this.f39726 = collection.size() + this.f39726;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Map m29514() {
        return this.f39727;
    }

    @Override // l.InterfaceC19425
    public int size() {
        return this.f39726;
    }

    @Override // l.InterfaceC19425
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f39727.get(obj);
        if (collection == null) {
            Collection collectionMo29507 = mo29507();
            if (collectionMo29507.add(obj2)) {
                this.f39726++;
                this.f39727.put(obj, collectionMo29507);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(obj2)) {
            return false;
        }
        this.f39726++;
        return true;
    }

    @Override // l.InterfaceC19425
    public void clear() {
        Iterator it = this.f39727.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f39727.clear();
        this.f39726 = 0;
    }

    @Override // l.InterfaceC19425
    public Collection get(Object obj) {
        Collection collectionMo29507 = (Collection) this.f39727.get(obj);
        if (collectionMo29507 == null) {
            collectionMo29507 = mo29507();
        }
        AbstractC7120 abstractC7120 = (AbstractC7120) this;
        List list = (List) collectionMo29507;
        if (!(list instanceof RandomAccess)) {
            return new C13947(abstractC7120, obj, list, null);
        }
        return new C23349(abstractC7120, obj, list, null);
    }

    @Override // l.AbstractC22413
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Set mo29511() {
        return new C16998(this, this.f39727);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Set m29509() {
        Map map = this.f39727;
        if (map instanceof NavigableMap) {
            return new C10649(this, (NavigableMap) this.f39727);
        }
        if (map instanceof SortedMap) {
            return new C1475(this, (SortedMap) this.f39727);
        }
        return new C16998(this, this.f39727);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29503(AbstractC11830 abstractC11830, Object obj) {
        Object objRemove;
        Map map = abstractC11830.f39727;
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
            abstractC11830.f39726 -= size;
        }
    }

    @Override // l.AbstractC22413
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Collection mo29508() {
        return new C5479(this);
    }

    @Override // l.AbstractC22413
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Map mo29513() {
        return new C0064(this, this.f39727);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Map m29512() {
        Map map = this.f39727;
        if (map instanceof NavigableMap) {
            return new C5709(this, (NavigableMap) this.f39727);
        }
        if (map instanceof SortedMap) {
            return new C14177(this, (SortedMap) this.f39727);
        }
        return new C0064(this, this.f39727);
    }
}
