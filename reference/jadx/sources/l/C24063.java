package l;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35QW */
/* JADX INFO: loaded from: classes.dex */
public final class C24063 implements InterfaceC6163, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f77804;

    public C24063(List list) {
        this.f77804 = list;
    }

    @Override // l.InterfaceC6163
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f77804;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC6163) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        return this.f77804.hashCode() + 306654252;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24063) {
            return this.f77804.equals(((C24063) obj).f77804);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f77804) {
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
