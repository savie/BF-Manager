package l;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R9OP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3118 extends LinkedHashMap {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C3118 f11757;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f11758 = true;

    static {
        C3118 c3118 = new C3118();
        f11757 = c3118;
        c3118.f11758 = false;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C3118 m9383() {
        return f11757;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9389(C3118 c3118) {
        m9387();
        if (c3118.isEmpty()) {
            return;
        }
        putAll(c3118);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m9387();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m9387();
        byte[] bArr = C9779.f33478;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m9387();
        for (Object obj : map.keySet()) {
            byte[] bArr = C9779.f33478;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m9387();
        return super.remove(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9386(Map map, Map map2) {
        boolean zEquals;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj = map2.get(entry.getKey());
            if ((value instanceof byte[]) && (obj instanceof byte[])) {
                zEquals = Arrays.equals((byte[]) value, (byte[]) obj);
            } else {
                zEquals = value.equals(obj);
            }
            if (!zEquals) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return (obj instanceof Map) && m9386(this, (Map) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9384(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = C9779.f33478;
            int i = length;
            for (byte b : bArr) {
                i = (i * 31) + b;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        }
        if (obj instanceof InterfaceC12601) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9385(Map map) {
        int iM9384 = 0;
        for (Map.Entry entry : map.entrySet()) {
            iM9384 += m9384(entry.getValue()) ^ m9384(entry.getKey());
        }
        return iM9384;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return m9385((Map) this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m9388(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                value = Arrays.copyOf(bArr, bArr.length);
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3118 m9391() {
        if (isEmpty()) {
            return new C3118();
        }
        C3118 c3118 = new C3118(this);
        c3118.f11758 = true;
        return c3118;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m9392() {
        this.f11758 = false;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m9387() {
        if (!this.f11758) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9390() {
        return this.f11758;
    }
}
