package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܿۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M59C */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18155 implements InterfaceC19073 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Comparator f59356 = new C21139();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC19073 interfaceC19073 = (InterfaceC19073) obj;
        int iCompareTo = getName().compareTo(interfaceC19073.getName());
        return iCompareTo != 0 ? iCompareTo : getValue().compareTo(interfaceC19073.getValue());
    }

    public final int hashCode() {
        return getValue().hashCode() + (getName().hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC19073)) {
            InterfaceC19073 interfaceC19073 = (InterfaceC19073) obj;
            if (getName().equals(interfaceC19073.getName()) && getValue().equals(interfaceC19073.getValue())) {
                return true;
            }
        }
        return false;
    }
}
