package l;

/* JADX INFO: renamed from: l.ᩴۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4S8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19734 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f63511;

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo4982(C2161 c2161);

    /* JADX INFO: renamed from: ᩴ */
    public void mo2720() {
    }

    /* JADX INFO: renamed from: ᩸ */
    public abstract double mo13837();

    public AbstractC19734(int i) {
        this.f63511 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45442() {
        return this.f63511;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC19734 abstractC19734) {
        int iCompare = Integer.compare(this.f63511, abstractC19734.f63511);
        return iCompare == 0 ? Double.compare(mo13837(), abstractC19734.mo13837()) : iCompare;
    }
}
