package l;

/* JADX INFO: renamed from: l.ܰ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBFV */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14451 extends AbstractC2519 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1028 f45467;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0282 f45468;

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo1849() {
        return false;
    }

    public AbstractC14451(C1028 c1028, C0282 c0282) {
        if (c1028 == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c0282 == null) {
            throw new NullPointerException("nat == null");
        }
        this.f45467 = c1028;
        this.f45468 = c0282;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC14451 abstractC14451 = (AbstractC14451) obj;
            if (this.f45467.equals(abstractC14451.f45467) && this.f45468.equals(abstractC14451.f45468)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f45467.hashCode() * 31) ^ this.f45468.hashCode();
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩷ */
    public int mo1848(AbstractC13487 abstractC13487) {
        AbstractC14451 abstractC14451 = (AbstractC14451) abstractC13487;
        int iCompareTo = this.f45467.compareTo((AbstractC13487) abstractC14451.f45467);
        return iCompareTo != 0 ? iCompareTo : this.f45468.getName().compareTo(abstractC14451.f45468.getName());
    }

    public final String toString() {
        return mo1845() + '{' + mo1843() + '}';
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return this.f45467.mo1843() + '.' + this.f45468.mo1843();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1028 m34884() {
        return this.f45467;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0282 m34885() {
        return this.f45468;
    }
}
