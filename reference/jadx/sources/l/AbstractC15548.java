package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܳᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261W */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15548 implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            C22876 c22876 = (C22876) this;
            if (C17359.equals(c22876.getKey(), entry.getKey()) && C17359.equals(c22876.getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C22876 c22876 = (C22876) this;
        Object key = c22876.getKey();
        Object value = c22876.getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C22876 c22876 = (C22876) this;
        sb.append(c22876.getKey());
        sb.append("=");
        sb.append(c22876.getValue());
        return sb.toString();
    }
}
