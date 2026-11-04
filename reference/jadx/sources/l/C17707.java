package l;

/* JADX INFO: renamed from: l.ܽܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O73P */
/* JADX INFO: loaded from: classes4.dex */
public final class C17707 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f58188;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long[] f58189;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f58190;

    public C17707(long[] jArr, long[] jArr2, int[] iArr) {
        this.f58189 = jArr;
        this.f58188 = jArr2;
        this.f58190 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41464() {
        return this.f58189.length;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m41468() {
        return this.f58189[0];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m41466(int i) {
        return this.f58188[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m41467(int i) {
        return this.f58190[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41465(long j) {
        long[] jArr = this.f58189;
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
