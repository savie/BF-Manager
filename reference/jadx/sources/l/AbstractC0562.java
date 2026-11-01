package l;

/* JADX INFO: renamed from: l.֡ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V57G */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0562 implements InterfaceC4354 {
    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo2656() {
        return 26;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(26, interfaceC10975.mo2656());
        return iCompare != 0 ? iCompare : getValue().mo22993(((InterfaceC4354) interfaceC10975).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC4354) {
            return getValue().equals(((InterfaceC4354) obj).getValue());
        }
        return false;
    }
}
