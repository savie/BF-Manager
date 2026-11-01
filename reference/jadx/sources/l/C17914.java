package l;

import org.bouncycastle.crypto.digests.WhirlpoolDigest;

/* JADX INFO: renamed from: l.ᩳ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: W26L */
/* JADX INFO: loaded from: classes4.dex */
public final class C17914 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C17914 f56897;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f56898;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f56899;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f56900;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f56901;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f56902;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18620 f56903;

    static {
        new C17914(4201, 4096, 1);
        new C17914(1033, 1024, 1);
        new C17914(67, 64, 1);
        new C17914(19, 16, 1);
        f56897 = new C17914(WhirlpoolDigest.REDUCTION_POLYNOMIAL, 256, 0);
        new C17914(301, 256, 1);
    }

    public C17914(int i, int i2, int i3) {
        this.f56898 = i;
        this.f56900 = i2;
        this.f56902 = i3;
        this.f56899 = new int[i2];
        this.f56901 = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f56899[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f56901[this.f56899[i6]] = i6;
        }
        this.f56903 = new C18620(this, new int[]{0});
        new C18620(this, new int[]{1});
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18620 m41606() {
        return this.f56903;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18620 m41602(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f56903;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new C18620(this, iArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41601(int i) {
        return this.f56899[i];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m41603(int i) {
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        return this.f56901[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m41604(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.f56899[(this.f56900 - this.f56901[i]) - 1];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m41605(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f56901;
        return this.f56899[(iArr[i] + iArr[i2]) % (this.f56900 - 1)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41600() {
        return this.f56902;
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f56898) + ',' + this.f56900 + ')';
    }
}
