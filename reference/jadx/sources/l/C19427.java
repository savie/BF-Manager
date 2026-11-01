package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩵ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C19427 implements Map.Entry {
    public final int a;
    public final Object b;
    public volatile Object c;
    public volatile C19427 d;

    public C19427(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public C19427(int i, Object obj, Object obj2, C19427 c19427) {
        this(i, obj, obj2);
        this.d = c19427;
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
        return AbstractC14884.s(this.b, this.c);
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

    public C19427 a(int i, Object obj) {
        Object obj2;
        C19427 c19427 = this;
        do {
            if (c19427.a == i && ((obj2 = c19427.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return c19427;
            }
            c19427 = c19427.d;
        } while (c19427 != null);
        return null;
    }
}
