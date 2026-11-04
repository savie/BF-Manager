package l;

/* JADX INFO: renamed from: l.ۛ᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5N8 */
/* JADX INFO: loaded from: classes3.dex */
public class C6746 implements InterfaceC14948, InterfaceC1876 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte f22472;

    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 0;
    }

    public C6746(byte b) {
        this.f22472 = b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(0, interfaceC16791.mo5414());
        if (iCompare != 0) {
            return iCompare;
        }
        return Integer.compare(this.f22472, ((InterfaceC1876) interfaceC16791).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC1876) {
            return this.f22472 == ((InterfaceC1876) obj).getValue();
        }
        return false;
    }

    @Override // l.InterfaceC1876
    public final byte getValue() {
        return this.f22472;
    }

    public final int hashCode() {
        return this.f22472;
    }
}
