package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.֫ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 698I */
/* JADX INFO: loaded from: classes2.dex */
public class C1788 extends AbstractC18119 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f6937;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f6938;

    public C1788(byte[] bArr, int i) {
        this.f6937 = bArr;
        this.f6938 = i;
    }

    @Override // l.AbstractC18119
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long mo5858(int i) {
        byte[] bArr = this.f6937;
        int i2 = i + this.f6938;
        return ((long) ((bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16))) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | (((long) bArr[i2 + 7]) << 56);
    }

    @Override // l.AbstractC18119
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo5859(int i) {
        byte[] bArr = this.f6937;
        int i2 = i + this.f6938;
        return (bArr[i2 + 3] << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    @Override // l.AbstractC18119
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo5854(int i) {
        byte[] bArr = this.f6937;
        int i2 = i + this.f6938;
        return (bArr[i2 + 1] << 8) | (bArr[i2] & 255);
    }

    @Override // l.AbstractC18119
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte mo5855(int i) {
        return this.f6937[this.f6938 + i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m5856(int i, int i2, Charset charset) {
        return new String(this.f6937, this.f6938 + i, i2, charset);
    }

    @Override // l.AbstractC18119
    public final int length() {
        return this.f6937.length - this.f6938;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m5857() {
        return this.f6937;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5860(byte[] bArr) {
        this.f6937 = bArr;
    }
}
