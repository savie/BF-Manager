package l;

/* JADX INFO: renamed from: l.ܰۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5N8 */
/* JADX INFO: loaded from: classes4.dex */
public class C13611 implements InterfaceC5143, InterfaceC12386 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte f44912;

    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 0;
    }

    public C13611(byte b) {
        this.f44912 = b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(0, interfaceC10975.mo2656());
        if (iCompare != 0) {
            return iCompare;
        }
        return Integer.compare(this.f44912, ((InterfaceC12386) interfaceC10975).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC12386) {
            return this.f44912 == ((InterfaceC12386) obj).getValue();
        }
        return false;
    }

    @Override // l.InterfaceC12386
    public final byte getValue() {
        return this.f44912;
    }

    public final int hashCode() {
        return this.f44912;
    }
}
