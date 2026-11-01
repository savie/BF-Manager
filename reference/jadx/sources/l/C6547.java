package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۜۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1W7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6547 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f22085;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f22086;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f22087;

    public C6547(byte[] bArr, int i, int i2) {
        this.f22085 = bArr;
        this.f22086 = i;
        this.f22087 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17779(int i, byte[] bArr) throws EOFException {
        int i2 = this.f22086;
        if (i2 + i > this.f22087) {
            throw new EOFException();
        }
        System.arraycopy(bArr, 0, this.f22085, i2, i);
        this.f22086 += i;
    }
}
