package l;

/* JADX INFO: renamed from: l.۫ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D56J */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12558 implements InterfaceC11411 {
    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 21;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(21, interfaceC10975.mo2656());
        return iCompare != 0 ? iCompare : getValue().mo42319(((InterfaceC11411) interfaceC10975).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC11411) {
            return getValue().equals(((InterfaceC11411) obj).getValue());
        }
        return false;
    }
}
