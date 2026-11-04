package l;

/* JADX INFO: renamed from: l.ۖۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 069J */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2493 extends AbstractC13679 implements InterfaceC6813 {
    @Override // l.InterfaceC6813
    public final int hashCode() {
        return mo17434().hashCode() + (mo17433() * 31);
    }

    @Override // l.InterfaceC6813
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InterfaceC6813)) {
            return false;
        }
        InterfaceC6813 interfaceC6813 = (InterfaceC6813) obj;
        return mo17433() == interfaceC6813.mo17433() && mo17434().equals(interfaceC6813.mo17434());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC6813 interfaceC6813) {
        int iCompare = Integer.compare(mo17433(), interfaceC6813.mo17433());
        if (iCompare != 0) {
            return iCompare;
        }
        InterfaceC10824 interfaceC10824Mo17434 = mo17434();
        if (interfaceC10824Mo17434 instanceof InterfaceC8304) {
            if (interfaceC6813.mo17434() instanceof InterfaceC8304) {
                return ((InterfaceC8304) interfaceC10824Mo17434).compareTo((InterfaceC8304) interfaceC6813.mo17434());
            }
            return -1;
        }
        if (interfaceC6813.mo17434() instanceof InterfaceC4859) {
            return ((InterfaceC4859) interfaceC10824Mo17434).compareTo((InterfaceC4859) interfaceC6813.mo17434());
        }
        return 1;
    }
}
