package l;

/* JADX INFO: renamed from: l.ܳ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S1S1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14545 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int[] f47618 = new int[256];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int[] f47619;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f47621;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f47622;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f47623;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f47626;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f47625 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f47620 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f47624 = 0;

    public C14545(int i, C17720 c17720) {
        this.f47621 = c17720.mo25184(1024, true);
        this.f47623 = c17720.mo25184(65536, true);
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = ((i5 | (i5 >>> 8)) >>> 1) | 65535;
        i6 = i6 > 16777216 ? i6 >>> 1 : i6;
        int i7 = i6 + 1;
        this.f47626 = i7;
        this.f47619 = c17720.mo25184(i7, true);
        this.f47622 = i6;
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
            f47618[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35005(C17720 c17720) {
        c17720.mo25182(this.f47619);
        c17720.mo25182(this.f47623);
        c17720.mo25182(this.f47621);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35004(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int[] iArr = f47618;
        int i3 = iArr[i2] ^ (bArr[i + 1] & 255);
        this.f47625 = i3 & 1023;
        int i4 = i3 ^ ((bArr[i + 2] & 255) << 8);
        this.f47620 = 65535 & i4;
        this.f47624 = ((iArr[bArr[i + 3] & 255] << 5) ^ i4) & this.f47622;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35002() {
        return this.f47621[this.f47625];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m35007() {
        return this.f47623[this.f47620];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m35006() {
        return this.f47619[this.f47624];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35008(int i) {
        this.f47621[this.f47625] = i;
        this.f47623[this.f47620] = i;
        this.f47619[this.f47624] = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35003(int i) {
        AbstractC9606.m24482(1024, i, this.f47621);
        AbstractC9606.m24482(65536, i, this.f47623);
        AbstractC9606.m24482(this.f47626, i, this.f47619);
    }
}
