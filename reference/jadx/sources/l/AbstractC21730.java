package l;

/* JADX INFO: renamed from: l.᩸ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 069J */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21730 extends AbstractC8325 implements InterfaceC8152 {
    @Override // l.InterfaceC8152
    public final int hashCode() {
        return mo20680().hashCode() + (mo20681() * 31);
    }

    @Override // l.InterfaceC8152
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InterfaceC8152)) {
            return false;
        }
        InterfaceC8152 interfaceC8152 = (InterfaceC8152) obj;
        return mo20681() == interfaceC8152.mo20681() && mo20680().equals(interfaceC8152.mo20680());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC8152 interfaceC8152) {
        int iCompare = Integer.compare(mo20681(), interfaceC8152.mo20681());
        if (iCompare != 0) {
            return iCompare;
        }
        InterfaceC7446 interfaceC7446Mo20680 = mo20680();
        if (interfaceC7446Mo20680 instanceof InterfaceC18735) {
            if (interfaceC8152.mo20680() instanceof InterfaceC18735) {
                return ((InterfaceC18735) interfaceC7446Mo20680).compareTo((InterfaceC18735) interfaceC8152.mo20680());
            }
            return -1;
        }
        if (interfaceC8152.mo20680() instanceof InterfaceC8858) {
            return ((InterfaceC8858) interfaceC7446Mo20680).compareTo((InterfaceC8858) interfaceC8152.mo20680());
        }
        return 1;
    }
}
