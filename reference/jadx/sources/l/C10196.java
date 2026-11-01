package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۤۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C10196 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f34826;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Comparable f34827;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15841 f34828;

    public C10196() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f34827.compareTo(((C10196) obj).f34827);
    }

    public C10196(C15841 c15841, Comparable comparable, Object obj) {
        this.f34828 = c15841;
        this.f34827 = comparable;
        this.f34826 = obj;
    }

    @Override // java.util.Map.Entry
    public final Comparable getKey() {
        return this.f34827;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f34827;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f34826;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f34828.m37651();
        Object obj2 = this.f34826;
        this.f34826 = obj;
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
                Comparable comparable = this.f34827;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f34826;
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
        Comparable comparable = this.f34827;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f34826;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return this.f34827 + "=" + this.f34826;
    }
}
