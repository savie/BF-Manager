package l;

/* JADX INFO: renamed from: l.ۤܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R5Q5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10442 implements InterfaceC20147 {
    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 29;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(29, interfaceC10975.mo2656());
        if (iCompare != 0) {
            return iCompare;
        }
        InterfaceC20147 interfaceC20147 = (InterfaceC20147) interfaceC10975;
        int iCompareTo = getType().compareTo(interfaceC20147.getType());
        return iCompareTo != 0 ? iCompareTo : C7343.m19622(getElements(), interfaceC20147.getElements());
    }

    public final int hashCode() {
        return getElements().hashCode() + (getType().hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC20147) {
            InterfaceC20147 interfaceC20147 = (InterfaceC20147) obj;
            if (getType().equals(interfaceC20147.getType()) && getElements().equals(interfaceC20147.getElements())) {
                return true;
            }
        }
        return false;
    }
}
