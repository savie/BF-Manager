package l;

/* JADX INFO: renamed from: l.ᩴܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y68W */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18908 extends AbstractC8325 implements InterfaceC8858 {
    @Override // l.InterfaceC8858
    public final int hashCode() {
        return mo9699().hashCode() + ((mo9698().hashCode() + ((getName().hashCode() + (mo9700().hashCode() * 31)) * 31)) * 31);
    }

    @Override // l.InterfaceC8858
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC8858)) {
            InterfaceC8858 interfaceC8858 = (InterfaceC8858) obj;
            if (mo9700().equals(interfaceC8858.mo9700()) && getName().equals(interfaceC8858.getName()) && mo9698().equals(interfaceC8858.mo9698()) && C10166.m25904(mo9699(), interfaceC8858.mo9699())) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return C22304.m49465((InterfaceC8858) this, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC8858 interfaceC8858) {
        int iCompareTo = mo9700().compareTo(interfaceC8858.mo9700());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getName().compareTo(interfaceC8858.getName());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int iCompareTo3 = mo9698().compareTo(interfaceC8858.mo9698());
        return iCompareTo3 != 0 ? iCompareTo3 : C7343.m19621(AbstractC10959.m27713(), mo9699(), interfaceC8858.mo9699());
    }
}
