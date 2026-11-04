package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩻ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8HW */
/* JADX INFO: loaded from: classes.dex */
public final class C25017 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long[] f80956;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f80957;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f80958;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f80959;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f80960;

    public C25017() {
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        this.f80959 = 0;
        this.f80960 = -1;
        this.f80957 = 0;
        this.f80956 = new long[iHighestOneBit];
        this.f80958 = iHighestOneBit - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55846(long j) {
        int i = this.f80957;
        long[] jArr = this.f80956;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = this.f80959;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy(this.f80956, 0, jArr2, i3, i2);
            this.f80959 = 0;
            this.f80960 = this.f80957 - 1;
            this.f80956 = jArr2;
            this.f80958 = length - 1;
        }
        int i4 = (this.f80960 + 1) & this.f80958;
        this.f80960 = i4;
        this.f80956[i4] = j;
        this.f80957++;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m55849() {
        int i = this.f80957;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f80956;
        int i2 = this.f80959;
        long j = jArr[i2];
        this.f80959 = this.f80958 & (i2 + 1);
        this.f80957 = i - 1;
        return j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m55848() {
        if (this.f80957 == 0) {
            throw new NoSuchElementException();
        }
        return this.f80956[this.f80959];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m55847() {
        return this.f80957 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55845() {
        this.f80959 = 0;
        this.f80960 = -1;
        this.f80957 = 0;
    }
}
