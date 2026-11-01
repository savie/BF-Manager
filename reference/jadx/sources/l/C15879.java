package l;

/* JADX INFO: renamed from: l.ܺۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8DM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15879 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final double f51451;

    public C15879(double d) {
        this.f51451 = d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m37754() {
        return this.f51451;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C15879 c15879) {
        double d = c15879.f51451;
        double d2 = this.f51451;
        if (d2 < d) {
            return -1;
        }
        return d2 == d ? 0 : 1;
    }
}
