package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.֡۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5PA */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0415 extends AbstractC16644 implements Map {
    @Override // l.AbstractC16644
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract Map mo2173();

    @Override // java.util.Map
    public int size() {
        return mo2173().size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo2173().isEmpty();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return mo2173().remove(obj);
    }

    @Override // java.util.Map
    public final void clear() {
        mo2173().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo2173().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo2173().containsValue(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return mo2173().get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return mo2173().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        mo2173().putAll(map);
    }

    @Override // java.util.Map
    public Set keySet() {
        return mo2173().keySet();
    }

    @Override // java.util.Map
    public Collection values() {
        return mo2173().values();
    }

    @Override // java.util.Map
    public Set entrySet() {
        return mo2173().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || mo2173().equals(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo2173().hashCode();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m2174(Object obj) {
        return C8136.m21448(this, obj);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m2171() {
        return C21209.m47668(entrySet());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2172(Object obj) {
        C13781 c13781 = new C13781(entrySet().iterator());
        if (obj == null) {
            while (c13781.hasNext()) {
                if (c13781.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (c13781.hasNext()) {
            if (obj.equals(c13781.next())) {
                return true;
            }
        }
        return false;
    }
}
