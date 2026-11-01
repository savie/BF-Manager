package l;

/* JADX INFO: renamed from: l.ۖۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55CR */
/* JADX INFO: loaded from: classes3.dex */
public class C2320 implements InterfaceC5143, InterfaceC6035 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final double f8241;

    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 17;
    }

    public C2320(double d) {
        this.f8241 = d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(17, interfaceC10975.mo2656());
        if (iCompare != 0) {
            return iCompare;
        }
        return Double.compare(this.f8241, ((InterfaceC6035) interfaceC10975).getValue());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC6035) && Double.doubleToRawLongBits(this.f8241) == Double.doubleToRawLongBits(((InterfaceC6035) obj).getValue());
    }

    @Override // l.InterfaceC6035
    public final double getValue() {
        return this.f8241;
    }

    public final int hashCode() {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(this.f8241);
        return (int) (jDoubleToRawLongBits ^ (jDoubleToRawLongBits >>> 32));
    }
}
