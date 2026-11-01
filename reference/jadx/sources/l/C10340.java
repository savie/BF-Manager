package l;

/* JADX INFO: renamed from: l.ۤܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: W7Q5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10340 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f35452;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f35453;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f35454;

    public final String toString() {
        return C16523.m38890("Comment: '", this.f35453, "'");
    }

    public C10340(int i, int i2, String str) {
        this.f35454 = i;
        this.f35452 = i2;
        this.f35453 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26243() {
        int i = this.f35452;
        int i2 = this.f35454;
        C18304.m42515("Expected %s in the range [0, %s)", 0, i - i2, i - i2 > 0);
        return i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m26244() {
        return this.f35453;
    }
}
