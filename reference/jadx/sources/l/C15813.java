package l;

/* JADX INFO: renamed from: l.ܶۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7Q5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15813 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f51450;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f51451;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f51452;

    public final String toString() {
        return C14442.m34865("Comment: '", this.f51451, "'");
    }

    public C15813(int i, int i2, String str) {
        this.f51452 = i;
        this.f51450 = i2;
        this.f51451 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37739() {
        int i = this.f51450;
        int i2 = this.f51452;
        C12128.m30307("Expected %s in the range [0, %s)", 0, i - i2, i - i2 > 0);
        return i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m37740() {
        return this.f51451;
    }
}
