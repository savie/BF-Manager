package l;

/* JADX INFO: renamed from: l.᩸ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAO5 */
/* JADX INFO: loaded from: classes.dex */
public final class C22919 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f74484;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f74485;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74486 = -1;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C22919 c22919 = (C22919) obj;
        int iCompare = Integer.compare(this.f74484, c22919.f74484);
        return iCompare != 0 ? iCompare : this.f74485.compareTo(c22919.f74485);
    }

    public C22919(String str, int i) {
        this.f74485 = str;
        this.f74484 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51676() {
        int i = this.f74486;
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException();
    }
}
