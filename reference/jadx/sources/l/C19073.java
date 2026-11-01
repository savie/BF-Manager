package l;

/* JADX INFO: renamed from: l.ᩴ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K250 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19073 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17432 f61642;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17432 f61643;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19073 m43845(C17432 c17432, C17432 c17433) {
        if (c17432 == null && c17433 == null) {
            return null;
        }
        return new C19073(c17432, c17433);
    }

    public C19073(C17432 c17432, C17432 c17433) {
        this.f61642 = c17432;
        this.f61643 = c17433;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19073) && compareTo((C19073) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C19073 c19073) {
        int iCompareTo;
        AbstractC9901 abstractC9901 = c19073.f61642;
        C17432 c17432 = this.f61642;
        if (c17432 == abstractC9901) {
            iCompareTo = 0;
        } else if (c17432 == null) {
            iCompareTo = -1;
        } else {
            iCompareTo = abstractC9901 == null ? 1 : c17432.compareTo(abstractC9901);
        }
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        AbstractC9901 abstractC9902 = c19073.f61643;
        C17432 c17433 = this.f61643;
        if (c17433 == abstractC9902) {
            return 0;
        }
        if (c17433 == null) {
            return -1;
        }
        if (abstractC9902 == null) {
            return 1;
        }
        return c17433.compareTo(abstractC9902);
    }

    public final int hashCode() {
        C17432 c17432 = this.f61642;
        int iHashCode = (c17432 == null ? 0 : c17432.hashCode()) * 31;
        C17432 c17433 = this.f61643;
        return iHashCode + (c17433 != null ? c17433.hashCode() : 0);
    }

    public final String toString() {
        C17432 c17432 = this.f61643;
        C17432 c17433 = this.f61642;
        if (c17433 != null && c17432 == null) {
            return c17433.m40637();
        }
        if (c17433 == null && c17432 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(c17433 == null ? "" : c17433.m40637());
        sb.append("|");
        sb.append(c17432 != null ? c17432.m40637() : "");
        return sb.toString();
    }

    public final C17432 getName() {
        return this.f61642;
    }

    public final C17432 getSignature() {
        return this.f61643;
    }
}
