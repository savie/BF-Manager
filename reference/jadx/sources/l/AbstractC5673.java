package l;

/* JADX INFO: renamed from: l.ۚ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V57G */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5673 implements InterfaceC12316 {
    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 26;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(26, interfaceC16791.mo5414());
        return iCompare != 0 ? iCompare : getValue().mo14900(((InterfaceC12316) interfaceC16791).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC12316) {
            return getValue().equals(((InterfaceC12316) obj).getValue());
        }
        return false;
    }
}
