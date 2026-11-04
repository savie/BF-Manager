package l;

/* JADX INFO: renamed from: l.ۗ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K250 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3046 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9976 f9870;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9976 f9871;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3046 m9896(C9976 c9976, C9976 c9977) {
        if (c9976 == null && c9977 == null) {
            return null;
        }
        return new C3046(c9976, c9977);
    }

    public C3046(C9976 c9976, C9976 c9977) {
        this.f9870 = c9976;
        this.f9871 = c9977;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3046) && compareTo((C3046) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C3046 c3046) {
        int iCompareTo;
        AbstractC13487 abstractC13487 = c3046.f9870;
        C9976 c9976 = this.f9870;
        if (c9976 == abstractC13487) {
            iCompareTo = 0;
        } else if (c9976 == null) {
            iCompareTo = -1;
        } else {
            iCompareTo = abstractC13487 == null ? 1 : c9976.compareTo(abstractC13487);
        }
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        AbstractC13487 abstractC13488 = c3046.f9871;
        C9976 c9977 = this.f9871;
        if (c9977 == abstractC13488) {
            return 0;
        }
        if (c9977 == null) {
            return -1;
        }
        if (abstractC13488 == null) {
            return 1;
        }
        return c9977.compareTo(abstractC13488);
    }

    public final int hashCode() {
        C9976 c9976 = this.f9870;
        int iHashCode = (c9976 == null ? 0 : c9976.hashCode()) * 31;
        C9976 c9977 = this.f9871;
        return iHashCode + (c9977 != null ? c9977.hashCode() : 0);
    }

    public final String toString() {
        C9976 c9976 = this.f9871;
        C9976 c9977 = this.f9870;
        if (c9977 != null && c9976 == null) {
            return c9977.m25818();
        }
        if (c9977 == null && c9976 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(c9977 == null ? "" : c9977.m25818());
        sb.append("|");
        sb.append(c9976 != null ? c9976.m25818() : "");
        return sb.toString();
    }

    public final C9976 getName() {
        return this.f9870;
    }

    public final C9976 getSignature() {
        return this.f9871;
    }
}
