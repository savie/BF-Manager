package l;

/* JADX INFO: renamed from: l.ۧ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D56J */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11638 implements InterfaceC24251 {
    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 21;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(21, interfaceC16791.mo5414());
        return iCompare != 0 ? iCompare : getValue().mo22732(((InterfaceC24251) interfaceC16791).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC24251) {
            return getValue().equals(((InterfaceC24251) obj).getValue());
        }
        return false;
    }
}
