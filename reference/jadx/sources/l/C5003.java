package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۚ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5003 implements Map.Entry {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f17414;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f17415;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC21937 f17416;

    public C5003(ConcurrentMapC21937 concurrentMapC21937, Object obj, Object obj2) {
        this.f17416 = concurrentMapC21937;
        this.f17415 = obj;
        this.f17414 = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f17415;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17414;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.f17415.equals(entry.getKey()) && this.f17414.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f17415.hashCode() ^ this.f17414.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object objPut = this.f17416.put(this.f17415, obj);
        this.f17414 = obj;
        return objPut;
    }

    public final String toString() {
        return this.f17415 + "=" + this.f17414;
    }
}
