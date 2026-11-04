package l;

/* JADX INFO: renamed from: l.ۢ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9753 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f31466;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f31467;

    public C9753(int i, int i2) {
        this.f31467 = i;
        this.f31466 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9753)) {
            return false;
        }
        C9753 c9753 = (C9753) obj;
        return this.f31467 == c9753.f31467 && this.f31466 == c9753.f31466;
    }

    public final int hashCode() {
        return C17359.hash(Integer.valueOf(this.f31467), Integer.valueOf(this.f31466));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C9753 c9753) {
        int iCompare = Integer.compare(this.f31467, c9753.f31467);
        return iCompare != 0 ? iCompare : Integer.compare(this.f31466, c9753.f31466);
    }
}
