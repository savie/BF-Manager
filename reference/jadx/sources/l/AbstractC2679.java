package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۖܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 857M */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2679 implements InterfaceC3710 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Comparator f10349 = new C11853();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC3710 interfaceC3710 = (InterfaceC3710) obj;
        int iCompare = Integer.compare(getVisibility(), interfaceC3710.getVisibility());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = getType().compareTo(interfaceC3710.getType());
        return iCompareTo != 0 ? iCompareTo : C7343.m19622(getElements(), interfaceC3710.getElements());
    }

    public final int hashCode() {
        return getElements().hashCode() + ((getType().hashCode() + (getVisibility() * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC3710)) {
            return false;
        }
        InterfaceC3710 interfaceC3710 = (InterfaceC3710) obj;
        return getVisibility() == interfaceC3710.getVisibility() && getType().equals(interfaceC3710.getType()) && getElements().equals(interfaceC3710.getElements());
    }
}
