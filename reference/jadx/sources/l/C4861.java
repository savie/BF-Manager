package l;

/* JADX INFO: renamed from: l.ۙۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes2.dex */
public final class C4861 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f16955;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f16956;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f16957;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4861 c4861 = (C4861) obj;
        int iCompare = Integer.compare(this.f16956, c4861.f16956);
        return iCompare == 0 ? this.f16957.compareTo(c4861.f16957) : iCompare;
    }

    public C4861(AbstractC22044 abstractC22044) {
        this.f16955 = abstractC22044;
        String lowerCase = abstractC22044.getName().toLowerCase();
        this.f16957 = lowerCase;
        this.f16956 = C22015.f71042.mo13099(C22015.f71042.mo13099(Integer.MAX_VALUE, lowerCase), abstractC22044.mo4294());
    }
}
