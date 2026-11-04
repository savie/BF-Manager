package l;

import java.util.Map;

/* JADX INFO: renamed from: l.۫᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13399 implements Map.Entry {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f42701;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f42702;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC5942 f42703;

    public C13399(ConcurrentMapC5942 concurrentMapC5942, Object obj, Object obj2) {
        this.f42703 = concurrentMapC5942;
        this.f42701 = obj;
        this.f42702 = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f42701;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f42702;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.f42701.equals(entry.getKey()) && this.f42702.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f42701.hashCode() ^ this.f42702.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object objPut = this.f42703.put(this.f42701, obj);
        this.f42702 = obj;
        return objPut;
    }

    public final String toString() {
        return this.f42701 + "=" + this.f42702;
    }
}
