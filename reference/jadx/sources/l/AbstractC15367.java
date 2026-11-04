package l;

/* JADX INFO: renamed from: l.ܳ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5K1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15367 implements InterfaceC17537 {
    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 27;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(27, interfaceC16791.mo5414());
        return iCompare != 0 ? iCompare : getValue().mo22389(((InterfaceC17537) interfaceC16791).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC17537) {
            return getValue().equals(((InterfaceC17537) obj).getValue());
        }
        return false;
    }
}
