package l;

/* JADX INFO: renamed from: l.ܽ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G66I */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17605 implements InterfaceC21267 {
    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 24;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(24, interfaceC16791.mo5414());
        return iCompare != 0 ? iCompare : getValue().compareTo(((InterfaceC21267) interfaceC16791).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC21267) {
            return getValue().equals(((InterfaceC21267) obj).getValue());
        }
        return false;
    }
}
