package l;

/* JADX INFO: renamed from: l.֫۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14JS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1944 implements InterfaceC6351 {
    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 22;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(22, interfaceC16791.mo5414());
        return iCompare != 0 ? iCompare : getValue().mo8380(((InterfaceC6351) interfaceC16791).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC6351) {
            return getValue().equals(((InterfaceC6351) obj).getValue());
        }
        return false;
    }
}
