package l;

import org.bouncycastle.crypto.digests.WhirlpoolDigest;

/* JADX INFO: renamed from: l.ۡ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W26L */
/* JADX INFO: loaded from: classes3.dex */
public final class C9405 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C9405 f30525;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f30526;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f30527;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2694 f30528;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f30529;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f30530;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f30531;

    static {
        new C9405(4201, 4096, 1);
        new C9405(1033, 1024, 1);
        new C9405(67, 64, 1);
        new C9405(19, 16, 1);
        f30525 = new C9405(WhirlpoolDigest.REDUCTION_POLYNOMIAL, 256, 0);
        new C9405(301, 256, 1);
    }

    public C9405(int i, int i2, int i3) {
        this.f30531 = i;
        this.f30529 = i2;
        this.f30530 = i3;
        this.f30526 = new int[i2];
        this.f30527 = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f30526[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f30527[this.f30526[i6]] = i6;
        }
        this.f30528 = new C2694(this, new int[]{0});
        new C2694(this, new int[]{1});
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2694 m24757() {
        return this.f30528;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2694 m24753(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f30528;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new C2694(this, iArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24752(int i) {
        return this.f30526[i];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m24754(int i) {
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        return this.f30527[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m24755(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.f30526[(this.f30529 - this.f30527[i]) - 1];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m24756(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f30527;
        return this.f30526[(iArr[i] + iArr[i2]) % (this.f30529 - 1)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24751() {
        return this.f30530;
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f30531) + ',' + this.f30529 + ')';
    }
}
