package l;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: l.۠᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA30 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8948 implements Map.Entry, Serializable, Cloneable {
    public static final long serialVersionUID = 9188503522395855322L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f29184;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f29185;

    public final Object clone() {
        return this;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C8948(String str) {
        str = str == null ? "" : str;
        this.f29185 = str;
        this.f29184 = str.toLowerCase();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f29184;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29185;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f29184.equals(entry.getKey()) && this.f29185.equals(entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f29184;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f29185;
        return (str2 != null ? str2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return this.f29184 + "=" + this.f29185;
    }
}
