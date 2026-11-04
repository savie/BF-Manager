package l;

/* JADX INFO: renamed from: l.۫ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13200 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f42152 = new byte[65536];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f42153;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f42154;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32709(byte b) {
        int i = this.f42154;
        this.f42152[i] = b;
        int i2 = (i + 1) & 65535;
        if (!this.f42153 && i2 < i) {
            this.f42153 = true;
        }
        this.f42154 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32710(int i, int i2, byte[] bArr) {
        byte[] bArr2 = this.f42152;
        if (i > bArr2.length) {
            throw new IllegalStateException(C13645.m33382(i, "Illegal distance parameter: "));
        }
        int i3 = this.f42154;
        int i4 = (i3 - i) & 65535;
        if (!this.f42153 && i4 >= i3) {
            throw new IllegalStateException(C13645.m33382(i, "Attempt to read beyond memory: dist="));
        }
        int i5 = 0;
        while (i5 < i2) {
            byte b = bArr2[i4];
            m32709(b);
            bArr[i5] = b;
            i5++;
            int i6 = (i4 + 1) & 65535;
            if (!this.f42153 && i6 < i4) {
                this.f42153 = true;
            }
            i4 = i6;
        }
    }
}
