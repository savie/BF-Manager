package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۫ۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8HW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12299 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f41123;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long[] f41124;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f41125;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f41126;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f41127;

    public C12299() {
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        this.f41127 = 0;
        this.f41123 = -1;
        this.f41126 = 0;
        this.f41124 = new long[iHighestOneBit];
        this.f41125 = iHighestOneBit - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30553(long j) {
        int i = this.f41126;
        long[] jArr = this.f41124;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = this.f41127;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy(this.f41124, 0, jArr2, i3, i2);
            this.f41127 = 0;
            this.f41123 = this.f41126 - 1;
            this.f41124 = jArr2;
            this.f41125 = length - 1;
        }
        int i4 = (this.f41123 + 1) & this.f41125;
        this.f41123 = i4;
        this.f41124[i4] = j;
        this.f41126++;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m30551() {
        int i = this.f41126;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f41124;
        int i2 = this.f41127;
        long j = jArr[i2];
        this.f41127 = this.f41125 & (i2 + 1);
        this.f41126 = i - 1;
        return j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m30555() {
        if (this.f41126 == 0) {
            throw new NoSuchElementException();
        }
        return this.f41124[this.f41127];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m30554() {
        return this.f41126 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30552() {
        this.f41127 = 0;
        this.f41123 = -1;
        this.f41126 = 0;
    }
}
