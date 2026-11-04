package l;

/* JADX INFO: renamed from: l.ۛۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBF2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6206 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1028 f21119;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f21120;

    public C6206(C1028 c1028, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("handler < 0");
        }
        this.f21120 = i;
        this.f21119 = c1028;
    }

    public final int hashCode() {
        return this.f21119.hashCode() + (this.f21120 * 31);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6206) && compareTo((C6206) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C6206 c6206) {
        int i = c6206.f21120;
        int i2 = this.f21120;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.f21119.compareTo((AbstractC13487) c6206.f21119);
    }

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public final C1028 m17845() {
        return this.f21119;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17843() {
        return this.f21120;
    }
}
