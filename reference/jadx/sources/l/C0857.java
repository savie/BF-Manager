package l;

/* JADX INFO: renamed from: l.֨ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0857 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f3508 = new byte[65536];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f3509;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3510;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3468(byte b) {
        int i = this.f3510;
        this.f3508[i] = b;
        int i2 = (i + 1) & 65535;
        if (!this.f3509 && i2 < i) {
            this.f3509 = true;
        }
        this.f3510 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3469(int i, int i2, byte[] bArr) {
        byte[] bArr2 = this.f3508;
        if (i > bArr2.length) {
            throw new IllegalStateException(C8479.m22141(i, "Illegal distance parameter: "));
        }
        int i3 = this.f3510;
        int i4 = (i3 - i) & 65535;
        if (!this.f3509 && i4 >= i3) {
            throw new IllegalStateException(C8479.m22141(i, "Attempt to read beyond memory: dist="));
        }
        int i5 = 0;
        while (i5 < i2) {
            byte b = bArr2[i4];
            m3468(b);
            bArr[i5] = b;
            i5++;
            int i6 = (i4 + 1) & 65535;
            if (!this.f3509 && i6 < i4) {
                this.f3509 = true;
            }
            i4 = i6;
        }
    }
}
