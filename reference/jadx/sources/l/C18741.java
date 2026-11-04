package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18741 implements Map.Entry {
    public final Object a;
    public Object b;
    public final ConcurrentMapC17249 c;

    public C18741(Object obj, Object obj2, ConcurrentMapC17249 concurrentMapC17249) {
        this.a = obj;
        this.b = obj2;
        this.c = concurrentMapC17249;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return AbstractC2946.s(this.a, this.b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.a;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.b;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.b;
        this.b = obj;
        this.c.put(this.a, obj);
        return obj2;
    }
}
