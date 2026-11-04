package l;

/* JADX INFO: renamed from: l.ۤ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5Q5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10892 implements InterfaceC15299 {
    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 29;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(29, interfaceC16791.mo5414());
        if (iCompare != 0) {
            return iCompare;
        }
        InterfaceC15299 interfaceC15299 = (InterfaceC15299) interfaceC16791;
        int iCompareTo = getType().compareTo(interfaceC15299.getType());
        return iCompareTo != 0 ? iCompareTo : C11109.m28057(getElements(), interfaceC15299.getElements());
    }

    public final int hashCode() {
        return getElements().hashCode() + (getType().hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC15299) {
            InterfaceC15299 interfaceC15299 = (InterfaceC15299) obj;
            if (getType().equals(interfaceC15299.getType()) && getElements().equals(interfaceC15299.getElements())) {
                return true;
            }
        }
        return false;
    }
}
