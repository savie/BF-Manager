package l;

/* JADX INFO: renamed from: l.᩺᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5AF */
/* JADX INFO: loaded from: classes.dex */
public class C24646 implements InterfaceC14948, InterfaceC11570 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char f79787;

    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 3;
    }

    public C24646(char c) {
        this.f79787 = c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(3, interfaceC16791.mo5414());
        if (iCompare != 0) {
            return iCompare;
        }
        return Character.compare(this.f79787, ((InterfaceC11570) interfaceC16791).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC11570) {
            return this.f79787 == ((InterfaceC11570) obj).getValue();
        }
        return false;
    }

    @Override // l.InterfaceC11570
    public final char getValue() {
        return this.f79787;
    }

    public final int hashCode() {
        return this.f79787;
    }
}
