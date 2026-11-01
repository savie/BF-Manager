package l;

/* JADX INFO: renamed from: l.۫ۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5C3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12160 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f40697;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f40698;

    public C12160(byte[] bArr) {
        this.f40697 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30246() {
        int i = this.f40698;
        byte[] bArr = this.f40697;
        int i2 = (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f40698 = i + 4;
        return i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final short m30248() {
        int i = this.f40698;
        byte[] bArr = this.f40697;
        short s = (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
        this.f40698 = i + 2;
        return s;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m30247(int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f40697, this.f40698, bArr, 0, i);
        this.f40698 += i;
        return bArr;
    }
}
