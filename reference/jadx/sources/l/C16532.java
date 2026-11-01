package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88ID */
/* JADX INFO: loaded from: classes4.dex */
public final class C16532 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f53111;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long[] f53112;

    public C16532() {
        this(32);
    }

    public C16532(int i) {
        this.f53112 = new long[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38907(long j) {
        int i = this.f53111;
        long[] jArr = this.f53112;
        if (i == jArr.length) {
            this.f53112 = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f53112;
        int i2 = this.f53111;
        this.f53111 = i2 + 1;
        jArr2[i2] = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38908(long[] jArr) {
        int length = this.f53111 + jArr.length;
        long[] jArr2 = this.f53112;
        if (length > jArr2.length) {
            this.f53112 = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f53112, this.f53111, jArr.length);
        this.f53111 = length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m38906(int i) {
        if (i >= 0 && i < this.f53111) {
            return this.f53112[i];
        }
        StringBuilder sbM40153 = C17214.m40153(i, "Invalid index ", ", size is ");
        sbM40153.append(this.f53111);
        throw new IndexOutOfBoundsException(sbM40153.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38905() {
        return this.f53111;
    }
}
