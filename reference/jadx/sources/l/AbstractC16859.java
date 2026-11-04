package l;

/* JADX INFO: renamed from: l.ܺ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5CA */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16859 implements InterfaceC14553 {
    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 23;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(23, interfaceC16791.mo5414());
        return iCompare != 0 ? iCompare : getValue().compareTo(((InterfaceC14553) interfaceC16791).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC14553) {
            return getValue().equals(((InterfaceC14553) obj).getValue());
        }
        return false;
    }
}
