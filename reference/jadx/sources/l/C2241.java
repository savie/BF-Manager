package l;

/* JADX INFO: renamed from: l.֫᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S1S1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2241 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f7330 = new int[256];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f7331;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f7333;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int[] f7334;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f7335;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f7336;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f7337 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7338 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f7332 = 0;

    public C2241(int i, C0573 c0573) {
        this.f7331 = c0573.mo2595(1024, true);
        this.f7333 = c0573.mo2595(65536, true);
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = ((i5 | (i5 >>> 8)) >>> 1) | 65535;
        i6 = i6 > 16777216 ? i6 >>> 1 : i6;
        int i7 = i6 + 1;
        this.f7335 = i7;
        this.f7334 = c0573.mo2595(i7, true);
        this.f7336 = i6;
    }

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i2 & 1;
                i2 >>>= 1;
                if (i4 != 0) {
                    i2 ^= -306674912;
                }
            }
            f7330[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7645(C0573 c0573) {
        c0573.mo2593(this.f7334);
        c0573.mo2593(this.f7333);
        c0573.mo2593(this.f7331);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7644(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int[] iArr = f7330;
        int i3 = iArr[i2] ^ (bArr[i + 1] & 255);
        this.f7337 = i3 & 1023;
        int i4 = i3 ^ ((bArr[i + 2] & 255) << 8);
        this.f7338 = 65535 & i4;
        this.f7332 = ((iArr[bArr[i + 3] & 255] << 5) ^ i4) & this.f7336;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7642() {
        return this.f7331[this.f7337];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m7647() {
        return this.f7333[this.f7338];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m7646() {
        return this.f7334[this.f7332];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7648(int i) {
        this.f7331[this.f7337] = i;
        this.f7333[this.f7338] = i;
        this.f7334[this.f7332] = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7643(int i) {
        AbstractC25362.m56714(1024, i, this.f7331);
        AbstractC25362.m56714(65536, i, this.f7333);
        AbstractC25362.m56714(this.f7335, i, this.f7334);
    }
}
