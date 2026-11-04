package l;

/* JADX INFO: renamed from: l.᩷֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB9X */
/* JADX INFO: loaded from: classes.dex */
public final class C21692 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9976 f69232;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 f69233;

    public C21692(C9976 c9976, AbstractC13487 abstractC13487) {
        if (c9976 == null) {
            throw new NullPointerException("name == null");
        }
        if (abstractC13487 == null) {
            throw new NullPointerException("value == null");
        }
        this.f69232 = c9976;
        this.f69233 = abstractC13487;
    }

    public final String toString() {
        return this.f69232.mo1843() + ":" + this.f69233;
    }

    public final int hashCode() {
        return this.f69233.hashCode() + (this.f69232.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21692)) {
            return false;
        }
        C21692 c21692 = (C21692) obj;
        return this.f69232.equals(c21692.f69232) && this.f69233.equals(c21692.f69233);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C21692 c21692) {
        int iCompareTo = this.f69232.compareTo(c21692.f69232);
        return iCompareTo != 0 ? iCompareTo : this.f69233.compareTo(c21692.f69233);
    }

    public final C9976 getName() {
        return this.f69232;
    }

    public final AbstractC13487 getValue() {
        return this.f69233;
    }
}
