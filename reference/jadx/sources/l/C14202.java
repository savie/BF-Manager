package l;

/* JADX INFO: renamed from: l.۬᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: W51A */
/* JADX INFO: loaded from: classes5.dex */
public class C14202 implements InterfaceC14948, InterfaceC4113 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final short f44886;

    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 2;
    }

    public C14202(short s) {
        this.f44886 = s;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(2, interfaceC16791.mo5414());
        if (iCompare != 0) {
            return iCompare;
        }
        return Short.compare(this.f44886, ((InterfaceC4113) interfaceC16791).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC4113) {
            return this.f44886 == ((InterfaceC4113) obj).getValue();
        }
        return false;
    }

    @Override // l.InterfaceC4113
    public final short getValue() {
        return this.f44886;
    }

    public final int hashCode() {
        return this.f44886;
    }
}
