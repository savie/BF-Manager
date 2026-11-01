package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12567 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f42027;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f42029;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f42030 = new int[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0571[] f42028 = new C0571[16];

    public C12567(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        this.f42027 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31286(int i, C0571 c0571) {
        C13638.requireNonNull(c0571);
        int i2 = this.f42027;
        C13638.checkFromToIndex(i, i, i2);
        if (c0571.m2681() != i2) {
            throw new IllegalArgumentException("Index and dependency lengths differ");
        }
        int i3 = this.f42029;
        if (i3 == this.f42030.length) {
            long jMax = ((long) i3) + ((long) Math.max(16, i3 >>> 1));
            int i4 = (int) jMax;
            if (jMax != i4) {
                throw new ArithmeticException();
            }
            this.f42030 = Arrays.copyOf(this.f42030, i4);
            this.f42028 = (C0571[]) Arrays.copyOf(this.f42028, i4);
        }
        int[] iArr = this.f42030;
        int i5 = this.f42029;
        iArr[i5] = i;
        this.f42028[i5] = c0571;
        this.f42029 = i5 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6216 m31285(EnumC16095 enumC16095) {
        C13638.requireNonNull(enumC16095);
        return new C6216(this, enumC16095);
    }
}
