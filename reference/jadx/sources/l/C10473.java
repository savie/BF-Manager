package l;

/* JADX INFO: renamed from: l.ۢ᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5YB */
/* JADX INFO: loaded from: classes4.dex */
public class C10473 implements InterfaceC14948, InterfaceC3367 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f33330;

    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 4;
    }

    public C10473(int i) {
        this.f33330 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(4, interfaceC16791.mo5414());
        if (iCompare != 0) {
            return iCompare;
        }
        return Integer.compare(this.f33330, ((InterfaceC3367) interfaceC16791).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC3367) {
            return this.f33330 == ((InterfaceC3367) obj).getValue();
        }
        return false;
    }

    @Override // l.InterfaceC3367
    public final int getValue() {
        return this.f33330;
    }

    public final int hashCode() {
        return this.f33330;
    }
}
