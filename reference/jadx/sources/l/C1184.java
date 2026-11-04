package l;

/* JADX INFO: renamed from: l.֨۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W6FK */
/* JADX INFO: loaded from: classes2.dex */
public final class C1184 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16481 f4326;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f4327;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f4328;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f4328, ((C1184) obj).f4328);
    }

    public C1184(int i, AbstractC16481 abstractC16481, AbstractC1566 abstractC1566) {
        this.f4328 = i;
        this.f4326 = abstractC16481;
        this.f4327 = abstractC1566;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m4360() {
        return this.f4328;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16481 m4359() {
        return this.f4326;
    }

    public final AbstractC1566 getType() {
        return this.f4327;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4327);
        sb.append(" -> ");
        AbstractC16481 abstractC16481 = this.f4326;
        sb.append(abstractC16481.mo17521());
        sb.append(" in ");
        sb.append(abstractC16481.m39118());
        return sb.toString();
    }
}
