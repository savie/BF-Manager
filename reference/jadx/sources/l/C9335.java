package l;

/* JADX INFO: renamed from: l.ۡۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4F3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9335 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f30343;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9335 f30344;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f30345;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9335 f30346;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f30347;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f30348;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f30349;

    public C9335() {
        this.f30343 = new byte[8192];
        this.f30349 = true;
        this.f30345 = false;
    }

    public C9335(byte[] bArr, int i, int i2) {
        this.f30343 = bArr;
        this.f30347 = i;
        this.f30348 = i2;
        this.f30345 = true;
        this.f30349 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9335 m24588() {
        this.f30345 = true;
        return new C9335(this.f30343, this.f30347, this.f30348);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9335 m24585() {
        C9335 c9335 = this.f30344;
        C9335 c9336 = c9335 != this ? c9335 : null;
        C9335 c9337 = this.f30346;
        c9337.f30344 = c9335;
        this.f30344.f30346 = c9337;
        this.f30344 = null;
        this.f30346 = null;
        return c9336;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24586(C9335 c9335) {
        c9335.f30346 = this;
        c9335.f30344 = this.f30344;
        this.f30344.f30346 = c9335;
        this.f30344 = c9335;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24587(C9335 c9335, int i) {
        boolean z = c9335.f30349;
        byte[] bArr = c9335.f30343;
        if (!z) {
            throw new IllegalArgumentException();
        }
        int i2 = c9335.f30348;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c9335.f30345) {
                throw new IllegalArgumentException();
            }
            int i4 = c9335.f30347;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            c9335.f30348 -= c9335.f30347;
            c9335.f30347 = 0;
        }
        System.arraycopy(this.f30343, this.f30347, bArr, c9335.f30348, i);
        c9335.f30348 += i;
        this.f30347 += i;
    }
}
