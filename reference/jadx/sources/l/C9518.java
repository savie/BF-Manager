package l;

/* JADX INFO: renamed from: l.ۡܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D8NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9518 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f30824;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C19215 f30825;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f30826;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long[] f30827;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f30828;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f30829;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f30830;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long[] f30831;

    public C9518(C19215 c19215, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        C20782.m47565(iArr.length == jArr2.length);
        C20782.m47565(jArr.length == jArr2.length);
        C20782.m47565(iArr2.length == jArr2.length);
        this.f30825 = c19215;
        this.f30831 = jArr;
        this.f30828 = iArr;
        this.f30826 = i;
        this.f30827 = jArr2;
        this.f30830 = iArr2;
        this.f30824 = j;
        this.f30829 = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24906(long j) {
        long[] jArr = this.f30827;
        for (int iM19472 = C7116.m19472(jArr, j, true); iM19472 < jArr.length; iM19472++) {
            if ((this.f30830[iM19472] & 1) != 0) {
                return iM19472;
            }
        }
        return -1;
    }
}
