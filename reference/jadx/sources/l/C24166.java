package l;

/* JADX INFO: renamed from: l.᩺۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5T5 */
/* JADX INFO: loaded from: classes.dex */
public final class C24166 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f78193;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f78192 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f78194 = 0;

    public C24166(byte[] bArr) {
        this.f78193 = bArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54138(int i) {
        int i2 = this.f78194;
        int i3 = i2 + 1;
        byte[] bArr = this.f78193;
        if (i3 > bArr.length) {
            m54129();
            throw null;
        }
        bArr[i2] = (byte) i;
        this.f78194 = i3;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m54139(int i) {
        int i2 = this.f78194;
        int i3 = i2 + 2;
        byte[] bArr = this.f78193;
        if (i3 > bArr.length) {
            m54129();
            throw null;
        }
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.f78194 = i3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m54134(int i) {
        int i2 = this.f78194;
        int i3 = i2 + 4;
        byte[] bArr = this.f78193;
        if (i3 > bArr.length) {
            m54129();
            throw null;
        }
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f78194 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54132(long j) {
        int i = this.f78194;
        int i2 = i + 8;
        byte[] bArr = this.f78193;
        if (i2 > bArr.length) {
            m54129();
            throw null;
        }
        int i3 = (int) j;
        bArr[i] = (byte) i3;
        bArr[i + 1] = (byte) (i3 >> 8);
        bArr[i + 2] = (byte) (i3 >> 16);
        bArr[i + 3] = (byte) (i3 >> 24);
        int i4 = (int) (j >> 32);
        bArr[i + 4] = (byte) i4;
        bArr[i + 5] = (byte) (i4 >> 8);
        bArr[i + 6] = (byte) (i4 >> 16);
        bArr[i + 7] = (byte) (i4 >> 24);
        this.f78194 = i2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m54135(int i) {
        long j = i;
        long j2 = (4294967295L & j) >> 7;
        int i2 = 0;
        while (true) {
            long j3 = j;
            j = j2;
            if (j != 0) {
                m54138(((int) (j3 & 127)) | 128);
                j2 = j >> 7;
                i2++;
            } else {
                m54138((int) (j3 & 127));
                return i2 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m54136(int i) {
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        boolean z = true;
        int i4 = 0;
        while (true) {
            int i5 = i2;
            int i6 = i;
            i = i5;
            if (!z) {
                return i4;
            }
            z = (i == i3 && (i & 1) == ((i6 >> 6) & 1)) ? false : true;
            m54138((i6 & 127) | (z ? 128 : 0));
            i2 = i >> 7;
            i4++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54133(byte[] bArr, int i, int i2) {
        int i3 = this.f78194;
        int i4 = i3 + i2;
        int i5 = i + i2;
        if ((i | i2 | i4) < 0 || i5 > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; " + i + "..!" + i4);
        }
        byte[] bArr2 = this.f78193;
        if (i4 > bArr2.length) {
            m54129();
            throw null;
        }
        System.arraycopy(bArr, i, bArr2, i3, i2);
        this.f78194 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54131(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (this.f78194 + i2) & (~i2);
        if (i3 > this.f78193.length) {
            m54129();
            throw null;
        }
        this.f78194 = i3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54137() {
        this.f78192++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54130() {
        int i = this.f78192 - 1;
        this.f78192 = i;
        if (i < 0) {
            this.f78192 = 0;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m54129() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }
}
