package l;

/* JADX INFO: renamed from: l.ۧܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G66I */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11147 implements InterfaceC21994 {
    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 24;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(24, interfaceC10975.mo2656());
        return iCompare != 0 ? iCompare : getValue().compareTo(((InterfaceC21994) interfaceC10975).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC21994) {
            return getValue().equals(((InterfaceC21994) obj).getValue());
        }
        return false;
    }
}
