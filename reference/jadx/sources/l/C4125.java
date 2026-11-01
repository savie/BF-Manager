package l;

/* JADX INFO: renamed from: l.ۘᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes3.dex */
public final class C4125 extends AbstractC21765 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 f15098;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22492 f15099;

    public C4125(C22492 c22492, C21825 c21825) {
        this.f15099 = c22492;
        this.f15098 = c21825;
    }

    public final String toString() {
        return "Provides[" + this.f15099 + "," + this.f15098 + "]";
    }

    @Override // l.InterfaceC14044
    /* JADX INFO: renamed from: ۙ */
    public final void mo4647(InterfaceC2753 interfaceC2753) {
        interfaceC2753.mo8399(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4125)) {
            return false;
        }
        C4125 c4125 = (C4125) obj;
        return this.f15099 == c4125.f15099 && this.f15098.equals(c4125.f15098);
    }

    public final int hashCode() {
        return (this.f15098.hashCode() * 37) + (this.f15099.hashCode() * 31);
    }
}
