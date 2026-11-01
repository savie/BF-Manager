package l;

import java.util.Map;

/* JADX INFO: renamed from: l.֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1998 implements Map.Entry {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C1998 f7457;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f7458;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f7459;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1998 f7460;

    public C1998(Object obj, Object obj2) {
        this.f7458 = obj;
        this.f7459 = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7458;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7459;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f7458 + "=" + this.f7459;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1998)) {
            return false;
        }
        C1998 c1998 = (C1998) obj;
        return this.f7458.equals(c1998.f7458) && this.f7459.equals(c1998.f7459);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7458.hashCode() ^ this.f7459.hashCode();
    }
}
