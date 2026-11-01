package l;

/* JADX INFO: renamed from: l.ۡۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O73P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8612 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f29730;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long[] f29731;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f29732;

    public C8612(long[] jArr, long[] jArr2, int[] iArr) {
        this.f29731 = jArr;
        this.f29730 = jArr2;
        this.f29732 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22386() {
        return this.f29731.length;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m22390() {
        return this.f29731[0];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m22388(int i) {
        return this.f29730[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m22389(int i) {
        return this.f29732[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22387(long j) {
        long[] jArr = this.f29731;
        int length = jArr.length - 1;
        int i = 0;
        int i2 = 0;
        while (i <= length) {
            int i3 = (i + length) >>> 1;
            if (jArr[i3] <= j) {
                i = i3 + 1;
                i2 = i3;
            } else {
                length = i3 - 1;
            }
        }
        return i2;
    }
}
