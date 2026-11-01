package l;

/* JADX INFO: renamed from: l.ۘۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3884 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f14513;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f14514;

    public C3884(int i, int i2) {
        this.f14514 = i;
        this.f14513 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3884)) {
            return false;
        }
        C3884 c3884 = (C3884) obj;
        return this.f14514 == c3884.f14514 && this.f14513 == c3884.f14513;
    }

    public final int hashCode() {
        return C13638.hash(Integer.valueOf(this.f14514), Integer.valueOf(this.f14513));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C3884 c3884) {
        int iCompare = Integer.compare(this.f14514, c3884.f14514);
        return iCompare != 0 ? iCompare : Integer.compare(this.f14513, c3884.f14513);
    }
}
