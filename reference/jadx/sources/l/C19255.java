package l;

/* JADX INFO: renamed from: l.᩵ۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W51A */
/* JADX INFO: loaded from: classes5.dex */
public class C19255 implements InterfaceC5143, InterfaceC2237 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final short f62196;

    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 2;
    }

    public C19255(short s) {
        this.f62196 = s;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(2, interfaceC10975.mo2656());
        if (iCompare != 0) {
            return iCompare;
        }
        return Short.compare(this.f62196, ((InterfaceC2237) interfaceC10975).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC2237) {
            return this.f62196 == ((InterfaceC2237) obj).getValue();
        }
        return false;
    }

    @Override // l.InterfaceC2237
    public final short getValue() {
        return this.f62196;
    }

    public final int hashCode() {
        return this.f62196;
    }
}
