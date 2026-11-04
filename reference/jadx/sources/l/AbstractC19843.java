package l;

/* JADX INFO: renamed from: l.ᩴ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75KT */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19843 implements InterfaceC5605 {
    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 31;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(31, interfaceC16791.mo5414());
        return iCompare != 0 ? iCompare : Boolean.compare(getValue(), ((InterfaceC5605) interfaceC16791).getValue());
    }

    public final int hashCode() {
        return getValue() ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC5605) && getValue() == ((InterfaceC5605) obj).getValue();
    }
}
