package l;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.۠᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35QW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8427 implements InterfaceC19010, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f29275;

    public C8427(List list) {
        this.f29275 = list;
    }

    @Override // l.InterfaceC19010
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f29275;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC19010) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        return this.f29275.hashCode() + 306654252;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8427) {
            return this.f29275.equals(((C8427) obj).f29275);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f29275) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
