package l;

/* JADX INFO: renamed from: l.᩷ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBFV */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20960 extends AbstractC23783 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6143 f68294;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0498 f68295;

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2379() {
        return false;
    }

    public AbstractC20960(C6143 c6143, C0498 c0498) {
        if (c6143 == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c0498 == null) {
            throw new NullPointerException("nat == null");
        }
        this.f68294 = c6143;
        this.f68295 = c0498;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC20960 abstractC20960 = (AbstractC20960) obj;
            if (this.f68294.equals(abstractC20960.f68294) && this.f68295.equals(abstractC20960.f68295)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f68294.hashCode() * 31) ^ this.f68295.hashCode();
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public int mo2378(AbstractC9901 abstractC9901) {
        AbstractC20960 abstractC20960 = (AbstractC20960) abstractC9901;
        int iCompareTo = this.f68294.compareTo((AbstractC9901) abstractC20960.f68294);
        return iCompareTo != 0 ? iCompareTo : this.f68295.getName().compareTo(abstractC20960.f68295.getName());
    }

    public final String toString() {
        return mo2375() + '{' + mo2376() + '}';
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return this.f68294.mo2376() + '.' + this.f68295.mo2376();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6143 m47134() {
        return this.f68294;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C0498 m47133() {
        return this.f68295;
    }
}
