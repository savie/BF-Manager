package l;

/* JADX INFO: renamed from: l.ۙ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8DM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4930 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final double f17194;

    public C4930(double d) {
        this.f17194 = d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m15111() {
        return this.f17194;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C4930 c4930) {
        double d = c4930.f17194;
        double d2 = this.f17194;
        if (d2 < d) {
            return -1;
        }
        return d2 == d ? 0 : 1;
    }
}
