package l;

/* JADX INFO: renamed from: l.ۛܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T5CA */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6207 implements InterfaceC5060 {
    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 23;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(23, interfaceC10975.mo2656());
        return iCompare != 0 ? iCompare : getValue().compareTo(((InterfaceC5060) interfaceC10975).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC5060) {
            return getValue().equals(((InterfaceC5060) obj).getValue());
        }
        return false;
    }
}
