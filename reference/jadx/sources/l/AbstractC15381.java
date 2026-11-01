package l;

/* JADX INFO: renamed from: l.ܶܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 862H */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15381 extends AbstractC8325 implements InterfaceC18735 {
    @Override // l.InterfaceC18735
    public final int hashCode() {
        return getType().hashCode() + ((getName().hashCode() + (mo1183().hashCode() * 31)) * 31);
    }

    @Override // l.InterfaceC18735
    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC18735)) {
            return false;
        }
        InterfaceC18735 interfaceC18735 = (InterfaceC18735) obj;
        return mo1183().equals(interfaceC18735.mo1183()) && getName().equals(interfaceC18735.getName()) && getType().equals(interfaceC18735.getType());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC18735 interfaceC18735) {
        int iCompareTo = mo1183().compareTo(interfaceC18735.mo1183());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getName().compareTo(interfaceC18735.getName());
        return iCompareTo2 != 0 ? iCompareTo2 : getType().compareTo(interfaceC18735.getType());
    }

    public final String toString() {
        return C22304.m49467((InterfaceC18735) this, false);
    }
}
