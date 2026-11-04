package l;

/* JADX INFO: renamed from: l.ᩴ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBKO */
/* JADX INFO: loaded from: classes5.dex */
public final class C20111 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC13398 f64618;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f64619;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f64620;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C20111 c20111 = (C20111) obj;
        int iCompareTo = this.f64618.compareTo(c20111.f64618);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompare = Integer.compare(this.f64620, c20111.f64620);
        return iCompare != 0 ? iCompare : this.f64619.compareTo(c20111.f64619);
    }

    public C20111(EnumC13398 enumC13398, int i, String str) {
        this.f64618 = enumC13398;
        this.f64620 = i;
        this.f64619 = str;
    }
}
