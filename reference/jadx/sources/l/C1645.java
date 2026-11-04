package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֫ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ZW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1645 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f5714;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f5716;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f5715 = new int[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12831[] f5713 = new C12831[16];

    public C1645(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        this.f5716 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5927(int i, C12831 c12831) {
        C17359.requireNonNull(c12831);
        int i2 = this.f5716;
        C17359.checkFromToIndex(i, i, i2);
        if (c12831.m31855() != i2) {
            throw new IllegalArgumentException("Index and dependency lengths differ");
        }
        int i3 = this.f5714;
        if (i3 == this.f5715.length) {
            long jMax = ((long) i3) + ((long) Math.max(16, i3 >>> 1));
            int i4 = (int) jMax;
            if (jMax != i4) {
                throw new ArithmeticException();
            }
            this.f5715 = Arrays.copyOf(this.f5715, i4);
            this.f5713 = (C12831[]) Arrays.copyOf(this.f5713, i4);
        }
        int[] iArr = this.f5715;
        int i5 = this.f5714;
        iArr[i5] = i;
        this.f5713[i5] = c12831;
        this.f5714 = i5 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24766 m5926(EnumC19544 enumC19544) {
        C17359.requireNonNull(enumC19544);
        return new C24766(this, enumC19544);
    }
}
