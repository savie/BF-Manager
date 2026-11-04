package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۙۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C4736 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Comparable f16665;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f16666;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22636 f16667;

    public C4736() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16665.compareTo(((C4736) obj).f16665);
    }

    public C4736(C22636 c22636, Comparable comparable, Object obj) {
        this.f16667 = c22636;
        this.f16665 = comparable;
        this.f16666 = obj;
    }

    @Override // java.util.Map.Entry
    public final Comparable getKey() {
        return this.f16665;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f16665;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16666;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f16667.m51012();
        Object obj2 = this.f16666;
        this.f16666 = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f16665;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f16666;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f16665;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f16666;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return this.f16665 + "=" + this.f16666;
    }
}
