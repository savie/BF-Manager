package l;

/* JADX INFO: renamed from: l.ۡۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8H8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8717 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f29969;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29970;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f29971;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f29972;

    public C8717(byte[] bArr) {
        this.f29969 = bArr;
        this.f29972 = bArr.length;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m22564() {
        boolean z = (((this.f29969[this.f29971] & 255) >> this.f29970) & 1) == 1;
        m22563(1);
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22562(int i) {
        int i2 = this.f29971;
        int iMin = Math.min(i, 8 - this.f29970);
        int i3 = i2 + 1;
        byte[] bArr = this.f29969;
        int i4 = ((bArr[i2] & 255) >> this.f29970) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (bArr[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m22563(i);
        return i5;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22563(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f29971 + i3;
        this.f29971 = i4;
        int i5 = (i - (i3 * 8)) + this.f29970;
        this.f29970 = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f29971 = i4 + 1;
            this.f29970 = i5 - 8;
        }
        int i6 = this.f29971;
        if (i6 < 0 || (i6 >= (i2 = this.f29972) && (i6 != i2 || this.f29970 != 0))) {
            z = false;
        }
        C2023.m6510(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22561() {
        return (this.f29971 * 8) + this.f29970;
    }
}
