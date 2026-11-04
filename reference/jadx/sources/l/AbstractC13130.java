package l;

/* JADX INFO: renamed from: l.۫۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45IC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13130 implements InterfaceC16045 {
    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 25;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(25, interfaceC16791.mo5414());
        return iCompare != 0 ? iCompare : getValue().mo22389(((InterfaceC16045) interfaceC16791).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC16045) {
            return getValue().equals(((InterfaceC16045) obj).getValue());
        }
        return false;
    }
}
