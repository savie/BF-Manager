package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ᩴᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J1W7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20028 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f64337;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f64338;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f64339;

    public C20028(byte[] bArr, int i, int i2) {
        this.f64337 = bArr;
        this.f64338 = i;
        this.f64339 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46075(int i, byte[] bArr) throws EOFException {
        int i2 = this.f64338;
        if (i2 + i > this.f64339) {
            throw new EOFException();
        }
        System.arraycopy(bArr, 0, this.f64337, i2, i);
        this.f64338 += i;
    }
}
