package l;

/* JADX INFO: renamed from: l.ۗۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB9X */
/* JADX INFO: loaded from: classes2.dex */
public final class C3072 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17432 f11567;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 f11568;

    public C3072(C17432 c17432, AbstractC9901 abstractC9901) {
        if (c17432 == null) {
            throw new NullPointerException("name == null");
        }
        if (abstractC9901 == null) {
            throw new NullPointerException("value == null");
        }
        this.f11567 = c17432;
        this.f11568 = abstractC9901;
    }

    public final String toString() {
        return this.f11567.mo2376() + ":" + this.f11568;
    }

    public final int hashCode() {
        return this.f11568.hashCode() + (this.f11567.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3072)) {
            return false;
        }
        C3072 c3072 = (C3072) obj;
        return this.f11567.equals(c3072.f11567) && this.f11568.equals(c3072.f11568);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C3072 c3072) {
        int iCompareTo = this.f11567.compareTo(c3072.f11567);
        return iCompareTo != 0 ? iCompareTo : this.f11568.compareTo(c3072.f11568);
    }

    public final C17432 getName() {
        return this.f11567;
    }

    public final AbstractC9901 getValue() {
        return this.f11568;
    }
}
