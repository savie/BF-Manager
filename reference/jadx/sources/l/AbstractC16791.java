package l;

/* JADX INFO: renamed from: l.ܽܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 14JS */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16791 implements InterfaceC13528 {
    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 22;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(22, interfaceC10975.mo2656());
        return iCompare != 0 ? iCompare : getValue().mo21464(((InterfaceC13528) interfaceC10975).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC13528) {
            return getValue().equals(((InterfaceC13528) obj).getValue());
        }
        return false;
    }
}
