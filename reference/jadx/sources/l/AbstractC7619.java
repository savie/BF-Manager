package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 05J4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7619 implements InterfaceC0390 {
    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 28;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(28, interfaceC10975.mo2656());
        if (iCompare != 0) {
            return iCompare;
        }
        List value = getValue();
        List value2 = ((InterfaceC0390) interfaceC10975).getValue();
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
        if (obj instanceof InterfaceC0390) {
            return getValue().equals(((InterfaceC0390) obj).getValue());
        }
        return false;
    }
}
