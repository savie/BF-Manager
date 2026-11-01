package l;

/* JADX INFO: renamed from: l.ۜۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5UB */
/* JADX INFO: loaded from: classes3.dex */
public class C6554 implements InterfaceC5143, InterfaceC1801 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float f22093;

    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 16;
    }

    public C6554(float f) {
        this.f22093 = f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(16, interfaceC10975.mo2656());
        if (iCompare != 0) {
            return iCompare;
        }
        return Float.compare(this.f22093, ((InterfaceC1801) interfaceC10975).getValue());
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof InterfaceC1801) && Float.floatToRawIntBits(this.f22093) == Float.floatToRawIntBits(((InterfaceC1801) obj).getValue());
    }

    @Override // l.InterfaceC1801
    public final float getValue() {
        return this.f22093;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f22093);
    }
}
