package l;

/* JADX INFO: renamed from: l.᩶ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 45IC */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20319 implements InterfaceC14503 {
    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 25;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(25, interfaceC10975.mo2656());
        return iCompare != 0 ? iCompare : getValue().compareTo(((InterfaceC14503) interfaceC10975).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC14503) {
            return getValue().equals(((InterfaceC14503) obj).getValue());
        }
        return false;
    }
}
