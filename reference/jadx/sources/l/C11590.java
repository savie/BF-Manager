package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88ID */
/* JADX INFO: loaded from: classes3.dex */
public final class C11590 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f36386;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long[] f36387;

    public C11590() {
        this(32);
    }

    public C11590(int i) {
        this.f36387 = new long[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29118(long j) {
        int i = this.f36386;
        long[] jArr = this.f36387;
        if (i == jArr.length) {
            this.f36387 = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f36387;
        int i2 = this.f36386;
        this.f36386 = i2 + 1;
        jArr2[i2] = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29119(long[] jArr) {
        int length = this.f36386 + jArr.length;
        long[] jArr2 = this.f36387;
        if (length > jArr2.length) {
            this.f36387 = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f36387, this.f36386, jArr.length);
        this.f36386 = length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m29117(int i) {
        if (i >= 0 && i < this.f36386) {
            return this.f36387[i];
        }
        StringBuilder sbM12235 = C3769.m12235(i, "Invalid index ", ", size is ");
        sbM12235.append(this.f36386);
        throw new IndexOutOfBoundsException(sbM12235.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29116() {
        return this.f36386;
    }
}
