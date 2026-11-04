package l;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.֨᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6H7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1447 implements Map {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f5067 = new HashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f5067.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f5067.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof C5514)) {
            return false;
        }
        return this.f5067.containsKey((C5514) obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f5067.entrySet();
    }

    @Override // java.util.Map
    public final List get(Object obj) {
        return (List) this.f5067.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f5067.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f5067.keySet();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m5204(C19684 c19684) {
        for (C5514 c5514 : this.f5067.keySet()) {
            if (!c5514.m16420() && c5514.m16417().equals(c19684)) {
                if (c5514 == null) {
                    return null;
                }
                return get((Object) c5514);
            }
        }
        c5514 = null;
        if (c5514 == null) {
            return null;
        }
        return get((Object) c5514);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final List put(C5514 c5514, List list) {
        return (List) this.f5067.put(c5514, list);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f5067.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return (List) this.f5067.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5067.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f5067.values();
    }
}
