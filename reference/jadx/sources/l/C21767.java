package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes.dex */
public final class C21767 implements Map.Entry {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f69412;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f69413;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21767 f69414;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C21767 f69415;

    public C21767(Object obj, Object obj2) {
        this.f69413 = obj;
        this.f69412 = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f69413;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f69412;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f69413 + "=" + this.f69412;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21767)) {
            return false;
        }
        C21767 c21767 = (C21767) obj;
        return this.f69413.equals(c21767.f69413) && this.f69412.equals(c21767.f69412);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f69413.hashCode() ^ this.f69412.hashCode();
    }
}
