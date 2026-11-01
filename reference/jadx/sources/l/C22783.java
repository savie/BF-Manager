package l;

/* JADX INFO: renamed from: l.᩺ۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5YB */
/* JADX INFO: loaded from: classes.dex */
public class C22783 implements InterfaceC5143, InterfaceC9564 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f74163;

    @Override // l.InterfaceC10975
    /* JADX INFO: renamed from: ᩸ */
    public final int mo2656() {
        return 4;
    }

    public C22783(int i) {
        this.f74163 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        int iCompare = Integer.compare(4, interfaceC10975.mo2656());
        if (iCompare != 0) {
            return iCompare;
        }
        return Integer.compare(this.f74163, ((InterfaceC9564) interfaceC10975).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC9564) {
            return this.f74163 == ((InterfaceC9564) obj).getValue();
        }
        return false;
    }

    @Override // l.InterfaceC9564
    public final int getValue() {
        return this.f74163;
    }

    public final int hashCode() {
        return this.f74163;
    }
}
