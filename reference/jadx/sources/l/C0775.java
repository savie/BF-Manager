package l;

/* JADX INFO: renamed from: l.֨֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: BBKO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0775 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f3351;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC3597 f3352;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f3353;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0775 c0775 = (C0775) obj;
        int iCompareTo = this.f3352.compareTo(c0775.f3352);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompare = Integer.compare(this.f3353, c0775.f3353);
        return iCompare != 0 ? iCompare : this.f3351.compareTo(c0775.f3351);
    }

    public C0775(EnumC3597 enumC3597, int i, String str) {
        this.f3352 = enumC3597;
        this.f3353 = i;
        this.f3351 = str;
    }
}
