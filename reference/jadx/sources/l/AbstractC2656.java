package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۖܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261W */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2656 implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            C4648 c4648 = (C4648) this;
            if (C13638.equals(c4648.getKey(), entry.getKey()) && C13638.equals(c4648.getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C4648 c4648 = (C4648) this;
        Object key = c4648.getKey();
        Object value = c4648.getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C4648 c4648 = (C4648) this;
        sb.append(c4648.getKey());
        sb.append("=");
        sb.append(c4648.getValue());
        return sb.toString();
    }
}
