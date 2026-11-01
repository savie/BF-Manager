package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩹ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M59C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22436 implements InterfaceC6533 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Comparator f73218 = new C5502();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC6533 interfaceC6533 = (InterfaceC6533) obj;
        int iCompareTo = getName().compareTo(interfaceC6533.getName());
        return iCompareTo != 0 ? iCompareTo : getValue().compareTo(interfaceC6533.getValue());
    }

    public final int hashCode() {
        return getValue().hashCode() + (getName().hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC6533)) {
            InterfaceC6533 interfaceC6533 = (InterfaceC6533) obj;
            if (getName().equals(interfaceC6533.getName()) && getValue().equals(interfaceC6533.getValue())) {
                return true;
            }
        }
        return false;
    }
}
