package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۗ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 698I */
/* JADX INFO: loaded from: classes3.dex */
public class C3674 extends AbstractC2599 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f12639;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f12640;

    public C3674(byte[] bArr, int i) {
        this.f12639 = bArr;
        this.f12640 = i;
    }

    @Override // l.AbstractC2599
    /* JADX INFO: renamed from: ۤ */
    public final long mo8720(int i) {
        byte[] bArr = this.f12639;
        int i2 = i + this.f12640;
        return ((long) ((bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16))) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | (((long) bArr[i2 + 7]) << 56);
    }

    @Override // l.AbstractC2599
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8725(int i) {
        byte[] bArr = this.f12639;
        int i2 = i + this.f12640;
        return (bArr[i2 + 3] << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    @Override // l.AbstractC2599
    /* JADX INFO: renamed from: ۫ */
    public final int mo8722(int i) {
        byte[] bArr = this.f12639;
        int i2 = i + this.f12640;
        return (bArr[i2 + 1] << 8) | (bArr[i2] & 255);
    }

    @Override // l.AbstractC2599
    /* JADX INFO: renamed from: ۙ */
    public final byte mo8717(int i) {
        return this.f12639[this.f12640 + i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m11964(int i, int i2, Charset charset) {
        return new String(this.f12639, this.f12640 + i, i2, charset);
    }

    @Override // l.AbstractC2599
    public final int length() {
        return this.f12639.length - this.f12640;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m11965() {
        return this.f12639;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11966(byte[] bArr) {
        this.f12639 = bArr;
    }
}
