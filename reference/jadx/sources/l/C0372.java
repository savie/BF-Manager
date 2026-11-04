package l;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.֡ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: OIUU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0372 implements Map {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f1902 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0372 m2161(C0372 c0372) {
        c0372.getClass();
        C0372 c0373 = new C0372();
        for (C21943 c21943 : c0372.f1902.keySet()) {
            c0373.put(c21943, C18271.m42424(c0372.get((Object) c21943)));
        }
        return c0373;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2162(C0372 c0372, C0372 c0373) {
        c0372.getClass();
        for (C18271 c18271 : c0373.f1902.values()) {
            C21943 c21943 = c18271.f59611;
            if (c0372.f1902.containsKey(c21943)) {
                C18271.m42421(c0372.get((Object) c21943), c18271);
            } else {
                c0372.put(c21943, C18271.m42424(c18271));
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f1902.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f1902.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof C21943)) {
            return false;
        }
        return this.f1902.containsKey((C21943) obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f1902.entrySet();
    }

    @Override // java.util.Map
    public final C18271 get(Object obj) {
        return (C18271) this.f1902.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f1902.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f1902.keySet();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final C18271 put(C21943 c21943, C18271 c18271) {
        return (C18271) this.f1902.put(c21943, c18271);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f1902.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return (C18271) this.f1902.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f1902.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f1902.values();
    }
}
