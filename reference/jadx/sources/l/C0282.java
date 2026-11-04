package l;

/* JADX INFO: renamed from: l.֡۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBCE */
/* JADX INFO: loaded from: classes3.dex */
public final class C0282 extends AbstractC13487 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C0282 f1592 = new C0282(new C9976("TYPE"), new C9976("Ljava/lang/Class;"));

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9976 f1593;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9976 f1594;

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String mo1845() {
        return "nat";
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo1849() {
        return false;
    }

    public C0282(C9976 c9976, C9976 c9977) {
        if (c9976 == null) {
            throw new NullPointerException("name == null");
        }
        if (c9977 == null) {
            throw new NullPointerException("descriptor == null");
        }
        this.f1594 = c9976;
        this.f1593 = c9977;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0282)) {
            return false;
        }
        C0282 c0282 = (C0282) obj;
        return this.f1594.equals(c0282.f1594) && this.f1593.equals(c0282.f1593);
    }

    public final int hashCode() {
        return (this.f1594.hashCode() * 31) ^ this.f1593.hashCode();
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo1848(AbstractC13487 abstractC13487) {
        C0282 c0282 = (C0282) abstractC13487;
        int iCompareTo = this.f1594.compareTo(c0282.f1594);
        return iCompareTo != 0 ? iCompareTo : this.f1593.compareTo(c0282.f1593);
    }

    public final String toString() {
        return "nat{" + mo1843() + '}';
    }

    public final C9976 getName() {
        return this.f1594;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C9976 m1846() {
        return this.f1593;
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo1843() {
        return this.f1594.mo1843() + ':' + this.f1593.mo1843();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5085 m1850() {
        return C5085.m15362(this.f1593.getString());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m1844() {
        return this.f1594.getString().equals("<init>");
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m1847() {
        return this.f1594.getString().equals("<clinit>");
    }
}
