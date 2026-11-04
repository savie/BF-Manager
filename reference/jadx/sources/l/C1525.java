package l;

/* JADX INFO: renamed from: l.֨᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5S5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1525 implements InterfaceC14948, InterfaceC20521 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f5307;

    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo5414() {
        return 6;
    }

    public C1525(long j) {
        this.f5307 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(6, interfaceC16791.mo5414());
        if (iCompare != 0) {
            return iCompare;
        }
        return Long.compare(this.f5307, ((InterfaceC20521) interfaceC16791).getValue());
    }

    public final int hashCode() {
        long j = this.f5307;
        return (((int) j) * 31) + ((int) (j >>> 32));
    }

    @Override // l.InterfaceC20521
    public final long getValue() {
        return this.f5307;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC20521) {
            return this.f5307 == ((InterfaceC20521) obj).getValue();
        }
        return false;
    }
}
