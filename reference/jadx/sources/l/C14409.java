package l;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14409 implements Map {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f47241;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9470 f47242;

    public C14409(C9470 c9470, LinkedHashMap linkedHashMap) {
        this.f47242 = c9470;
        this.f47241 = linkedHashMap;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f47241.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f47241.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f47241.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f47241.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f47241.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f47242.m24246();
        byte[] bArr = C9779.f33478;
        obj.getClass();
        obj2.getClass();
        return this.f47241.put(obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.f47242.m24246();
        return this.f47241.remove(obj);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f47242.m24246();
        for (Object obj : map.keySet()) {
            byte[] bArr = C9779.f33478;
            obj.getClass();
            map.get(obj).getClass();
        }
        this.f47241.putAll(map);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f47242.m24246();
        this.f47241.clear();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C23581(this.f47242, this.f47241.keySet());
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C5941(this.f47242, this.f47241.values());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C23581(this.f47242, this.f47241.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f47241.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f47241.hashCode();
    }

    public final String toString() {
        return this.f47241.toString();
    }
}
