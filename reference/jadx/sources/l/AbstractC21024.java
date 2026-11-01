package l;

/* JADX INFO: renamed from: l.᩷ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 75KT */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21024 implements InterfaceC16619 {
    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 31;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(31, interfaceC10975.mo2656());
        return iCompare != 0 ? iCompare : Boolean.compare(getValue(), ((InterfaceC16619) interfaceC10975).getValue());
    }

    public final int hashCode() {
        return getValue() ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC16619) && getValue() == ((InterfaceC16619) obj).getValue();
    }
}
