package l;

/* JADX INFO: renamed from: l.ۘ᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55CR */
/* JADX INFO: loaded from: classes3.dex */
public class C4508 implements InterfaceC14948, InterfaceC24997 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final double f16089;

    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 17;
    }

    public C4508(double d) {
        this.f16089 = d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(17, interfaceC16791.mo5414());
        if (iCompare != 0) {
            return iCompare;
        }
        return Double.compare(this.f16089, ((InterfaceC24997) interfaceC16791).getValue());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC24997) && Double.doubleToRawLongBits(this.f16089) == Double.doubleToRawLongBits(((InterfaceC24997) obj).getValue());
    }

    @Override // l.InterfaceC24997
    public final double getValue() {
        return this.f16089;
    }

    public final int hashCode() {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(this.f16089);
        return (int) (jDoubleToRawLongBits ^ (jDoubleToRawLongBits >>> 32));
    }
}
