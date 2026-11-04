package l;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17283 implements Map {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f56309;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23251 f56310;

    public C17283(C23251 c23251, LinkedHashMap linkedHashMap) {
        this.f56310 = c23251;
        this.f56309 = linkedHashMap;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f56309.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f56309.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f56309.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f56309.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f56309.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f56310.m52273();
        byte[] bArr = C23447.f75887;
        obj.getClass();
        obj2.getClass();
        return this.f56309.put(obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.f56310.m52273();
        return this.f56309.remove(obj);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f56310.m52273();
        for (Object obj : map.keySet()) {
            byte[] bArr = C23447.f75887;
            obj.getClass();
            map.get(obj).getClass();
        }
        this.f56309.putAll(map);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f56310.m52273();
        this.f56309.clear();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C16537(this.f56310, this.f56309.keySet());
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C11316(this.f56310, this.f56309.values());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C16537(this.f56310, this.f56309.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f56309.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f56309.hashCode();
    }

    public final String toString() {
        return this.f56309.toString();
    }
}
