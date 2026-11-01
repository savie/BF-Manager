package l;

/* JADX INFO: renamed from: l.ܺܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J5K1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16086 implements InterfaceC23675 {
    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 27;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(27, interfaceC10975.mo2656());
        return iCompare != 0 ? iCompare : getValue().compareTo(((InterfaceC23675) interfaceC10975).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC23675) {
            return getValue().equals(((InterfaceC23675) obj).getValue());
        }
        return false;
    }
}
