package l;

/* JADX INFO: renamed from: l.ܶᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes5.dex */
public final class C15416 extends AbstractC21765 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22492 f50252;

    public C15416(C22492 c22492) {
        this.f50252 = c22492;
    }

    public final String toString() {
        return "Uses[" + this.f50252 + "]";
    }

    @Override // l.InterfaceC14044
    /* JADX INFO: renamed from: ۙ */
    public final void mo4647(InterfaceC2753 interfaceC2753) {
        interfaceC2753.mo8402(this);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C15416) && this.f50252 == ((C15416) obj).f50252;
    }

    public final int hashCode() {
        return this.f50252.hashCode() * 31;
    }
}
