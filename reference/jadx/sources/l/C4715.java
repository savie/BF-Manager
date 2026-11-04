package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۙۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4715 implements Map.Entry {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C4715 f16627;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C4715 f16628;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C4715 f16629;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Object f16630;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C4715 f16631;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f16632;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f16633;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C4715 f16634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f16635;

    public C4715(boolean z) {
        this.f16633 = null;
        this.f16632 = z;
        this.f16631 = this;
        this.f16629 = this;
    }

    public C4715(boolean z, C4715 c4715, Object obj, C4715 c4716, C4715 c4717) {
        this.f16634 = c4715;
        this.f16633 = obj;
        this.f16632 = z;
        this.f16635 = 1;
        this.f16629 = c4716;
        this.f16631 = c4717;
        c4717.f16629 = this;
        c4716.f16631 = this;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f16633;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16630;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f16632) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f16630;
        this.f16630 = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f16633;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f16630;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f16633;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f16630;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return this.f16633 + "=" + this.f16630;
    }
}
