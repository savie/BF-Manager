package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۢ֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C9790 implements Map.Entry {
    public final int a;
    public final Object b;
    public volatile Object c;
    public volatile C9790 d;

    public C9790(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public C9790(int i, Object obj, Object obj2, C9790 c9790) {
        this(i, obj, obj2);
        this.d = c9790;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode();
    }

    public final String toString() {
        return AbstractC2946.s(this.b, this.c);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.b;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.c;
        return value == obj3 || value.equals(obj3);
    }

    public C9790 a(int i, Object obj) {
        Object obj2;
        C9790 c9790 = this;
        do {
            if (c9790.a == i && ((obj2 = c9790.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return c9790;
            }
            c9790 = c9790.d;
        } while (c9790 != null);
        return null;
    }
}
