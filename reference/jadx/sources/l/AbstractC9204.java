package l;

/* JADX INFO: renamed from: l.ۡۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 862H */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9204 extends AbstractC13679 implements InterfaceC8304 {
    @Override // l.InterfaceC8304
    public final int hashCode() {
        return getType().hashCode() + ((getName().hashCode() + (mo4500().hashCode() * 31)) * 31);
    }

    @Override // l.InterfaceC8304
    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC8304)) {
            return false;
        }
        InterfaceC8304 interfaceC8304 = (InterfaceC8304) obj;
        return mo4500().equals(interfaceC8304.mo4500()) && getName().equals(interfaceC8304.getName()) && getType().equals(interfaceC8304.getType());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC8304 interfaceC8304) {
        int iCompareTo = mo4500().compareTo(interfaceC8304.mo4500());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getName().compareTo(interfaceC8304.getName());
        return iCompareTo2 != 0 ? iCompareTo2 : getType().compareTo(interfaceC8304.getType());
    }

    public final String toString() {
        return C14684.m35308((InterfaceC8304) this, false);
    }
}
