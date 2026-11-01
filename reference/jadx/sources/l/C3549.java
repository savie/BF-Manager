package l;

/* JADX INFO: renamed from: l.ۗ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBCR */
/* JADX INFO: loaded from: classes3.dex */
public final class C3549 extends AbstractC9901 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23535 f13067;

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return "annotation";
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2379() {
        return false;
    }

    public C3549(C23535 c23535) {
        c23535.m43642();
        this.f13067 = c23535;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3549)) {
            return false;
        }
        return this.f13067.equals(((C3549) obj).f13067);
    }

    public final int hashCode() {
        return this.f13067.hashCode();
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final int mo2378(AbstractC9901 abstractC9901) {
        return this.f13067.compareTo(((C3549) abstractC9901).f13067);
    }

    public final String toString() {
        return this.f13067.mo2376();
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return this.f13067.mo2376();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C23535 m10468() {
        return this.f13067;
    }
}
