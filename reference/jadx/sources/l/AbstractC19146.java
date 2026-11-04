package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5PA */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19146 extends AbstractC10195 implements Map {
    @Override // l.AbstractC10195
    /* JADX INFO: renamed from: ᩴ */
    public abstract Map mo26313();

    @Override // java.util.Map
    public int size() {
        return mo26313().size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo26313().isEmpty();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return mo26313().remove(obj);
    }

    @Override // java.util.Map
    public final void clear() {
        mo26313().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo26313().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo26313().containsValue(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return mo26313().get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return mo26313().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        mo26313().putAll(map);
    }

    @Override // java.util.Map
    public Set keySet() {
        return mo26313().keySet();
    }

    @Override // java.util.Map
    public Collection values() {
        return mo26313().values();
    }

    @Override // java.util.Map
    public Set entrySet() {
        return mo26313().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || mo26313().equals(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo26313().hashCode();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m44383(Object obj) {
        return C15769.m37710(this, obj);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m44382() {
        return C12324.m30737(entrySet());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44381(Object obj) {
        C10548 c10548 = new C10548(entrySet().iterator());
        if (obj == null) {
            while (c10548.hasNext()) {
                if (c10548.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (c10548.hasNext()) {
            if (obj.equals(c10548.next())) {
                return true;
            }
        }
        return false;
    }
}
