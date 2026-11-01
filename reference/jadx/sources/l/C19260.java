package l;

/* JADX INFO: renamed from: l.᩵ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBF2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19260 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6143 f62208;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f62209;

    public C19260(C6143 c6143, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("handler < 0");
        }
        this.f62209 = i;
        this.f62208 = c6143;
    }

    public final int hashCode() {
        return this.f62208.hashCode() + (this.f62209 * 31);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19260) && compareTo((C19260) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C19260 c19260) {
        int i = c19260.f62209;
        int i2 = this.f62209;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.f62208.compareTo((AbstractC9901) c19260.f62208);
    }

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public final C6143 m44204() {
        return this.f62208;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44202() {
        return this.f62209;
    }
}
