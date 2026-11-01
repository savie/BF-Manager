package l;

/* JADX INFO: renamed from: l.ۨۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5AF */
/* JADX INFO: loaded from: classes4.dex */
public class C11494 implements InterfaceC5143, InterfaceC17324 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char f38664;

    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 3;
    }

    public C11494(char c) {
        this.f38664 = c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(3, interfaceC10975.mo2656());
        if (iCompare != 0) {
            return iCompare;
        }
        return Character.compare(this.f38664, ((InterfaceC17324) interfaceC10975).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC17324) {
            return this.f38664 == ((InterfaceC17324) obj).getValue();
        }
        return false;
    }

    @Override // l.InterfaceC17324
    public final char getValue() {
        return this.f38664;
    }

    public final int hashCode() {
        return this.f38664;
    }
}
