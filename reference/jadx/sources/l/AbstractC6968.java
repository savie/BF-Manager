package l;

/* JADX INFO: renamed from: l.ۜۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y68W */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6968 extends AbstractC13679 implements InterfaceC4859 {
    @Override // l.InterfaceC4859
    public final int hashCode() {
        return mo6805().hashCode() + ((mo6802().hashCode() + ((getName().hashCode() + (mo6804().hashCode() * 31)) * 31)) * 31);
    }

    @Override // l.InterfaceC4859
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC4859)) {
            InterfaceC4859 interfaceC4859 = (InterfaceC4859) obj;
            if (mo6804().equals(interfaceC4859.mo6804()) && getName().equals(interfaceC4859.getName()) && mo6802().equals(interfaceC4859.mo6802()) && C22298.m50356(mo6805(), interfaceC4859.mo6805())) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return C14684.m35306((InterfaceC4859) this, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC4859 interfaceC4859) {
        int iCompareTo = mo6804().compareTo(interfaceC4859.mo6804());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getName().compareTo(interfaceC4859.getName());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int iCompareTo3 = mo6802().compareTo(interfaceC4859.mo6802());
        return iCompareTo3 != 0 ? iCompareTo3 : C11109.m28056(AbstractC18753.m43549(), mo6805(), interfaceC4859.mo6805());
    }
}
