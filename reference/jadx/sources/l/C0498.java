package l;

/* JADX INFO: renamed from: l.֡ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBCE */
/* JADX INFO: loaded from: classes3.dex */
public final class C0498 extends AbstractC9901 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C0498 f2186 = new C0498(new C17432("TYPE"), new C17432("Ljava/lang/Class;"));

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17432 f2187;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17432 f2188;

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String mo2375() {
        return "nat";
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo2379() {
        return false;
    }

    public C0498(C17432 c17432, C17432 c17433) {
        if (c17432 == null) {
            throw new NullPointerException("name == null");
        }
        if (c17433 == null) {
            throw new NullPointerException("descriptor == null");
        }
        this.f2188 = c17432;
        this.f2187 = c17433;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0498)) {
            return false;
        }
        C0498 c0498 = (C0498) obj;
        return this.f2188.equals(c0498.f2188) && this.f2187.equals(c0498.f2187);
    }

    public final int hashCode() {
        return (this.f2188.hashCode() * 31) ^ this.f2187.hashCode();
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo2378(AbstractC9901 abstractC9901) {
        C0498 c0498 = (C0498) abstractC9901;
        int iCompareTo = this.f2188.compareTo(c0498.f2188);
        return iCompareTo != 0 ? iCompareTo : this.f2187.compareTo(c0498.f2187);
    }

    public final String toString() {
        return "nat{" + mo2376() + '}';
    }

    public final C17432 getName() {
        return this.f2188;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C17432 m2380() {
        return this.f2187;
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo2376() {
        return this.f2188.mo2376() + ':' + this.f2187.mo2376();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C3320 m2381() {
        return C3320.m9826(this.f2187.getString());
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m2377() {
        return this.f2188.getString().equals("<init>");
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m2382() {
        return this.f2188.getString().equals("<clinit>");
    }
}
