package l;

/* JADX INFO: renamed from: l.ܶۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5S5 */
/* JADX INFO: loaded from: classes5.dex */
public class C15022 implements InterfaceC5143, InterfaceC3212 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f48986;

    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 6;
    }

    public C15022(long j) {
        this.f48986 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(6, interfaceC10975.mo2656());
        if (iCompare != 0) {
            return iCompare;
        }
        return Long.compare(this.f48986, ((InterfaceC3212) interfaceC10975).getValue());
    }

    public final int hashCode() {
        long j = this.f48986;
        return (((int) j) * 31) + ((int) (j >>> 32));
    }

    @Override // l.InterfaceC3212
    public final long getValue() {
        return this.f48986;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC3212) {
            return this.f48986 == ((InterfaceC3212) obj).getValue();
        }
        return false;
    }
}
