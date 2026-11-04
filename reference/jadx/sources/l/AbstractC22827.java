package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05J4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22827 implements InterfaceC13062 {
    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 28;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(28, interfaceC16791.mo5414());
        if (iCompare != 0) {
            return iCompare;
        }
        List value = getValue();
        List value2 = ((InterfaceC13062) interfaceC16791).getValue();
        int iCompare2 = Integer.compare(value.size(), value2.size());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        Iterator it = value2.iterator();
        Iterator it2 = value.iterator();
        while (it2.hasNext()) {
            int iCompareTo = ((Comparable) it2.next()).compareTo(it.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC13062) {
            return getValue().equals(((InterfaceC13062) obj).getValue());
        }
        return false;
    }
}
