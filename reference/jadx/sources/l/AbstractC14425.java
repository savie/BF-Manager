package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܰۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 857M */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14425 implements InterfaceC7886 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Comparator f45428 = new C3985();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC7886 interfaceC7886 = (InterfaceC7886) obj;
        int iCompare = Integer.compare(getVisibility(), interfaceC7886.getVisibility());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = getType().compareTo(interfaceC7886.getType());
        return iCompareTo != 0 ? iCompareTo : C11109.m28057(getElements(), interfaceC7886.getElements());
    }

    public final int hashCode() {
        return getElements().hashCode() + ((getType().hashCode() + (getVisibility() * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC7886)) {
            return false;
        }
        InterfaceC7886 interfaceC7886 = (InterfaceC7886) obj;
        return getVisibility() == interfaceC7886.getVisibility() && getType().equals(interfaceC7886.getType()) && getElements().equals(interfaceC7886.getElements());
    }
}
