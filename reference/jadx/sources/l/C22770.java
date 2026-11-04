package l;

/* JADX INFO: renamed from: l.᩸ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8H8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22770 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73877;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f73878;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f73879;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f73880;

    public C22770(byte[] bArr) {
        this.f73880 = bArr;
        this.f73879 = bArr.length;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m51347() {
        boolean z = (((this.f73880[this.f73878] & 255) >> this.f73877) & 1) == 1;
        m51346(1);
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51345(int i) {
        int i2 = this.f73878;
        int iMin = Math.min(i, 8 - this.f73877);
        int i3 = i2 + 1;
        byte[] bArr = this.f73880;
        int i4 = ((bArr[i2] & 255) >> this.f73877) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (bArr[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m51346(i);
        return i5;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51346(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f73878 + i3;
        this.f73878 = i4;
        int i5 = (i - (i3 * 8)) + this.f73877;
        this.f73877 = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f73878 = i4 + 1;
            this.f73877 = i5 - 8;
        }
        int i6 = this.f73878;
        if (i6 < 0 || (i6 >= (i2 = this.f73879) && (i6 != i2 || this.f73877 != 0))) {
            z = false;
        }
        C20782.m47568(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51344() {
        return (this.f73878 * 8) + this.f73877;
    }
}
